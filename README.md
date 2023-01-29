# Auto assign 'ViewOnlyPermission' to an IAM User when it is created on AWS

If you want create an IAM User and want to automatically assign to it a permission that allow the User only to read the cloud (ViewOnlyAccess) than this repository is right for you.

### You will need to:

Create a Lambda function: Create a Lambda function in Java that has the necessary permissions to attach the "ViewOnlyAccess" policy to a new IAM user. The function code can be found at ***lambda.java*** file. Write down the ARN after creating the lambda.

Use the YAML file (***autoAttachPermissionResources.yaml***) to:

- create a CloudTrail trail to log all IAM user creation events in your AWS account.
- create a CloudWatch Log Group and configure the CloudTrail trail to send logs to this group.
- create a CloudWatch Event Rule: Next, create a CloudWatch Event Rule to trigger a Lambda function whenever an IAM user creation event is detected in the CloudWatch logs.

Modify, at line 48 and 54 in the YAML file the *insertTheLambdaFunctionArnHere* to the Lambda ARN you wrote down earlier.