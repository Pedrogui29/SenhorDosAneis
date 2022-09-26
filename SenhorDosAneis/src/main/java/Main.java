public class Main {
    public static void main(String[] args) {

        TerraMedia terra = new TerraMedia();

        Arma arma1 = new Arma();
        arma1.setNomeArma("Arco");
        arma1.setMagica(true);

        Arma arma2 = new Arma();
        arma2.setNomeArma("Espada");
        arma2.setMagica(false);

        Arma arma3 = new Arma();
        arma3.setNomeArma("Martelo");
        arma3.setMagica(false);


        Anao anao = new Anao();
        anao.setNome("Bruninho");
        anao.setEnergia(100);
        anao.setIdade(40);
        anao.setAltura(120);
        anao.setReino("Reino de digital");
        anao.arma = arma2;

       terra.addHabitante(anao);
       terra.listaHabitantes();

    }
}
