/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ice
 */
public class Assinante implements Observer{
    private String nome;

    public Assinante(Observable revistaObservada) {
        revistaObservada.addObserver(this);
    }
    public void update(Observable revistaSubject, Object arg1)
    {
        int edicaoNovaRevista;
        if(revistaSubject instanceof Revista)
        {
            Revista revista = (Revista) revistaSubject;
            edicaoNovaRevista = revista.getEdicao();
            System.out.println("Atenção " + getNome() + ", Já chegou mais uma "
                    + " edição da Revista. Esta é a sua edição número: " +
            edicaoNovaRevista);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
