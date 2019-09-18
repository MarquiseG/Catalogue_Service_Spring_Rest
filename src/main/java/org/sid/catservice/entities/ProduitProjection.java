/**
 * ***************************************************************************
 * <p>
 * $RCSfile: ProduitProjection.java,v $
 * <p>
 * <p>
 * <p>
 * ***************************************************************************
 * <p>
 * $Revision: 1.0 $
 * <p>
 * $Id: ProduitProjection.java,v 2019/05/22 5:03 PM mkaroune Exp $
 * <p>
 * ***************************************************************************
 * <p>
 * Copyright (c) 2019 Nokia . All Rights Reserved.
 * Please read the associated COPYRIGHTS file for more details.
 * <p>
 * ***************************************************************************
 */

package org.sid.catservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Produit.class)
public interface ProduitProjection
{
    public double getPrice();
    public String getDesignation();
}
