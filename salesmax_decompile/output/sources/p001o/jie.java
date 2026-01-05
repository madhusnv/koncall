package p001o;

import android.os.Bundle;
import java.util.List;
import org.json.JSONArray;
import p001o.kie;

/* loaded from: classes5.dex */
public final class jie {

    /* renamed from: a */
    public static final jie f30493a = new jie();

    /* renamed from: b */
    public static final String f30494b = kie.class.getSimpleName();

    /* renamed from: a */
    public static final Bundle m33867a(kie.EnumC14841a enumC14841a, String str, List list) {
        if (a94.m16694d(jie.class)) {
            return null;
        }
        try {
            sq8.m48649h(enumC14841a, "eventType");
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", enumC14841a.toString());
            bundle.putString("app_id", str);
            if (kie.EnumC14841a.CUSTOM_APP_EVENTS == enumC14841a) {
                JSONArray jSONArrayM33868b = f30493a.m33868b(list, str);
                if (jSONArrayM33868b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", jSONArrayM33868b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            a94.m16692b(th, jie.class);
            return null;
        }
    }

    /* renamed from: b */
    public final JSONArray m33868b(List list, String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<tk0> listT0 = kh3.T0(list);
            zj6.m59510d(listT0);
            boolean zM33869c = m33869c(str);
            for (tk0 tk0Var : listT0) {
                if ((!tk0Var.m50097h()) || (tk0Var.m50097h() && zM33869c)) {
                    jSONArray.put(tk0Var.m50094e());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final boolean m33869c(String str) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(str, false);
            if (tt6VarM56803u != null) {
                return tt6VarM56803u.m50559z();
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
