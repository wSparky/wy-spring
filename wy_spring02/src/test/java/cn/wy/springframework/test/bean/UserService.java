package cn.wy.springframework.test.bean;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-10  19:47
 * @Version: 1.0.0
 * @Description: TODO
 */
public class UserService {
    private String name;

    public UserService() {
    }
    public UserService(String name){
        this.name = name;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息： " + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
