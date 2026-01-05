package c6;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import b7.C0604a;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends h1 {

    /* renamed from: d */
    public static final PathInterpolator f5436d = new PathInterpolator(DefinitionKt.NO_Float_VALUE, 1.1f, DefinitionKt.NO_Float_VALUE, 1.0f);

    /* renamed from: e */
    public static final C0604a f5437e = new C0604a();

    /* renamed from: f */
    public static final DecelerateInterpolator f5438f = new DecelerateInterpolator(1.5f);

    /* renamed from: g */
    public static final AccelerateInterpolator f5439g = new AccelerateInterpolator(1.5f);

    /* renamed from: d */
    public static void m2348d(View view, i1 i1Var) {
        AbstractC0315j abstractC0315jM2353i = m2353i(view);
        if (abstractC0315jM2353i != null) {
            abstractC0315jM2353i.mo925d(i1Var);
            if (abstractC0315jM2353i.f2354a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m2348d(viewGroup.getChildAt(i10), i1Var);
            }
        }
    }

    /* renamed from: e */
    public static void m2349e(View view, i1 i1Var, y1 y1Var, boolean z6) {
        AbstractC0315j abstractC0315jM2353i = m2353i(view);
        if (abstractC0315jM2353i != null) {
            abstractC0315jM2353i.f2355b = y1Var;
            if (!z6) {
                abstractC0315jM2353i.mo926f();
                z6 = abstractC0315jM2353i.f2354a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m2349e(viewGroup.getChildAt(i10), i1Var, y1Var, z6);
            }
        }
    }

    /* renamed from: f */
    public static void m2350f(View view, y1 y1Var, List list) {
        AbstractC0315j abstractC0315jM2353i = m2353i(view);
        if (abstractC0315jM2353i != null) {
            y1Var = abstractC0315jM2353i.mo927g(y1Var);
            if (abstractC0315jM2353i.f2354a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m2350f(viewGroup.getChildAt(i10), y1Var, list);
            }
        }
    }

    /* renamed from: g */
    public static void m2351g(View view, i1 i1Var, C0917l c0917l) {
        AbstractC0315j abstractC0315jM2353i = m2353i(view);
        if (abstractC0315jM2353i != null) {
            abstractC0315jM2353i.mo928h(c0917l);
            if (abstractC0315jM2353i.f2354a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m2351g(viewGroup.getChildAt(i10), i1Var, c0917l);
            }
        }
    }

    /* renamed from: h */
    public static WindowInsets m2352h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: i */
    public static AbstractC0315j m2353i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof c1) {
            return ((c1) tag).f5433a;
        }
        return null;
    }
}
