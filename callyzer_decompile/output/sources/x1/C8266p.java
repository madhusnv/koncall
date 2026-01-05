package x1;

import bp.C0720d;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.p */
/* loaded from: classes.dex */
public final class C8266p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f39630a;

    /* renamed from: b */
    public final /* synthetic */ s1 f39631b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f39632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8266p(s1 s1Var, InterfaceC2139c interfaceC2139c, int i10) {
        super(1);
        this.f39630a = i10;
        this.f39631b = s1Var;
        this.f39632c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f39630a) {
            case 0:
                g4.l0 l0Var = (g4.l0) obj;
                s1 s1Var = this.f39631b;
                if (s1Var != null) {
                    s1Var.f39677a.setValue(l0Var);
                }
                InterfaceC2139c interfaceC2139c = this.f39632c;
                if (interfaceC2139c != null) {
                    interfaceC2139c.invoke(l0Var);
                }
                return qw.a0.f30746a;
            default:
                s1 s1Var2 = this.f39631b;
                C7320q c7320q = s1Var2.f39679c;
                InterfaceC2139c interfaceC2139c2 = this.f39632c;
                c7320q.add(interfaceC2139c2);
                return new C0720d(18, s1Var2, interfaceC2139c2);
        }
    }
}
