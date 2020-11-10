public class Main {
    public static <T> void genMethod (T val1, T val2) {
        System.out.println(val1.toString()+' '+val2.toString());
        T t = val1;
        val1 = val2;
        val2 = t;
        System.out.println(val1.toString()+' '+val2.toString());
    }
    public static void main (String args[]) {
        System.out.println(new Gen<Integer>(Integer.valueOf(10)).toString());
        System.out.println(new Gen<Double>(10.5).toString());
        Integer v1 = 10;
        Integer v2 = 20;
        genMethod(v1, v2);
    }
}
