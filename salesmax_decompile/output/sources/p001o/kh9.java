package p001o;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class kh9 {

    /* renamed from: a */
    public final FrameLayout f32251a;

    /* renamed from: b */
    public final qs1 f32252b;

    public kh9(FrameLayout frameLayout, qs1 qs1Var) {
        this.f32251a = frameLayout;
        this.f32252b = qs1Var;
    }

    /* renamed from: a */
    public static kh9 m35717a(View view) {
        int i = z8e.legendLayout;
        View viewM52060a = uvi.m52060a(view, i);
        if (viewM52060a == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new kh9((FrameLayout) view, qs1.m45822a(viewM52060a));
    }
}
