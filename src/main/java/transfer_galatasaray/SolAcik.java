package transfer_galatasaray;

public class SolAcik extends Futbolcu{


    int yas;
    int bonservis;
    int boy;
    public void hizliKos(){
        System.out.println("Hizli Kosabilir...");
    }

    public SolAcik(){

    }

    public SolAcik(int yas){
        this(10000,177);
       // super("cek", 100000,350000, 177);
        this.yas = yas;

        System.out.println("Sol acikta`dan yas ==> Yas");

    }

    public SolAcik(int bonservis, int boy){
        super("cek");
        this.bonservis = bonservis;
        this.boy = boy;

        System.out.println("Sol aciktan`dan ==>  bonservis + boy");

    }




}
