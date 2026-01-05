package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import p001o.fb;
import p001o.id5;
import p001o.sq8;

/* renamed from: androidx.compose.ui.platform.e */
/* loaded from: classes2.dex */
public final class C1964e extends fb {

    /* renamed from: d */
    public static final a f6401d = new a(null);

    /* renamed from: e */
    public static final int f6402e = 8;

    /* renamed from: f */
    public static C1964e f6403f;

    /* renamed from: c */
    public BreakIterator f6404c;

    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C1964e m5147a(Locale locale) {
            sq8.m48649h(locale, "locale");
            if (C1964e.f6403f == null) {
                C1964e.f6403f = new C1964e(locale, null);
            }
            C1964e c1964e = C1964e.f6403f;
            sq8.m48647f(c1964e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c1964e;
        }
    }

    public /* synthetic */ C1964e(Locale locale, id5 id5Var) {
        this(locale);
    }

    @Override // p001o.gb
    /* renamed from: a */
    public int[] mo5123a(int i) {
        if (m26352d().length() <= 0 || i >= m26352d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!m5144j(i) && !m5145k(i)) {
            BreakIterator breakIterator = this.f6404c;
            if (breakIterator == null) {
                sq8.m48667z("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f6404c;
        if (breakIterator2 == null) {
            sq8.m48667z("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i);
        if (iFollowing == -1 || !m5143i(iFollowing)) {
            return null;
        }
        return m26351c(i, iFollowing);
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
        while (i > 0 && !m5144j(i - 1) && !m5143i(i)) {
            BreakIterator breakIterator = this.f6404c;
            if (breakIterator == null) {
                sq8.m48667z("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f6404c;
        if (breakIterator2 == null) {
            sq8.m48667z("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i);
        if (iPreceding == -1 || !m5145k(iPreceding)) {
            return null;
        }
        return m26351c(iPreceding, i);
    }

    @Override // p001o.fb
    /* renamed from: e */
    public void mo5125e(String str) {
        sq8.m48649h(str, "text");
        super.mo5125e(str);
        BreakIterator breakIterator = this.f6404c;
        if (breakIterator == null) {
            sq8.m48667z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    /* renamed from: i */
    public final boolean m5143i(int i) {
        return i > 0 && m5144j(i + (-1)) && (i == m26352d().length() || !m5144j(i));
    }

    /* renamed from: j */
    public final boolean m5144j(int i) {
        if (i < 0 || i >= m26352d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m26352d().codePointAt(i));
    }

    /* renamed from: k */
    public final boolean m5145k(int i) {
        return m5144j(i) && (i == 0 || !m5144j(i - 1));
    }

    /* renamed from: l */
    public final void m5146l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        sq8.m48648g(wordInstance, "getWordInstance(locale)");
        this.f6404c = wordInstance;
    }

    public C1964e(Locale locale) {
        m5146l(locale);
    }
}
