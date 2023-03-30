import java.io.IOException;
import java.util.logging.*;
public class task1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("logTask1.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        System.out.printf("\n Первоначальный массив: \n");
        int [] array = {10, -56, 1, -9, 5, 33, 0, 15};
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}