public class p2 {
    static int countOccurrences(String str, String word) {
        // split the string by spaces in a
        String a[] = str.split(" ");
        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word = "portal";
        System.out.println(countOccurrences(str, word));
    }
}