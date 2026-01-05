package py;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5027g;
import net.schmizz.sshj.common.InterfaceC5036p;
import net.schmizz.sshj.common.SSHException;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: py.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6045a implements InterfaceC5036p, InterfaceC5027g {

    /* renamed from: a */
    public final InterfaceC2173b f29506a;

    /* renamed from: b */
    public final String f29507b;

    /* renamed from: c */
    public final C7833j f29508c;

    public AbstractC6045a(String str, C7833j c7833j) {
        this.f29507b = str;
        this.f29508c = c7833j;
        C5033m c5033m = (C5033m) c7833j.f37569d.f17616h;
        Class<?> cls = getClass();
        c5033m.getClass();
        this.f29506a = AbstractC2175d.m5852b(cls);
    }

    /* renamed from: a */
    public final void m12052a() {
        AbstractC6045a abstractC6045aM14813b = this.f29508c.m14813b();
        if (equals(abstractC6045aM14813b)) {
            return;
        }
        if (this.f29507b.equals(abstractC6045aM14813b.f29507b)) {
            this.f29508c.m14818g(this);
            return;
        }
        C7833j c7833j = this.f29508c;
        c7833j.f37575k.f25289a.f25293d.lock();
        try {
            c7833j.f37575k.f25289a.m10146a();
            c7833j.f37580q = this;
            String str = this.f29507b;
            c7833j.f37567b.mo5849y(str, "Sending SSH_MSG_SERVICE_REQUEST for {}");
            C5035o c5035o = new C5035o(EnumC5034n.SERVICE_REQUEST);
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            c5035o.m9912g(bytes.length, bytes);
            c7833j.m14819i(c5035o);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c7833j.f37575k.m10142a(30000);
        } finally {
            c7833j.f37575k.m10145d();
            c7833j.f37580q = null;
        }
    }

    @Override // net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) {
        C7833j c7833j = this.f29508c;
        long j6 = c7833j.f37573h.f37535d;
        c7833j.f37567b.mo5849y(Long.valueOf(j6), "Sending SSH_MSG_UNIMPLEMENTED for packet #{}");
        C5035o c5035o2 = new C5035o(EnumC5034n.UNIMPLEMENTED);
        c5035o2.m9918m(j6);
        c7833j.m14819i(c5035o2);
    }

    /* renamed from: j */
    public void mo5499j(SSHException sSHException) {
        this.f29506a.mo5849y(sSHException.toString(), "Notified of {}");
    }
}
