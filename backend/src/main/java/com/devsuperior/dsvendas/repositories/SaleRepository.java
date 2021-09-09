package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface SaleRepository extends JpaRepository <Sale, Long>{

}
