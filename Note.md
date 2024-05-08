# NOTE

---------------

## linux系统编程

### 动/静态库

```c++
static lib 制作:
    1. g++/gcc -c func1.cpp func2.cpp ...
    2. ar rcs libfunc1.a func1.o func2.o ...
static lib 使用:
    3. g++/gcc -o hello main.cpp -I./include -L./lib -lfunc1

dynamic lib 制作:
    1. g++/gcc -fpic -c func1.cpp func2.cpp ..
    2. g++/gcc -shared func1.o func2.o libfunc2.so
dynamic lib 使用:
    3. g++/gcc -o hello main.cpp -I./include -L./lib -lfunc2
```

---------------

### makefile

```c++
makefile:
  makefile文件是用来管理项目工程文件的,通过执行make命令,make就会解析并执行makefil文件。
  makefile命名: makefile或Makefile

makefile rule:
  目标: 依赖
  (tab)命令

  > 目标: 要生成的目标文件
  > 依赖: 目标文件由哪些文件生产
  > 命令: 通过执行该命令由依赖文件生成目标

makefile中提供了一下变量提供,可直接使用:
  CC = g++/gcc #arm-linux-gcc
  CPPFLAGS: C预处理的选项 -I
  CFLAGS:   C编译器的选项 -Wall -g -c
  LDFLAGS:  链接器选项 -L
  自动变量:
  > $@: 表示命令规则中的目标
  > $<: 表示命令规则中的第一个条件
  > $^: 表示命令规则中的所有条件,组成一个列表,以空格隔开,如果这个列表中有重复的项则消除重复项
  函数:
  > wildcard -  查找指定目录下的指定类型的文件
  > src=$(wildcard *.cpp)  //找到当前目录下所有后缀为.cpp的文件,赋值给src
  > patsubst - 匹配替换
  > obj=$(patsubst %.cpp,%.o,$(src))  //把src变量里所有后缀为.cpp的文件替换成.o

make clean:
  .PHONY: clean  //声明目标为伪目标,makefile将不再检查目标是否存在或是否需要更新。换言之,认为'clean'不存在
  使用 -f  可以指定makefile文件, 如: make -f mainfile
```

---------------

### gdb调试工具

```c++
gdb调试工具:
  > 启动程序: gdb ./a.out
  > 可以让调试的程序在你所指定的断点处停住: b main.cpp:10
  > 当程序停住时，可以检查此时程序中的情况: bt / print vars ...
  > 动态的改变程序的环境: set var x = 10

生成调试信息: 
  gcc -g main.cpp -o a.out  //使用-g参数可以做到
启动gdb:
  gdb ./a.out 
设置运行参数: 
  > set args arg1 arg2 ... 
  > show args
  启动程序:
  > run //到断点处停止
  > start //单步执行
  > cont //继续执行
  显示源代码:
  > list //显示当前行附近的代码
  > list linenum //显示指定行附近的代码
  > list function //显示指定函数的代码
```

---------------

### 文件I/O操作

```c++
I/O操作:
  库函数与系统函数的关系:
    > 调用和被调用的关系; 库函数是对系统函数的进一步封装
  虚拟地址空间:
    > 进程的虚拟地址空间分为用户区和内核区,其中内核区是受保护的,用户是不能对其进行操作的
    > 内核区中很重要的一个就是进程管理,进程管理中有一个区域是PCB(本质是一个结构体)
    > PCB中有文件描述符,文件描述符中保存着文件打开方式,文件类型,文件位置等。涉及文件的IO操作。
```

---------------

### 进程相关概念

```c++
程序和进程:
  > 程序: 指编译好的二进制文件。
  > 进程: 程序的运行实例,进程是程序的一次执行开始到结束的完整过程。
并发和并行:
  > 并发: 一个cpu上运行的多个进程,每个进程都占用一个CPU时间片。
  > 并行: 两个或两个以上的程序在同一时刻运行。
PCB-进程控制块:
  > 每个进程在内核中都有一个进程控制块(PCB),来维护进程的状态。本质是一个结构体。
fork函数:
  > 作用是创建子进程,原型: pid_t fork(void);
  > 父子进程不共享全局变量,"写时复制 - 读时共享"
exec函数族:
  int execl(const char *path, const char arg0, ... / (char *) NULL */);  //从指定路径加载并执行一个新程序，参数以字符串形式传递，以 NULL 结束
    /* execl("/bin/ls", "ls", "-l", NULL); */
  int execv(const char *path, char *const argv[]);  //从指定路径加载并执行一个新程序，参数以字符串数组形式传递。
    /* char *args[] = {"ls", "-l", NULL};  */
    /* execv("/bin/ls", args);             */
  int execle(const char *path, const char *arg0, ..., char *const envp[])  //与 execl 类似，但可以指定新程序的环境变量。
    /* char *env[] = {"PATH=/usr/bin", NULL};    */
    /* execle("/bin/ls", "ls", "-l", NULL, env); */
  int execve(const char *path, char *const argv[], char *const envp[]);  //与 execv 类似，但可以指定新程序的环境变量。
    /* char *args[] = {"ls", "-l", NULL};     */
    /* char *env[] = {"PATH=/usr/bin", NULL}; */
    /* execve("/bin/ls", args, env);          */
  int execlp(const char *file, const char *arg0, ... /* (char *) NULL */);  //类似于 execl，但是会在系统的 PATH 环境变量中查找可执行文件。
    /* execlp("ls", "ls", "-l", NULL); */
  int execvp(const char *file, char *const argv[]);  //类似于 execv，但是会在系统的 PATH 环境变量中查找可执行文件。
    /* char *args[] = {"ls", "-l", NULL}; */
    /* execvp("ls", args);                */
孤儿进程（Orphan Process）:
  > 孤儿进程是指其父进程已经终止或者不再关心它的状态的进程。通常情况下，当一个进程终止时，系统会将其子进程的父进程设置为 init 进程（PID 为 1）。
  > 孤儿进程不会成为系统资源的浪费，因为它们的状态信息会被 init 进程收集和处理。
  > 一个孤儿进程的 PPID（父进程 ID）会被设置为 1。
僵尸进程（Zombie Process）:
  > 僵尸进程是指一个已经终止执行的进程，但是其父进程还没有通过 wait() 系统调用来获取其终止状态。
  > 僵尸进程会占用系统资源（如进程 ID 和一些系统表项），如果大量积累，可能导致系统资源耗尽。
  > 通常情况下，父进程应该定期调用 wait() 系统调用来回收已终止子进程的资源，以避免僵尸进程的产生。
进程回收函数:
  wait(int *status);  //wait 函数会阻塞父进程，直到任一子进程退出为止。
    > 如果子进程已经退出，wait 会立即返回，返回值是子进程的 PID。
    > 如果多个子进程同时退出，wait 只会返回一个子进程的 PID，并且只能获得一个子进程的退出状态。
    > 可以使用 WIFEXITED、WIFSIGNALED、WIFSTOPPED 宏来检查子进程的退出状态。
  waitpid(pid_t pid, int *status, int options);  //waitpid 函数可以指定等待的子进程 PID，可以不阻塞父进程，根据传入的参数决定是否阻塞。
    > 可以使用 WNOHANG 选项来使 waitpid 在没有子进程退出时立即返回，而不阻塞父进程。
    > 可以使用 WUNTRACED 选项来获取已经停止的子进程的状态。
```

---------------

