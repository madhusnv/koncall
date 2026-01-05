package i0;

import a1.C0005d;
import ad.C0108o;
import ad.C0109p;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import bc.AbstractC0644c;
import bc.C0642a;
import bd.C0645a;
import cj.C0979e;
import d3.C1565s;
import ec.C2003a;
import ec.C2005c;
import ec.InterfaceC2004b;
import ib.C3222b;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k2.C3966o;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import l1.C4327p;
import lv.C4535g;
import m1.C4631m;
import ma.C4684c;
import oa.C5331c;
import og.od;
import og.pe;
import og.ud;
import pa.C5868b;
import pg.d9;
import pg.g9;
import sc.C6788h;
import sc.C6803w;
import yc.EnumC8616e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m0 {
    /* renamed from: A */
    public static /* synthetic */ void m7364A(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z6) {
                    executorService.shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: B */
    public static void m7365B(String str, C2005c c2005c, String str2) {
        c2005c.mo1862b(new C2003a(str), str2);
    }

    /* renamed from: C */
    public static void m7366C(ArrayList arrayList, C5331c c5331c) {
        arrayList.add(c5331c);
        arrayList.add(new C5868b(0));
    }

    /* renamed from: D */
    public static void m7367D(C4327p c4327p, C0979e c0979e, C0979e c0979e2) {
        c4327p.m9051i(c0979e);
        C4001v c4001v = new C4001v((byte) 0, 20);
        C6788h c6788h = (C6788h) ((C4535g) c0979e2.f5802a).f22539c;
        EnumC8616e order = EnumC8616e.After;
        c6788h.getClass();
        AbstractC4154l.m8923f(order, "order");
        c6788h.m12980c(new C6788h(2, c4001v), order);
    }

    /* renamed from: a */
    public static float m7368a(float f6, float f10, float f11, float f12) {
        return ((f6 - f10) * f11) + f12;
    }

    /* renamed from: b */
    public static int m7369b(int i10, int i11, Map map) {
        return (map.hashCode() + i10) * i11;
    }

    /* renamed from: c */
    public static int m7370c(LocalDateTime localDateTime, int i10, int i11) {
        return (localDateTime.hashCode() + i10) * i11;
    }

    /* renamed from: d */
    public static C0109p m7371d(String str, String str2, char c2, String str3, C0108o c0108o) {
        return C0108o.m297a(c0108o, str + str2 + c2 + str3);
    }

    /* renamed from: e */
    public static C0109p m7372e(StringBuilder sb2, char c2, C4684c c4684c, C0108o c0108o) {
        sb2.append(c2);
        sb2.append(c4684c.f23152b);
        return C0108o.m297a(c0108o, sb2.toString());
    }

    /* renamed from: f */
    public static C0642a m7373f(C2005c c2005c, C2003a c2003a, List list, C0109p c0109p, C2005c c2005c2) {
        c2005c.mo1862b(c2003a, list);
        return new C0642a(c0109p, (InterfaceC2004b) c2005c2);
    }

    /* renamed from: g */
    public static C2003a m7374g(String str, C2005c c2005c, String str2) {
        c2005c.mo1862b(new C2003a(str), str2);
        return AbstractC0644c.f4115a;
    }

    /* renamed from: h */
    public static ClassCastException m7375h(C0645a c0645a, C2003a c2003a) {
        ud.m10978d(c0645a, c2003a);
        return new ClassCastException();
    }

    /* renamed from: i */
    public static ClassCastException m7376i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* renamed from: j */
    public static String m7377j(int i10, int i11, String str, String str2, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    /* renamed from: k */
    public static String m7378k(String str, String str2) {
        return str + str2;
    }

    /* renamed from: l */
    public static String m7379l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: m */
    public static String m7380m(String str, String str2, List list) {
        return str + list + str2;
    }

    /* renamed from: n */
    public static String m7381n(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, str2);
        return string;
    }

    /* renamed from: o */
    public static String m7382o(StringBuilder sb2, boolean z6, char c2) {
        sb2.append(z6);
        sb2.append(c2);
        return sb2.toString();
    }

    /* renamed from: p */
    public static StringBuilder m7383p(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    /* renamed from: q */
    public static StringBuilder m7384q(StringBuilder sb2, Boolean bool, char c2, StringBuilder sb3, String str) {
        sb2.append(bool);
        sb2.append(c2);
        sb3.append(sb2.toString());
        return new StringBuilder(str);
    }

    /* renamed from: r */
    public static StringBuilder m7385r(StringBuilder sb2, String str, char c2, StringBuilder sb3, String str2) {
        sb2.append(str);
        sb2.append(c2);
        sb3.append(sb2.toString());
        return new StringBuilder(str2);
    }

    /* renamed from: s */
    public static ArrayList m7386s(Object obj) {
        od.m10798c(obj);
        return new ArrayList();
    }

    /* renamed from: t */
    public static List m7387t(int i10, String str, String str2, boolean z6) {
        return pe.m10833h(g9.m11667g(str, str2, Boolean.valueOf(z6), i10));
    }

    /* renamed from: u */
    public static List m7388u(boolean z6, String str, int i10, C2003a c2003a, String str2) {
        List listM10833h = pe.m10833h(d9.m11590c(str, Boolean.valueOf(z6), i10));
        AbstractC4154l.m8923f(c2003a, str2);
        return listM10833h;
    }

    /* renamed from: v */
    public static C4631m m7389v(C3966o c3966o) {
        C4631m c4631m = new C4631m();
        c3966o.j0(c4631m);
        return c4631m;
    }

    /* renamed from: w */
    public static C6803w m7390w(C0645a c0645a, C2003a c2003a, String str, C4147e c4147e, C4147e c4147e2) {
        c0645a.mo1862b(c2003a, str);
        return new C6803w(c4147e, c4147e2);
    }

    /* renamed from: x */
    public static void m7391x(long j6, String str, StringBuilder sb2) {
        sb2.append((Object) C1565s.m5193i(j6));
        sb2.append(str);
    }

    /* renamed from: y */
    public static void m7392y(C0005d c0005d, long j6) {
        c0005d.m75t().mo5113o();
        c0005d.e0(j6);
    }

    /* renamed from: z */
    public static void m7393z(C3222b c3222b, StringBuilder sb2, String str, String str2, char c2) {
        sb2.append(c3222b.f17375b);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(c2);
        sb2.append(c3222b.f17382i);
    }
}
