public class XmasTreeKadai {

public static void main(String args[]){
    int happa=20;
    int miki_yoko=6;
    int miki_tate=10;
    //String[] word = reader.split(" ");
    for(int i=1;i<=happa;i++){
        System.out.println("");
        for(int j=i;j<happa;j++){
            System.out.print("'");
        }
        if(happa!=0&&happa%2==0){
            for(int k=i*2;k>0;k--){
                System.out.print("*");
            }
        } 
        for(int j=i;j<happa;j++){
            System.out.print("'");
        }
    }

    System.out.println("");
    for(int i=1;i<=miki_tate;i++){
        for(int j=(happa-(miki_yoko/2));j>0;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=miki_yoko;k++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
