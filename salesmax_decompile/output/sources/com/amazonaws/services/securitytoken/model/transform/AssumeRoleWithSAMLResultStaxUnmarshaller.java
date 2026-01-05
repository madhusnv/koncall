package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class AssumeRoleWithSAMLResultStaxUnmarshaller implements Unmarshaller<AssumeRoleWithSAMLResult, StaxUnmarshallerContext> {
    private static AssumeRoleWithSAMLResultStaxUnmarshaller instance;

    public static AssumeRoleWithSAMLResultStaxUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssumeRoleWithSAMLResultStaxUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssumeRoleWithSAMLResult unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws XmlPullParserException, IOException {
        AssumeRoleWithSAMLResult assumeRoleWithSAMLResult = new AssumeRoleWithSAMLResult();
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i += 2;
        }
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                break;
            }
            if (iNextEvent != 2) {
                if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                    break;
                }
            } else if (staxUnmarshallerContext.testExpression("Credentials", i)) {
                assumeRoleWithSAMLResult.setCredentials(CredentialsStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("AssumedRoleUser", i)) {
                assumeRoleWithSAMLResult.setAssumedRoleUser(AssumedRoleUserStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("PackedPolicySize", i)) {
                assumeRoleWithSAMLResult.setPackedPolicySize(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("Subject", i)) {
                assumeRoleWithSAMLResult.setSubject(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("SubjectType", i)) {
                assumeRoleWithSAMLResult.setSubjectType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("Issuer", i)) {
                assumeRoleWithSAMLResult.setIssuer(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("Audience", i)) {
                assumeRoleWithSAMLResult.setAudience(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("NameQualifier", i)) {
                assumeRoleWithSAMLResult.setNameQualifier(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("SourceIdentity", i)) {
                assumeRoleWithSAMLResult.setSourceIdentity(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            }
        }
        return assumeRoleWithSAMLResult;
    }
}
