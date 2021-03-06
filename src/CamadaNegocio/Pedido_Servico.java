package CamadaNegocio;

import CamadaLogica.Banco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author 吉野　廉
 * @author 羽根川　翼
 * @author モニカ
 * @author 巴御前
 * @author 高村　結衣
 * @author 里川　麗奈
 * @author 鳳翔
 * @author 川村
 * @author 磐手
 * @author イントレピッド
 * @author 七海
 * @author 海女
 * @author 御子
 * @author 稲荷
 */
public class Pedido_Servico {
    private Servico serv;
    private double valor;
    private int qtd;
    private double desconto;
    private double valorExtra;
    private String descricao;
    private int sequence;
    private ArrayList<Pedido_Servico_Detalhe> lista;

    public Pedido_Servico(Servico serv, double valor, int qtd, double valorExtra, double desconto, String descricao, int sequence, ArrayList<Pedido_Servico_Detalhe> lista) {
        this.serv = serv;
        this.valor = valor;
        this.qtd = qtd;
        this.valorExtra = valorExtra;
        this.desconto = desconto;
        this.descricao = descricao;
        this.sequence = sequence;
        this.lista = lista;
    }

    public Pedido_Servico() {
        lista = new ArrayList<>();
    }

    public Servico getServ() {
        return serv;
    }

    public void setServ(Servico serv) {
        this.serv = serv;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public ArrayList<Pedido_Servico_Detalhe> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pedido_Servico_Detalhe> lista) {
        this.lista = lista;
    }

    public double getValorExtra() {
        return valorExtra;
    }

    public void setValorExtra(double valorExtra) {
        this.valorExtra = valorExtra;
    }
    
     public boolean gravar(int codigoP)
    {
        String sql =  "INSERT INTO pedido_servico( " +
                  " pe_codigo, serv_codigo, ps_valor, ps_qtd, ps_desconto, ps_descricao, ps_valorextra) " +
                  " VALUES ("+codigoP+", "+serv.getCodigo()+", "+valor+", "+qtd+", "+desconto+", '"+descricao+"', "+valorExtra+");";
        return Banco.getCon().manipular(sql);
    }
    
    public boolean alterar(int codigoP)
    {
        String sql =  "UPDATE pedido_servico " +
                  " SET serv_codigo="+serv.getCodigo()+", ps_valor="+valor+", ps_qtd="+qtd+", ps_desconto="+desconto+", ps_descricao='"+descricao+"', ps_valorextra = "+valorExtra+" " +
                  " WHERE pe_codigo="+codigoP+" and ps_sequence = "+sequence+";";
        return Banco.getCon().manipular(sql);
    }
    
    public boolean excluir(int codigoP, int sequence)
    {
        String sql = "DELETE FROM pedido_servico " +
                     " WHERE pe_codigo="+codigoP+" and ps_sequence = "+sequence+";";
        return Banco.getCon().manipular(sql); 
    }
    
    public boolean excluir(int codigoP)
    {
        String sql = "DELETE FROM pedido_servico " +
                     " WHERE pe_codigo="+codigoP+";";
        return Banco.getCon().manipular(sql); 
    }
    
    public boolean ChecarExiste(int codigoP, int sequence)
    {
        String sql;
        sql = "select * from pedido_servico where pe_codigo="+codigoP+" and ps_sequence = "+sequence+"";
        ResultSet rs=Banco.getCon().consultar(sql);
        try 
        {
            if (rs.next()) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public ArrayList<Pedido_Servico> buscar(int codigo)
    {
        ArrayList<Pedido_Servico> lista = new ArrayList<>();
        String sql;
        sql = "SELECT pe_codigo, serv_codigo, ps_valor, ps_qtd, ps_desconto, ps_descricao, ps_sequence, ps_valorextra  " +
              " FROM pedido_servico"
            + " WHERE pe_codigo = "+codigo+";";
        ResultSet rs=Banco.getCon().consultar(sql);
        try 
        {
            while (rs.next()) 
            {
                lista.add(new Pedido_Servico(new Servico().buscarCodigo(rs.getInt(2)), rs.getDouble(3), rs.getInt(4), rs.getDouble(8), rs.getDouble(5), rs.getString(6), rs.getInt(7), new Pedido_Servico_Detalhe().buscar(rs.getInt(1), rs.getInt(7))));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public int buscarUltimoCodigo()
    {
        String sql;
        sql = "SELECT max(ps_sequence) " +
              " FROM pedido_servico;";
        ResultSet rs=Banco.getCon().consultar(sql);
        try 
        {
            if (rs.next()) 
            {
                return rs.getInt(1);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
