/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestarAntenas {
    public static void main(String[] args) {
        Antenas a1 = new Antenas();
        a1.Nome = "Sky";
        a1.Tamanho = 45;
        a1.valor = 300;
        
        Antenas a2 = new Antenas();
        a2.Nome = "Oi";
        a2.Tamanho = 45;
        a2.valor = 300;
        
        Antenas a3 = new Antenas();
        a3.Nome = "Claro";
        a3.Tamanho = 45;
        a3.valor = 300;
        
        System.out.println("nome: " + a1.Nome);
        System.out.println("nome: " + a2.Nome);
        System.out.println("nome: " + a3.Nome);
        
        
    }
}
