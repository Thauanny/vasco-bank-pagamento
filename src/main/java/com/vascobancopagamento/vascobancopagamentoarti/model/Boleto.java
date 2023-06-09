package com.vascobancopagamento.vascobancopagamentoarti.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Boleto {
    private Integer id;
    private String numero;
    private double valorCobrado;
    private double valorTotal;
    private double juros;
    private boolean pago;
    private String dataVencimento;
    private String beneficiario;
    private String cpfcnpj;
    private String instrucoes;
    private String codigoBarras;
    private String datapagamento;

    public static Boleto boletoAleatorio() {
        return new Boleto(1, "9378727", 50.00, 52.00, 2.00, false, "29/06/2018",
                "Vasco Banco LTDA", "70.342.343/0001-74",
                "Pagavel em qualquer banco ate a data de vencimento", "238047283047238474343444434534534545454454522",
                LocalDateTime.now().toString());

    }

}
