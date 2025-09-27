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
    private final String[][] ods;
    private final int linha;
    
    private ODS(Builder builder){
        this.ods = builder.ods;
        this.linha = builder.linha;
    }
    
    public static class Builder{
        private String[][] ods = new String[17][3];
        private int linha = 0;
        
        public Builder setODS(String numero, String nome, String descricao){
            if(linha >= ods.length){
                System.out.println("Quantidade maxima de ods atingida.");
            } else{
                this.ods[linha][0] = numero;
                this.ods[linha][1] = nome;
                this.ods[linha][2] = descricao;
                linha++;
            }
                        
            return this;
        }
        
        public ODS build(){
            return new ODS(this);
        }
    }
    
    public void exibirODS(){
        for(int i = 0; i < linha; i++){
            if(ods != null){
                System.out.println("Numero: " + ods[i][0]);
                System.out.println("Nome: " + ods[i][1]);
                System.out.println("Descricao: " + ods[i][2] + "\n");
            }
        } 
    }
}