public class isAnagram {
    public static void main(String[] args) {
System.out.println(isAnargam("Hello", "hello"));
// System.out.println(sortCharacters("nullify"));;
    }

    public static boolean isAnargam(String a, String b) {
        a= a.toLowerCase();
        b= b.toLowerCase();
        if (sortCharacters(b).equals(sortCharacters(a))){
            return true;
        }

        return false;
    }
    public static String sortCharacters(String s ){
        char arr[] = s.toCharArray();
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        return String.valueOf(arr);
    }

}