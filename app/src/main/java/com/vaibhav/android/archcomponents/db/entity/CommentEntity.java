package com.vaibhav.android.archcomponents.db.entity;

import com.vaibhav.android.archcomponents.model.Comment;

import java.util.Date;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "comments",
        foreignKeys = {@ForeignKey(entity = ProductEntity.class,
                parentColumns = "id",
                childColumns = "productId",
                onDelete = ForeignKey.CASCADE)},
        indices = {@Index(value = "productId")})
public class CommentEntity implements Comment {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productId;
    private String text;
    private Date datePosted;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Date getPostedAt() {
        return datePosted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    @Ignore
    public CommentEntity(int id, int productId, String text, Date datePosted) {
        this.id = id;
        this.productId = productId;
        this.text = text;
        this.datePosted = datePosted;
    }
}
