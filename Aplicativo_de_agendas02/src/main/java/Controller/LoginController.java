package Controller;

import Controller.Helper.LoginHelper;
import Model.UsuarioModel;
import Viev.Login;

public class LoginController {
    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema(){
        UsuarioModel usuarioModel = helper.obterModelo();
    }
    
    public void fizTarefa(){
        System.out.println("Teste!");
        this.view.exibeMensagem("Executei o fiz tarefa!");
    }
    
}
