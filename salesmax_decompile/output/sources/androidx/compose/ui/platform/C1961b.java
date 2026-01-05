package androidx.compose.ui.platform;

import p001o.eih;
import p001o.fb;
import p001o.id5;
import p001o.sq8;
import p001o.wne;

/* renamed from: androidx.compose.ui.platform.b */
/* loaded from: classes2.dex */
public final class C1961b extends fb {

    /* renamed from: e */
    public static C1961b f6389e;

    /* renamed from: c */
    public static final a f6387c = new a(null);

    /* renamed from: d */
    public static final int f6388d = 8;

    /* renamed from: f */
    public static final wne f6390f = wne.Rtl;

    /* renamed from: g */
    public static final wne f6391g = wne.Ltr;

    /* renamed from: androidx.compose.ui.platform.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C1961b m5131a() {
            if (C1961b.f6389e == null) {
                C1961b.f6389e = new C1961b(null);
            }
            C1961b c1961b = C1961b.f6389e;
            sq8.m48647f(c1961b, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c1961b;
        }
    }

    public /* synthetic */ C1961b(id5 id5Var) {
        this();
    }

    @Override // p001o.gb
    /* renamed from: a */
    public int[] mo5123a(int i) {
        if (m26352d().length() <= 0 || i >= m26352d().length()) {
            return null;
        }
        if (i < 0) {
            sq8.m48667z("layoutResult");
            throw null;
        }
        sq8.m48667z("layoutResult");
        throw null;
    }

    @Override // p001o.gb
    /* renamed from: b */
    public int[] mo5124b(int i) {
        if (m26352d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i <= m26352d().length()) {
            sq8.m48667z("layoutResult");
            throw null;
        }
        sq8.m48667z("layoutResult");
        m26352d().length();
        throw null;
    }

    /* renamed from: i */
    public final void m5130i(String str, eih eihVar) {
        sq8.m48649h(str, "text");
        sq8.m48649h(eihVar, "layoutResult");
        m26353f(str);
    }

    public C1961b() {
    }
}
