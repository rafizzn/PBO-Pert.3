package abstractProj;

public class main {
    public static void main(String[] args) {
        
        mobil obj1 = new mobil();
        System.out.println("Jumlah maksimum penumpang mobil adalah " + obj1);
        motor obj2 = new motor();
        System.out.println("Jumlah orang yang bisa naik motor adalah "+ obj2);
        trekFuso obj3 = new trekFuso();
        System.out.println("Hanya ada "+ obj3 +" yang bisa naik truk fuso");
    }
    
}
