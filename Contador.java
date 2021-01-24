package Clase2;

public class Contador {

    int valor=0;

    public Contador(){}

    public Contador(int valor){

        this.valor=valor;
    }

    public Contador(Contador contador){

        this.valor=contador.getValor();
    }

    public void incrementar(){
        valor = valor++;
    }

    public void decrementar(){
        valor = valor--;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
