package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

import academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.domain.LoginInvailido;

import java.util.Scanner;

public class LoginInvalidoErroTest01 {
    public static void main(String[] args) {
        try {
            login();
        }catch (LoginInvailido e){
            e.printStackTrace();
        }
    }

    public static void login() throws LoginInvailido {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String login1 = "Goku";
        String senha1 = "123";
        System.out.println("Login: ");
        String loginDigitado = input.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = input2.nextLine();
        if (!loginDigitado.equals(login1) || !senhaDigitado.equals(senha1)) {
            throw new LoginInvailido("XXX");
        }
        System.out.println("Ususario logado");
    }
}
