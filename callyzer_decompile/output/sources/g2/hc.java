package g2;

import androidx.compose.ui.draw.AbstractC0258a;
import ex.InterfaceC2142f;
import fb.AbstractC2250x;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4629k;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class hc extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4629k f11750a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11751b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11752c;

    /* renamed from: d */
    public final /* synthetic */ ec f11753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(InterfaceC4629k interfaceC4629k, boolean z6, boolean z10, ec ecVar) {
        super(3);
        jc jcVar = jc.f11877a;
        jc jcVar2 = jc.f11877a;
        this.f11750a = interfaceC4629k;
        this.f11751b = z6;
        this.f11752c = z10;
        this.f11753d = ecVar;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        c3966o.m8607Y(-891038934);
        k2.w0 w0VarM6921d = h2.s0.m6921d(this.f11751b, this.f11752c, ((Boolean) AbstractC2250x.m5950d(this.f11750a, c3966o, 0).getValue()).booleanValue(), this.f11753d, jc.f11881e, jc.f11880d, c3966o, 0);
        int i10 = nc.f12219a;
        InterfaceC7879r interfaceC7879rM709c = AbstractC0258a.m709c(C7876o.f37669a, new p2(w0VarM6921d, 1));
        c3966o.m8623p(false);
        return interfaceC7879rM709c;
    }
}
