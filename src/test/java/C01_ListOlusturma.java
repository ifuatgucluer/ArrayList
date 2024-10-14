import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturma {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6};
        String[] isimler = new String[5];
        // arr ve isimler'in data turu Arraydir.
        // int ve String bu array'lerin icine koyacagimiz data turudur.

        //List<String> metinler = new List();
        // 'List' is abstract; cannot be instantiated
        // List abstract bir yapı olduğundan direkt obje OLUŞTURULAMAZ

        List<String> harfler1 = new ArrayList<>();
        List<String> harfler2 = new ArrayList<String>();
        ArrayList<String> harfler3 = new ArrayList<>();

        // List<Integer> sayilar = new ArrayList<>();
// Type argument cannot be of primitive type
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar); // Prints: [4, 7, 9]

        sayilar.add(1,7);

        System.out.println(sayilar); // [4, 7, 7, 9]


        sayilar.add(0,2);

        System.out.println(sayilar); // [2, 4, 7, 7, 9]

    }
}
