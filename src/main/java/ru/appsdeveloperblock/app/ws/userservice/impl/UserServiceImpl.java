package ru.appsdeveloperblock.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.appsdeveloperblock.app.ws.shared.Utils;
import ru.appsdeveloperblock.app.ws.ui.model.request.UserDetailsRequestModel;
import ru.appsdeveloperblock.app.ws.ui.model.response.UserRest;
import ru.appsdeveloperblock.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstname(userDetails.getFirstname());
        returnValue.setLastname(userDetails.getLastname());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);
        if (users == null) {
            users = new HashMap<>();
            users.put(userId, returnValue);
        }
        return returnValue;
    }
}
