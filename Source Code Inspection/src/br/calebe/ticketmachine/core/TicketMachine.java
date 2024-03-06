// Nicole Martins dos Santos - 100365577

package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor; //Atributo precoDoBilhete Ausente, Atributo valor representa o preço do bilhete.
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100}; //  Erro de Nomenclatura: Nome deve ser TrocoIterator.

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {

        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[1] == quantia) { // Índice usado como 1 em papelMoeda[i], deve ser papelMoeda[i].

                achou = true; //Código desnecessário
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo; //Lógica de Saldo Ausente
    }

    public Iterator<Integer> getTroco() {
        return null; //Lógica de Troco Ausente
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException(); // Não há tratamento adequado para SaldoInsuficienteException.
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
