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
    调用和被调用的关系; 库函数是对系统函数的进一步封装
  虚拟地址空间:
    进程的虚拟地址空间分为用户区和内核区,其中内核区是受保护的,用户是不能对其进行操作的
    内核区中很重要的一个就是进程管理,进程管理中有一个区域是PCB(本质是一个结构体)
    PCB中有文件描述符,文件描述符中保存着文件打开方式,文件类型,文件位置等。涉及文件的IO操作。
```


