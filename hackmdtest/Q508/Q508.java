
class Q508{
    public static void main(String[] args){
        int[] arr = {2,4,3,5,7,6,9,1};

        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = i-1; j >= 0; j--){
                if(arr[i] < arr[j]) arr = swap(arr, i, j);
            }
            for(int a:arr){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}