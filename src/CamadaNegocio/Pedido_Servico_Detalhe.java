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
public class Pedido_Servico_Detalhe {
    private DetalheServico ds;
    private String numeracaoI, numeracaoF;
    private int vias;
    private String outros;
    private int sequence;

    public Pedido_Servico_Detalhe(DetalheServico ds, String numeracaoI, String numeracaoF, int vias, String outros, int sequence) {
        this.ds = ds;
        this.numeracaoI = numeracaoI;
        this.numeracaoF = numeracaoF;
        this.vias = vias;
        this.outros = outros;
        this.sequence = sequence;
    }

    public Pedido_Servico_Detalhe() {
    }

    public DetalheServico getDs() {
        return ds;
    }

    public void setDs(DetalheServico ds) {
        this.ds = ds;
    }

    public String getNumeracaoI() {
        return numeracaoI;
    }

    public void setNumeracaoI(String numeracaoI) {
        this.numeracaoI = numeracaoI;
    }

    public String getNumeracaoF() {
        return numeracaoF;
    }

    public void setNumeracaoF(String numeracaoF) {
        this.numeracaoF = numeracaoF;
    }

    public int getVias() {
        return vias;
    }

    public void setVias(int vias) {
        this.vias = vias;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
    
    public String CreatingDeleteSQLComand(int codigoP, int codigoS, int codigoD, int sequencia)
    {
        String sql = "delete from pedido_servico_detalhe where pe_codigo = "+codigoP+" and serv_codigo = "+codigoS+" and ds_codigo = "+codigoD+" and ps_sequence = "+sequencia+"";
        return sql;
    }
    
    public boolean gravar(int codigoP, int codigoS)
    {
        String sql =  "INSERT INTO pedido_servico_detalhe(" +
                    " pe_codigo, serv_codigo, ds_codigo, psd_numeracaoini, psd_numeracaofim, psd_vias, psd_outros, ps_sequence) " +
                    " VALUES ("+codigoP+", "+codigoS+", "+ds.getCodigo()+", '"+numeracaoI+"', '"+numeracaoF+"', "+vias+", '"+outros+"', "+sequence+");";
        return Banco.getCon().manipular(sql);
    }
    
    public boolean gravar2(int codigoP, int codigoS)
    {
         String sql =  "INSERT INTO pedido_servico_detalhe( " +
                    " pe_codigo, serv_codigo, ds_codigo, psd_numeracaoini, psd_numeracaofim, psd_vias, psd_outros, ps_sequence) " +
                    " VALUES ("+codigoP+", "+codigoS+", "+ds.getCodigo()+", '"+numeracaoI+"', '"+numeracaoF+"', "+vias+", '"+outros+"', "+sequence+");";
        return Banco.getCon().manipular(sql);
    }
    
    public boolean alterar(int codigoP, int codigoS)
    {
        String sql =  "UPDATE pedido_servico_detalhe" +
                      " SET psd_numeracaoini='"+numeracaoI+"', psd_numeracaofim='"+numeracaoF+"', psd_vias="+vias+", psd_outros='"+outros+"' " +
                      " WHERE pe_codigo="+codigoP+" and ps_sequence="+sequence+" and serv_codigo="+codigoS+" and ds_codigo="+ds.getCodigo()+";";
        return Banco.getCon().manipular(sql);
    }
    
    public boolean excluir(int codigoP, int sequence)
    {
        String sql = "DELETE FROM pedido_servico_detalhe " +
                     " WHERE pe_codigo="+codigoP+" and ps_sequence = "+sequence+";";
        return Banco.getCon().manipular(sql); 
    }
    
    public boolean excluir(int codigoP)
    {
        String sql = "DELETE FROM pedido_servico_detalhe " +
                     " WHERE pe_codigo="+codigoP+";";
        return Banco.getCon().manipular(sql); 
    }
    
    public boolean executeDelete(String comand)
    {
        return Banco.getCon().manipular(comand);  
    }
    
    public boolean ChecarExiste(int codigoP, int sequence, int descCodigo)
    {
        String sql;
        sql = "select * from pedido_servico_detalhe where pe_codigo="+codigoP+" and ps_sequence = "+sequence+" and ds_codigo = "+descCodigo+"";
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
    
    public ArrayList<Pedido_Servico_Detalhe> buscar (int codigo, int sequence)
    {
        ArrayList<Pedido_Servico_Detalhe> lista = new ArrayList<>();
        String sql;
        sql = "SELECT pe_codigo, serv_codigo, ds_codigo, psd_numeracaoini, psd_numeracaofim, psd_vias, psd_outros, ps_sequence " +
              " FROM pedido_servico_detalhe"
            + " WHERE pe_codigo = "+codigo+" and ps_sequence = "+sequence+";";
        ResultSet rs=Banco.getCon().consultar(sql);
        try 
        {
            while (rs.next()) 
            {
                lista.add(new Pedido_Servico_Detalhe(new DetalheServico().buscarCodigo(rs.getInt(3)), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
