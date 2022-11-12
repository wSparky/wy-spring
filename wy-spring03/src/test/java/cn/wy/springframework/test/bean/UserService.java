package cn.wy.springframework.test.bean;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-10  19:47
 * @Version: 1.0.0
 * @Description: TODO
 */
public class UserService {

    private String uId;
    private UserDao userDao;

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
