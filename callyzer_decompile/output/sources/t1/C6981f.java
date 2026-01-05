package t1;

import ex.InterfaceC2137a;
import k2.a1;
import k2.b1;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.f */
/* loaded from: classes.dex */
public final class C6981f extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f33787a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7000y f33788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6981f(AbstractC7000y abstractC7000y, int i10) {
        super(0);
        this.f33787a = i10;
        this.f33788b = abstractC7000y;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f33787a) {
            case 0:
                return Integer.valueOf(this.f33788b.mo13252l());
            case 1:
                return Integer.valueOf(this.f33788b.mo13252l());
            case 2:
                AbstractC7000y abstractC7000y = this.f33788b;
                return Integer.valueOf(abstractC7000y.f33908k.mo7520a() ? abstractC7000y.f33917t.m8526f() : abstractC7000y.m13263j());
            default:
                AbstractC7000y abstractC7000y2 = this.f33788b;
                b1 b1Var = abstractC7000y2.f33916s;
                return Integer.valueOf(abstractC7000y2.m13262i(!abstractC7000y2.f33908k.mo7520a() ? abstractC7000y2.m13263j() : b1Var.m8526f() != -1 ? b1Var.m8526f() : Math.abs(((a1) abstractC7000y2.f33901d.f39d).m8490f()) >= Math.abs(Math.min(abstractC7000y2.f33914q.mo8435T(b0.f33756a), ((float) abstractC7000y2.m13265m()) / 2.0f) / ((float) abstractC7000y2.m13265m())) ? ((Boolean) abstractC7000y2.f33896F.getValue()).booleanValue() ? abstractC7000y2.f33902e + 1 : abstractC7000y2.f33902e : abstractC7000y2.m13263j()));
        }
    }
}
