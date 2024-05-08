package io.ana.julia.listinha.data.entity;

import io.ana.julia.listinha.data.entity.enumEntity.TypeItemEntity;
import io.ana.julia.listinha.data.entity.enumEntity.UnitOfMeasureItemEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description", unique = true)
    private String description;
    @Column(name = "type_item")
    @Enumerated(EnumType.STRING)
    private TypeItemEntity typeItemEntity;
    @Column(name = "unit_of_measure")
    @Enumerated(EnumType.STRING)
    private UnitOfMeasureItemEntity itemMeasurementEntity;
    @Column(name = "price")
    private BigDecimal price;

    public ItemEntity() {
    }

    public ItemEntity(
            Long id,
            String description,
            TypeItemEntity typeItemEntity,
            UnitOfMeasureItemEntity itemMeasurementEntity,
            BigDecimal price) {
        this.id = id;
        this.description = description;
        this.typeItemEntity = typeItemEntity;
        this.itemMeasurementEntity = itemMeasurementEntity;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeItemEntity getTypeItemEntity() {
        return typeItemEntity;
    }

    public void setTypeItemEntity(TypeItemEntity typeItemEntity) {
        this.typeItemEntity = typeItemEntity;
    }

    public UnitOfMeasureItemEntity getItemMeasurementEntity() {
        return this.itemMeasurementEntity;
    }

    public void setItemMeasurementEntity(UnitOfMeasureItemEntity itemMeasurementEntity) {
        this.itemMeasurementEntity = itemMeasurementEntity ;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
