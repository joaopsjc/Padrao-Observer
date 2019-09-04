/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

/**
 *
 * @author ice
 */
public class main {
    public static void main(String[] args) {
        Revista revista = new Revista();
        Assinante assinante1 = new Assinante(revista);
        assinante1.setNome("ronaldo");
        Assinante assinante2 = new Assinante(revista);
        assinante2.setNome("ronaldinho");
        revista.setEdicao(3);
    }
}
