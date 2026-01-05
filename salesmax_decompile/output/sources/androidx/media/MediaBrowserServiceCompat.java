package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.InterfaceC1734b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p001o.f1b;
import p001o.gn1;
import p001o.iwc;
import p001o.p8b;
import p001o.vo0;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: q */
    public static final boolean f7786q = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a */
    public InterfaceC2164g f7787a;

    /* renamed from: f */
    public C2163f f7792f;

    /* renamed from: h */
    public MediaSessionCompat.Token f7794h;

    /* renamed from: b */
    public final C2171n f7788b = new C2171n();

    /* renamed from: c */
    public final C2163f f7789c = new C2163f("android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: d */
    public final ArrayList f7790d = new ArrayList();

    /* renamed from: e */
    public final vo0 f7791e = new vo0();

    /* renamed from: g */
    public final HandlerC2174q f7793g = new HandlerC2174q(this);

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public class C2158a extends C2169l {

        /* renamed from: f */
        public final /* synthetic */ C2163f f7795f;

        /* renamed from: g */
        public final /* synthetic */ String f7796g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f7797h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f7798i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2158a(Object obj, C2163f c2163f, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f7795f = c2163f;
            this.f7796g = str;
            this.f7797h = bundle;
            this.f7798i = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C2169l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo6632d(List list) {
            if (MediaBrowserServiceCompat.this.f7791e.get(this.f7795f.f7813f.asBinder()) != this.f7795f) {
                if (MediaBrowserServiceCompat.f7786q) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb.append(this.f7795f.f7808a);
                    sb.append(" id=");
                    sb.append(this.f7796g);
                    return;
                }
                return;
            }
            if ((m6651a() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.m6616b(list, this.f7797h);
            }
            try {
                this.f7795f.f7813f.mo6667a(this.f7796g, list, this.f7797h, this.f7798i);
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calling onLoadChildren() failed for id=");
                sb2.append(this.f7796g);
                sb2.append(" package=");
                sb2.append(this.f7795f.f7808a);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C2159b extends C2169l {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f7800f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2159b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f7800f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C2169l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo6632d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((m6651a() & 2) != 0) {
                this.f7800f.m3703b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f7800f.m3703b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public class C2160c extends C2169l {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f7802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2160c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f7802f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C2169l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo6632d(List list) {
            if ((m6651a() & 4) != 0 || list == null) {
                this.f7802f.m3703b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f7802f.m3703b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C2161d extends C2169l {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f7804f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2161d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f7804f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C2169l
        /* renamed from: c */
        public void mo6636c(Bundle bundle) {
            this.f7804f.m3703b(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C2169l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo6632d(Bundle bundle) {
            this.f7804f.m3703b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C2162e {

        /* renamed from: a */
        public final String f7806a;

        /* renamed from: b */
        public final Bundle f7807b;

        public C2162e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f7806a = str;
            this.f7807b = bundle;
        }

        /* renamed from: c */
        public Bundle m6640c() {
            return this.f7807b;
        }

        /* renamed from: d */
        public String m6641d() {
            return this.f7806a;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C2163f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f7808a;

        /* renamed from: b */
        public final int f7809b;

        /* renamed from: c */
        public final int f7810c;

        /* renamed from: d */
        public final p8b f7811d;

        /* renamed from: e */
        public final Bundle f7812e;

        /* renamed from: f */
        public final InterfaceC2172o f7813f;

        /* renamed from: g */
        public final HashMap f7814g = new HashMap();

        /* renamed from: h */
        public C2162e f7815h;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = C2163f.this;
                MediaBrowserServiceCompat.this.f7791e.remove(c2163f.f7813f.asBinder());
            }
        }

        public C2163f(String str, int i, int i2, Bundle bundle, InterfaceC2172o interfaceC2172o) {
            this.f7808a = str;
            this.f7809b = i;
            this.f7810c = i2;
            this.f7811d = new p8b(str, i, i2);
            this.f7812e = bundle;
            this.f7813f = interfaceC2172o;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f7793g.post(new a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public interface InterfaceC2164g {
        /* renamed from: a */
        void mo6642a();

        /* renamed from: b */
        IBinder mo6643b(Intent intent);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    public class C2165h implements InterfaceC2164g {

        /* renamed from: a */
        public final List f7818a = new ArrayList();

        /* renamed from: b */
        public MediaBrowserService f7819b;

        /* renamed from: c */
        public Messenger f7820c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        public class a extends C2169l {

            /* renamed from: f */
            public final /* synthetic */ C2170m f7822f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C2170m c2170m) {
                super(obj);
                this.f7822f = c2170m;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C2169l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo6632d(List list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    arrayList = arrayList2;
                }
                this.f7822f.m6657b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        public class b extends MediaBrowserService {
            public b(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.m3559a(bundle);
                C2162e c2162eM6644c = C2165h.this.m6644c(str, i, bundle == null ? null : new Bundle(bundle));
                if (c2162eM6644c == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c2162eM6644c.f7806a, c2162eM6644c.f7807b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result) {
                C2165h.this.m6645d(str, new C2170m(result));
            }
        }

        public C2165h() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC2164g
        /* renamed from: b */
        public IBinder mo6643b(Intent intent) {
            return this.f7819b.onBind(intent);
        }

        /* renamed from: c */
        public C2162e m6644c(String str, int i, Bundle bundle) {
            Bundle bundleM6640c;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundleM6640c = null;
            } else {
                bundle.remove("extra_client_version");
                this.f7820c = new Messenger(MediaBrowserServiceCompat.this.f7793g);
                bundleM6640c = new Bundle();
                bundleM6640c.putInt("extra_service_version", 2);
                gn1.m29146b(bundleM6640c, "extra_messenger", this.f7820c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f7794h;
                if (token != null) {
                    InterfaceC1734b interfaceC1734bM3588c = token.m3588c();
                    gn1.m29146b(bundleM6640c, "extra_session_binder", interfaceC1734bM3588c == null ? null : interfaceC1734bM3588c.asBinder());
                } else {
                    this.f7818a.add(bundleM6640c);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            C2163f c2163f = MediaBrowserServiceCompat.this.new C2163f(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f7792f = c2163f;
            C2162e c2162eM6620f = mediaBrowserServiceCompat.m6620f(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f7792f = null;
            if (c2162eM6620f == null) {
                return null;
            }
            if (this.f7820c != null) {
                mediaBrowserServiceCompat2.f7790d.add(c2163f);
            }
            if (bundleM6640c == null) {
                bundleM6640c = c2162eM6620f.m6640c();
            } else if (c2162eM6620f.m6640c() != null) {
                bundleM6640c.putAll(c2162eM6620f.m6640c());
            }
            return new C2162e(c2162eM6620f.m6641d(), bundleM6640c);
        }

        /* renamed from: d */
        public void m6645d(String str, C2170m c2170m) {
            a aVar = new a(str, c2170m);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f7792f = mediaBrowserServiceCompat.f7789c;
            mediaBrowserServiceCompat.m6621g(str, aVar);
            MediaBrowserServiceCompat.this.f7792f = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public class C2166i extends C2165h {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        public class a extends C2169l {

            /* renamed from: f */
            public final /* synthetic */ C2170m f7826f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C2170m c2170m) {
                super(obj);
                this.f7826f = c2170m;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C2169l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo6632d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f7826f.m6657b(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.f7826f.m6657b(parcelObtain);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$b */
        public class b extends C2165h.b {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result result) {
                C2166i.this.m6647e(str, new C2170m(result));
            }
        }

        public C2166i() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC2164g
        /* renamed from: a */
        public void mo6642a() {
            b bVar = new b(MediaBrowserServiceCompat.this);
            this.f7819b = bVar;
            bVar.onCreate();
        }

        /* renamed from: e */
        public void m6647e(String str, C2170m c2170m) {
            a aVar = new a(str, c2170m);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f7792f = mediaBrowserServiceCompat.f7789c;
            mediaBrowserServiceCompat.m6623i(str, aVar);
            MediaBrowserServiceCompat.this.f7792f = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    public class C2167j extends C2166i {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        public class a extends C2169l {

            /* renamed from: f */
            public final /* synthetic */ C2170m f7830f;

            /* renamed from: g */
            public final /* synthetic */ Bundle f7831g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C2170m c2170m, Bundle bundle) {
                super(obj);
                this.f7830f = c2170m;
                this.f7831g = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C2169l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo6632d(List list) {
                if (list == null) {
                    this.f7830f.m6657b(null);
                    return;
                }
                if ((m6651a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.m6616b(list, this.f7831g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f7830f.m6657b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$b */
        public class b extends C2166i.b {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
                MediaSessionCompat.m3559a(bundle);
                C2167j c2167j = C2167j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f7792f = mediaBrowserServiceCompat.f7789c;
                c2167j.m6649f(str, new C2170m(result), bundle);
                MediaBrowserServiceCompat.this.f7792f = null;
            }
        }

        public C2167j() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C2166i, androidx.media.MediaBrowserServiceCompat.InterfaceC2164g
        /* renamed from: a */
        public void mo6642a() {
            b bVar = new b(MediaBrowserServiceCompat.this);
            this.f7819b = bVar;
            bVar.onCreate();
        }

        /* renamed from: f */
        public void m6649f(String str, C2170m c2170m, Bundle bundle) {
            a aVar = new a(str, c2170m, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f7792f = mediaBrowserServiceCompat.f7789c;
            mediaBrowserServiceCompat.m6622h(str, aVar, bundle);
            MediaBrowserServiceCompat.this.f7792f = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public class C2168k extends C2167j {
        public C2168k() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public static class C2169l {

        /* renamed from: a */
        public final Object f7835a;

        /* renamed from: b */
        public boolean f7836b;

        /* renamed from: c */
        public boolean f7837c;

        /* renamed from: d */
        public boolean f7838d;

        /* renamed from: e */
        public int f7839e;

        public C2169l(Object obj) {
            this.f7835a = obj;
        }

        /* renamed from: a */
        public int m6651a() {
            return this.f7839e;
        }

        /* renamed from: b */
        public boolean m6652b() {
            return this.f7836b || this.f7837c || this.f7838d;
        }

        /* renamed from: c */
        public void mo6636c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f7835a);
        }

        /* renamed from: d */
        public abstract void mo6632d(Object obj);

        /* renamed from: e */
        public void m6653e(Bundle bundle) {
            if (!this.f7837c && !this.f7838d) {
                this.f7838d = true;
                mo6636c(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f7835a);
            }
        }

        /* renamed from: f */
        public void m6654f(Object obj) {
            if (!this.f7837c && !this.f7838d) {
                this.f7837c = true;
                mo6632d(obj);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f7835a);
            }
        }

        /* renamed from: g */
        public void m6655g(int i) {
            this.f7839e = i;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C2170m {

        /* renamed from: a */
        public MediaBrowserService.Result f7840a;

        public C2170m(MediaBrowserService.Result result) {
            this.f7840a = result;
        }

        /* renamed from: a */
        public List m6656a(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* renamed from: b */
        public void m6657b(Object obj) {
            if (obj instanceof List) {
                this.f7840a.sendResult(m6656a((List) obj));
                return;
            }
            if (!(obj instanceof Parcel)) {
                this.f7840a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            this.f7840a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    public class C2171n {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7842a;

            /* renamed from: b */
            public final /* synthetic */ String f7843b;

            /* renamed from: c */
            public final /* synthetic */ int f7844c;

            /* renamed from: d */
            public final /* synthetic */ int f7845d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f7846e;

            public a(InterfaceC2172o interfaceC2172o, String str, int i, int i2, Bundle bundle) {
                this.f7842a = interfaceC2172o;
                this.f7843b = str;
                this.f7844c = i;
                this.f7845d = i2;
                this.f7846e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() throws RemoteException {
                IBinder iBinderAsBinder = this.f7842a.asBinder();
                MediaBrowserServiceCompat.this.f7791e.remove(iBinderAsBinder);
                C2163f c2163f = MediaBrowserServiceCompat.this.new C2163f(this.f7843b, this.f7844c, this.f7845d, this.f7846e, this.f7842a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f7792f = c2163f;
                C2162e c2162eM6620f = mediaBrowserServiceCompat.m6620f(this.f7843b, this.f7845d, this.f7846e);
                c2163f.f7815h = c2162eM6620f;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f7792f = null;
                if (c2162eM6620f == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f7843b);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f7842a.mo6668b();
                        return;
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f7843b);
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.f7791e.put(iBinderAsBinder, c2163f);
                    iBinderAsBinder.linkToDeath(c2163f, 0);
                    if (MediaBrowserServiceCompat.this.f7794h != null) {
                        this.f7842a.mo6669c(c2163f.f7815h.m6641d(), MediaBrowserServiceCompat.this.f7794h, c2163f.f7815h.m6640c());
                    }
                } catch (RemoteException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                    sb3.append(this.f7843b);
                    MediaBrowserServiceCompat.this.f7791e.remove(iBinderAsBinder);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7848a;

            public b(InterfaceC2172o interfaceC2172o) {
                this.f7848a = interfaceC2172o;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.remove(this.f7848a.asBinder());
                if (c2163f != null) {
                    c2163f.f7813f.asBinder().unlinkToDeath(c2163f, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$c */
        public class c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7850a;

            /* renamed from: b */
            public final /* synthetic */ String f7851b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f7852c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f7853d;

            public c(InterfaceC2172o interfaceC2172o, String str, IBinder iBinder, Bundle bundle) {
                this.f7850a = interfaceC2172o;
                this.f7851b = str;
                this.f7852c = iBinder;
                this.f7853d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.get(this.f7850a.asBinder());
                if (c2163f != null) {
                    MediaBrowserServiceCompat.this.m6615a(this.f7851b, c2163f, this.f7852c, this.f7853d);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("addSubscription for callback that isn't registered id=");
                sb.append(this.f7851b);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$d */
        public class d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7855a;

            /* renamed from: b */
            public final /* synthetic */ String f7856b;

            /* renamed from: c */
            public final /* synthetic */ IBinder f7857c;

            public d(InterfaceC2172o interfaceC2172o, String str, IBinder iBinder) {
                this.f7855a = interfaceC2172o;
                this.f7856b = str;
                this.f7857c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.get(this.f7855a.asBinder());
                if (c2163f == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f7856b);
                } else {
                    if (MediaBrowserServiceCompat.this.m6631q(this.f7856b, c2163f, this.f7857c)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f7856b);
                    sb2.append(" which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$e */
        public class e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7859a;

            /* renamed from: b */
            public final /* synthetic */ String f7860b;

            /* renamed from: c */
            public final /* synthetic */ ResultReceiver f7861c;

            public e(InterfaceC2172o interfaceC2172o, String str, ResultReceiver resultReceiver) {
                this.f7859a = interfaceC2172o;
                this.f7860b = str;
                this.f7861c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.get(this.f7859a.asBinder());
                if (c2163f != null) {
                    MediaBrowserServiceCompat.this.m6629o(this.f7860b, c2163f, this.f7861c);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getMediaItem for callback that isn't registered id=");
                sb.append(this.f7860b);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$f */
        public class f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7863a;

            /* renamed from: b */
            public final /* synthetic */ int f7864b;

            /* renamed from: c */
            public final /* synthetic */ String f7865c;

            /* renamed from: d */
            public final /* synthetic */ int f7866d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f7867e;

            public f(InterfaceC2172o interfaceC2172o, int i, String str, int i2, Bundle bundle) {
                this.f7863a = interfaceC2172o;
                this.f7864b = i;
                this.f7865c = str;
                this.f7866d = i2;
                this.f7867e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() throws RemoteException {
                C2163f c2163f;
                IBinder iBinderAsBinder = this.f7863a.asBinder();
                MediaBrowserServiceCompat.this.f7791e.remove(iBinderAsBinder);
                Iterator it = MediaBrowserServiceCompat.this.f7790d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2163f c2163f2 = (C2163f) it.next();
                    if (c2163f2.f7810c == this.f7864b) {
                        c2163f = (TextUtils.isEmpty(this.f7865c) || this.f7866d <= 0) ? MediaBrowserServiceCompat.this.new C2163f(c2163f2.f7808a, c2163f2.f7809b, c2163f2.f7810c, this.f7867e, this.f7863a) : null;
                        it.remove();
                    }
                }
                if (c2163f == null) {
                    c2163f = MediaBrowserServiceCompat.this.new C2163f(this.f7865c, this.f7866d, this.f7864b, this.f7867e, this.f7863a);
                }
                MediaBrowserServiceCompat.this.f7791e.put(iBinderAsBinder, c2163f);
                try {
                    iBinderAsBinder.linkToDeath(c2163f, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$g */
        public class g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7869a;

            public g(InterfaceC2172o interfaceC2172o) {
                this.f7869a = interfaceC2172o;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f7869a.asBinder();
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.remove(iBinderAsBinder);
                if (c2163f != null) {
                    iBinderAsBinder.unlinkToDeath(c2163f, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$h */
        public class h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7871a;

            /* renamed from: b */
            public final /* synthetic */ String f7872b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f7873c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f7874d;

            public h(InterfaceC2172o interfaceC2172o, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f7871a = interfaceC2172o;
                this.f7872b = str;
                this.f7873c = bundle;
                this.f7874d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.get(this.f7871a.asBinder());
                if (c2163f != null) {
                    MediaBrowserServiceCompat.this.m6630p(this.f7872b, this.f7873c, c2163f, this.f7874d);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("search for callback that isn't registered query=");
                sb.append(this.f7872b);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$i */
        public class i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2172o f7876a;

            /* renamed from: b */
            public final /* synthetic */ String f7877b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f7878c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f7879d;

            public i(InterfaceC2172o interfaceC2172o, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f7876a = interfaceC2172o;
                this.f7877b = str;
                this.f7878c = bundle;
                this.f7879d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2163f c2163f = (C2163f) MediaBrowserServiceCompat.this.f7791e.get(this.f7876a.asBinder());
                if (c2163f != null) {
                    MediaBrowserServiceCompat.this.m6627m(this.f7877b, this.f7878c, c2163f, this.f7879d);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("sendCustomAction for callback that isn't registered action=");
                sb.append(this.f7877b);
                sb.append(", extras=");
                sb.append(this.f7878c);
            }
        }

        public C2171n() {
        }

        /* renamed from: a */
        public void m6658a(String str, IBinder iBinder, Bundle bundle, InterfaceC2172o interfaceC2172o) {
            MediaBrowserServiceCompat.this.f7793g.m6671a(new c(interfaceC2172o, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void m6659b(String str, int i2, int i3, Bundle bundle, InterfaceC2172o interfaceC2172o) {
            if (MediaBrowserServiceCompat.this.m6618d(str, i3)) {
                MediaBrowserServiceCompat.this.f7793g.m6671a(new a(interfaceC2172o, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        /* renamed from: c */
        public void m6660c(InterfaceC2172o interfaceC2172o) {
            MediaBrowserServiceCompat.this.f7793g.m6671a(new b(interfaceC2172o));
        }

        /* renamed from: d */
        public void m6661d(String str, ResultReceiver resultReceiver, InterfaceC2172o interfaceC2172o) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f7793g.m6671a(new e(interfaceC2172o, str, resultReceiver));
        }

        /* renamed from: e */
        public void m6662e(InterfaceC2172o interfaceC2172o, String str, int i2, int i3, Bundle bundle) {
            MediaBrowserServiceCompat.this.f7793g.m6671a(new f(interfaceC2172o, i3, str, i2, bundle));
        }

        /* renamed from: f */
        public void m6663f(String str, IBinder iBinder, InterfaceC2172o interfaceC2172o) {
            MediaBrowserServiceCompat.this.f7793g.m6671a(new d(interfaceC2172o, str, iBinder));
        }

        /* renamed from: g */
        public void m6664g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC2172o interfaceC2172o) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f7793g.m6671a(new h(interfaceC2172o, str, bundle, resultReceiver));
        }

        /* renamed from: h */
        public void m6665h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC2172o interfaceC2172o) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f7793g.m6671a(new i(interfaceC2172o, str, bundle, resultReceiver));
        }

        /* renamed from: i */
        public void m6666i(InterfaceC2172o interfaceC2172o) {
            MediaBrowserServiceCompat.this.f7793g.m6671a(new g(interfaceC2172o));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    public interface InterfaceC2172o {
        /* renamed from: a */
        void mo6667a(String str, List list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        /* renamed from: b */
        void mo6668b();

        /* renamed from: c */
        void mo6669c(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    public static class C2173p implements InterfaceC2172o {

        /* renamed from: a */
        public final Messenger f7881a;

        public C2173p(Messenger messenger) {
            this.f7881a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC2172o
        /* renamed from: a */
        public void mo6667a(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m6670d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC2172o
        public IBinder asBinder() {
            return this.f7881a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC2172o
        /* renamed from: b */
        public void mo6668b() throws RemoteException {
            m6670d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC2172o
        /* renamed from: c */
        public void mo6669c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m6670d(1, bundle2);
        }

        /* renamed from: d */
        public final void m6670d(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f7881a.send(messageObtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    public static final class HandlerC2174q extends Handler {

        /* renamed from: a */
        public MediaBrowserServiceCompat f7882a;

        public HandlerC2174q(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f7882a = mediaBrowserServiceCompat;
        }

        /* renamed from: a */
        public void m6671a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        /* renamed from: b */
        public void m6672b() {
            this.f7882a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f7882a;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.m6617c(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public void m6615a(String str, C2163f c2163f, IBinder iBinder, Bundle bundle) {
        List<iwc> arrayList = (List) c2163f.f7814g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (iwc iwcVar : arrayList) {
            if (iBinder == iwcVar.f29291a && f1b.m25938a(bundle, (Bundle) iwcVar.f29292b)) {
                return;
            }
        }
        arrayList.add(new iwc(iBinder, bundle));
        c2163f.f7814g.put(str, arrayList);
        m6628n(str, c2163f, bundle, null);
        this.f7792f = c2163f;
        m6625k(str, bundle);
        this.f7792f = null;
    }

    /* renamed from: b */
    public List m6616b(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int size = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i3, size);
    }

    /* renamed from: c */
    public void m6617c(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.m3559a(bundle);
                this.f7788b.m6659b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C2173p(message.replyTo));
                break;
            case 2:
                this.f7788b.m6660c(new C2173p(message.replyTo));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.m3559a(bundle2);
                this.f7788b.m6658a(data.getString("data_media_item_id"), gn1.m29145a(data, "data_callback_token"), bundle2, new C2173p(message.replyTo));
                break;
            case 4:
                this.f7788b.m6663f(data.getString("data_media_item_id"), gn1.m29145a(data, "data_callback_token"), new C2173p(message.replyTo));
                break;
            case 5:
                this.f7788b.m6661d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C2173p(message.replyTo));
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.m3559a(bundle3);
                this.f7788b.m6662e(new C2173p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                this.f7788b.m6666i(new C2173p(message.replyTo));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.m3559a(bundle4);
                this.f7788b.m6664g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C2173p(message.replyTo));
                break;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.m3559a(bundle5);
                this.f7788b.m6665h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C2173p(message.replyTo));
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unhandled message: ");
                sb.append(message);
                sb.append("\n  Service version: ");
                sb.append(2);
                sb.append("\n  Client version: ");
                sb.append(message.arg1);
                break;
        }
    }

    /* renamed from: d */
    public boolean m6618d(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public void m6619e(String str, Bundle bundle, C2169l c2169l) {
        c2169l.m6653e(null);
    }

    /* renamed from: f */
    public abstract C2162e m6620f(String str, int i, Bundle bundle);

    /* renamed from: g */
    public abstract void m6621g(String str, C2169l c2169l);

    /* renamed from: h */
    public void m6622h(String str, C2169l c2169l, Bundle bundle) {
        c2169l.m6655g(1);
        m6621g(str, c2169l);
    }

    /* renamed from: i */
    public void m6623i(String str, C2169l c2169l) {
        c2169l.m6655g(2);
        c2169l.m6654f(null);
    }

    /* renamed from: j */
    public void m6624j(String str, Bundle bundle, C2169l c2169l) {
        c2169l.m6655g(4);
        c2169l.m6654f(null);
    }

    /* renamed from: k */
    public void m6625k(String str, Bundle bundle) {
    }

    /* renamed from: l */
    public void m6626l(String str) {
    }

    /* renamed from: m */
    public void m6627m(String str, Bundle bundle, C2163f c2163f, ResultReceiver resultReceiver) {
        C2161d c2161d = new C2161d(str, resultReceiver);
        this.f7792f = c2163f;
        m6619e(str, bundle, c2161d);
        this.f7792f = null;
        if (c2161d.m6652b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    /* renamed from: n */
    public void m6628n(String str, C2163f c2163f, Bundle bundle, Bundle bundle2) {
        C2158a c2158a = new C2158a(str, c2163f, str, bundle, bundle2);
        this.f7792f = c2163f;
        if (bundle == null) {
            m6621g(str, c2158a);
        } else {
            m6622h(str, c2158a, bundle);
        }
        this.f7792f = null;
        if (c2158a.m6652b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c2163f.f7808a + " id=" + str);
    }

    /* renamed from: o */
    public void m6629o(String str, C2163f c2163f, ResultReceiver resultReceiver) {
        C2159b c2159b = new C2159b(str, resultReceiver);
        this.f7792f = c2163f;
        m6623i(str, c2159b);
        this.f7792f = null;
        if (c2159b.m6652b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7787a.mo6643b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f7787a = new C2168k();
        } else if (i >= 26) {
            this.f7787a = new C2167j();
        } else {
            this.f7787a = new C2166i();
        }
        this.f7787a.mo6642a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f7793g.m6672b();
    }

    /* renamed from: p */
    public void m6630p(String str, Bundle bundle, C2163f c2163f, ResultReceiver resultReceiver) {
        C2160c c2160c = new C2160c(str, resultReceiver);
        this.f7792f = c2163f;
        m6624j(str, bundle, c2160c);
        this.f7792f = null;
        if (c2160c.m6652b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    /* renamed from: q */
    public boolean m6631q(String str, C2163f c2163f, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                return c2163f.f7814g.remove(str) != null;
            }
            List list = (List) c2163f.f7814g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((iwc) it.next()).f29291a) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    c2163f.f7814g.remove(str);
                }
            }
            return z;
        } finally {
            this.f7792f = c2163f;
            m6626l(str);
            this.f7792f = null;
        }
    }
}
