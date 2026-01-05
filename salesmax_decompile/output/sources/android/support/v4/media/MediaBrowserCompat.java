package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.InterfaceC1734b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p001o.gn1;
import p001o.tq;
import p001o.vo0;

/* loaded from: classes2.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final boolean f5097b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final InterfaceC1690c f5098a;

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo3433a(int i, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo3433a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m3561q(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C1687a();

        /* renamed from: a */
        public final int f5099a;

        /* renamed from: b */
        public final MediaDescriptionCompat f5100b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C1687a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f5099a = parcel.readInt();
            this.f5100b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f5099a + ", mDescription=" + this.f5100b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5099a);
            this.f5100b.writeToParcel(parcel, i);
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo3433a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m3561q(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class HandlerC1688a extends Handler {

        /* renamed from: a */
        public final WeakReference f5101a;

        /* renamed from: b */
        public WeakReference f5102b;

        public HandlerC1688a(InterfaceC1694g interfaceC1694g) {
            this.f5101a = new WeakReference(interfaceC1694g);
        }

        /* renamed from: a */
        public void m3436a(Messenger messenger) {
            this.f5102b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f5102b;
            if (weakReference == null || weakReference.get() == null || this.f5101a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.m3559a(data);
            InterfaceC1694g interfaceC1694g = (InterfaceC1694g) this.f5101a.get();
            Messenger messenger = (Messenger) this.f5102b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m3559a(bundle);
                    interfaceC1694g.mo3446e(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    interfaceC1694g.mo3447g(messenger);
                } else if (i != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Client version: ");
                    sb.append(1);
                    sb.append("\n  Service version: ");
                    sb.append(message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m3559a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.m3559a(bundle3);
                    interfaceC1694g.mo3445a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    interfaceC1694g.mo3447g(messenger);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C1689b {

        /* renamed from: a */
        public final MediaBrowser.ConnectionCallback f5103a = new a();

        /* renamed from: b */
        public b f5104b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = C1689b.this.f5104b;
                if (bVar != null) {
                    bVar.mo3441c();
                }
                C1689b.this.mo3437a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = C1689b.this.f5104b;
                if (bVar != null) {
                    bVar.mo3442d();
                }
                C1689b.this.mo3438b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = C1689b.this.f5104b;
                if (bVar != null) {
                    bVar.mo3443f();
                }
                C1689b.this.mo3439c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        public interface b {
            /* renamed from: c */
            void mo3441c();

            /* renamed from: d */
            void mo3442d();

            /* renamed from: f */
            void mo3443f();
        }

        /* renamed from: a */
        public abstract void mo3437a();

        /* renamed from: b */
        public abstract void mo3438b();

        /* renamed from: c */
        public abstract void mo3439c();

        /* renamed from: d */
        public void m3440d(b bVar) {
            this.f5104b = bVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public interface InterfaceC1690c {
        /* renamed from: b */
        void mo3444b();

        void disconnect();

        MediaSessionCompat.Token getSessionToken();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static class C1691d implements InterfaceC1690c, InterfaceC1694g, C1689b.b {

        /* renamed from: a */
        public final Context f5106a;

        /* renamed from: b */
        public final MediaBrowser f5107b;

        /* renamed from: c */
        public final Bundle f5108c;

        /* renamed from: d */
        public final HandlerC1688a f5109d = new HandlerC1688a(this);

        /* renamed from: e */
        public final vo0 f5110e = new vo0();

        /* renamed from: f */
        public int f5111f;

        /* renamed from: g */
        public C1695h f5112g;

        /* renamed from: h */
        public Messenger f5113h;

        /* renamed from: i */
        public MediaSessionCompat.Token f5114i;

        public C1691d(Context context, ComponentName componentName, C1689b c1689b, Bundle bundle) {
            this.f5106a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f5108c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            c1689b.m3440d(this);
            this.f5107b = new MediaBrowser(context, componentName, c1689b.f5103a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC1694g
        /* renamed from: a */
        public void mo3445a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f5113h != messenger) {
                return;
            }
            tq.m50332a(this.f5110e.get(str));
            if (MediaBrowserCompat.f5097b) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadChildren for id that isn't subscribed id=");
                sb.append(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC1690c
        /* renamed from: b */
        public void mo3444b() {
            this.f5107b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C1689b.b
        /* renamed from: c */
        public void mo3441c() {
            try {
                Bundle extras = this.f5107b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f5111f = extras.getInt("extra_service_version", 0);
                IBinder iBinderM29145a = gn1.m29145a(extras, "extra_messenger");
                if (iBinderM29145a != null) {
                    this.f5112g = new C1695h(iBinderM29145a, this.f5108c);
                    Messenger messenger = new Messenger(this.f5109d);
                    this.f5113h = messenger;
                    this.f5109d.m3436a(messenger);
                    try {
                        this.f5112g.m3448a(this.f5106a, this.f5113h);
                    } catch (RemoteException unused) {
                    }
                }
                InterfaceC1734b interfaceC1734bL0 = InterfaceC1734b.a.L0(gn1.m29145a(extras, "extra_session_binder"));
                if (interfaceC1734bL0 != null) {
                    this.f5114i = MediaSessionCompat.Token.m3587b(this.f5107b.getSessionToken(), interfaceC1734bL0);
                }
            } catch (IllegalStateException unused2) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C1689b.b
        /* renamed from: d */
        public void mo3442d() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC1690c
        public void disconnect() {
            Messenger messenger;
            C1695h c1695h = this.f5112g;
            if (c1695h != null && (messenger = this.f5113h) != null) {
                try {
                    c1695h.m3450c(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f5107b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC1694g
        /* renamed from: e */
        public void mo3446e(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C1689b.b
        /* renamed from: f */
        public void mo3443f() {
            this.f5112g = null;
            this.f5113h = null;
            this.f5114i = null;
            this.f5109d.m3436a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC1694g
        /* renamed from: g */
        public void mo3447g(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC1690c
        public MediaSessionCompat.Token getSessionToken() {
            if (this.f5114i == null) {
                this.f5114i = MediaSessionCompat.Token.m3586a(this.f5107b.getSessionToken());
            }
            return this.f5114i;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C1692e extends C1691d {
        public C1692e(Context context, ComponentName componentName, C1689b c1689b, Bundle bundle) {
            super(context, componentName, c1689b, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C1693f extends C1692e {
        public C1693f(Context context, ComponentName componentName, C1689b c1689b, Bundle bundle) {
            super(context, componentName, c1689b, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public interface InterfaceC1694g {
        /* renamed from: a */
        void mo3445a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        /* renamed from: e */
        void mo3446e(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: g */
        void mo3447g(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C1695h {

        /* renamed from: a */
        public Messenger f5115a;

        /* renamed from: b */
        public Bundle f5116b;

        public C1695h(IBinder iBinder, Bundle bundle) {
            this.f5115a = new Messenger(iBinder);
            this.f5116b = bundle;
        }

        /* renamed from: a */
        public void m3448a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f5116b);
            m3449b(6, bundle, messenger);
        }

        /* renamed from: b */
        public final void m3449b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f5115a.send(messageObtain);
        }

        /* renamed from: c */
        public void m3450c(Messenger messenger) throws RemoteException {
            m3449b(7, null, messenger);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C1689b c1689b, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5098a = new C1693f(context, componentName, c1689b, bundle);
        } else {
            this.f5098a = new C1692e(context, componentName, c1689b, bundle);
        }
    }

    /* renamed from: a */
    public void m3430a() {
        this.f5098a.mo3444b();
    }

    /* renamed from: b */
    public void m3431b() {
        this.f5098a.disconnect();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token m3432c() {
        return this.f5098a.getSessionToken();
    }
}
