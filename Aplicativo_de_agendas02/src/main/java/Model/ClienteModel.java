package Model;

import java.util.Date;

public class ClienteModel extends PessoaModel{
       
    private String endereco;
    private int cep;

    public ClienteModel(int id, String nome,String endereco, int cep, char sexo, String nascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }


    public ClienteModel(int id, String nome,String endereco, int cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    

       
    
}
