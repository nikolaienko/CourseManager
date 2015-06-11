// ============================================================================
//  File          : UserRepository
//  Created       : 23.05.15   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Nikolaienko Vlasyslav, Ukraine
// ============================================================================
package ua.nure.nikolaienko.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.nure.nikolaienko.entity.User;

/**
 * @author by Nikolaienko Vladyslav on 23.05.15.
 * @version 1.0
 */
@EnableJpaRepositories
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findOneByLogin(String login);

    @Query("select u from User u where u.login =?1")
    User findByLogin(String login);
}
