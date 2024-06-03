public abstract class PersonagemDragonBall {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String temporada;
    protected double ki;
    protected String poderEspecial;

    public PersonagemDragonBall(String nome, int idade, String string, String temporada, double ki, String poderEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = string;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }
    
    
    public abstract double calcularPoder();
    
    

}
