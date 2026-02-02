# TQC+ Java 17 物件導向程式設計 - 實戰練習題

這份文件包含三道專為練習 Java 物件導向程式設計而設計的題目，涵蓋了類別設計、繼承與多型、介面等核心觀念。請依照題目說明完成程式碼。

---

## 第一題：網路商店商品類別設計

### 題目說明

請設計一個網路商店的商品 (`Product`) 類別，該類別需要儲存商品的各項資訊，並提供方法來管理庫存。

### 實作要求

1.  **建立 `Product.java` 檔案。**
2.  在檔案中定義一個公開 (`public`) 的 `Product` 類別。
3.  類別應包含以下 **私有 (`private`)** 屬性：
    *   `productId`: 商品編號 (型別 `String`)
    *   `name`: 商品名稱 (型別 `String`)
    *   `price`: 商品價格 (型別 `int`)
    *   `stock`: 商品庫存 (型別 `int`)
4.  **建構子 (Constructor)**：
    *   提供一個公開的建構子，需傳入商品編號、名稱、價格和庫存，並在建構子中完成屬性的初始化。
5.  **公開方法 (Public Methods)**：
    *   `sell(int quantity)`: 銷售方法。
        *   如果 `quantity` 小於或等於目前的 `stock`，則將 `stock` 減去 `quantity` 並回傳 `true`。
        *   如果 `quantity` 大於目前的 `stock`，庫存不變，並回傳 `false`。
    *   `getInfo()`: 取得商品資訊。
        *   回傳一個格式化的字串，格式為 `"ID: [productId], Name: [name], Price: $[price], Stock: [stock] units"`。
    *   為所有屬性（`productId`, `name`, `price`, `stock`）提供 Getter 方法，例如 `getProductId()`。

### 測試範例

您可以建立一個 `Main.java` 來測試您的 `Product` 類別。

```java
// Main.java (for testing)
public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Gaming Laptop", 45000, 10);
        System.out.println(laptop.getInfo()); // ID: P001, Name: Gaming Laptop, Price: $45000, Stock: 10 units

        boolean success = laptop.sell(3);
        System.out.println("Sale successful: " + success); // Sale successful: true
        System.out.println(laptop.getInfo()); // ID: P001, Name: Gaming Laptop, Price: $45000, Stock: 7 units

        success = laptop.sell(8);
        System.out.println("Sale successful: " + success); // Sale successful: false
        System.out.println(laptop.getInfo()); // ID: P001, Name: Gaming Laptop, Price: $45000, Stock: 7 units
    }
}
```

---

## 第二題：員工薪資計算（繼承與多型）

### 題目說明

某公司有兩種類型的員工：月薪制員工 (`SalaryWorker`) 和時薪制員工 (`HourlyWorker`)。請使用「繼承」來設計一個薪資計算系統。

### 實作要求

1.  **建立 `Employee.java` (父類別)**
    *   定義為一個 `abstract` 抽象類別。
    *   包含 **保護 (`protected`)** 屬性 `name` (姓名, `String`)。
    *   提供一個建構子來初始化 `name`。
    *   包含一個 `abstract` 抽象方法 `calculateSalary()`，回傳薪資（型別 `double`）。

2.  **建立 `SalaryWorker.java` (子類別)**
    *   繼承自 `Employee`。
    *   包含一個私有屬性 `monthlySalary` (月薪, `double`)。
    *   提供建構子，需傳入姓名和月薪。
    *   覆寫 (`@Override`) `calculateSalary()` 方法，直接回傳 `monthlySalary`。

3.  **建立 `HourlyWorker.java` (子類別)**
    *   繼承自 `Employee`。
    *   包含私有屬性 `hourlyRate` (時薪, `double`) 和 `hoursWorked` (工時, `int`)。
    *   提供建構子，需傳入姓名、時薪和工時。
    *   覆寫 (`@Override`) `calculateSalary()` 方法，回傳 `hourlyRate * hoursWorked` 的計算結果。

### 測試範例

```java
// Main.java (for testing)
public class Main {
    public static void main(String[] args) {
        Employee manager = new SalaryWorker("John Doe", 60000);
        Employee partTimer = new HourlyWorker("Jane Smith", 200, 80);

        // 利用多型
        Employee[] employees = {manager, partTimer};

        for (Employee emp : employees) {
            System.out.printf("Employee: %s, Salary: %.2f%n", emp.name, emp.calculateSalary());
        }
    }
}
// 預期輸出:
// Employee: John Doe, Salary: 60000.00
// Employee: Jane Smith, Salary: 16000.00
```

---

## 第三題：訊息通知系統（介面）

### 題目說明

請設計一個通用的訊息通知系統。系統需要能夠透過多種方式（如 Email, SMS）發送訊息。請使用「介面」來達成此設計。

### 實作要求

1.  **建立 `Notifiable.java` (介面)**
    *   定義一個公開的 `interface`。
    *   包含一個抽象方法 `send(String message)`。

2.  **建立 `EmailNotifier.java` (實作類別)**
    *   實作 (`implements`) `Notifiable` 介面。
    *   `send` 方法的實作是在控制台印出 `"Sending Email: " + message`。

3.  **建立 `SmsNotifier.java` (實作類別)**
    *   實作 (`implements`) `Notifiable` 介面。
    *   `send` 方法的實作是在控制台印出 `"Sending SMS: " + message`。

4.  **建立 `NotificationService.java` (服務類別)**
    *   提供一個靜態 (`static`) 方法 `sendNotification(Notifiable notifier, String message)`。
    *   此方法會呼叫傳入的 `notifier` 物件的 `send` 方法來發送訊息。

### 測試範例

```java
// Main.java (for testing)
public class Main {
    public static void main(String[] args) {
        // 建立不同的通知器
        Notifiable email = new EmailNotifier();
        Notifiable sms = new SmsNotifier();

        // 使用通知服務發送訊息
        NotificationService.sendNotification(email, "Your order has been shipped.");
        NotificationService.sendNotification(sms, "Your verification code is 12345.");
    }
}
// 預期輸出:
// Sending Email: Your order has been shipped.
// Sending SMS: Your verification code is 12345.
```