package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendamentoModel {
    private int id;
    private ClienteModel cliente;
    private ServicoModel servico;
    private double valor;
    private Date data;
    private String obsrvacao;

    public AgendamentoModel(int id, ClienteModel cliente, ServicoModel servico, double valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try{
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
            }catch(ParseException ex){
                Logger.getLogger(AgendamentoModel.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public ServicoModel getServico() {
        return servico;
    }

    public void setServico(ServicoModel servico) {
        this.servico = servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObsrvacao() {
        return obsrvacao;
    }

    public void setObsrvacao(String obsrvacao) {
        this.obsrvacao = obsrvacao;
    }
    
    
}
