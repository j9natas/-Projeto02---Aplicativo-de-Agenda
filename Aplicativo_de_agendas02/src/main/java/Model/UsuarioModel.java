
package Model;

import java.util.Date;

public class UsuarioModel extends PessoaModel{

    private String senha;
    private String acesso;

    public UsuarioModel(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public UsuarioModel(int id, String nome,String senha, char sexo,String acesso, String nascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.senha = senha;
        this.acesso = acesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    
    

   
    
}
