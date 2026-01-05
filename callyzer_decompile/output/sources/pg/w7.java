package pg;

import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import i6.C3172a;
import i6.C3173b;
import i6.C3175d;
import i6.C3176e;
import i6.C3177f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w7 {

    /* renamed from: a */
    public static final /* synthetic */ int f29102a = 0;

    /* renamed from: a */
    public static GetCredentialException m11908a(String str, String str2) throws FrameworkClassParsingException {
        Exception excM11897a;
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new C3172a(22), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(0), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(1), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(2), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excM11897a = v7.m11897a(new C3173b(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(3), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(4), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(5), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(6), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(7), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(8), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excM11897a = v7.m11897a(new C3175d(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(9), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(10), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(11), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excM11897a = v7.m11897a(new C3176e(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(12), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(13), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excM11897a = v7.m11897a(new C3177f(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(14), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(15), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(16), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(17), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(18), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(19), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(20), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(21), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(22), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excM11897a = v7.m11897a(new C3172a(23), str2, getPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excM11897a = v7.m11897a(new C3172a(24), str2, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) excM11897a;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str, str2);
        }
    }
}
