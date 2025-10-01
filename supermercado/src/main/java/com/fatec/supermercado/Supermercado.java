/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.supermercado;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Supermercado {

    public static void main(String[] args) {
        Scanner insertion = new Scanner(System.in);
        Produto.Builder builderP = new Produto.Builder();
        Produto p = null;
        int i;
        
        for(i = 0; i < 3; i++){
            String nome, preco, quantidade, codigo;
            double precoDouble;
            int quantidadeInt;
            
            System.out.println("Digite o nome do produto " + (i + 1) + ":");
            nome = insertion.nextLine();
            
            System.out.println("Digite o preco do produto " + (i + 1) + ":");
            precoDouble = insertion.nextDouble();
            preco = String.format("%.2f", precoDouble);
            insertion.nextLine();
                    
            System.out.println("Digite a quantidade em estoque do produto " + (i + 1) + ":");
            quantidadeInt = insertion.nextInt();
            quantidade = String.valueOf(quantidadeInt);
            insertion.nextLine();
            
            System.out.println("Digite o codigo do produto " + (i + 1) + ":");
            codigo = insertion.nextLine();
            
            builderP.setProduto(nome, preco, quantidade, codigo);
            p = builderP.build();
        }
        
        p.exibirProduto();
    }
}
