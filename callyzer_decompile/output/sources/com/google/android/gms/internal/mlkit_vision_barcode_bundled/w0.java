package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: c */
    public static final w0 f6690c = new w0(0);

    /* renamed from: a */
    public final g2 f6691a = new g2();

    /* renamed from: b */
    public boolean f6692b;

    public w0() {
    }

    /* renamed from: a */
    public static int m3996a(c1 c1Var, Object obj) {
        c1Var.getClass();
        s0.m3951a(0 << 3);
        if (q2.zzj == null) {
            Charset charset = l1.f6594a;
        }
        r2 r2Var = r2.INT;
        throw null;
    }

    /* renamed from: h */
    public static boolean m3997h(Map.Entry entry) {
        ((c1) entry.getKey()).getClass();
        throw null;
    }

    /* renamed from: i */
    public static final int m3998i(Map.Entry entry) {
        c1 c1Var = (c1) entry.getKey();
        entry.getValue();
        c1Var.getClass();
        throw null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w0 clone() {
        w0 w0Var = new w0();
        g2 g2Var = this.f6691a;
        int i10 = g2Var.f6538b;
        for (int i11 = 0; i11 < i10; i11++) {
            h2 h2VarM3886f = g2Var.m3886f(i11);
            w0Var.m4002e((c1) h2VarM3886f.f6551a, h2VarM3886f.f6552b);
        }
        for (Map.Entry entry : g2Var.m3884b()) {
            w0Var.m4002e((c1) entry.getKey(), entry.getValue());
        }
        return w0Var;
    }

    /* renamed from: c */
    public final Iterator m4000c() {
        g2 g2Var = this.f6691a;
        return g2Var.isEmpty() ? Collections.emptyIterator() : ((androidx.datastore.preferences.protobuf.f1) g2Var.entrySet()).iterator();
    }

    /* renamed from: d */
    public final void m4001d() {
        if (this.f6692b) {
            return;
        }
        g2 g2Var = this.f6691a;
        int i10 = g2Var.f6538b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = g2Var.m3886f(i11).f6552b;
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                e1Var.getClass();
                y1.f6701c.m4007a(e1Var.getClass()).mo3844c(e1Var);
                e1Var.m3838g();
            }
        }
        if (!g2Var.f6540d) {
            for (int i12 = 0; i12 < g2Var.f6538b; i12++) {
                ((c1) g2Var.m3886f(i12).f6551a).getClass();
            }
            Iterator it = g2Var.m3884b().iterator();
            while (it.hasNext()) {
                ((c1) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!g2Var.f6540d) {
            g2Var.f6539c = g2Var.f6539c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(g2Var.f6539c);
            g2Var.f6542f = g2Var.f6542f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(g2Var.f6542f);
            g2Var.f6540d = true;
        }
        this.f6692b = true;
    }

    /* renamed from: e */
    public final void m4002e(c1 c1Var, Object obj) {
        c1Var.getClass();
        Charset charset = l1.f6594a;
        obj.getClass();
        q2 q2Var = q2.zza;
        r2 r2Var = r2.INT;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return this.f6691a.equals(((w0) obj).f6691a);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4003f() {
        g2 g2Var = this.f6691a;
        int i10 = g2Var.f6538b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                Iterator it = g2Var.m3884b().iterator();
                while (it.hasNext()) {
                    if (!m3997h((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!m3997h(g2Var.m3886f(i11))) {
                break;
            }
            i11++;
        }
        return false;
    }

    /* renamed from: g */
    public final void m4004g(Map.Entry entry) {
        c1 c1Var = (c1) entry.getKey();
        entry.getValue();
        c1Var.getClass();
        throw null;
    }

    public final int hashCode() {
        return this.f6691a.hashCode();
    }

    public w0(int i10) {
        m4001d();
        m4001d();
    }
}
