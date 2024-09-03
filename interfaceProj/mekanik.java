package interfaceProj;

class mekanik implements gantiOli,isiRadiator{

    public void gantiOli(String mobil, String motor){
        System.out.println("Mekanik sedang mengganti oli: " + mobil);
    }
    public void ngisiRadiator(String motor, String mobil){
        System.out.println("Mekanik sedang mengisi radiator:" +mobil);
    }
    

}
