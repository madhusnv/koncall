package c0;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import c9.C0908c;
import c9.C0914i;
import java.util.concurrent.Executor;
import l0.C4310j;
import p020v.C7600j;
import x4.C8302l;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.v */
/* loaded from: classes.dex */
public final class C0829v {

    /* renamed from: s */
    public static final Object f5225s = new Object();

    /* renamed from: t */
    public static final SparseArray f5226t = new SparseArray();

    /* renamed from: c */
    public final C0832y f5229c;

    /* renamed from: d */
    public final Executor f5230d;

    /* renamed from: e */
    public final Handler f5231e;

    /* renamed from: f */
    public final HandlerThread f5232f;

    /* renamed from: g */
    public C7600j f5233g;

    /* renamed from: h */
    public p020v.a0 f5234h;

    /* renamed from: i */
    public p020v.e0 f5235i;

    /* renamed from: j */
    public C0908c f5236j;

    /* renamed from: k */
    public C0914i f5237k;

    /* renamed from: l */
    public final m1 f5238l;

    /* renamed from: m */
    public final C8302l f5239m;

    /* renamed from: n */
    public final i0.i0 f5240n;

    /* renamed from: o */
    public EnumC0828u f5241o;

    /* renamed from: q */
    public final Integer f5243q;

    /* renamed from: r */
    public final int f5244r;

    /* renamed from: a */
    public final i0.l0 f5227a = new i0.l0();

    /* renamed from: b */
    public final Object f5228b = new Object();

    /* renamed from: p */
    public InterfaceFutureC8957d f5242p = C4310j.f21736c;

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0230, code lost:
    
        r5 = r0;
        r0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0829v(android.content.Context r8, z0.AbstractC8837c r9) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0829v.<init>(android.content.Context, z0.c):void");
    }

    /* renamed from: a */
    public static void m2230a(Integer num) {
        synchronized (f5225s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f5226t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                m2231b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static void m2231b() {
        SparseArray sparseArray = f5226t;
        if (sparseArray.size() == 0) {
            og.u1.f26821a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            og.u1.f26821a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            og.u1.f26821a = 4;
        } else if (sparseArray.get(5) != null) {
            og.u1.f26821a = 5;
        } else if (sparseArray.get(6) != null) {
            og.u1.f26821a = 6;
        }
    }
}
