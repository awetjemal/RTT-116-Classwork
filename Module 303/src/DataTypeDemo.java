public class DataTypeDemo {
    public static void main(String[] args) {

        boolean b = false;
        System.out.println(b);

        int totalSeconds = 86399;
        int min = totalSeconds / 60;
        int sec = totalSeconds % 60;
        int hr = min/60;
        int mins = min % 60;
        System.out.println(hr + ":" + mins + ":" + sec);
        char ch = 'Z';
        System.out.println(ch);
        System.out.println("Floting point remainder: " + (3.6 % 0.55));
        System.out.println("5.0 / 2: " + (5.0/2));
        Integer kk = Integer.valueOf(123);
    }

}
