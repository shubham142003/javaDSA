public class Fixedsizerc
{

    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4,5} ,
                {2,3},
                {2,3,7,8,9},
        };
        for (int row =0; row< arr.length; row++){
        for (int col =0; col< arr[row].length; col++) {
            System.out.print(arr[row][col]+" ");
        }
            System.out.println();
        }
        //Another way to print
        System.out.println("Another way to print multiDimention Array");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
