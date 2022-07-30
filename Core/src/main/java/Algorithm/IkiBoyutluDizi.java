package Algorithm;

public class IkiBoyutluDizi {
    public static void main(String[] args) {
        //birim matris köşegenler=1, diğerleri=0 
        //olan matrisi ekrana yazdiran program
//        int[][]matris=new int[10][10];
//        for(int i=0;i<matris.length;i++)
//            for(int j=0;j<matris.length;j++)
//                if(i==j)matris[i][j]=1;
//                else matris[i][j]=0;
//               
//        for(int i=0;i<matris.length;i++)
//            for(int j=0;j<matris.length;j++)
//                if(i==matris.length-1-j) matris[i][j]=1;
//        
//        for(int i=0;i<matris.length;i++){
//            for(int j=0;j<matris.length;j++)
//                System.out.print(matris[i][j]+" ");
//            System.out.println("");
//        }


        //nxn boyutunda olusturulan matrisin toplamini bulan program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Satir sayisi: ");
//        int n_satir=scan.nextInt();
//        System.out.print("Sutun sayisi: ");
//        int n_sutun=scan.nextInt();
//        int[][]matris=new int[n_satir][n_sutun];
//        int toplam=0;
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                System.out.print("["+i+"]["+j+"] = ");
//                matris[i][j]=scan.nextInt();
//                toplam+=matris[i][j];
//            }
//        }
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                System.out.print(matris[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        System.out.println("Toplam: "+toplam);
        

        //Matristeki soldan saga köşegen hizada bulunan degerlerin toplami
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Satir sayisi: ");
//        int n_satir=scan.nextInt();
//        System.out.print("Sutun sayisi: ");
//        int n_sutun=scan.nextInt();
//        int[][]matris=new int[n_satir][n_sutun];
//        int toplam=0;
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                System.out.print("["+i+"]["+j+"] = ");
//                matris[i][j]=scan.nextInt();
//                if (i==j) toplam+=matris[i][j];
//            }
//        }
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                System.out.print(matris[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        System.out.println("Toplam: "+toplam);


        //Klavyeden girilen matrisin transpozunu alan program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Satir sayisi: ");
//        int n_satir=scan.nextInt();
//        System.out.print("Sutun sayisi: ");
//        int n_sutun=scan.nextInt();
//        
//        int[][]matris=new int[n_satir][n_sutun];
//        int[][]transpoz=new int[n_satir][n_sutun];
//        
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                System.out.print("["+i+"]["+j+"]= ");
//                matris[i][j]=scan.nextInt();
//             }
//        }
//        System.out.println("================");
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                System.out.print(matris[i][j]);
//            }
//            System.out.println("");
//        }
//        System.out.println("================");
//        for (int i = 0; i < n_satir; i++) {
//            for (int j = 0; j < n_sutun; j++) {
//                transpoz[i][j]=matris[j][i];
//                System.out.print(transpoz[i][j]);
//            }
//            System.out.println("");
//        }
    }
}
