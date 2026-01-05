package androidx.credentials.exceptions.publickeycredential;

import i6.AbstractC3174c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {

    /* renamed from: c */
    public static final /* synthetic */ int f2246c = 0;

    /* renamed from: b */
    public final AbstractC3174c f2247b;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetPublicKeyCredentialDomException(AbstractC3174c abstractC3174c, String str) {
        String type = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(abstractC3174c.f17099a);
        AbstractC4154l.m8923f(type, "type");
        super(str, type);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        this.f2247b = abstractC3174c;
    }
}
