/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CamadaNegocio;

import CamadaLogica.Banco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 吉野　廉
 * @author 羽根川　翼
 * @author モニカ
 * @author 巴御前
 * @author 高村　結衣
 * @author 里川　麗奈
 * @author 橋立
 * @author 阿賀野
 * @author 矢矧
 */
public class Producao_Produto {
    private Produto p;
    private int qtd;

    public Producao_Produto(Produto p, int qtd) {
        this.p = p;
        this.qtd = qtd;
    }

    public Producao_Produto() {
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    //--------------------------------------------------------------------------
    
    public boolean gravar(int codigo)
    {
        String sql = "insert into producao_produto (prod_codigo, pro_codigo, pp_qtd) values ("+codigo+","+p.getCodigo()+","+qtd+")";
        return Banco.getCon().manipular(sql);
    }
    
    public boolean verificar(int codigo)
    {
        String sql = "select * from  producao_produto where prod_codigo = "+codigo+";";
        ResultSet rs=Banco.getCon().consultar(sql);
        try {
            if(rs.next())
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Producao_Folha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int qtdReserva(int codigo) throws SQLException
    {
        String sql = "select count(pp_qtd) from producao_produto where pro_codigo = "+codigo+"";
        ResultSet rs=Banco.getCon().consultar(sql);
        if(rs.next())
        {
            return rs.getInt(1);
        }
        return 0;
    }
}
