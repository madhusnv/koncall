package g2;

import d3.AbstractC1561o;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p3 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f12394a;

    /* renamed from: b */
    public final /* synthetic */ long f12395b;

    /* renamed from: c */
    public final /* synthetic */ Object f12396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(int i10, long j6, Object obj) {
        super(0);
        this.f12394a = i10;
        this.f12396c = obj;
        this.f12395b = j6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f12394a) {
            case 0:
                ((InterfaceC2139c) this.f12396c).invoke(Long.valueOf(this.f12395b));
                return qw.a0.f30746a;
            case 1:
                return ((d3.j0) ((AbstractC1561o) this.f12396c)).mo5177b(this.f12395b);
            default:
                v3.o0 o0VarR0 = ((v3.s0) this.f12396c).f36992f.m14637a().R0();
                AbstractC4154l.m8920c(o0VarR0);
                o0VarR0.mo13314z(this.f12395b);
                return qw.a0.f30746a;
        }
    }
}
