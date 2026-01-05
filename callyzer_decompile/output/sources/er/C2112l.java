package er;

import ex.InterfaceC2142f;
import js.C3850f;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2112l implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f9866a;

    /* renamed from: b */
    public final /* synthetic */ w0 f9867b;

    /* renamed from: c */
    public final /* synthetic */ w0 f9868c;

    /* renamed from: d */
    public final /* synthetic */ w0 f9869d;

    /* renamed from: e */
    public final /* synthetic */ w0 f9870e;

    public /* synthetic */ C2112l(w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, int i10) {
        this.f9866a = i10;
        this.f9867b = w0Var;
        this.f9868c = w0Var2;
        this.f9869d = w0Var3;
        this.f9870e = w0Var4;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9866a) {
            case 0:
                String countryCodeStr = (String) obj;
                String phoneNumberStr = (String) obj2;
                String clientname = (String) obj3;
                AbstractC4154l.m8923f(countryCodeStr, "countryCodeStr");
                AbstractC4154l.m8923f(phoneNumberStr, "phoneNumberStr");
                AbstractC4154l.m8923f(clientname, "clientname");
                this.f9867b.setValue(phoneNumberStr);
                this.f9868c.setValue(countryCodeStr);
                this.f9869d.setValue(clientname);
                this.f9870e.setValue(Boolean.TRUE);
                break;
            default:
                String countryCodeStr2 = (String) obj2;
                String phoneNumberStr2 = (String) obj3;
                AbstractC4154l.m8923f(countryCodeStr2, "countryCodeStr");
                AbstractC4154l.m8923f(phoneNumberStr2, "phoneNumberStr");
                this.f9867b.setValue((C3850f) obj);
                this.f9868c.setValue(phoneNumberStr2);
                this.f9869d.setValue(countryCodeStr2);
                this.f9870e.setValue(Boolean.TRUE);
                break;
        }
        return a0.f30746a;
    }
}
