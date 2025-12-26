package com.sysnormal.libs.db.entities.integrations.consulta_entities;

import com.sysnormal.libs.db.entities.base_entities.BaseEntity;
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

    protected static final long TABLE_ID = 39000;
    public static long getTableId() {
        return TABLE_ID;
    }
}
