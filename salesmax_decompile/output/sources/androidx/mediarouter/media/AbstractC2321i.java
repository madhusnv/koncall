package androidx.mediarouter.media;

import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.media.i */
/* loaded from: classes2.dex */
public abstract class AbstractC2321i {

    /* renamed from: androidx.mediarouter.media.i$a */
    public interface a {
        /* renamed from: b */
        void mo8395b(Object obj, Object obj2);

        /* renamed from: c */
        void mo8396c(Object obj, Object obj2, int i);

        /* renamed from: e */
        void mo8397e(Object obj);

        /* renamed from: f */
        void mo8398f(int i, Object obj);

        /* renamed from: g */
        void mo8399g(Object obj);

        /* renamed from: h */
        void mo8400h(int i, Object obj);

        /* renamed from: j */
        void mo8401j(Object obj);

        /* renamed from: k */
        void mo8402k(Object obj);
    }

    /* renamed from: androidx.mediarouter.media.i$b */
    public static class b extends MediaRouter.Callback {

        /* renamed from: a */
        public final a f9330a;

        public b(a aVar) {
            this.f9330a = aVar;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f9330a.mo8401j(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f9330a.mo8397e(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
            this.f9330a.mo8396c(routeInfo, routeGroup, i);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f9330a.mo8399g(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.f9330a.mo8400h(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.f9330a.mo8395b(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.f9330a.mo8398f(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f9330a.mo8402k(routeInfo);
        }
    }

    /* renamed from: androidx.mediarouter.media.i$c */
    public static final class c {
        /* renamed from: a */
        public static CharSequence m8403a(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        /* renamed from: b */
        public static int m8404b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        /* renamed from: c */
        public static int m8405c(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        /* renamed from: d */
        public static int m8406d(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        /* renamed from: e */
        public static Object m8407e(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        /* renamed from: f */
        public static int m8408f(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        /* renamed from: g */
        public static int m8409g(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        /* renamed from: h */
        public static int m8410h(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        /* renamed from: i */
        public static void m8411i(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i);
        }

        /* renamed from: j */
        public static void m8412j(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i);
        }

        /* renamed from: k */
        public static void m8413k(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }
    }

    /* renamed from: androidx.mediarouter.media.i$d */
    public static final class d {
        /* renamed from: a */
        public static void m8414a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        /* renamed from: b */
        public static void m8415b(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i);
        }

        /* renamed from: c */
        public static void m8416c(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i);
        }

        /* renamed from: d */
        public static void m8417d(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setRemoteControlClient((RemoteControlClient) obj2);
        }

        /* renamed from: e */
        public static void m8418e(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i);
        }

        /* renamed from: f */
        public static void m8419f(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        /* renamed from: g */
        public static void m8420g(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i);
        }

        /* renamed from: h */
        public static void m8421h(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i);
        }
    }

    /* renamed from: androidx.mediarouter.media.i$e */
    public interface e {
        /* renamed from: a */
        void mo8422a(Object obj, int i);

        /* renamed from: d */
        void mo8423d(Object obj, int i);
    }

    /* renamed from: androidx.mediarouter.media.i$f */
    public static class f extends MediaRouter.VolumeCallback {

        /* renamed from: a */
        public final e f9331a;

        public f(e eVar) {
            this.f9331a = eVar;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.f9331a.mo8423d(routeInfo, i);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.f9331a.mo8422a(routeInfo, i);
        }
    }

    /* renamed from: a */
    public static void m8385a(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* renamed from: b */
    public static Object m8386b(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    /* renamed from: c */
    public static Object m8387c(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    /* renamed from: d */
    public static Object m8388d(e eVar) {
        return new f(eVar);
    }

    /* renamed from: e */
    public static Object m8389e(Context context) {
        return context.getSystemService("media_router");
    }

    /* renamed from: f */
    public static List m8390f(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Object m8391g(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    /* renamed from: h */
    public static void m8392h(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    /* renamed from: i */
    public static void m8393i(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* renamed from: j */
    public static void m8394j(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (MediaRouter.RouteInfo) obj2);
    }
}
