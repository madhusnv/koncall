package p001o;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class iz4 {

    /* renamed from: a */
    public final Uri f29380a;

    /* renamed from: b */
    public final long f29381b;

    /* renamed from: c */
    public final int f29382c;

    /* renamed from: d */
    public final byte[] f29383d;

    /* renamed from: e */
    public final Map f29384e;

    /* renamed from: f */
    public final long f29385f;

    /* renamed from: g */
    public final long f29386g;

    /* renamed from: h */
    public final long f29387h;

    /* renamed from: i */
    public final String f29388i;

    /* renamed from: j */
    public final int f29389j;

    /* renamed from: k */
    public final Object f29390k;

    /* renamed from: o.iz4$b */
    public static final class C14403b {

        /* renamed from: a */
        public Uri f29391a;

        /* renamed from: b */
        public long f29392b;

        /* renamed from: c */
        public int f29393c;

        /* renamed from: d */
        public byte[] f29394d;

        /* renamed from: e */
        public Map f29395e;

        /* renamed from: f */
        public long f29396f;

        /* renamed from: g */
        public long f29397g;

        /* renamed from: h */
        public String f29398h;

        /* renamed from: i */
        public int f29399i;

        /* renamed from: j */
        public Object f29400j;

        /* renamed from: a */
        public iz4 m32924a() {
            op0.m42520j(this.f29391a, "The uri must be set.");
            return new iz4(this.f29391a, this.f29392b, this.f29393c, this.f29394d, this.f29395e, this.f29396f, this.f29397g, this.f29398h, this.f29399i, this.f29400j);
        }

        /* renamed from: b */
        public C14403b m32925b(int i) {
            this.f29399i = i;
            return this;
        }

        /* renamed from: c */
        public C14403b m32926c(byte[] bArr) {
            this.f29394d = bArr;
            return this;
        }

        /* renamed from: d */
        public C14403b m32927d(int i) {
            this.f29393c = i;
            return this;
        }

        /* renamed from: e */
        public C14403b m32928e(Map map) {
            this.f29395e = map;
            return this;
        }

        /* renamed from: f */
        public C14403b m32929f(String str) {
            this.f29398h = str;
            return this;
        }

        /* renamed from: g */
        public C14403b m32930g(long j) {
            this.f29397g = j;
            return this;
        }

        /* renamed from: h */
        public C14403b m32931h(long j) {
            this.f29396f = j;
            return this;
        }

        /* renamed from: i */
        public C14403b m32932i(Uri uri) {
            this.f29391a = uri;
            return this;
        }

        /* renamed from: j */
        public C14403b m32933j(String str) {
            this.f29391a = Uri.parse(str);
            return this;
        }

        public C14403b() {
            this.f29393c = 1;
            this.f29395e = Collections.emptyMap();
            this.f29397g = -1L;
        }

        public C14403b(iz4 iz4Var) {
            this.f29391a = iz4Var.f29380a;
            this.f29392b = iz4Var.f29381b;
            this.f29393c = iz4Var.f29382c;
            this.f29394d = iz4Var.f29383d;
            this.f29395e = iz4Var.f29384e;
            this.f29396f = iz4Var.f29386g;
            this.f29397g = iz4Var.f29387h;
            this.f29398h = iz4Var.f29388i;
            this.f29399i = iz4Var.f29389j;
            this.f29400j = iz4Var.f29390k;
        }
    }

    static {
        t2b.m49198a("media3.datasource");
    }

    /* renamed from: c */
    public static String m32918c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C14403b m32919a() {
        return new C14403b();
    }

    /* renamed from: b */
    public final String m32920b() {
        return m32918c(this.f29382c);
    }

    /* renamed from: d */
    public boolean m32921d(int i) {
        return (this.f29389j & i) == i;
    }

    /* renamed from: e */
    public iz4 m32922e(long j) {
        long j2 = this.f29387h;
        return m32923f(j, j2 != -1 ? j2 - j : -1L);
    }

    /* renamed from: f */
    public iz4 m32923f(long j, long j2) {
        return (j == 0 && this.f29387h == j2) ? this : new iz4(this.f29380a, this.f29381b, this.f29382c, this.f29383d, this.f29384e, this.f29386g + j, j2, this.f29388i, this.f29389j, this.f29390k);
    }

    public String toString() {
        return "DataSpec[" + m32920b() + " " + this.f29380a + ", " + this.f29386g + ", " + this.f29387h + ", " + this.f29388i + ", " + this.f29389j + "]";
    }

    public iz4(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        op0.m42511a(j4 >= 0);
        op0.m42511a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        op0.m42511a(z);
        this.f29380a = (Uri) op0.m42515e(uri);
        this.f29381b = j;
        this.f29382c = i;
        this.f29383d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f29384e = Collections.unmodifiableMap(new HashMap(map));
        this.f29386g = j2;
        this.f29385f = j4;
        this.f29387h = j3;
        this.f29388i = str;
        this.f29389j = i2;
        this.f29390k = obj;
    }
}
