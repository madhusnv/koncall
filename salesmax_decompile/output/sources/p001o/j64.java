package p001o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class j64 {

    /* renamed from: o.j64$a */
    public static class C14456a {
        /* renamed from: a */
        public static Context m33289a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: b */
        public static String m33290b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: o.j64$b */
    public static class C14457b {
        /* renamed from: a */
        public static Context m33291a(Context context, int i) {
            return context.createDeviceContext(i);
        }

        /* renamed from: b */
        public static int m33292b(Context context) {
            return context.getDeviceId();
        }
    }

    /* renamed from: a */
    public static Context m33287a(Context context) {
        int iM33292b;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iM33292b = C14457b.m33292b(context)) != C14457b.m33292b(applicationContext)) {
            applicationContext = C14457b.m33291a(applicationContext, iM33292b);
        }
        if (i < 30) {
            return applicationContext;
        }
        String strM33290b = C14456a.m33290b(context);
        return !Objects.equals(strM33290b, C14456a.m33290b(applicationContext)) ? C14456a.m33289a(applicationContext, strM33290b) : applicationContext;
    }

    /* renamed from: b */
    public static Application m33288b(Context context) {
        for (Context contextM33287a = m33287a(context); contextM33287a instanceof ContextWrapper; contextM33287a = ((ContextWrapper) contextM33287a).getBaseContext()) {
            if (contextM33287a instanceof Application) {
                return (Application) contextM33287a;
            }
        }
        return null;
    }
}
