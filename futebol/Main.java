public class Main {
 public static void main(String[] args) {
  TabelaFutebol[] tabela = new TabelaFutebol[5];
  tabela[0] = new TabelaFutebol("Flamengo", 10, 7, 1, 12, 'A', true);
  tabela[1] = new TabelaFutebol("Palmeiras", 10, 6, 2, 8, 'A', true);
  tabela[2] = new TabelaFutebol("São Paulo", 10, 5, 3, 3, 'B', true);
  tabela[3] = new TabelaFutebol("Grêmio", 10, 4, 4, -1, 'B', false);
  tabela[4] = new TabelaFutebol("Santos", 10, 2, 6, -7, 'C', false);

  System.out.printf("%-12s | %-6s | %-8s | %-8s | %-6s | %-6s | %-9s | %-12s%n",
    "Time", "Jogos", "Vitorias", "Derrotas", "Saldo", "Pontos", "Categoria", "Classificado");
  System.out.println("---------------------------------------------------------------------------------------");

  for (TabelaFutebol t : tabela) {
   String statusClassificado = t.naZonaClassificacao ? "Sim" : "Não";

   System.out.printf("%-12s | %-6d | %-8d | %-8d | %-6d | %-6d | %-9c | %-12s%n",
     t.nome,
     t.jogos,
     t.vitorias,
     t.derrotas,
     t.saldoGols,
     t.calcularPontos(),
     t.categoria,
     statusClassificado);
  }
 }
}