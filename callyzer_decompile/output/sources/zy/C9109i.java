package zy;

import g2.f0;
import java.security.spec.ECGenParameterSpec;
import yy.C8830a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zy.i */
/* loaded from: classes3.dex */
public final class C9109i extends AbstractC9101a {

    /* renamed from: l */
    public final String f43677l;

    public C9109i(String str, C8830a c8830a) {
        super(new C9108h("EC", "ECDH"), c8830a);
        this.f43677l = str;
    }

    @Override // zy.AbstractC9101a
    /* renamed from: b */
    public final void mo15285b(f0 f0Var) {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec(this.f43677l);
        Object obj = this.f43652a.f37569d.f17610b;
        f0Var.mo6139b(eCGenParameterSpec);
    }
}
