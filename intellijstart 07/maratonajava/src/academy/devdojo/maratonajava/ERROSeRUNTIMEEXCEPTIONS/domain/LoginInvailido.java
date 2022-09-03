package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.domain;

public class LoginInvailido extends Exception{
    public LoginInvailido() {
        super("Login invalido");
    }

    public LoginInvailido(String message) {
        super("Causa do erro");
    }
}
