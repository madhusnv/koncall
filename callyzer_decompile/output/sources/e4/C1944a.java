package e4;

import a2.C0036i;
import android.os.Handler;
import b2.C0554l;
import c3.C0846a;
import d3.b0;
import e1.e0;
import lv.C4535g;
import m2.C4640e;
import og.pd;
import og.xe;
import org.bouncycastle.asn1.BERTags;
import s4.C6754j;
import v3.C7649u;
import v3.g0;
import v3.h1;
import v3.o1;
import v4.RunnableC7655a;
import w2.AbstractC7863b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e4.a */
/* loaded from: classes.dex */
public final class C1944a {

    /* renamed from: a */
    public final C0554l f9178a;

    /* renamed from: b */
    public final C1945b f9179b;

    /* renamed from: c */
    public final e0 f9180c;

    /* renamed from: d */
    public boolean f9181d;

    /* renamed from: e */
    public boolean f9182e;

    /* renamed from: f */
    public boolean f9183f;

    /* renamed from: g */
    public RunnableC7655a f9184g;

    /* renamed from: h */
    public long f9185h;

    /* renamed from: i */
    public final C0036i f9186i;

    /* renamed from: j */
    public final C0846a f9187j;

    public C1944a() {
        C0554l c0554l = new C0554l(2, (char) 0);
        c0554l.f3779c = new long[BERTags.PRIVATE];
        c0554l.f3780d = new long[BERTags.PRIVATE];
        this.f9178a = c0554l;
        this.f9179b = new C1945b();
        this.f9180c = new e0();
        this.f9185h = -1L;
        this.f9186i = new C0036i(3, this);
        this.f9187j = new C0846a();
    }

    /* renamed from: g */
    public static long m5693g(g0 g0Var) {
        float[] fArrMo16698getUnderlyingMatrixsQKQjiQ;
        int iM10823a;
        C4535g c4535g = g0Var.f36832K;
        h1 h1Var = (h1) c4535g.f22540d;
        h1 h1Var2 = (C7649u) c4535g.f22539c;
        long jM11047d = 0;
        while (h1Var2 != null && h1Var2 != h1Var) {
            o1 o1Var = h1Var2.f36901K;
            jM11047d = xe.m11047d(jM11047d, h1Var2.f36913z);
            h1Var2 = h1Var2.f36904p;
            if (o1Var != null && (iM10823a = pd.m10823a((fArrMo16698getUnderlyingMatrixsQKQjiQ = o1Var.mo16698getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iM10823a & 2) == 0) {
                    return 9223372034707292159L;
                }
                jM11047d = b0.m5095b(jM11047d, fArrMo16698getUnderlyingMatrixsQKQjiQ);
            }
        }
        return xe.m11048e(jM11047d);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0175  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5694a() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C1944a.m5694a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5695b(v3.g0 r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C1944a.m5695b(v3.g0, long, boolean):void");
    }

    /* renamed from: c */
    public final void m5696c(g0 g0Var) {
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            m5695b(g0Var2, ((h1) g0Var2.f36832K.f22540d).f36913z, false);
            m5696c(g0Var2);
        }
    }

    /* renamed from: d */
    public final void m5697d(g0 g0Var) {
        this.f9181d = true;
        int i10 = g0Var.f36843b & 67108863;
        C0554l c0554l = this.f9178a;
        long[] jArr = (long[]) c0554l.f3779c;
        int i11 = c0554l.f3778b;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            long j6 = jArr[i13];
            if ((((int) j6) & 67108863) == i10) {
                jArr[i13] = 2305843009213693952L | j6;
                break;
            }
            i12 += 3;
        }
        RunnableC7655a runnableC7655a = this.f9184g;
        boolean z6 = runnableC7655a != null;
        long j10 = this.f9179b.f9189b;
        if (j10 >= 0 || !z6) {
            if (this.f9185h == j10 && z6) {
                return;
            }
            if (runnableC7655a != null) {
                Handler handler = AbstractC7863b.f37641a;
                AbstractC7863b.f37641a.removeCallbacks(runnableC7655a);
            }
            Handler handler2 = AbstractC7863b.f37641a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j10, 16 + jCurrentTimeMillis);
            this.f9185h = jMax;
            RunnableC7655a runnableC7655a2 = new RunnableC7655a(2, this.f9186i);
            AbstractC7863b.f37641a.postDelayed(runnableC7655a2, jMax - jCurrentTimeMillis);
            this.f9184g = runnableC7655a2;
        }
    }

    /* renamed from: e */
    public final void m5698e(g0 g0Var) {
        long jM5693g = m5693g(g0Var);
        if (C6754j.m12940a(jM5693g, 9223372034707292159L)) {
            m5696c(g0Var);
            return;
        }
        g0Var.f36846e = jM5693g;
        g0Var.f36847f = false;
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            m5699f(g0Var2, ((h1) g0Var2.f36832K.f22540d).f36913z, false);
        }
        m5697d(g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5699f(v3.g0 r29, long r30, boolean r32) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C1944a.m5699f(v3.g0, long, boolean):void");
    }

    /* renamed from: h */
    public final void m5700h(g0 g0Var) {
        int i10 = g0Var.f36843b & 67108863;
        C0554l c0554l = this.f9178a;
        long[] jArr = (long[]) c0554l.f3779c;
        int i11 = c0554l.f3778b;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & 67108863) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                break;
            }
            i12 += 3;
        }
        this.f9181d = true;
        this.f9183f = true;
    }
}
