package qy;

import f00.InterfaceC2173b;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5027g;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.connection.ConnectionException;
import net.schmizz.sshj.connection.channel.OpenFailException;
import ny.C5189c;
import oy.C5777a;
import py.AbstractC6045a;
import sy.C6966b;
import vy.C7830g;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qy.c */
/* loaded from: classes3.dex */
public final class C6382c extends AbstractC6045a implements InterfaceC6380a {

    /* renamed from: d */
    public final Object f30781d;

    /* renamed from: e */
    public final AtomicInteger f30782e;

    /* renamed from: f */
    public final ConcurrentHashMap f30783f;

    /* renamed from: g */
    public final ConcurrentHashMap f30784g;

    /* renamed from: h */
    public final LinkedList f30785h;

    /* renamed from: j */
    public final C7830g f30786j;

    /* renamed from: k */
    public final long f30787k;

    /* renamed from: l */
    public final int f30788l;

    /* renamed from: m */
    public volatile int f30789m;

    public C6382c(C7833j c7833j, C5777a c5777a) {
        super("ssh-connection", c7833j);
        this.f30781d = new Object();
        this.f30782e = new AtomicInteger();
        this.f30783f = new ConcurrentHashMap();
        this.f30784g = new ConcurrentHashMap();
        this.f30785h = new LinkedList();
        this.f30787k = 2097152L;
        this.f30788l = 32768;
        this.f30789m = 30000;
        c5777a.getClass();
        this.f30786j = new C7830g(this, "sshj-Heartbeater");
    }

    /* renamed from: b */
    public final void m12368b(C5035o c5035o) {
        synchronized (this.f30785h) {
            try {
                C5189c c5189c = (C5189c) this.f30785h.poll();
                if (c5189c == null) {
                    throw new ConnectionException(EnumC5023c.PROTOCOL_ERROR, "Got a global request response when none was requested", null);
                }
                if (c5035o == null) {
                    c5189c.m10148c(new ConnectionException("Global request [" + c5189c + "] failed"));
                } else {
                    c5189c.m10147b(new C5035o(c5035o));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // py.AbstractC6045a, net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws ConnectionException {
        if (enumC5034n.in(91, 100)) {
            try {
                int iM9930y = (int) c5035o.m9930y();
                C6966b c6966b = (C6966b) this.f30783f.get(Integer.valueOf(iM9930y));
                if (c6966b != null) {
                    c6966b.mo5498h(enumC5034n, c5035o);
                    return;
                }
                c5035o.f24776b -= 5;
                throw new ConnectionException(EnumC5023c.PROTOCOL_ERROR, "Received " + EnumC5034n.fromByte(c5035o.m9924s()) + " on unknown channel #" + iM9930y, null);
            } catch (Buffer$BufferException e2) {
                throw new ConnectionException(e2);
            }
        }
        if (!enumC5034n.in(80, 90)) {
            super.mo5498h(enumC5034n, c5035o);
            return;
        }
        int i10 = AbstractC6381b.f30780a[enumC5034n.ordinal()];
        C7833j c7833j = this.f29508c;
        InterfaceC2173b interfaceC2173b = this.f29506a;
        if (i10 == 1) {
            try {
                String strM9929x = c5035o.m9929x();
                boolean zM9923r = c5035o.m9923r();
                interfaceC2173b.mo5828d("Received GLOBAL_REQUEST `{}`; want reply: {}", strM9929x, Boolean.valueOf(zM9923r));
                if (zM9923r) {
                    c7833j.m14819i(new C5035o(EnumC5034n.REQUEST_FAILURE));
                    return;
                }
                return;
            } catch (Buffer$BufferException e10) {
                throw new ConnectionException(e10);
            }
        }
        if (i10 == 2) {
            m12368b(c5035o);
            return;
        }
        if (i10 == 3) {
            m12368b(null);
            return;
        }
        if (i10 != 4) {
            super.mo5498h(enumC5034n, c5035o);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f30784g;
        try {
            String strM9929x2 = c5035o.m9929x();
            interfaceC2173b.mo5849y(strM9929x2, "Received CHANNEL_OPEN for `{}` channel");
            if (concurrentHashMap.containsKey(strM9929x2)) {
                if (concurrentHashMap.get(strM9929x2) != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            interfaceC2173b.mo5833i(strM9929x2, "No opener found for `{}` CHANNEL_OPEN request -- rejecting");
            int iM9930y2 = (int) c5035o.m9930y();
            OpenFailException.EnumC5038a enumC5038a = OpenFailException.EnumC5038a.UNKNOWN_CHANNEL_TYPE;
            C5035o c5035o2 = new C5035o(EnumC5034n.CHANNEL_OPEN_FAILURE);
            c5035o2.m9919n(iM9930y2);
            c5035o2.m9918m(enumC5038a.getCode());
            byte[] bytes = "".getBytes(StandardCharsets.UTF_8);
            c5035o2.m9912g(bytes.length, bytes);
            c7833j.m14819i(c5035o2);
        } catch (Buffer$BufferException e11) {
            throw new ConnectionException(e11);
        }
    }

    @Override // py.AbstractC6045a, net.schmizz.sshj.common.InterfaceC5027g
    /* renamed from: j */
    public final void mo5499j(SSHException sSHException) {
        super.mo5499j(sSHException);
        synchronized (this.f30785h) {
            Iterator it = this.f30785h.iterator();
            while (it.hasNext()) {
                ((C5189c) it.next()).m10148c(sSHException);
            }
            this.f30785h.clear();
        }
        this.f30786j.interrupt();
        Iterator it2 = this.f30783f.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC5027g) it2.next()).mo5499j(sSHException);
        }
        this.f30783f.clear();
    }
}
