package entities;

import java.text.Format;

public class Produto {
    //Definição dos atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    //Método construtor padrão
    public Produto() {
    }

    //Método construtor com 3 atributos
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Método construtor com 2 atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Método para valor total em estoque
    public double valorTotalEmEstoque() {
        return getQuantidade() * getPreco();
    }

    //Entrada no estoque
    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    //Saída no estoque
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    //Dados dos produtos
    public String toString() {
        return """
                \t\t\t\tDADOS DO PRODUTO                                
                NOME: %s
                PREÇO UNITÁRIO: R$%.2f
                QUANTIDADE EM ESTOQUE: %d
                VALOR TOTAL EM ESTOQUE: R$%.2f
                """.formatted(getNome(), getPreco(), getQuantidade(), valorTotalEmEstoque());
    }
}