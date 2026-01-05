package androidx.mediarouter.media;

import android.media.MediaRouter;

/* renamed from: androidx.mediarouter.media.k */
/* loaded from: classes2.dex */
public abstract class AbstractC2323k {

    /* renamed from: androidx.mediarouter.media.k$a */
    public static final class a {
        /* renamed from: a */
        public static CharSequence m8430a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        /* renamed from: b */
        public static boolean m8431b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    /* renamed from: androidx.mediarouter.media.k$b */
    public static final class b {
        /* renamed from: a */
        public static void m8432a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static void m8428a(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }

    /* renamed from: b */
    public static Object m8429b(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
