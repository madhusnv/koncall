package e3;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.p */
/* loaded from: classes.dex */
public final class C1940p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f9152a;

    /* renamed from: b */
    public final /* synthetic */ C1941q f9153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1940p(C1941q c1941q, int i10) {
        super(1);
        this.f9152a = i10;
        this.f9153b = c1941q;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f9152a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f9153b.f9165n.mo5263a(w9.m11910a(dDoubleValue, r10.f9156e, r10.f9157f)));
            default:
                return Double.valueOf(w9.m11910a(this.f9153b.f9162k.mo5263a(((Number) obj).doubleValue()), r10.f9156e, r10.f9157f));
        }
    }
}
