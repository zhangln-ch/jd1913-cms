package com.briup.cms.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cms_article")
public class Article implements Serializable {
    private int id;
    private String author;

}
