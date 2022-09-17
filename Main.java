public class Main {
    public static void main(String[]args) {
        Manusia m= new Manusia();

        m.setRambut("Ikal");
        System.out.println(m.getRambut());

        System.out.println(m.Memasak("Semur Tahu"));

        Telepon pt= new Telepon();

        pt.setKabel("Spiral");
        System.out.println(pt.getKabel());

        System.out.println(pt.terima_panggilan(true));
    }
}
