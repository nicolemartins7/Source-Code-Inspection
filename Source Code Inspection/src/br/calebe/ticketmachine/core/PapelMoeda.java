// Nicole Martins dos Santos - 100365577
package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) { // nomes das variáveis globais são as mesmas das variáveis locais
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor; //lógica não está implementada
    }

    public int getQuantidade() {
        return quantidade; // lógica não está implementada
    }
}
