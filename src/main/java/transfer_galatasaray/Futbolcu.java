package transfer_galatasaray;

public class Futbolcu extends Sporcu{

    public void  futbolOyna(){
        System.out.println("Futbol Oynayabilir...");
    }

    String ulke;
    int maas;
    int bonservis;
    int boy;

    public Futbolcu(){

    }

    public Futbolcu(String ulke){
        super("Futbolcu");
        this.ulke = ulke;
        System.out.println("Futbolcufan ulke");

    }

    public Futbolcu(int maas, int bonservis){
        this.maas = maas;
        this.bonservis = bonservis;

    }

    public Futbolcu(String ulke, int bonservis, int maas, int boy){
        super("Futbolcu");
        this.ulke = ulke;
        this.bonservis = bonservis;
        this.maas = maas;
        this.boy = boy;

        System.out.println("Futbolcudan ===> ulke + maas + bonservis + boy");


    }




}
