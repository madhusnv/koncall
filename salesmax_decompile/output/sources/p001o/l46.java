package p001o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C11143a;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public class l46 extends C11143a {
    /* renamed from: e */
    public static float m36553e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m36554f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C11143a
    /* renamed from: d */
    public void mo15310d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fM36554f;
        float fM36553e;
        RectF rectFM15307a = C11143a.m15307a(tabLayout, view);
        RectF rectFM15307a2 = C11143a.m15307a(tabLayout, view2);
        if (rectFM15307a.left < rectFM15307a2.left) {
            fM36554f = m36553e(f);
            fM36553e = m36554f(f);
        } else {
            fM36554f = m36554f(f);
            fM36553e = m36553e(f);
        }
        drawable.setBounds(gh0.m28649c((int) rectFM15307a.left, (int) rectFM15307a2.left, fM36554f), drawable.getBounds().top, gh0.m28649c((int) rectFM15307a.right, (int) rectFM15307a2.right, fM36553e), drawable.getBounds().bottom);
    }
}
