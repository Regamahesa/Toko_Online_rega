package com.tugas.tokoonline.auditing;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Audit {

    @JsonFormat(pattern = "yyy-MM-dd")
    @CreationTimestamp
    @Column(name = "creted_at", updatable = false)
    private Date createdAt;

    @JsonFormat(pattern = "yyy-MM-dd")
    @LastModifiedDate
    @Column(name = "updated_at")
    private Date updateAd;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAd() {
        return updateAd;
    }

    public void setUpdateAd(Date updateAd) {
        this.updateAd = updateAd;
    }
}
