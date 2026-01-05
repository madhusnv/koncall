package fz;

import dz.C1865b;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.userauth.UserAuthException;
import oj.C5392d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fz.d */
/* loaded from: classes3.dex */
public final class C2407d extends AbstractC2404a {

    /* renamed from: f */
    public static final C5392d f10892f = new C5392d(14);

    /* renamed from: d */
    public final C2405b f10893d;

    /* renamed from: e */
    public final C5392d f10894e;

    public C2407d(C2405b c2405b) {
        super("password");
        this.f10893d = c2405b;
        this.f10894e = f10892f;
    }

    @Override // fz.AbstractC2404a
    /* renamed from: a */
    public final C5035o mo6078a() {
        this.f10887a.mo5849y(m6079b(), "Requesting password for {}");
        C5035o c5035oMo6078a = super.mo6078a();
        c5035oMo6078a.m9911f((byte) 0);
        c5035oMo6078a.m9915j((char[]) this.f10893d.f10890a.clone());
        return c5035oMo6078a;
    }

    @Override // fz.AbstractC2404a
    /* renamed from: c */
    public final void mo6080c() {
        m6079b();
        this.f10894e.getClass();
        this.f10893d.getClass();
    }

    @Override // fz.AbstractC2404a, net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws TransportException, UserAuthException {
        EnumC5034n enumC5034n2 = EnumC5034n.USERAUTH_60;
        if (enumC5034n != enumC5034n2 || this.f10894e == null) {
            if (enumC5034n == enumC5034n2) {
                throw new UserAuthException("Password change request received; unsupported operation (newPassword was 'null')");
            }
            super.mo5498h(enumC5034n, c5035o);
            throw null;
        }
        this.f10887a.info("Received SSH_MSG_USERAUTH_PASSWD_CHANGEREQ.");
        try {
            c5035o.m9929x();
            c5035o.m9929x();
            m6079b();
            C5035o c5035oMo6078a = super.mo6078a();
            c5035oMo6078a.m9911f((byte) 1);
            c5035oMo6078a.m9915j((char[]) this.f10893d.f10890a.clone());
            c5035oMo6078a.m9915j(null);
            ((C1865b) this.f10889c.f42584c).f29508c.m14819i(c5035oMo6078a);
        } catch (Buffer$BufferException e2) {
            throw new TransportException(e2);
        }
    }
}
