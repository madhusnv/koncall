package i6;

import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i6.a */
/* loaded from: classes.dex */
public final class C3172a extends AbstractC3174c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3172a(int i10) {
        super("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i10) {
            case 1:
                super("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                break;
            case 2:
                super("androidx.credentials.TYPE_DATA_CLONE_ERROR");
                break;
            case 3:
                super("androidx.credentials.TYPE_ENCODING_ERROR");
                break;
            case 4:
                super("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR");
                break;
            case 5:
                super("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR");
                break;
            case 6:
                super("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR");
                break;
            case 7:
                super("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR");
                break;
            case 8:
                super("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR");
                break;
            case 9:
                super("androidx.credentials.TYPE_NAMESPACE_ERROR");
                break;
            case 10:
                super("androidx.credentials.TYPE_NETWORK_ERROR");
                break;
            case 11:
                super("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR");
                break;
            case 12:
                super("androidx.credentials.TYPE_NOT_FOUND_ERROR");
                break;
            case 13:
                super("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                break;
            case 14:
                super("androidx.credentials.TYPE_OPERATION_ERROR");
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                super("androidx.credentials.TYPE_OPT_OUT_ERROR");
                break;
            case 16:
                super("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR");
                break;
            case 17:
                super("androidx.credentials.TYPE_READ_ONLY_ERROR");
                break;
            case 18:
                super("androidx.credentials.TYPE_SECURITY_ERROR");
                break;
            case 19:
                super("androidx.credentials.TYPE_SYNTAX_ERROR");
                break;
            case 20:
                super("androidx.credentials.TYPE_TIMEOUT_ERROR");
                break;
            case 21:
                super("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR");
                break;
            case 22:
                super("androidx.credentials.TYPE_UNKNOWN_ERROR");
                break;
            case 23:
                super("androidx.credentials.TYPE_VERSION_ERROR");
                break;
            case 24:
                super("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR");
                break;
            default:
                break;
        }
    }
}
