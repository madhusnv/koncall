package mg;

import org.bouncycastle.asn1.BERTags;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a */
    public final byte f23636a;

    /* renamed from: b */
    public final byte f23637b;

    public d1(int i10) {
        this.f23636a = (byte) (i10 & BERTags.FLAGS);
        this.f23637b = (byte) (i10 & 31);
    }
}
