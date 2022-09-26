public class Elfo extends Habitante implements Cura{


    private String tribo;

    public void viajar(){
        System.out.println(" O elfo esta viajando");
    }

    @Override
    public void mostraInfo() {
        System.out.println("informações elfo");
        super.mostraInfo();
        System.out.println("Tribo: "+ this.tribo);
    }

    @Override
    public void atacar() {
        System.out.println("Elfo atacou");
        super.atacar();

    }

    @Override
    public void curar() {
        float energia = this.getEnergia();
        energia = (float)(energia+(energia*0.15));
        this.setEnergia(energia);
        System.out.println("O heroi foi curado");
        System.out.println("Energia apos a cura: "+ this.getEnergia());

    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
