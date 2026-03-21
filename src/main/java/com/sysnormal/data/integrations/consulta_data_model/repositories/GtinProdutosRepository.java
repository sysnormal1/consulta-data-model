package com.sysnormal.data.integrations.consulta_data_model.repositories;

import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import com.sysnormal.data.integrations.consulta_data_model.entities.GtinProduto;
import org.springframework.stereotype.Repository;

@Repository
public interface GtinProdutosRepository extends BaseRepository<GtinProduto, Long> {

}
