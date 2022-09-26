public class Mago extends Habitante implements Cura, Feitio {

    private String cor;

    @Override
    public void mostraInfo() {
        System.out.println("Informações do mago");
        super.mostraInfo();
        System.out.println("Cor: "+ this.cor);
    }


    @Override
    public void atacar() {
        System.out.println("Mago atacou");
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

    @Override
    public void lancaFeitico() {
        float energia = this.getEnergia();
        energia = (float)(energia-(energia*0.1));
        this.setEnergia(energia);
        System.out.println("O mago lancou um feitico");
        System.out.println("Energia atual: "+ this.getEnergia());

    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
