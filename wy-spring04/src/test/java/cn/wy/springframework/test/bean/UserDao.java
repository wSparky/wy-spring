package cn.wy.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-12  19:42
 * @Version: 1.0.0
 * @Description: TODO
 */
public class UserDao {

    private static Map<String,String> hasMap = new HashMap<>();

    static {
        hasMap.put("10001","wy01");
        hasMap.put("10002","wy02");
        hasMap.put("10003","wy03");
    }
    public String queryUserName(String uId){
        return hasMap.get(uId);
    }

}
