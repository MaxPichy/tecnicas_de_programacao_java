/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.informacoesdopi;

/**
 *
 * @author fatec-dsm2
 */
public class Apresentacao {
    private final String[][] apresentacoes; 
    private final int linha;
    
    private Apresentacao(Builder builder){
        this.apresentacoes = builder.apresentacoes;
        this.linha = builder.linha;
    }
    
    public static class Builder{
        private String[][] apresentacoes = new String[20][3];
        private int linha = 0;
        
        public Builder setApresentacao(String id, String nome, String descricao){
            if(linha >= apresentacoes.length){
                System.out.println("Quantidade maxima de apresentacoes atingida.");
            }else{
                this.apresentacoes[linha][0] = id;
                this.apresentacoes[linha][1] = nome;
                this.apresentacoes[linha][2] = descricao;
                linha++;
            }
            
            return this;
        }
        
        public Apresentacao build(){
            return new Apresentacao(this);
        }
    }
    
    public void exibirApresentacao(){
        for(int i = 0; i < linha; i++){
            if(apresentacoes != null){
                System.out.println("ID: " + apresentacoes[i][0]);
                System.out.println("Nome: " + apresentacoes[i][1]);
                System.out.println("Descricao: " + apresentacoes[i][2] + "\n");
            }
        }
    }
}
