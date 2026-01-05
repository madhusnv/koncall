package p001o;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class q49 implements p49 {

    /* renamed from: a */
    public static final p49 f41288a = new q49();

    /* renamed from: e */
    public static float m44799e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float fM55134u = wvi.m55134u(childAt);
                if (fM55134u > f) {
                    f = fM55134u;
                }
            }
        }
        return f;
    }

    @Override // p001o.p49
    /* renamed from: a */
    public void mo42963a(View view) {
        Object tag = view.getTag(e8e.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            wvi.s0(view, ((Float) tag).floatValue());
        }
        view.setTag(e8e.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // p001o.p49
    /* renamed from: b */
    public void mo42964b(View view) {
    }

    @Override // p001o.p49
    /* renamed from: c */
    public void mo42965c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(e8e.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(wvi.m55134u(view));
            wvi.s0(view, m44799e(recyclerView, view) + 1.0f);
            view.setTag(e8e.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // p001o.p49
    /* renamed from: d */
    public void mo42966d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
