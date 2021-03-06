package Controller;

import CamadaNegocio.AjustarFolha;
import CamadaNegocio.Folha;
import CamadaNegocio.Funcionario;
import CamadaNegocio.Servico;
import java.util.Date;
import util.Validacao;

/**
 *
 * @author 羽根川　翼
 * @author 阿賀野
 * @author 矢矧
 */
public class AjusteFolhaController 
{
    private final Funcionario func;    
    private final Servico serv;
    private final util.Validacao v;
    private AjustarFolha af;

    public AjusteFolhaController() {
        func  = new Funcionario();
        v = new Validacao();
        af = new AjustarFolha();
        serv = new Servico();
    }

    public AjustarFolha getAf() {
        return af;
    }

    public void setAf(AjustarFolha af) {
        this.af = af;
    }
    
    public void buscaServico(int codigo)
    {
        af.setServ(new Servico().buscarCodigo(codigo));
    }
    
    public void buscaFolha(int codigo)
    {
        af.setF(new Folha().buscarCodigo(codigo));
    }
    
    public int validar(String codigo, String qtd, Date data, boolean flag, String obs, String tamanho, String servico)
    {
        af.setCodigo(v.ConverteNumeroInteiro(codigo));
        if(qtd.equals(""))
            return 1;
        if(v.ConverteNumeroInteiro(qtd) == -999)
            return 2;
        af.setQtd(v.ConverteNumeroInteiro(qtd));
        if(obs.trim().equals(""))
            return 3;
        if(!flag)
        {
            if(af.getQtd() > af.getF().getQtd())
                return 4;
        }
        if(tamanho.equals(""))
            return 5;
        if(servico.equals(""))
            return 6;

        af.setFlag(flag);
        af.setObs(obs);
        af.setData(data);
        return 0;
    }
    
    public boolean gravar()
    {
        return af.gravar();
    }
    
    public void atualizaEstoque()
    {
        AtualizarEstoqueController aec = new AtualizarEstoqueController();
        aec.setF(af.getF());
        aec.atualizarEstoqueFolha(af.isFlag(), af.getQtd());
    }
    
    public int QtdReservado()
    {
        ProducaoController pc = new ProducaoController();
        pc.setF(af.getF());
        return new ProducaoController().qtdReservaF();
    }
}
