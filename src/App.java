public class App {
    public static void main(String[] args) throws Exception {
        String sMsg1 = "Técnico Informática";
        String sMsg2 = "Semestre";
        int iValor1 = 2; // %d
        int iValor2 = 1; // %d
        float fValor1 = 58.700001f; // %f
        char cValor1 = '%'; // %c
        boolean bExcelência = true; // %b

        String sMsg3 = "Duvidas???";
        String sMsg4 = "Por favor chamem!!";
        String sMsg5 = "Muito obrigado pela atenção";
        String sMsg6 = String.format("%s \n %s.\n \n %s", sMsg3, sMsg4, sMsg5);

        // Saída de dados para o usuário:
        System.out.println(sMsg6);
    }
}