//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
public class Shuffle {
    public static void main(String[] args) {

          int[] array = {1,2,3,4,5};
          shuffleArray(array);
          for(int element : array){
              System.out.print(element+" ");
          }
    }
    public static void shuffleArray(int[] array){
        int n = array.length;
        for(int i = n-1 ; i > 0 ; i--){
            // using random method to pickup number on the array shuffled
            int j = (int) (Math.random() * (i + 1));
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}