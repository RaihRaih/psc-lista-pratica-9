public class Sayajin extends PersonagemDragonBall {

    protected int nivelMaximoSSJ;
    protected boolean temRabo;

    public Sayajin(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial,
            int nivelMaximoSSJ, boolean b) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = b;
    }
    
        @Override
    public String toString() {
        return "Sayajin [nivelMaximoSSJ=" + nivelMaximoSSJ + ", temRabo=" + temRabo + ", calcularPoder()="
                + calcularPoder() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

        @Override
        public double calcularPoder() {
        return ki * (1 + nivelMaximoSSJ * 0.1);
        }

        public void transformar(int nivel){

        }

    
    
}
