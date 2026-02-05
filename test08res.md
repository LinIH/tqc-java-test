# TQC Java 17 Stream API 練習題 - 檢查結果

## 第一題 (Q01)

*   **狀態**: <font color="orange">部分正確</font>
*   **原始碼分析**:
    *   您的解答中，類別 `Main` 和 `Product` 都使用了預設的 package-private 存取修飾詞，這導致在命令列環境中無法透過 `java Main` 執行，會拋出 `ClassNotFoundException`。標準作法是將作為程式進入點的 `Main` 類別以及其他需要在外部被引用的類別宣告為 `public`。
    *   您將 Stream 操作拆分為三個獨立的鏈，雖然結果正確，但效率較低，且不符合 Stream API 的鏈式調用風格。
*   **執行結果**:
    *   修正類別可見性並將 Stream 操作串聯後，您的程式碼邏輯產生的輸出為 `[LAPTOP, SMARTPHONE, MONITOR]`。
*   **比對**:
    *   您的邏輯正確地排除了價格為 `99.99` 的 "Headphones"，因為 `99.99 > 100` 為 `false`。
    *   然而，`test08.md` 中給出的預期輸出 `[LAPTOP, SMARTPHONE, MONITOR, HEADPHONES]` 是 **錯誤** 的，它與自身的題目要求（`price > 100.00`）不符。
*   **結論**: 您的篩選邏輯是正確的，但因為 `test08.md` 的預期輸出有誤，導致結果不完全匹配。主要問題在於 Java 類別的存取修飾詞不正確。

---

## 第二題 (Q02)

*   **狀態**: <font color="green">正確</font>
*   **原始碼分析**:
    *   您的程式碼成功地得出了正確結果。
    *   您採用了兩步驟：先使用 `groupingBy` 產生 `Map<String, List<Employee>>`，然後再遍歷此 Map，為每個部門的 List 建立新的 Stream 來計算平均值。
    *   **改進建議**: Stream API 允許在 `groupingBy` 中直接提供一個下游收集器（downstream collector）來完成計算，讓程式碼更簡潔。可以這樣寫：
        ```java
        Map<String, Double> avgSalaries = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        ```
        這樣可以在一次 Stream 操作中就完成分組和平均值計算。
*   **執行結果**:
    *   輸出為 `{Engineering=77500.0, Sales=90000.0, HR=55000.0}`。
*   **比對**:
    *   結果與預期輸出 `{HR=55000.0, Sales=90000.0, Engineering=77500.0}` 完全相符。
*   **結論**: 功能正確，邏輯清晰。若能採用下游收集器，程式碼會更精簡。

---

## 第三題 (Q03)

*   **狀態**: <font color="green">正確</font>
*   **原始碼分析**:
    *   您的程式碼完全正確地解決了問題。
    *   您的解法步驟清晰：先 `flatMap`，再 `groupingBy`，然後迴圈建立新 Stream 計算加總，最後再建立 Stream 找出最大值。
    *   **改進建議**: 與第二題類似，您可以在 `groupingBy` 後直接使用下游收集器 `summingInt` 來簡化加總步驟。找出最大值的步驟也可以鏈接在後面，將多個 Stream 操作合而為一：
        ```java
        // 簡化後的寫法
        Map<String, Integer> salesByBook = orders.stream()
            .flatMap(order -> order.getItems().stream())
            .collect(Collectors.groupingBy(
                OrderItem::getBookTitle,
                Collectors.summingInt(OrderItem::getQuantity)
            ));

        salesByBook.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(entry -> 
                System.out.println(entry.getKey() + ": " + entry.getValue())
            );
        ```
*   **執行結果**:
    *   輸出為 `Clean Code:4`。
*   **比對**:
    *   結果與預期輸出 `Clean Code: 4` 完全相符。
*   **結論**: 功能完全正確，邏輯清晰。透過下游收集器可以讓程式碼更為精煉。

---
