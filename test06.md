# TQC+ Java 17 物件導向程式設計 (專業級) 練習題方向

本文根據網路上的資源，包含官方範例試卷與前輩們的經驗分享，整理出 TQC+ Java 17 物件導向程式設計（專業級）術科考試的常見題型與準備方向。

## 考試題型概述

TQC+ 的術科考試通常分為數個**類別 (Category)**，每個類別都專注於一個特定的物件導向或Java核心主題。您需要在指定的類別中，根據題目要求完成或修改Java類別。

考試系統會提供一個專案結構，您需要做的就是將規定的邏輯填入對應的 `.java` 檔案中。評分是基於您的程式是否能通過一系列的單元測試。

## 常見的練習題類別與方向

以下是根據過往經驗和範例試卷歸納出的主要測驗方向：

### 第一類：基礎類別實作與資料處理

*   **核心觀念：** 類別定義、建構子 (Constructor)、Getter/Setter 方法、基本資料型態與字串操作。
*   **練習方向：**
    *   設計一個簡單的類別（如 `Student`, `Product`），包含數個私有屬性 (private fields)。
    *   實作多載 (overloading) 的建構子。
    *   提供公開的 (public) Getter 和 Setter 方法來存取與修改屬性。
    *   練習字串的分割 (`split`)、取代 (`replace`) 與格式化 (`String.format`)。

### 第二類：繼承 (Inheritance) 與多型 (Polymorphism)

*   **核心觀念：** 類別繼承 (`extends`)、方法覆寫 (`@Override`)、`super` 關鍵字、父類別引用指向子類別物件。
*   **練習方向：**
    *   定義一個基礎類別 (Base Class)，例如 `Employee`。
    *   建立數個繼承自基礎類別的子類別 (Subclass)，例如 `Manager`, `HourlyWorker`。
    *   在子類別中覆寫父類別的方法，以實作不同的行為（例如計算薪水的方法）。
    *   練習使用 `instanceof` 運算子來判斷物件的真實型態。

### 第三類：介面 (Interface) 與抽象類別 (Abstract Class)

*   **核心觀念：** `interface` 的定義與實作 (`implements`)、`abstract class` 的使用、介面的多重實作。
*   **練習方向：**
    *   定義一個介面（如 `Payable`），包含計算費用的抽象方法。
    *   讓不同的類別實作此介面。
    *   定義一個抽象類別（如 `Shape`），包含抽象方法 `getArea()` 和非抽象方法，並讓子類別繼承它。

### 第四類：例外處理 (Exception Handling)

*   **核心觀念：** `try-catch-finally` 區塊、`throw` 與 `throws` 關鍵字、自訂例外類別。
*   **練習方向：**
    *   練習在方法中使用 `try-catch` 來捕捉可能發生的標準例外（如 `NumberFormatException`, `IOException`）。
    *   設計一個繼承自 `Exception` 的自訂例外類別（如 `InsufficientFundsException`）。
    *   在適當的時機點 `throw` 這個自訂例外。

### 第五類：Java 集合框架 (Collections Framework)

*   **核心觀念：** `List` (特別是 `ArrayList`)、`Map` (特別是 `HashMap`) 的使用、泛型 (Generics)。
*   **練習方向：**
    *   使用 `ArrayList` 來儲存和管理一組物件。練習新增、刪除、遍歷 (iterate) list 中的元素。
    *   使用 `HashMap` 來儲存鍵值對 (key-value pairs)。
    *   練習搭配泛型來確保集合的型態安全。

## 準備建議

1.  **熟悉IDE操作：** 考試時通常會在指定的整合開發環境 (IDE) 中進行，請務必熟悉基本操作。
2.  **詳讀題目說明：** 題目會詳細說明類別名稱、方法名稱、參數型態與回傳值，請嚴格遵守，因為評分系統是大小寫敏感的。
3.  **從官方範例著手：** 前往 TQC+ 官網下載最新的 Java 17 範例試卷，實際操作一遍，是最好的準備方式。

祝您考試順利！
