package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c6 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11303a = 0;

    /* renamed from: b */
    public final /* synthetic */ C6734c f11304b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11305c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f11306d;

    /* renamed from: e */
    public final /* synthetic */ int f11307e;

    /* renamed from: f */
    public final /* synthetic */ Object f11308f;

    /* renamed from: g */
    public final /* synthetic */ Object f11309g;

    /* renamed from: h */
    public final /* synthetic */ Object f11310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, d3.l0 l0Var, b6 b6Var, C6734c c6734c, int i10, int i11) {
        super(2);
        this.f11306d = interfaceC2137a;
        this.f11308f = interfaceC7879r;
        this.f11305c = z6;
        this.f11309g = l0Var;
        this.f11310h = b6Var;
        this.f11304b = c6734c;
        this.f11307e = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11303a) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f11308f;
                d3.l0 l0Var = (d3.l0) this.f11309g;
                b6 b6Var = (b6) this.f11310h;
                p9.m6244h(this.f11306d, interfaceC7879r, this.f11305c, l0Var, b6Var, this.f11304b, (InterfaceC3962k) obj, C3953b.m8496A(1572865), this.f11307e);
                break;
            default:
                ((Number) obj2).intValue();
                C6734c c6734c = (C6734c) this.f11308f;
                C6734c c6734c2 = (C6734c) this.f11309g;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f11310h;
                l8.m6203c(this.f11304b, c6734c, c6734c2, interfaceC2141e, this.f11305c, this.f11306d, (InterfaceC3962k) obj, C3953b.m8496A(this.f11307e | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC2141e interfaceC2141e, boolean z6, InterfaceC2137a interfaceC2137a, int i10) {
        super(2);
        this.f11304b = c6734c;
        this.f11308f = c6734c2;
        this.f11309g = c6734c3;
        this.f11310h = interfaceC2141e;
        this.f11305c = z6;
        this.f11306d = interfaceC2137a;
        this.f11307e = i10;
    }
}
