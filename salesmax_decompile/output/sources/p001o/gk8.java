package p001o;

import com.amazonaws.util.DateUtils;
import com.google.android.gms.cast.HlsSegmentFormat;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes3.dex */
public final class gk8 implements Comparable {

    /* renamed from: b */
    public static final C13769a f25374b = new C13769a(null);

    /* renamed from: c */
    public static final DateTimeFormatter f25375c = ik8.m32247c();

    /* renamed from: d */
    public static final ZoneId f25376d;

    /* renamed from: e */
    public static final DateTimeFormatter f25377e;

    /* renamed from: f */
    public static final DateTimeFormatter f25378f;

    /* renamed from: g */
    public static final gk8 f25379g;

    /* renamed from: h */
    public static final gk8 f25380h;

    /* renamed from: a */
    public final Instant f25381a;

    /* renamed from: o.gk8$a */
    public static final class C13769a {
        public C13769a() {
        }

        public /* synthetic */ C13769a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ gk8 m28957c(C13769a c13769a, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c13769a.m28958a(j, i);
        }

        /* renamed from: a */
        public final gk8 m28958a(long j, int i) {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j, i);
            sq8.m48648g(instantOfEpochSecond, "ofEpochSecond(...)");
            return new gk8(instantOfEpochSecond);
        }

        /* renamed from: b */
        public final gk8 m28959b(String str) {
            sq8.m48649h(str, HlsSegmentFormat.TS);
            return pyc.m44349z(str);
        }

        /* renamed from: d */
        public final gk8 m28960d(String str) {
            sq8.m48649h(str, HlsSegmentFormat.TS);
            return ik8.m32248d(pyc.m44300A(str));
        }

        /* renamed from: e */
        public final gk8 m28961e(String str) {
            sq8.m48649h(str, HlsSegmentFormat.TS);
            return ik8.m32248d(pyc.m44301B(str));
        }

        /* renamed from: f */
        public final gk8 m28962f() {
            return gk8.f25380h;
        }

        /* renamed from: g */
        public final gk8 m28963g() {
            Instant instantNow = Instant.now();
            sq8.m48648g(instantNow, "now(...)");
            return new gk8(instantNow);
        }
    }

    /* renamed from: o.gk8$b */
    public /* synthetic */ class C13770b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25382a;

        static {
            int[] iArr = new int[vmh.values().length];
            try {
                iArr[vmh.ISO_8601.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vmh.ISO_8601_CONDENSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vmh.ISO_8601_CONDENSED_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vmh.ISO_8601_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vmh.RFC_5322.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vmh.EPOCH_SECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f25382a = iArr;
        }
    }

    static {
        ZoneId zoneIdOf = ZoneId.of("Z");
        f25376d = zoneIdOf;
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern(DateUtils.COMPRESSED_DATE_PATTERN).withZone(zoneIdOf);
        sq8.m48648g(dateTimeFormatterWithZone, "withZone(...)");
        f25377e = dateTimeFormatterWithZone;
        DateTimeFormatter dateTimeFormatterWithZone2 = DateTimeFormatter.ofPattern("yyyyMMdd").withZone(zoneIdOf);
        sq8.m48648g(dateTimeFormatterWithZone2, "withZone(...)");
        f25378f = dateTimeFormatterWithZone2;
        Instant instant = Instant.MIN;
        sq8.m48648g(instant, "MIN");
        f25379g = new gk8(instant);
        Instant instant2 = Instant.MAX;
        sq8.m48648g(instant2, "MAX");
        f25380h = new gk8(instant2);
    }

    public gk8(Instant instant) {
        sq8.m48649h(instant, "value");
        this.f25381a = instant;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(gk8 gk8Var) {
        sq8.m48649h(gk8Var, "other");
        return this.f25381a.compareTo(gk8Var.f25381a);
    }

    /* renamed from: d */
    public final String m28951d(vmh vmhVar) {
        sq8.m48649h(vmhVar, "fmt");
        switch (C13770b.f25382a[vmhVar.ordinal()]) {
            case 1:
                String str = DateTimeFormatter.ISO_INSTANT.format(this.f25381a.truncatedTo(ChronoUnit.MICROS));
                sq8.m48648g(str, "format(...)");
                return str;
            case 2:
                String str2 = f25377e.format(this.f25381a);
                sq8.m48648g(str2, "format(...)");
                return str2;
            case 3:
                String str3 = f25378f.format(this.f25381a);
                sq8.m48648g(str3, "format(...)");
                return str3;
            case 4:
                String str4 = DateTimeFormatter.ISO_INSTANT.format(this.f25381a);
                sq8.m48648g(str4, "format(...)");
                return str4;
            case 5:
                String str5 = f25375c.format(ZonedDateTime.ofInstant(this.f25381a, ZoneOffset.UTC));
                sq8.m48648g(str5, "format(...)");
                return str5;
            case 6:
                StringBuffer stringBuffer = new StringBuffer(String.valueOf(m28952e()));
                if (m28953g() <= 0) {
                    String string = stringBuffer.toString();
                    sq8.m48646e(string);
                    return string;
                }
                stringBuffer.append(".");
                String strValueOf = String.valueOf(m28953g());
                stringBuffer.append(e9g.m24589C("0", 9 - strValueOf.length()));
                stringBuffer.append(strValueOf);
                return f9g.a1(stringBuffer, '0').toString();
            default:
                throw new szb();
        }
    }

    /* renamed from: e */
    public final long m28952e() {
        return this.f25381a.getEpochSecond();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof gk8) && sq8.m48644c(this.f25381a, ((gk8) obj).f25381a));
    }

    /* renamed from: g */
    public final int m28953g() {
        return this.f25381a.getNano();
    }

    /* renamed from: h */
    public final Instant m28954h() {
        return this.f25381a;
    }

    public int hashCode() {
        return this.f25381a.hashCode();
    }

    /* renamed from: j */
    public final gk8 m28955j(long j) {
        return m28956m(k16.m34877W(j));
    }

    /* renamed from: m */
    public final gk8 m28956m(long j) {
        return f25374b.m28958a(m28952e() + k16.m34856B(j), m28953g() + k16.m34858D(j));
    }

    public String toString() {
        return m28951d(vmh.ISO_8601);
    }
}
