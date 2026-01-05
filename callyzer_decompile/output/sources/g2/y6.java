package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y6 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ boolean f13307a;

    /* renamed from: b */
    public final /* synthetic */ h1.j0 f13308b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f13309c;

    /* renamed from: d */
    public final /* synthetic */ k2.h2 f13310d;

    /* renamed from: e */
    public final /* synthetic */ k2.h2 f13311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(boolean z6, h1.j0 j0Var, k2.w0 w0Var, h1.p1 p1Var, h1.p1 p1Var2) {
        super(1);
        this.f13307a = z6;
        this.f13308b = j0Var;
        this.f13309c = w0Var;
        this.f13310d = p1Var;
        this.f13311e = p1Var2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        d3.i0 i0Var = (d3.i0) obj;
        k2.e1 e1Var = this.f13308b.f15486c;
        float fFloatValue = 0.8f;
        k2.h2 h2Var = this.f13310d;
        float fFloatValue2 = 1.0f;
        boolean z6 = this.f13307a;
        i0Var.m5167k(!z6 ? ((Number) h2Var.getValue()).floatValue() : ((Boolean) e1Var.getValue()).booleanValue() ? 1.0f : 0.8f);
        if (!z6) {
            fFloatValue = ((Number) h2Var.getValue()).floatValue();
        } else if (((Boolean) e1Var.getValue()).booleanValue()) {
            fFloatValue = 1.0f;
        }
        i0Var.m5168n(fFloatValue);
        if (!z6) {
            fFloatValue2 = ((Number) this.f13311e.getValue()).floatValue();
        } else if (!((Boolean) e1Var.getValue()).booleanValue()) {
            fFloatValue2 = DefinitionKt.NO_Float_VALUE;
        }
        i0Var.m5161b(fFloatValue2);
        i0Var.m5172v(((d3.p0) this.f13309c.getValue()).f7807a);
        return qw.a0.f30746a;
    }
}
