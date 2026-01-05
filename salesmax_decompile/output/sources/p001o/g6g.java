package p001o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g6g {

    /* renamed from: a */
    public final rlh f24649a = rlh.m46947b();

    /* renamed from: b */
    public boolean f24650b;

    /* renamed from: c */
    public long f24651c;

    /* renamed from: d */
    public long f24652d;

    /* renamed from: o.g6g$a */
    public static /* synthetic */ class C13630a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24653a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f24653a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24653a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24653a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24653a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24653a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24653a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24653a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public static String m28100a(TimeUnit timeUnit) {
        switch (C13630a.f24653a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static TimeUnit m28101b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* renamed from: c */
    public static g6g m28102c() {
        return new g6g();
    }

    /* renamed from: d */
    public long m28103d(TimeUnit timeUnit) {
        return timeUnit.convert(m28104e(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: e */
    public final long m28104e() {
        return this.f24650b ? (this.f24649a.mo46948a() - this.f24652d) + this.f24651c : this.f24651c;
    }

    /* renamed from: f */
    public g6g m28105f() {
        dgd.m23069v(!this.f24650b, "This stopwatch is already running.");
        this.f24650b = true;
        this.f24652d = this.f24649a.mo46948a();
        return this;
    }

    public String toString() {
        long jM28104e = m28104e();
        TimeUnit timeUnitM28101b = m28101b(jM28104e);
        return b9d.m18460b(jM28104e / TimeUnit.NANOSECONDS.convert(1L, timeUnitM28101b)) + " " + m28100a(timeUnitM28101b);
    }
}
