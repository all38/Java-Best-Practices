package Central;

import java.util.*; // Importa todas as classes utilitárias como Map, List, Scanner etc.

public class CentralDeExercicios {
    
	private Map<String, Runnable> exercicios; // Mapa para armazenar o nome do exercício e sua ação (Runnable)
    // Construtor recebe o mapa com os exercícios prontos
    public CentralDeExercicios(Map<String, Runnable> exercicios) {
        this.exercicios = exercicios;
    } 
    
    // Método que exibe o menu e executa o exercício selecionado
    public void selecionarEExecutar() {
    
    	int i = 1;
        // Lista todos os exercícios cadastrados no mapa
        for (String nome : exercicios.keySet()) {
            System.out.printf("%d) %s%n", i, nome);
            i++;
        }
        
        // Solicita ao usuário o número do exercício
        System.out.print("Digite o número (ou vazio para o último)? ");
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        int num = 0; 
        if (!entrada.isEmpty()) { // Se digitou algo
            try {
                num = Integer.parseInt(entrada); // Converte para inteiro
            } catch (NumberFormatException e) { // Caso digite algo inválido
                num = exercicios.size();
            }
        } else { // Se só apertar Enter, executa o último exercício
            num = exercicios.size();
        }
        
        // Verifica se o número é válido
        boolean numValido = num > 0 && num <= exercicios.size();
        num = numValido ? num - 1 : exercicios.size() - 1;
        
        // Pega a lista de chaves (nomes dos exercícios)
        List<String> chaves = new ArrayList<>(exercicios.keySet());
        String nomeDoExercicio = chaves.get(num);
        
        // Mostra o nome do exercício executado
        System.out.println("\nExecutando exercício " + nomeDoExercicio);
        System.out.println("=".repeat(nomeDoExercicio.length() + 21) + "\n");

        // Pega o código (Runnable) do exercício e executa
        Runnable executar = exercicios.get(nomeDoExercicio);
        try {
            executar.run(); // Executa o exercício
        } catch (Exception e) { // Se der erro, mostra a mensagem
            System.out.println("\u001B[41m\u001B[37mOcorreu um erro: " + e.getMessage() + "\u001B[0m");
            e.printStackTrace();
        }
    }
}