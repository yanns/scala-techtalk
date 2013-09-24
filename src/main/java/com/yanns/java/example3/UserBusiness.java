package com.yanns.java.example3;

public class UserBusiness {

    private final UserRepository userRepository = new UserRepository();

    public boolean isUserAllowed(String name) {
        User user = userRepository.findUserByName(name);
        if (user != null) {
            if (user.getGender() != null && user.getGender().equals("F")) {
                if (user.getAge() != null && user.getAge() >= 18) {
                    return true;
                }
            }
        }
        return false;
    }
}
