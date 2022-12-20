/**
 *  interface for Order entity Repository
 */
package com.idformation.ccp3.mariopizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idformation.ccp3.mariopizza.models.Order;

/**
 * @author Stagiaire
 *
 */
@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {


}
