package pg;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4262d;
import kx.C4264f;
import kx.C4266h;
import kx.C4268j;
import kx.InterfaceC4263e;
import zc.C8928e;
import zc.C8931h;
import zc.C8934k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w9 {
    /* renamed from: a */
    public static double m11910a(double d2, double d10, double d11) {
        if (d10 <= d11) {
            return d2 < d10 ? d10 : d2 > d11 ? d11 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    /* renamed from: b */
    public static float m11911b(float f6, float f10, float f11) {
        if (f10 <= f11) {
            return f6 < f10 ? f10 : f6 > f11 ? f11 : f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    /* renamed from: c */
    public static int m11912c(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* renamed from: d */
    public static long m11913d(long j6, long j10, long j11) {
        if (j10 <= j11) {
            return j6 < j10 ? j10 : j6 > j11 ? j11 : j6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static long m11914e(long j6, C4268j c4268j) {
        long j10 = c4268j.f21659b;
        long j11 = c4268j.f21658a;
        if (c4268j instanceof InterfaceC4263e) {
            return ((Number) m11915f(Long.valueOf(j6), (C4262d) ((InterfaceC4263e) c4268j))).longValue();
        }
        if (!c4268j.isEmpty()) {
            return j6 < Long.valueOf(j11).longValue() ? Long.valueOf(j11).longValue() : j6 > Long.valueOf(j10).longValue() ? Long.valueOf(j10).longValue() : j6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c4268j + '.');
    }

    /* renamed from: f */
    public static Comparable m11915f(Comparable comparable, C4262d c4262d) {
        float f6 = c4262d.f21645b;
        float f10 = c4262d.f21644a;
        if (!c4262d.m8983a()) {
            return (!c4262d.m8984b(comparable, Float.valueOf(f10)) || c4262d.m8984b(Float.valueOf(f10), comparable)) ? (!c4262d.m8984b(Float.valueOf(f6), comparable) || c4262d.m8984b(comparable, Float.valueOf(f6))) ? comparable : Float.valueOf(f6) : Float.valueOf(f10);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c4262d + '.');
    }

    /* renamed from: g */
    public static Comparable m11916g(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + '.');
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    /* renamed from: h */
    public static C4264f m11917h(int i10, C4266h c4266h) {
        AbstractC4154l.m8923f(c4266h, "<this>");
        boolean z6 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (!z6) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i11 = c4266h.f21646a;
        int i12 = c4266h.f21647b;
        if (c4266h.f21648c <= 0) {
            i10 = -i10;
        }
        return new C4264f(i11, i12, i10);
    }

    /* renamed from: i */
    public static final C8928e m11918i(InetAddress inetAddress) {
        z9 c8934k;
        if (inetAddress instanceof Inet4Address) {
            byte[] address = ((Inet4Address) inetAddress).getAddress();
            AbstractC4154l.m8922e(address, "getAddress(...)");
            c8934k = new C8931h(address);
        } else {
            if (!(inetAddress instanceof Inet6Address)) {
                throw new IllegalStateException(("unrecognized InetAddress " + inetAddress).toString());
            }
            byte[] address2 = ((Inet6Address) inetAddress).getAddress();
            AbstractC4154l.m8922e(address2, "getAddress(...)");
            c8934k = new C8934k(address2, null);
        }
        String hostName = inetAddress.getHostName();
        AbstractC4154l.m8922e(hostName, "getHostName(...)");
        return new C8928e(hostName, c8934k);
    }

    /* renamed from: j */
    public static C4266h m11919j(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new C4266h(i10, i11 - 1, 1);
        }
        C4266h c4266h = C4266h.f21653d;
        return C4266h.f21653d;
    }
}
