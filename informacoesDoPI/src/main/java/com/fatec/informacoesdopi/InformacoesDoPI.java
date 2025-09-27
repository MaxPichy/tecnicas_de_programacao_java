/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.informacoesdopi;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class InformacoesDoPI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menuPrincipal;
        
        String idA, nomeA, descricaoA;
        Apresentacao.Builder builderA = new Apresentacao.Builder();
        Apresentacao a = null;
        
        String numeroO, nomeO, descricaoO;
        ODS.Builder builderO = new ODS.Builder();
        ODS o = null;
        
        String nomeE, funcaoE;
        Equipe.Builder builderE = new Equipe.Builder();
        Equipe e = null;
        
        do{
            System.out.println("Bem-vindo(a) a Apresentacao de PI - DSM2!!");
            System.out.println("Para adicionar nova Apresentacao, digite 1;");
            System.out.println("Para adicionar nova ODS, digite 2;");
            System.out.println("Para adicionar membros da Equipe, digite 3;");
            System.out.println("Para exibir a Apresentacao, ODS e Equipe de PI completa digite 4;");
            System.out.println("Para sair, digite 5;");
            
            String menuP = entrada.nextLine();
            menuPrincipal = Integer.parseInt(menuP);
            

            switch (menuPrincipal){
                case 1 -> {
                    int menuApresentacao;
                  
                    do{
                        System.out.println("Bem-vindo(a) a Apresentacao!");
                        System.out.println("Para adicionar apresentacao, digite 1;");
                        System.out.println("Para exibir apresentacoes, digite 2;");
                        System.out.println("Para sair, digite 3;");
                        
                        String menuA = entrada.nextLine();
                        menuApresentacao = Integer.parseInt(menuA);
                        
                        switch(menuApresentacao){
                            case 1 -> {
                                System.out.println("Digite o id: ");
                                idA = entrada.nextLine();
                                
                                System.out.println("Digite o nome: ");
                                nomeA = entrada.nextLine();
                                
                                System.out.println("Digite uma descricao: ");
                                descricaoA = entrada.nextLine();
                                
                                builderA.setApresentacao(idA, nomeA, descricaoA);
                                
                                break;
                            }

                            case 2 -> {
                                a = builderA.build();
                                a.exibirApresentacao();
                                break;
                            }
                            
                            case 3 -> {
                                break;
                            }

                            default -> {
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        } 

                    } while(menuApresentacao != 3);

                    break;
                }

                case 2 -> {
                    int menuODS;
                                            
                    do{
                        System.out.println("Bem-vindo(a) a ODS!");
                        System.out.println("Para adicionar nova ODS, digite 1;");
                        System.out.println("Para exibir ODS, digite 2;");
                        System.out.println("Para sair, digite 3;");
                        
                        String menuO = entrada.nextLine();
                        menuODS = Integer.parseInt(menuO);

                        switch(menuODS){
                            case 1 -> {
                                System.out.println("Digite o numero: ");
                                numeroO = entrada.nextLine();
                                
                                System.out.println("Digite o nome: ");
                                nomeO = entrada.nextLine();
                                
                                System.out.println("Digite a descricao: ");
                                descricaoO = entrada.nextLine();
                                
                                builderO.setODS(numeroO, nomeO, descricaoO);
                                break;
                            }

                            case 2 -> {
                                o = builderO.build();
                                o.exibirODS();
                                break;
                            }
                            
                            case 3 -> {
                                break;
                            }

                            default -> {
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        } 

                    } while(menuODS != 3);
                    
                    break;
                }

                case 3 -> {
                    int menuEquipe;
                                           
                    do{
                        System.out.println("Bem-vindo(a) a Equipe!");
                        System.out.println("Para criar novo membro, digite 1;");
                        System.out.println("Para exibir Equipe, digite 2;");
                        System.out.println("Para sair, digite 3;");
                        
                        String menuE = entrada.nextLine();
                        menuEquipe = Integer.parseInt(menuE);

                        switch(menuEquipe){  
                            case 1 -> {
                                System.out.println("Digite o nome: ");
                                nomeE = entrada.nextLine();
                                
                                System.out.println("Digite a funcao: ");
                                funcaoE = entrada.nextLine();
                                
                                builderE.setMembros(nomeE, funcaoE);
                                
                                break;
                            }

                            case 2 -> {
                                e = builderE.build();
                                e.exibirEquipe();
                                break;
                            }
                            
                            case 3 -> {
                                break;
                            }

                            default -> {
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        } 

                    } while(menuEquipe != 3);
                    
                    break;
                }
                
                case 4 -> {
                    if(a != null){
                        System.out.println("Apresentacao: \n");
                        a.exibirApresentacao();
                    } else{
                        System.out.println("Nao ha apresentacao adicionada. \n");
                    }
                    if(o != null){
                        System.out.println("ODS: \n");
                        o.exibirODS();
                    }else{
                        System.out.println("Nao ha ODS adicionada. \n");
                    }
                    if(e != null){
                        System.out.println("Equipe: \n");
                        e.exibirEquipe();
                    }else{
                        System.out.println("Nao ha membros na Equipe. \n");
                    }
                    
                    break;
                }
                
                case 5 -> {
                    break;
                }

                default -> {
                    System.out.println("\n Opcao Invalida! \n");
                    break;
                }
            }
            
        } while(menuPrincipal != 5);
    }
}
   
