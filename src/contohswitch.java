
import javax.swing.JOptionPane;


public class contohswitch {
    public static void main(String[] args){
    String input=JOptionPane.showInputDialog("Masukan Nilai Akhir= ");
    int na=Integer.valueOf(input);
    int a;
    a=7;
    switch(a){
        case 0: System.out.println("Nilai a = 0");
        break;
        case 1: System.out.println("Nilai a = 1");
        break;
        case 2: System.out.println("Nilai a = 2");
        break;
        case 3: System.out.println("Nilai a = 3");
        break;
        case 4: System.out.println("Nilai a = 4");
        
        case 5: System.out.println("Nilai a = 5");
        break;
        case 6: System.out.println("Nilai a = 6");
        break;
        default : System.out.println("Nilai case tidak terpenuhi");
    }
    }
}
