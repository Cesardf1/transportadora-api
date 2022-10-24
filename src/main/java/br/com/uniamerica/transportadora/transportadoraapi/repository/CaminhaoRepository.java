package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Caminhao;
import br.com.uniamerica.transportadora.transportadoraapi.entity.HistoricoFrete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CaminhaoRepository extends JpaRepository<Caminhao,Long> {

    public List<Caminhao> findByAtivoTrue();
}
