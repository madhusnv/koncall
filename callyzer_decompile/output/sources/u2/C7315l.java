package u2;

import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.Iterator;
import og.h1;
import rw.AbstractC6662l;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.l */
/* loaded from: classes.dex */
public final class C7315l implements Iterable, InterfaceC2395a {

    /* renamed from: e */
    public static final C7315l f34884e = new C7315l(0, 0, 0, null);

    /* renamed from: a */
    public final long f34885a;

    /* renamed from: b */
    public final long f34886b;

    /* renamed from: c */
    public final long f34887c;

    /* renamed from: d */
    public final long[] f34888d;

    public C7315l(long j6, long j10, long j11, long[] jArr) {
        this.f34885a = j6;
        this.f34886b = j10;
        this.f34887c = j11;
        this.f34888d = jArr;
    }

    /* renamed from: b */
    public final C7315l m13671b(C7315l c7315l) {
        C7315l c7315lM13672h;
        long j6;
        long[] jArr;
        C7315l c7315l2 = f34884e;
        if (c7315l == c7315l2) {
            return this;
        }
        if (this == c7315l2) {
            return c7315l2;
        }
        long j10 = c7315l.f34887c;
        long j11 = c7315l.f34887c;
        long[] jArr2 = c7315l.f34888d;
        long j12 = c7315l.f34886b;
        long j13 = c7315l.f34885a;
        long j14 = this.f34887c;
        if (j10 == j14 && jArr2 == (jArr = this.f34888d)) {
            return new C7315l(this.f34885a & (~j13), this.f34886b & (~j12), j14, jArr);
        }
        if (jArr2 != null) {
            c7315lM13672h = this;
            for (long j15 : jArr2) {
                c7315lM13672h = c7315lM13672h.m13672h(j15);
            }
        } else {
            c7315lM13672h = this;
        }
        long j16 = 0;
        if (j12 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j12) != j16) {
                    j6 = j16;
                    c7315lM13672h = c7315lM13672h.m13672h(i10 + j11);
                } else {
                    j6 = j16;
                }
                i10++;
                j16 = j6;
            }
        }
        long j17 = j16;
        if (j13 != j17) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j13) != j17) {
                    c7315lM13672h = c7315lM13672h.m13672h(i11 + j11 + 64);
                }
            }
        }
        return c7315lM13672h;
    }

    /* renamed from: h */
    public final C7315l m13672h(long j6) {
        long[] jArr;
        int iM13705b;
        long[] jArr2;
        long j10 = this.f34887c;
        long j11 = j6 - j10;
        if (j11 >= 0 && j11 < 64) {
            long j12 = 1 << ((int) j11);
            long j13 = this.f34886b;
            if ((j13 & j12) != 0) {
                return new C7315l(this.f34885a, j13 & (~j12), j10, this.f34888d);
            }
        } else if (j11 >= 64 && j11 < 128) {
            long j14 = 1 << (((int) j11) - 64);
            long j15 = this.f34885a;
            if ((j15 & j14) != 0) {
                return new C7315l(j15 & (~j14), this.f34886b, j10, this.f34888d);
            }
        } else if (j11 < 0 && (jArr = this.f34888d) != null && (iM13705b = AbstractC7321r.m13705b(jArr, j6)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iM13705b > 0) {
                    AbstractC6662l.m12718h(0, jArr, 0, jArr3, iM13705b);
                }
                if (iM13705b < i10) {
                    AbstractC6662l.m12718h(iM13705b, jArr, iM13705b + 1, jArr3, length);
                }
                jArr2 = jArr3;
            }
            return new C7315l(this.f34885a, this.f34886b, this.f34887c, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return h1.m10679a(new C7314k(this, null));
    }

    /* renamed from: j */
    public final boolean m13673j(long j6) {
        long[] jArr;
        long j10 = j6 - this.f34887c;
        return (j10 < 0 || j10 >= 64) ? (j10 < 64 || j10 >= 128) ? j10 <= 0 && (jArr = this.f34888d) != null && AbstractC7321r.m13705b(jArr, j6) >= 0 : ((1 << (((int) j10) + (-64))) & this.f34885a) != 0 : ((1 << ((int) j10)) & this.f34886b) != 0;
    }

    /* renamed from: q */
    public final C7315l m13674q(C7315l c7315l) {
        C7315l c7315lM13675r;
        C7315l c7315lM13675r2;
        long[] jArr;
        C7315l c7315l2 = f34884e;
        if (c7315l == c7315l2) {
            return this;
        }
        if (this == c7315l2) {
            return c7315l;
        }
        long j6 = c7315l.f34887c;
        long j10 = c7315l.f34887c;
        long[] jArr2 = c7315l.f34888d;
        long j11 = c7315l.f34886b;
        long j12 = c7315l.f34885a;
        long j13 = this.f34887c;
        long j14 = this.f34886b;
        long j15 = this.f34885a;
        if (j6 == j13 && jArr2 == (jArr = this.f34888d)) {
            return new C7315l(j15 | j12, j14 | j11, j13, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f34888d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                c7315lM13675r = this;
                for (long j16 : jArr2) {
                    c7315lM13675r = c7315lM13675r.m13675r(j16);
                }
            } else {
                c7315lM13675r = this;
            }
            if (j11 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j11) != 0) {
                        c7315lM13675r = c7315lM13675r.m13675r(i11 + j10);
                    }
                }
            }
            if (j12 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j12) != 0) {
                        c7315lM13675r = c7315lM13675r.m13675r(i10 + j10 + 64);
                    }
                    i10++;
                }
            }
            return c7315lM13675r;
        }
        if (jArr3 != null) {
            c7315lM13675r2 = c7315l;
            for (long j17 : jArr3) {
                c7315lM13675r2 = c7315lM13675r2.m13675r(j17);
            }
        } else {
            c7315lM13675r2 = c7315l;
        }
        long j18 = this.f34887c;
        if (j14 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != 0) {
                    c7315lM13675r2 = c7315lM13675r2.m13675r(i12 + j18);
                }
            }
        }
        if (j15 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j15) != 0) {
                    c7315lM13675r2 = c7315lM13675r2.m13675r(i10 + j18 + 64);
                }
                i10++;
            }
        }
        return c7315lM13675r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u2.C7315l m13675r(long r30) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7315l.m13675r(long):u2.l");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
