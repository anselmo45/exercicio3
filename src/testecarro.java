/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class testecarro {
     public static void main(String[] args) {
        
        carro c1 = new carro();
        c1.Marca = "fiat";
        c1.cor = "branco";
        c1.modelo = "passeio";
        
        carro c2 = new carro();
        c2.Marca = "ford";
        c2.cor = "preto";
        c2.modelo = "passeio";

        carro c3 = new carro();
        c3.Marca = "volvo";
        c3.cor = "branco";
        c3.modelo = "passeio";



        System.out.println("carro: " + c1.Marca);
        System.out.println("carro: " + c2.Marca);
        System.out.println("carro: " + c3.Marca);
        
     }   
}
