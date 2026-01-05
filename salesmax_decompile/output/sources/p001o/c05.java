package p001o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import j$.time.LocalDate;

/* loaded from: classes6.dex */
public abstract class c05 {
    /* renamed from: a */
    public static final LinearLayout.LayoutParams m19996a(ViewGroup.LayoutParams layoutParams) {
        sq8.m48649h(layoutParams, "layoutParams");
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    /* renamed from: c */
    public static final LocalDate m19998c(Object obj) {
        if (obj instanceof ps1) {
            return ((ps1) obj).m44102a();
        }
        if (obj instanceof a7j) {
            return ((a7j) obj).m16579a();
        }
        throw new IllegalArgumentException("Invalid day type: " + obj);
    }
}
