package transfer_galatasaray;

public class Sporcu {

    String brans;
    public void sporYap(){
        System.out.println("Spor Yapabilir..");
    }

    public Sporcu(){

    }

    public Sporcu(String brans){
        this.brans = brans;
        System.out.println("sporcudan ===> brans");


    }



}
