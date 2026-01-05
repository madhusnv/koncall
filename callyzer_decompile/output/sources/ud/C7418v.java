package ud;

import ix.AbstractC3363d;
import ix.C3362c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.v */
/* loaded from: classes.dex */
public final class C7418v {

    /* renamed from: d */
    public static final char[] f35216d;

    /* renamed from: e */
    public static final C3362c f35217e;

    /* renamed from: f */
    public static final long f35218f;

    /* renamed from: g */
    public static final long f35219g;

    /* renamed from: h */
    public static final long f35220h;

    /* renamed from: i */
    public static final long f35221i;

    /* renamed from: a */
    public final long f35222a;

    /* renamed from: b */
    public final long f35223b;

    /* renamed from: c */
    public final String f35224c;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        AbstractC4154l.m8922e(charArray, "toCharArray(...)");
        f35216d = charArray;
        f35217e = AbstractC3363d.f17771a;
        f35218f = 61440 & 4294967295L;
        f35219g = 16384 & 4294967295L;
        f35220h = -4611686018427387904L;
        f35221i = Long.MIN_VALUE;
    }

    public C7418v(long j6, long j10) {
        this.f35222a = j6;
        this.f35223b = j10;
        char[] cArr = new char[36];
        a0.m11532c(j6, 0, cArr, 0, 4);
        cArr[8] = '-';
        a0.m11532c(j6, 4, cArr, 9, 2);
        cArr[13] = '-';
        a0.m11532c(j6, 6, cArr, 14, 2);
        cArr[18] = '-';
        a0.m11532c(j10, 0, cArr, 19, 2);
        cArr[23] = '-';
        a0.m11532c(j10, 2, cArr, 24, 6);
        this.f35224c = new String(cArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7418v)) {
            return false;
        }
        C7418v c7418v = (C7418v) obj;
        return this.f35222a == c7418v.f35222a && this.f35223b == c7418v.f35223b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35223b) + (Long.hashCode(this.f35222a) * 31);
    }

    public final String toString() {
        return this.f35224c;
    }
}
