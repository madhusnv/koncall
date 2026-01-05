package p001o;

import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.c18;

/* loaded from: classes6.dex */
public final class i18 implements Closeable {

    /* renamed from: e */
    public static final C14149a f27913e = new C14149a(null);

    /* renamed from: f */
    public static final Logger f27914f;

    /* renamed from: a */
    public final im1 f27915a;

    /* renamed from: b */
    public final boolean f27916b;

    /* renamed from: c */
    public final C14150b f27917c;

    /* renamed from: d */
    public final c18.C12531a f27918d;

    /* renamed from: o.i18$a */
    public static final class C14149a {
        public C14149a() {
        }

        public /* synthetic */ C14149a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Logger m31376a() {
            return i18.f27914f;
        }

        /* renamed from: b */
        public final int m31377b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* renamed from: o.i18$b */
    public static final class C14150b implements lzf {

        /* renamed from: a */
        public final im1 f27919a;

        /* renamed from: b */
        public int f27920b;

        /* renamed from: c */
        public int f27921c;

        /* renamed from: d */
        public int f27922d;

        /* renamed from: e */
        public int f27923e;

        /* renamed from: f */
        public int f27924f;

        public C14150b(im1 im1Var) {
            sq8.m48649h(im1Var, "source");
            this.f27919a = im1Var;
        }

        @Override // p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            while (true) {
                int i = this.f27923e;
                if (i != 0) {
                    long jN0 = this.f27919a.N0(rl1Var, Math.min(j, i));
                    if (jN0 == -1) {
                        return -1L;
                    }
                    this.f27923e -= (int) jN0;
                    return jN0;
                }
                this.f27919a.skip(this.f27924f);
                this.f27924f = 0;
                if ((this.f27921c & 4) != 0) {
                    return -1L;
                }
                m31379c();
            }
        }

        /* renamed from: a */
        public final int m31378a() {
            return this.f27923e;
        }

        /* renamed from: c */
        public final void m31379c() throws IOException {
            int i = this.f27922d;
            int iM28613B = ggj.m28613B(this.f27919a);
            this.f27923e = iM28613B;
            this.f27920b = iM28613B;
            int iM28622b = ggj.m28622b(this.f27919a.readByte(), Constants.MAX_HOST_LENGTH);
            this.f27921c = ggj.m28622b(this.f27919a.readByte(), Constants.MAX_HOST_LENGTH);
            C14149a c14149a = i18.f27913e;
            if (c14149a.m31376a().isLoggable(Level.FINE)) {
                c14149a.m31376a().fine(f18.f22532a.m25936c(true, this.f27922d, this.f27920b, iM28622b, this.f27921c));
            }
            int i2 = this.f27919a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27922d = i2;
            if (iM28622b == 9) {
                if (i2 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iM28622b + " != TYPE_CONTINUATION");
            }
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: d */
        public final void m31380d(int i) {
            this.f27921c = i;
        }

        /* renamed from: f */
        public final void m31381f(int i) {
            this.f27923e = i;
        }

        /* renamed from: g */
        public final void m31382g(int i) {
            this.f27920b = i;
        }

        /* renamed from: h */
        public final void m31383h(int i) {
            this.f27924f = i;
        }

        /* renamed from: k */
        public final void m31384k(int i) {
            this.f27922d = i;
        }

        @Override // p001o.lzf
        public nmh timeout() {
            return this.f27919a.timeout();
        }
    }

    /* renamed from: o.i18$c */
    public interface InterfaceC14151c {
        /* renamed from: a */
        void mo27962a(int i, fj6 fj6Var, zq1 zq1Var);

        /* renamed from: b */
        void mo27963b(boolean z, int i, int i2, List list);

        /* renamed from: c */
        void mo27964c(int i, fj6 fj6Var);

        /* renamed from: d */
        void mo27965d(int i, long j);

        /* renamed from: e */
        void mo27966e(boolean z, tif tifVar);

        /* renamed from: f */
        void mo27967f(int i, int i2, List list);

        /* renamed from: g */
        void mo27968g();

        /* renamed from: h */
        void mo27969h(boolean z, int i, im1 im1Var, int i2);

        /* renamed from: i */
        void mo27970i(boolean z, int i, int i2);

        /* renamed from: k */
        void mo27971k(int i, int i2, int i3, boolean z);
    }

    static {
        Logger logger = Logger.getLogger(f18.class.getName());
        sq8.m48648g(logger, "getLogger(...)");
        f27914f = logger;
    }

    public i18(im1 im1Var, boolean z) {
        sq8.m48649h(im1Var, "source");
        this.f27915a = im1Var;
        this.f27916b = z;
        C14150b c14150b = new C14150b(im1Var);
        this.f27917c = c14150b;
        this.f27918d = new c18.C12531a(c14150b, 4096, 0, 4, null);
    }

    /* renamed from: C */
    public final void m31363C(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            interfaceC14151c.mo27968g();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
        tif tifVar = new tif();
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, i), 6);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (true) {
                int iM28623c = ggj.m28623c(this.f27915a.readShort(), 65535);
                i4 = this.f27915a.readInt();
                if (iM28623c != 2) {
                    if (iM28623c == 3) {
                        iM28623c = 4;
                    } else if (iM28623c != 4) {
                        if (iM28623c == 5 && (i4 < 16384 || i4 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i4 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iM28623c = 7;
                    }
                } else if (i4 != 0 && i4 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                tifVar.m49946h(iM28623c, i4);
                if (iM32260e == iM32261j) {
                    break;
                } else {
                    iM32260e += iM32262n;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i4);
        }
        interfaceC14151c.mo27966e(false, tifVar);
    }

    /* renamed from: D */
    public final void m31364D(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws Exception {
        try {
            if (i != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
            }
            long jM28624d = ggj.m28624d(this.f27915a.readInt(), 2147483647L);
            if (jM28624d == 0) {
                throw new IOException("windowSizeIncrement was 0");
            }
            Logger logger = f27914f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f18.f22532a.m25937d(true, i3, i, jM28624d));
            }
            interfaceC14151c.mo27965d(i3, jM28624d);
        } catch (Exception e) {
            f27914f.fine(f18.f22532a.m25936c(true, i3, i, 8, i2));
            throw e;
        }
    }

    /* renamed from: c */
    public final boolean m31365c(boolean z, InterfaceC14151c interfaceC14151c) throws Exception {
        sq8.m48649h(interfaceC14151c, "handler");
        try {
            this.f27915a.k1(9L);
            int iM28613B = ggj.m28613B(this.f27915a);
            if (iM28613B > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iM28613B);
            }
            int iM28622b = ggj.m28622b(this.f27915a.readByte(), Constants.MAX_HOST_LENGTH);
            int iM28622b2 = ggj.m28622b(this.f27915a.readByte(), Constants.MAX_HOST_LENGTH);
            int i = this.f27915a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (iM28622b != 8) {
                Logger logger = f27914f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f18.f22532a.m25936c(true, i, iM28613B, iM28622b, iM28622b2));
                }
            }
            if (z && iM28622b != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + f18.f22532a.m25935b(iM28622b));
            }
            switch (iM28622b) {
                case 0:
                    m31367f(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 1:
                    m31370k(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 2:
                    m31373s(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 3:
                    m31375u(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 4:
                    m31363C(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 5:
                    m31374t(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 6:
                    m31371o(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 7:
                    m31368g(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                case 8:
                    m31364D(interfaceC14151c, iM28613B, iM28622b2, i);
                    return true;
                default:
                    this.f27915a.skip(iM28613B);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27915a.close();
    }

    /* renamed from: d */
    public final void m31366d(InterfaceC14151c interfaceC14151c) throws IOException {
        sq8.m48649h(interfaceC14151c, "handler");
        if (this.f27916b) {
            if (!m31365c(true, interfaceC14151c)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        im1 im1Var = this.f27915a;
        zq1 zq1Var = f18.f22533b;
        zq1 zq1VarY1 = im1Var.y1(zq1Var.m59694L());
        Logger logger = f27914f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(jgj.m33815i("<< CONNECTION " + zq1VarY1.mo38697s(), new Object[0]));
        }
        if (sq8.m48644c(zq1Var, zq1VarY1)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + zq1VarY1.m59696R());
    }

    /* renamed from: f */
    public final void m31367f(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iM28622b = (i2 & 8) != 0 ? ggj.m28622b(this.f27915a.readByte(), Constants.MAX_HOST_LENGTH) : 0;
        interfaceC14151c.mo27969h(z, i3, this.f27915a, f27913e.m31377b(i, i2, iM28622b));
        this.f27915a.skip(iM28622b);
    }

    /* renamed from: g */
    public final void m31368g(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        }
        if (i3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i4 = this.f27915a.readInt();
        int i5 = this.f27915a.readInt();
        int i6 = i - 8;
        fj6 fj6VarM26902a = fj6.Companion.m26902a(i5);
        if (fj6VarM26902a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i5);
        }
        zq1 zq1VarY1 = zq1.f57498e;
        if (i6 > 0) {
            zq1VarY1 = this.f27915a.y1(i6);
        }
        interfaceC14151c.mo27962a(i4, fj6VarM26902a, zq1VarY1);
    }

    /* renamed from: h */
    public final List m31369h(int i, int i2, int i3, int i4) throws IOException {
        this.f27917c.m31381f(i);
        C14150b c14150b = this.f27917c;
        c14150b.m31382g(c14150b.m31378a());
        this.f27917c.m31383h(i2);
        this.f27917c.m31380d(i3);
        this.f27917c.m31384k(i4);
        this.f27918d.m20052k();
        return this.f27918d.m20046e();
    }

    /* renamed from: k */
    public final void m31370k(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        int iM28622b = (i2 & 8) != 0 ? ggj.m28622b(this.f27915a.readByte(), Constants.MAX_HOST_LENGTH) : 0;
        if ((i2 & 32) != 0) {
            m31372r(interfaceC14151c, i3);
            i -= 5;
        }
        interfaceC14151c.mo27963b(z, i3, -1, m31369h(f27913e.m31377b(i, i2, iM28622b), iM28622b, i2, i3));
    }

    /* renamed from: o */
    public final void m31371o(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        interfaceC14151c.mo27970i((i2 & 1) != 0, this.f27915a.readInt(), this.f27915a.readInt());
    }

    /* renamed from: r */
    public final void m31372r(InterfaceC14151c interfaceC14151c, int i) {
        int i2 = this.f27915a.readInt();
        interfaceC14151c.mo27971k(i, i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER, ggj.m28622b(this.f27915a.readByte(), Constants.MAX_HOST_LENGTH) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* renamed from: s */
    public final void m31373s(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m31372r(interfaceC14151c, i3);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        }
    }

    /* renamed from: t */
    public final void m31374t(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iM28622b = (i2 & 8) != 0 ? ggj.m28622b(this.f27915a.readByte(), Constants.MAX_HOST_LENGTH) : 0;
        interfaceC14151c.mo27967f(i3, this.f27915a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, m31369h(f27913e.m31377b(i - 4, i2, iM28622b), iM28622b, i2, i3));
    }

    /* renamed from: u */
    public final void m31375u(InterfaceC14151c interfaceC14151c, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        }
        if (i3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i4 = this.f27915a.readInt();
        fj6 fj6VarM26902a = fj6.Companion.m26902a(i4);
        if (fj6VarM26902a != null) {
            interfaceC14151c.mo27964c(i3, fj6VarM26902a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i4);
    }
}
