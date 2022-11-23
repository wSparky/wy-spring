package cn.wy.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-23  20:39
 * @Version: 1.0.0
 * @Description: TODO
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod(){
        System.out.println("执行：init-method");
        hashMap.put("10001", "aaa");
        hashMap.put("10002", "bbb");
        hashMap.put("10003", "ccc");
    }

    public void destroyDataMethod(){
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
