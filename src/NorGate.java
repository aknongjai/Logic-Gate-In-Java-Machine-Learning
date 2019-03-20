import static java.lang.Math.abs;

public class NorGate{
    static int n=2;
    static int x[][]={{1,0,0},{1,0,1,1},{1,1,0,1},{1,1,1,0}};
    static int z[]={1,1,1,0};
    static double w[]={0.3,0.1,0.1};
    static double c[]={0,0,0};
    static double th=0.5;
    static double s[]=new double[3];
    static double sum=0;
    //static double lrt=
    static void calC() {
        int n;
        int error[]=new int[9];
        double summm=999;
        while (summm==0){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    c[j] = x[i][j] * w[j];
                    System.out.println("c[" + j + "] issssssssssssss " + c[j]);
                    sum += c[j];
                }
                if (sum > th) {
                    n = 1;
                } else n = 0;
                error[i] = abs(z[i] - n);
                double corr = (0.1 * error[i]);
                for (int j = 0; j < n; j++) {
                    w[j] = w[j] + corr * x[i][j];
                    System.out.println("weight " + j + " iddsdsdsd " + w[j]);
                }
            }
            summm=0;
        for (int i=0;i<4;i++){
            summm+=error[i];
        }
        }
    }
    public static void main(String[]args){
        calC();
    }
}





/*All Rights Reserved
Nongjaimayum Annas khan
Husband of Ph Tabasum Sahani
*/