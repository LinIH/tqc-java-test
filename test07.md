# TQC+ Java 17 物件導向程式設計 模擬試題

本文根據 TQC+ Java 17 官方公告的術科技能規範，設計了一系列涵蓋所有關鍵技能的模擬練習題。

---

### **模擬試題 1：類別、物件與封裝**

**情境:**
請設計一個 `Book` (書籍) 類別，用來儲存圖書館中的書籍資料。

**技能要求:**
*   定義類別 (Class) 與其成員 (屬性與方法)。
*   實踐封裝 (Encapsulation)。
*   使用建構子 (Constructor) 初始化物件。

**詳細規格:**

1.  **建立 `Book.java` 檔案**，定義 `Book` 類別，包含以下 **私有 (private)** 屬性：
    *   `isbn`: `String`
    *   `title`: `String`
    *   `author`: `String`
2.  建立一個 **公開的 (public)** 建構子 `Book(String isbn, String title, String author)` 來初始化所有屬性。
3.  為所有屬性建立 **公開的 (public)** "getter" 方法 (`getIsbn`, `getTitle`, `getAuthor`)。
4.  建立一個公開的 `displayInfo()` 方法，在主控台印出書籍的完整資訊。
5.  **建立 `Main_Q1.java` 檔案**，在 `main` 方法中建立一個 `Book` 物件並呼叫 `displayInfo()`。
    *   使用資料: ISBN: "978-986-502-938-1", Title: "Java SE 17 OCP專業認證指南", Author: "Scott Selikoff"

**預期輸出結果:**
```
ISBN: 978-986-502-938-1
Title: Java SE 17 OCP專業認證指南
Author: Scott Selikoff
```

---


### **模擬試題 2：繼承與多型**

**情境:**
擴充您的圖書館系統，除了書籍外，還要管理 `Magazine` (雜誌)。雜誌和書籍都是出版品，但資訊略有不同。

**技能要求:**
*   使用抽象類別 (Abstract Class) 定義共同行為。
*   使用繼承 (Inheritance) 擴充功能。
*   利用多型 (Polymorphism) 處理不同類型的物件。

**詳細規格:**

1.  **建立 `Publication.java` 檔案**，定義一個 `abstract` 類別 `Publication`。
    *   將 `Book` 類別中的 `isbn`, `title`, `author` 屬性及建構子移至此處。
    *   定義一個 **抽象方法** `public abstract void displayInfo();`。
2.  **修改 `Book.java`**，使其繼承 (extends) `Publication`，並實作 `displayInfo()` 方法。
3.  **建立 `Magazine.java` 檔案**，使其也繼承 `Publication`。
    *   增加一個私有屬性 `issueNumber` (`String` 型別，期數)。
    *   建立建構子，除了呼叫 `super()` 初始化父類別屬性外，也要初始化 `issueNumber`。
    *   實作 `displayInfo()` 方法，除了顯示基本資訊外，也要顯示期數。
4.  **建立 `Main_Q2.java`**，在 `main` 方法中：
    *   建立一個 `List<Publication>`。
    *   將一個 `Book` 物件和一個 `Magazine` 物件加入 List 中。
    *   使用迴圈遍歷 List，並對每個物件呼叫 `displayInfo()` 方法。

**預期輸出結果:**
```
[Book] ISBN: 978-0-321-35668-0, Title: Effective Java, Author: Joshua Bloch
[Magazine] ISBN: 977-1-234-56700-1, Title: National Geographic, Author: National Geographic Society, Issue: 2023-Feb
```

---


### **模擬試題 3：介面與例外處理**

**情境:**
設計一個課程報名系統。課程有人數上限，超過上限時應擲出例外。

**技能要求:**
*   定義與實作介面 (Interface)。
*   定義自訂例外 (Custom Exception)。
*   使用 `try-catch` 處理例外狀況。

**詳細規格:**

1.  **建立 `EnrollmentFullException.java`**，這是一個自訂例外類別，繼承 `Exception`。
2.  **建立 `Enrollable.java`**，這是一個介面，定義以下方法：
    *   `void enrollStudent(String studentName) throws EnrollmentFullException;`
    *   `int getEnrolledCount();`
3.  **建立 `Course.java`**，實作 `Enrollable` 介面。
    *   屬性：課程名稱 (`courseName`)、人數上限 (`capacity`)、學生名單 (`List<String> students`)。
    *   `enrollStudent` 方法：當報名人數未滿時，將學生加入名單；若已滿，則 `throw new EnrollmentFullException("Course is full!")`。
4.  **建立 `Main_Q3.java`**，在 `main` 方法中：
    *   建立一個容量為 2 的 `Course` 物件。
    *   使用 `try-catch` 區塊，嘗試報名 3 位學生。
    *   在 `catch` 區塊中，印出例外訊息。

**預期輸出結果:**
```
Student Alice has enrolled in [Your Course Name].
Student Bob has enrolled in [Your Course Name].
Error: Course is full!
Current enrollment: 2
```

---


### **模擬試題 4：集合、泛型與 Lambda/Stream API**

**情境:**
為一個線上商店管理商品庫存，並使用 Stream API 進行資料分析。

**技能要求:**
*   使用 `Map` 儲存鍵值對資料。
*   使用泛型增加程式碼彈性。
*   應用 Lambda 與 Stream API 進行資料處理。

**詳細規格:**

1.  **建立 `Product.java`**，一個簡單的 POJO (Plain Old Java Object)，包含 `id (String)`, `name (String)`, `price (double)` 屬性。
2.  **建立 `Inventory.java`**，一個泛型類別 `Inventory<T extends Product>`。
    *   內部使用 `Map<String, T>` 儲存商品，ID 為 Key。
    *   提供 `addProduct(T product)` 和 `getAllProducts()` (回傳 `Collection<T>`) 方法。
3.  **建立 `Main_Q4.java`**，在 `main` 方法中：
    *   建立 `Inventory<Product>` 物件並加入數個商品。
    *   **使用 Stream API** 完成以下操作並印出結果：
        a. 找出所有價格大於 1000 的商品。
        b. 計算庫存中所有商品的總價值。
        c. 獲取所有商品的名稱，並以字母順序排序。

**預期輸出結果:**
```
Products with price > 1000:
[Product{id='P002', name='Laptop', price=1500.0}]

Total inventory value: 2080.0

Product names sorted:
[Keyboard, Laptop, Mouse]
```

---


### **模擬試題 5：檔案 I/O (NIO.2) 與日期時間 API**

**情境:**
建立一個簡單的日誌記錄器，將帶有時間戳的訊息附加到日誌檔案中。

**技能要求:**
*   使用 `java.nio.file` 套件讀寫檔案。
*   使用 `java.time` API 取得並格式化目前時間。

**詳細規格:**

1.  **建立 `Logger.java` 檔案**。
2.  建立 `log(String message)` 方法：
    *   使用 `LocalDateTime.now()` 取得目前時間。
    *   使用 `DateTimeFormatter` 將時間格式化為 `yyyy-MM-dd HH:mm:ss`。
    *   組合日誌訊息，格式為 `[時間戳] - 訊息\n`。
    *   使用 `Files.writeString()` 將訊息附加 (`StandardOpenOption.APPEND`, `StandardOpenOption.CREATE`) 到名為 `app.log` 的檔案中。
3.  **建立 `Main_Q5.java`**，在 `main` 方法中：
    *   先刪除舊的 `app.log` 以確保每次執行結果乾淨。
    *   建立 `Logger` 物件並呼叫 `log` 方法三次。
4.  執行完畢後，檢查專案根目錄下是否生成 `app.log` 檔案，且內容符合預期。

**`app.log` 預期檔案內容 (時間戳會不同):**
```
[2023-10-27 10:30:00] - Application starting...
[2023-10-27 10:30:01] - Processing data...
[2023-10-27 10:30:02] - Application finished.
```
