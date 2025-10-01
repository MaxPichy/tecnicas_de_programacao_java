/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.supermercado;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {
    private String[][] produto = new String[3][4];
    private int linha;
    
    private Produto(Builder builder){
        this.produto = builder.produto;
        this.linha = builder.linha;
    }

    public static class Builder{
        private String[][] produto = new String[3][4];
        private int linha = 0;
        
        public void setProduto(String nome, String preco, String quantidade, String codigo){
            if(linha > produto.length){
                System.out.println("Quantidade exigida de produtos atingida.");
            } else{
                this.produto[linha][0] = nome;
                this.produto[linha][1] = preco;
                this.produto[linha][2] = quantidade;
                this.produto[linha][3] = codigo;
                linha++;
            }
        }

        public Produto build(){
            return new Produto(this);
        }
    }
    
    public void exibirProduto(){        
        for(int i = 0; i < 3; i++){
            if(produto[i][0] != null){
                System.out.println("\n DETALHES DO PRODUTO " + (i + 1) + "\n");
                System.out.println("Nome: " + produto[i][0]);
                System.out.println("Preco: " + produto[i][1]);
                System.out.println("Quantidade: " + produto[i][2]);
                System.out.println("Codigo: " + produto[i][3]);
            }
        }
    }
}
