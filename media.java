import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media = 0;
        double nota;
        String opcao;
        System.out.println("---Dijite a nota de um aluno---\n---tem que ser entre 0 e 10---");
        do {
        float somaDasNotas = 0;
        for(int i = 1; i <=3; i++){ 
            System.out.println("dijite a nota " + i + ": ");
            nota = sc.nextDouble();
            if (nota >=0 && nota<=10) {
                somaDasNotas += nota;
            } else {
                System.out.println("nota invalida! tem que ser entre 0 e 10!");
                i--;
            }
        }media = somaDasNotas/3;
        if (media >= 7) {
            System.out.println("aprovado!");
        }else if (media > 2) {
            System.out.println("recuperação!");
        } else {
            System.out.println("reprovado!");
        }
        
        System.out.println("a media do aluno é: " + media);
        sc.nextLine();
        System.out.println("quer continuar com outro aluno? se sim digite qualquer coisa, se não dijite 'sair': ");
        opcao = sc.nextLine();
        } while (!opcao.equalsIgnoreCase("sair") );
    }
}
