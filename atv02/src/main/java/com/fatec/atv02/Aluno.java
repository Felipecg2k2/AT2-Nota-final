package com.fatec.atv02;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Float> notas;
    private float media;
    private String desempenho;
    
    public Aluno(String nome, ArrayList<Float> notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    public void calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        this.media = soma / 3;
    }
    
    public void verificarDesempenho() {
        if (media < 6) {
            this.desempenho = "Reprovado";
        } else if (media <= 9) {
            this.desempenho = "Aprovado";
        } else {
            this.desempenho = "Ótimo Aproveitamento!";
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public float getMedia() {
        return media;
    }
    
    public String getDesempenho() {
        return desempenho;
    }
}