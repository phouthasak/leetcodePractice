public class Main {
    //runner class
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {0,1,2};
        int k = 1;

        rotateArray.rotate(input, k);
        for(int value : input) {
            System.out.println(value);
        }
    }
}
