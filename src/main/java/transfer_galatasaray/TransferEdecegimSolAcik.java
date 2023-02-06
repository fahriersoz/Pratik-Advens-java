package transfer_galatasaray;

public class TransferEdecegimSolAcik extends SolAcik{

    public void sagAyak(){
        System.out.println("Sag Ayagini Kullanabilir");
    }

    int maas;
    int boy;
    String ulke;

    public TransferEdecegimSolAcik(){  // Istedigimiz kadar counter olusturabiliriz  ama data toplerinin farkli olmasi lazim
        super(27);
        System.out.println("Transfer edecegim sol acik`dan ===> bos");
    }


    public TransferEdecegimSolAcik(int maas){
        super(27);
        this.maas = maas;
        System.out.println("Transfer edecegim sol acik`dan ===>maas");

    }

    public TransferEdecegimSolAcik(int yas, int boy, String ulke){
        this.yas = yas;
        this.boy = boy;
        this.ulke = ulke;

    }




}
