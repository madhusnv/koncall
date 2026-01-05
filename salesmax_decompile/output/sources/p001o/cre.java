package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class cre implements Closeable {

    /* renamed from: b */
    public static final C12729b f18529b = new C12729b(null);

    /* renamed from: a */
    public Reader f18530a;

    /* renamed from: o.cre$a */
    public static final class C12728a extends Reader {

        /* renamed from: a */
        public final im1 f18531a;

        /* renamed from: b */
        public final Charset f18532b;

        /* renamed from: c */
        public boolean f18533c;

        /* renamed from: d */
        public Reader f18534d;

        public C12728a(im1 im1Var, Charset charset) {
            sq8.m48649h(im1Var, "source");
            sq8.m48649h(charset, "charset");
            this.f18531a = im1Var;
            this.f18532b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            y3i y3iVar;
            this.f18533c = true;
            Reader reader = this.f18534d;
            if (reader != null) {
                reader.close();
                y3iVar = y3i.f54824a;
            } else {
                y3iVar = null;
            }
            if (y3iVar == null) {
                this.f18531a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            sq8.m48649h(cArr, "cbuf");
            if (this.f18533c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f18534d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f18531a.o3(), jgj.m33819m(this.f18531a, this.f18532b));
                this.f18534d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* renamed from: o.cre$b */
    public static final class C12729b {
        public C12729b() {
        }

        public /* synthetic */ C12729b(id5 id5Var) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ cre m21621d(C12729b c12729b, byte[] bArr, y9b y9bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                y9bVar = null;
            }
            return c12729b.m21624c(bArr, y9bVar);
        }

        /* renamed from: a */
        public final cre m21622a(im1 im1Var, y9b y9bVar, long j) {
            sq8.m48649h(im1Var, "<this>");
            return dgj.m23076a(im1Var, y9bVar, j);
        }

        /* renamed from: b */
        public final cre m21623b(y9b y9bVar, long j, im1 im1Var) {
            sq8.m48649h(im1Var, FirebaseAnalytics.Param.CONTENT);
            return m21622a(im1Var, y9bVar, j);
        }

        /* renamed from: c */
        public final cre m21624c(byte[] bArr, y9b y9bVar) {
            sq8.m48649h(bArr, "<this>");
            return dgj.m23079d(bArr, y9bVar);
        }
    }

    /* renamed from: k */
    public static final cre m21612k(y9b y9bVar, long j, im1 im1Var) {
        return f18529b.m21623b(y9bVar, j, im1Var);
    }

    /* renamed from: a */
    public final InputStream m21613a() {
        return mo21619o().o3();
    }

    /* renamed from: c */
    public final byte[] m21614c() {
        return dgj.m23077b(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dgj.m23078c(this);
    }

    /* renamed from: d */
    public final Reader m21615d() {
        Reader reader = this.f18530a;
        if (reader != null) {
            return reader;
        }
        C12728a c12728a = new C12728a(mo21619o(), m21616f());
        this.f18530a = c12728a;
        return c12728a;
    }

    /* renamed from: f */
    public final Charset m21616f() {
        return zn8.m59634a(mo21618h());
    }

    /* renamed from: g */
    public abstract long mo21617g();

    /* renamed from: h */
    public abstract y9b mo21618h();

    /* renamed from: o */
    public abstract im1 mo21619o();

    /* renamed from: r */
    public final String m21620r() {
        im1 im1VarMo21619o = mo21619o();
        try {
            String strN2 = im1VarMo21619o.n2(jgj.m33819m(im1VarMo21619o, m21616f()));
            tb3.m49666a(im1VarMo21619o, null);
            return strN2;
        } finally {
        }
    }
}
