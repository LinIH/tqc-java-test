# TQC Java 17 物件導向程式設計 重點知識整理

這份文件旨在整理 TQC Java 17 物件導向認證考試的核心知識點，幫助您聚焦複習方向。

---

## 1. Java 基礎 (Foundation)

在深入物件導向之前，必須先穩固以下基礎：

### 1.1. 基礎語法與資料型別
- **基本資料型別 (Primitive Types)**: `int`, `double`, `char`, `boolean`, `long`, `short`, `float`, `byte`。
- **參考資料型別 (Reference Types)**: 物件、陣列、`String`。
- **變數宣告與 `var`**: 了解如何宣告變數，並知道 Java 10 引入的 `var` 只能用於區域變數的型別推斷。
- **字串 `String`**:
    - `String` 的不變性 (Immutability)。
    - 常用的方法，如 `equals()`, `substring()`, `length()`, `toUpperCase()` 等。

### 1.2. 運算子 (Operators)
- **算術運算子**: `+`, `-`, `*`, `/`, `%`。
- **關係運算子**: `==`, `!=`, `>`, `<`, `>=`, `<=`。
- **邏輯運算子**: `&&` (AND), `||` (OR), `!` (NOT)。
- **遞增/遞減運算子**: `++`, `--`。

### 1.3. 流程控制 (Control Flow)
- **條件判斷**: `if`, `if-else`, `if-else-if`。
- **多重選擇**:
    - `switch` 語句 (傳統用法)。
    - **Switch 表示式 (Java 14+)**: 使用 `->` 和 `yield` 返回值，語法更簡潔。
- **迴圈**: `for`, `while`, `do-while`，以及 `for-each` 迴圈。
- **中斷流程**: `break`, `continue`。

---

## 2. 物件導向核心 (Core OOP Concepts)

這是考試的絕對核心，必須熟練。

### 2.1. 類別與物件 (Classes and Objects)
- **類別定義**: 如何使用 `class` 關鍵字定義一個類別，包含屬性 (Fields) 和方法 (Methods)。
- **物件的建立與使用**: 使用 `new` 關鍵字建立物件實體 (Instance)。
- **建構子 (Constructor)**:
    - 預設建構子與自訂建構子。
    - **建構子多載 (Overloading)**: 擁有多個不同參數列表的建構子。
- **`this` 關鍵字**: 代表「當前物件」的參考。

### 2.2. 封裝 (Encapsulation)
- **存取修飾詞 (Access Modifiers)**: `public`, `protected`, `private` 以及預設 (package-private) 的可見範圍。
- **Getter/Setter 方法**: 提供對私有屬性的可控存取。

### 2.3. 繼承 (Inheritance)
- **`extends` 關鍵字**: 類別之間的繼承關係。
- **`super` 關鍵字**: 用於呼叫父類別的建構子或方法。
- **方法覆寫 (Method Overriding)**:
    - 子類別重新定義父類別的方法。
    - `@Override` 標註的重要性。
- **`Object` 類別**: 所有 Java 類別的根父類別，及其 `equals()`, `hashCode()`, `toString()` 等重要方法。

### 2.4. 多型 (Polymorphism)
- **向上轉型 (Upcasting)**: `父類別參考 = new 子類別物件()`。
- **`instanceof` 運算子**: 檢查物件的真實型別。
- **`instanceof` 的模式匹配 (Java 16+)**: 在 `if` 條件中直接宣告變數並轉型，簡化語法。
    ```java
    // 舊寫法
    if (obj instanceof String) {
        String s = (String) obj;
        // ... use s
    }
    // 新寫法
    if (obj instanceof String s) {
        // ... use s directly
    }
    ```

---

## 3. 進階物件導向 (Advanced OOP)

### 3.1. 抽象類別與介面 (Abstract Classes and Interfaces)
- **抽象類別 (`abstract class`)**:
    - 不能被實體化。
    - 可以包含抽象方法 (`abstract` method) 和具體方法。
- **介面 (`interface`)**:
    - 預設為 `public abstract` 方法（Java 8 前）。
    - Java 8 後可包含 `default` 方法和 `static` 方法。
- **兩者比較**: 何時使用抽象類別，何時使用介面。

### 3.2. `final` 與 `static` 關鍵字
- **`final`**:
    - **final 變數**: 常數，值不能被改變。
    - **final 方法**: 不能被子類別覆寫。
    - **final 類別**: 不能被繼承。
- **`static`**:
    - **static 變數**: 類別變數，所有物件共享。
    - **static 方法**: 類別方法，不需建立物件即可呼叫。

---

## 4. Java 17 特性與現代語法

這些是新版 Java 的重要特性，在 TQC 考試中可能出現。

### 4.1. Record (Java 16+)
- **用途**: 快速建立不變的 (immutable) 資料載體類別。
- **特性**: 編譯器會自動產生建構子、`equals()`、`hashCode()`、`toString()` 以及 getter 方法。
- **語法**: `public record Point(int x, int y) {}`

### 4.2. Sealed Classes (Java 17)
- **用途**: 限制一個類別或介面能被哪些其他的類別或介面繼承或實作。
- **關鍵字**: `sealed`, `permits`, `non-sealed`。
- **語法**: `public sealed class Shape permits Circle, Square {}`

---

## 5. 核心 API 與函式庫

### 5.1. 例外處理 (Exception Handling)
- **`try-catch-finally`**: 捕捉並處理例外。`finally` 區塊無論如何都會執行。
- **`throws`**: 在方法簽章上宣告可能拋出的例外。
- **Checked Exception vs. Unchecked Exception (Runtime Exception)**: 兩者的區別與處理方式。

### 5.2. 泛型 (Generics)
- **用途**: 提供編譯時期的型別安全。
- **語法**: 在集合或自訂類別中使用 `<T>` 或 `<E>`。

### 5.3. 集合框架 (Collections Framework)
- **核心介面**: `List`, `Set`, `Map` 的特性與差異。
    - `List`: 有序、可重複 (e.g., `ArrayList`)。
    - `Set`: 無序（通常）、不可重複 (e.g., `HashSet`)。
    - `Map`: 鍵值對儲存，鍵不可重複 (e.g., `HashMap`)。

### 5.4. Stream API
- **概念**: 對集合進行宣告式的、鏈式的操作。
- **中間操作 (Intermediate Operations)**:
    - `filter()`: 篩選。
    - `map()`: 轉換。
    - `sorted()`: 排序。
    - `flatMap()`: 扁平化。
- **終端操作 (Terminal Operations)**:
    - `collect()`: 收集結果 (e.g., `Collectors.toList()`, `Collectors.groupingBy()`)。
    - `forEach()`: 迭代。
    - `findFirst()`, `anyMatch()`: 短路操作。
    - `reduce()`: 聚合。
