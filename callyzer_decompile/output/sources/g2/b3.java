package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import i2.AbstractC3154g;
import i2.InterfaceC3161n;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b3 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11238a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11239b;

    /* renamed from: c */
    public final /* synthetic */ Object f11240c;

    /* renamed from: d */
    public final /* synthetic */ C6734c f11241d;

    /* renamed from: e */
    public final /* synthetic */ boolean f11242e;

    /* renamed from: f */
    public final /* synthetic */ Object f11243f;

    /* renamed from: g */
    public final /* synthetic */ Object f11244g;

    /* renamed from: h */
    public final /* synthetic */ Object f11245h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(f0 f0Var, InterfaceC7879r interfaceC7879r, z2 z2Var, C6734c c6734c, InterfaceC2141e interfaceC2141e, boolean z6, u2 u2Var, int i10, int i11) {
        super(2);
        this.f11238a = i11;
        this.f11244g = f0Var;
        this.f11239b = interfaceC7879r;
        this.f11240c = z2Var;
        this.f11241d = c6734c;
        this.f11245h = interfaceC2141e;
        this.f11242e = z6;
        this.f11243f = u2Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11238a) {
            case 0:
                ((Number) obj2).intValue();
                h4 h4Var = (h4) this.f11244g;
                z2 z2Var = (z2) this.f11240c;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f11245h;
                u2 u2Var = (u2) this.f11243f;
                f4.m6142b(h4Var, this.f11239b, z2Var, this.f11241d, interfaceC2141e, this.f11242e, u2Var, (InterfaceC3962k) obj, C3953b.m8496A(3073));
                break;
            case 1:
                ((Number) obj2).intValue();
                v4 v4Var = (v4) this.f11244g;
                z2 z2Var2 = (z2) this.f11240c;
                C6734c c6734c = (C6734c) this.f11245h;
                u2 u2Var2 = (u2) this.f11243f;
                u4.m6318a(v4Var, this.f11239b, z2Var2, this.f11241d, c6734c, this.f11242e, u2Var2, (InterfaceC3962k) obj, C3953b.m8496A(224257));
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f11244g;
                InterfaceC3161n interfaceC3161n = (InterfaceC3161n) this.f11240c;
                InterfaceC7866e interfaceC7866e = (InterfaceC7866e) this.f11245h;
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) this.f11243f;
                AbstractC3154g.m7527a(this.f11242e, interfaceC2137a, this.f11239b, interfaceC3161n, interfaceC7866e, interfaceC2142f, this.f11241d, (InterfaceC3962k) obj, C3953b.m8496A(1572865));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, InterfaceC3161n interfaceC3161n, InterfaceC7866e interfaceC7866e, InterfaceC2142f interfaceC2142f, C6734c c6734c, int i10) {
        super(2);
        this.f11238a = 2;
        this.f11242e = z6;
        this.f11244g = interfaceC2137a;
        this.f11239b = interfaceC7879r;
        this.f11240c = interfaceC3161n;
        this.f11245h = interfaceC7866e;
        this.f11243f = interfaceC2142f;
        this.f11241d = c6734c;
    }
}
