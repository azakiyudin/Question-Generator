package classmath;

public class cPolinom {
    public static String polinom = "";
    public static String a0(int pangkat,int listacak){
        int a0 = cAcak.rnd(listacak);
        if (a0!=0){
            polinom = cPangkat.a0(a0,pangkat);
            return polinom;
        } else {
            return a0(pangkat,listacak);
        }
    }
    public static String a02(int koefisien, int pangkat){
            polinom = cPangkat.a0(koefisien,pangkat);
            return polinom;
    }


    public static String polinomial(int pangkat) {
        if (pangkat> 0) {
            int an = cAcak.rnd(3);
            polinom += cPangkat.an(an, pangkat);
            return polinomial(pangkat-1);
        } else{
            int ann = cAcak.rnd(2);
            polinom += cPangkat.nol(ann);
            return polinom;
        }
    }
    public static String build(int pangkat, int listacak) {
        a0(pangkat,listacak);
        return polinomial(pangkat-1);
    }
    public static String build2(int koefisien, int pangkat) {
        a02(koefisien,pangkat);
        return polinomial(pangkat-1);
    }
}

