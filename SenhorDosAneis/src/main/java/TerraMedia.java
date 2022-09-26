public class TerraMedia {

    private Habitante []herois = new Habitante[10];


    public void addHabitante(Habitante habitante){
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listaHabitantes(){

        for (int i = 0; i < herois.length; i++) {
            if(herois[i] != null){
             if(herois[i] instanceof Anao)  {
                 Anao auxAnao = (Anao)herois[i];
                 auxAnao.mostraInfo();
                 auxAnao.mineirar();
                 auxAnao.atacar();
             }
                else if(herois[i] instanceof Elfo)  {
                    Elfo auxElfo = (Elfo)herois[i];
                    auxElfo.mostraInfo();
                    auxElfo.viajar();
                    auxElfo.atacar();
                    auxElfo.curar();
                }
                else if(herois[i] instanceof Mago)  {
                    Mago auxMago = (Mago)herois[i];
                    auxMago.mostraInfo();
                    auxMago.lancaFeitico();
                    auxMago.atacar();
                    auxMago.curar();
                }

            }
        }












    }


}
