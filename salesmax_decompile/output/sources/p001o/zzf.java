package p001o;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import p001o.djh;

/* loaded from: classes2.dex */
public abstract class zzf {
    /* renamed from: a */
    public static final void m60158a(Spannable spannable, long j, int i, int i2) {
        sq8.m48649h(spannable, "$this$setBackground");
        if (j != lh3.f33793b.m37212d()) {
            m60162e(spannable, new BackgroundColorSpan(rh3.m46769d(j)), i, i2);
        }
    }

    /* renamed from: b */
    public static final void m60159b(Spannable spannable, long j, int i, int i2) {
        sq8.m48649h(spannable, "$this$setColor");
        if (j != lh3.f33793b.m37212d()) {
            m60162e(spannable, new ForegroundColorSpan(rh3.m46769d(j)), i, i2);
        }
    }

    /* renamed from: c */
    public static final void m60160c(Spannable spannable, long j, zl5 zl5Var, int i, int i2) {
        sq8.m48649h(spannable, "$this$setFontSize");
        sq8.m48649h(zl5Var, "density");
        long jM19256g = bjh.m19256g(j);
        djh.C12976a c12976a = djh.f20128b;
        if (djh.m23334g(jM19256g, c12976a.m23339b())) {
            m60162e(spannable, new AbsoluteSizeSpan(lza.m38121d(zl5Var.mo19176o(j)), false), i, i2);
        } else if (djh.m23334g(jM19256g, c12976a.m23338a())) {
            m60162e(spannable, new RelativeSizeSpan(bjh.m19257h(j)), i, i2);
        }
    }

    /* renamed from: d */
    public static final void m60161d(Spannable spannable, oha ohaVar, int i, int i2) {
        sq8.m48649h(spannable, "<this>");
        if (ohaVar != null) {
            m60162e(spannable, qha.f42009a.m45494a(ohaVar), i, i2);
        }
    }

    /* renamed from: e */
    public static final void m60162e(Spannable spannable, Object obj, int i, int i2) {
        sq8.m48649h(spannable, "<this>");
        sq8.m48649h(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }
}
