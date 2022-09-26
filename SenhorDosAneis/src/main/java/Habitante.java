public abstract  class Habitante {

    public static int contador = 0;
    private int id;
    private String nome;
    private int idade;
    private float energia;

    //Agregação
    Arma arma;


    Habitante(){
        contador++;
        id = contador;

    }

    public void atacar(){
        if(this.arma == null){
            System.out.println("Heroi esta sem arma");
        }
        else{
            System.out.println("Informações da arma");
            System.out.println("Nome: "+ arma.getNomeArma());
            System.out.println("Magica: "+arma.isMagica());

            if(arma.isMagica()){
                System.out.println("Ataque com arma magica");
                this.energia = this.energia-20;
                System.out.println("Energia apos o ataque: "+ this.energia);
            }
            else {
                System.out.println("Ataque com arma normal");
                this.energia = this.energia-10;
                System.out.println("Energia apos o ataque: "+ this.energia);
            }
        }
    }

    public void mostraInfo(){
        System.out.println();
        System.out.println("Id: "+ this.id);
        System.out.println("NOme" + this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Energia: "+ this.energia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
}
