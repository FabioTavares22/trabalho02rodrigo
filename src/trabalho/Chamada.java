package trabalho;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Chamada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			menu();
			menu = ler(scan);
			
			if(menu == 1) {
				materia1();
			}else if(menu == 2) {
				materia2();
			}else if(menu == 3) {
				materia3();
			}else if(menu == 9) {
				System.out.println("Obrigado por utilizar nosso sistema!");
			}
		}while(menu != 9);
	}

	private static void materia1() {
		String alun, cham;
		Scanner ler = new Scanner(System.in);
        Usuario user = new Usuario();
        System.out.println("Digite o nome do aluno: ");
        alun = ler.nextLine();
        user.setAluno(alun);
        System.out.println("Digite se ele está ou não presente");
        cham = ler.nextLine();
        user.setChamada(cham);
        escrever1(user);
        System.out.println("Para adicionar um novo aluno nessa lista basta selecionar novamente a opção 1");
    }

    private static void escrever1(Usuario user) {
    	LocalDateTime agora = LocalDateTime.now();
    	DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd_MM_uuuu");
    	String dt = formatterData.format(agora);
    	String ambiente = System.getenv("CSV_FILE");
        File dir = new File(ambiente);
        File arq = new File(dir, "tecnicas_de_progamacao_" + dt + ".txt");
        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(user.getAluno());
            printWriter.println(user.getChamada());
            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	private static void materia2() {
		String alun, cham;
		Scanner ler = new Scanner(System.in);
        Usuario user = new Usuario();
        System.out.println("Digite o nome do aluno: ");
        alun = ler.nextLine();
        user.setAluno(alun);
        System.out.println("Digite se ele está ou não presente");
        cham = ler.nextLine();
        user.setChamada(cham);
        escrever2(user);
        System.out.println("Para adicionar um novo aluno nessa lista basta selecionar novamente a opção 2");
    }
    private static void escrever2(Usuario user) {
    	LocalDateTime agora = LocalDateTime.now();
    	DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd_MM_uuuu");
    	String dt = formatterData.format(agora);
    	String ambiente = System.getenv("CSV_FILE");
        File dir = new File(ambiente);
        File arq = new File(dir, "engenharia_de_software_" + dt + ".txt");
        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(user.getAluno());
            printWriter.println(user.getChamada());
            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	private static void materia3() {
		String alun, cham;
		Scanner ler = new Scanner(System.in);
        Usuario user = new Usuario();
        System.out.println("Digite o nome do aluno: ");
        alun = ler.nextLine();
        user.setAluno(alun);
        System.out.println("Digite se ele está ou não presente");
        cham = ler.nextLine();
        user.setChamada(cham);
        escrever3(user);
        System.out.println("Para adicionar um novo aluno nessa lista basta selecionar novamente a opção 3");
    }
    private static void escrever3(Usuario user) {
    	LocalDateTime agora = LocalDateTime.now();
    	DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd_MM_uuuu");
    	String dt = formatterData.format(agora);
    	String ambiente = System.getenv("CSV_FILE");
        File dir = new File(ambiente);
        File arq = new File(dir, "estrutura_de_dados_" + dt + ".txt");
        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(user.getAluno());
            printWriter.println(user.getChamada());
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	public static void menu() {
		System.out.println("        ***CHAMADA***"       );
		System.out.println(" --------------------------" );
		System.out.println("|1- Técnicas de Programação|");
		System.out.println("|2- Engenharia de Software |");
		System.out.println("|3- Estrutura de Dados     |");
		System.out.println("|9- Sair                   |");
		System.out.println(" --------------------------" );
	}
	
	public static int ler(Scanner scan){
		int valor = scan.nextInt();
		scan.nextLine();
		return valor;
	}
}
