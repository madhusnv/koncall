package p001o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import p001o.r9j;

/* loaded from: classes2.dex */
public abstract class rd9 {
    /* renamed from: a */
    public static final void m46557a(Activity activity) {
        sq8.m48649h(activity, "<this>");
        new oaj(activity.getWindow(), activity.getWindow().getDecorView()).m41886a(r9j.C16576m.m46446b());
    }

    /* renamed from: b */
    public static final void m46558b(Context context) {
        sq8.m48649h(context, "<this>");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            m46557a(activity);
        }
    }

    /* renamed from: c */
    public static final void m46559c(View view) {
        sq8.m48649h(view, "<this>");
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            m46557a(activity);
        }
    }

    /* renamed from: d */
    public static final void m46560d(Fragment fragment) {
        sq8.m48649h(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            m46557a(activity);
        }
    }

    /* renamed from: e */
    public static final y3i m46561e(View view) {
        sq8.m48649h(view, "<this>");
        oaj oajVarM55098K = wvi.m55098K(view);
        if (oajVarM55098K == null) {
            return null;
        }
        oajVarM55098K.m41886a(r9j.C16576m.m46446b());
        return y3i.f54824a;
    }
}
