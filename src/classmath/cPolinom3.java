package classmath;
import java.util.ArrayList;
public class cPolinom3 {
    private String polinom = "";
    private ArrayList<Integer> ano = new ArrayList<>();
    private ArrayList<Integer> pngkt = new ArrayList<>();

    //suku awal acak
    public String a0(String var, int pangkat){
        int a0 = cAcak.rnd(1);
        if (a0!=0){
            polinom = cPangkat2.a0(a0,pangkat,var);
            ano.add(a0);
            pngkt.add(pangkat);
            return polinom;
        } else {
            return a0(var, pangkat);
        }
    }
    //suku awal positif atau negatif
    public String a0(String var, int pangkat, char bil){
        int a0 = cAcak.rnd(1);
        if(bil == '+') {
            if (a0 > 0) {
                polinom = cPangkat2.a0(a0,pangkat,var);
                ano.add(a0);
                pngkt.add(pangkat);
                return polinom;
            } else {
                return a0(var, pangkat, bil);
            }
        } else if(bil == '-'){
            if (a0 < 0) {
                polinom = cPangkat2.a0(a0, pangkat,var);
                ano.add(a0);
                pngkt.add(pangkat);
                return polinom;
            } else {
                return a0(var, pangkat, bil);
            }
        } else {
            return a0(var, pangkat);
        }
    }
    //suku awal ditentukan
    public String a0(String var,int koefisien, int pangkat){
            polinom = cPangkat2.a0(koefisien,pangkat,var);
            ano.add(koefisien);
        pngkt.add(pangkat);
            return polinom;
    }

    //suku kedua sampai suku terakhir
    public String polinomial(String var, int pangkat) {
        if (pangkat> 0) {
            int an = cAcak.rnd(3);
            polinom += cPangkat2.an(an, pangkat, var);
            ano.add(an);
            pngkt.add(pangkat);
            return polinomial(var,pangkat-1);
        } else{
            int ann = cAcak.rnd(2);
            polinom += cPangkat2.nol(ann);
            ano.add(ann);
            pngkt.add(pangkat);
            return polinom;
        }
    }

    //mendapatkan nilai polinomial
    public String getPolinom(){
        return this.polinom;
    }
    //mendapatkan koefisien pangkat ke-n;
    public int getano(int pangkat){
        int pow = pngkt.get(pangkat);
        return ano.get(pow);
    }
    //constructor untuk random polinomial
    public cPolinom3(int pangkat){
        a0("x", pangkat);
        polinomial("x",pangkat - 1);
    }
    //constructor untuk random polinomial dengan suku awal positif atau negatif
    public cPolinom3(int pangkat, char bil){
        a0("x",pangkat, bil);
        polinomial("x",pangkat - 1);
    }
    //constructor untuk random polinomial dengan suku awal ditentukan
    public cPolinom3(int koefisien, int pangkat){
        a0("x",koefisien,pangkat);
        polinomial("x",pangkat-1);
    }
    public cPolinom3(String var, int pangkat){
        a0(var, pangkat);
        polinomial(var, pangkat-1);
    }
    public int derajat(){
        return pngkt.size();
    }
    public static void main(String[] args){
        cPolinom3 tes = new cPolinom3("x",4);
        System.out.println(tes.getPolinom());
        for(int i=0;i<tes.derajat();i++){
            System.out.println("pangkat ke-" +i+" = " + tes.getano(i));
        }
    }
}

