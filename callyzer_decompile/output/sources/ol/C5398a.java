package ol;

import java.math.BigInteger;
import ml.AbstractC4787b;
import ml.C4788c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ol.a */
/* loaded from: classes.dex */
public final class C5398a extends AbstractC4787b {

    /* renamed from: b */
    public byte[] f27088b;

    /* renamed from: c */
    public final BigInteger f27089c;

    public C5398a(BigInteger bigInteger) {
        super(C4788c.f23824e);
        this.f27089c = bigInteger;
        this.f27088b = bigInteger.toByteArray();
    }

    @Override // ml.AbstractC4787b
    /* renamed from: a */
    public final Object mo9711a() {
        return this.f27089c;
    }
}
