package classmath;

public class cPecahan {
    public static int fpb(int pembilang, int penyebut){
        if(penyebut==0){
            return pembilang;
        } else{
            return fpb(penyebut,pembilang%penyebut);
        }
    }
    public static String simpel(int pembilang, int penyebut){
        int x,y,p,q;
        if(fpb(pembilang,penyebut) != penyebut) {
            if ((pembilang > 0 && penyebut > 0) || (pembilang < 0 && penyebut < 0)) {
                x = pembilang / fpb(pembilang, penyebut);
                y = penyebut / fpb(pembilang, penyebut);
                return "\\dfrac{" + x + "}{" + y + "}";
            } else if (pembilang<0 && penyebut>0){
                p = -pembilang;
                x = p / fpb(p, penyebut);
                y = penyebut / fpb(p, penyebut);
                return "-\\dfrac{" + x + "}{" + y + "}";
            } else {
                q = -penyebut;
                x = pembilang / fpb(pembilang, q);
                y = q / fpb(pembilang, q);
                return "-\\dfrac{" + x + "}{" + y + "}";
            }
        } else {
            x = pembilang/fpb(pembilang,penyebut);
            return Integer.toString(x);
        }
    }
    public static String simpel2(int pembilang, int penyebut){
        int x,y,p,q;
        if(fpb(pembilang,penyebut) != penyebut) {
            if ((pembilang > 0 && penyebut > 0) || (pembilang < 0 && penyebut < 0)) {
                x = pembilang / fpb(pembilang, penyebut);
                y = penyebut / fpb(pembilang, penyebut);
                return "+\\dfrac{" + x + "}{" + y + "}";
            } else if (pembilang<0 && penyebut>0){
                p = -pembilang;
                x = p / fpb(p, penyebut);
                y = penyebut / fpb(p, penyebut);
                return "-\\dfrac{" + x + "}{" + y + "}";
            } else {
                q = -penyebut;
                x = pembilang / fpb(pembilang, q);
                y = q / fpb(pembilang, q);
                return "-\\dfrac{" + x + "}{" + y + "}";
            }
        } else {
            x = pembilang / fpb(pembilang, penyebut);
            if(x>1){
                return "+" + x;
            }
            else if (x == 1) {
                return "+";
            } else if (x == -1) {
                return "-";
            } else {
                return Integer.toString(x);
            }
        }
    }
}
