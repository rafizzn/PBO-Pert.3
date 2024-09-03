package abstractProj;

class mobil extends kendaraan {

    public mobil() {
        super(7);
    }

    @Override
    public String toString() {
        return String.valueOf(kapasitasPenumpang);
    }
}