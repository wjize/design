# Refactoring

## Improving the Design of Existing Code

### Bad Smell

```java
1. Duplicated Code (重复代码)
    "设法将它们合而为一，程序会变得更好"
    - 同一个类的两个函数有相同的表达式 
        > 使用 <Extract Method> 提炼出重复代码，然后让两个函数都调用它。
    - 两个互为兄弟的子类内含有相同表达式 
        > 对两个类都使用 <Extract Method>，然后对提炼出来的代码使用 <Pull Up Method> 放入父类中。
    - 两个互为兄弟的子类之间只是类似，并非完全相同
        > 使用 <Extract Method> 将相似部分和差异部分割开，构成单独函数，然后运用<Form Template Method>获一个Template Method设计模式
    - 如果相同函数以不同算法做相同事
        > 选择其中较清晰的一个，并使用 <Substitute Algorithm> 将其他函数的算法替换掉
    - 如果两个毫不相干的类出现(Duplicated Code)
        > 考虑对其中一个使用 <Extract Class> 将重复代码提炼到一个独立类中，然后在另一个类内使用这个新类，也可能是另外两个类应该引用这个第三个类。

2. Long Method (过长函数)
    "应该更积极地分解函数"
    - 百分之九十九的场合里，要把函数变小，只需要使用 <Extract Method> 将函数适合集中在一起的部分，提炼出一个新的函数
    - 如果函数内有大量的参数和临时变量，会对函数提炼形成阻碍。仍用 <Extract Method> 会导致提炼的新函数机会没有可读性
        > 尝试运用 <Replace Temp with Query> 消除临时元素，<Introduce Parameter Object> 和 <Preserve Whole Object> 将过长的参数列变得简洁一些。如果仍然不能解决则需要使用 <Replace Method with Method Object>方法

3. Large Class (过大的类)
    "如果单个类做太多事情，往往就会出现太多实例变量"
    - 当类中出现太多实例变量时，运用 <Extract Class> 将几个变量一起提炼至新类中
    - 有时类并非在所有时刻都使用所有实例变量。
        > 可以多次使用 <Extract Class> 或 <Extract Subclass>
    - 和“太多实例变量”一样，类内如果有太多代码，也是代码重复。
        > 最简单的办法将其消化与内部。将类中行数过多的函数提炼成多个小函数
        > 也适合使用 <Extract Interface> 为每一种方法提炼出一个接口
    - 如果(Large Class)是一个GUI类
        > 需要把数据和行为移到一个独立的领域对象去。使用 <Duplicate Observerd Data> 去做 

4. Long Parameter List (过长参数列)
    "函数需要的东西多半可以在宿主类种找到，让函数能从中获得自己需要的东西就行了"
    - 向已有的对象发出一条请求就可以取代一个参数
        > 使用 <Replace Parameter with Method> ,比如: 通过调用this.get_age(),就可获得age属性，从而代替传参。
    - “已有的对象”可能是函数所属类内的一个字段或是一个参数
        > 运用 <Preserve Whole Object> 将来自同一个对象的一堆数据收集起来，并以该对象替换他们。
    - 如果某些数据缺乏合理的对象归属
        > 可以使用 <Introduce Parameter Object> 为他们制造出一个“参数对象”

5. Divergent Change (发散式变换)
    "针对某一外界变化所有相应的修改，都只应该发生在单一类中"
    -  这种情况是指“一个类受多种变化的影响”，比方说新加入一个新数据库，必须要对三个函数修改；新加入一个金融工具，需要对四个函数
        > 此时应该将这个对象分成两个类更好，运用 <Extract Class> 提炼到一个到另一个类中

6. Shotgun Surgery (霰弹式修改)
    "针对于某个变化，不应该在许多不同类中做出许多小修改"
    - 这种情况是指“一种变化引发多个类相应修改”
        > 应该使用 <Move Method> 和 <Move Field> 把所有需要修改的代码放在同一个类
    - 如果眼下没有合适的类可以安置这些代码，就创造一个
        > 运用 <Inline Class> 把一系列相关行为放进同一个类

7. Feature Envy (依恋情结)
    "函数对某个类的兴趣高于对自己所处类的兴趣"
    - 某个函数为了计算某个值，从另一个对象那儿几乎调用了半打的取值函数
        > 这时要把这个函数使用 <Move Method> 把它移动到它该去的地方
    - 有时候函数中只有一部分有这种问题
        > 这时应该使用 <Extract Method> 把这一部分提炼到独立函数中，然后再使用 <Move Method> 移动函数

8. Data Clumps (数据泥团)
    "两个类中相同的字段、函数签名中相同的传参，应该拥有属于它们自己的对象"
    - 找出这些数据以字段形式出现的地方
        > 运用 <Extract Class> 将它们提炼到一个独立对象中
    - 函数签名中相同的参数
        > 运用 <Introduce Parameter Object> 或 <Preserve Whole Object> 优化函数签名
    - 一个评判的办法: 删掉数据中的一项，是否对其他数据有影响？如果他们不再有意义，那么你就应该为他产生一个新对象

9. Primitive Obsession (基本类型偏执)
    "过度依赖基本数据类型来表示概念或实体，要习惯在小任务上运用小对象"
    - 比如说，使用int类型描述money；使用char类型描述product；这样做通常会导致代码难以维护和扩展，增加了出错的风险。这就是为什么java中基本类型表示数值，但字符串和日期使用类表示
        > 运用 <Replace Data Value with Object> 将原本单独存在的数据值替换为对象
        > 如果替换的数据值是类型码，而且它不影响行为，使用 <Replace Type Code with Class>将它换掉
        > 如果有与类型码相关的条件表达式，运用 <Replace Type Code with Subclass> 或 <Replace Type Code with State/Strategy> 加以处理

10. Switch Statements (switch 惊悚现身)
    "如果为switch添加一个新的case子句，就必须找到所有的switch语句并修改，这违背了面向对象技术"
    - 大多数的时候，一看到switch子句，考虑用多态的方式替换它
        > 使用 <Extract Method> 将switch语句提炼到独立的函数中，再用 <Move Method> 搬移至多态性的那个类中
    - 如果只是再单一函数中有些选择事例，且不想改动它们。多态就有些大材小用了
        > 这种情况下使用 <Replace Parameter with Explicit Methods> 是不错的选择
    - 如果条件之一是null,可以试试 <Introduce Null Object>

11. Parallel Inheritance Hierarchies (平行继承体系)
    " Shotgun Surgery 的一种特殊情况"
    - 每当为某个类增加一个子类，必须也需要在另一个类相应增加子类。大概就是出现了这个情况
        > 消除的一般策略: 让一个继承体系的实例引用另一个继承体系的实例，在运用 <Move Method> 和 <Move Field>。

12. Lazy Class (冗赘类)
    "如果一个类所得不值其身价，就让他消失"
    - 这种情况多发生在重构时，可能重构前它有意义，重构后它不再做那么多工作，或是其他原因导致类根本没有使用。那就让这个类消失吧。
        > 如果某些子类没有做足够的工作，试试 <Collapse Hierarchy>。 对于没用的组件，试试 <Inline Class>

13. Speculative Generality (夸夸其谈未来性)
    "与Lazy Class相似，代码中包含了一些被设计用于未来可能的需求或扩展性，但这些需求实际上并不存在"
    - 这种坏味道通常是由于过度设计导致的，代码为了满足假设的未来需求而变得过于复杂和难以维护。
        > 运用 <Collapse Hierarchy> 和 <Inline Class> 解决他们
    - 如果函数有些参数未被使用或名称有多余的抽象意味
        > 使用 <Remove Parameter> 和 <Rename Method>让他现实一些

14. Temporary Field (令人迷惑的暂时字段)
    "类中某个实例变量仅为某种特定情况而设"
    - 在变量未被使用的情况下猜测当初设置这个值的目的，会非常烦恼
        > 使用 <Extract Class> 把它和所有这个变量相关的代码都放进这个新类，还可以使用 <Introduce Null Object> 在“变量不合法”的情况下创建一个Null对象，从而避免条件式代码
    - 如果类中有个复杂的算法，需要好几个变量，往往可能导致 (Temporary Field) 出现。

15. Message Chains (过度耦合的消息链)
    "用户向一个对象请求另一个对象，后者再请求另一个对象，然后再请求..."
    - 这种导航结构紧密耦合，一旦对象的关系发生任何变化，所有的地方都要修改
        > 这时应该使用 <Hide Delegate> 理论上可以重构消息链上的任何一个对象。

16. Middle Man (中间人)
    "某个接口有一半的函数都委托给其他类"
    - 过度使用委托时，应该使用 <Remove Middle Man> 直接和真正的对象打交道
    - 如果这种类型的函数只有少数几个
        > 可以运用<Inline Method> 把他放进调用端。
    - 如果这些(Middle Man)还有其他行为
        > 可以运用<Replace Delegation with Inheritance>把它变成实责对象的子类
    
17. Inappropriate Intimacy (狎昵关系)
    "如果两个类过于亲密，需要花费大量时间探究彼此的private成分，对于类应该守清规"
    - 过分狎昵的类必须拆散
        > 可以使用 <Move Method>和<Move Field> 帮它们划清界限。看看是否可以使用<Change Bidirectional Association to Unidirectional>让其中一个类对另一个类斩断关系
    - 如果两个类实在无法拆散
        > 可以运用<Extract Class> 把两者共同点提炼到新类中，然后再使用这个新类。或者使用<Hide Delegate>让两个类直接通信
    
18. Alternative Classes with Different Interfaces (异曲同工的类)
    "两个函数做同一件事，却又不同的签名"
    - 出现这种情况运用<Rename Method>重新命名，但这不够，还需要反复使用<Move Method>将某些行为移入类中
    - 如果必须重复地移入代码才能完成这些，或许可以运用<Extract Superclass>方法
    
19. Incopplete Library Class (不完美的库类)
    "面向对象终极目的是复用 -- 但有些库或者说被复用的代码不一定是完美的，但我们却不能修改它"
    - 这种情况有两个专门的方法，如果只想修改库类的一两个函数，可以运用 <Introduce Foreign Method>
    - 如果想要添加一大堆额外行为，就得运用 <Introduce Local Extension> 
    
20. Data Class (纯稚的数据类)
    "所谓Data Class是指，它们拥有一些字段用于读写，除此之外没有别的用处"
    - 如果发现它们，立刻用<Encapsulate Field> 将它们封装起来
    - 如果这些类内含容器类的字段，应该检查它们是不是得到了恰当的封装，如果没有需要使用 <Encapsulate Collection> 把它们封装，对于那些不该被其他类修改的字段运用 <Remove Setting Method>
    - 然后找出这些取值/设值函数被其他类调用的地点，尝试使用<Move Method>搬运到数据类中
        > 如果无法搬移整个函数，需要使用 <Extract Method>产生一个可被搬运的函数，然后就可以用<Hide Method>把取值/设值隐藏
    - 有时候其实就是想要一个这样的数据类。但是这样的类没有明确的职责，违反了单一职责原则，难以理解和扩展。
    
21. Refused Bequest (被拒绝的遗赠)
    "子类应该继承父类的函数和数据，不应该出现子类不需要继承的方法"
    - 如果子类拒绝父类的大部分行为，可能表明继承关系是错误的
        > 按传统做法，需要建一个兄弟类，再运用<Push Down Method>和<Push Down Field> 把用不到的函数推给兄弟。但不建议每次都这么做
    - 可使用组合关系，将子类不需要的方法封装成新类。或是使用接口替换
    
22. Comments (过多的注释)
    "过多的注释很可能会有坏味道的产生"
    - 当按之前提到的做法重构代码后，会发现有好多注释都多余了。这时就要修改注释，使代码完整

```

### Refactoring Methods

```java
```
