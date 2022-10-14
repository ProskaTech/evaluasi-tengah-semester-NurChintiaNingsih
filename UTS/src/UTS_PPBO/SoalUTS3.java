/*
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package UTS_PPBO;
import javax.swing.JOptionPane;
public class SoalUTS3 {

	public static void main(String[] args) {
		
		String bilangan = "", message = "";
        int angka;
        System.out.println("Nama: Nur Chintia Ningsih");
		System.out.println("Nim: 21343011");
		System.out.println("==========================");

        bilangan = JOptionPane.showInputDialog("Masukkan Nilai : ");
        angka = Integer.parseInt(bilangan);

        if(angka >= 0) {
            message = angka + " merupakan bilangan POSITIF";
        }
        else if(angka < 0) {
            message = angka + " merupakan bilangan NEGATIF";
        }
        else{
            message = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
   

}


