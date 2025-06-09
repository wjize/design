# Refactoring

## 💡 重构：改善既有代码的设计 - Bad Smell

### ✴️ 1. Duplicated Code（重复代码）
**总结：重复代码会增加维护成本，应尽量合并和提炼。**

- 同一个类的两个函数有相同的表达式  
  使用 `Extract Method` 提炼出重复代码，然后让两个函数都调用它。
- 两个互为兄弟的子类内含有相同表达式  
  对两个类都使用 `Extract Method`，然后运用 `Pull Up Method` 放入父类中。
- 两个互为兄弟的子类之间只是类似，并非完全相同  
  使用 `Extract Method` 将相似和差异部分分离，构成单独函数，再运用 `Form Template Method` 获得 Template Method 设计模式。
- 相同函数以不同算法实现相同事  
  选择较清晰的算法，使用 `Substitute Algorithm` 替换其他函数的算法。
- 两个毫不相干的类出现重复代码  
  使用 `Extract Class` 将重复代码提炼到独立类中，另一个类引用该类，或两个类共同引用第三个类。

---

### ✴️ 2. Long Method（过长函数）
**总结：过长函数应积极拆分，提升代码可读性。**

- 大多数情况下，使用 `Extract Method` 将函数中相关部分提炼成新函数。
- 函数内大量参数和临时变量阻碍提炼时，先用 `Replace Temp with Query` 消除临时变量，`Introduce Parameter Object` 和 `Preserve Whole Object` 简化参数列表。
- 若仍无法解决，考虑使用 `Replace Method with Method Object`。

---

### ✴️ 3. Large Class（过大的类）
**总结：类承担过多职责时，应拆分以降低复杂度。**

- 类中实例变量过多时，使用 `Extract Class` 将部分变量提炼至新类。
- 类并非所有时刻都使用所有实例变量时，可多次使用 `Extract Class` 或 `Extract Subclass`。
- 类代码过多且存在重复，提炼函数或使用 `Extract Interface` 为不同职责提取接口。
- GUI 类应将数据和行为移至独立领域对象，使用 `Duplicate Observered Data` 处理。

---

### ✴️ 4. Long Parameter List（过长参数列）
**总结：参数过多时，应通过对象封装简化。**

- 用已有对象发出请求替代参数，使用 `Replace Parameter with Method`，如调用 `this.get_age()` 替代传参。
- 将同一对象的一组数据收集起来，使用 `Preserve Whole Object` 替换多个参数。
- 若数据缺乏合理归属，使用 `Introduce Parameter Object` 创建参数对象。

---

### ✴️ 5. Divergent Change（发散式变换）
**总结：针对同一变化的多处修改应集中在单一类中。**

- 类受多种变化影响时，应拆分为多个类，使用 `Extract Class` 将相关代码提炼到新类。

---

### ✴️ 6. Shotgun Surgery（霰弹式修改）
**总结：变化引发多类多处修改时，应集中相关代码。**

- 使用 `Move Method` 和 `Move Field` 将相关代码集中到同一类。
- 若无合适类安置代码，创建新类，使用 `Inline Class` 整合相关行为。

---

### ✴️ 7. Feature Envy（依恋情结）
**总结：函数对其他类兴趣过高，应将函数移动到相关类。**

- 函数大量调用另一个对象的取值函数时，使用 `Move Method` 移动函数。
- 若仅部分代码有此问题，先用 `Extract Method` 提炼，再用 `Move Method` 移动。

---

### ✴️ 8. Data Clumps（数据泥团）
**总结：相关数据应封装成独立对象，减少参数重复。**

- 找出重复字段，使用 `Extract Class` 提炼为独立对象。
- 函数签名中重复参数，使用 `Introduce Parameter Object` 或 `Preserve Whole Object` 优化。
- 判断依据：删除数据项后其他数据是否失去意义，若是则应封装。

---

### ✴️ 9. Primitive Obsession（基本类型偏执）
**总结：避免过度使用基本类型表示复杂概念，应使用小对象封装。**

- 使用 `Replace Data Value with Object` 将基本类型数据替换为对象。
- 类型码不影响行为时，使用 `Replace Type Code with Class`。
- 类型码相关条件表达式，使用 `Replace Type Code with Subclass` 或 `Replace Type Code with State/Strategy`。

---

### ✴️ 10. Switch Statements（switch 惊悚现身）
**总结：频繁修改 switch 语句违背面向对象原则，应用多态替代。**

- 使用 `Extract Method` 将 switch 语句提炼成独立函数，再用 `Move Method` 移至多态类。
- 若仅单函数中有选择分支且不想改动，使用 `Replace Parameter with Explicit Methods`。
- 条件之一为 null 时，尝试使用 `Introduce Null Object`。

---

### ✴️ 11. Parallel Inheritance Hierarchies（平行继承体系）
**总结：两个继承体系相互依赖时，应减少耦合。**

- 让一个继承体系的实例引用另一个，使用 `Move Method` 和 `Move Field` 处理。

---

### ✴️ 12. Lazy Class（冗赘类）
**总结：无实际价值的类应被消除。**

- 重构后无用类，使用 `Collapse Hierarchy` 或 `Inline Class` 移除。
- 子类工作不足，尝试 `Collapse Hierarchy`。

---

### ✴️ 13. Speculative Generality（夸夸其谈未来性）
**总结：过度设计导致复杂性，应简化代码。**

- 使用 `Collapse Hierarchy` 和 `Inline Class` 解决。
- 未使用或过度抽象参数，使用 `Remove Parameter` 和 `Rename Method`。

---

### ✴️ 14. Temporary Field（令人迷惑的暂时字段）
**总结：仅为特定情况设立的字段应封装处理。**

- 使用 `Extract Class` 将相关代码和字段封装。
- 使用 `Introduce Null Object` 避免条件代码。
- 复杂算法中多个变量可能导致此问题。

---

### ✴️ 15. Message Chains（过度耦合的消息链）
**总结：长消息链增加耦合，应隐藏委托。**

- 使用 `Hide Delegate` 重构消息链上的对象。

---

### ✴️ 16. Middle Man（中间人）
**总结：过度委托应减少中间人。**

- 使用 `Remove Middle Man` 直接与目标对象交互。
- 少数委托函数可用 `Inline Method`。
- 若中间人有额外行为，使用 `Replace Delegation with Inheritance`。

---

### ✴️ 17. Inappropriate Intimacy（狎昵关系）
**总结：过于亲密的类应拆分或调整关系。**

- 使用 `Move Method` 和 `Move Field` 划清界限，或用 `Change Bidirectional Association to Unidirectional`。
- 无法拆散时，使用 `Extract Class` 提炼共同点，或 `Hide Delegate` 实现通信。

---

### ✴️ 18. Alternative Classes with Different Interfaces（异曲同工的类）
**总结：功能相同但接口不同的类应统一。**

- 使用 `Rename Method` 统一命名。
- 反复用 `Move Method` 将行为移入类中。
- 必要时用 `Extract Superclass`。

---

### ✴️ 19. Incomplete Library Class（不完美的库类）
**总结：无法修改的库类应通过扩展适配。**

- 修改少量函数用 `Introduce Foreign Method`。
- 添加大量行为用 `Introduce Local Extension`。

---

### ✴️ 20. Data Class（纯稚的数据类）
**总结：仅含字段的类应封装和增加行为。**

- 使用 `Encapsulate Field` 封装字段。
- 检查容器类字段，使用 `Encapsulate Collection` 和 `Remove Setting Method`。
- 将取值/设值函数搬运到数据类，使用 `Move Method`，无法整体搬运时用 `Extract Method`，再用 `Hide Method` 隐藏。
- 注意避免违反单一职责原则。

---

### ✴️ 21. Refused Bequest（被拒绝的遗赠）
**总结：子类拒绝继承父类方法时，应调整继承结构。**

- 传统做法用 `Push Down Method` 和 `Push Down Field` 推送方法给兄弟类，但不总建议。
- 可用组合关系或接口替换。

---

### ✴️ 22. Comments（过多的注释）
**总结：过多注释可能是坏味道，重构后应更新注释。**

- 重构代码后，删除多余注释，保持代码和注释一致。
