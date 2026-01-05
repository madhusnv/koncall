package h2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import i2.AbstractC3154g;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15760a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f15761b;

    /* renamed from: c */
    public final /* synthetic */ int f15762c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6355e f15763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j6, InterfaceC2141e interfaceC2141e, int i10) {
        super(2);
        this.f15761b = j6;
        this.f15763d = interfaceC2141e;
        this.f15762c = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15760a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                s0.m6920c(this.f15761b, (InterfaceC2141e) this.f15763d, interfaceC3962k, C3953b.m8496A(this.f15762c | 1));
                break;
            default:
                AbstractC3154g.m7528b((InterfaceC2137a) this.f15763d, this.f15761b, interfaceC3962k, C3953b.m8496A(this.f15762c | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(InterfaceC2137a interfaceC2137a, long j6, int i10) {
        super(2);
        this.f15763d = interfaceC2137a;
        this.f15761b = j6;
        this.f15762c = i10;
    }
}
