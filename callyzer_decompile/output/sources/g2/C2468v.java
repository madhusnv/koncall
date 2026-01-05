package g2;

import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import qw.InterfaceC6355e;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.v */
/* loaded from: classes.dex */
public final class C2468v extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12912a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f12913b;

    /* renamed from: c */
    public final /* synthetic */ C6734c f12914c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2141e f12915d;

    /* renamed from: e */
    public final /* synthetic */ g4.o0 f12916e;

    /* renamed from: f */
    public final /* synthetic */ float f12917f;

    /* renamed from: g */
    public final /* synthetic */ int f12918g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6355e f12919h;

    /* renamed from: j */
    public final /* synthetic */ Object f12920j;

    /* renamed from: k */
    public final /* synthetic */ Object f12921k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2468v(InterfaceC7879r interfaceC7879r, C6734c c6734c, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, u2 u2Var, g4.o0 o0Var, float f6, C6734c c6734c2, int i10) {
        super(2);
        this.f12913b = interfaceC7879r;
        this.f12914c = c6734c;
        this.f12915d = interfaceC2141e;
        this.f12919h = interfaceC2141e2;
        this.f12920j = u2Var;
        this.f12916e = o0Var;
        this.f12917f = f6;
        this.f12921k = c6734c2;
        this.f12918g = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12912a) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) this.f12919h;
                o1.v1 v1Var = (o1.v1) this.f12920j;
                td tdVar = (td) this.f12921k;
                a0.m6110a(this.f12913b, this.f12914c, this.f12916e, this.f12915d, interfaceC2142f, this.f12917f, v1Var, tdVar, (InterfaceC3962k) obj, C3953b.m8496A(this.f12918g | 1));
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f12919h;
                u2 u2Var = (u2) this.f12920j;
                C6734c c6734c = (C6734c) this.f12921k;
                f4.m6141a(this.f12913b, this.f12914c, this.f12915d, interfaceC2141e, u2Var, this.f12916e, this.f12917f, c6734c, (InterfaceC3962k) obj, C3953b.m8496A(this.f12918g | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2468v(InterfaceC7879r interfaceC7879r, C6734c c6734c, g4.o0 o0Var, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, float f6, o1.v1 v1Var, td tdVar, int i10) {
        super(2);
        this.f12913b = interfaceC7879r;
        this.f12914c = c6734c;
        this.f12916e = o0Var;
        this.f12915d = interfaceC2141e;
        this.f12919h = interfaceC2142f;
        this.f12917f = f6;
        this.f12920j = v1Var;
        this.f12921k = tdVar;
        this.f12918g = i10;
    }
}
