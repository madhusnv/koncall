package qr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import ur.C7518k;
import ur.C7530w;
import ur.C7533z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.n */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6290n implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30572a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6297u f30573b;

    /* renamed from: c */
    public final /* synthetic */ int f30574c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f30575d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2137a f30576e;

    public /* synthetic */ C6290n(AbstractC6297u abstractC6297u, int i10, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a) {
        this.f30573b = abstractC6297u;
        this.f30574c = i10;
        this.f30575d = interfaceC2139c;
        this.f30576e = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30572a) {
            case 0:
                ((Integer) obj2).intValue();
                int iM8496A = C3953b.m8496A(this.f30574c | 1);
                this.f30573b.m12326b(iM8496A, this.f30576e, this.f30575d, (InterfaceC3962k) obj);
                break;
            default:
                LocalDateTime dialogStartDate = (LocalDateTime) obj;
                LocalDateTime dialogEndDate = (LocalDateTime) obj2;
                AbstractC4154l.m8923f(dialogStartDate, "dialogStartDate");
                AbstractC4154l.m8923f(dialogEndDate, "dialogEndDate");
                C6294r c6294r = (C6294r) this.f30573b;
                List list = ((C7530w) c6294r.f30595h.f39340a.getValue()).f36269a;
                C7533z c7533z = new C7533z(dialogStartDate, dialogEndDate);
                int i10 = this.f30574c;
                list.set(i10, c7533z);
                this.f30575d.invoke(new C7518k(i10, c6294r.f30598k));
                this.f30576e.invoke();
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6290n(AbstractC6297u abstractC6297u, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, int i10) {
        this.f30573b = abstractC6297u;
        this.f30575d = interfaceC2139c;
        this.f30576e = interfaceC2137a;
        this.f30574c = i10;
    }
}
