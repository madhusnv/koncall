package pg;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import i6.AbstractC3174c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v7 {

    /* renamed from: a */
    public static final /* synthetic */ int f29089a = 0;

    /* renamed from: a */
    public static final Exception m11897a(AbstractC3174c abstractC3174c, String str, Exception exc) throws FrameworkClassParsingException {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(abstractC3174c, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(abstractC3174c, str);
        }
        throw new FrameworkClassParsingException();
    }
}
