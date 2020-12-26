package com.huguigu.controller.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016103100780306";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWptyin4OvmQV7ny5be5tC8HT7nSwToGtLLysaXraqMrzaa2H/sPI5wlXjl2/hZeB3bbpL2u4aG9EqBelKcjvXUOkplaWcR7MJjQ4H6mlxy/ARyOgZyKSdshDy0yrb4NU9dytsFrSqvuVuol9peEnc7ro0nZFgJoyZiLx6gbuRUJlLmpVXT/gPRmM0BDQ1oF1NrDhA3HfmEk/zXgC6+knB494v+1ZqgHZzyJaVCVE2BamqVTh5xknAx5u72gZNurzcTSRMbsIb/Q0JyO3Eq60zKRJrxs8eozkyzlLSEPPZAxxiJLdG7SNba6s3B6BIPo+vnxndl9ExRSx4j7KVd2CRAgMBAAECggEAAev2/IwUXfURwNXy/W/CN0Rh+aOzoDx3oenkHt3+boVfK1obUeur61izR8fywWlPR7a6naUZTHP2YxbYNv7mDIUXtFQYXLn9aq3F9AvldHIpidCKRWntz6Up2i8faNahYbtXbnWLsHHm81ZW6T2Dk7Hn5ivsYtGbEYpQ/S8SeXQMuNYPSz1+jigJiaG3T7SMufnKfFWysgt58OI/p4pQ/ktXGlWyd3+iW/QuNS2LYiUoVp4/W9aEO1rNaAo7urV2Ce3WB5pwVx9fFKRi1tdJhk0LTPB3dk7HoQDWjhC4O+Yu7hJVU6ix0Q5UwPfj1shzPt5WeSl3nnkUzH9JpJXtwQKBgQDWqe6DbInQYIjI7J35KG9DNyzknCBEMNytGidNWAt9GY/DiMAlPWrXcjeDvcLG0NBUVm46d4qS2s+ZSu8/zQkKeICtSmFYleT4zA9psMSC2pWSPPZ6BkrPWjLfxO8DFMH2O+wFRar7lKvdkRJg2xMpbgLGyLt0rnnIDXr4Qr5cHQKBgQCzqWT8sjArdtO+g6WiuyrYZVf9QD0cg4ybY5EtU6F39CtBViTmF549JE9+NuRg2C5yyyYUpJFvSEFE8Go7zX8/cBX4Z5LxAeUvLzB89xRfwSEYr39eC2j3/6kO8mhHiyt1sD8BAxbVLF57y7tuYNUJX79vaCu9S3XfpdlHOSGkBQKBgQC92HvAb3VSfI18ZQcxG7mK0Hk7lXhT1oLT9JVdqcg/UyP54i9MwAyFjdXbBTAFdRdJ/0ZtHtvHFQ0UnVkKK+MbB4eFuoptNePSxWW8K0EgGQC+3Ht/X6E50KO9kwVuzCTeCBCsePjGlq2IvoxqbFV+BnUeKNjgUI4ThxiCB0UjYQKBgDxYkJgkTfO7dQIP/Am97nVDDRv+gMhcE1V6SyA7cAf3lrPaeIhktHz6/kx5qZox4uAiBkd2w3bqgSnjyvsNWkl3n5mRSJT1OwLvSc0fvNMw7qn5AMIY+Qgb8rAXkhk90Lo2GeOAIyI1RgM0+l7n3YbJh2anSdHKT+xwK5w1v2v1AoGABhJPg1NUbQR/iPC+V2jDPyvRYJNok8GeVfgoveKPC9HQQqoN8qCbxtfsYZcL9Zv3KIiSnfSHRYNDhQuhKOnF+pPwH0b6HRYIAVT5xXo3p6Y9yxexTqqkBrP5P1Cxv1ohwYpZy8w7Eh7OI1xEn6PsS/IZrPs4Ti6hEaep4rGLjQ4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwM9EGffw838yv6nsc4zV5FpwfnGB/A8TiV2mV431S7DgIopJipmdrk6rqVwOKrMV6+cEqIuIcUicAIuoi33wX8HZ382ZbPoFoAgvPL1CJydcTWjke+a9pzEQRyyGziCaHPTzAb0tfMabauVxwTsiWFZ9G8uruYJERo4SGOTnXcku/fdXl3KQ4O8LXETKvhfQYWYLWEGuRC6QDqDBtObkhUJVoIZ+mpdERzKev6qcRCRjVnG2Mwb8BOOpa6ZEgSfJTo08l/VrrMCQju10ees3riRKe91dyElZm8JqDq7sjsaJlY+FKQPEY0D/TZmQ80dwmnZgxk86vuU+DXsSNB2AVQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/crmsystem_web/payJsp/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/crmsystem_web/payJsp/return_url.jsp";

    // 签名方式
	public static String sign_type = "RSA2";

    // 字符编码格式
	public static String charset = "utf-8";

    // 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

