public class KTP {
    private String nomorTelepon;
    private String[] tanggalLahir;

    public KTP() {
        this.nomorTelepon = "081234567890";
        this.tanggalLahir = new String[]{"01", "01", "1990"};
    }

    public KTP(String nomorTelepon, String[] tanggalLahir) {
        if (isValidNomorTelepon(nomorTelepon)) {
            this.nomorTelepon = nomorTelepon;
        } else {
            System.out.println("Nomor telepon tidak valid");
        }

        if (isValidTanggalLahir(tanggalLahir)) {
            this.tanggalLahir = tanggalLahir;
        } else {
            System.out.println("Tanggal lahir tidak valid");
        }
    }

    public boolean isValidNomorTelepon(String nomorTelepon) {
        if (nomorTelepon.charAt(0) != '0') {
            return false;
        }

        int length = nomorTelepon.length();
        return length >= 12 && length <= 13;
    }

    public boolean isValidTanggalLahir(String[] tanggalLahir) {
        int tanggal = Integer.parseInt(tanggalLahir[0]);
        int bulan = Integer.parseInt(tanggalLahir[1]);
        int tahun = Integer.parseInt(tanggalLahir[2]);

        if (tahun < 1900) {
            return false;
        }

        if (bulan == 2) {
            if (tanggal < 1 || tanggal > 28) {
                return false;
            }
        } else {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int maxTanggal = daysInMonth[bulan - 1];
            if (tanggal < 1 || tanggal > maxTanggal) {
                return false;
            }
        }

        return true;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        if (isValidNomorTelepon(nomorTelepon)) {
            this.nomorTelepon = nomorTelepon;
        } else {
            System.out.println("Nomor telepon tidak valid");
        }
    }

    public String[] getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String[] tanggalLahir) {
        if (isValidTanggalLahir(tanggalLahir)) {
            this.tanggalLahir = tanggalLahir;
        } else {
            System.out.println("Tanggal lahir tidak valid");
        }
    }

    public String toString() {
        return "KTP{" +
                "nomorTelepon='" + nomorTelepon + '\'' +
                ", tanggalLahir=" + Arrays.toString(tanggalLahir) +
                '}';
    }
}


public class KTP {
    private String nama, telefon;
    private String[] tgl_lhr;

    public KTP(String nama) {
        this.nama = nama;
        this.telefon = "088888888888"; // Telefon default
        this.tgl_lhr = new String[]{"31", "12", "2012"}; // Tanggal lahir default
    }

    public void setTelefon(String telefon) {
        if (TelefonValid(telefon)) {
            this.telefon = telefon;
            System.out.println("Pergantian No Telepon Berhasil");
        } else {
            System.out.println("Nomor Telepon tidak valid");
        }
    }

    public void setTgl_lhr(String[] tgl_lhr) {
        if (TglLhrValid(tgl_lhr)) {
            this.tgl_lhr = tgl_lhr;
            System.out.println("Pergantian Tanggal Lahir Berhasil!");
        } else {
            System.out.println("Tanggal Lahir tidak valid");
        }
    }

