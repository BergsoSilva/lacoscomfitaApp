/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silva.lacoscomfitaApp.repository;

import com.silva.lacoscomfitaApp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bergson.silva
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
