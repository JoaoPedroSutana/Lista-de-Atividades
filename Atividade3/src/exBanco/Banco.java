package exBanco;

public class Banco {
    private int numero;
    private int agNumero;
    private String agNome;
    private int bancoNumero;
    private String bancoNome;
    private int tipo;
    private double saldo;

    public Banco() {
        this.saldo = 0;
    }

    public Banco(int numero, int agNumero, String agNome, int tipo) {
        this(numero, agNumero, agNome, 0, "Não informado", tipo);
    }

    public Banco(int numero, int agNumero, String agNome,
                 int bancoNumero, String bancoNome, int tipo) {
        if (numero <= 0 || agNumero <= 0) {
            throw new IllegalArgumentException("Conta e agência devem ter números positivos.");
        }
        if (agNome == null || agNome.isBlank() || bancoNome == null || bancoNome.isBlank()) {
            throw new IllegalArgumentException("Os nomes da agência e do banco são obrigatórios.");
        }
        if (tipo < 1 || tipo == 4) {
            throw new IllegalArgumentException("Tipo inválido para a abertura da conta.");
        }

        this.numero = numero;
        this.agNumero = agNumero;
        this.agNome = agNome;
        this.bancoNumero = bancoNumero;
        this.bancoNome = bancoNome;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgNumero() {
        return agNumero;
    }

    public String getAgNome() {
        return agNome;
    }

    public int getBancoNumero() {
        return bancoNumero;
    }

    public String getBancoNome() {
        return bancoNome;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        validarContaAtiva();
        validarValor(valor);
        saldo += valor;
    }

    public void debitar(double valor) {
        validarContaAtiva();
        validarValor(valor);
        saldo -= valor;
    }

    public String consultarSaldo(int numeroConta) {
        if (numeroConta != numero) {
            throw new IllegalArgumentException("Número da conta incorreto.");
        }
        return String.format("Conta %d - Saldo: R$ %.2f", numero, saldo);
    }

    public int encerrarConta() {
        validarContaAtiva();
        if (saldo < 0) {
            throw new IllegalStateException("Não é possível encerrar uma conta com saldo negativo.");
        }
        tipo = 4;
        saldo = 0;
        return numero;
    }

    public String textoEncerrar(double saldoDevolvido) {
        return String.format(
                "Conta %d encerrada. Tipo: %d. Saldo devolvido: R$ %.2f.",
                numero, tipo, saldoDevolvido);
    }

    private void validarContaAtiva() {
        if (tipo == 4) {
            throw new IllegalStateException("A conta está encerrada.");
        }
    }

    private void validarValor(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }
}
