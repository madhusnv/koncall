package p001o;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes2.dex */
public interface a9j {

    /* renamed from: a */
    public static final C12117a f14329a = C12117a.f14330a;

    /* renamed from: o.a9j$a */
    public static final class C12117a {

        /* renamed from: a */
        public static final /* synthetic */ C12117a f14330a = new C12117a();

        /* renamed from: b */
        public static final String f14331b = kge.m35689b(a9j.class).mo26337d();

        /* renamed from: c */
        public static b9j f14332c = f66.f22788a;

        /* renamed from: a */
        public final a9j m16705a(Context context) {
            sq8.m48649h(context, "context");
            return f14332c.mo18500a(new c9j(yaj.f55163a, m16706b(context)));
        }

        /* renamed from: b */
        public final u8j m16706b(Context context) {
            sq8.m48649h(context, "context");
            xp6 xp6Var = null;
            try {
                WindowLayoutComponent windowLayoutComponentM34835m = k0f.f31330a.m34835m();
                if (windowLayoutComponentM34835m != null) {
                    xp6Var = new xp6(windowLayoutComponentM34835m);
                }
            } catch (Throwable unused) {
            }
            return xp6Var == null ? jrf.f31006c.m34404a(context) : xp6Var;
        }
    }

    /* renamed from: a */
    static a9j m16703a(Context context) {
        return f14329a.m16705a(context);
    }

    /* renamed from: b */
    v37 mo16704b(Activity activity);
}
