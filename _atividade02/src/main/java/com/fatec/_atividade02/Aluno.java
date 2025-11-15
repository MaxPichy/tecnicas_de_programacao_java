/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec._atividade02;

/**
 *
 * @author fatec-dsm2
 */
public class Aluno {
    private final String nome;
    private final float[] nota = new float[3];
    private final float media;
    private final String status;
    
    private Aluno(Builder builder){
        this.nome = builder.nome;
        this.nota[0] = builder.nota[0];
        this.nota[1] = builder.nota[1];
        this.nota[2] = builder.nota[2];
        this.media = builder.media;
        this.status = builder.status;
    }
    
    public static class Builder{
        private String nome;
        private float[] nota = new float[3];
        private float media;
        private String status;
        
        public Builder setNome(String nome){
            this.nome = nome;
            return this;
        }
        public Builder setNota0(float nota0){
            this.nota[0] = nota0;
            return this;
        }
        public Builder setNota1(float nota1){
            this.nota[1] = nota1;
            return this;
        }
        public Builder setNota2(float nota2){
            this.nota[2] = nota2;
            return this;
        }
        public Builder calcularMedia(){
            this.media = (nota[0] + nota[1] + nota[2]) / 3;
            return this;
        }
        public Builder avaliarStatus(){
            String status;
            
            if(media < 6){
                status = "Reprovado";
            } else if(media >= 6 && media < 9){
                status = "Aprovado";
            } else if(media > 9){
                status = "Ótimo Aproveitamento";
            } else{
                status = "Desempenho inválido";
            }
            
            this.status = status;
            return this;
        }
        
        public String getNome(){
            return nome;
        }
        public float getNota0(){
            return nota[0];
        }
        public float getNota1(){
            return nota[1];
        }
        public float getNota2(){
            return nota[2];
        }
        public float getMedia(){
            return media;
        }
        public String getStatus(){
            return status;
        }
        
        public Aluno build(){
            return new Aluno(this);
        }
    }
}
