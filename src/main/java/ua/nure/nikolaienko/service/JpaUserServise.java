// ============================================================================
//  File          : JpaUserServise
//  Created       : 23.05.15   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Nikolaienko Vlasyslav, Ukraine
// ============================================================================
package ua.nure.nikolaienko.service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.nure.nikolaienko.repository.UserRepository;

/**
 * @author by Nikolaienko Vladyslav on 23.05.15.
 * @version 1.0
 */
public class JpaUserServise implements UserServise {
    @Autowired
    private UserRepository repository;

}
