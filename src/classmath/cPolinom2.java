package classmath;
public class cPolinom2 {
    private String polinom = "";
    private int[] ano = new int[100];
    private int[] pngkt = new int[100];
    private int i = 1;

    //suku awal acak
    public String a0(int pangkat){
        int a0 = cAcak.rnd(1);
        if (a0!=0){
            polinom = cPangkat.a0(a0,pangkat);
            ano[0] = a0;
            pngkt[0] = pangkat;
            return polinom;
        } else {
            return a0(pangkat);
        }
    }
    //suku awal positif atau negatif
    public String a0(int pangkat, char bil){
        int a0 = cAcak.rnd(1);
        if(bil == '+') {
            if (a0 > 0) {
                polinom = cPangkat.a0(a0, pangkat);
                ano[0] = a0;
                pngkt[0] = pangkat;
                return polinom;
            } else {
                return a0(pangkat, bil);
            }
        } else if(bil == '-'){
            if (a0 < 0) {
                polinom = cPangkat.a0(a0, pangkat);
                ano[0] = a0;
                pngkt[0] = pangkat;
                return polinom;
            } else {
                return a0(pangkat, bil);
            }
        } else {
            return a0(pangkat);
        }
    }
    //suku awal ditentukan
    public String a0(int koefisien, int pangkat){
            polinom = cPangkat.a0(koefisien,pangkat);
            ano[0] = koefisien;
            pngkt[0] = pangkat;
            return polinom;
    }

    //suku kedua sampai suku terakhir
    public String polinomial(int pangkat) {
        if (pangkat> 0) {
            int an = cAcak.rnd(3);
            polinom += cPangkat.an(an, pangkat);
            ano[i] = an;
            pngkt[i] = pangkat;
            i++;
            return polinomial(pangkat-1);
        } else{
            int ann = cAcak.rnd(2);
            polinom += cPangkat.nol(ann);
            ano[i] = ann;
            pngkt[i] = pangkat;
            i++;
            return polinom;
        }
    }

    //mendapatkan nilai polinomial
    public String getPolinom(){
        return this.polinom;
    }
    //mendapatkan koefisien pangkat ke-n;
    public int getano(int pangkat){
        int pow = pngkt[pangkat];
        return ano[pow];
    }
    //constructor untuk random polinomial
    public cPolinom2(int pangkat){
        a0(pangkat);
        polinomial(pangkat - 1);
    }
    //constructor untuk random polinomial dengan suku awal positif atau negatif
    public cPolinom2(int pangkat, char bil){
        a0(pangkat, bil);
        polinomial(pangkat - 1);
    }
    //constructor untuk random polinomial dengan suku awal ditentukan
    public cPolinom2(int koefisien, int pangkat){
        a0(koefisien,pangkat);
        polinomial(pangkat-1);
    }
}

