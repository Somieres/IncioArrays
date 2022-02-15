package cuentaBancaria;

public class Cuenta {


    // atributos

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;


    public Cuenta() {


    }


    // Constructor con los parametros

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {

        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Constructor copia
    public Cuenta(Cuenta cuenta) {

        this.nombreCliente = cuenta.getNombreCliente();
        this.numeroCuenta = cuenta.getNumeroCuenta();
        this.tipoInteres = cuenta.getTipoInteres();
        this.saldo = cuenta.getSaldo();
    }


    public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {

        return nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

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


    public boolean realizarIngreso(double cantidad) {


        boolean realizado;

        if (cantidad < 0) {

            realizado = false;

        } else{

         realizado = true;

        saldo = saldo + cantidad;
         }

        return realizado;
    }

    public boolean realizarReintegro(double cantidad) {

        boolean aceptada;

        if (saldo>0 && cantidad<=saldo && cantidad>0){
            aceptada=true;
            saldo=saldo-cantidad;
        }else{
            aceptada=false;
        }
        return aceptada;
    }

    public boolean realizarTransferencia(Cuenta cuentaDestino, double importe){

        boolean aceptada;

        if (saldo>=importe && importe>0){

            aceptada=true;

            cuentaDestino.saldo= cuentaDestino.saldo+importe;

            saldo=saldo-importe;
        }else {
            aceptada=false;
        }
            return aceptada;
    }
}
