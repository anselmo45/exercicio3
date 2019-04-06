/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestarTV {
    
    public static void main(String[] args) {
        
        Tv TV1 = new Tv();
        TV1.Marca = "Panasonic";
        TV1.Tamanho = "32";
        TV1.Valor = 1000;
        
        Tv TV2 = new Tv();
        TV2.Marca = "AOC";
        TV2.Tamanho = "43";
        TV2.Valor = 1586;
        
        Tv TV3 = new Tv();
        TV3.Marca = "CCE";
        TV3.Tamanho = "50";
        TV3.Valor = 1900;


        System.out.println("Marca: " + TV1.Marca);
        System.out.println("Marca: " + TV2.Marca);
        System.out.println("Marca: " + TV3.Marca);
        
    }
    
}
