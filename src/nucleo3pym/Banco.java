/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nucleo3pym;

/**
 *
 * @author SEBASTIAN
 */
public class Banco extends Cliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        double totalCuenta;
        totalCuenta = cliente.saldo();
        System.out.println("-------------------------------------------------");
        
        System.out.println("Total actual en la cuenta: " + totalCuenta);
        System.out.println("-------------------------------------------------");
        
        double ingreso = 40000;
        System.out.println("Se ingresan en la cuenta: " + ingreso);
        cliente.depositar(ingreso);
        System.out.println("-------------------------------------------------");

        double retiro = 500;

        totalCuenta = cliente.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta);
        System.out.println("-------------------------------------------------");

        System.out.println("Se retiran de la cuenta: " + retiro);
        cliente.retirar(retiro);
        System.out.println("-------------------------------------------------");
        totalCuenta = cliente.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta);
        System.out.println("-------------------------------------------------");
    }
}
