package x1;

import c3.C0847b;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.s */
/* loaded from: classes.dex */
public final class C8269s extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f39671a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f39672b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f39673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8269s(int i10, InterfaceC2139c interfaceC2139c, k2.w0 w0Var) {
        super(1);
        this.f39671a = i10;
        this.f39672b = w0Var;
        this.f39673c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f39671a) {
            case 0:
                g4.l0 l0Var = (g4.l0) obj;
                this.f39672b.setValue(l0Var);
                this.f39673c.invoke(l0Var);
                break;
            default:
                long j6 = ((C0847b) obj).f5352a;
                g4.l0 l0Var2 = (g4.l0) this.f39672b.getValue();
                if (l0Var2 != null) {
                    this.f39673c.invoke(Integer.valueOf(l0Var2.f13671b.m6474g(j6)));
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
