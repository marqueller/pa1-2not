public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Declaração de variáveis:
        String sMsg1 = "Técnico em Informática";
        String sMsg2 = "Semestre";
        int ivalor1 = 2; // %d
        int ivalor2 = 1; // %d
        float fvalor1 = 58.700001f; // %f
        char cvalor1 = '%'; // %c
        boolean excelencia = true; // %b

        String sMsg3 = "Dúvidas???";
        String sMsg4 = "Por favor chamem!!";
        String sMsg5 = "Muito obrigado pela atenção";
        String sMsg6 = String.format("%s \n %s. \n \n %s", sMsg3, sMsg4, sMsg5);

        // Saída de dados para o usuário:
        System.out.println(sMsg6);
    }

}
