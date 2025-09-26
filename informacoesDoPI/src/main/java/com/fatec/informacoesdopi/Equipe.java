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
    private final String nome;
    private final String funcao;
    
    private Equipe(Builder builder){
        this.nome = builder.nome;
        this.funcao = builder.funcao;
    }
     
    public String getNome(){
        return nome;
    }
    public String getFuncao(){
        return funcao;
    }
    
    public static class Builder{
        private String nome;
        private String funcao;

        public Builder setNome(String nome){
            this.nome = nome;
            return this;
        }
        public Builder setFuncao(String funcao){
            this.funcao = funcao;
            return this;
        }
        
        public Equipe build(){
            return new Equipe(this);
        }
    }
    
    public void exibirEquipe(){
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.println("Funcao: " + funcao + "\n");
    }
    
}
