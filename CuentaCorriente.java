package Clase2;

public class CuentaCorriente {

    double saldo=0;
    String nombre;
    int id;


    public CuentaCorriente(){
    }

    public CuentaCorriente(double saldo, int id, String nombre){
        this.saldo=saldo;
        this.nombre=nombre;
        this.id=id;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.saldo= cuentaCorriente.getSaldo();
        this.nombre= cuentaCorriente.getNombre();
        this.id=cuentaCorriente.getId();
    }

    public void ingreso(double dinero){
        this.saldo = saldo+dinero;
    }

    public void egreso(double dinero){
        this.saldo = saldo-dinero;
    }

    public void reintegro (double dinero){
        this.saldo += dinero;
    }

    public void transferencia (double dinero){
        this.saldo -= dinero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta.ingreso(200);
        System.out.println(cuenta.getSaldo());
        cuenta.transferencia(50);
        System.out.println(cuenta.getSaldo());
    }
}
