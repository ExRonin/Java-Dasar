/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ujian4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tabungan;
        tabungan =7500000;
        int bunga;
        if (tabungan<1000001) {
            bunga = tabungan * 15/10000;
            System.out.println("Bunga anda = " +bunga) ;
        } else if ( tabungan<5000000) {
            bunga = tabungan * 56/10000;
            System.out.println("Bunga anda =" + bunga) ;
        } else if (tabungan<10000000) {
            bunga = tabungan * 12/100;
            System.out.println("Bunga anda =" + bunga) ;
        } else if (tabungan<10000000) {
            bunga = tabungan * 50/100;
            System.out.println("Bunga anda =" + bunga) ;
        }
        
    }
    
}
