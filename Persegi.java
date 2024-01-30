
package inheritance;

public class Persegi extends BangunDatar {
    double sisi;
    
    @Override
    double luas(){
        double hasil = sisi + sisi;
        System.out.println("Luas Persegi "
                + "= " + hasil);
        return hasil;
    }
    @Override
    double keliling(){
        double hasil = 4*sisi;
        System.out.println("Keliling Persegi"
                + "= " + hasil);
        return hasil;
    }
}
