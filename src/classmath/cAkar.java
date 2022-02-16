package classmath;

public class cAkar {
    public static void main(String[] args){

        for(int a=1;a<12;a++){
            for(int i = 1; i<=a; i++){
                if((a%i*i) == 0){
                    int b=a/(i*i);
                    System.out.println(a);
                    System.out.println(i+"sqrt(" + b + ")");
                }
            }
        }
    }
}
