/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
public class BubbleSortStation{
    public static void main(String[] args){
        String[] obs = new String[3];
        obs[0] = "chutikarn";
        obs[1] = "kanokgorn";
        obs[2] = "cn332";
        StringSort stringSort = new StringSort(obs);
        stringSort.sort(obs);
        System.out.println(obs[0]);
        System.out.println(obs[1]);
        System.out.println(obs[2]);
    }

}
