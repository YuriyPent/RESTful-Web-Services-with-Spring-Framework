package ru.appsdeveloperblock.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Service;
import ru.appsdeveloperblock.app.ws.ui.model.request.UserDetailsRequestModel;
import ru.appsdeveloperblock.app.ws.ui.model.response.UserRest;
import ru.appsdeveloperblock.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstname(userDetails.getFirstname());
        returnValue.setLastname(userDetails.getLastname());

        String userId = UUID.randomUUID().toString();
        returnValue.setUserId(userId);
        if (users == null) {
            users = new HashMap<>();
            users.put(userId, returnValue);
        }
        return returnValue;
    }
}
