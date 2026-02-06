# TQC Java 17 物件導向程式設計練習題：圖書館書籍管理系統

**目標：** 練習 Java IO 和 Stream API，並結合物件導向設計原則。

**情境說明：**

您正在開發一個圖書館書籍管理系統。需要處理一份包含書籍資訊的文字檔，並根據特定條件對書籍進行分析和報告。

**檔案格式說明：**

您會收到一個名為 `books.txt` 的文字檔，每一行代表一本圖書的資訊，各欄位之間以逗號 `,` 分隔。格式如下：

```
書名,作者,出版年份,價格,庫存數量,類別
```

**範例 `books.txt` 內容：**

```
Java程式設計,陳會安,2023,850,50,電腦科學
Python入門,王小明,2022,600,120,電腦科學
Effective Java,Joshua Bloch,2018,990,30,電腦科學
人類簡史,尤瓦爾·諾亞·赫拉利,2014,450,200,歷史
三體,劉慈欣,2008,580,80,科幻
Java核心技術,Cay S. Horstmann,2021,1200,40,電腦科學
深度學習,李宏毅,2020,750,70,電腦科學
JavaScript全端開發,林大華,2023,720,60,電腦科學
情緒勒索,周慕姿,2017,380,150,心理學
紅樓夢,曹雪芹,1791,300,100,文學
```

**練習任務：**

請完成以下功能：

1.  **建立 `Book` 類別：**
    *   包含屬性：`title` (書名, `String`), `author` (作者, `String`), `publicationYear` (出版年份, `int`), `price` (價格, `double`), `stock` (庫存數量, `int`), `category` (類別, `String`)。
    *   提供一個建構子來初始化所有屬性。
    *   為所有屬性提供 getter 方法。
    *   實作 `toString()` 方法，以方便列印書籍資訊。

2.  **讀取與解析檔案：**
    *   撰寫一個主要類別 (例如 `BookAnalyzer`)，其中包含能夠讀取 `books.txt` 檔案的方法。
    *   使用 Java IO (建議使用 `BufferedReader` 結合 `Files.lines()` 產生 `Stream<String>`) 逐行讀取檔案內容。
    *   將每一行解析成 `Book` 物件，並收集到一個 `List<Book>` 中。

3.  **使用 Stream API 進行資料處理：**
    *   **任務 A：** 找出所有「電腦科學」類別且價格高於 700 元的書籍。將這些書籍按照價格由高到低排序，然後將結果逐行列印到控制台。
    *   **任務 B：** 計算所有書籍的平均價格。將結果列印到控制台 (格式為 "平均書籍價格: XXX.XX")。
    *   **任務 C：** 找出出版年份在 2020 年之後 (含 2020 年) 的所有書籍書名。將這些書名以逗號 `,` 分隔的形式，寫入一個新的檔案 `new_books.txt` 中。

4.  **錯誤處理：**
    *   妥善處理檔案讀取或寫入時可能發生的 `IOException` (例如使用 `try-catch` 區塊)。

**預期輸出範例：**

當程式執行後，控制台應輸出類似以下的結果 (第一項任務 A 和 B)：

```
高價電腦科學書籍 (依價格降序):
Book{title='Java核心技術', author='Cay S. Horstmann', publicationYear=2021, price=1200.0, stock=40, category='電腦科學'}
Book{title='Effective Java', author='Joshua Bloch', publicationYear=2018, price=990.0, stock=30, category='電腦科學'}
Book{title='Java程式設計', author='陳會安', publicationYear=2023, price=850.0, stock=50, category='電腦科學'}
Book{title='深度學習', author='李宏毅', publicationYear=2020, price=750.0, stock=70, category='電腦科學'}
平均書籍價格: 652.00
```

並且在專案根目錄下生成一個 `new_books.txt` 檔案，內容類似：

```
Java程式設計,Python入門,Java核心技術,深度學習,JavaScript全端開發
```
