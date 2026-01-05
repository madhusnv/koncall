package androidx.compose.ui.platform;

import p001o.fb;
import p001o.id5;
import p001o.sq8;

/* renamed from: androidx.compose.ui.platform.d */
/* loaded from: classes2.dex */
public final class C1963d extends fb {

    /* renamed from: c */
    public static final a f6399c = new a(null);

    /* renamed from: d */
    public static C1963d f6400d;

    /* renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C1963d m5140a() {
            if (C1963d.f6400d == null) {
                C1963d.f6400d = new C1963d(null);
            }
            C1963d c1963d = C1963d.f6400d;
            sq8.m48647f(c1963d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c1963d;
        }
    }

    public /* synthetic */ C1963d(id5 id5Var) {
        this();
    }

    @Override // p001o.gb
    /* renamed from: a */
    public int[] mo5123a(int i) {
        int length = m26352d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m26352d().charAt(i) == '\n' && !m5139j(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m5138i(i2)) {
            i2++;
        }
        return m26351c(i, i2);
    }

    @Override // p001o.gb
    /* renamed from: b */
    public int[] mo5124b(int i) {
        int length = m26352d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m26352d().charAt(i - 1) == '\n' && !m5138i(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !m5139j(i2)) {
            i2--;
        }
        return m26351c(i2, i);
    }

    /* renamed from: i */
    public final boolean m5138i(int i) {
        return i > 0 && m26352d().charAt(i + (-1)) != '\n' && (i == m26352d().length() || m26352d().charAt(i) == '\n');
    }

    /* renamed from: j */
    public final boolean m5139j(int i) {
        return m26352d().charAt(i) != '\n' && (i == 0 || m26352d().charAt(i - 1) == '\n');
    }

    public C1963d() {
    }
}
