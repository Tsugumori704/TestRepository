
public class Task06 {
    public static void main (String[] args){
        int s = 0;
        int n = 0;
        for (int i = 10_000_000; i < 100_000_000 ; i++){
            int[] numb = new int[8];
            if (i % 12345 == 0){

                int mynumb = i;

                for (int j: numb) {
                    numb[n]  = mynumb % 10;
                    mynumb /= 10;
                    n++;
                }
                n = 0;
                boolean reiteration = true;
                for (int n1 = 0 ; n1 < 8 ; n1++){
                    for (int n2 = n1 ; n2 < 8 ; n2++){
                        if (n1 != n2 && numb[n1] == numb[n2]){
                            reiteration = false;
                            break;
                        }
                    }
                }

                if (reiteration){
                    System.out.print(i + " ");
                    s++;
                }

                if (s == 20){
                    System.out.println();
                    s = 0;
                }
            }






        }
    }
}
