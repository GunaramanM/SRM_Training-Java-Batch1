
public class SubSet {
    public static void main(String[] args) {
        String A1 = "Guna";
        int len = A1.length();
        int temp = 0;

        String arr[] = new String[len * (len + 1) / 2];

        for (int i = 0; i < len; i++) {

            for (int j = i; j < len; j++) {
                arr[temp] = A1.substring(i, j + 1);
                temp++;
            }
        }
        System.out.println("subsets for string : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
