package h2;

import ex.InterfaceC2141e;
import g2.n6;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15728a;

    /* renamed from: b */
    public final /* synthetic */ long f15729b;

    /* renamed from: c */
    public final /* synthetic */ Object f15730c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2141e f15731d;

    /* renamed from: e */
    public final /* synthetic */ int f15732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(long j6, Object obj, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        super(2);
        this.f15728a = i11;
        this.f15729b = j6;
        this.f15730c = obj;
        this.f15731d = interfaceC2141e;
        this.f15732e = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15728a) {
            case 0:
                ((Number) obj2).intValue();
                g4.o0 o0Var = (g4.o0) this.f15730c;
                AbstractC2812q.m6910b(this.f15729b, o0Var, this.f15731d, (InterfaceC3962k) obj, C3953b.m8496A(this.f15732e | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                g4.o0 o0Var2 = (g4.o0) this.f15730c;
                s0.m6919b(this.f15729b, o0Var2, this.f15731d, (InterfaceC3962k) obj, C3953b.m8496A(this.f15732e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                j2.t0 t0Var = (j2.t0) this.f15730c;
                n6.m6219c(this.f15729b, t0Var, this.f15731d, (InterfaceC3962k) obj, C3953b.m8496A(this.f15732e | 1));
                break;
        }
        return qw.a0.f30746a;
    }
}
