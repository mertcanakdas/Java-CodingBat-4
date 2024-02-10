
package codingbat_4; // sayı dizisinin uzunlugunun iki katı olan yeni bir dizi tanımlanır ve sayı dizisinin son elemanı aynı zamanda yeni dizinin son elamanı olcak sekilde atanır 

import java.util.Random;
import java.util.Arrays;


public class CodingBat_4 {
    
public static int [] Dizi(){
    Random rn = new Random();
    int []dizi = new int[rn.nextInt(10)+1];
    for(int i=0; i<dizi.length;i++){
        dizi[i] = rn.nextInt(10)+1;
        
    }
    
    return dizi;
}

public static int []makeLast(int []dizi){
    int[] makelast = new  int[dizi.length*2];
    makelast[makelast.length-1] = dizi[dizi.length-1];
    return makelast;
}


    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(Dizi())));
    }
    
}
