package com.ArtCraft.ordercraft.model.classes;

import javax.persistence.*;

@Entity
@Table(name = "stock_mng")
public class StockMng {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_mng_id")
    private int stockItemId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    public StockMng(int stockItemId, Product product, int quantity) {
        this.stockItemId = stockItemId;
        this.product = product;
        this.quantity = quantity;
    }

    public StockMng() {
    }

    public int getStockItemId() {
        return stockItemId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setStockItemId(int stockItemId) {
        this.stockItemId = stockItemId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StockMng{" +
                "stockItemId=" + stockItemId +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }

}
