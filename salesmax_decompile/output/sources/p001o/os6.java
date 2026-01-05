package p001o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C11143a;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public class os6 extends C11143a {
    @Override // com.google.android.material.tabs.C11143a
    /* renamed from: d */
    public void mo15310d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFM15307a = C11143a.m15307a(tabLayout, view);
        float fM28648b = f < 0.5f ? gh0.m28648b(1.0f, 0.0f, 0.0f, 0.5f, f) : gh0.m28648b(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFM15307a.left, drawable.getBounds().top, (int) rectFM15307a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fM28648b * 255.0f));
    }
}
