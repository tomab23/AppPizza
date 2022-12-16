/**
 */
package com.idformation.ccp3.mariopizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idformation.ccp3.mariopizza.models.Pizza;

/**
 * @author Stagiaire
 *
 */

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Long> {

}
