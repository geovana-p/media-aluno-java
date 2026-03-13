//ed pedir tres notas do aluno
//pd calcular a nota do aluno
//sd printar a nota
import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        System.out.println("dijite a primeira nota");
        int a = sc.nextInt();
        System.out.println("dijite a segunda nota");
        int b = sc.nextInt();
        System.out.println("dijite a terceira nota");
        int c = sc.nextInt();
        media = (a+b+c)/3;
        System.out.println("a media do aluno é: " + media);

    }
}
