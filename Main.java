import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BST<Peserta> pesertaLomba = new BST<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Masukkan pilihan menu");
            System.out.println("1. Input data peserta lomba");
            System.out.println("2. Cari data");
            System.out.println("3. Pemenang lomba");
            System.out.println("4. Keluar");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan RT, nama dan nilai");
                    String RT = s.next(); s.nextLine();
                    String nama = s.next(); s.nextLine();
                    int nilai = s.nextInt();
                    pesertaLomba.insertNode(new Peserta(RT, nama, nilai));
                    break;
                case 2:
                    System.out.println("Masukkan RT, nama dan nilai yang dicari");
                    RT = s.next(); s.nextLine();
                    nama = s.next(); s.nextLine();
                    nilai = s.nextInt();
                    pesertaLomba.searchBST(new Peserta(RT, nama, nilai));
                    break;
                case 3:
                    System.out.println("Urutan peserta");
                    pesertaLomba.inOrder();
                    System.out.println("Pemenang");
                    pesertaLomba.displayWinner();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

        // pesertaLomba.insertNode(new Peserta("01", "rika", 78));
        // pesertaLomba.insertNode(new Peserta("03", "Yuri", 80));

        // pesertaLomba.inOrder();
    }
}
