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
    private final String id;
    private final String nome;
    private final String descricao;
    
    private Apresentacao(Builder builder){
        this.id = builder.id;
        this.nome = builder.nome;
        this.descricao = builder.descricao;
    }
    
    public String getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public static class Builder{
        private String id;
        private String nome;
        private String descricao;
        
        public Builder setId(String id){
            this.id = id;
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
        
        public Apresentacao build(){
            return new Apresentacao(this);
        }
    }
    
    public void exibirApresentacao(){
        System.out.println("\n");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao + "\n");
    }
}
