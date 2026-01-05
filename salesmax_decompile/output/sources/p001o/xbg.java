package p001o;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p001o.cd4;

/* loaded from: classes2.dex */
public abstract class xbg {
    /* renamed from: c */
    public static /* synthetic */ boolean m55956c(Object obj) {
        return !(obj instanceof ug9);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m55957d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* renamed from: e */
    public static void m55958e(cd4.C12641b c12641b) {
        c12641b.m20920b();
        if (c12641b.m20923e() instanceof Spanned) {
            if (!(c12641b.m20923e() instanceof Spannable)) {
                c12641b.m20933o(SpannableString.valueOf(c12641b.m20923e()));
            }
            m55960g((Spannable) op0.m42515e(c12641b.m20923e()), new hgd() { // from class: o.vbg
                @Override // p001o.hgd
                public final boolean apply(Object obj) {
                    return xbg.m55956c(obj);
                }
            });
        }
        m55959f(c12641b);
    }

    /* renamed from: f */
    public static void m55959f(cd4.C12641b c12641b) {
        c12641b.m20935q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c12641b.m20923e() instanceof Spanned) {
            if (!(c12641b.m20923e() instanceof Spannable)) {
                c12641b.m20933o(SpannableString.valueOf(c12641b.m20923e()));
            }
            m55960g((Spannable) op0.m42515e(c12641b.m20923e()), new hgd() { // from class: o.wbg
                @Override // p001o.hgd
                public final boolean apply(Object obj) {
                    return xbg.m55957d(obj);
                }
            });
        }
    }

    /* renamed from: g */
    public static void m55960g(Spannable spannable, hgd hgdVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (hgdVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* renamed from: h */
    public static float m55961h(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
