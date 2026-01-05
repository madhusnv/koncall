package kr;

import bs.C0753k;
import bs.C0754l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.w0;
import mr.C4863e;
import rv.C6641q;
import ws.C8170k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4190e implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f21238a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f21239b;

    /* renamed from: c */
    public final /* synthetic */ w0 f21240c;

    public /* synthetic */ C4190e(int i10, InterfaceC2139c interfaceC2139c, w0 w0Var) {
        this.f21238a = i10;
        this.f21239b = interfaceC2139c;
        this.f21240c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f21238a) {
            case 0:
                this.f21239b.invoke(-1L);
                this.f21240c.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f21239b.invoke(this.f21240c.getValue());
                break;
            case 2:
                this.f21239b.invoke(C6641q.f31895a);
                this.f21240c.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f21239b.invoke("");
                this.f21240c.setValue(Boolean.TRUE);
                break;
            case 4:
                this.f21239b.invoke(C8170k.f39093a);
                this.f21240c.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f21240c.setValue(Boolean.FALSE);
                this.f21239b.invoke(new C4863e(C0753k.f4765a));
                break;
            default:
                this.f21240c.setValue(Boolean.TRUE);
                this.f21239b.invoke(new C4863e(C0754l.f4766a));
                break;
        }
        return qw.a0.f30746a;
    }
}
