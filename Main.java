package tugasakhir;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int menu;
        Scanner input=new Scanner(System.in);
        barang t2 = new barang();

        System.out.println("||================================||");
        System.out.println("||    THE JANSEN MARKET CASHIER   ||");
        System.out.println("||================================||");

        do{
            System.out.println("PILIH MENU : ");
            System.out.println("1. MASUKAN DATA BELANJA");
            System.out.println("2. PEMBAYARAN ");
            System.out.println("3. DAFTAR MEMBER");
            System.out.println("4. KELUAR");
            System.out.print("MASUKAN PILIHAN : ");
            menu=input.nextInt();
            if(menu==1){
                t2.Barang();
            }else if(menu==2){
                t2.totbar();

            }else if(menu==3){
                t2.member();
            }else if(menu==4){
                System.out.println("\n\t\t\t\tTERIMAKASIH !!!!");
            }else {
                System.out.println("\n\t\t\t\tDATA TIDAK DITEMUKAN");
            }
        }while(menu!=4);
    }
}