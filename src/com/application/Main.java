package com.application;

import java.util.Scanner;

import entities.Produto;

public class Main {

    public static void main(String[] args) {
        //Instanciação do objeto SCANNER
        Scanner teclado = new Scanner(System.in);

        //Declaração do OBJETO p1
        Produto p1;

        //Declaração das variáveis aux.
        String nome;
        double preco;
        int quantidade;

        //Cadastro de produtos
        System.out.print("""
                \t\t\tDigite os dados do produto
                Nome:\s""");
        nome = teclado.nextLine();
        System.out.print("Preço unitário:R$ ");
        preco = teclado.nextDouble();
        System.out.print("Quantidade em estoque: ");
        quantidade = teclado.nextInt();
        System.out.println();

        //Instanciação do OBJETO p1
        p1 = new Produto(nome, preco, quantidade);
        System.out.println(p1.toString());

        //Alteração de dados do produto
        System.out.print("Digite a quantidade de produtos a serem adicionados ao estoque: ");
        p1.addProduto(teclado.nextInt());
        System.out.println();
        System.out.println(p1.toString());
        System.out.print("Digite a quantidade do produtos a serem retirados do estoque: ");
        p1.removerProduto(teclado.nextInt());
        System.out.println();
        System.out.println(p1.toString());
    }
}