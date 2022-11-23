package com.tugas.tokoonline.model;

import com.tugas.tokoonline.auditing.Audit;

import javax.persistence.*;

@Entity
@Table(name = "barang")
public class Toko extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Float price;

    @Column(name = "count")
    private int count;

    @Column(name = "rating")
    private int rating;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "publish")
    private boolean publish;


    public Toko() {
    }

    @Override
    public String toString() {
        return "Toko{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", publish=" + publish +
                '}';
    }

    public Long getId() {

        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublish() {
        return publish;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
    }

}
