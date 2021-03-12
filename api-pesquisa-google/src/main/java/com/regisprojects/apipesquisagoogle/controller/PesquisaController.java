/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.apipesquisagoogle.controller;

import com.regisprojects.apipesquisagoogle.model.Pesquisa;
import com.regisprojects.apipesquisagoogle.service.PesquisaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@CrossOrigin(origins = "*")
@RequestMapping("search")
@RestController
public class PesquisaController {
    
    @Autowired
    PesquisaService ps;
    
    @GetMapping(path = "/{word}")
    public List<Pesquisa> findByWord(@PathVariable String word){
        return ps.getConnection(word);
    }
    
}
