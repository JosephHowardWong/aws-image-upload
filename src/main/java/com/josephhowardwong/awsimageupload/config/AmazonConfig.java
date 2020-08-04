package com.josephhowardwong.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
            "AKIAITO3MB5SUBCB7MCA",
            "wbGyxq3nEIKKb2fEfo03nKyPu59RtadCMnRRKbDw"
        );

        return AmazonS3ClientBuilder
                .standard()
                .withRegion("ca-central-1")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();


    }


}
