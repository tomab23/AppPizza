/**
 *  interface for OrderLine entity Repository
 */
package com.idformation.ccp3.mariopizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idformation.ccp3.mariopizza.models.OrderLine;

/**
 * @author tomab
 *
 */
@Repository
public interface IOrderLineRepository extends JpaRepository<OrderLine, Long> {

}
