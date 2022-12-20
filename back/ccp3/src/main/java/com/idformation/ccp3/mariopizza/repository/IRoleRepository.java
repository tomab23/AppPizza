/**
 *  interface for Role entity Repository
 */
package com.idformation.ccp3.mariopizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idformation.ccp3.security.models.Role;

/**
 * @author Stagiaire
 *
 */
@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

}
