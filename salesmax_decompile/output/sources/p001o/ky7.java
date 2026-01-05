package p001o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class ky7 extends my7 {
    @Override // p001o.my7
    /* renamed from: a */
    public int mo32909a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // p001o.my7
    /* renamed from: b */
    public int mo32910b() {
        return 0;
    }

    @Override // p001o.my7
    /* renamed from: c */
    public int mo32911c() {
        return 0;
    }

    @Override // p001o.my7
    /* renamed from: d */
    public ViewPropertyAnimator mo32912d(View view, int i) {
        return view.animate().translationX(i);
    }

    @Override // p001o.my7
    /* renamed from: e */
    public void mo32913e(View view, int i) {
        view.setTranslationX(i);
    }
}
