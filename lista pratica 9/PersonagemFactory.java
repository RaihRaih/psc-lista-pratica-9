public class PersonagemFactory {
  public static Terraqueo criarKuririn() {
    return new Terraqueo(
        "Kuririn", 35, "Masculino", "Dragon Ball Z", 2000, "Kienzan", "Japao", "Cidade do Oeste");
  }

  public static Sayajin criarGoku() {
    return new Sayajin("Goku", 40, "Masculino", "Dragon Ball Super", 30000, "Kamehameha", 3, true);
  }

  public static Sayajin criarGohan() {
    return new Sayajin("Gohan", 23, "Masculino", "Dragon Ball Super", 25000, "Masenko", 2, true);
  }

  public static Namekuseijin criarDende() {
    return new Namekuseijin("Dendê", 200, "Masculino", "Dragon Ball Z", 1500, "Curar", 0, false);
  }
}
