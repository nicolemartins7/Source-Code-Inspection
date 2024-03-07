// Nicole Martins dos Santos - 100365577
package br.calebe.ticketmachine.core;

/**
 *
 * author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) { // Computação: Nomes das variáveis locais (no construtor) são iguais aos nomes dos atributos globais.
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor; // Computação: lógica não está implementada
    }

    public int getQuantidade() {
        return quantidade; // Computação: lógica não está implementada
    }
}
