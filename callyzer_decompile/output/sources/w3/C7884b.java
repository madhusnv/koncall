package w3;

import java.text.BreakIterator;
import kotlin.jvm.internal.AbstractC4154l;
import p021w.AbstractC7848n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.b */
/* loaded from: classes.dex */
public final class C7884b extends AbstractC7848n {

    /* renamed from: e */
    public static C7884b f37691e;

    /* renamed from: f */
    public static C7884b f37692f;

    /* renamed from: c */
    public final /* synthetic */ int f37693c;

    /* renamed from: d */
    public BreakIterator f37694d;

    @Override // p021w.AbstractC7848n
    /* renamed from: a */
    public final int[] mo14830a(int i10) {
        switch (this.f37693c) {
            case 0:
                int length = m14832c().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f37694d;
                    if (breakIterator == null) {
                        AbstractC4154l.m8928k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f37694d;
                        if (breakIterator2 == null) {
                            AbstractC4154l.m8928k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m14831b(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f37694d;
                    if (breakIterator3 == null) {
                        AbstractC4154l.m8928k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            default:
                if (m14832c().length() <= 0 || i10 >= m14832c().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!m14861g(i10) && (!m14861g(i10) || (i10 != 0 && m14861g(i10 - 1)))) {
                    BreakIterator breakIterator4 = this.f37694d;
                    if (breakIterator4 == null) {
                        AbstractC4154l.m8928k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f37694d;
                if (breakIterator5 == null) {
                    AbstractC4154l.m8928k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !m14860f(iFollowing2)) {
                    return null;
                }
                return m14831b(i10, iFollowing2);
        }
    }

    @Override // p021w.AbstractC7848n
    /* renamed from: d */
    public final int[] mo14833d(int i10) {
        switch (this.f37693c) {
            case 0:
                int length = m14832c().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = this.f37694d;
                    if (breakIterator == null) {
                        AbstractC4154l.m8928k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f37694d;
                        if (breakIterator2 == null) {
                            AbstractC4154l.m8928k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m14831b(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = this.f37694d;
                    if (breakIterator3 == null) {
                        AbstractC4154l.m8928k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            default:
                int length2 = m14832c().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !m14861g(i10 - 1) && !m14860f(i10)) {
                    BreakIterator breakIterator4 = this.f37694d;
                    if (breakIterator4 == null) {
                        AbstractC4154l.m8928k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f37694d;
                if (breakIterator5 == null) {
                    AbstractC4154l.m8928k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !m14861g(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m14861g(iPreceding2 - 1)) {
                    return m14831b(iPreceding2, i10);
                }
                return null;
        }
    }

    /* renamed from: e */
    public final void m14859e(String str) {
        switch (this.f37693c) {
            case 0:
                this.f37615a = str;
                BreakIterator breakIterator = this.f37694d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC4154l.m8928k("impl");
                    throw null;
                }
            default:
                this.f37615a = str;
                BreakIterator breakIterator2 = this.f37694d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC4154l.m8928k("impl");
                    throw null;
                }
        }
    }

    /* renamed from: f */
    public boolean m14860f(int i10) {
        if (i10 <= 0 || !m14861g(i10 - 1)) {
            return false;
        }
        return i10 == m14832c().length() || !m14861g(i10);
    }

    /* renamed from: g */
    public boolean m14861g(int i10) {
        if (i10 < 0 || i10 >= m14832c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m14832c().codePointAt(i10));
    }
}
