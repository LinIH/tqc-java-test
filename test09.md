
# TQC Java 17 物件導向程式設計練習題

**考試時間：** 100 分鐘

---

### 第一部分：選擇題 (共 20 題，每題 2 分，共 40 分)

1.  下列何者是 Java 中所有類別的父類別？
    a) `Main`
    b) `Object`
    c) `Class`
    d) `System`

2.  關於抽象類別 (abstract class) 和介面 (interface) 的敘述，下列何者**錯誤**？
    a) 抽象類別可以有建構子，介面不行。
    b) 一個類別可以實作多個介面。
    c) 一個類別可以繼承多個抽象類別。
    d) 介面中的方法預設為 `public abstract`。

3.  在 Java 中，`final` 關鍵字可以用於何處？
    a) 類別、方法、變數
    b) 只有方法和變數
    c) 只有類別
    d) 只有變數

4.  下列哪一個關鍵字用於處理例外情況？
    a) `try`, `catch`, `finally`
    b) `throw`, `throws`
    c) `new`
    d) a 和 b 皆是

5.  關於 `static` 關鍵字的敘述，何者正確？
    a) `static` 方法可以直接存取非 `static` 的成員變數。
    b) 每個物件實體都有自己的一份 `static` 變數副本。
    c) `static` 變數又稱為類別變數。
    d) `static` 區塊只在建立物件時執行。

6.  下列何者是正確的 `main` 方法簽章？
    a) `public static void main(String args)`
    b) `public static void main(String[] args)`
    c) `public void main(String[] args)`
    d) `static public void main(String args[])`

7.  關於方法多載 (Overloading) 和方法覆寫 (Overriding) 的比較，何者**錯誤**？
    a) 多載是指在同一個類別中，方法名稱相同但參數列表不同。
    b) 覆寫是指子類別重新定義父類別的方法。
    c) 覆寫的方法簽章必須與父類別完全相同。
    d) `private` 方法可以被覆寫。

8.  下列哪個集合 (Collection) 不允許儲存重複的元素？
    a) `List`
    b) `Set`
    c) `Map`
    d) `ArrayList`

9.  `"hello".equals("Hello")` 的回傳值是什麼？
    a) `true`
    b) `false`
    c) 編譯錯誤
    d) 執行階段錯誤

10. 若要建立一個 `StringBuilder` 物件，下列何者語法正確？
    a) `StringBuilder sb = "hello";`
    b) `StringBuilder sb = new StringBuilder("hello");`
    c) `StringBuilder sb = new StringBuilder(); sb = "hello";`
    d) `StringBuilder sb; sb.append("hello");`

11. 關於 Java 17 的 `record` 特性，下列敘述何者正確？
    a) `record` 是一個特殊的介面。
    b) `record` 的欄位預設是 `final` 的。
    c) `record` 不能有自定義的方法。
    d) `record` 主要是為了取代抽象類別。

12. `Math.round(2.5)` 的回傳值是什麼？
    a) `2`
    b) `2.0`
    c) `3`
    d) `3.0`

13. 在子類別的建構子中，若要呼叫父類別的建構子，應該使用哪個關鍵字？
    a) `this()`
    b) `super()`
    c) `parent()`
    d) `base()`

14. `instanceof` 運算子的作用是什麼？
    a) 比較兩個物件的記憶體位址。
    b) 檢查一個物件是否為某個類別或其子類別的實體。
    c) 建立一個類別的實體。
    d) 取得物件的類別資訊。

15. `String` 和 `StringBuilder` 的主要區別是什麼？
    a) `String` 是不可變的 (immutable)，`StringBuilder` 是可變的 (mutable)。
    b) `StringBuilder` 執行效率比 `String` 差。
    c) `String` 只能儲存 ASCII 字元。
    d) `StringBuilder` 沒有 `length()` 方法。

16. 下列何者不是 Java 的基本資料型態 (primitive data type)？
    a) `int`
    b) `double`
    c) `String`
    d) `boolean`

17. 執行以下程式碼，會輸出什麼？
    ```java
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.set(1, "C");
    System.out.println(list);
    ```
    a) `[A, B, C]`
    b) `[A, C]`
    c) `[C]`
    d) 編譯錯誤

18. 關於封裝 (Encapsulation) 的概念，下列敘述何者最佳？
    a) 將所有程式碼寫在同一個檔案中。
    b) 將資料 (屬性) 和操作資料的方法 (行為) 綁定在一起，並對外部隱藏實現細節。
    c) 使用 `public` 修飾詞開放所有屬性。
    d) 將程式碼組織成多個套件 (package)。

19. 下列哪段程式碼可以成功捕捉 `ArrayIndexOutOfBoundsException`？
    ```java
    try {
        int[] arr = new int[5];
        System.out.println(arr[5]);
    }
    // MISSING CODE
    ```
    a) `catch (Exception e) {}`
    b) `catch (ArrayIndexOutOfBoundsException e) {}`
    c) `catch (IndexOutOfBoundsException e) {}`
    d) 以上皆是

20. 在 Java 17 中，`switch` 運算式 (expression) 與傳統 `switch` 陳述式 (statement) 的主要不同之處在於？
    a) `switch` 運算式可以回傳一個值。
    b) `switch` 運算式不再需要 `break`。
    c) `switch` 運算式可以使用 `->` 語法。
    d) 以上皆是。

---

### 第二部分：實作題 (共 3 題，共 60 分)

#### **第一題：員工薪資計算 (20 分)**

**說明：**
請設計一個 `Employee` 抽象類別和其子類別 `FullTimeEmployee` 及 `PartTimeEmployee`。

1.  **`Employee` (抽象類別)**
    *   屬性：`name` (String), `id` (int) - 設為 `protected`。
    *   建構子：初始化 `name` 和 `id`。
    *   抽象方法：`calculateSalary()` - 回傳 `double` 型態的薪資。
    *   一般方法：`display()` - 印出員工姓名和 ID。

2.  **`FullTimeEmployee` (繼承 `Employee`)**
    *   屬性：`monthlySalary` (double) - 月薪。
    *   建構子：初始化姓名、ID 和月薪。
    *   實作 `calculateSalary()`：直接回傳月薪。

3.  **`PartTimeEmployee` (繼承 `Employee`)**
    *   屬性：`hourlyRate` (double) - 時薪, `hoursWorked` (int) - 工作時數。
    *   建構子：初始化姓名、ID、時薪和工作時數。
    *   實作 `calculateSalary()`：回傳 `hourlyRate * hoursWorked`。

4.  **`Main.java`**
    *   建立一個 `FullTimeEmployee` 物件和一個 `PartTimeEmployee` 物件。
    *   將這兩個物件放入一個 `Employee` 陣列中。
    *   使用迴圈遍歷陣列，呼叫每個物件的 `display()` 方法，並印出其計算後的薪資。

**預期輸出 (數值僅為範例)：**
```
Name: John Doe, ID: 101
Salary: 50000.0
Name: Jane Smith, ID: 102
Salary: 24000.0
```

---

#### **第二題：圖形面積計算 (20 分)**

**說明：**
請使用介面來設計一個可以計算不同圖形面積的程式。

1.  **`Shape` (介面)**
    *   定義一個抽象方法 `getArea()`，回傳 `double` 型態的面積。
    *   定義一個 `final static` 常數 `PI`，值為 `3.14159`。

2.  **`Circle` (實作 `Shape`)**
    *   屬性：`radius` (double) - 半徑。
    *   建構子：初始化半徑。
    *   實作 `getArea()`：回傳 `PI * radius * radius`。

3.  **`Rectangle` (實作 `Shape`)**
    *   屬性：`width` (double), `height` (double) - 寬和高。
    *   建構子：初始化寬和高。
    *   實作 `getArea()`：回傳 `width * height`。

4.  **`Main.java`**
    *   建立一個 `Circle` 物件 (半徑 10) 和一個 `Rectangle` 物件 (寬 5, 高 8)。
    *   分別印出這兩個圖形的面積，格式化到小數點後兩位。

**預期輸出：**
```
Area of Circle: 314.16
Area of Rectangle: 40.00
```

---

#### **第三題：圖書管理系統 (20 分)**

**說明：**
請使用 `record` 來建立一個簡單的圖書 `Book`，並透過 `Map` 來管理圖書館中的書籍庫存。

1.  **`Book` (`record`)**
    *   定義一個 `Book` record，包含 `isbn` (String), `title` (String), `author` (String)。
    *   Record 會自動產生 `equals()`, `hashCode()`, `toString()` 及 `getter` 方法。

2.  **`Library.java`**
    *   使用 `Map<String, Book>` 來儲存書籍，其中 `key` 是 `isbn`，`value` 是 `Book` 物件。
    *   實作以下方法：
        *   `addBook(Book book)`: 新增一本書到 Map 中。
        *   `findBookByIsbn(String isbn)`: 根據 ISBN 尋找書籍，找到回傳 `Book` 物件，找不到回傳 `null`。
        *   `displayAllBooks()`: 遍歷 Map，印出所有書籍的資訊 (可直接印出 `Book` 物件)。

3.  **`Main.java`**
    *   建立一個 `Library` 物件。
    *   建立 3 個 `Book` record 物件，並加入到 `Library` 中。
    *   呼叫 `displayAllBooks()` 顯示所有書籍。
    *   呼叫 `findBookByIsbn()` 尋找一本存在的書和一本不存在的書，並印出結果。

**預期輸出 (格式可自訂，但資訊需完整)：**
```
All books in the library:
Book[isbn=978-0321765723, title=The C++ Programming Language, author=Bjarne Stroustrup]
Book[isbn=978-0132350884, title=Clean Code, author=Robert C. Martin]
Book[isbn=978-0134685991, title=Effective Java, author=Joshua Bloch]

Searching for book with ISBN 978-0134685991...
Found: Book[isbn=978-0134685991, title=Effective Java, author=Joshua Bloch]

Searching for book with ISBN 000-0000000000...
Book not found.
```
