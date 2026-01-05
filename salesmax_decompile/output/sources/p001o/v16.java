package p001o;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p001o.w16;

/* loaded from: classes3.dex */
public abstract class v16 {

    /* renamed from: a */
    public static final int[] f49748a = {x5e.dynamicColorThemeOverlay};

    /* renamed from: b */
    public static final InterfaceC17494c f49749b;

    /* renamed from: c */
    public static final InterfaceC17494c f49750c;

    /* renamed from: d */
    public static final Map f49751d;

    /* renamed from: e */
    public static final Map f49752e;

    /* renamed from: f */
    public static final String f49753f;

    /* renamed from: o.v16$a */
    public class C17492a implements InterfaceC17494c {
        @Override // p001o.v16.InterfaceC17494c
        /* renamed from: a */
        public boolean mo52223a() {
            return true;
        }
    }

    /* renamed from: o.v16$b */
    public class C17493b implements InterfaceC17494c {

        /* renamed from: a */
        public Long f49754a;

        @Override // p001o.v16.InterfaceC17494c
        /* renamed from: a */
        public boolean mo52223a() throws NoSuchMethodException, SecurityException {
            if (this.f49754a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.f49754a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.f49754a = -1L;
                }
            }
            return this.f49754a.longValue() >= 40100;
        }
    }

    /* renamed from: o.v16$c */
    public interface InterfaceC17494c {
        /* renamed from: a */
        boolean mo52223a();
    }

    /* renamed from: o.v16$d */
    public static class C17495d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final w16 f49755a;

        public C17495d(w16 w16Var) {
            this.f49755a = w16Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            v16.m52219c(activity, this.f49755a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: o.v16$e */
    public interface InterfaceC17496e {
        /* renamed from: a */
        void mo52224a(Activity activity);
    }

    /* renamed from: o.v16$f */
    public interface InterfaceC17497f {
        /* renamed from: a */
        boolean mo52225a(Activity activity, int i);
    }

    static {
        C17492a c17492a = new C17492a();
        f49749b = c17492a;
        C17493b c17493b = new C17493b();
        f49750c = c17493b;
        HashMap map = new HashMap();
        map.put("fcnt", c17492a);
        map.put("google", c17492a);
        map.put("hmd global", c17492a);
        map.put("infinix", c17492a);
        map.put("infinix mobility limited", c17492a);
        map.put("itel", c17492a);
        map.put("kyocera", c17492a);
        map.put("lenovo", c17492a);
        map.put("lge", c17492a);
        map.put("meizu", c17492a);
        map.put("motorola", c17492a);
        map.put("nothing", c17492a);
        map.put("oneplus", c17492a);
        map.put("oppo", c17492a);
        map.put("realme", c17492a);
        map.put("robolectric", c17492a);
        map.put("samsung", c17493b);
        map.put("sharp", c17492a);
        map.put("shift", c17492a);
        map.put("sony", c17492a);
        map.put("tcl", c17492a);
        map.put("tecno", c17492a);
        map.put("tecno mobile limited", c17492a);
        map.put("vivo", c17492a);
        map.put("wingtech", c17492a);
        map.put("xiaomi", c17492a);
        f49751d = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c17492a);
        map2.put("jio", c17492a);
        f49752e = Collections.unmodifiableMap(map2);
        f49753f = v16.class.getSimpleName();
    }

    /* renamed from: a */
    public static void m52217a(Application application) {
        m52218b(application, new w16.C17739c().m53778f());
    }

    /* renamed from: b */
    public static void m52218b(Application application, w16 w16Var) {
        application.registerActivityLifecycleCallbacks(new C17495d(w16Var));
    }

    /* renamed from: c */
    public static void m52219c(Activity activity, w16 w16Var) {
        if (m52222f()) {
            int iM52220d = w16Var.m53769d() == null ? w16Var.m53772g() == 0 ? m52220d(activity, f49748a) : w16Var.m53772g() : 0;
            if (w16Var.m53771f().mo52225a(activity, iM52220d)) {
                if (w16Var.m53769d() != null) {
                    b6f b6fVar = new b6f(jx7.m34652b(w16Var.m53769d().intValue()), !gua.m29510i(activity), m52221e(activity));
                    ci3 ci3Var = ci3.getInstance();
                    if (ci3Var == null || !ci3Var.mo21295a(activity, fua.m27522a(b6fVar))) {
                        return;
                    }
                } else {
                    ckh.m21348a(activity, iM52220d);
                }
                w16Var.m53770e().mo52224a(activity);
            }
        }
    }

    /* renamed from: d */
    public static int m52220d(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: e */
    public static float m52221e(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }

    /* renamed from: f */
    public static boolean m52222f() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (mm1.m39338b()) {
            return true;
        }
        Map map = f49751d;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        InterfaceC17494c interfaceC17494c = (InterfaceC17494c) map.get(str.toLowerCase(locale));
        if (interfaceC17494c == null) {
            interfaceC17494c = (InterfaceC17494c) f49752e.get(Build.BRAND.toLowerCase(locale));
        }
        return interfaceC17494c != null && interfaceC17494c.mo52223a();
    }
}
