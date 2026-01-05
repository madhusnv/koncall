package nk;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import kk.AbstractC4092l;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.C4093m;
import kk.C4095o;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;
import kk.InterfaceC4104x;
import mk.AbstractC4770i;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends f0 {

    /* renamed from: a */
    public final InterfaceC4096p f24924a;

    /* renamed from: b */
    public final InterfaceC4091k f24925b;

    /* renamed from: c */
    public final C4088h f24926c;

    /* renamed from: d */
    public final TypeToken f24927d;

    /* renamed from: e */
    public final InterfaceC4104x f24928e;

    /* renamed from: f */
    public final boolean f24929f;

    /* renamed from: g */
    public volatile AbstractC4103w f24930g;

    public h0(InterfaceC4096p interfaceC4096p, InterfaceC4091k interfaceC4091k, C4088h c4088h, TypeToken typeToken, InterfaceC4104x interfaceC4104x, boolean z6) {
        this.f24924a = interfaceC4096p;
        this.f24925b = interfaceC4091k;
        this.f24926c = c4088h;
        this.f24927d = typeToken;
        this.f24928e = interfaceC4104x;
        this.f24929f = z6;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        InterfaceC4091k interfaceC4091k = this.f24925b;
        if (interfaceC4091k == null) {
            AbstractC4103w abstractC4103wM8859f = this.f24930g;
            if (abstractC4103wM8859f == null) {
                abstractC4103wM8859f = this.f24926c.m8859f(this.f24928e, this.f24927d);
                this.f24930g = abstractC4103wM8859f;
            }
            return abstractC4103wM8859f.mo8851b(c6564a);
        }
        AbstractC4092l abstractC4092lM9696i = AbstractC4770i.m9696i(c6564a);
        if (this.f24929f) {
            abstractC4092lM9696i.getClass();
            if (abstractC4092lM9696i instanceof C4093m) {
                return null;
            }
        }
        this.f24927d.getType();
        return interfaceC4091k.mo7644b(abstractC4092lM9696i);
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        InterfaceC4096p interfaceC4096p = this.f24924a;
        if (interfaceC4096p == null) {
            AbstractC4103w abstractC4103wM8859f = this.f24930g;
            if (abstractC4103wM8859f == null) {
                abstractC4103wM8859f = this.f24926c.m8859f(this.f24928e, this.f24927d);
                this.f24930g = abstractC4103wM8859f;
            }
            abstractC4103wM8859f.mo8852c(c6566c, obj);
            return;
        }
        if (this.f24929f && obj == null) {
            c6566c.mo10029J();
            return;
        }
        this.f24927d.getType();
        C4095o c4095oMo7643a = interfaceC4096p.mo7643a(obj);
        m1.f24967z.getClass();
        C5091n.m10020f(c6566c, c4095oMo7643a);
    }

    @Override // nk.f0
    /* renamed from: d */
    public final AbstractC4103w mo8853d() {
        if (this.f24924a != null) {
            return this;
        }
        AbstractC4103w abstractC4103w = this.f24930g;
        if (abstractC4103w != null) {
            return abstractC4103w;
        }
        AbstractC4103w abstractC4103wM8859f = this.f24926c.m8859f(this.f24928e, this.f24927d);
        this.f24930g = abstractC4103wM8859f;
        return abstractC4103wM8859f;
    }
}
