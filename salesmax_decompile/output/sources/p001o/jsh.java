package p001o;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class jsh {

    /* renamed from: o.jsh$a */
    public static class C14650a {
        /* renamed from: a */
        public static void m34484a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m34483a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C14650a.m34484a(view, charSequence);
        } else {
            msh.m39620h(view, charSequence);
        }
    }
}
