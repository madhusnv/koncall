package g1;

import androidx.compose.animation.AbstractC0235b;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.b6;
import g2.p9;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4630l;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.u */
/* loaded from: classes.dex */
public final class C2441u extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11085a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11086b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11087c;

    /* renamed from: d */
    public final /* synthetic */ int f11088d;

    /* renamed from: e */
    public final /* synthetic */ int f11089e;

    /* renamed from: f */
    public final /* synthetic */ Object f11090f;

    /* renamed from: g */
    public final /* synthetic */ Object f11091g;

    /* renamed from: h */
    public final /* synthetic */ Object f11092h;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2141e f11093j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441u(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, b6 b6Var, InterfaceC4630l interfaceC4630l, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        super(2);
        this.f11090f = interfaceC2137a;
        this.f11086b = interfaceC7879r;
        this.f11087c = z6;
        this.f11091g = b6Var;
        this.f11092h = interfaceC4630l;
        this.f11093j = interfaceC2141e;
        this.f11088d = i10;
        this.f11089e = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11085a) {
            case 0:
                ((Number) obj2).intValue();
                u0 u0Var = (u0) this.f11090f;
                v0 v0Var = (v0) this.f11091g;
                String str = (String) this.f11092h;
                C6734c c6734c = (C6734c) this.f11093j;
                AbstractC0235b.m629d(this.f11087c, this.f11086b, u0Var, v0Var, str, c6734c, (InterfaceC3962k) obj, C3953b.m8496A(this.f11088d | 1), this.f11089e);
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f11090f;
                b6 b6Var = (b6) this.f11091g;
                InterfaceC4630l interfaceC4630l = (InterfaceC4630l) this.f11092h;
                p9.m6246j(interfaceC2137a, this.f11086b, this.f11087c, b6Var, interfaceC4630l, this.f11093j, (InterfaceC3962k) obj, C3953b.m8496A(this.f11088d | 1), this.f11089e);
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441u(boolean z6, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, String str, C6734c c6734c, int i10, int i11) {
        super(2);
        this.f11087c = z6;
        this.f11086b = interfaceC7879r;
        this.f11090f = u0Var;
        this.f11091g = v0Var;
        this.f11092h = str;
        this.f11093j = c6734c;
        this.f11088d = i10;
        this.f11089e = i11;
    }
}
