package Model;

import org.springframework.boot.env.OriginTrackedMapPropertySource;

import javax.swing.*;
import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;
    private BigDecimal descontoOrcamento;

    public Orcamento(){}
    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontoOrcamento){
        this.valorOrcamento = valorOrcamento;
        this.descontoOrcamento = descontoOrcamento;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}
