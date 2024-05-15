public class App {
    public static void main(String[] args) throws Exception {
        // delclaração de variaveis
        String sMsg1 = "Técnico Informática";
        String sMsg2 = "Semestre";
        int iValor1 = 2; // %d
        int iValor2 = 1; // %d
        float fValor1 = 58.700001f; // %f
        char cValor1 = '%'; // %c
        boolean bExcelencia = true; // %b

        // Saída de dados para usuário:
        System.out.print(sMsg1 + " ");
        System.out.println("Seja bem vindo!");
        System.out.println(sMsg1 + "" + " esta no " + sMsg2 + " " + iValor1 + " com " + fValor1 + cValor1 +
                " do cronograma.");
        System.out.format("%s esta no %s %d com %f %c do cronograma.", sMsg1, sMsg2, iValor1,
                fValor1, cValor1);
    }
}
