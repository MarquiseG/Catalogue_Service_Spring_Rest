/**
 * ***************************************************************************
 * <p>
 * $RCSfile: ProduitRepository.java,v $
 * <p>
 * <p>
 * <p>
 * ***************************************************************************
 * <p>
 * $Revision: 1.0 $
 * <p>
 * $Id: ProduitRepository.java,v 2019/05/22 3:28 PM mkaroune Exp $
 * <p>
 * ***************************************************************************
 * <p>
 * Copyright (c) 2019 Nokia . All Rights Reserved.
 * Please read the associated COPYRIGHTS file for more details.
 * <p>
 * ***************************************************************************
 */

package org.sid.catservice.dao;

import org.sid.catservice.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long>
{
    @RestResource(path = "/byDesignation")
    public List<Produit> findAllByDesignationContains(@Param("mc") String aInS);

    @RestResource(path = "/byDesignationPage")
    public Page<Produit> findAllByDesignationContains(@Param("mc") String aInS, Pageable aInPageable);
}
