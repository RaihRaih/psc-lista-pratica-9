
public class Terraqueo extends PersonagemDragonBall {
  protected String pais;
  protected String cidade;

  public Terraqueo(
      String nome,
      int idade,
      String string,
      String temporada,
      double ki,
      String poderEspecial,
      String pais,
      String cidade) {
    super(nome, idade, string, temporada, ki, poderEspecial);
    this.pais = pais;
    this.cidade = cidade;
  }

  @Override
  public double calcularPoder() {
    return ki;
  }

  @Override
  public String toString() {
    return "Terraqueo [pais="
        + pais
        + ", cidade="
        + cidade
        + ", getClass()="
        + getClass()
        + ", hashCode()="
        + hashCode()
        + ", toString()="
        + super.toString()
        + "]";
  }
  
}
