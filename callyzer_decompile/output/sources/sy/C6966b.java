package sy;

import bl.C0689a;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import mm.AbstractC4801l;
import net.schmizz.sshj.common.AbstractC5030j;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5027g;
import net.schmizz.sshj.common.InterfaceC5036p;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.connection.ConnectionException;
import net.schmizz.sshj.connection.channel.OpenFailException;
import net.schmizz.sshj.transport.TransportException;
import ny.C5187a;
import ny.C5189c;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qy.C6382c;
import qy.InterfaceC6380a;
import ry.AbstractC6685a;
import ry.C6686b;
import ry.C6687c;
import ry.C6688d;
import ry.C6689e;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sy.b */
/* loaded from: classes3.dex */
public final class C6966b implements Closeable, InterfaceC5036p, InterfaceC5027g {

    /* renamed from: a */
    public final C5033m f33726a;

    /* renamed from: b */
    public final InterfaceC2173b f33727b;

    /* renamed from: c */
    public final C7833j f33728c;

    /* renamed from: d */
    public final InterfaceC6380a f33729d;

    /* renamed from: e */
    public final String f33730e;

    /* renamed from: f */
    public final int f33731f;

    /* renamed from: g */
    public int f33732g;

    /* renamed from: h */
    public final Charset f33733h;

    /* renamed from: j */
    public final LinkedList f33734j = new LinkedList();

    /* renamed from: k */
    public final ReentrantLock f33735k;

    /* renamed from: l */
    public final C5187a f33736l;

    /* renamed from: m */
    public final C5187a f33737m;

    /* renamed from: n */
    public boolean f33738n;

    /* renamed from: p */
    public final C6688d f33739p;

    /* renamed from: q */
    public final C6686b f33740q;

    /* renamed from: r */
    public C6689e f33741r;

    /* renamed from: s */
    public C6687c f33742s;

    /* renamed from: t */
    public final C6686b f33743t;

    /* renamed from: v */
    public boolean f33744v;

    public C6966b(C6382c c6382c, Charset charset) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f33735k = reentrantLock;
        this.f33729d = c6382c;
        C5033m c5033m = (C5033m) c6382c.f29508c.f37569d.f17616h;
        this.f33726a = c5033m;
        this.f33730e = "session";
        Class<?> cls = getClass();
        c5033m.getClass();
        this.f33727b = AbstractC2175d.m5852b(cls);
        C7833j c7833j = c6382c.f29508c;
        this.f33728c = c7833j;
        this.f33733h = charset == null ? StandardCharsets.UTF_8 : charset;
        int andIncrement = c6382c.f30782e.getAndIncrement();
        this.f33731f = andIncrement;
        C6688d c6688d = new C6688d(c6382c.f30787k, c6382c.f30788l, c5033m);
        this.f33739p = c6688d;
        this.f33740q = new C6686b(this, c7833j, c6688d);
        String strM11232c = AbstractC5601a.m11232c(andIncrement, "chan#", " / open");
        C0689a c0689a = ConnectionException.f24789c;
        this.f33736l = new C5187a(strM11232c, c0689a, reentrantLock, c5033m);
        this.f33737m = new C5187a(AbstractC5601a.m11232c(andIncrement, "chan#", " / close"), c0689a, reentrantLock, c5033m);
        InterfaceC2173b interfaceC2173b = c6382c.f29506a;
        String str = this.f33730e;
        int i10 = this.f33731f;
        interfaceC2173b.mo5828d("Attaching `{}` channel (#{})", str, Integer.valueOf(i10));
        c6382c.f30783f.put(Integer.valueOf(i10), this);
        this.f33743t = new C6686b(this, this.f33728c, this.f33739p);
    }

    /* renamed from: A */
    public final void m13241A() {
        ReentrantLock reentrantLock = this.f33735k;
        reentrantLock.lock();
        try {
            if (!this.f33738n) {
                this.f33727b.debug("Sending close");
                C7833j c7833j = this.f33728c;
                C5035o c5035o = new C5035o(EnumC5034n.CHANNEL_CLOSE);
                c5035o.m9919n(this.f33732g);
                c7833j.m14819i(c5035o);
            }
        } finally {
            this.f33738n = true;
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33735k.lock();
        try {
            if (isOpen()) {
                try {
                    m13241A();
                } catch (TransportException e2) {
                    C5189c c5189c = this.f33737m.f25289a;
                    ReentrantLock reentrantLock = c5189c.f25293d;
                    reentrantLock.lock();
                    try {
                        if (!(c5189c.f25296g != null)) {
                            throw e2;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                C5187a c5187a = this.f33737m;
                long j6 = ((C6382c) this.f33729d).f30789m;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c5187a.m10142a(j6);
            }
        } finally {
            this.f33735k.unlock();
        }
    }

    @Override // net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws ConnectionException {
        int i10 = AbstractC6685a.f31975a[enumC5034n.ordinal()];
        InterfaceC2173b interfaceC2173b = this.f33727b;
        switch (i10) {
            case 1:
                m13245z(this.f33740q, c5035o);
                return;
            case 2:
                try {
                    int iM9930y = (int) c5035o.m9930y();
                    if (iM9930y == 1) {
                        m13245z(this.f33743t, c5035o);
                        return;
                    }
                    throw new ConnectionException(EnumC5023c.PROTOCOL_ERROR, "Bad extended data type = " + iM9930y, null);
                } catch (Buffer$BufferException e2) {
                    throw new ConnectionException(e2);
                }
            case 3:
                try {
                    long jM9930y = c5035o.m9930y();
                    interfaceC2173b.mo5849y(Long.valueOf(jM9930y), "Received window adjustment for {} bytes");
                    this.f33741r.m12827b(jM9930y);
                    return;
                } catch (Buffer$BufferException e10) {
                    throw new ConnectionException(e10);
                }
            case 4:
                try {
                    String strM9929x = c5035o.m9929x();
                    c5035o.m9923r();
                    interfaceC2173b.mo5849y(strM9929x, "Got chan request for `{}`");
                    try {
                        if ("xon-xoff".equals(strM9929x)) {
                            c5035o.m9923r();
                            return;
                        }
                        if ("exit-status".equals(strM9929x)) {
                            c5035o.m9930y();
                            return;
                        }
                        if ("exit-signal".equals(strM9929x)) {
                            EnumC6967c.fromString(c5035o.m9929x());
                            c5035o.m9923r();
                            c5035o.m9929x();
                            m13241A();
                            return;
                        }
                        C7833j c7833j = this.f33728c;
                        C5035o c5035o2 = new C5035o(EnumC5034n.CHANNEL_FAILURE);
                        c5035o2.m9919n(this.f33732g);
                        c7833j.m14819i(c5035o2);
                        return;
                    } catch (Buffer$BufferException e11) {
                        throw new ConnectionException(e11);
                    }
                } catch (Buffer$BufferException e12) {
                    throw new ConnectionException(e12);
                }
            case 5:
                m13243u(true);
                return;
            case 6:
                m13243u(false);
                return;
            case 7:
                interfaceC2173b.debug("Got EOF");
                this.f33743t.m12825n();
                this.f33740q.m12825n();
                return;
            case 8:
                interfaceC2173b.debug("Got close");
                try {
                    AbstractC5030j.m9936a(this.f33743t);
                    AbstractC5030j.m9936a(this.f33740q, this.f33742s);
                    m13241A();
                    return;
                } finally {
                    m13242n();
                }
            default:
                int i11 = AbstractC6965a.f33725a[enumC5034n.ordinal()];
                C5187a c5187a = this.f33736l;
                if (i11 == 1) {
                    try {
                    } catch (Buffer$BufferException e13) {
                        e = e13;
                    }
                    try {
                        m13244w((int) c5035o.m9930y(), c5035o.m9930y(), c5035o.m9930y());
                        c5187a.m10144c();
                        return;
                    } catch (Buffer$BufferException e14) {
                        e = e14;
                        throw new ConnectionException(e);
                    }
                }
                if (i11 != 2) {
                    this.f33727b.mo5833i(enumC5034n, "Got unknown packet with type {}");
                    return;
                }
                try {
                    c5187a.f25289a.m10148c(new OpenFailException(this.f33730e, (int) c5035o.m9930y(), c5035o.m9929x()));
                    return;
                } catch (Buffer$BufferException e15) {
                    throw new ConnectionException(e15);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isOpen() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f33735k
            r0.lock()
            ny.a r1 = r2.f33736l     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.m10143b()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            ny.a r1 = r2.f33737m     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.m10143b()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            boolean r1 = r2.f33738n     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            r1 = 1
            goto L1e
        L1b:
            r1 = move-exception
            goto L22
        L1d:
            r1 = 0
        L1e:
            r0.unlock()
            return r1
        L22:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sy.C6966b.isOpen():boolean");
    }

    @Override // net.schmizz.sshj.common.InterfaceC5027g
    /* renamed from: j */
    public final void mo5499j(SSHException sSHException) {
        C6686b c6686b = this.f33743t;
        if (c6686b != null) {
            c6686b.mo5499j(sSHException);
        }
        this.f33727b.mo5828d("Channel #{} got notified of {}", Integer.valueOf(this.f33731f), sSHException.toString());
        C5187a[] c5187aArr = {this.f33736l, this.f33737m};
        for (int i10 = 0; i10 < 2; i10++) {
            c5187aArr[i10].f25289a.m10148c(sSHException);
        }
        Iterator it = this.f33734j.iterator();
        while (it.hasNext()) {
            ((C5187a) it.next()).f25289a.m10148c(sSHException);
        }
        this.f33740q.mo5499j(sSHException);
        C6687c c6687c = this.f33742s;
        if (c6687c != null) {
            c6687c.mo5499j(sSHException);
        }
        m13242n();
    }

    /* renamed from: n */
    public final void m13242n() {
        C6382c c6382c = (C6382c) this.f33729d;
        c6382c.f29506a.mo5828d("Forgetting `{}` channel (#{})", this.f33730e, Integer.valueOf(this.f33731f));
        c6382c.f30783f.remove(Integer.valueOf(this.f33731f));
        synchronized (c6382c.f30781d) {
            try {
                if (c6382c.f30783f.isEmpty()) {
                    c6382c.f30781d.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f33737m.m10144c();
    }

    public final String toString() {
        return "< " + this.f33730e + " channel: id=" + this.f33731f + ", recipient=" + this.f33732g + ", localWin=" + this.f33739p + ", remoteWin=" + this.f33741r + " >";
    }

    /* renamed from: u */
    public final void m13243u(boolean z6) {
        synchronized (this.f33734j) {
            try {
                C5187a c5187a = (C5187a) this.f33734j.poll();
                if (c5187a == null) {
                    throw new ConnectionException(EnumC5023c.PROTOCOL_ERROR, "Received response to channel request when none was requested", null);
                }
                if (z6) {
                    c5187a.m10144c();
                } else {
                    c5187a.f25289a.m10148c(new ConnectionException("Request failed"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w */
    public final void m13244w(int i10, long j6, long j10) {
        this.f33732g = i10;
        this.f33741r = new C6689e(j6, (int) Math.min(j10, 1048576L), ((C6382c) this.f33729d).f30789m, this.f33726a);
        this.f33742s = new C6687c(this, this.f33728c, this.f33741r);
        this.f33727b.mo5849y(this, "Initialized - {}");
    }

    /* renamed from: z */
    public final void m13245z(C6686b c6686b, C5035o c5035o) throws ConnectionException {
        try {
            int iM9930y = (int) c5035o.m9930y();
            if (iM9930y < 0 || iM9930y > this.f33739p.f31996c || iM9930y > c5035o.m9907a()) {
                throw new ConnectionException(EnumC5023c.PROTOCOL_ERROR, AbstractC4801l.m9730d(iM9930y, "Bad item length: "), null);
            }
            if (this.f33727b.mo5836l()) {
                this.f33727b.mo5830f("IN #{}: {}", Integer.valueOf(this.f33731f), AbstractC5030j.m9940e(c5035o.f24776b, iM9930y, c5035o.f24775a));
            }
            byte[] bArr = c5035o.f24775a;
            int i10 = c5035o.f24776b;
            if (c6686b.f31982g) {
                throw new ConnectionException("Getting data on EOF'ed stream");
            }
            synchronized (c6686b.f31980e) {
                c6686b.f31980e.m2746p(i10, iM9930y, bArr);
                c6686b.f31980e.notifyAll();
                c6686b.f31979d.mo12826a(iM9930y);
                c6686b.f31977b.getClass();
            }
        } catch (Buffer$BufferException e2) {
            throw new ConnectionException(e2);
        }
    }
}
