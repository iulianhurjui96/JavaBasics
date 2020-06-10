package Sesion1;

import java.util.ArrayList;
import java.util.List;

public class MainPresentation {
    public static void main(String[] args) {

        String string = "Adrian";

        String[] vectors1 = new String[6];

        vectors1[1] = "10";
        vectors1[0] = "11";
        vectors1[2] = "12";

        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(14);
        list.add(11);
        list.add(15);
        list.add(18);

        int i = 0;
        while (i < list.size() && list.get(i) < 14) {
            System.out.println(list.get(i));
            i++;
        }

        Double[] vectors = new Double[6];

        vectors[1] = 10.00;
        vectors[0] = 11.00;
        vectors[2] = 12.00;

        int count = 0;


//        do {
//            System.out.println(list.get(i));
//            i++;
//        } while (i < list.size() && list.get(i) < 14)

        ;
//        for (int index = 0; index < vectors.length; i++) {
//            if (vectors[i] > 12) {
//                count++;
//            }
//        }

//        for (int vector : vectors
//             ) {
//            System.out.println(vector);
//        }

//        switch (count) {
//            case 1:
//                System.out.println("prima" + count);
//            case 2:
//                System.out.println("doua " + count);
//                break;
//            case 3:
//                System.out.println("treia");
//                break;
//            default:
//                System.out.println("nada");
//        }
    }
}
