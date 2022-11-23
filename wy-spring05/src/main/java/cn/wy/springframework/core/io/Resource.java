package cn.wy.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wangye
 * @Email wangye.wy@outlook.com
 * @CreateTime: 2022-11-14  20:42
 * @Version: 1.0.0
 * @Description: 提供InputStream流方法，再由其他类实现不同流文件的操作：classPath、FileSystem、URL
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
