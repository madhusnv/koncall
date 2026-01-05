package k1;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import hp.C2995b;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4155m;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.m */
/* loaded from: classes.dex */
public final class C3938m implements q1 {

    /* renamed from: a */
    public final AbstractC4155m f20175a;

    /* renamed from: b */
    public final C3937l f20176b = new C3937l(this);

    /* renamed from: c */
    public final i1.b1 f20177c = new i1.b1();

    /* renamed from: d */
    public final k2.e1 f20178d;

    /* renamed from: e */
    public final k2.e1 f20179e;

    /* renamed from: f */
    public final k2.e1 f20180f;

    /* JADX WARN: Multi-variable type inference failed */
    public C3938m(InterfaceC2139c interfaceC2139c) {
        this.f20175a = (AbstractC4155m) interfaceC2139c;
        Boolean bool = Boolean.FALSE;
        this.f20178d = C3953b.m8517t(bool);
        this.f20179e = C3953b.m8517t(bool);
        this.f20180f = C3953b.m8517t(bool);
    }

    @Override // k1.q1
    /* renamed from: a */
    public final boolean mo7520a() {
        return ((Boolean) this.f20178d.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: b */
    public final Object mo7521b(i1.y0 y0Var, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        Object objM13488k = tx.c0.m13488k(new C2995b(this, y0Var, interfaceC2141e, null, 9), interfaceC7559c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : qw.a0.f30746a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // k1.q1
    /* renamed from: e */
    public final float mo7524e(float f6) {
        return ((Number) this.f20175a.invoke(Float.valueOf(f6))).floatValue();
    }
}
