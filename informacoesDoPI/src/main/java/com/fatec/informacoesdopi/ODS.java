/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.informacoesdopi;

/**
 *
 * @author fatec-dsm2
 */
public class ODS {
    private final int numero;
    private final String nome;
    private final String descricao;
    
    private ODS(Builder builder){
        this.numero = builder.numero;
        this.nome = builder.nome;
        this.descricao = builder.descricao;
    }
     
    public int getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public static class Builder{
        private int numero;
        private String nome;
        private String descricao;
        
        public Builder setNumero(int numero){
            this.numero = numero;
            return this;
        }
        public Builder setNome(String nome){
            this.nome = nome;
            return this;
        }
        public Builder setDescricao(String descricao){
            this.descricao = descricao;
            return this;
        }
        
        public ODS build(){
            return new ODS(this);
        }
    }
    
    public void exibirODS(){
        System.out.println("\n");
        System.out.println("Numero: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao + "\n");
    }
}