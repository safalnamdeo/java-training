public class newa {
    public static void main(String[] args) {
        int[] arr = {-1, 6, 0, 7, 4, 9};
        int index = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[index++] = arr[i];

            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                newArr[index++] = arr[j];
            }
        }

        for (int o = 0; o < arr.length; o++) {
            if (arr[o] > 0) {
                newArr[index++] = arr[o];
            }
        }
        for (int y = 0; y < newArr.length; y++) {
            System.out.println(newArr[y]);


        }

    }
}
