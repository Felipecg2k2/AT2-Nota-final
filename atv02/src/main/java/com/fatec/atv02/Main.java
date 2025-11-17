package com.fatec.atv02;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno:");
        
        ArrayList<Float> notas = new ArrayList<>();
        String[] tipos = {"TP1", "TP2", "TP3"};
        
        for (int i = 0; i < 3; i++) {
            String notaStr = JOptionPane.showInputDialog("Digite a nota " + tipos[i] + ":");
            notas.add(Float.parseFloat(notaStr));
        }
        
        Aluno aluno = new Aluno(nome, notas);
        aluno.calcularMedia();
        aluno.verificarDesempenho();
        
        String resultado = "Aluno: " + aluno.getNome() +
                         "\nNotas: TP1=" + notas.get(0) + ", TP2=" + notas.get(1) + ", TP3=" + notas.get(2) +
                         "\nMédia: " + String.format("%.2f", aluno.getMedia()) +
                         "\nDesempenho: " + aluno.getDesempenho();
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}