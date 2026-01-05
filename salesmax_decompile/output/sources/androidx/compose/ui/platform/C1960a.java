package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import p001o.fb;
import p001o.id5;
import p001o.sq8;

/* renamed from: androidx.compose.ui.platform.a */
/* loaded from: classes2.dex */
public class C1960a extends fb {

    /* renamed from: d */
    public static final a f6383d = new a(null);

    /* renamed from: e */
    public static final int f6384e = 8;

    /* renamed from: f */
    public static C1960a f6385f;

    /* renamed from: c */
    public BreakIterator f6386c;

    /* renamed from: androidx.compose.ui.platform.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C1960a m5127a(Locale locale) {
            sq8.m48649h(locale, "locale");
            if (C1960a.f6385f == null) {
                C1960a.f6385f = new C1960a(locale, null);
            }
            C1960a c1960a = C1960a.f6385f;
            sq8.m48647f(c1960a, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c1960a;
        }
    }

    public /* synthetic */ C1960a(Locale locale, id5 id5Var) {
        this(locale);
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
        do {
            BreakIterator breakIterator = this.f6386c;
            if (breakIterator == null) {
                sq8.m48667z("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f6386c;
                if (breakIterator2 == null) {
                    sq8.m48667z("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return m26351c(i, iFollowing);
            }
            BreakIterator breakIterator3 = this.f6386c;
            if (breakIterator3 == null) {
                sq8.m48667z("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f6386c;
            if (breakIterator == null) {
                sq8.m48667z("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f6386c;
                if (breakIterator2 == null) {
                    sq8.m48667z("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return m26351c(iPreceding, i);
            }
            BreakIterator breakIterator3 = this.f6386c;
            if (breakIterator3 == null) {
                sq8.m48667z("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
    }

    @Override // p001o.fb
    /* renamed from: e */
    public void mo5125e(String str) {
        sq8.m48649h(str, "text");
        super.mo5125e(str);
        BreakIterator breakIterator = this.f6386c;
        if (breakIterator == null) {
            sq8.m48667z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    /* renamed from: i */
    public final void m5126i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        sq8.m48648g(characterInstance, "getCharacterInstance(locale)");
        this.f6386c = characterInstance;
    }

    public C1960a(Locale locale) {
        m5126i(locale);
    }
}
