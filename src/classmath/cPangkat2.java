package classmath;

public class cPangkat2 {
    public static String a0(int koefisien, int pangkat,String var){
        if(pangkat!=1 && pangkat!= 0) {
            if (koefisien == 1) {
                return var + "^" + pangkat;
            } else if (koefisien == -1) {
                return "-" + var +"^" + pangkat;
            } else if (koefisien == 0) {
                return "";
            } else {
                return koefisien + var + "^" + pangkat;
            }
        } else if(pangkat==0){
            return Integer.toString(koefisien);
        } else{
            if (koefisien == 1) {
                return String.valueOf(var);
            } else if (koefisien == -1) {
                return "-"+var;
            } else if (koefisien == 0) {
                return "";
            } else {
                return koefisien + var;
            }
        }
    }
    public static String an(int koefisien,int pangkat, String var){
        if (pangkat!=1) {
            if (koefisien == 1) {
                return "+"+var+"^" + pangkat;
            } else if (koefisien == -1) {
                return "-"+var+"^" + pangkat;
            } else if (koefisien == 0) {
                return "";
            } else if (koefisien > 1) {
                return "+" + koefisien + var + "^" + pangkat;
            } else {
                return koefisien + var +"^" + pangkat;
            }
        } else {
            if (koefisien == 1) {
                return "+" +var;
            } else if (koefisien == -1) {
                return "-" +var;
            } else if (koefisien == 0) {
                return "";
            } else if (koefisien > 1) {
                return "+" + koefisien + var;
            } else {
                return koefisien + var;
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
