package cuentaBancaria;

public class Cuenta {


    // atributos

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;




    public Cuenta() {

        nombreCliente=" ";
        numeroCuenta=" ";
        tipoInteres= 0;
        saldo= 0;
    }


       // Constructor con los parametros

   public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){

        this.nombreCliente=nombreCliente;
        this.numeroCuenta=numeroCuenta;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;
    }



    public void setNombre (String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    public String getNombreCliente(){

        return nombreCliente;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    public String getNumeroCuenta(){
        return numeroCuenta;}

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double realizarIngreso(){
        double aporte=4000;

        saldo = saldo + aporte;
        return saldo;
    }
}
