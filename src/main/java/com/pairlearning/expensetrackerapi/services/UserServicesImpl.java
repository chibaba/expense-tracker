package com.pairlearning.expensetrackerapi.services;

import com.pairlearning.expensetrackerapi.domain.User;
import com.pairlearning.expensetrackerapi.exception.EtAuthException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServicesImpl implements UserServices {

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
