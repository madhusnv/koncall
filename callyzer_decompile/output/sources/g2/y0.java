package g2;

import b2.C0566x;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import j1.C3518j;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f13277a = 0;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f13278b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f13279c;

    /* renamed from: d */
    public final /* synthetic */ boolean f13280d;

    /* renamed from: e */
    public final /* synthetic */ C6734c f13281e;

    /* renamed from: f */
    public final /* synthetic */ int f13282f;

    /* renamed from: g */
    public final /* synthetic */ Object f13283g;

    /* renamed from: h */
    public final /* synthetic */ Object f13284h;

    /* renamed from: j */
    public final /* synthetic */ Object f13285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, d3.l0 l0Var, u0 u0Var, v0 v0Var, C6734c c6734c, int i10) {
        super(2);
        this.f13278b = interfaceC2137a;
        this.f13279c = interfaceC7879r;
        this.f13280d = z6;
        this.f13283g = l0Var;
        this.f13284h = u0Var;
        this.f13285j = v0Var;
        this.f13281e = c6734c;
        this.f13282f = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13277a) {
            case 0:
                ((Number) obj2).intValue();
                d3.l0 l0Var = (d3.l0) this.f13283g;
                u0 u0Var = (u0) this.f13284h;
                v0 v0Var = (v0) this.f13285j;
                p9.m6241e(this.f13278b, this.f13279c, this.f13280d, l0Var, u0Var, v0Var, this.f13281e, (InterfaceC3962k) obj, C3953b.m8496A(this.f13282f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                C3518j c3518j = (C3518j) this.f13283g;
                C0566x c0566x = (C0566x) this.f13284h;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f13285j;
                pg.p7.m11822b(c3518j, this.f13278b, c0566x, this.f13279c, this.f13280d, interfaceC2137a, this.f13281e, (InterfaceC3962k) obj, C3953b.m8496A(this.f13282f | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(C3518j c3518j, InterfaceC2137a interfaceC2137a, C0566x c0566x, InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC2137a interfaceC2137a2, C6734c c6734c, int i10) {
        super(2);
        this.f13283g = c3518j;
        this.f13278b = interfaceC2137a;
        this.f13284h = c0566x;
        this.f13279c = interfaceC7879r;
        this.f13280d = z6;
        this.f13285j = interfaceC2137a2;
        this.f13281e = c6734c;
        this.f13282f = i10;
    }
}
