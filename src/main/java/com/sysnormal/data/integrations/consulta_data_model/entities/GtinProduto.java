package com.sysnormal.data.integrations.consulta_data_model.entities;

import com.sysnormal.data.base_data_model.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "GTIN_PRODUTOS")
public class GtinProduto extends BaseEntity {
    @Id
    @Column(name = "CODPROD")
    private Long codProd;

    @Column(name = "UPDATED_GTIN_MASTER")
    private Integer updatedGtinMaster;

    @Column(name = "UPDATED_GTIN_UN")
    private Integer updatedGtinUn;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", scale = 6)
    private LocalDateTime updatedAt;

}
