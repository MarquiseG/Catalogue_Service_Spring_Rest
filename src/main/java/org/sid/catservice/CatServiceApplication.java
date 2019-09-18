package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner
{

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args)
    {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        repositoryRestConfiguration.exposeIdsFor(Produit.class);
        produitRepository.save(new Produit(null, "ordinateur Lx", 6300, 3));
        produitRepository.save(new Produit(null, "ordinateur Macbook pro", 2500, 3));
        produitRepository.save(new Produit(null, "IPhone", 600, 3));

        produitRepository.findAll().forEach(aInProduit -> System.out.print(aInProduit.toString()));
    }
}
