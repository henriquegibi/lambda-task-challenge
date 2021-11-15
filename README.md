# Lambda Task Challenge

### When an IAM user is created, assign read only policy to this user
Use CloudWatch, or CloudTrail, or EventBridge.

- Create a Lambda Function in **Python**
- Lambda must be triggered when a new IAM User is created
- Lambda must be able to assign a policy to this new user
- The policy designated: `arn:aws:iam::aws:policy/job-function/ViewOnlyAccess`

##### Bonus
1. Create a Lambda in **Java 11+**
2. Send a SNS notification using the e-mail service.