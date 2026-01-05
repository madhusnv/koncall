package p001o;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C2182b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p001o.nf8;

/* loaded from: classes2.dex */
public final class s2b {

    /* renamed from: i */
    public static final s2b f44472i = new C16718c().m47470a();

    /* renamed from: j */
    public static final String f44473j = sqi.B0(0);

    /* renamed from: k */
    public static final String f44474k = sqi.B0(1);

    /* renamed from: l */
    public static final String f44475l = sqi.B0(2);

    /* renamed from: m */
    public static final String f44476m = sqi.B0(3);

    /* renamed from: n */
    public static final String f44477n = sqi.B0(4);

    /* renamed from: o */
    public static final String f44478o = sqi.B0(5);

    /* renamed from: a */
    public final String f44479a;

    /* renamed from: b */
    public final C16723h f44480b;

    /* renamed from: c */
    public final C16723h f44481c;

    /* renamed from: d */
    public final C16722g f44482d;

    /* renamed from: e */
    public final C2182b f44483e;

    /* renamed from: f */
    public final C16719d f44484f;

    /* renamed from: g */
    public final C16720e f44485g;

    /* renamed from: h */
    public final C16724i f44486h;

    /* renamed from: o.s2b$b */
    public static final class C16717b {
    }

    /* renamed from: o.s2b$c */
    public static final class C16718c {

        /* renamed from: a */
        public String f44487a;

        /* renamed from: b */
        public Uri f44488b;

        /* renamed from: c */
        public String f44489c;

        /* renamed from: d */
        public C16719d.a f44490d;

        /* renamed from: e */
        public C16721f.a f44491e;

        /* renamed from: f */
        public List f44492f;

        /* renamed from: g */
        public String f44493g;

        /* renamed from: h */
        public nf8 f44494h;

        /* renamed from: i */
        public Object f44495i;

        /* renamed from: j */
        public long f44496j;

        /* renamed from: k */
        public C2182b f44497k;

        /* renamed from: l */
        public C16722g.a f44498l;

        /* renamed from: m */
        public C16724i f44499m;

        /* renamed from: a */
        public s2b m47470a() {
            C16723h c16723h;
            op0.m42517g(this.f44491e.f44541b == null || this.f44491e.f44540a != null);
            Uri uri = this.f44488b;
            if (uri != null) {
                c16723h = new C16723h(uri, this.f44489c, this.f44491e.f44540a != null ? this.f44491e.m47496i() : null, null, this.f44492f, this.f44493g, this.f44494h, this.f44495i, this.f44496j);
            } else {
                c16723h = null;
            }
            String str = this.f44487a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C16720e c16720eM47484g = this.f44490d.m47484g();
            C16722g c16722gM47503f = this.f44498l.m47503f();
            C2182b c2182b = this.f44497k;
            if (c2182b == null) {
                c2182b = C2182b.f7992H;
            }
            return new s2b(str2, c16720eM47484g, c16723h, c16722gM47503f, c2182b, this.f44499m);
        }

        /* renamed from: b */
        public C16718c m47471b(C16722g c16722g) {
            this.f44498l = c16722g.m47497a();
            return this;
        }

        /* renamed from: c */
        public C16718c m47472c(String str) {
            this.f44487a = (String) op0.m42515e(str);
            return this;
        }

        /* renamed from: d */
        public C16718c m47473d(List list) {
            this.f44494h = nf8.m40511y(list);
            return this;
        }

        /* renamed from: e */
        public C16718c m47474e(Object obj) {
            this.f44495i = obj;
            return this;
        }

        /* renamed from: f */
        public C16718c m47475f(Uri uri) {
            this.f44488b = uri;
            return this;
        }

        /* renamed from: g */
        public C16718c m47476g(String str) {
            return m47475f(str == null ? null : Uri.parse(str));
        }

        public C16718c() {
            this.f44490d = new C16719d.a();
            this.f44491e = new C16721f.a();
            this.f44492f = Collections.emptyList();
            this.f44494h = nf8.m40499E();
            this.f44498l = new C16722g.a();
            this.f44499m = C16724i.f44581d;
            this.f44496j = -9223372036854775807L;
        }

        public C16718c(s2b s2bVar) {
            C16721f.a aVar;
            this();
            this.f44490d = s2bVar.f44484f.m47477a();
            this.f44487a = s2bVar.f44479a;
            this.f44497k = s2bVar.f44483e;
            this.f44498l = s2bVar.f44482d.m47497a();
            this.f44499m = s2bVar.f44486h;
            C16723h c16723h = s2bVar.f44480b;
            if (c16723h != null) {
                this.f44493g = c16723h.f44576e;
                this.f44489c = c16723h.f44573b;
                this.f44488b = c16723h.f44572a;
                this.f44492f = c16723h.f44575d;
                this.f44494h = c16723h.f44577f;
                this.f44495i = c16723h.f44579h;
                C16721f c16721f = c16723h.f44574c;
                if (c16721f != null) {
                    aVar = c16721f.m47486b();
                } else {
                    aVar = new C16721f.a();
                }
                this.f44491e = aVar;
                this.f44496j = c16723h.f44580i;
            }
        }
    }

    /* renamed from: o.s2b$d */
    public static class C16719d {

        /* renamed from: h */
        public static final C16719d f44500h = new a().m47483f();

        /* renamed from: i */
        public static final String f44501i = sqi.B0(0);

        /* renamed from: j */
        public static final String f44502j = sqi.B0(1);

        /* renamed from: k */
        public static final String f44503k = sqi.B0(2);

        /* renamed from: l */
        public static final String f44504l = sqi.B0(3);

        /* renamed from: m */
        public static final String f44505m = sqi.B0(4);

        /* renamed from: n */
        public static final String f44506n = sqi.B0(5);

        /* renamed from: o */
        public static final String f44507o = sqi.B0(6);

        /* renamed from: a */
        public final long f44508a;

        /* renamed from: b */
        public final long f44509b;

        /* renamed from: c */
        public final long f44510c;

        /* renamed from: d */
        public final long f44511d;

        /* renamed from: e */
        public final boolean f44512e;

        /* renamed from: f */
        public final boolean f44513f;

        /* renamed from: g */
        public final boolean f44514g;

        /* renamed from: o.s2b$d$a */
        public static final class a {

            /* renamed from: a */
            public long f44515a;

            /* renamed from: b */
            public long f44516b;

            /* renamed from: c */
            public boolean f44517c;

            /* renamed from: d */
            public boolean f44518d;

            /* renamed from: e */
            public boolean f44519e;

            /* renamed from: f */
            public C16719d m47483f() {
                return new C16719d(this);
            }

            /* renamed from: g */
            public C16720e m47484g() {
                return new C16720e(this);
            }

            public a() {
                this.f44516b = Long.MIN_VALUE;
            }

            public a(C16719d c16719d) {
                this.f44515a = c16719d.f44509b;
                this.f44516b = c16719d.f44511d;
                this.f44517c = c16719d.f44512e;
                this.f44518d = c16719d.f44513f;
                this.f44519e = c16719d.f44514g;
            }
        }

        /* renamed from: a */
        public a m47477a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16719d)) {
                return false;
            }
            C16719d c16719d = (C16719d) obj;
            return this.f44509b == c16719d.f44509b && this.f44511d == c16719d.f44511d && this.f44512e == c16719d.f44512e && this.f44513f == c16719d.f44513f && this.f44514g == c16719d.f44514g;
        }

        public int hashCode() {
            long j = this.f44509b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f44511d;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f44512e ? 1 : 0)) * 31) + (this.f44513f ? 1 : 0)) * 31) + (this.f44514g ? 1 : 0);
        }

        public C16719d(a aVar) {
            this.f44508a = sqi.q1(aVar.f44515a);
            this.f44510c = sqi.q1(aVar.f44516b);
            this.f44509b = aVar.f44515a;
            this.f44511d = aVar.f44516b;
            this.f44512e = aVar.f44517c;
            this.f44513f = aVar.f44518d;
            this.f44514g = aVar.f44519e;
        }
    }

    /* renamed from: o.s2b$e */
    public static final class C16720e extends C16719d {

        /* renamed from: p */
        public static final C16720e f44520p = new C16719d.a().m47484g();

        public C16720e(C16719d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: o.s2b$f */
    public static final class C16721f {

        /* renamed from: l */
        public static final String f44521l = sqi.B0(0);

        /* renamed from: m */
        public static final String f44522m = sqi.B0(1);

        /* renamed from: n */
        public static final String f44523n = sqi.B0(2);

        /* renamed from: o */
        public static final String f44524o = sqi.B0(3);

        /* renamed from: p */
        public static final String f44525p = sqi.B0(4);

        /* renamed from: q */
        public static final String f44526q = sqi.B0(5);

        /* renamed from: r */
        public static final String f44527r = sqi.B0(6);

        /* renamed from: s */
        public static final String f44528s = sqi.B0(7);

        /* renamed from: a */
        public final UUID f44529a;

        /* renamed from: b */
        public final UUID f44530b;

        /* renamed from: c */
        public final Uri f44531c;

        /* renamed from: d */
        public final of8 f44532d;

        /* renamed from: e */
        public final of8 f44533e;

        /* renamed from: f */
        public final boolean f44534f;

        /* renamed from: g */
        public final boolean f44535g;

        /* renamed from: h */
        public final boolean f44536h;

        /* renamed from: i */
        public final nf8 f44537i;

        /* renamed from: j */
        public final nf8 f44538j;

        /* renamed from: k */
        public final byte[] f44539k;

        /* renamed from: b */
        public a m47486b() {
            return new a();
        }

        /* renamed from: c */
        public byte[] m47487c() {
            byte[] bArr = this.f44539k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16721f)) {
                return false;
            }
            C16721f c16721f = (C16721f) obj;
            return this.f44529a.equals(c16721f.f44529a) && sqi.m48724c(this.f44531c, c16721f.f44531c) && sqi.m48724c(this.f44533e, c16721f.f44533e) && this.f44534f == c16721f.f44534f && this.f44536h == c16721f.f44536h && this.f44535g == c16721f.f44535g && this.f44538j.equals(c16721f.f44538j) && Arrays.equals(this.f44539k, c16721f.f44539k);
        }

        public int hashCode() {
            int iHashCode = this.f44529a.hashCode() * 31;
            Uri uri = this.f44531c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f44533e.hashCode()) * 31) + (this.f44534f ? 1 : 0)) * 31) + (this.f44536h ? 1 : 0)) * 31) + (this.f44535g ? 1 : 0)) * 31) + this.f44538j.hashCode()) * 31) + Arrays.hashCode(this.f44539k);
        }

        /* renamed from: o.s2b$f$a */
        public static final class a {

            /* renamed from: a */
            public UUID f44540a;

            /* renamed from: b */
            public Uri f44541b;

            /* renamed from: c */
            public of8 f44542c;

            /* renamed from: d */
            public boolean f44543d;

            /* renamed from: e */
            public boolean f44544e;

            /* renamed from: f */
            public boolean f44545f;

            /* renamed from: g */
            public nf8 f44546g;

            /* renamed from: h */
            public byte[] f44547h;

            /* renamed from: i */
            public C16721f m47496i() {
                return new C16721f(this);
            }

            public a() {
                this.f44542c = of8.m42180r();
                this.f44544e = true;
                this.f44546g = nf8.m40499E();
            }

            public a(C16721f c16721f) {
                this.f44540a = c16721f.f44529a;
                this.f44541b = c16721f.f44531c;
                this.f44542c = c16721f.f44533e;
                this.f44543d = c16721f.f44534f;
                this.f44544e = c16721f.f44535g;
                this.f44545f = c16721f.f44536h;
                this.f44546g = c16721f.f44538j;
                this.f44547h = c16721f.f44539k;
            }
        }

        public C16721f(a aVar) {
            op0.m42517g((aVar.f44545f && aVar.f44541b == null) ? false : true);
            UUID uuid = (UUID) op0.m42515e(aVar.f44540a);
            this.f44529a = uuid;
            this.f44530b = uuid;
            this.f44531c = aVar.f44541b;
            this.f44532d = aVar.f44542c;
            this.f44533e = aVar.f44542c;
            this.f44534f = aVar.f44543d;
            this.f44536h = aVar.f44545f;
            this.f44535g = aVar.f44544e;
            this.f44537i = aVar.f44546g;
            this.f44538j = aVar.f44546g;
            this.f44539k = aVar.f44547h != null ? Arrays.copyOf(aVar.f44547h, aVar.f44547h.length) : null;
        }
    }

    /* renamed from: o.s2b$g */
    public static final class C16722g {

        /* renamed from: f */
        public static final C16722g f44548f = new a().m47503f();

        /* renamed from: g */
        public static final String f44549g = sqi.B0(0);

        /* renamed from: h */
        public static final String f44550h = sqi.B0(1);

        /* renamed from: i */
        public static final String f44551i = sqi.B0(2);

        /* renamed from: j */
        public static final String f44552j = sqi.B0(3);

        /* renamed from: k */
        public static final String f44553k = sqi.B0(4);

        /* renamed from: a */
        public final long f44554a;

        /* renamed from: b */
        public final long f44555b;

        /* renamed from: c */
        public final long f44556c;

        /* renamed from: d */
        public final float f44557d;

        /* renamed from: e */
        public final float f44558e;

        /* renamed from: o.s2b$g$a */
        public static final class a {

            /* renamed from: a */
            public long f44559a;

            /* renamed from: b */
            public long f44560b;

            /* renamed from: c */
            public long f44561c;

            /* renamed from: d */
            public float f44562d;

            /* renamed from: e */
            public float f44563e;

            /* renamed from: f */
            public C16722g m47503f() {
                return new C16722g(this);
            }

            /* renamed from: g */
            public a m47504g(long j) {
                this.f44561c = j;
                return this;
            }

            /* renamed from: h */
            public a m47505h(float f) {
                this.f44563e = f;
                return this;
            }

            /* renamed from: i */
            public a m47506i(long j) {
                this.f44560b = j;
                return this;
            }

            /* renamed from: j */
            public a m47507j(float f) {
                this.f44562d = f;
                return this;
            }

            /* renamed from: k */
            public a m47508k(long j) {
                this.f44559a = j;
                return this;
            }

            public a() {
                this.f44559a = -9223372036854775807L;
                this.f44560b = -9223372036854775807L;
                this.f44561c = -9223372036854775807L;
                this.f44562d = -3.4028235E38f;
                this.f44563e = -3.4028235E38f;
            }

            public a(C16722g c16722g) {
                this.f44559a = c16722g.f44554a;
                this.f44560b = c16722g.f44555b;
                this.f44561c = c16722g.f44556c;
                this.f44562d = c16722g.f44557d;
                this.f44563e = c16722g.f44558e;
            }
        }

        /* renamed from: a */
        public a m47497a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16722g)) {
                return false;
            }
            C16722g c16722g = (C16722g) obj;
            return this.f44554a == c16722g.f44554a && this.f44555b == c16722g.f44555b && this.f44556c == c16722g.f44556c && this.f44557d == c16722g.f44557d && this.f44558e == c16722g.f44558e;
        }

        public int hashCode() {
            long j = this.f44554a;
            long j2 = this.f44555b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f44556c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f44557d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f44558e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        public C16722g(a aVar) {
            this(aVar.f44559a, aVar.f44560b, aVar.f44561c, aVar.f44562d, aVar.f44563e);
        }

        public C16722g(long j, long j2, long j3, float f, float f2) {
            this.f44554a = j;
            this.f44555b = j2;
            this.f44556c = j3;
            this.f44557d = f;
            this.f44558e = f2;
        }
    }

    /* renamed from: o.s2b$h */
    public static final class C16723h {

        /* renamed from: j */
        public static final String f44564j = sqi.B0(0);

        /* renamed from: k */
        public static final String f44565k = sqi.B0(1);

        /* renamed from: l */
        public static final String f44566l = sqi.B0(2);

        /* renamed from: m */
        public static final String f44567m = sqi.B0(3);

        /* renamed from: n */
        public static final String f44568n = sqi.B0(4);

        /* renamed from: o */
        public static final String f44569o = sqi.B0(5);

        /* renamed from: p */
        public static final String f44570p = sqi.B0(6);

        /* renamed from: q */
        public static final String f44571q = sqi.B0(7);

        /* renamed from: a */
        public final Uri f44572a;

        /* renamed from: b */
        public final String f44573b;

        /* renamed from: c */
        public final C16721f f44574c;

        /* renamed from: d */
        public final List f44575d;

        /* renamed from: e */
        public final String f44576e;

        /* renamed from: f */
        public final nf8 f44577f;

        /* renamed from: g */
        public final List f44578g;

        /* renamed from: h */
        public final Object f44579h;

        /* renamed from: i */
        public final long f44580i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16723h)) {
                return false;
            }
            C16723h c16723h = (C16723h) obj;
            return this.f44572a.equals(c16723h.f44572a) && sqi.m48724c(this.f44573b, c16723h.f44573b) && sqi.m48724c(this.f44574c, c16723h.f44574c) && sqi.m48724c(null, null) && this.f44575d.equals(c16723h.f44575d) && sqi.m48724c(this.f44576e, c16723h.f44576e) && this.f44577f.equals(c16723h.f44577f) && sqi.m48724c(this.f44579h, c16723h.f44579h) && sqi.m48724c(Long.valueOf(this.f44580i), Long.valueOf(c16723h.f44580i));
        }

        public int hashCode() {
            int iHashCode = this.f44572a.hashCode() * 31;
            String str = this.f44573b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C16721f c16721f = this.f44574c;
            int iHashCode3 = (((((iHashCode2 + (c16721f == null ? 0 : c16721f.hashCode())) * 31) + 0) * 31) + this.f44575d.hashCode()) * 31;
            String str2 = this.f44576e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f44577f.hashCode()) * 31;
            return (int) (((iHashCode4 + (this.f44579h != null ? r1.hashCode() : 0)) * 31) + this.f44580i);
        }

        public C16723h(Uri uri, String str, C16721f c16721f, C16717b c16717b, List list, String str2, nf8 nf8Var, Object obj, long j) {
            this.f44572a = uri;
            this.f44573b = xeb.m56190r(str);
            this.f44574c = c16721f;
            this.f44575d = list;
            this.f44576e = str2;
            this.f44577f = nf8Var;
            nf8.C15566a c15566aM40508q = nf8.m40508q();
            for (int i = 0; i < nf8Var.size(); i++) {
                c15566aM40508q.mo32056a(((C16726k) nf8Var.get(i)).m47513a().m47515b());
            }
            this.f44578g = c15566aM40508q.m40520k();
            this.f44579h = obj;
            this.f44580i = j;
        }
    }

    /* renamed from: o.s2b$i */
    public static final class C16724i {

        /* renamed from: d */
        public static final C16724i f44581d = new a().m47512d();

        /* renamed from: e */
        public static final String f44582e = sqi.B0(0);

        /* renamed from: f */
        public static final String f44583f = sqi.B0(1);

        /* renamed from: g */
        public static final String f44584g = sqi.B0(2);

        /* renamed from: a */
        public final Uri f44585a;

        /* renamed from: b */
        public final String f44586b;

        /* renamed from: c */
        public final Bundle f44587c;

        /* renamed from: o.s2b$i$a */
        public static final class a {

            /* renamed from: a */
            public Uri f44588a;

            /* renamed from: b */
            public String f44589b;

            /* renamed from: c */
            public Bundle f44590c;

            /* renamed from: d */
            public C16724i m47512d() {
                return new C16724i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16724i)) {
                return false;
            }
            C16724i c16724i = (C16724i) obj;
            if (sqi.m48724c(this.f44585a, c16724i.f44585a) && sqi.m48724c(this.f44586b, c16724i.f44586b)) {
                if ((this.f44587c == null) == (c16724i.f44587c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f44585a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f44586b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f44587c != null ? 1 : 0);
        }

        public C16724i(a aVar) {
            this.f44585a = aVar.f44588a;
            this.f44586b = aVar.f44589b;
            this.f44587c = aVar.f44590c;
        }
    }

    /* renamed from: o.s2b$j */
    public static final class C16725j extends C16726k {
    }

    /* renamed from: o.s2b$k */
    public static class C16726k {

        /* renamed from: a */
        public final Uri f44591a;

        /* renamed from: b */
        public final String f44592b;

        /* renamed from: c */
        public final String f44593c;

        /* renamed from: d */
        public final int f44594d;

        /* renamed from: e */
        public final int f44595e;

        /* renamed from: f */
        public final String f44596f;

        /* renamed from: g */
        public final String f44597g;

        /* renamed from: o.s2b$k$a */
        public static final class a {
            /* renamed from: b */
            public abstract C16725j m47515b();
        }

        /* renamed from: a */
        public abstract a m47513a();
    }

    /* renamed from: b */
    public static s2b m47468b(String str) {
        return new C16718c().m47476g(str).m47470a();
    }

    /* renamed from: a */
    public C16718c m47469a() {
        return new C16718c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2b)) {
            return false;
        }
        s2b s2bVar = (s2b) obj;
        return sqi.m48724c(this.f44479a, s2bVar.f44479a) && this.f44484f.equals(s2bVar.f44484f) && sqi.m48724c(this.f44480b, s2bVar.f44480b) && sqi.m48724c(this.f44482d, s2bVar.f44482d) && sqi.m48724c(this.f44483e, s2bVar.f44483e) && sqi.m48724c(this.f44486h, s2bVar.f44486h);
    }

    public int hashCode() {
        int iHashCode = this.f44479a.hashCode() * 31;
        C16723h c16723h = this.f44480b;
        return ((((((((iHashCode + (c16723h != null ? c16723h.hashCode() : 0)) * 31) + this.f44482d.hashCode()) * 31) + this.f44484f.hashCode()) * 31) + this.f44483e.hashCode()) * 31) + this.f44486h.hashCode();
    }

    public s2b(String str, C16720e c16720e, C16723h c16723h, C16722g c16722g, C2182b c2182b, C16724i c16724i) {
        this.f44479a = str;
        this.f44480b = c16723h;
        this.f44481c = c16723h;
        this.f44482d = c16722g;
        this.f44483e = c2182b;
        this.f44484f = c16720e;
        this.f44485g = c16720e;
        this.f44486h = c16724i;
    }
}
