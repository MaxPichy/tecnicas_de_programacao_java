/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.informacoesdopi;

/**
 *
 * @author fatec-dsm2
 */
public class Equipe {
    private final String[][] membros;
    private final int linha;
        
    private Equipe(Builder builder){
        this.membros = builder.membros;
        this.linha = builder.linha;
    }
    
    public static class Builder{
        private String[][] membros = new String[5][2];
        private int linha = 0;
        
        public Builder setMembros(String nome, String funcao){
            if(linha >= membros.length){
                System.out.println("Quantidade maxima de membros atingida.");
            } else{
                this.membros[linha][0] = nome;
                this.membros[linha][1] = funcao;
                linha++;
            }
            
            return this;
        }
        
        public Equipe build(){
            return new Equipe(this);
        }
    }
    
    public void exibirEquipe(){
        for(int i = 0; i < linha; i++){
            if(membros[i][0] != null){
                System.out.println("Nome: " + membros[i][0]);
                System.out.println("Funcao: " + membros[i][1] + "\n");
            }
        }   
    }
}
