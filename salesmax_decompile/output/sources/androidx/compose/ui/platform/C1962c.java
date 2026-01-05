package androidx.compose.ui.platform;

import android.graphics.Rect;
import p001o.bce;
import p001o.eih;
import p001o.fb;
import p001o.id5;
import p001o.lza;
import p001o.pcf;
import p001o.sq8;
import p001o.wne;

/* renamed from: androidx.compose.ui.platform.c */
/* loaded from: classes2.dex */
public final class C1962c extends fb {

    /* renamed from: g */
    public static C1962c f6394g;

    /* renamed from: c */
    public pcf f6397c;

    /* renamed from: d */
    public Rect f6398d;

    /* renamed from: e */
    public static final a f6392e = new a(null);

    /* renamed from: f */
    public static final int f6393f = 8;

    /* renamed from: h */
    public static final wne f6395h = wne.Rtl;

    /* renamed from: i */
    public static final wne f6396i = wne.Ltr;

    /* renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C1962c m5135a() {
            if (C1962c.f6394g == null) {
                C1962c.f6394g = new C1962c(null);
            }
            C1962c c1962c = C1962c.f6394g;
            sq8.m48647f(c1962c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c1962c;
        }
    }

    public /* synthetic */ C1962c(id5 id5Var) {
        this();
    }

    @Override // p001o.gb
    /* renamed from: a */
    public int[] mo5123a(int i) {
        if (m26352d().length() <= 0 || i >= m26352d().length()) {
            return null;
        }
        try {
            pcf pcfVar = this.f6397c;
            if (pcfVar == null) {
                sq8.m48667z("node");
                pcfVar = null;
            }
            lza.m38121d(pcfVar.m43356h().m38944e());
            bce.m18601d(0, i);
            sq8.m48667z("layoutResult");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p001o.gb
    /* renamed from: b */
    public int[] mo5124b(int i) {
        if (m26352d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            pcf pcfVar = this.f6397c;
            if (pcfVar == null) {
                sq8.m48667z("node");
                pcfVar = null;
            }
            lza.m38121d(pcfVar.m43356h().m38944e());
            bce.m18604g(m26352d().length(), i);
            sq8.m48667z("layoutResult");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final void m5134i(String str, eih eihVar, pcf pcfVar) {
        sq8.m48649h(str, "text");
        sq8.m48649h(eihVar, "layoutResult");
        sq8.m48649h(pcfVar, "node");
        m26353f(str);
        this.f6397c = pcfVar;
    }

    public C1962c() {
        this.f6398d = new Rect();
    }
}
