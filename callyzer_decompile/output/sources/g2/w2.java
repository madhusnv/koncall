package g2;

import b2.C0566x;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import h1.C2772c;
import j1.AbstractC3520l;
import j1.C3509a;
import j1.C3518j;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;
import w4.InterfaceC7930v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w2 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f13093a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f13094b;

    /* renamed from: c */
    public final /* synthetic */ Object f13095c;

    /* renamed from: d */
    public final /* synthetic */ Object f13096d;

    /* renamed from: e */
    public final /* synthetic */ Object f13097e;

    /* renamed from: f */
    public final /* synthetic */ Object f13098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(InterfaceC2137a interfaceC2137a, a8 a8Var, C2772c c2772c, C6734c c6734c, int i10) {
        super(2);
        this.f13095c = interfaceC2137a;
        this.f13096d = a8Var;
        this.f13097e = c2772c;
        this.f13098f = c6734c;
        this.f13094b = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13093a) {
            case 0:
                ((Number) obj2).intValue();
                y2 y2Var = (y2) this.f13095c;
                Long l9 = (Long) this.f13096d;
                z2 z2Var = (z2) this.f13097e;
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f13098f;
                y2Var.m6348a(l9, this.f13094b, z2Var, interfaceC7879r, (InterfaceC3962k) obj, C3953b.m8496A(27649));
                break;
            case 1:
                ((Number) obj2).intValue();
                p9.m6247k((InterfaceC2137a) this.f13095c, (a8) this.f13096d, (C2772c) this.f13097e, (C6734c) this.f13098f, (InterfaceC3962k) obj, C3953b.m8496A(this.f13094b | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                pg.p7.m11821a((C3518j) this.f13095c, (InterfaceC2137a) this.f13096d, (InterfaceC7879r) this.f13098f, (C0566x) this.f13097e, (InterfaceC3962k) obj, C3953b.m8496A(this.f13094b | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC3520l.m8078d((InterfaceC7930v) this.f13095c, (InterfaceC2137a) this.f13096d, (C3509a) this.f13097e, (C0566x) this.f13098f, (InterfaceC3962k) obj, C3953b.m8496A(this.f13094b | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(y2 y2Var, Long l9, int i10, z2 z2Var, InterfaceC7879r interfaceC7879r, int i11) {
        super(2);
        this.f13095c = y2Var;
        this.f13096d = l9;
        this.f13094b = i10;
        this.f13097e = z2Var;
        this.f13098f = interfaceC7879r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(C3518j c3518j, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, C0566x c0566x, int i10) {
        super(2);
        this.f13095c = c3518j;
        this.f13096d = interfaceC2137a;
        this.f13098f = interfaceC7879r;
        this.f13097e = c0566x;
        this.f13094b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(InterfaceC7930v interfaceC7930v, InterfaceC2137a interfaceC2137a, C3509a c3509a, C0566x c0566x, int i10) {
        super(2);
        this.f13095c = interfaceC7930v;
        this.f13096d = interfaceC2137a;
        this.f13097e = c3509a;
        this.f13098f = c0566x;
        this.f13094b = i10;
    }
}
