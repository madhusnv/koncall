package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.C10773c;
import java.util.Set;

/* loaded from: classes5.dex */
public final class obc {

    /* renamed from: a */
    public static final obc f38052a = new obc();

    /* renamed from: b */
    public static final Set f38053b = nif.m40668i("fb_mobile_purchase", "StartTrial", "Subscribe");

    /* renamed from: d */
    public static final boolean m41917d() {
        if (a94.m16694d(obc.class)) {
            return false;
        }
        try {
            if ((C10773c.m12987A(C10773c.m13019l()) || cri.a0()) ? false : true) {
                return kie.m35747b();
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, obc.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final void m41918e(final String str, final tk0 tk0Var) {
        if (a94.m16694d(obc.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(tk0Var, "event");
            if (f38052a.m41922c(tk0Var)) {
                C10773c.m13028u().execute(new Runnable() { // from class: o.mbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        obc.m41919f(str, tk0Var);
                    }
                });
            }
        } catch (Throwable th) {
            a94.m16692b(th, obc.class);
        }
    }

    /* renamed from: f */
    public static final void m41919f(String str, tk0 tk0Var) {
        if (a94.m16694d(obc.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "$applicationId");
            sq8.m48649h(tk0Var, "$event");
            kie.m35748c(str, bh3.m18963e(tk0Var));
        } catch (Throwable th) {
            a94.m16692b(th, obc.class);
        }
    }

    /* renamed from: g */
    public static final void m41920g(final String str, final String str2) {
        if (a94.m16694d(obc.class)) {
            return;
        }
        try {
            final Context contextM13019l = C10773c.m13019l();
            if (contextM13019l == null || str == null || str2 == null) {
                return;
            }
            C10773c.m13028u().execute(new Runnable() { // from class: o.nbc
                @Override // java.lang.Runnable
                public final void run() {
                    obc.m41921h(contextM13019l, str2, str);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, obc.class);
        }
    }

    /* renamed from: h */
    public static final void m41921h(Context context, String str, String str2) {
        if (a94.m16694d(obc.class)) {
            return;
        }
        try {
            sq8.m48649h(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                kie.m35749e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            a94.m16692b(th, obc.class);
        }
    }

    /* renamed from: c */
    public final boolean m41922c(tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return (tk0Var.m50097h() ^ true) || (tk0Var.m50097h() && f38053b.contains(tk0Var.m50095f()));
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
