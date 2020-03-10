import java.util.Scanner;

public class odev2 {
    public static void main(String args[]){
        int []sayi = new int[5];
        int temp = 0;

        Scanner console = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print((i+1)+". sayiyi gir:");
            sayi[i]=console.nextInt();
        }

        for(int j=0;j<5;j++){
            for(int k=1; k<5;k++){
                if (sayi[k-1] > sayi[k]){
                    temp=sayi[k];
                    sayi[k]=sayi[k-1];
                    sayi[k-1]=temp;
                }
            }
        }
        System.out.println("Sayilarin kucukten buyuge siralamasi:");
        for(int i=0;i<5;i++){
            System.out.print(sayi[i]+"\t");
        }
    }
}
