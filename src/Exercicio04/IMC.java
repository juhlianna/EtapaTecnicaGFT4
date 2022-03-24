package Exercicio04;

public class IMC {
    private double imc;
    private double altura;
    private double peso;

    public IMC(){
        this(0);
    }

    public IMC(double imc){
        this.imc = imc;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void entrarAltura(double valor){
        if(valor > 0){
            this.setAltura(valor);
        }
    }

    public void entrarPeso(double valor){
        if(valor > 0){
            this.setPeso(valor);
        }
    }

    public double calc(){
        return peso / (altura*altura);
    }

    public String verSituacao() {
        double valorImc = peso / (altura * altura);

        if (valorImc < 18.5) {
            return "Abaixo do peso.";
        } else if (valorImc >= 18.5 && valorImc <= 25) {
            return "Saudável.";
        } else if (valorImc >= 25 && valorImc <= 30) {
            return "Acima do peso.";
        } else if (valorImc >= 30 && valorImc <= 35) {
            return "Obesidade I";
        else{
            return "Cálculo inválido.";

        }
    }

}
