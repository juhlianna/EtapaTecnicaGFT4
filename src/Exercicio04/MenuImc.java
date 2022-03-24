package Exercicio04;

public class MenuImc {
    private IMC imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;

    public MenuImc(){
        this.imc = new IMC();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }

    public void executarImc(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }
        while ( this.opcao != 0 );
    }

    private void executarMenuPrincipal(){
        String mensagemMenu = "Menu:" +
                "\n1 - Cadastrar Altura" +
                "\n2 - Cadastrar Peso" +
                "\n4 - Calcular IMC" +
                "\n0 - Sair" +
                "\n ";

        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }

    public void avaliarOpcaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntradaAltura = "Entre a altura";
                double valorEntradaAltura = conversor.stringToDouble(io.entradaDados(mensagemEntradaAltura));
                imc.entrarAltura(valorEntradaAltura);
                break;
            case 2:
                String mensagemEntradaPeso = "Entre o peso: ";
                double valorEntradaPeso = conversor.stringToDouble(io.entradaDados(mensagemEntradaPeso));
                imc.entrarPeso(valorEntradaPeso);
                break;
            case 3:
                String mensagemReceber = "Os valores inseridos são:" + "\n" +
                        "Altura: " + imc.getAltura() + "\n" +
                        "Peso: " + imc.getPeso();
                io.saidaDados(mensagemReceber);
                break;
            case 4:
                String mensagemCalculo = "O seu Imc é:" + "\n" + imc.calc();
                io.saidaDados(mensagemCalculo);
                break;
            case 5:
                io.saidaDados("Você está: " +
                        "\n" + imc.verSituacao());
                break;
            case 0:
                io.saidaDados("Finalizando programa");
                break;
            default:
                io.saidaDados("Opcao Inválida!");
                break;
        }
    }
}
