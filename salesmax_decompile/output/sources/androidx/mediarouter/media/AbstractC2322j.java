package androidx.mediarouter.media;

import android.media.MediaRouter;
import android.view.Display;
import androidx.mediarouter.media.AbstractC2321i;

/* renamed from: androidx.mediarouter.media.j */
/* loaded from: classes2.dex */
public abstract class AbstractC2322j {

    /* renamed from: androidx.mediarouter.media.j$a */
    public interface a extends AbstractC2321i.a {
        /* renamed from: i */
        void mo8425i(Object obj);
    }

    /* renamed from: androidx.mediarouter.media.j$b */
    public static class b extends AbstractC2321i.b {
        public b(a aVar) {
            super(aVar);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((a) this.f9330a).mo8425i(routeInfo);
        }
    }

    /* renamed from: androidx.mediarouter.media.j$c */
    public static final class c {
        /* renamed from: a */
        public static Display m8426a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                return null;
            }
        }

        /* renamed from: b */
        public static boolean m8427b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    /* renamed from: a */
    public static Object m8424a(a aVar) {
        return new b(aVar);
    }
}
