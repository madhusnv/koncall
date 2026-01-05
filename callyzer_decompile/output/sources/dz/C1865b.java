package dz;

import fz.AbstractC2404a;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.userauth.UserAuthException;
import ny.C5189c;
import py.AbstractC6045a;
import qy.C6382c;
import vy.C7833j;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dz.b */
/* loaded from: classes3.dex */
public final class C1865b extends AbstractC6045a {

    /* renamed from: d */
    public final C5189c f8851d;

    /* renamed from: e */
    public volatile List f8852e;

    /* renamed from: f */
    public volatile AbstractC2404a f8853f;

    /* renamed from: g */
    public volatile AbstractC6045a f8854g;

    public C1865b(C7833j c7833j) {
        super("ssh-userauth", c7833j);
        this.f8852e = new LinkedList();
        this.f8851d = new C5189c("authenticated", UserAuthException.f24795c, null, (C5033m) c7833j.f37569d.f17616h);
    }

    /* renamed from: b */
    public final boolean m5497b(C6382c c6382c, AbstractC2404a abstractC2404a) {
        this.f8851d.f25293d.lock();
        try {
            m12052a();
            this.f8853f = abstractC2404a;
            this.f8854g = c6382c;
            this.f8853f.f10889c = new C8849i(2, this, c6382c, false);
            this.f8851d.m10146a();
            this.f29506a.mo5849y(abstractC2404a.f10888b, "Trying `{}` auth...");
            AbstractC2404a abstractC2404a2 = this.f8853f;
            ((C1865b) abstractC2404a2.f10889c.f42584c).f29508c.m14819i(abstractC2404a2.mo6078a());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            boolean zBooleanValue = ((Boolean) this.f8851d.m10149d(30000)).booleanValue();
            if (zBooleanValue) {
                this.f29506a.mo5849y(abstractC2404a.f10888b, "`{}` auth successful");
            } else {
                this.f29506a.mo5849y(abstractC2404a.f10888b, "`{}` auth failed");
            }
            this.f8853f = null;
            this.f8854g = null;
            this.f8851d.f25293d.unlock();
            return zBooleanValue;
        } catch (Throwable th2) {
            this.f8853f = null;
            this.f8854g = null;
            this.f8851d.f25293d.unlock();
            throw th2;
        }
    }

    @Override // py.AbstractC6045a, net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws TransportException {
        if (!enumC5034n.in(50, 80)) {
            throw new TransportException(EnumC5023c.PROTOCOL_ERROR, null, null);
        }
        this.f8851d.f25293d.lock();
        try {
            int i10 = AbstractC1864a.f8850a[enumC5034n.ordinal()];
            if (i10 == 1) {
                c5035o.m9929x();
            } else if (i10 == 2) {
                C7833j c7833j = this.f29508c;
                c7833j.f37578n = true;
                ReentrantLock reentrantLock = c7833j.f37572g.f37546i;
                reentrantLock.lock();
                reentrantLock.unlock();
                c7833j.f37573h.getClass();
                this.f29508c.m14818g(this.f8854g);
                this.f8851d.m10147b(Boolean.TRUE);
            } else if (i10 != 3) {
                this.f29506a.mo5828d("Asking `{}` method to handle {} packet", this.f8853f.f10888b, enumC5034n);
                try {
                    this.f8853f.mo5498h(enumC5034n, c5035o);
                } catch (UserAuthException e2) {
                    this.f8851d.m10148c(e2);
                }
            } else {
                this.f8852e = Arrays.asList(c5035o.m9929x().split(","));
                c5035o.m9923r();
                if (this.f8852e.contains(this.f8853f.f10888b)) {
                    this.f8853f.mo6080c();
                }
                this.f8851d.m10147b(Boolean.FALSE);
            }
        } finally {
            this.f8851d.f25293d.unlock();
        }
    }

    @Override // py.AbstractC6045a, net.schmizz.sshj.common.InterfaceC5027g
    /* renamed from: j */
    public final void mo5499j(SSHException sSHException) {
        super.mo5499j(sSHException);
        this.f8851d.m10148c(sSHException);
    }
}
