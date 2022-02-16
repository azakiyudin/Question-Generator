package classmath;

import static java.lang.Math.random;

public class cAcak {

    static int[] list1 = {-1,-2,-1,-2,-3,-3,-4,-4,-5,-5,-6,-6,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,8,9,10,11,12,13,14,15,16};
    static int[] list2 = {-10,-10,-9,-9,-8,-8,-7,-7,-6,-6,-5,-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,
                            3,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
    static int[] list3 = {-15,0,0,0,0,0,0,0,0,0,0,0,-15,-14,-14,-13,-13,-12,-12,-11,-11,-10,-10,-9,-9,-8,-8,-7,-7,-6,-6,-5,-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,
            3,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15};
    static int[] list4 = {1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,5,5};
    static int[] list5 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-2,-2,-2,-2,-2,-3,-3,-3,-4,-4,-4,-5,-5};
    static int[] list6 = {1,1,1,2,2,2,2,2,2,3,3,3};
    static int[] list7 = {1,1,1,2,2,2,2,2,2,3,3,3,4,4};
    static int[] list8 = {1,1,1,2,2,2,2,2,2,2,2,2};
    static int[] list9 = {-4,-4,-4,-3,-3,-3,-2,-2,-2,-2,-2,-2,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4};
    static int[] list10 = {-3,-3,-3,-3,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,3,3,3,3};
    static int[] list11 = {-5,-5,-4,-4,-4,-3,-3,-3,-3,-3,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5};
    static int ambil = 0;
    public static int rnd(int listacak){
        switch(listacak){
            case 1:
            ambil = (int) (random() * list1.length);
            return list1[ambil];
            case 2:
                ambil = (int) (random() * list2.length);
                return list2[ambil];
            case 3:
                ambil = (int) (random() * list3.length);
                return list3[ambil];
            case 4:
                ambil = (int) (random() * list4.length);
                return list4[ambil];
            case 5:
                ambil = (int) (random()*list5.length);
                return list5[ambil];
            case 6:
                ambil = (int) (random()*list6.length);
                return list6[ambil];
            case 7:
                ambil = (int) (random()*list7.length);
                return list7[ambil];
            case 8:
                ambil = (int)(random()*list8.length);
                return list8[ambil];
            case 9:
                ambil = (int)(random()*list9.length);
                return list9[ambil];
            case 10:
                ambil = (int)(random()*list10.length);
                return list10[ambil];
            case 11:
                ambil = (int)(random()*list11.length);
                return list11[ambil];
            default:
                ambil = (int) (random()*listacak);
                return ambil;
        }
    }
}
