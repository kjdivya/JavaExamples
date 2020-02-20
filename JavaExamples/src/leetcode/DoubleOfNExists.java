package leetcode;

public class DoubleOfNExists {
    public static void main(String[] args) {
        DoubleOfNExists doubleN = new DoubleOfNExists();
        System.out.println(doubleN.checkIfExist(new int[]{0,0}));
    }
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j =0; j < arr.length ;j ++)
            {
                if( i != j && arr[j] == 2*arr[i])
                    return true;
            }
        }

        return false;
    }
}
