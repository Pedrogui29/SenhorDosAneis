public class Anao extends Habitante implements Mineiracao {

    private float altura;
    private String reino;

    @Override
    public void mostraInfo() {
        System.out.println("Informações anão");
        super.mostraInfo();
        System.out.println("Altura: "+ this.altura);
        System.out.println("Reino: "+ this.reino);
    }

    @Override
    public void atacar() {
        System.out.println("Anão atacou");
        super.atacar();
    }


    @Override
    public void mineirar() {
        System.out.println("O anão está mineirando");
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
