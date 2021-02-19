public class Main {
    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        test.start();
        int[] array = new int[100000];
        for (int  i = 0;  i < array.length;  i++) {
            array[i] =i;
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = array[i];
                }
            }
        }
        test.end();
        System.out.println(test.getElapsedTime());
    }
}
