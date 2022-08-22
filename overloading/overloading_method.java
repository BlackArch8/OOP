package overiding;


class pertambahan{

    
    
    public static int tambah(int a, int b) {
        return (a + b);
    }
    public static double tambah(int a, double b) {
        return (a + b);
    }


}

public class overiding_method {
    public static void main(String[] args) {
        int a = pertambahan.tambah(1,2);
        System.out.println(a);
        double b = pertambahan.tambah(1,0.12);
        System.out.println(b);
        
    }

    
}
