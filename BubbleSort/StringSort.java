/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
public class StringSort extends BubbleSorter{
    public StringSort(String[] string){
    }
    public int compare(String A, String B){
        int l1 = A.length();
        int l2 = B.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)A.charAt(i);
            int str2_ch = (int)B.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        // Edge case for strings like
        // String 1="Geeks" and String 2="Geeksforgeeks"
        if (l1 != l2) {
            return l1 - l2;
        }
  
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
    
}
