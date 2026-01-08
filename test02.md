# TQC+ Java 17 模擬試題 (Test02)

這是一份根據您的 `know.md` 知識點所設計的進階練習，旨在鞏固您的程式設計能力。

---

### 第一題：員工薪資與獎金計算系統

#### 題目說明
您需要為一家公司設計一個員工薪資計算系統。系統需處理「初階工程師 (JuniorEngineer)」和「資深工程師 (SeniorEngineer)」，並根據他們的年度績效評分來計算年度總收入。

#### 知識點考察
- **資料型別與數值精度**: 正確使用 `double` 處理薪資與稅率。
- **數值溢位**: 處理大數額獎金時，需考慮 `int` 的範圍，適時使用 `long`。
- **物件導向 - 封裝**: 類別屬性應設為 `private`。
- **物件導向 - DRY**: 將共用邏輯（如計算基本稅金）提取到父類別中。

#### 要求
1.  **建立一個 `Employee` 抽象父類別**:
    -   擁有 `private` 屬性：`id` (String), `name` (String), `baseSalary` (double)。
    -   擁有一個建構子來初始化這些屬性。
    -   擁有一個 `public double calculateBaseTax()` 方法，計算方式為 `baseSalary * 0.05`。所有員工的稅率都一樣。
    -   擁有一個 `public abstract long calculateTotalAnnualIncome(double performanceScore)` 抽象方法。

2.  **建立 `JuniorEngineer` 類別**:
    -   繼承自 `Employee`。
    -   年度總收入計算方式為：`(基礎薪資 * 12) + (績效評分 * 10000)`。績效評分是一個 `0.0` 到 `5.0` 的浮點數。

3.  **建立 `SeniorEngineer` 類別**:
    -   繼承自 `Employee`。
    -   年度總收入計算方式為：`(基礎薪資 * 12) + (基礎薪資 * 績效評分) + 50000` (固定股票價值)。

4.  **建立 `main` 主程式**:
    -   建立一個 `JuniorEngineer` 和一個 `SeniorEngineer` 物件。
    -   呼叫 `calculateTotalAnnualIncome` 方法，並將結果（應為 `long` 型別）轉為 `double` 後，減去基礎稅金 (`calculateBaseTax()` 的12個月)，最後印出稅後年收入。
    -   所有計算結果保留小數點後兩位。

#### 輸出範例
```
Enter performance score for Junior Engineer: 4.5
Enter performance score for Senior Engineer: 4.2
Junior Engineer (J001) After-Tax Annual Income: 633000.00
Senior Engineer (S001) After-Tax Annual Income: 1290000.00
```

---

### 第二題：數據分析工具類

#### 題目說明
請編寫一個 `DataAnalyzer` 工具類別，提供一組靜態方法來分析整數陣列。

#### 知識點考察
- **`static` 的正確使用**: 工具方法應為 `static`。
- **指令與查詢分離 (CQS)**: 方法應只回傳結果，不應有副作用。
- **邏輯完整性與邊界條件**: 需處理陣列為奇數/偶數長度（中位數計算），以及陣列相等元素的比較。
- **錯誤與例外處理**: 使用 `IllegalArgumentException` 處理無效的輸入。

#### 要求
1.  **建立 `AnalysisResult` 記錄類別 (Record)**:
    -   這是一個 `record` 類別，用來封裝分析結果。
    -   包含 `min` (int), `max` (int), `median` (double)。

2.  **建立 `DataAnalyzer` 類別**:
    -   包含一個 `public static AnalysisResult analyze(int[] data)` 方法。
    -   此方法接收一個整數陣列，回傳一個 `AnalysisResult` 物件。
    -   如果傳入的 `data` 為 `null` 或空陣列，必須拋出 `IllegalArgumentException` 並帶有訊息 "Input data cannot be null or empty."。
    -   `analyze` 方法內部應呼叫兩個 `private static` 的輔助方法：
        -   `findMinMax(int[] data)`: 找出最大與最小值。
        -   `calculateMedian(int[] data)`: 計算中位數。**注意：計算中位數前需要先對陣列排序。**
    -   **中位數計算規則**：
        -   如果陣列長度為奇數，中位數是排序後中間的那個數。
        -   如果陣列長度為偶數，中位數是中間兩個數的平均值。

3.  **建立 `main` 主程式**:
    -   建立兩個整數陣列，一個長度為奇數，一個為偶數。
    -   在 `try-catch` 區塊中呼叫 `DataAnalyzer.analyze()` 方法並印出結果。
    -   嘗試呼叫一個 `null` 陣列，並在 `catch` 區塊中印出例外訊息。

#### 輸出範例
```
Analysis for data1: Result[min=3, max=98, median=34.0]
Analysis for data2: Result[min=10, max=88, median=49.5]
Error: Input data cannot be null or empty.
```

---

### 第三題：商品庫存管理系統

#### 題目說明
您需要設計一個商品庫存管理系統。`Inventory` 類別負責管理一組 `Product` 物件。

#### 知識點考察
- **`static` 的副作用**: 庫存列表不應為 `static`。
- **演算法效率與正確實作**:
  - 需實作「插入排序 (Insertion Sort)」。
  - 需有效率地找出最貴的商品。
- **避免重複計算**: 避免在單一操作中重複呼叫高成本的方法。
- **程式碼簡潔性**: 移除不必要的變數或程式碼。

#### 要求
1.  **建立 `Product` 類別**:
    -   擁有 `private` 屬性：`productId` (String), `name` (String), `price` (double)。
    -   提供一個建構子和必要的 `getter` 方法。

2.  **建立 `Inventory` 類別**:
    -   內部使用 `ArrayList<Product>` 來儲存商品，這個 `ArrayList` **不能**是 `static` 的。
    -   提供 `addProduct(Product p)` 方法。
    -   提供 `public Product findMostExpensiveProduct()` 方法，需有效率地實作。
    -   提供 `public void sortProductsByName()` 方法，此方法必須使用 **插入排序 (Insertion Sort)** 演算法來根據商品名稱 (`name`) 的字母順序對內部的 `ArrayList` 進行排序。

3.  **建立 `main` 主程式**:
    -   建立一個 `Inventory` 物件並加入數個 `Product` 物件。
    -   呼叫 `findMostExpensiveProduct()` 方法一次，將結果存入變數，並印出最貴商品的資訊。
    -   呼叫 `sortProductsByName()` 方法。
    -   遍歷排序後的庫存，印出所有商品的 ID 和名稱，以驗證排序結果。

#### 輸出範例
```
Most expensive product: P003 - Laptop - Price: 1200.5
--- Sorted Inventory ---
ID: P002, Name: Keyboard
ID: P003, Name: Laptop
ID: P001, Name: Mouse
```
