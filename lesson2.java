import java.util.*;

public class lesson2 {
    // int x;
    // Float y = 99f;
    // Integer y = 99;
    // String name = "Budi";
    // String name = "PRO_141079875";
    // String name = "hello world";

    int[] x = new int [4];
    // class Mahasiswa{

    // }

    
    public lesson2() {
        // x = Integer.parseInt("99999");
        // System.out.println(x);
        // System.out.println(y.MAX_VALUE);
        // System.out.println(name.equals("Kei"));
        // System.out.println(name.compareTo("Budi"));
        // System.out.println(name == "Budi");

        // System.out.println(name.substring(4, 6));
        // System.out.println(name.indexOf("world"));
        // System.out.println(name);

        x[0] = 9;
        System.out.println(x[0]);

        int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.println(x[i][j]);
            }
        }

        ArrayList<Integer> y = new ArrayList<Integer>();    
        y.add(7);
        y.add(5);
        y.add(4);
        y.add(90);
        // System.out.println(y.get(3));
        for(Integer n : y){ // for each
            System.out.println(n + " Size : " + y.size());
        }

        // HashMap<String, Integer> z = new HashMap<String, Integer>();
        // z.put("sfx", 99);
        // z.put("sdf", 88);
        // System.out.println(z.get("sfx"));

        // HashMap<Mahasiswa, Integer> z = new HashMap<Mahasiswa, Integer>();
        // Mahasiswa mhs1 = new Mahasiswa();
        // Mahasiswa mhs2 = new Mahasiswa();
        // z.put(mhs1, 99);
        // z.put(mhs2, 88);
        // System.out.println(z.get(mhs1));
    }

    public static void main(String[] args) {
        new lesson2();
    }
}
