# TQC+ Java 17 模擬試題 (Test04)

這是一份針對 Java 17 新特性與物件導向設計的模擬試題，旨在測試您對 Record、Sealed Classes、Switch Expressions 以及例外處理的掌握程度。

---

### 第一題：支付處理系統 (Sealed Classes & Switch Expressions)

#### 題目說明
請設計一個支付處理系統，使用 Java 17 的 `sealed` 關鍵字來限制支付方式的繼承，並使用強化的 `switch` 表達式來計算手續費。

#### 知識點考察
- **Sealed Classes/Interfaces**: 限制類別繼承階層。
- **Records**: 定義不可變的資料載體。
- **Switch Expressions**: 使用箭頭語法 `->` 與模式匹配 (Pattern Matching)。

#### 要求
1.  **建立 Sealed Interface**:
    -   定義一個 `sealed interface Payment`，只允許 `CreditCard` 和 `Cash` 兩個 Record 實作。

2.  **建立 Records**:
    -   建立 `record CreditCard(String cardNumber, double amount)` 實作 `Payment`。
    -   建立 `record Cash(double amount)` 實作 `Payment`。

3.  **建立 `PaymentProcessor` 類別**:
    -   包含一個靜態方法 `public static double calculateFee(Payment payment)`。
    -   **必須**使用 Java 17 的 `switch` 表達式 (Switch Expression) 來判斷 `payment` 的類型並計算手續費：
        -   如果是 `CreditCard`，手續費為 `amount` 的 2%。
        -   如果是 `Cash`，手續費為 0。
    -   回傳計算後的手續費。

4.  **建立 `main` 主程式**:
    -   建立一個 `CreditCard` 物件 (金額 1000) 和一個 `Cash` 物件 (金額 500)。
    -   分別呼叫 `calculateFee` 並印出結果。

#### 輸出範例
```
Payment Type: CreditCard, Amount: 1000.0, Fee: 20.0
Payment Type: Cash, Amount: 500.0, Fee: 0.0
```

---

### 第二題：學生成績分析 (Record & Stream API)

#### 題目說明
請使用 Java `record` 來定義學生資料，並利用 Stream API 進行成績分析與統計。

#### 知識點考察
- **Record**: 簡潔的類別宣告。
- **List.of()**: 建立不可變列表。
- **Stream API**: `filter`, `map`, `average`, `orElse` 等操作。

#### 要求
1.  **建立 `Student` Record**:
    -   包含欄位：`id` (String), `name` (String), `score` (int)。

2.  **建立 `GradeAnalyzer` 類別**:
    -   包含一個靜態方法 `public static void analyze(List<Student> students)`。
    -   在此方法內使用 Stream API 完成以下操作：
        1.  計算並印出所有學生的**平均分數** (保留一位小數)。
        2.  找出並印出**不及格 (分數 < 60)** 的學生姓名列表。
        3.  找出並印出**最高分**的學生資訊 (印出整個 Record)。

3.  **建立 `main` 主程式**:
    -   使用 `List.of()` 建立包含至少 5 位學生的清單 (分數需包含不及格與高分群)。
    -   呼叫 `analyze` 方法。

#### 輸出範例
```
Average Score: 72.5
Failed Students: [Bob, David]
Top Student: Student[id=S003, name=Charlie, score=95]
```

---

### 第三題：銀行帳戶交易 (自訂例外 & 封裝)

#### 題目說明
設計一個銀行帳戶類別，並針對存款與提款操作進行嚴格的錯誤檢查，使用自訂例外來處理錯誤情況。

#### 知識點考察
- **Custom Exception**: 繼承 `Exception` 或 `RuntimeException`。
- **Encapsulation**: 保護帳戶餘額。
- **Throwing Exceptions**: 使用 `throw` 拋出例外。

#### 要求
1.  **建立自訂例外**:
    -   `InsufficientFundsException` (餘額不足)。
    -   `InvalidAmountException` (金額無效，如負數)。
    -   以上兩者皆繼承自 `Exception` (Checked Exception)。

2.  **建立 `BankAccount` 類別**:
    -   擁有 `private String accountNumber` 和 `private double balance`。
    -   提供建構子初始化帳號與初始餘額。
    -   提供 `deposit(double amount)` 方法：
        -   若 `amount` <= 0，拋出 `InvalidAmountException`。
        -   否則將金額加入餘額。
    -   提供 `withdraw(double amount)` 方法：
        -   若 `amount` <= 0，拋出 `InvalidAmountException`。
        -   若 `amount` > `balance`，拋出 `InsufficientFundsException`。
        -   否則從餘額扣除。
    -   提供 `getBalance()` 方法。

3.  **建立 `main` 主程式**:
    -   建立一個帳戶，初始餘額 5000。
    -   使用 `try-catch` 區塊測試以下情境並印出對應的例外訊息 (getMessage)：
        1.  提款 6000 (應觸發餘額不足)。
        2.  存款 -100 (應觸發無效金額)。
        3.  正常提款 1000 並印出剩餘餘額。

#### 輸出範例
```
Transaction 1: Withdraw 6000
Error: Insufficient funds. Current balance: 5000.0

Transaction 2: Deposit -100
Error: Invalid amount: -100.0

Transaction 3: Withdraw 1000
Success. New Balance: 4000.0
```
