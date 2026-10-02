public class TabelaFutebol {
 String nome;
 int jogos;
 int vitorias;
 int derrotas;
 int saldoGols;
 char categoria;
 boolean naZonaClassificacao;

 public TabelaFutebol(String nome, int jogos, int vitorias, int derrotas, int saldoGols, char categoria,
   boolean naZonaClassificacao) {
  this.nome = nome;
  this.jogos = jogos;
  this.vitorias = vitorias;
  this.derrotas = derrotas;
  this.saldoGols = saldoGols;
  this.categoria = categoria;
  this.naZonaClassificacao = naZonaClassificacao;
 }

 public int calcularPontos() {
  return this.vitorias * 3;
 }
}