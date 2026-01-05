package b2;

import c3.C0847b;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import p3.AbstractC5818p;
import p3.C5819q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3697a;

    /* renamed from: b */
    public final /* synthetic */ x1.d1 f3698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(x1.d1 d1Var, int i10) {
        super(1);
        this.f3697a = i10;
        this.f3698b = d1Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3697a) {
            case 0:
                C5819q c5819q = (C5819q) obj;
                this.f3698b.mo1688e(AbstractC5818p.m11403g(c5819q, false));
                c5819q.m11405a();
                break;
            default:
                this.f3698b.mo1684a(((C0847b) obj).f5352a);
                break;
        }
        return qw.a0.f30746a;
    }
}
