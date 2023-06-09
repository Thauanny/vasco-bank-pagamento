package com.vascobancopagamento.vascobancopagamentoarti.shared.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaldoDTO {
    Integer idConta;
    double valor;
}
