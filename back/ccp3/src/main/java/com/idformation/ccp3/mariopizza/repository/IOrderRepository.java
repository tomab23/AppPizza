/**
 * 
 */
package com.idformation.ccp3.mariopizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idformation.ccp3.mariopizza.models.Order;

/**
 * @author Stagiaire
 *
 */
public interface IOrderRepository extends JpaRepository<Order, Long> {


}
