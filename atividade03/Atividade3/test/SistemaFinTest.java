import edu.br.utfpr.atividade03.Proposta;
import edu.br.utfpr.atividade03.SistemaFinanceiro;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SistemaFinTest {
    
    public SistemaFinTest() {
    }
    
    @Test
    public void TesteFaixaAte1000reais(){
        SistemaFinanceiro s = new SistemaFinanceiro();
        ArrayList<Proposta> proposta = s.gerarPropostas(500.0, 1000.0);
        assertEquals(2, proposta.size());
        
        Proposta p1 = proposta.get(0);
        assertEquals(2*1000.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getParcelas());
        assertEquals(2*1000.0/2, p1.getValorParcela(), 0.000001);
        
        Proposta p2 = proposta.get(1);
        assertEquals(2*1000.0, p2.getValorTotal(), 0.0000001);
        assertEquals(3, p2.getParcelas());
        assertEquals(2 * 1000.0/ 3, p2.getValorParcela(), 0.000001);
    }
    
    @Test
    public void TesteFaixa1000reaisAte5000reais(){
        SistemaFinanceiro s = new SistemaFinanceiro();
        ArrayList<Proposta> proposta = s.gerarPropostas(500.0, 1000.0);
        assertEquals(2, proposta.size());
        
        Proposta p1 = proposta.get(0);
        assertEquals(2*1000.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getParcelas());
        assertEquals(2*1000.0/2, p1.getValorParcela(), 0.000001);
        
        Proposta p2 = proposta.get(1);
        assertEquals(2*1000.0, p2.getValorTotal(), 0.0000001);
        assertEquals(3, p2.getParcelas());
        assertEquals(2 * 1000.0/ 3, p2.getValorParcela(), 0.000001);
    }
    
    
    
}
