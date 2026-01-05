package p001o;

import ai.salesmax.model.RecentAction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gee {
    /* renamed from: a */
    public static final void m28527a(LinearLayout linearLayout, List list) {
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        Context context = linearLayout.getContext();
        if (list == null) {
            list = ch3.m21246k();
        }
        if (list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            View viewInflate = LayoutInflater.from(context).inflate(p9e.item_recent_action, (ViewGroup) linearLayout, false);
            h29 h29Var = (h29) zt4.m59867a(viewInflate);
            if (h29Var != null) {
                sq8.m48647f(obj, "null cannot be cast to non-null type ai.salesmax.model.RecentAction");
                h29Var.j0((RecentAction) obj);
                h29Var.k0(Integer.valueOf(i));
                h29Var.i0(h29Var.h0());
                h29Var.m25695s();
            }
            linearLayout.addView(viewInflate);
            i = i2;
        }
    }
}
