# TQC+ Java 17 模擬試題 (Test05)

這是一份針對 TQC+ Java 17 認證考試的綜合模擬試題，重點涵蓋檔案存取 (File I/O)、集合框架 (Collections) 與物件導向多型 (Polymorphism) 等核心技能。

---

### 第一題：圖書庫存管理 (Collections & Sorting)

#### 題目說明
請設計一個簡單的圖書管理系統，使用集合 (List) 來儲存書籍資訊，並實作自定義排序功能。

#### 知識點考察
- **ArrayList**: 動態陣列的操作。
- **Comparable/Comparator**: 物件排序。
- **Encapsulation**: 類別封裝。

#### 要求
1.  **建立 `Book` 類別**:
    -   屬性：`isbn` (String), `title` (String), `price` (int)。
    -   實作 `Comparable<Book>` 介面，預設依照 `isbn` 進行升冪排序。
    -   覆寫 `toString()` 方法以利列印。

2.  **建立 `BookStore` 類別**:
    -   包含一個 `main` 方法。
    -   建立一個 `ArrayList<Book>` 加入至少 3 本書（價格需不同，ISBN 需未排序）。
    -   **操作 1**：呼叫 `Collections.sort()` 使用預設排序 (ISBN) 並印出結果。
    -   **操作 2**：使用 `Comparator` (可以是 Lambda 表達式) 依照 `price` 由高到低排序並印出結果。

#### 輸出範例
```
Sorted by ISBN:
[Book{isbn='A001', title='Java Basics', price=500}, Book{isbn='B002', title='Advanced Java', price=800}, Book{isbn='C003', title='Data Structures', price=600}]

Sorted by Price (Desc):
[Book{isbn='B002', title='Advanced Java', price=800}, Book{isbn='C003', title='Data Structures', price=600}, Book{isbn='A001', title='Java Basics', price=500}]
```

---

### 第二題：圖形面積計算 (Abstract Class & Polymorphism)

#### 題目說明
利用抽象類別與多型概念，設計一套計算不同幾何圖形面積的程式。

#### 知識點考察
- **Abstract Class**: 定義抽象方法。
- **Inheritance & Polymorphism**: 繼承與多型應用。
- **Math Library**: 數學運算。

#### 要求
1.  **建立抽象類別 `Shape`**:
    -   宣告一個抽象方法 `public abstract double calculateArea()`。
    -   宣告一個一般方法 `printInfo()`，印出 "This is a shape."。

2.  **建立子類別**:
    -   `Circle`: 繼承 `Shape`，屬性 `radius` (double)。實作 `calculateArea` (公式: π * r * r，π 可用 `Math.PI`)。
    -   `Rectangle`: 繼承 `Shape`，屬性 `width` (double), `height` (double)。實作 `calculateArea` (公式: w * h)。

3.  **建立 `main` 主程式**:
    -   建立一個 `List<Shape>` 或陣列，放入一個 `Circle` (半徑 10) 和一個 `Rectangle` (寬 10, 高 20)。
    -   使用 `for-each` 迴圈遍歷集合：
        -   呼叫 `calculateArea()` 計算面積。
        -   利用 `instanceof` 判斷是圓形還是長方形，分別印出 "Circle Area: ..." 或 "Rectangle Area: ..." (保留兩位小數)。

#### 輸出範例
```
Circle Area: 314.16
Rectangle Area: 200.00
```

---

### 第三題：日誌檔案寫入與讀取 (File I/O & Exception Handling)

#### 題目說明
模擬一個系統日誌記錄器，將訊息寫入檔案，再從檔案讀取出來顯示。

#### 知識點考察
- **File I/O**: `FileWriter`, `FileReader` 或 `java.nio.file` (Files, Path)。
- **Try-with-resources**: 自動關閉資源。
- **IOException**: 處理檔案存取例外。

#### 要求
1.  **建立 `LogManager` 類別**:
    -   方法 `writeLog(String filename, List<String> messages)`:
        -   將傳入的字串列表寫入指定的檔案中，每一行一則訊息。
        -   **必須**使用 `try-with-resources` 語法確保檔案關閉。
    -   方法 `readLog(String filename)`:
        -   讀取指定檔案內容並將每一行印出到 Console。
        -   需捕捉並處理可能發生的 `IOException` (印出堆疊追蹤或錯誤訊息)。

2.  **建立 `main` 主程式**:
    -   定義檔名為 `system.log`。
    -   準備一個 `List<String>` 包含 "System started.", "User login.", "Error: Timeout."。
    -   呼叫 `writeLog` 寫入檔案。
    -   呼叫 `readLog` 讀取並驗證寫入內容。

#### 輸出範例
```
Writing logs to system.log...
Logs written successfully.

Reading logs from system.log...
System started.
User login.
Error: Timeout.
```
