/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.apipesquisagoogle.model;

/**
 *
 * @author user
 */
public class Pesquisa {
    
    private String titulo;
    private String link;
    
    public Pesquisa() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Pesquisa{" + "titulo=" + titulo + ", link=" + link + '}';
    }
    
}
