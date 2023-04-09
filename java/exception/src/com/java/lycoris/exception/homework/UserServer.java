package com.java.lycoris.exception.homework;

class UserServer {
    public void register(String username,String password) throws IllegalNameException {

        if(null == username||username.length()<6||username.length() > 14){
            throw new IllegalNameException("用户名不合法，长度必须在[6-14]之间");
        }
        System.out.println("注册成功，欢迎[" + username + "]");
    }
}
