package abstractProj;

class motor extends kendaraan {
    
    public motor() {
        super(2);
    }

    @Override
    public String toString() {
        return String.valueOf(kapasitasPenumpang);
    }
}