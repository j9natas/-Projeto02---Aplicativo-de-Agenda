package Controller.Helper;

import Model.UsuarioModel;
import Viev.Login;

public class LoginHelper {

    private final Login view;
    
    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public UsuarioModel obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        UsuarioModel model = new UsuarioModel(0,nome,senha);
        return model;
    }
    public void setarModelo(UsuarioModel model){
        String nome = model.getNome();
        String senha = model.getSenha();
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    public void clearModelo(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
    
}
