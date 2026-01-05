package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class fj7 {

    /* renamed from: a */
    public final FrameLayout f23515a;

    public fj7(FrameLayout frameLayout) {
        this.f23515a = frameLayout;
    }

    /* renamed from: a */
    public static fj7 m26903a(View view) {
        if (view != null) {
            return new fj7((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static fj7 m26904c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(p9e.fragment_user_last_location, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return m26903a(viewInflate);
    }

    /* renamed from: b */
    public FrameLayout m26905b() {
        return this.f23515a;
    }
}
