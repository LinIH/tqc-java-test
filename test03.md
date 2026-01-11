# TQC+ 物件導向程式語言設計 JAVA 17 模擬試題 (無中文硬編碼版本)

**注意：** 本模擬試題僅為模擬練習之用，題目類型與難度參考一般Java程式設計認證，不完全等同於實際 TQC+ 考試內容。程式碼中的字串已改為英文，以避免編譯環境的編碼問題。

---

## 第一部分：選擇題 (共 20 分，每題 5 分)

1.  關於 Java 17 的新特性，下列敘述何者**錯誤**？
    (A) `switch` 運算式 (Switch Expressions) 提供了更簡潔的分支語法。
    (B) `sealed` 關鍵字可以用來限制一個類別或介面可以被哪些其他類別或介面所繼承或實作。
    (C) `record` 類別是一種簡潔的方式來宣告用於儲存不可變資料的類別。
    (D) Java 17 是一個短期支援 (Short-Term-Support) 版本。

2.  在物件導向程式設計中，將資料和操作該資料的方法封裝在一起，並隱藏物件的內部實作細節，這稱為？
    (A) 繼承 (Inheritance)
    (B) 封裝 (Encapsulation)
    (C) 多型 (Polymorphism)
    (D) 抽象 (Abstraction)

3.  下列哪一個 `java.util` 集合類別不允許儲存重複的元素？
    (A) `ArrayList`
    (B) `LinkedList`
    (C) `HashSet`
    (D) `HashMap`

4.  關於 Java 的例外處理 (Exception Handling)，下列程式碼的執行結果為何？
    ```java
    public class TestException {
        public static void main(String[] args) {
            try {
                System.out.print("A");
                int value = 5 / 0;
                System.out.print("B");
            } catch (ArithmeticException e) {
                System.out.print("C");
            } finally {
                System.out.print("D");
            }
            System.out.print("E");
        }
    }
    ```
    (A) ACDE
    (B) ABCDE
    (C) ACE
    (D) ACD

---

## 第二部分：程式填充 (共 30 分，每題 15 分)

1.  請完成以下程式碼，使其能夠正確計算並印出 `1` 到 `10` 的總和。
    ```java
    public class Summation {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                // TODO: 將 i 的值累加到 sum 中
                sum += i;
            }
            System.out.println("The sum is: " + sum);
        }
    }
    ```

2.  `sealed` 關鍵字用於限制類別的繼承。請完成以下程式碼，使 `Car` 和 `Bike` 類別可以合法地繼承 `Vehicle` 類別。
    ```java
    // TODO: 使用 sealed 關鍵字，並允許 Car 和 Bike 繼承
    public abstract sealed class Vehicle permits Car, Bike {} 

    // Car 和 Bike 是 final 的，不能再被繼承
    final class Car extends Vehicle {}
    final class Bike extends Vehicle {}
    ```

---

## 第三部分：程式設計題 (共 50 分)

**題目：** 設計一個 `Book` record 和一個 `Library` 類別。

**要求：**

1.  **`Book` record:**
    *   使用 Java 17 的 `record` 特性來建立。
    *   應包含 `title` (書名，`String`) 和 `author` (作者，`String`) 兩個欄位。
    *   `record` 為不可變 (immutable) 物件。

2.  **`Library` 類別:**
    *   內部使用一個 `ArrayList<Book>` 來儲存館藏的書籍。
    *   提供一個 `addBook(Book book)` 方法，用於新增一本書到館藏中。
    *   提供一個 `findBookByTitle(String title)` 方法，可以根據書名尋找書籍。如果找到，返回該 `Book` 物件；如果找不到，返回 `null`。
    *   提供一個 `printAllBooks()` 方法，用於印出圖書館中所有書籍的資訊 (書名和作者)。

3.  **`Main` 類別:**
    *   建立一個 `Library` 物件。
    *   建立至少三本 `Book` 物件，並將它們加入圖書館。
    *   呼叫 `printAllBooks()` 方法來顯示所有館藏。
    *   呼叫 `findBookByTitle()` 方法來尋找一本存在的書和一本不存在的書，並將結果印出。

**請撰寫完整的 `Book` record、`Library` 類別以及用於測試的 `Main` 類別程式碼。**

---
### 參考解答

#### 第一部分：選擇題
1. (D)
2. (B)
3. (C)
4. (A)

#### 第二部分：程式填充
1. `sum += i;`
2. `sealed class Vehicle permits Car, Bike`

#### 第三部分：程式設計題
```java
// Book.java
public record Book(String title, String author) {
}

// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void printAllBooks() {
        System.out.println("All Books in Library:");
        for (Book book : books) {
            System.out.println("- Title: " + book.title() + ", Author: " + book.author());
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. 建立 Library 物件
        Library myLibrary = new Library();

        // 2. 建立並新增 Book 物件
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Java: A Beginner's Guide", "Herbert Schildt");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        System.out.println("---");

        // 3. 顯示所有館藏
        myLibrary.printAllBooks();

        System.out.println("\n---");

        // 4. 尋找書籍
        System.out.println("Searching for 'Clean Code':");
        Book foundBook = myLibrary.findBookByTitle("Clean Code");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nSearching for 'Design Patterns':");
        Book notFoundBook = myLibrary.findBookByTitle("Design Patterns");
        if (notFoundBook != null) {
            System.out.println("Found: " + notFoundBook);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("---");
    }
}
```