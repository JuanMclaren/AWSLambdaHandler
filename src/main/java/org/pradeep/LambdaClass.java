package org.pradeep;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaClass implements RequestHandler<String , String> {


    @Override
    public String handleRequest(String s, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Inside handleRequest getAwsRequestId" + context.getAwsRequestId());
        logger.log("Inside handleRequest getAwsRequestId" + context.getFunctionName());
        logger.log("Inside handleRequest getInvokedFunctionArn" + context.getInvokedFunctionArn());
        logger.log("Inside handleRequest getMemoryLimitInMB" + context.getMemoryLimitInMB());
        logger.log("Inside handleRequest getIdentityId" + context.getIdentity());

        return s.toUpperCase();
    }
}
