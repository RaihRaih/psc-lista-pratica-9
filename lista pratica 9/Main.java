public class Main {
    public static void main(String[] args) {
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();
        Terraqueo kuririn = PersonagemFactory.criarKuririn();

        System.out.println();
        System.out.println(goku);   
        System.out.println();
        System.out.println(gohan);
        System.out.println();
        System.out.println(dende);
        System.out.println();
        System.out.println(kuririn);

        // Evoluindo Goku para Super Sayajin 5
        goku.transformar(5);

        // Evoluindo Gohan para Super Sayajin 5 e, se não for possível, para nível 3
        gohan.transformar(5);
        if (gohan.calcularPoder() < gohan.ki * (1 + 5 * 0.1)) {
            gohan.transformar(3);
        }

        // Utilizando Dendê para fazer um pedido para as esferas do dragão
        String desejo = "quero esferas para desejo de imortalidade";
        System.out.println("Desejo traduzido: " + dende.fazerDesejo(desejo));
    }
}
