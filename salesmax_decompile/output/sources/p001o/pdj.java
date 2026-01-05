package p001o;

import p001o.inb;

/* loaded from: classes2.dex */
public final class pdj {

    /* renamed from: a */
    public final inb.C14334a f39932a;

    /* renamed from: b */
    public final long f39933b;

    /* renamed from: c */
    public final long f39934c;

    /* renamed from: d */
    public final int f39935d;

    /* renamed from: e */
    public final int f39936e;

    /* renamed from: f */
    public final long[] f39937f;

    public pdj(inb.C14334a c14334a, long j, long j2, long[] jArr, int i, int i2) {
        this.f39932a = new inb.C14334a(c14334a);
        this.f39933b = j;
        this.f39934c = j2;
        this.f39937f = jArr;
        this.f39935d = i;
        this.f39936e = i2;
    }

    /* renamed from: b */
    public static pdj m43494b(inb.C14334a c14334a, zwc zwcVar) {
        long[] jArr;
        int i;
        int i2;
        int iM60036q = zwcVar.m60036q();
        int iM60008L = (iM60036q & 1) != 0 ? zwcVar.m60008L() : -1;
        long jM60006J = (iM60036q & 2) != 0 ? zwcVar.m60006J() : -1L;
        if ((iM60036q & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zwcVar.m60004H();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iM60036q & 8) != 0) {
            zwcVar.m60018V(4);
        }
        if (zwcVar.m60020a() >= 24) {
            zwcVar.m60018V(21);
            int iM60007K = zwcVar.m60007K();
            i2 = iM60007K & 4095;
            i = (16773120 & iM60007K) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new pdj(c14334a, iM60008L, jM60006J, jArr, i, i2);
    }

    /* renamed from: a */
    public long m43495a() {
        long j = this.f39933b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return sqi.Z0((j * r2.f28969g) - 1, this.f39932a.f28966d);
    }
}
