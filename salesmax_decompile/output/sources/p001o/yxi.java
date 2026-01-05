package p001o;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes2.dex */
public final class yxi implements ViewPager2.InterfaceC2556k {
    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC2556k
    /* renamed from: a */
    public void mo10062a(View view, float f) {
        sq8.m48649h(view, "view");
        int width = view.getWidth();
        if (f < -1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f <= 0.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationZ(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (f > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        float f2 = 1;
        view.setAlpha(f2 - f);
        view.setTranslationX(width * (-f));
        view.setTranslationZ(-1.0f);
        float fAbs = ((f2 - Math.abs(f)) * 0.25f) + 0.75f;
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
    }
}
