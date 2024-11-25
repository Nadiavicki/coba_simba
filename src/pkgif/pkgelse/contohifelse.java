
package pkgif.pkgelse;

import javax.swing.*;
public class contohifelse{
public static void main(String[] args){
String input=JOptionPane.showInputDialog("Masukan Nilai Akhir= ");
int na=Integer.valueOf(input);
if (na>=60)
System.out.println("Anda lulus ");
else
System.out.println("Anda Gagal");

}

}
