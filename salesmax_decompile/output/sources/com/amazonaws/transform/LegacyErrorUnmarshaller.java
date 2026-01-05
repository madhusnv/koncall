package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import java.lang.reflect.InvocationTargetException;
import org.w3c.dom.Node;

/* loaded from: classes5.dex */
public class LegacyErrorUnmarshaller implements Unmarshaller<AmazonServiceException, Node> {
    private final Class<? extends AmazonServiceException> exceptionClass;

    public LegacyErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    public String getErrorPropertyPath(String str) {
        return "Response/Errors/Error/" + str;
    }

    public String parseErrorCode(Node node) {
        return XpathUtils.asString("Response/Errors/Error/Code", node);
    }

    public LegacyErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.exceptionClass = cls;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        String errorCode = parseErrorCode(node);
        String strAsString = XpathUtils.asString("Response/Errors/Error/Message", node);
        String strAsString2 = XpathUtils.asString("Response/RequestID", node);
        String strAsString3 = XpathUtils.asString("Response/Errors/Error/Type", node);
        AmazonServiceException amazonServiceExceptionNewInstance = this.exceptionClass.getConstructor(String.class).newInstance(strAsString);
        amazonServiceExceptionNewInstance.setErrorCode(errorCode);
        amazonServiceExceptionNewInstance.setRequestId(strAsString2);
        if (strAsString3 == null) {
            amazonServiceExceptionNewInstance.setErrorType(AmazonServiceException.ErrorType.Unknown);
        } else if ("server".equalsIgnoreCase(strAsString3)) {
            amazonServiceExceptionNewInstance.setErrorType(AmazonServiceException.ErrorType.Service);
        } else if ("client".equalsIgnoreCase(strAsString3)) {
            amazonServiceExceptionNewInstance.setErrorType(AmazonServiceException.ErrorType.Client);
        }
        return amazonServiceExceptionNewInstance;
    }
}
