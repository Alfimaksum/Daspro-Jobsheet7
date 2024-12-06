public class ContohVariabel01 {

    /**
     * @param args
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        String HobiSaya = "Desain";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 19;
        double ipkSaya = 3.30, tinggi = 1.80;

        System.out.println(HobiSaya);
        System.out.println("apakah pandai" + isPandai);
        System.out.println("jenis kelamin" + jenisKelamin);
        System.out.println("IPK: " + ipkSaya);
        System.out.println(String.format(HobiSaya, args));

    
    }
} 