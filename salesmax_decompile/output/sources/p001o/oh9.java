package p001o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class oh9 {

    /* renamed from: a */
    public final FrameLayout f38357a;

    /* renamed from: b */
    public final TextView f38358b;

    /* renamed from: c */
    public final TextView f38359c;

    /* renamed from: d */
    public final View f38360d;

    public oh9(FrameLayout frameLayout, TextView textView, TextView textView2, View view) {
        this.f38357a = frameLayout;
        this.f38358b = textView;
        this.f38359c = textView2;
        this.f38360d = view;
    }

    /* renamed from: a */
    public static oh9 m42241a(View view) {
        View viewM52060a;
        int i = z8e.exSevenDateText;
        TextView textView = (TextView) uvi.m52060a(view, i);
        if (textView != null) {
            i = z8e.exSevenDayText;
            TextView textView2 = (TextView) uvi.m52060a(view, i);
            if (textView2 != null && (viewM52060a = uvi.m52060a(view, (i = z8e.exSevenSelectedView))) != null) {
                return new oh9((FrameLayout) view, textView, textView2, viewM52060a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
