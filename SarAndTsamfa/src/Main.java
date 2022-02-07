public class Main {
    public static void main(String args[]) {
        Sar sa = new Sar(60, true, true);
        Tsamfa ts = new Tsamfa(71, true, 2);
        sa.setAngry(true);
        sa.setIrritable(true);
        System.out.println(sa.getScary());
        System.out.println(ts.getBald());
    }
}
