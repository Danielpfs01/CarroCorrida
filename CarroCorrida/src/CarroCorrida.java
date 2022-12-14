public class CarroCorrida {

    private int numeroCarro;
    private String piloto;
    private double velocidadeMax =200;
    private double velocidadeMin = 0;
    private boolean ligado = false;
    private double velocidadeAtual = 0;

    public CarroCorrida(
            String piloto, int numeroCarro, double v) {
    }

    //---------------------------------------------------------------------------------
    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado!!");
        } else {
            this.ligado = true;
            System.out.println("O Carro está ligado!!");
        }
    }

    //-----------------------------------------------------------------------------------
    public void desligar() {
        if (this.velocidadeAtual == 0) {
            if (this.ligado) {
                this.ligado = false;
                System.out.println("Desligamos o carro");
            } else {
                System.out.println("O carro já está desligado");
            }
        } else {
            System.out.println("O carro precisa estar parado para ligar");
        }
    }

    //-----------------------------------------------------------------------------------
    public void acelerar(double valorDeAceleracao) {
        if (this.ligado) {
            if (this.velocidadeMax < this.velocidadeAtual + valorDeAceleracao) {
                System.out.println("você não pode ultrapassar a velocidade máxima!");
                this.velocidadeAtual = this.velocidadeMax;
                System.out.println("O carro está à " + this.velocidadeAtual + " km/h");

            } else {
                this.velocidadeAtual += valorDeAceleracao;
                System.out.println("O carro está à " + this.velocidadeAtual + " km/h");
            }
        } else{
            System.out.println("Você não pode acelerar o carro desligado!");
            }

        }
//----------------------------------------------------------------------------------------
public void frear(double valorDeFrenagem){
    if (this.ligado) {
        if(this.velocidadeMin <= this.velocidadeAtual - valorDeFrenagem){
            this.velocidadeAtual -= valorDeFrenagem;
            if (this.velocidadeAtual == 0.0) {
                System.out.println("O carro está parado!");
            }else {
                System.out.println("O carro está a " + this.velocidadeAtual + " km/h.");
            }
        }else{
            this.velocidadeAtual = 0;
            System.out.println("O carro parou!");
        }
    } else {
        System.out.println("Você não pode frear um carro desligado!");
    }


}
//------------------------------------------------------------------------
    public void parar(){
        if (this.ligado) {
            if (this.velocidadeAtual > 0){
                this.velocidadeAtual = 0;
                System.out.println("O carro parou!!");

            } else {
                System.out.println("o carro já está parado!!");
            }
        }else{
            System.out.println("o carro está desligado e parado!");
            }
        }
//------------------------------------------
    }








