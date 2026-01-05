package p001o;

import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class qs1 {

    /* renamed from: a */
    public final LinearLayout f42352a;

    public qs1(LinearLayout linearLayout) {
        this.f42352a = linearLayout;
    }

    /* renamed from: a */
    public static qs1 m45822a(View view) {
        if (view != null) {
            return new qs1((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: b */
    public LinearLayout m45823b() {
        return this.f42352a;
    }
}
