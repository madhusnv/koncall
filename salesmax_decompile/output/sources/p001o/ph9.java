package p001o;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class ph9 {

    /* renamed from: a */
    public final ConstraintLayout f40097a;

    /* renamed from: b */
    public final View f40098b;

    /* renamed from: c */
    public final View f40099c;

    /* renamed from: d */
    public final ConstraintLayout f40100d;

    /* renamed from: e */
    public final TextView f40101e;

    public ph9(ConstraintLayout constraintLayout, View view, View view2, ConstraintLayout constraintLayout2, TextView textView) {
        this.f40097a = constraintLayout;
        this.f40098b = view;
        this.f40099c = view2;
        this.f40100d = constraintLayout2;
        this.f40101e = textView;
    }

    /* renamed from: a */
    public static ph9 m43679a(View view) {
        View viewM52060a;
        int i = z8e.exFiveDayFlightBottom;
        View viewM52060a2 = uvi.m52060a(view, i);
        if (viewM52060a2 != null && (viewM52060a = uvi.m52060a(view, (i = z8e.exFiveDayFlightTop))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = z8e.exFiveDayText;
            TextView textView = (TextView) uvi.m52060a(view, i);
            if (textView != null) {
                return new ph9(constraintLayout, viewM52060a2, viewM52060a, constraintLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout m43680b() {
        return this.f40097a;
    }
}
