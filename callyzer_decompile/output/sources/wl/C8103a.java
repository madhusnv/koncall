package wl;

import g2.f0;
import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import yy.C8830a;
import zy.AbstractC9101a;
import zy.C9105e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wl.a */
/* loaded from: classes.dex */
public final class C8103a extends AbstractC9101a {

    /* renamed from: l */
    public final BigInteger f38768l;

    /* renamed from: m */
    public final BigInteger f38769m;

    public C8103a(BigInteger bigInteger, BigInteger bigInteger2, C8830a c8830a) {
        super(new C9105e(), c8830a);
        this.f38768l = bigInteger;
        this.f38769m = bigInteger2;
    }

    @Override // zy.AbstractC9101a
    /* renamed from: b */
    public final void mo15285b(f0 f0Var) {
        DHParameterSpec dHParameterSpec = new DHParameterSpec(this.f38768l, this.f38769m);
        Object obj = this.f43652a.f37569d.f17610b;
        f0Var.mo6139b(dHParameterSpec);
    }
}
