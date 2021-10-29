package io.github.bootmeta.result.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertiesFileUtil {


    /**
     * @param fileName load Properties 文件
     * @param code 状态码
     * @return 返回状态码对应的中文描述
     * @throws IOException 没有读取到文件
     */
    public static String loadProperties(final String fileName, String code) throws IOException {
        final InputStream is = LoadPropertiesFileUtil.class.getClassLoader().getResourceAsStream(fileName);
        final Properties config = new Properties();
        config.load(is);
        return config.getProperty(code);
    }


    /**
     * @param fileName load Properties 文件
     * @param code 状态码
     * @return 返回状态码对应的中文描述
     */
    public static String loadProperties(final String fileName, int code) {
        try {
            return loadProperties(fileName, String.valueOf(code));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
