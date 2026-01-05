package p001o;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class tvi {
    /* renamed from: a */
    public static void m50715a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: b */
    public static void m50716b(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }
}
