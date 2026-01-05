package ej;

import a0.C0001a;
import android.content.Context;
import android.os.Trace;
import c0.C0823p;
import c0.C0825r;
import c0.C0829v;
import c0.C0833z;
import c0.InterfaceC0822o;
import c0.InterfaceC0824q;
import c0.b2;
import c0.d1;
import c9.C0908c;
import c9.C0914i;
import d7.InterfaceC1649u;
import i0.C3072c;
import i0.C3077h;
import i0.a0;
import i0.b0;
import i0.e0;
import i0.g0;
import i0.o0;
import i0.w0;
import i0.z2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l0.C4310j;
import m0.C4612f;
import og.oa;
import og.pe;
import p020v.C7600j;
import pg.o7;
import wi.C8072v;
import z0.C8835a;
import z0.C8836b;
import z0.C8839e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ej.e */
/* loaded from: classes.dex */
public final class C2060e implements InterfaceC0824q {

    /* renamed from: a */
    public int f9650a;

    /* renamed from: b */
    public final Object f9651b;

    /* renamed from: c */
    public Object f9652c;

    /* renamed from: d */
    public Object f9653d;

    /* renamed from: e */
    public final Object f9654e;

    /* renamed from: f */
    public Object f9655f;

    /* renamed from: g */
    public Object f9656g;

    /* renamed from: h */
    public final Serializable f9657h;

    /* renamed from: i */
    public final Object f9658i;

    public C2060e(String str, String str2, String str3, String str4, C8072v c8072v, String str5, String str6, String str7, int i10) {
        this.f9651b = str;
        this.f9652c = str2;
        this.f9653d = str3;
        this.f9654e = str4;
        this.f9658i = c8072v;
        this.f9655f = str5;
        this.f9656g = str6;
        this.f9657h = str7;
        this.f9650a = i10;
    }

    /* renamed from: b */
    public static final a0 m5783b(C2060e c2060e, C0825r c0825r) {
        Iterator it = c0825r.f5204a.iterator();
        AbstractC4154l.m8922e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC4154l.m8922e(next, "next(...)");
            C3077h c3077h = InterfaceC0822o.f5183a;
            if (!AbstractC4154l.m8918a(c3077h, c3077h)) {
                synchronized (w0.f16610a) {
                }
                AbstractC4154l.m8920c((Context) c2060e.f9656g);
            }
        }
        return b0.f16434a;
    }

    /* renamed from: c */
    public static final void m5784c(C2060e c2060e, int i10) {
        C0829v c0829v = (C0829v) c2060e.f9655f;
        if (c0829v == null) {
            return;
        }
        C7600j c7600j = c0829v.f5233g;
        if (c7600j == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        C0001a c0001a = c7600j.f36596b;
        synchronized (c0001a.f0a) {
            try {
                int i11 = c0001a.f6g;
                if (i10 == i11) {
                    return;
                }
                c0001a.f6g = i10;
                ArrayList arrayList = new ArrayList(c0001a.f2c);
                if (i11 == 2 && i10 != 2) {
                    c0001a.f5f.clear();
                }
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    o0 o0Var = (o0) obj;
                    synchronized (o0Var.f16543b) {
                        boolean z6 = true;
                        o0Var.f16544c = i10 == 2 ? 2 : 1;
                        boolean z10 = i11 != 2 && i10 == 2;
                        if (i11 != 2 || i10 == 2) {
                            z6 = false;
                        }
                        if (z10 || z6) {
                            o0Var.m7396b();
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: d */
    public static C8836b m5785d(C2060e c2060e, InterfaceC1649u interfaceC1649u, C0825r c0825r, d1 d1Var) {
        C8836b c8836bM16296b;
        Collection collectionUnmodifiableCollection;
        boolean zContains;
        C0833z c0833z = C0833z.f5289d;
        Trace.beginSection(oa.m10795e("CX:bindToLifecycle-internal"));
        try {
            o7.m11806a();
            C0829v c0829v = (C0829v) c2060e.f9655f;
            AbstractC4154l.m8920c(c0829v);
            g0 g0VarM2227c = c0825r.m2227c(c0829v.f5227a.m7359c());
            AbstractC4154l.m8922e(g0VarM2227c, "select(...)");
            g0VarM2227c.mo7318p(true);
            C3072c c3072cM5786e = c2060e.m5786e(c0825r);
            C3077h c3077h = ((a0) c3072cM5786e.f16436c).f16423a;
            AbstractC4154l.m8922e(c3077h, "getCompatibilityId(...)");
            String strMo7323e = c3072cM5786e.f16612a.mo7323e();
            AbstractC4154l.m8922e(strMo7323e, "getCameraId(...)");
            C0823p c0823p = new C0823p(pe.m10835j(strMo7323e), c3077h);
            C8839e c8839e = (C8839e) c2060e.f9654e;
            synchronized (c8839e.f42549a) {
                c8836bM16296b = (C8836b) c8839e.f42550b.get(new C8835a(System.identityHashCode(interfaceC1649u), c0823p));
            }
            C8839e c8839e2 = (C8839e) c2060e.f9654e;
            synchronized (c8839e2.f42549a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(c8839e2.f42550b.values());
            }
            for (b2 b2Var : (List) d1Var.f5069d) {
                for (Object obj : collectionUnmodifiableCollection) {
                    AbstractC4154l.m8922e(obj, "next(...)");
                    C8836b c8836b = (C8836b) obj;
                    synchronized (c8836b.f42540a) {
                        zContains = ((ArrayList) c8836b.f42542c.m9497z()).contains(b2Var);
                    }
                    if (zContains && !AbstractC4154l.m8918a(c8836b.m16290e(), interfaceC1649u)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{b2Var}, 1)));
                    }
                }
            }
            if (c8836bM16296b == null) {
                C8839e c8839e3 = (C8839e) c2060e.f9654e;
                C0829v c0829v2 = (C0829v) c2060e.f9655f;
                AbstractC4154l.m8920c(c0829v2);
                C0914i c0914i = c0829v2.f5237k;
                if (c0914i == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                c8836bM16296b = c8839e3.m16296b(interfaceC1649u, new C4612f(g0VarM2227c, null, c3072cM5786e, null, c0833z, c0833z, (C0001a) c0914i.f5586b, (C0908c) c0914i.f5588d, (z2) c0914i.f5587c));
            }
            if (!((List) d1Var.f5069d).isEmpty()) {
                C8839e c8839e4 = (C8839e) c2060e.f9654e;
                C0829v c0829v3 = (C0829v) c2060e.f9655f;
                AbstractC4154l.m8920c(c0829v3);
                C7600j c7600j = c0829v3.f5233g;
                if (c7600j == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                c8839e4.m16295a(c8836bM16296b, d1Var, c7600j.f36596b);
                ((HashSet) c2060e.f9658i).add(new C8835a(System.identityHashCode(interfaceC1649u), c0823p));
            }
            return c8836bM16296b;
        } finally {
            Trace.endSection();
        }
    }

    @Override // c0.InterfaceC0824q
    /* renamed from: a */
    public int mo2224a() {
        return this.f9650a;
    }

    /* renamed from: e */
    public C3072c m5786e(C0825r cameraSelector) {
        Object c3072c;
        AbstractC4154l.m8923f(cameraSelector, "cameraSelector");
        Trace.beginSection(oa.m10795e("CX:getCameraInfo"));
        try {
            C0829v c0829v = (C0829v) this.f9655f;
            AbstractC4154l.m8920c(c0829v);
            e0 e0VarMo7319q = cameraSelector.m2227c(c0829v.f5227a.m7359c()).mo7319q();
            AbstractC4154l.m8922e(e0VarMo7319q, "getCameraInfoInternal(...)");
            a0 a0VarM5783b = m5783b(this, cameraSelector);
            String strMo7323e = e0VarMo7319q.mo7323e();
            AbstractC4154l.m8922e(strMo7323e, "getCameraId(...)");
            C0823p c0823p = new C0823p(pe.m10835j(strMo7323e), a0VarM5783b.f16423a);
            synchronized (this.f9651b) {
                c3072c = ((HashMap) this.f9657h).get(c0823p);
                if (c3072c == null) {
                    c3072c = new C3072c(e0VarMo7319q, a0VarM5783b);
                    ((HashMap) this.f9657h).put(c0823p, c3072c);
                }
            }
            return (C3072c) c3072c;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: f */
    public void m5787f() {
        Trace.beginSection(oa.m10795e("CX:unbindAll"));
        try {
            o7.m11806a();
            m5784c(this, 0);
            ((C8839e) this.f9654e).m16303i((HashSet) this.f9658i);
        } finally {
            Trace.endSection();
        }
    }

    public C2060e() {
        C8839e c8839e;
        this.f9651b = new Object();
        this.f9653d = C4310j.f21736c;
        synchronized (C8839e.f42547f) {
            try {
                if (C8839e.f42548g == null) {
                    C8839e.f42548g = new C8839e();
                }
                c8839e = C8839e.f42548g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC4154l.m8922e(c8839e, "getInstance(...)");
        this.f9654e = c8839e;
        this.f9657h = new HashMap();
        this.f9658i = new HashSet();
        this.f9650a = -1;
    }
}
