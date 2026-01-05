package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.w0;
import kq.C4181k;
import mq.C4849q;
import mq.C4851s;
import mq.C4853u;
import mq.o0;
import mq.q0;
import mq.r0;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3005j implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16216a;

    /* renamed from: b */
    public final /* synthetic */ w0 f16217b;

    /* renamed from: c */
    public final /* synthetic */ w0 f16218c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f16219d;

    public /* synthetic */ C3005j(InterfaceC2139c interfaceC2139c, w0 w0Var, w0 w0Var2) {
        this.f16216a = 1;
        this.f16217b = w0Var;
        this.f16218c = w0Var2;
        this.f16219d = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        String str;
        switch (this.f16216a) {
            case 0:
                this.f16217b.setValue(Boolean.FALSE);
                this.f16219d.invoke(new C4851s((C4181k) this.f16218c.getValue()));
                break;
            case 1:
                this.f16217b.setValue(Boolean.FALSE);
                C4181k c4181k = (C4181k) this.f16218c.getValue();
                if (c4181k != null) {
                    this.f16219d.invoke(new C4853u(c4181k.f21193d + c4181k.f21192c));
                }
                return qw.a0.f30746a;
            case 2:
                w0 w0Var = this.f16217b;
                this.f16219d.invoke(new C4849q((String) w0Var.getValue()));
                w0Var.setValue("");
                this.f16218c.setValue(Boolean.FALSE);
                break;
            case 3:
                w0 w0Var2 = this.f16217b;
                this.f16219d.invoke(new o0((String) w0Var2.getValue()));
                w0Var2.setValue("");
                this.f16218c.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f16217b.setValue(Boolean.FALSE);
                this.f16219d.invoke(new q0((C9008h) this.f16218c.getValue()));
                break;
            default:
                C9008h c9008h = (C9008h) this.f16217b.getValue();
                if (c9008h == null || (str = c9008h.f43398d) == null) {
                    str = "";
                }
                this.f16219d.invoke(new r0(str));
                this.f16218c.setValue(Boolean.FALSE);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C3005j(InterfaceC2139c interfaceC2139c, w0 w0Var, w0 w0Var2, int i10) {
        this.f16216a = i10;
        this.f16219d = interfaceC2139c;
        this.f16217b = w0Var;
        this.f16218c = w0Var2;
    }

    public /* synthetic */ C3005j(w0 w0Var, InterfaceC2139c interfaceC2139c, w0 w0Var2, int i10) {
        this.f16216a = i10;
        this.f16217b = w0Var;
        this.f16219d = interfaceC2139c;
        this.f16218c = w0Var2;
    }
}
