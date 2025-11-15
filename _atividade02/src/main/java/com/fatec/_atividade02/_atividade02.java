/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec._atividade02;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class _atividade02 {

    public static void main(String[] args) {
        Aluno.Builder a1 = new Aluno.Builder();
        
        String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno: ");
        a1.setNome(nome);
        
        String nota0S = JOptionPane.showInputDialog("Digite a primeira nota do aluno: ");
        float nota0 = Float.parseFloat(nota0S);
        a1.setNota0(nota0);
        
        String nota1S = JOptionPane.showInputDialog("Digite a segunda nota do aluno: ");
        float nota1 = Float.parseFloat(nota1S);
        a1.setNota1(nota1);
        
        String nota2S = JOptionPane.showInputDialog("Digite a terceira nota do aluno: ");
        float nota2 = Float.parseFloat(nota2S);
        a1.setNota2(nota2);
        
        a1.build();
        
        a1.calcularMedia();
        float media = a1.getMedia();
        a1.avaliarStatus();
        String status = a1.getStatus();
        
        JOptionPane.showMessageDialog(null, "Aluno: " + a1.getNome() + "\n"
                                      + "Media: " + media + "\n"
                                      + "Status: " + status);
        
    }
}
