/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
public abstract class BubbleSorter{
    public void sort(String[] obs){
        for(int i = 0; i<3; i++){
            for(int j=0; j<2; j++){
                if(compare(obs[j],obs[j+1]) > 1){
                    String tmp = obs[j];
                    obs[j] = obs[j+1];
                    obs[j+1] = tmp;
                }

            }
        }
    }
    public abstract int compare(String A, String B) ;
}