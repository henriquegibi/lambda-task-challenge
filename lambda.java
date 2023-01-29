import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;
import com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest;

public class AttachPolicyToIAMUser implements RequestHandler<String, String> {

    private static final String POLICY_ARN = "arn:aws:iam::aws:policy/job-function/ViewOnlyAccess";

    @Override
    public String handleRequest(String userName, Context context) {
        AmazonIdentityManagement iamClient = AmazonIdentityManagementClientBuilder.defaultClient();
        AttachUserPolicyRequest attachUserPolicyRequest = new AttachUserPolicyRequest()
                .withUserName(userName)
                .withPolicyArn(POLICY_ARN);
        iamClient.attachUserPolicy(attachUserPolicyRequest);
        return "The AmazonS3ReadOnlyAccess policy was attached to the IAM user " + userName;
    }
}
