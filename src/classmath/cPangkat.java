package classmath;

public class cPangkat {
    public static String a0(int koefisien, int pangkat){
        if(pangkat!=1 && pangkat!= 0) {
            if (koefisien == 1) {
                return "x^" + pangkat;
            } else if (koefisien == -1) {
                return "-x^" + pangkat;
            } else if (koefisien == 0) {
                return "";
            } else {
                return koefisien + "x^" + pangkat;
            }
        } else if(pangkat==0){
            return Integer.toString(koefisien);
        } else{
            if (koefisien == 1) {
                return "x";
            } else if (koefisien == -1) {
                return "-x";
            } else if (koefisien == 0) {
                return "";
            } else {
                return koefisien + "x";
            }
        }
    }
    public static String an(int koefisien,int pangkat){
        if (pangkat!=1) {
            if (koefisien == 1) {
                return "+x^" + pangkat;
            } else if (koefisien == -1) {
                return "-x^" + pangkat;
            } else if (koefisien == 0) {
                return "";
            } else if (koefisien > 1) {
                return "+" + koefisien + "x^" + pangkat;
            } else {
                return koefisien + "x^" + pangkat;
            }
        } else {
            if (koefisien == 1) {
                return "+x";
            } else if (koefisien == -1) {
                return "-x";
            } else if (koefisien == 0) {
                return "";
            } else if (koefisien > 1) {
                return "+" + koefisien + "x";
            } else {
                return koefisien + "x";
            }
        }
    }
    public static String nol(int konstanta){
        if(konstanta>0){
            return "+"+konstanta;
        } else if(konstanta==0){
            return "";
        } else{
            return Integer.toString(konstanta);
        }
    }

}
