
import java.io.*;
class Q02{
    public static void main(String[] args){
        int[] data1 = {10, 3, 45, 98, 34};
        int[] data2 = {49, 11, 10, 88, 51, 50};
        int[] data3 = null;
        AnalysisResult ar;
        try{
            ar = DataAnalyzer.analyze(data1);
            System.out.printf("Analysis for data1: Result[min=%d, max=%d, median=%.1f]\n", ar.getMin(), ar.getMax(), ar.getMedian());
        
            ar = DataAnalyzer.analyze(data2);
            System.out.printf("Analysis for data2: Result[min=%d, max=%d, median=%.1f]\n", ar.getMin(), ar.getMax(), ar.getMedian());
            ar = DataAnalyzer.analyze(data3);
            System.out.printf("Analysis for data3: Result[min=%d, max=%d, median=%.1f]\n", ar.getMin(), ar.getMax(), ar.getMedian());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}