package exercise.oneclasses.teste;

import exercise.oneclasses.domain.Principal;
import exercise.oneclasses.service.CreatingUser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreatingUser personagemPrincipal = new CreatingUser();
        List mainChar = personagemPrincipal.CreatingUser();
        System.out.println(mainChar);

    }
}
