package com.atguigu.oss;

import com.aliyun.oss.OSSClient;
import org.junit.Test;

public class OSSTest {

    @Test
    public void testBucket() {

    // Endpoint以杭州为例，其它Region请按实际情况填写。
    String endpoint = "oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    String accessKeyId = "LTAI0uAzaNXkdQ5i";
    String accessKeySecret = "19cWarD1J99tA3dW53Fa5ykqJIa1xQ";
    String bucketName = "atguigu-guli-file1-180925";

        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        // 创建存储空间。
        ossClient.createBucket(bucketName);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}