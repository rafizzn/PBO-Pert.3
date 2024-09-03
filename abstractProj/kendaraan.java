package abstractProj;

abstract class kendaraan {
    protected int kapasitasPenumpang;

    public kendaraan(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public abstract String toString();
}

