import java.io.*;
class DataAnalyzer{
    static AnalysisResult ar = new AnalysisResult();
    public static AnalysisResult analyze(int[] data) throws IllegalArgumentException {
        if (data == null || data.length == 0) throw new IllegalArgumentException("Input data cannot be null or empty");
        findMinMax(data);
        calculateMedian(data);

        return ar;
    }

    private static void findMinMax(int[] data){
        ar.setMin(data[0]);
        ar.setMax(data[0]);
        for(int d:data){
            if(ar.getMin() > d) ar.setMin(d);
            if(ar.getMax() < d) ar.setMax(d);
        }
    }

    private static void calculateMedian(int data[]){
        int len = data.length;
        for(int i = 0; i < len - 1; i++){
            for(int j = i; j < len - 1; j++){
                if(data[j] > data[j+1]) swap(data, j, j+1);
            }
        }
        if(len % 2 == 0){
            ar.setMedian((double)(data[len/2] + data[len/2 - 1])/2);
        }
        else{
            ar.setMedian(data[(len-1)/2]);
        }
    }

    private static int[] swap(int[] data, int x1, int x2){
        int temp = data[x1];
        data[x1] = data[x2];
        data[x2] = temp;
        return data;
    }
}