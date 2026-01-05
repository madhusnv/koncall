package ii;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import of.C5359n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.n */
/* loaded from: classes.dex */
public final class C3272n extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ C5359n f17470a;

    public C3272n(C5359n c5359n) {
        this.f17470a = c5359n;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        C5359n c5359n = this.f17470a;
        try {
            Mac mac = (Mac) C3269k.f17467f.m7622a((String) c5359n.f26305c);
            mac.init((SecretKeySpec) c5359n.f26306d);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
