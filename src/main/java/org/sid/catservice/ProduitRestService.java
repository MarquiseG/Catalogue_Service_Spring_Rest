/**
 * ***************************************************************************
 * <p>
 * $RCSfile: ProduitRestService.java,v $
 * <p>
 * <p>
 * <p>
 * ***************************************************************************
 * <p>
 * $Revision: 1.0 $
 * <p>
 * $Id: ProduitRestService.java,v 2019/05/22 5:10 PM mkaroune Exp $
 * <p>
 * ***************************************************************************
 * <p>
 * Copyright (c) 2019 Nokia . All Rights Reserved.
 * Please read the associated COPYRIGHTS file for more details.
 * <p>
 * ***************************************************************************
 */

package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitRestService
{
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping("listProduits")
    public List<Produit> listProduits()
    {
        return produitRepository.findAll();
    }

    @GetMapping("listProduits/{id}")
    public Produit listProduits(@PathVariable(name = "id") Long id)
    {
        return produitRepository.findById(id).get();
    }

    @PutMapping("listProduits/{id}")
    public Produit update(@PathVariable(name = "id") Long id, @RequestBody Produit aInProduit)
    {
        aInProduit.setId(id);
        return produitRepository.save(aInProduit);
    }

    @PostMapping("listProduits")
    public Produit update(@RequestBody Produit aInProduit)
    {
        return produitRepository.save(aInProduit);
    }

    @DeleteMapping("listProduits/{id}")
    public void delete(@PathVariable(name = "id") Long id)
    {
        produitRepository.deleteById(id);
    }
}
