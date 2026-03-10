import java.util.Scanner;

public class ProgramDonorDarahV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Seleksi Donor Darah (Versi 2) ===");
        System.out.print("Input usia: ");
        int usia = scanner.nextInt();

        System.out.print("Input berat badan (kg): ");
        float berat = scanner.nextFloat();

        System.out.print("Input kadar hemoglobin (g/dL): ");
        float hb = scanner.nextFloat();

        String status;
        String alasan;

        if (usia < 17) {
            status = "TIDAK LAYAK";
            alasan = "Usia belum memenuhi batas minimal 17 tahun.";
        } else {
            if (usia > 60) {
                status = "TIDAK LAYAK";
                alasan = "Usia melewati batas maksimal 60 tahun.";
            } else {
                if (berat < 45.0f) {
                    status = "TIDAK LAYAK";
                    alasan = "Berat badan di bawah 45.0 kg.";
                } else {
                    if (hb < 12.5f) {
                        status = "TIDAK LAYAK";
                        alasan = "Hemoglobin terlalu rendah (minimal 12.5 g/dL).";
                    } else {
                        if (hb > 17.0f) {
                            status = "TIDAK LAYAK";
                            alasan = "Hemoglobin terlalu tinggi (maksimal 17.0 g/dL).";
                        } else {
                            status = "LAYAK";
                            alasan = "Semua kriteria donor darah terpenuhi.";
                        }
                    }
                }
            }
        }

        System.out.println("\nHasil Seleksi: " + status);
        System.out.println("Keterangan  : " + alasan);

        scanner.close();
    }
}