package p001o;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class ded {

    /* renamed from: a */
    public static final int f19671a = v8e.pooling_container_listener_holder_tag;

    /* renamed from: b */
    public static final int f19672b = v8e.is_pooling_container_tag;

    /* renamed from: a */
    public static final void m22905a(View view, eed eedVar) {
        sq8.m48649h(view, "<this>");
        sq8.m48649h(eedVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        m22908d(view).m26517a(eedVar);
    }

    /* renamed from: b */
    public static final void m22906b(View view) {
        sq8.m48649h(view, "<this>");
        Iterator it = vwi.m53511c(view).iterator();
        while (it.hasNext()) {
            m22908d((View) it.next()).m26518b();
        }
    }

    /* renamed from: c */
    public static final void m22907c(ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "<this>");
        Iterator it = lwi.m38080a(viewGroup).iterator();
        while (it.hasNext()) {
            m22908d((View) it.next()).m26518b();
        }
    }

    /* renamed from: d */
    public static final fed m22908d(View view) {
        int i = f19671a;
        fed fedVar = (fed) view.getTag(i);
        if (fedVar != null) {
            return fedVar;
        }
        fed fedVar2 = new fed();
        view.setTag(i, fedVar2);
        return fedVar2;
    }

    /* renamed from: e */
    public static final boolean m22909e(View view) {
        sq8.m48649h(view, "<this>");
        Object tag = view.getTag(f19672b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m22910f(View view) {
        sq8.m48649h(view, "<this>");
        for (Object obj : vwi.m53512d(view)) {
            if ((obj instanceof View) && m22909e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final void m22911g(View view, eed eedVar) {
        sq8.m48649h(view, "<this>");
        sq8.m48649h(eedVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        m22908d(view).m26519c(eedVar);
    }

    /* renamed from: h */
    public static final void m22912h(View view, boolean z) {
        sq8.m48649h(view, "<this>");
        view.setTag(f19672b, Boolean.valueOf(z));
    }
}
