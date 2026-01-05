package py;

import dz.C1865b;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import fz.AbstractC2404a;
import fz.C2405b;
import fz.C2406c;
import fz.C2407d;
import fz.C2408e;
import io.C3328c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.SocketFactory;
import net.schmizz.sshj.common.AbstractC5030j;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.userauth.UserAuthException;
import ny.C5187a;
import of.C5359n;
import og.gd;
import oy.C5777a;
import ql.InterfaceC6244a;
import qy.C6382c;
import vy.C7830g;
import vy.C7833j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: py.b */
/* loaded from: classes3.dex */
public final class C6046b implements Closeable, InterfaceC6244a {

    /* renamed from: a */
    public Socket f29509a;

    /* renamed from: b */
    public InputStream f29510b;

    /* renamed from: c */
    public OutputStream f29511c;

    /* renamed from: e */
    public String f29513e;

    /* renamed from: f */
    public int f29514f;

    /* renamed from: g */
    public final C5033m f29515g;

    /* renamed from: h */
    public final InterfaceC2173b f29516h;

    /* renamed from: j */
    public final C7833j f29517j;

    /* renamed from: k */
    public final C1865b f29518k;

    /* renamed from: l */
    public final C6382c f29519l;

    /* renamed from: d */
    public final SocketFactory f29512d = SocketFactory.getDefault();

    /* renamed from: m */
    public final ArrayList f29520m = new ArrayList();

    /* renamed from: n */
    public final Charset f29521n = StandardCharsets.UTF_8;

    public C6046b(C3328c c3328c) {
        C5033m c5033m = (C5033m) c3328c.f17616h;
        this.f29515g = c5033m;
        c5033m.getClass();
        this.f29516h = AbstractC2175d.m5852b(C6046b.class);
        C7833j c7833j = new C7833j(c3328c);
        this.f29517j = c7833j;
        this.f29518k = new C1865b(c7833j);
        this.f29519l = new C6382c(c7833j, (C5777a) c3328c.f17611c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m12056u();
    }

    /* renamed from: h */
    public final void m12053h(C2405b c2405b) throws UserAuthException {
        C1865b c1865b;
        C6382c c6382c;
        AbstractC2404a[] abstractC2404aArr = {new C2407d(c2405b), new C2406c(new C2408e(c2405b))};
        m12055n();
        List<AbstractC2404a> listAsList = Arrays.asList(abstractC2404aArr);
        m12055n();
        LinkedList linkedList = new LinkedList();
        for (AbstractC2404a abstractC2404a : listAsList) {
            Class<?> cls = abstractC2404a.getClass();
            this.f29515g.getClass();
            abstractC2404a.f10887a = AbstractC2175d.m5852b(cls);
            try {
                c1865b = this.f29518k;
                c6382c = this.f29519l;
                this.f29517j.getClass();
            } catch (UserAuthException e2) {
                linkedList.push(e2);
            }
            if (c1865b.m5497b(c6382c, abstractC2404a)) {
                return;
            }
        }
        throw new UserAuthException(EnumC5023c.UNKNOWN, "Exhausted available authentication methods", (Throwable) linkedList.peek());
    }

    @Override // ql.InterfaceC6244a
    /* renamed from: j */
    public final InetSocketAddress mo12054j() {
        return this.f29517j.mo12054j();
    }

    /* renamed from: n */
    public final void m12055n() {
        Socket socket = this.f29509a;
        if (socket == null || !socket.isConnected() || !this.f29517j.m14814c()) {
            throw new IllegalStateException("Not connected");
        }
    }

    /* renamed from: u */
    public final void m12056u() {
        this.f29519l.f30786j.interrupt();
        ArrayList arrayList = this.f29520m;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        C7833j c7833j = this.f29517j;
        c7833j.getClass();
        EnumC5023c enumC5023c = EnumC5023c.BY_APPLICATION;
        C5187a c5187a = c7833j.f37576l;
        c5187a.f25289a.f25293d.lock();
        try {
            if (c7833j.m14814c()) {
                c7833j.f37581r.f37567b.mo5825a(enumC5023c, "Disconnected - {}");
                c7833j.m14813b().mo5499j(new TransportException(enumC5023c, "Disconnected", null));
                c7833j.m14817f(enumC5023c, "");
                c7833j.f37571f.interrupt();
                AbstractC5030j.m9936a((InputStream) c7833j.f37582s.f26305c);
                AbstractC5030j.m9936a((OutputStream) c7833j.f37582s.f26306d);
                c5187a.m10144c();
            }
            c5187a.m10145d();
            Socket socket = this.f29509a;
            if (socket != null) {
                socket.close();
                this.f29509a = null;
            }
            InputStream inputStream = this.f29510b;
            if (inputStream != null) {
                inputStream.close();
                this.f29510b = null;
            }
            OutputStream outputStream = this.f29511c;
            if (outputStream != null) {
                outputStream.close();
                this.f29511c = null;
            }
        } catch (Throwable th2) {
            c5187a.m10145d();
            throw th2;
        }
    }

    /* renamed from: w */
    public final void m12057w() {
        Socket socket = this.f29509a;
        if (socket != null) {
            socket.setSoTimeout(0);
            this.f29510b = this.f29509a.getInputStream();
            this.f29511c = this.f29509a.getOutputStream();
        }
        String hostName = this.f29513e;
        if (hostName == null) {
            Socket socket2 = this.f29509a;
            hostName = (socket2 == null ? null : socket2.getInetAddress()).getHostName();
            this.f29513e = hostName;
        }
        Socket socket3 = this.f29509a;
        int port = socket3 == null ? this.f29514f : socket3.getPort();
        InputStream inputStream = this.f29510b;
        OutputStream outputStream = this.f29511c;
        C7833j c7833j = this.f29517j;
        C7830g c7830g = c7833j.f37571f;
        c7833j.f37582s = new C5359n(port, hostName, inputStream, outputStream);
        try {
            c7833j.f37569d.getClass();
            c7833j.m14816e();
            c7833j.m14815d();
            c7833j.f37567b.mo5825a(c7833j.f37583t, "Server identity string: {}");
            gd.m10670a(c7830g, c7833j);
            c7830g.start();
            m12055n();
            long jCurrentTimeMillis = System.currentTimeMillis();
            c7833j.f37570e.m14809c(true);
            this.f29516h.mo5849y(Double.valueOf((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d), "Key exchange took {} seconds");
            this.f29519l.f30786j.getClass();
        } catch (IOException e2) {
            throw new TransportException(e2);
        }
    }
}
