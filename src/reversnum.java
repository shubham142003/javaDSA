public class reversnum {
    public static void main(String[] args) {
        int n =98754;
        int rver = 0;
        while (n>0){
            int rem = n % 10;
            n /= 10;
            rver = rver*10 +rem;
        }
        System.out.println(rver);
    }
}
