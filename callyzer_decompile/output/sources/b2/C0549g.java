package b2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.C2460n;
import g2.pd;
import g2.vc;
import hz.AbstractC3063b;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import nc.AbstractC4992c;
import r4.EnumC6455j;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.g */
/* loaded from: classes.dex */
public final class C0549g extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3740a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3741b;

    /* renamed from: c */
    public final /* synthetic */ int f3742c;

    /* renamed from: d */
    public final /* synthetic */ Object f3743d;

    /* renamed from: e */
    public final /* synthetic */ Object f3744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0549g(Object obj, Object obj2, boolean z6, int i10, int i11) {
        super(2);
        this.f3740a = i11;
        this.f3743d = obj;
        this.f3744e = obj2;
        this.f3741b = z6;
        this.f3742c = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3740a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC3063b.m7289c((InterfaceC7879r) this.f3743d, (InterfaceC2137a) this.f3744e, this.f3741b, interfaceC3962k, C3953b.m8496A(this.f3742c | 1));
                break;
            case 1:
                AbstractC4992c.m9901b(this.f3741b, (EnumC6455j) this.f3743d, (y0) this.f3744e, interfaceC3962k, C3953b.m8496A(this.f3742c | 1));
                break;
            default:
                pd.m6266b((C2460n) this.f3743d, (vc) this.f3744e, this.f3741b, interfaceC3962k, C3953b.m8496A(this.f3742c | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0549g(boolean z6, EnumC6455j enumC6455j, y0 y0Var, int i10) {
        super(2);
        this.f3740a = 1;
        this.f3741b = z6;
        this.f3743d = enumC6455j;
        this.f3744e = y0Var;
        this.f3742c = i10;
    }
}
