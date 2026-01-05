package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import j2.AbstractC3521a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f11281a;

    /* renamed from: b */
    public final /* synthetic */ t3.l0 f11282b;

    /* renamed from: c */
    public final /* synthetic */ t3.w0 f11283c;

    /* renamed from: d */
    public final /* synthetic */ k2.a1 f11284d;

    /* renamed from: e */
    public final /* synthetic */ k2.a1 f11285e;

    /* renamed from: f */
    public final /* synthetic */ k2.a1 f11286f;

    /* renamed from: g */
    public final /* synthetic */ k2.a1 f11287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t3.w0 w0Var, t3.l0 l0Var, t3.w0 w0Var2, k2.a1 a1Var, k2.a1 a1Var2, k2.a1 a1Var3, k2.a1 a1Var4) {
        super(1);
        this.f11281a = w0Var;
        this.f11282b = l0Var;
        this.f11283c = w0Var2;
        this.f11284d = a1Var;
        this.f11285e = a1Var2;
        this.f11286f = a1Var3;
        this.f11287g = a1Var4;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        t3.w0 w0Var = this.f11281a;
        int i10 = w0Var.f34030a;
        float f6 = AbstractC3521a.f18413a;
        t3.l0 l0Var = this.f11282b;
        boolean z6 = i10 > l0Var.e0(f6);
        float f10 = z6 ? e0.f11424a : e0.f11426c;
        float f11 = z6 ? e0.f11425b : e0.f11426c;
        t3.w0 w0Var2 = this.f11283c;
        t3.v0.m13319g(v0Var, w0Var2, 0, 0);
        int iE0 = w0Var2.f34030a - l0Var.e0(f10);
        int iE02 = l0Var.e0(f11) + (-w0Var.f34031b);
        float fM8490f = this.f11284d.m8490f() + iE02;
        float fM8490f2 = this.f11286f.m8490f() - ((this.f11285e.m8490f() + iE0) + w0Var.f34030a);
        float fM8490f3 = fM8490f - this.f11287g.m8490f();
        if (fM8490f2 < DefinitionKt.NO_Float_VALUE) {
            iE0 += AbstractC2747a.m6747k(fM8490f2);
        }
        if (fM8490f3 < DefinitionKt.NO_Float_VALUE) {
            iE02 -= AbstractC2747a.m6747k(fM8490f3);
        }
        t3.v0.m13319g(v0Var, w0Var, iE0, iE02);
        return qw.a0.f30746a;
    }
}
