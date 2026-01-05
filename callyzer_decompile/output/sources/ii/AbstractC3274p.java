package ii;

import ci.C0973a;
import java.security.SecureRandom;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.p */
/* loaded from: classes.dex */
public abstract class AbstractC3274p {

    /* renamed from: a */
    public static final C0973a f17473a = new C0973a(6);

    /* renamed from: a */
    public static byte[] m7624a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f17473a.get()).nextBytes(bArr);
        return bArr;
    }
}
