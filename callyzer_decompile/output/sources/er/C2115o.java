package er;

import ex.InterfaceC2137a;
import gr.C2713i;
import k2.w0;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2115o implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f9882a;

    /* renamed from: b */
    public final /* synthetic */ C2713i f9883b;

    /* renamed from: c */
    public final /* synthetic */ w0 f9884c;

    /* renamed from: d */
    public final /* synthetic */ w0 f9885d;

    /* renamed from: e */
    public final /* synthetic */ w0 f9886e;

    public /* synthetic */ C2115o(C2713i c2713i, w0 w0Var, w0 w0Var2, w0 w0Var3, int i10) {
        this.f9882a = i10;
        this.f9883b = c2713i;
        this.f9884c = w0Var;
        this.f9885d = w0Var2;
        this.f9886e = w0Var3;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f9882a) {
            case 0:
                this.f9884c.setValue(Boolean.FALSE);
                this.f9883b.m6713f(new C2109i((String) this.f9885d.getValue(), (String) this.f9886e.getValue()));
                break;
            case 1:
                this.f9883b.m6713f(new C2110j((String) this.f9884c.getValue(), (String) this.f9885d.getValue()));
                this.f9886e.setValue(Boolean.FALSE);
                break;
            default:
                String str = (String) this.f9884c.getValue();
                w0 w0Var = this.f9885d;
                this.f9883b.m6713f(new C2105e(str, (String) w0Var.getValue()));
                w0Var.setValue("");
                this.f9886e.setValue(Boolean.FALSE);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C2115o(w0 w0Var, C2713i c2713i, w0 w0Var2, w0 w0Var3) {
        this.f9882a = 0;
        this.f9884c = w0Var;
        this.f9883b = c2713i;
        this.f9885d = w0Var2;
        this.f9886e = w0Var3;
    }
}
