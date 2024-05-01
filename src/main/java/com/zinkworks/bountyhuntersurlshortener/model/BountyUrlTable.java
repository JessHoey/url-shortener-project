package com.zinkworks.bountyhuntersurlshortener.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

// @entity and @table creates the table in the database - 'bounty_url_table'.
@Entity
@Table(name = "bounty_url_table")
@Builder
public class BountyUrlTable {       // renamed class name


    // Declares primary key for ID column. Generates a sequence of id's for each url.
    @Id
    @Column
    @SequenceGenerator(name="url_id_sequence", sequenceName = "url_id_sequence", allocationSize = 1, initialValue = 2)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "url_id_sequence")
    private Long id;
    @Column
    private String originalUrl;     // renamed properties without underscore (_)
    @Column
    private String shortUrl;
    @Column
    @CreationTimestamp
    private LocalDateTime createdDate;

    // constructor
    public BountyUrlTable(Long id, String originalUrl, String shortUrl, LocalDateTime createdDate) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.createdDate = createdDate;
    }

    // no arguments constructor
    public BountyUrlTable() {
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    // Displays on our webpage.
    @Override
    public String toString() {
        return "bounty_url_table{" +
                "id=" + id +
                ", original_url='" + originalUrl + '\'' +
                ", short_url='" + shortUrl + '\'' +
                ", created_date=" + createdDate +
                '}';
    }
}

//bbbuoboub
//buoibuoibibuiubui
//iybiehbiygbyib

