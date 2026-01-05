package p001o;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C1970k;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class wcj {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f51797a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final ap3 m54227a(AndroidComposeView androidComposeView, bp3 bp3Var, nl7 nl7Var) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (m54229c(androidComposeView)) {
            androidComposeView.setTag(s8e.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            m54228b();
        }
        ap3 ap3VarM29261a = gp3.m29261a(new w1i(androidComposeView.getRoot()), bp3Var);
        Object tag = androidComposeView.getView().getTag(s8e.wrapped_composition_tag);
        C1970k c1970k = tag instanceof C1970k ? (C1970k) tag : null;
        if (c1970k == null) {
            c1970k = new C1970k(androidComposeView, ap3VarM29261a);
            androidComposeView.getView().setTag(s8e.wrapped_composition_tag, c1970k);
        }
        c1970k.mo5275l(nl7Var);
        return c1970k;
    }

    /* renamed from: b */
    public static final void m54228b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (uj8.m51650a()) {
            return;
        }
        try {
            Field declaredField = uj8.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static final boolean m54229c(AndroidComposeView androidComposeView) {
        return Build.VERSION.SDK_INT >= 29 && (vcj.f50140a.m52577a(androidComposeView).isEmpty() ^ true);
    }

    /* renamed from: d */
    public static final ap3 m54230d(AbstractComposeView abstractComposeView, bp3 bp3Var, nl7 nl7Var) {
        sq8.m48649h(abstractComposeView, "<this>");
        sq8.m48649h(bp3Var, "parent");
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        st7.f45909a.m48908a();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = abstractComposeView.getContext();
            sq8.m48648g(context, "context");
            androidComposeView = new AndroidComposeView(context, bp3Var.mo19507f());
            abstractComposeView.addView(androidComposeView.getView(), f51797a);
        }
        return m54227a(androidComposeView, bp3Var, nl7Var);
    }
}
