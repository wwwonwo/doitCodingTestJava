public class Main {
    public static void main(String[] args) {

        String sNum = "1234";
        System.out.println(sNum);

        int i1 = Integer.parseInt(sNum);
        System.out.println(i1);

        int i2 = Integer.valueOf(sNum);
        System.out.println(i2);

        double d1 = Double.parseDouble(sNum);
        double d2 = Double.valueOf(sNum);

    }
}