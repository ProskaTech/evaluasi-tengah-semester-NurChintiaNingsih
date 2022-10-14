/*
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package UTS_PPBO;
import java.util.Scanner;
public class SoalUTS2 {

	public static void main(String[] args) {		

				try (Scanner input = new Scanner(System.in)) {
					int n;
					
					System.out.println("Nama: Nur Chintia Ningsih");
					System.out.println("Nim: 21343011");
					System.out.println("==========================");
					System.out.println("Jumlah baris: ");
					n = input.nextInt();
					
					System.out.println();	
					
					for(int i=1; i<=n; i++) {
						for(int j=1; j<=i; j++) {
							System.out.print(" ");
						}
						for(int j=i; j<=n; j++) {
							System.out.print(" #");
						}
						System.out.println();
					}
					
					for(int i=1; i<=n; i++) {
						for(int j=i; j<=n; j++) {
							System.out.print(" ");
						}
						for(int j=1; j<=i; j++) {
							System.out.print(" *");
						}
						System.out.println();
					}
				}
			}

		}