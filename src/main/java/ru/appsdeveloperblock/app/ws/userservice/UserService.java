package ru.appsdeveloperblock.app.ws.userservice;

import ru.appsdeveloperblock.app.ws.ui.model.request.UserDetailsRequestModel;
import ru.appsdeveloperblock.app.ws.ui.model.response.UserRest;


public interface UserService {
    
    UserRest createUser(UserDetailsRequestModel userDetails);
    
}
