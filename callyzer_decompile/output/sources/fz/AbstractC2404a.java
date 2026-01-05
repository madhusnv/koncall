package fz;

import dz.C1865b;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import gz.C2748a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5036p;
import net.schmizz.sshj.userauth.UserAuthException;
import py.AbstractC6045a;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fz.a */
/* loaded from: classes3.dex */
public abstract class AbstractC2404a implements InterfaceC5036p {

    /* renamed from: a */
    public InterfaceC2173b f10887a = AbstractC2175d.m5852b(getClass());

    /* renamed from: b */
    public final String f10888b;

    /* renamed from: c */
    public C8849i f10889c;

    public AbstractC2404a(String str) {
        this.f10888b = str;
    }

    /* renamed from: a */
    public C5035o mo6078a() {
        C5035o c5035o = new C5035o(EnumC5034n.USERAUTH_REQUEST);
        this.f10889c.getClass();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = "uploaduser".getBytes(charset);
        c5035o.m9912g(bytes.length, bytes);
        byte[] bytes2 = ((AbstractC6045a) this.f10889c.f42583b).f29507b.getBytes(charset);
        c5035o.m9912g(bytes2.length, bytes2);
        c5035o.m9917l(this.f10888b, charset);
        return c5035o;
    }

    /* renamed from: b */
    public final C2748a m6079b() {
        C8849i c8849i = this.f10889c;
        c8849i.getClass();
        return new C2748a((String) ((C1865b) c8849i.f42584c).f29508c.f37582s.f26304b);
    }

    /* renamed from: c */
    public abstract void mo6080c();

    @Override // net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws UserAuthException {
        throw new UserAuthException("Unknown packet received during " + this.f10888b + " auth: " + enumC5034n);
    }
}
