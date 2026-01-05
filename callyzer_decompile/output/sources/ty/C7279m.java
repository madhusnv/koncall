package ty;

import c9.C0927v;
import ee.C2039g;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l1.C4327p;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.SSHRuntimeException;
import net.schmizz.sshj.connection.ConnectionException;
import net.schmizz.sshj.sftp.SFTPException;
import ny.C5187a;
import ny.C5189c;
import og.gd;
import p020v.a1;
import py.C6046b;
import qy.C6382c;
import ry.C6687c;
import ry.C6688d;
import sy.C6966b;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.m */
/* loaded from: classes3.dex */
public final class C7279m implements Closeable {

    /* renamed from: a */
    public final C5033m f34734a;

    /* renamed from: b */
    public final InterfaceC2173b f34735b;

    /* renamed from: c */
    public final C0927v f34736c;

    /* renamed from: d */
    public final C6966b f34737d;

    /* renamed from: e */
    public final C6966b f34738e;

    /* renamed from: f */
    public final C7271e f34739f;

    /* renamed from: g */
    public final C6687c f34740g;

    /* renamed from: h */
    public long f34741h;

    /* renamed from: j */
    public int f34742j;

    /* renamed from: k */
    public final HashMap f34743k = new HashMap();

    public C7279m(C6046b c6046b) {
        long j6;
        C5187a c5187a;
        c6046b.m12055n();
        if (!c6046b.f29517j.f37578n) {
            throw new IllegalStateException("Not authenticated");
        }
        C6966b c6966b = new C6966b(c6046b.f29519l, c6046b.f29521n);
        C7833j c7833j = c6966b.f33728c;
        C5035o c5035o = new C5035o(EnumC5034n.CHANNEL_OPEN);
        String str = c6966b.f33730e;
        Charset charset = StandardCharsets.UTF_8;
        c5035o.m9917l(str, charset);
        c5035o.m9918m(c6966b.f33731f);
        C6688d c6688d = c6966b.f33739p;
        synchronized (c6688d.f31995b) {
            j6 = c6688d.f31997d;
        }
        c5035o.m9918m(j6);
        c5035o.m9918m(c6688d.f31996c);
        c7833j.m14819i(c5035o);
        C5187a c5187a2 = c6966b.f33736l;
        long j10 = ((C6382c) c6966b.f33729d).f30789m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c5187a2.m10142a(j10);
        this.f34737d = c6966b;
        C5033m c5033m = c6966b.f33726a;
        this.f34734a = c5033m;
        c5033m.getClass();
        this.f34735b = AbstractC2175d.m5852b(C7279m.class);
        if (c6966b.f33744v) {
            throw new SSHRuntimeException("This session channel is all used up");
        }
        c6966b.f33727b.mo5825a("sftp", "Will request `{}` subsystem");
        C5021a c5021a = new C5021a();
        byte[] bytes = "sftp".getBytes(charset);
        c5021a.m9912g(bytes.length, bytes);
        c6966b.f33727b.mo5849y("subsystem", "Sending channel request for `{}`");
        synchronized (c6966b.f33734j) {
            C7833j c7833j2 = c6966b.f33728c;
            C5035o c5035o2 = new C5035o(EnumC5034n.CHANNEL_REQUEST);
            c5035o2.m9919n(c6966b.f33732g);
            byte[] bytes2 = "subsystem".getBytes(charset);
            c5035o2.m9912g(bytes2.length, bytes2);
            c5035o2.m9911f((byte) 1);
            int iM9907a = c5021a.m9907a();
            c5035o2.m9909c(iM9907a);
            System.arraycopy(c5021a.f24775a, c5021a.f24776b, c5035o2.f24775a, c5035o2.f24777c, iM9907a);
            c5035o2.f24777c += iM9907a;
            c7833j2.m14819i(c5035o2);
            c5187a = new C5187a("chan#" + c6966b.f33731f + " / chanreq for subsystem", ConnectionException.f24789c, c6966b.f33726a);
            c6966b.f33734j.add(c5187a);
        }
        c5187a.m10142a(((C6382c) c6966b.f33729d).f30789m);
        c6966b.f33744v = true;
        this.f34738e = c6966b;
        this.f34740g = c6966b.f33742s;
        C7271e c7271e = new C7271e(this);
        this.f34739f = c7271e;
        gd.m10670a(c7271e, c6046b);
        this.f34736c = new C0927v(new C4327p(27, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34738e.close();
        this.f34739f.interrupt();
        this.f34737d.close();
    }

    /* renamed from: h */
    public final C7277k m13598h(C7275i c7275i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (C7277k) m13600n(c7275i).m10149d(30000);
    }

    /* renamed from: j */
    public final synchronized C7275i m13599j(EnumC7272f enumC7272f) {
        long j6;
        j6 = (this.f34741h + 1) & 4294967295L;
        this.f34741h = j6;
        return new C7275i(enumC7272f, j6);
    }

    /* renamed from: n */
    public final C5189c m13600n(C7275i c7275i) {
        long j6 = c7275i.f34728f;
        C7271e c7271e = this.f34739f;
        c7271e.getClass();
        C5189c c5189c = new C5189c(a1.m14330j("sftp / ", j6), SFTPException.f24792d, null, c7271e.f34717f.f34734a);
        c7271e.f34714c.put(Long.valueOf(j6), c5189c);
        this.f34735b.mo5849y(c7275i, "Sending {}");
        m13602w(c7275i);
        return c5189c;
    }

    /* renamed from: u */
    public final C7268b m13601u(String str) {
        int i10;
        long jM9930y;
        int iM9930y;
        int iM9930y2;
        long jM9930y2;
        C7275i c7275iM13599j = m13599j(EnumC7272f.STAT);
        c7275iM13599j.m9917l(str, this.f34738e.f33733h);
        C7277k c7277kM13598h = m13598h(c7275iM13599j);
        c7277kM13598h.m13593C(EnumC7272f.ATTRS);
        C2039g c2039g = new C2039g(0);
        HashMap map = new HashMap();
        try {
            int iM9930y3 = (int) c7277kM13598h.m9930y();
            EnumC7267a enumC7267a = EnumC7267a.SIZE;
            long jM9930y3 = 0;
            if (enumC7267a.isSet(iM9930y3)) {
                jM9930y = (c7277kM13598h.m9930y() << 32) + (c7277kM13598h.m9930y() & 4294967295L);
                if (jM9930y < 0) {
                    throw new Buffer$BufferException("Cannot handle values > Long.MAX_VALUE");
                }
                i10 = enumC7267a.get();
            } else {
                i10 = 0;
                jM9930y = 0;
            }
            EnumC7267a enumC7267a2 = EnumC7267a.UIDGID;
            if (enumC7267a2.isSet(iM9930y3)) {
                iM9930y = (int) c7277kM13598h.m9930y();
                iM9930y2 = (int) c7277kM13598h.m9930y();
                i10 |= enumC7267a2.get();
            } else {
                iM9930y = 0;
                iM9930y2 = 0;
            }
            EnumC7267a enumC7267a3 = EnumC7267a.MODE;
            if (enumC7267a3.isSet(iM9930y3)) {
                int iM9930y4 = (int) c7277kM13598h.m9930y();
                i10 |= enumC7267a3.get();
                c2039g = new C2039g(iM9930y4);
            }
            EnumC7267a enumC7267a4 = EnumC7267a.ACMODTIME;
            if (enumC7267a4.isSet(iM9930y3)) {
                jM9930y3 = (int) c7277kM13598h.m9930y();
                jM9930y2 = (int) c7277kM13598h.m9930y();
                i10 |= enumC7267a4.get();
            } else {
                jM9930y2 = 0;
            }
            if (EnumC7267a.EXTENDED.isSet(iM9930y3)) {
                int iM9930y5 = (int) c7277kM13598h.m9930y();
                int i11 = 0;
                while (i11 < iM9930y5) {
                    String strM9929x = c7277kM13598h.m9929x();
                    C7277k c7277k = c7277kM13598h;
                    String strM9929x2 = c7277k.m9929x();
                    i10 |= EnumC7267a.EXTENDED.get();
                    map.put(strM9929x, strM9929x2);
                    i11++;
                    c7277kM13598h = c7277k;
                }
            }
            return new C7268b(i10, jM9930y, iM9930y, iM9930y2, c2039g, jM9930y3, jM9930y2, map);
        } catch (Buffer$BufferException e2) {
            throw new SFTPException(e2);
        }
    }

    /* renamed from: w */
    public final synchronized void m13602w(C7281o c7281o) {
        int iM9907a = c7281o.m9907a();
        this.f34740g.write((iM9907a >>> 24) & 255);
        this.f34740g.write((iM9907a >>> 16) & 255);
        this.f34740g.write((iM9907a >>> 8) & 255);
        this.f34740g.write(iM9907a & 255);
        this.f34740g.write(c7281o.f24775a, c7281o.f24776b, iM9907a);
        this.f34740g.flush();
    }
}
