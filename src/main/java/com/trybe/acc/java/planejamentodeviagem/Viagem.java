package com.trybe.acc.java.planejamentodeviagem;

public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;
  private Tempo t;

  /**
   * Método construtor da classe.
   * 
   */

  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
    this.t = new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    return this.t.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
      return this.voo.retornarTempoVoo(this.distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    return this.voo.retornarInformacaoVoo(
            this.embarque, this.origem, this.t.retonarDesembarqueHorarioLocalOrigem(), this.destino
    );
  }
}
