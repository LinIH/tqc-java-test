# TQC Java 17 Stream API 練習題

這份文件包含三道專為練習 Java 17 Stream API 設計的題目，難度循序漸進，旨在幫助您熟悉常用的 Stream 操作。

---

### 第一題：產品資料篩選與轉換

#### 題目描述
假設您正在為一個電子商務平台工作，需要對產品列表進行處理。請您使用 Stream API 來篩選、轉換並收集符合特定條件的產品。

#### 資料模型
您可以先定義一個 `Product` 類別：
```java
class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
}
```

#### 初始資料
```java
List<Product> products = Arrays.asList(
    new Product("Laptop", "Electronics", 1200.00),
    new Product("Smartphone", "Electronics", 800.00),
    new Product("Desk Chair", "Furniture", 150.00),
    new Product("Headphones", "Electronics", 99.99),
    new Product("Coffee Maker", "Appliances", 75.50),
    new Product("Monitor", "Electronics", 300.00)
);
```

#### 任務要求
1.  從 `products` 列表中，篩選出所有 `category` 為 "Electronics" 的產品。
2.  在篩選後的結果中，再次篩選出 `price` 大於 100.00 的產品。
3.  提取這些產品的 `name`。
4.  將所有名稱轉換為大寫。
5.  最後，將結果收集到一個 `List<String>` 中並印出。

#### 預期輸出
```
[LAPTOP, SMARTPHONE, MONITOR, HEADPHONES]
```
*(注意：由於 `collect` 後未排序，順序可能不同)*

---

### 第二題：員工資料分組與統計

#### 題目描述
公司 HR 部門需要一份報告，該報告需按照部門對員工進行分組，並計算每個部門的平均薪資。

#### 資料模型
請定義一個 `Employee` 類別：
```java
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}
```

#### 初始資料
```java
List<Employee> employees = Arrays.asList(
    new Employee("Alice", "HR", 50000),
    new Employee("Bob", "Engineering", 75000),
    new Employee("Charlie", "Engineering", 80000),
    new Employee("David", "HR", 60000),
    new Employee("Eve", "Sales", 90000)
);
```

#### 任務要求
1.  使用 Stream API 將 `employees` 列表按照 `department` 進行分組。
2.  計算每個部門的平均 `salary`。
3.  將結果收集到一個 `Map<String, Double>` 中，其中 Key 是部門名稱，Value 是該部門的平均薪資。
4.  印出這個 Map。

#### 預期輸出
```
{HR=55000.0, Sales=90000.0, Engineering=77500.0}
```

---

### 第三題：訂單資料扁平化與聚合

#### 題目描述
您需要分析一個線上書店的訂單資料，找出銷售量最高的本書。這需要您處理巢狀的訂單項目列表。

#### 資料模型
```java
class OrderItem {
    private String bookTitle;
    private int quantity;

    public OrderItem(String bookTitle, int quantity) {
        this.bookTitle = bookTitle;
        this.quantity = quantity;
    }

    // Getters
    public String getBookTitle() { return bookTitle; }
    public int getQuantity() { return quantity; }
}

class Order {
    private List<OrderItem> items;

    public Order(List<OrderItem> items) {
        this.items = items;
    }

    // Getter
    public List<OrderItem> getItems() { return items; }
}
```

#### 初始資料
```java
List<Order> orders = Arrays.asList(
    new Order(Arrays.asList(
        new OrderItem("Effective Java", 2),
        new OrderItem("Java Concurrency in Practice", 1)
    )),
    new Order(Arrays.asList(
        new OrderItem("Clean Code", 3),
        new OrderItem("Effective Java", 1)
    )),
    new Order(Arrays.asList(
        new OrderItem("Head First Design Patterns", 2),
        new OrderItem("Clean Code", 1)
    ))
);
```

#### 任務要求
1.  從 `orders` 列表中，將所有訂單中的 `OrderItem` 扁平化（`flatMap`）成一個單一的 `Stream<OrderItem>`。
2.  按書名（`bookTitle`）對 `OrderItem` 進行分組。
3.  計算每本書的總銷售量（`quantity` 的總和）。
4.  找出銷售量最高的書。
5.  印出銷售量最高的書名及其銷售數量。

#### 預期輸出
```
Clean Code: 4
```
*(提示：完成分組和加總後，您會得到一個 `Map<String, Integer>`。您可以再次對這個 Map 的 entrySet 使用 Stream 來尋找最大值。)*
