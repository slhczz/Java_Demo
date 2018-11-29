package com.sy.userImpl;

public interface UserImpl {

    public boolean queryOne(String name,String password);
    public boolean queryUser(String name);
    public int addOne(String name,String password);
    public boolean updataPwd(String password);


}
