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
        
        String idA;
        String nomeA;
        String descricaoA;
        Apresentacao.Builder builderA = new Apresentacao.Builder();
        Apresentacao a = null;
        
        String converterNumero;
        int numeroO;
        String nomeO;
        String descricaoO;
        ODS.Builder builderO = new ODS.Builder();
        ODS o = null;
        
        String nomeE;
        String funcaoE;
        Equipe.Builder builderE = new Equipe.Builder();
        Equipe e = null;
        
        do{
            System.out.println("Bem-vindo(a) a Apresentacao de PI - DSM2!!");
            System.out.println("Para inserir nova Apresentacao, digite 1;");
            System.out.println("Para inserir nova ODS, digite 2;");
            System.out.println("Para inserir nova Equipe, digite 3;");
            System.out.println("Para exibir a Apresentacao, ODS e Equipe de PI completa digite 4;");
            System.out.println("Para sair, digite 5;");
            
            String menuP = entrada.nextLine();
            menuPrincipal = Integer.parseInt(menuP);
            

            switch (menuPrincipal){
                case 1 -> {
                    int menuApresentacao;
                  
                    do{
                        System.out.println("Bem-vindo(a) a Apresentacao!");
                        System.out.println("Para criar novo id, digite 1;");
                        System.out.println("Para criar novo nome, digite 2;");
                        System.out.println("Para criar nova descricao, digite 3;");
                        System.out.println("Para exibir Apresentacao, digite 4;");
                        System.out.println("Para sair, digite 5;");
                        
                        String menuA = entrada.nextLine();
                        menuApresentacao = Integer.parseInt(menuA);
                        
                        switch(menuApresentacao){
                            case 1 -> {
                                System.out.println("Digite o id: ");
                                idA = entrada.nextLine();
                                builderA.setId(idA);
                                break;
                            }

                            case 2 -> {
                                System.out.println("Digite o nome: ");
                                nomeA = entrada.nextLine();
                                builderA.setNome(nomeA);
                                break;
                            }

                            case 3 -> {
                                System.out.println("Digite a descricao: ");
                                descricaoA = entrada.nextLine();
                                builderA.setDescricao(descricaoA);
                                break;
                            }

                            case 4 -> {
                                a = builderA.build();
                                a.exibirApresentacao();
                                break;
                            }
                            
                            case 5 -> {
                                break;
                            }

                            default -> {
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        } 

                    } while(menuApresentacao != 5);

                    break;
                }

                case 2 -> {
                    int menuODS;
                                            
                    do{
                        System.out.println("Bem-vindo(a) a ODS!");
                        System.out.println("Para criar novo numero, digite 1;");
                        System.out.println("Para criar novo nome, digite 2;");
                        System.out.println("Para criar nova descricao, digite 3;");
                        System.out.println("Para exibir ODS, digite 4;");
                        System.out.println("Para sair, digite 5;");
                        
                        String menuO = entrada.nextLine();
                        menuODS = Integer.parseInt(menuO);

                        switch(menuODS){
                            case 1 -> {
                                System.out.println("Digite o numero: ");
                                converterNumero = entrada.nextLine();
                                numeroO = Integer.parseInt(converterNumero);
                                builderO.setNumero(numeroO);
                                break;
                            }

                            case 2 -> {
                                System.out.println("Digite o nome: ");
                                nomeO = entrada.nextLine();
                                builderO.setNome(nomeO);
                                break;
                            }

                            case 3 -> {
                                System.out.println("Digite a descricao: ");
                                descricaoO = entrada.nextLine();
                                builderO.setDescricao(descricaoO);
                                break;
                            }

                            case 4 -> {
                                o = builderO.build();
                                o.exibirODS();
                                break;
                            }
                            
                            case 5 -> {
                                break;
                            }

                            default -> {
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        } 

                    } while(menuODS != 5);
                    
                    break;
                }

                case 3 -> {
                    int menuEquipe;
                                           
                    do{
                        System.out.println("Bem-vindo(a) a Equipe!");
                        System.out.println("Para criar novo nome, digite 1;");
                        System.out.println("Para criar nova funcao, digite 2;");
                        System.out.println("Para exibir Equipe, digite 3;");
                        System.out.println("Para sair, digite 4;");
                        
                        String menuE = entrada.nextLine();
                        menuEquipe = Integer.parseInt(menuE);

                        switch(menuEquipe){
                            case 1 -> {
                                System.out.println("Digite o nome: ");
                                nomeE = entrada.nextLine();
                                builderE.setNome(nomeE);
                                break;
                            }

                            case 2 -> {
                                System.out.println("Digite a funcao: ");
                                funcaoE = entrada.nextLine();
                                builderE.setFuncao(funcaoE);
                                break;
                            }

                            case 3 -> {
                                e = builderE.build();
                                e.exibirEquipe();
                                break;
                            }
                            
                            case 4 -> {
                                break;
                            }

                            default -> {
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        } 

                    } while(menuEquipe != 4);
                    
                    break;
                }
                
                case 4 -> {
                    if(a != null){
                        System.out.println("\n Apresentacao: \n");
                        a.exibirApresentacao();
                    } else{
                        System.out.println("\n Nao ha apresentacao criada. \n");
                    }
                    if(o != null){
                        System.out.println("\n ODS: \n");
                        o.exibirODS();
                    }else{
                        System.out.println("\n Nao ha ODS criada. \n");
                    }
                    if(e != null){
                        System.out.println("\n Equipe: \n");
                        e.exibirEquipe();
                    }else{
                        System.out.println("\n Nao ha Equipe criada. \n");
                    }
                    
                    break;
                }
                
                case 5 -> {
                    break;
                }

                default -> {
                    System.out.println("Opcao Invalida!");
                    break;
                }
            }
            
        } while(menuPrincipal != 5);
    }
}
   
