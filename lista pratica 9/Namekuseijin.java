import java.util.HashMap;
import java.util.Map;

public class Namekuseijin extends PersonagemDragonBall {

  protected int quantidadeEsferas;
  protected boolean podeCurar;

  public Namekuseijin(
      String nome,
      int idade,
      String sexo,
      String temporada,
      double ki,
      String poderEspecial,
      int quantidadeEsferas,
      boolean podeCurar) {
    super(nome, idade, sexo, temporada, ki, poderEspecial);
    this.quantidadeEsferas = quantidadeEsferas;
    this.podeCurar = podeCurar;
  }

  @Override
  public String toString() {
    return "Namekuseijin [quantidadeEsferas="
        + quantidadeEsferas
        + ", podeCurar="
        + podeCurar
        + ", calcularPoder()="
        + calcularPoder()
        + ", getClass()="
        + getClass()
        + ", hashCode()="
        + hashCode()
        + ", toString()="
        + super.toString()
        + "]";
  }

  public double calcularPoder(){
    return ki * (1 + (podeCurar? 0.2 : 0));
    
  }
 public String fazerDesejo(String desejo) {
        Map<String, String> tradutor = new HashMap<>();
        tradutor.put("esferas", "horak");
        tradutor.put("para", "nok");
        tradutor.put("desejo", "lork");
        tradutor.put("de", "ga");
        tradutor.put("imortalidade", "vex");

        String[] palavras = desejo.split(" ");
        StringBuilder desejoTraduzido = new StringBuilder();
        for (String palavra : palavras) {
            desejoTraduzido.append(tradutor.getOrDefault(palavra, palavra)).append(" ");
        }
        return desejoTraduzido.toString().trim();
    }
}
