package vy;

import com.sun.mail.util.AbstractC1452a;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import i0.m0;
import io.C3328c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.schmizz.sshj.common.AbstractC5030j;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5036p;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.transport.TransportException;
import ny.C5187a;
import ny.C5189c;
import of.C5359n;
import py.AbstractC6045a;
import ql.InterfaceC6244a;
import rl.C6567a;
import ug.C7452w;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vy.j */
/* loaded from: classes3.dex */
public final class C7833j implements InterfaceC5036p, InterfaceC6244a {

    /* renamed from: a */
    public final C5033m f37566a;

    /* renamed from: b */
    public final InterfaceC2173b f37567b;

    /* renamed from: c */
    public final C7832i f37568c;

    /* renamed from: d */
    public final C3328c f37569d;

    /* renamed from: e */
    public final C7829f f37570e;

    /* renamed from: f */
    public final C7830g f37571f;

    /* renamed from: g */
    public final C7826c f37572g;

    /* renamed from: h */
    public final C7825b f37573h;

    /* renamed from: j */
    public C6567a f37574j;

    /* renamed from: k */
    public final C5187a f37575k;

    /* renamed from: l */
    public final C5187a f37576l;

    /* renamed from: m */
    public final String f37577m;

    /* renamed from: n */
    public volatile boolean f37578n = false;

    /* renamed from: p */
    public volatile AbstractC6045a f37579p;

    /* renamed from: q */
    public volatile AbstractC6045a f37580q;

    /* renamed from: r */
    public final C7833j f37581r;

    /* renamed from: s */
    public C5359n f37582s;

    /* renamed from: t */
    public String f37583t;

    /* renamed from: v */
    public EnumC5034n f37584v;

    /* renamed from: w */
    public final ReentrantLock f37585w;

    public C7833j(C3328c c3328c) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f37585w = reentrantLock;
        this.f37569d = c3328c;
        C5033m c5033m = (C5033m) c3328c.f17616h;
        this.f37566a = c5033m;
        C7452w c7452w = TransportException.f24794c;
        this.f37575k = new C5187a("service accept", c7452w, c5033m);
        this.f37576l = new C5187a("transport close", c7452w, c5033m);
        C7832i c7832i = new C7832i("null-service", this);
        this.f37568c = c7832i;
        this.f37579p = c7832i;
        c5033m.getClass();
        this.f37567b = AbstractC2175d.m5852b(C7833j.class);
        this.f37581r = this;
        this.f37571f = new C7830g(this);
        C8986c c8986c = (C8986c) c3328c.f17610b;
        c8986c.getClass();
        this.f37572g = new C7826c(c8986c, reentrantLock, c5033m);
        this.f37573h = new C7825b(this);
        this.f37570e = new C7829f(this);
        this.f37577m = m0.m7378k("SSH-2.0-", (String) c3328c.f17609a);
    }

    /* renamed from: a */
    public final void m14812a(Exception exc) {
        C5187a c5187a = this.f37576l;
        c5187a.f25289a.f25293d.lock();
        try {
            if (!c5187a.m10143b()) {
                this.f37567b.mo5837m("Dying because - {}", exc.getMessage(), exc);
                SSHException sSHException = (SSHException) SSHException.f24772b.mo394c(exc);
                EnumC5023c enumC5023c = sSHException.f24773a;
                C7833j c7833j = this.f37581r;
                sSHException.getMessage();
                c7833j.f37567b.mo5825a(enumC5023c, "Disconnected - {}");
                C5187a[] c5187aArr = {c5187a, this.f37575k};
                for (int i10 = 0; i10 < 2; i10++) {
                    c5187aArr[i10].f25289a.m10148c(sSHException);
                }
                this.f37570e.mo5499j(sSHException);
                m14813b().mo5499j(sSHException);
                m14818g(this.f37568c);
                boolean z6 = this.f37584v != EnumC5034n.DISCONNECT;
                boolean z10 = enumC5023c != EnumC5023c.UNKNOWN;
                if (z6 && z10) {
                    m14817f(enumC5023c, sSHException.getMessage());
                }
                this.f37571f.interrupt();
                AbstractC5030j.m9936a((InputStream) this.f37582s.f26305c);
                AbstractC5030j.m9936a((OutputStream) this.f37582s.f26306d);
                c5187a.m10144c();
            }
            c5187a.m10145d();
        } catch (Throwable th2) {
            c5187a.m10145d();
            throw th2;
        }
    }

    /* renamed from: b */
    public final synchronized AbstractC6045a m14813b() {
        return this.f37579p;
    }

    /* renamed from: c */
    public final boolean m14814c() {
        return this.f37571f.isAlive() && !this.f37576l.m10143b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4.m9907a() >= 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r5 = new byte[4];
        r4.m9928w(r5);
        r4.f24776b = 0;
        r5 = java.util.Arrays.equals(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r5 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r1 = r4.m9907a();
        r2 = new byte[r1];
        r4.m9928w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r1 > 255) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r5 = r1 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r2[r5] == 13) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r7 = new java.lang.String(r2, 0, r1 - 1);
        r3.mo5848x("Server identification has bad line ending, was expecting a '\\r\\n' however got: '{}' (hex: {})", java.lang.Character.valueOf((char) (r2[r5] & 255)), java.lang.Integer.toHexString(r2[r5] & 255));
        r3.mo5825a(r7, "Will treat the identification of this server '{}' leniently");
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r1 = new java.lang.String(r2, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r1.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r1.startsWith("SSH-2.0-") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r1.startsWith("SSH-1.99-") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        throw new net.schmizz.sshj.transport.TransportException(net.schmizz.sshj.common.EnumC5023c.PROTOCOL_VERSION_NOT_SUPPORTED, "Server does not support SSHv2, identified as: ".concat(r1), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        r9.f37583t = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r1.isEmpty() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        r1 = ((java.io.InputStream) r9.f37582s.f26305c).read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r1 == (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        r9.f37567b.error("Received end of connection, but no identification received. ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        throw new net.schmizz.sshj.transport.TransportException("Server closed connection during identification exchange");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r3.mo5843s(new java.lang.String(r2), "Incorrect identification String received, line was longer than expected: {}");
        r3.mo5843s(net.schmizz.sshj.common.AbstractC5030j.m9940e(0, r1, r2), "Just for good measure, bytes were: {}");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:
    
        throw new net.schmizz.sshj.transport.TransportException("Incorrect identification: line too long: " + net.schmizz.sshj.common.AbstractC5030j.m9940e(0, r1, r2));
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14815d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy.C7833j.m14815d():void");
    }

    /* renamed from: e */
    public final void m14816e() throws IOException {
        InterfaceC2173b interfaceC2173b = this.f37567b;
        String str = this.f37577m;
        interfaceC2173b.mo5825a(str, "Client identity string: {}");
        ((OutputStream) this.f37582s.f26306d).write(AbstractC1452a.m4561h(str, "\r\n").getBytes(StandardCharsets.UTF_8));
        ((OutputStream) this.f37582s.f26306d).flush();
    }

    /* renamed from: f */
    public final void m14817f(EnumC5023c enumC5023c, String str) {
        if (str == null) {
            str = "";
        }
        InterfaceC2173b interfaceC2173b = this.f37567b;
        interfaceC2173b.mo5828d("Sending SSH_MSG_DISCONNECT: reason=[{}], msg=[{}]", enumC5023c, str);
        try {
            C5035o c5035o = new C5035o(EnumC5034n.DISCONNECT);
            c5035o.m9918m(enumC5023c.toInt());
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            c5035o.m9912g(bytes.length, bytes);
            byte[] bytes2 = "".getBytes(charset);
            c5035o.m9912g(bytes2.length, bytes2);
            m14819i(c5035o);
        } catch (IOException e2) {
            interfaceC2173b.mo5849y(e2.toString(), "Error writing packet: {}");
        }
    }

    /* renamed from: g */
    public final synchronized void m14818g(AbstractC6045a abstractC6045a) {
        if (abstractC6045a == null) {
            try {
                abstractC6045a = this.f37568c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f37567b.mo5849y(abstractC6045a.f29507b, "Setting active service to {}");
        this.f37579p = abstractC6045a;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) throws SSHException {
        this.f37584v = enumC5034n;
        this.f37567b.mo5831g(enumC5034n, "Received packet {}");
        if (this.f37570e.f37553f.get()) {
            if (this.f37573h.f37535d == 4294967295L) {
                throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "Sequence number of decoder is about to wrap during initial key exchange", null);
            }
            if (this.f37570e.f37554g.get() && !enumC5034n.in(20, 21) && !enumC5034n.in(30, 49) && enumC5034n != EnumC5034n.DISCONNECT) {
                throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "Unexpected packet type during initial strict key exchange", null);
            }
        }
        if (enumC5034n.geq(50)) {
            this.f37579p.mo5498h(enumC5034n, c5035o);
            return;
        }
        if (enumC5034n.in(20, 21) || enumC5034n.in(30, 49)) {
            this.f37570e.mo5498h(enumC5034n, c5035o);
            return;
        }
        switch (AbstractC7831h.f37565a[enumC5034n.ordinal()]) {
            case 1:
                try {
                    EnumC5023c enumC5023cFromInt = EnumC5023c.fromInt((int) c5035o.m9930y());
                    String strM9929x = c5035o.m9929x();
                    this.f37567b.mo5848x("Received SSH_MSG_DISCONNECT (reason={}, msg={})", enumC5023cFromInt, strM9929x);
                    throw new TransportException(enumC5023cFromInt, strM9929x, null);
                } catch (Buffer$BufferException e2) {
                    throw new TransportException(e2);
                }
            case 2:
                this.f37567b.debug("Received SSH_MSG_IGNORE");
                return;
            case 3:
                this.f37567b.mo5849y(Long.valueOf(c5035o.m9930y()), "Received SSH_MSG_UNIMPLEMENTED #{}");
                if (this.f37570e.f37552e.get()) {
                    throw new TransportException("Received SSH_MSG_UNIMPLEMENTED while exchanging keys");
                }
                m14813b().getClass();
                throw new SSHException(EnumC5023c.PROTOCOL_ERROR, "Unexpected: SSH_MSG_UNIMPLEMENTED", null);
            case 4:
                try {
                    boolean zM9923r = c5035o.m9923r();
                    this.f37567b.mo5828d("Received SSH_MSG_DEBUG (display={}) '{}'", Boolean.valueOf(zM9923r), c5035o.m9929x());
                    return;
                } catch (Buffer$BufferException e10) {
                    throw new TransportException(e10);
                }
            case 5:
                this.f37575k.f25289a.f25293d.lock();
                try {
                    C5189c c5189c = this.f37575k.f25289a;
                    ReentrantLock reentrantLock = c5189c.f25293d;
                    reentrantLock.lock();
                    try {
                        if (!reentrantLock.hasWaiters(c5189c.f25294e)) {
                            throw new TransportException(EnumC5023c.PROTOCOL_ERROR, "Got a service accept notification when none was awaited", null);
                        }
                        m14818g(this.f37580q);
                        this.f37575k.m10144c();
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                } finally {
                    this.f37575k.m10145d();
                }
            case 6:
                this.f37567b.debug("Received SSH_MSG_EXT_INFO");
                return;
            case 7:
                this.f37567b.debug("Received USERAUTH_BANNER");
                return;
            default:
                long j6 = this.f37573h.f37535d;
                this.f37567b.mo5849y(Long.valueOf(j6), "Sending SSH_MSG_UNIMPLEMENTED for packet #{}");
                C5035o c5035o2 = new C5035o(EnumC5034n.UNIMPLEMENTED);
                c5035o2.m9918m(j6);
                m14819i(c5035o2);
                return;
        }
    }

    /* renamed from: i */
    public final long m14819i(C5035o c5035o) {
        C7829f c7829f = this.f37570e;
        ReentrantLock reentrantLock = this.f37585w;
        reentrantLock.lock();
        try {
            boolean z6 = c7829f.f37552e.get();
            C7826c c7826c = this.f37572g;
            if (z6) {
                EnumC5034n enumC5034nFromByte = EnumC5034n.fromByte(c5035o.f24775a[c5035o.f24776b]);
                if (!enumC5034nFromByte.in(1, 49) || enumC5034nFromByte == EnumC5034n.SERVICE_REQUEST || enumC5034nFromByte == EnumC5034n.IGNORE) {
                    C5187a c5187a = c7829f.f37561p;
                    c7829f.f37549b.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c5187a.m10142a(30000);
                }
            } else {
                if (c7826c.f37535d == 4294967295L) {
                    c7829f.m14809c(true);
                }
            }
            long jM14805b = c7826c.m14805b(c5035o);
            try {
                ((OutputStream) this.f37582s.f26306d).write(c5035o.f24775a, c5035o.f24776b, c5035o.m9907a());
                ((OutputStream) this.f37582s.f26306d).flush();
                reentrantLock.unlock();
                return jM14805b;
            } catch (IOException e2) {
                throw new TransportException(e2);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // ql.InterfaceC6244a
    /* renamed from: j */
    public final InetSocketAddress mo12054j() {
        if (this.f37582s == null) {
            return null;
        }
        C5359n c5359n = this.f37582s;
        return new InetSocketAddress((String) c5359n.f26304b, c5359n.f26303a);
    }
}
