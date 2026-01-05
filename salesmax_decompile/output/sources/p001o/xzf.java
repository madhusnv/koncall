package p001o;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: classes2.dex */
public abstract class xzf {
    /* renamed from: a */
    public static void m57045a(Spannable spannable, float f, int i, int i2, int i3) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i2, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f *= relativeSizeSpan.getSizeChange();
            }
            m57047c(spannable, relativeSizeSpan, i, i2, i3);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, i3);
    }

    /* renamed from: b */
    public static void m57046b(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            m57047c(spannable, obj2, i, i2, i3);
        }
        spannable.setSpan(obj, i, i2, i3);
    }

    /* renamed from: c */
    public static void m57047c(Spannable spannable, Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == i3) {
            spannable.removeSpan(obj);
        }
    }
}
