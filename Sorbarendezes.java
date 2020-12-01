package sorbarendezes;

import java.util.Scanner;

public class Sorbarendezes {

    public static void main(String[] args) {
        Scanner bemenet;
        System.out.println("\nSORBARENDEZÉS TÉTELE (buborékos módszer)");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni? ");
        bemenet = new Scanner(System.in);
        int elemSzam=bemenet.nextInt();
        int[]szamok=new int[elemSzam];
        int negativ [] = new int [elemSzam*2];
        
        
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int)(Math.random()*100)-50;
        }
        System.out.println("\nTömb elemei:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
        for (int i = 0; i < elemSzam-1; i++) {
            for (int j = 0; j < elemSzam-i-1; j++) {
                if (szamok[j]>szamok[j+1]) {
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                }
            }
        }
        System.out.println("\nRendezett tömb:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
       int negativDb=0;
       
       for (int i = 0; i < elemSzam; i++) {
            if (szamok[i]<0) {
                negativ[negativDb++]=szamok[i];
                
            }
        }
       int negativOsszeg=0;
       System.out.print("\n\nNegatív számok növekvő sorrend szerint: ");
        
            if (negativDb > 0){
                for (int i = 0; i < negativDb-1; i++) {
                for (int j = 0; j < negativDb-i-1; j++) {
                if (szamok[j]>szamok[j+1]) {
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                }
            }
                    System.out.print(negativ[i]+" ");
                    negativOsszeg = negativOsszeg+negativ[i];
                }
            }
            
            
    }
    
}
