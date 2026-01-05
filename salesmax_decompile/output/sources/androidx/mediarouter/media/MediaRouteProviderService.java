package androidx.mediarouter.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.C2315c;
import androidx.mediarouter.media.C2317e;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.c64;
import p001o.e7b;
import p001o.g7b;
import p001o.k8b;
import p001o.s6c;
import p001o.vo0;

/* loaded from: classes2.dex */
public abstract class MediaRouteProviderService extends Service {

    /* renamed from: g */
    public static final boolean f9086g = Log.isLoggable("MediaRouteProviderSrv", 3);

    /* renamed from: a */
    public final HandlerC2312e f9087a;

    /* renamed from: b */
    public final Messenger f9088b;

    /* renamed from: c */
    public final HandlerC2311d f9089c;

    /* renamed from: d */
    public final AbstractC2316d.a f9090d;

    /* renamed from: e */
    public AbstractC2316d f9091e;

    /* renamed from: f */
    public final InterfaceC2308a f9092f;

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$a */
    public interface InterfaceC2308a {
        /* renamed from: a */
        boolean mo8027a(Messenger messenger, int i, int i2);

        /* renamed from: b */
        IBinder mo8028b(Intent intent);

        /* renamed from: c */
        boolean mo8029c(Messenger messenger, int i, int i2, String str, String str2);

        /* renamed from: d */
        void mo8030d(Context context);

        /* renamed from: e */
        boolean mo8031e(Messenger messenger, int i, int i2, String str);

        /* renamed from: f */
        boolean mo8032f(Messenger messenger, int i, e7b e7bVar);

        /* renamed from: g */
        void mo8033g(Messenger messenger);

        /* renamed from: h */
        boolean mo8034h(Messenger messenger, int i, int i2, int i3);

        /* renamed from: i */
        boolean mo8035i(Messenger messenger, int i, int i2);

        /* renamed from: j */
        boolean mo8036j(Messenger messenger, int i, int i2, String str);

        /* renamed from: k */
        boolean mo8037k(Messenger messenger, int i, int i2, String str);

        /* renamed from: l */
        boolean mo8038l(Messenger messenger, int i, int i2, Intent intent);

        /* renamed from: m */
        boolean mo8039m(Messenger messenger, int i, int i2, int i3);

        /* renamed from: n */
        AbstractC2316d.a mo8040n();

        /* renamed from: o */
        boolean mo8041o(Messenger messenger, int i, int i2, String str);

        /* renamed from: p */
        boolean mo8042p(Messenger messenger, int i, int i2, List list);

        /* renamed from: q */
        boolean mo8043q(Messenger messenger, int i, int i2, int i3);

        /* renamed from: r */
        boolean mo8044r(Messenger messenger, int i);
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$b */
    public static class C2309b extends C2310c {

        /* renamed from: g */
        public ServiceC2314b f9093g;

        /* renamed from: h */
        public final AbstractC2316d.b.d f9094h;

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$b$a */
        public class a extends C2310c.c {

            /* renamed from: q */
            public final Map f9095q;

            /* renamed from: s */
            public final Handler f9096s;

            /* renamed from: x */
            public final Map f9097x;

            public a(Messenger messenger, int i, String str) {
                super(messenger, i, str);
                this.f9095q = new vo0();
                this.f9096s = new Handler(Looper.getMainLooper());
                if (i < 4) {
                    this.f9097x = new vo0();
                } else {
                    this.f9097x = Collections.emptyMap();
                }
            }

            @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c.c
            /* renamed from: a */
            public Bundle mo8052a(C2317e c2317e) {
                if (this.f9097x.isEmpty()) {
                    return super.mo8052a(c2317e);
                }
                ArrayList arrayList = new ArrayList();
                for (C2315c c2315c : c2317e.m8211c()) {
                    if (this.f9097x.containsKey(c2315c.m8147m())) {
                        arrayList.add(new C2315c.a(c2315c).m8169j(false).m8164e());
                    } else {
                        arrayList.add(c2315c);
                    }
                }
                return super.mo8052a(new C2317e.a(c2317e).m8217d(arrayList).m8216c());
            }

            @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c.c
            /* renamed from: b */
            public Bundle mo8053b(String str, int i) {
                Bundle bundleMo8053b = super.mo8053b(str, i);
                if (bundleMo8053b != null && this.f9114c != null) {
                    C2309b.this.f9093g.m8113g(this, (AbstractC2316d.e) this.f9117f.get(i), i, this.f9114c, str);
                }
                return bundleMo8053b;
            }

            @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c.c
            /* renamed from: c */
            public boolean mo8054c(String str, String str2, int i) {
                AbstractC2316d.e eVar = (AbstractC2316d.e) this.f9095q.get(str);
                if (eVar != null) {
                    this.f9117f.put(i, eVar);
                    return true;
                }
                boolean zMo8054c = super.mo8054c(str, str2, i);
                if (str2 == null && zMo8054c && this.f9114c != null) {
                    C2309b.this.f9093g.m8113g(this, (AbstractC2316d.e) this.f9117f.get(i), i, this.f9114c, str);
                }
                if (zMo8054c) {
                    this.f9095q.put(str, (AbstractC2316d.e) this.f9117f.get(i));
                }
                return zMo8054c;
            }

            @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c.c
            /* renamed from: d */
            public void mo8055d() {
                int size = this.f9117f.size();
                for (int i = 0; i < size; i++) {
                    C2309b.this.f9093g.m8114h(this.f9117f.keyAt(i));
                }
                this.f9095q.clear();
                super.mo8055d();
            }

            @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c.c
            /* renamed from: h */
            public boolean mo8056h(int i) throws RemoteException {
                C2309b.this.f9093g.m8114h(i);
                AbstractC2316d.e eVar = (AbstractC2316d.e) this.f9117f.get(i);
                if (eVar != null) {
                    Iterator it = this.f9095q.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() == eVar) {
                            this.f9095q.remove(entry.getKey());
                            break;
                        }
                    }
                }
                Iterator it2 = this.f9097x.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (((Integer) entry2.getValue()).intValue() == i) {
                        m8051p((String) entry2.getKey());
                        break;
                    }
                }
                return super.mo8056h(i);
            }

            @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c.c
            /* renamed from: i */
            public void mo8057i(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) throws RemoteException {
                super.mo8057i(bVar, c2315c, collection);
                ServiceC2314b serviceC2314b = C2309b.this.f9093g;
                if (serviceC2314b != null) {
                    serviceC2314b.m8116j(bVar, c2315c, collection);
                }
            }

            /* renamed from: l */
            public final void m8058l(final String str, int i) throws RemoteException {
                this.f9097x.put(str, Integer.valueOf(i));
                this.f9096s.postDelayed(new Runnable() { // from class: o.j7b
                    @Override // java.lang.Runnable
                    public final void run() throws RemoteException {
                        this.f29920a.m8051p(str);
                    }
                }, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                m8063r();
            }

            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public final void m8051p(String str) throws RemoteException {
                if (this.f9097x.remove(str) == null) {
                    return;
                }
                m8063r();
            }

            /* renamed from: n */
            public AbstractC2316d.e m8060n(String str) {
                return (AbstractC2316d.e) this.f9095q.get(str);
            }

            /* renamed from: o */
            public int m8061o(AbstractC2316d.e eVar) {
                int iIndexOfValue = this.f9117f.indexOfValue(eVar);
                if (iIndexOfValue < 0) {
                    return -1;
                }
                return this.f9117f.keyAt(iIndexOfValue);
            }

            /* renamed from: q */
            public void m8062q(AbstractC2316d.e eVar, String str) throws RemoteException {
                int iM8061o = m8061o(eVar);
                mo8056h(iM8061o);
                if (this.f9113b < 4) {
                    m8058l(str, iM8061o);
                } else {
                    if (iM8061o >= 0) {
                        MediaRouteProviderService.m8023h(this.f9112a, 8, 0, iM8061o, null, null);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("releaseControllerByProvider: Can't find the controller. route ID=");
                    sb.append(str);
                }
            }

            /* renamed from: r */
            public void m8063r() throws RemoteException {
                C2317e c2317eM8183o = C2309b.this.m8066v().m8025d().m8183o();
                if (c2317eM8183o != null) {
                    MediaRouteProviderService.m8023h(this.f9112a, 5, 0, 0, mo8052a(c2317eM8183o), null);
                }
            }
        }

        public C2309b(MediaRouteProviderService mediaRouteProviderService) {
            super(mediaRouteProviderService);
            this.f9094h = new AbstractC2316d.b.d() { // from class: o.i7b
                @Override // androidx.mediarouter.media.AbstractC2316d.b.d
                /* renamed from: a */
                public final void mo8075a(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) {
                    this.f28183a.m8045A(bVar, c2315c, collection);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m8045A(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) {
            this.f9093g.m8116j(bVar, c2315c, collection);
        }

        /* renamed from: B */
        public void m8047B(AbstractC2316d.b bVar) {
            bVar.m8193q(c64.getMainExecutor(this.f9099a.getApplicationContext()), this.f9094h);
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c, androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: b */
        public IBinder mo8028b(Intent intent) {
            this.f9099a.m8024b();
            if (this.f9093g == null) {
                this.f9093g = new ServiceC2314b(this);
                if (this.f9099a.getBaseContext() != null) {
                    this.f9093g.attachBaseContext(this.f9099a);
                }
            }
            IBinder iBinderMo8028b = super.mo8028b(intent);
            return iBinderMo8028b != null ? iBinderMo8028b : this.f9093g.onBind(intent);
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c, androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: d */
        public void mo8030d(Context context) {
            ServiceC2314b serviceC2314b = this.f9093g;
            if (serviceC2314b != null) {
                serviceC2314b.attachBaseContext(context);
            }
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c
        /* renamed from: s */
        public C2310c.c mo8048s(Messenger messenger, int i, String str) {
            return new a(messenger, i, str);
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.C2310c
        /* renamed from: w */
        public void mo8049w(C2317e c2317e) throws RemoteException {
            super.mo8049w(c2317e);
            this.f9093g.m8117k(c2317e);
        }
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c */
    public static class C2310c implements InterfaceC2308a {

        /* renamed from: a */
        public final MediaRouteProviderService f9099a;

        /* renamed from: c */
        public e7b f9101c;

        /* renamed from: d */
        public e7b f9102d;

        /* renamed from: e */
        public long f9103e;

        /* renamed from: b */
        public final ArrayList f9100b = new ArrayList();

        /* renamed from: f */
        public final k8b f9104f = new k8b(new a());

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2310c.this.m8068y();
            }
        }

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$b */
        public class b extends C2319g.c {

            /* renamed from: a */
            public final /* synthetic */ c f9106a;

            /* renamed from: b */
            public final /* synthetic */ int f9107b;

            /* renamed from: c */
            public final /* synthetic */ Intent f9108c;

            /* renamed from: d */
            public final /* synthetic */ Messenger f9109d;

            /* renamed from: e */
            public final /* synthetic */ int f9110e;

            public b(c cVar, int i, Intent intent, Messenger messenger, int i2) {
                this.f9106a = cVar;
                this.f9107b = i;
                this.f9108c = intent;
                this.f9109d = messenger;
                this.f9110e = i2;
            }

            @Override // androidx.mediarouter.media.C2319g.c
            /* renamed from: a */
            public void mo8069a(String str, Bundle bundle) throws RemoteException {
                if (MediaRouteProviderService.f9086g) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f9106a);
                    sb.append(": Route control request failed, controllerId=");
                    sb.append(this.f9107b);
                    sb.append(", intent=");
                    sb.append(this.f9108c);
                    sb.append(", error=");
                    sb.append(str);
                    sb.append(", data=");
                    sb.append(bundle);
                }
                if (C2310c.this.m8064t(this.f9109d) >= 0) {
                    if (str == null) {
                        MediaRouteProviderService.m8023h(this.f9109d, 4, this.f9110e, 0, bundle, null);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
                    MediaRouteProviderService.m8023h(this.f9109d, 4, this.f9110e, 0, bundle, bundle2);
                }
            }

            @Override // androidx.mediarouter.media.C2319g.c
            /* renamed from: b */
            public void mo8070b(Bundle bundle) throws RemoteException {
                if (MediaRouteProviderService.f9086g) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f9106a);
                    sb.append(": Route control request succeeded, controllerId=");
                    sb.append(this.f9107b);
                    sb.append(", intent=");
                    sb.append(this.f9108c);
                    sb.append(", data=");
                    sb.append(bundle);
                }
                if (C2310c.this.m8064t(this.f9109d) >= 0) {
                    MediaRouteProviderService.m8023h(this.f9109d, 3, this.f9110e, 0, bundle, null);
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$c */
        public class c implements IBinder.DeathRecipient {

            /* renamed from: a */
            public final Messenger f9112a;

            /* renamed from: b */
            public final int f9113b;

            /* renamed from: c */
            public final String f9114c;

            /* renamed from: d */
            public e7b f9115d;

            /* renamed from: e */
            public long f9116e;

            /* renamed from: f */
            public final SparseArray f9117f = new SparseArray();

            /* renamed from: g */
            public final AbstractC2316d.b.d f9118g = new a();

            /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$c$a */
            public class a implements AbstractC2316d.b.d {
                public a() {
                }

                @Override // androidx.mediarouter.media.AbstractC2316d.b.d
                /* renamed from: a */
                public void mo8075a(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) throws RemoteException {
                    c.this.mo8057i(bVar, c2315c, collection);
                }
            }

            public c(Messenger messenger, int i, String str) {
                this.f9112a = messenger;
                this.f9113b = i;
                this.f9114c = str;
            }

            /* renamed from: a */
            public Bundle mo8052a(C2317e c2317e) {
                return MediaRouteProviderService.m8019a(c2317e, this.f9113b);
            }

            /* renamed from: b */
            public Bundle mo8053b(String str, int i) {
                AbstractC2316d.b bVarMo8086r;
                if (this.f9117f.indexOfKey(i) >= 0 || (bVarMo8086r = C2310c.this.f9099a.m8025d().mo8086r(str)) == null) {
                    return null;
                }
                bVarMo8086r.m8193q(c64.getMainExecutor(C2310c.this.f9099a.getApplicationContext()), this.f9118g);
                this.f9117f.put(i, bVarMo8086r);
                Bundle bundle = new Bundle();
                bundle.putString("groupableTitle", bVarMo8086r.mo8190k());
                bundle.putString("transferableTitle", bVarMo8086r.mo8191l());
                return bundle;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                C2310c.this.f9099a.f9089c.obtainMessage(1, this.f9112a).sendToTarget();
            }

            /* renamed from: c */
            public boolean mo8054c(String str, String str2, int i) {
                if (this.f9117f.indexOfKey(i) >= 0) {
                    return false;
                }
                AbstractC2316d.e eVarMo8087s = str2 == null ? C2310c.this.f9099a.m8025d().mo8087s(str) : C2310c.this.f9099a.m8025d().mo8088t(str, str2);
                if (eVarMo8087s == null) {
                    return false;
                }
                this.f9117f.put(i, eVarMo8087s);
                return true;
            }

            /* renamed from: d */
            public void mo8055d() {
                int size = this.f9117f.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC2316d.e) this.f9117f.valueAt(i)).mo8096e();
                }
                this.f9117f.clear();
                this.f9112a.getBinder().unlinkToDeath(this, 0);
                m8074j(null);
            }

            /* renamed from: e */
            public AbstractC2316d.e m8071e(int i) {
                return (AbstractC2316d.e) this.f9117f.get(i);
            }

            /* renamed from: f */
            public boolean m8072f(Messenger messenger) {
                return this.f9112a.getBinder() == messenger.getBinder();
            }

            /* renamed from: g */
            public boolean m8073g() throws RemoteException {
                try {
                    this.f9112a.getBinder().linkToDeath(this, 0);
                    return true;
                } catch (RemoteException unused) {
                    binderDied();
                    return false;
                }
            }

            /* renamed from: h */
            public boolean mo8056h(int i) {
                AbstractC2316d.e eVar = (AbstractC2316d.e) this.f9117f.get(i);
                if (eVar == null) {
                    return false;
                }
                this.f9117f.remove(i);
                eVar.mo8096e();
                return true;
            }

            /* renamed from: i */
            public void mo8057i(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) throws RemoteException {
                int iIndexOfValue = this.f9117f.indexOfValue(bVar);
                if (iIndexOfValue < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring unknown dynamic group route controller: ");
                    sb.append(bVar);
                    return;
                }
                int iKeyAt = this.f9117f.keyAt(iIndexOfValue);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC2316d.b.c) it.next()).m8200g());
                }
                Bundle bundle = new Bundle();
                if (c2315c != null) {
                    bundle.putParcelable("groupRoute", c2315c.m8136a());
                }
                bundle.putParcelableArrayList("dynamicRoutes", arrayList);
                MediaRouteProviderService.m8023h(this.f9112a, 7, 0, iKeyAt, bundle, null);
            }

            /* renamed from: j */
            public boolean m8074j(e7b e7bVar) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (s6c.m47909a(this.f9115d, e7bVar)) {
                    return false;
                }
                this.f9115d = e7bVar;
                this.f9116e = jElapsedRealtime;
                return C2310c.this.m8068y();
            }

            public String toString() {
                return MediaRouteProviderService.m8020c(this.f9112a);
            }
        }

        /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$c$d */
        public class d extends AbstractC2316d.a {
            public d() {
            }

            @Override // androidx.mediarouter.media.AbstractC2316d.a
            /* renamed from: a */
            public void mo8076a(AbstractC2316d abstractC2316d, C2317e c2317e) throws RemoteException {
                C2310c.this.mo8049w(c2317e);
            }
        }

        public C2310c(MediaRouteProviderService mediaRouteProviderService) {
            this.f9099a = mediaRouteProviderService;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: a */
        public boolean mo8027a(Messenger messenger, int i, int i2) throws RemoteException {
            AbstractC2316d.e eVarM8071e;
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || (eVarM8071e = cVarM8065u.m8071e(i2)) == null) {
                return false;
            }
            eVarM8071e.mo8122f();
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route selected, controllerId=");
                sb.append(i2);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: b */
        public IBinder mo8028b(Intent intent) {
            if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
                return null;
            }
            this.f9099a.m8024b();
            if (this.f9099a.m8025d() != null) {
                return this.f9099a.f9088b.getBinder();
            }
            return null;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: c */
        public boolean mo8029c(Messenger messenger, int i, int i2, String str, String str2) throws RemoteException {
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || !cVarM8065u.mo8054c(str, str2, i2)) {
                return false;
            }
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route controller created, controllerId=");
                sb.append(i2);
                sb.append(", routeId=");
                sb.append(str);
                sb.append(", routeGroupId=");
                sb.append(str2);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: d */
        public void mo8030d(Context context) {
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: e */
        public boolean mo8031e(Messenger messenger, int i, int i2, String str) throws RemoteException {
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null) {
                return false;
            }
            AbstractC2316d.e eVarM8071e = cVarM8065u.m8071e(i2);
            if (!(eVarM8071e instanceof AbstractC2316d.b)) {
                return false;
            }
            ((AbstractC2316d.b) eVarM8071e).mo8099n(str);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Added a member route, controllerId=");
                sb.append(i2);
                sb.append(", memberId=");
                sb.append(str);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: f */
        public boolean mo8032f(Messenger messenger, int i, e7b e7bVar) throws RemoteException {
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null) {
                return false;
            }
            boolean zM8074j = cVarM8065u.m8074j(e7bVar);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Set discovery request, request=");
                sb.append(e7bVar);
                sb.append(", actuallyChanged=");
                sb.append(zM8074j);
                sb.append(", compositeDiscoveryRequest=");
                sb.append(this.f9101c);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: g */
        public void mo8033g(Messenger messenger) {
            int iM8064t = m8064t(messenger);
            if (iM8064t >= 0) {
                c cVar = (c) this.f9100b.remove(iM8064t);
                if (MediaRouteProviderService.f9086g) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cVar);
                    sb.append(": Binder died");
                }
                cVar.mo8055d();
            }
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: h */
        public boolean mo8034h(Messenger messenger, int i, int i2, int i3) throws RemoteException {
            AbstractC2316d.e eVarM8071e;
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || (eVarM8071e = cVarM8065u.m8071e(i2)) == null) {
                return false;
            }
            eVarM8071e.mo8097g(i3);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route volume changed, controllerId=");
                sb.append(i2);
                sb.append(", volume=");
                sb.append(i3);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: i */
        public boolean mo8035i(Messenger messenger, int i, int i2) throws RemoteException {
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || !cVarM8065u.mo8056h(i2)) {
                return false;
            }
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route controller released, controllerId=");
                sb.append(i2);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: j */
        public boolean mo8036j(Messenger messenger, int i, int i2, String str) throws RemoteException {
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null) {
                return false;
            }
            AbstractC2316d.e eVarM8071e = cVarM8065u.m8071e(i2);
            if (!(eVarM8071e instanceof AbstractC2316d.b)) {
                return false;
            }
            ((AbstractC2316d.b) eVarM8071e).mo8100o(str);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Removed a member route, controllerId=");
                sb.append(i2);
                sb.append(", memberId=");
                sb.append(str);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: k */
        public boolean mo8037k(Messenger messenger, int i, int i2, String str) throws RemoteException {
            Bundle bundleMo8053b;
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || (bundleMo8053b = cVarM8065u.mo8053b(str, i2)) == null) {
                return false;
            }
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route controller created, controllerId=");
                sb.append(i2);
                sb.append(", initialMemberRouteId=");
                sb.append(str);
            }
            MediaRouteProviderService.m8023h(messenger, 6, i, 3, bundleMo8053b, null);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: l */
        public boolean mo8038l(Messenger messenger, int i, int i2, Intent intent) {
            AbstractC2316d.e eVarM8071e;
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || (eVarM8071e = cVarM8065u.m8071e(i2)) == null) {
                return false;
            }
            if (!eVarM8071e.mo8095d(intent, i != 0 ? new b(cVarM8065u, i2, intent, messenger, i) : null)) {
                return false;
            }
            if (!MediaRouteProviderService.f9086g) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cVarM8065u);
            sb.append(": Route control request delivered, controllerId=");
            sb.append(i2);
            sb.append(", intent=");
            sb.append(intent);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: m */
        public boolean mo8039m(Messenger messenger, int i, int i2, int i3) throws RemoteException {
            AbstractC2316d.e eVarM8071e;
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || (eVarM8071e = cVarM8065u.m8071e(i2)) == null) {
                return false;
            }
            eVarM8071e.mo8123i(i3);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route unselected, controllerId=");
                sb.append(i2);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: n */
        public AbstractC2316d.a mo8040n() {
            return new d();
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: o */
        public boolean mo8041o(Messenger messenger, int i, int i2, String str) throws RemoteException {
            if (i2 < 1 || m8064t(messenger) >= 0) {
                return false;
            }
            c cVarMo8048s = mo8048s(messenger, i2, str);
            if (!cVarMo8048s.m8073g()) {
                return false;
            }
            this.f9100b.add(cVarMo8048s);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarMo8048s);
                sb.append(": Registered, version=");
                sb.append(i2);
            }
            if (i != 0) {
                MediaRouteProviderService.m8023h(messenger, 2, i, 3, MediaRouteProviderService.m8019a(this.f9099a.m8025d().m8183o(), cVarMo8048s.f9113b), null);
            }
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: p */
        public boolean mo8042p(Messenger messenger, int i, int i2, List list) throws RemoteException {
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null) {
                return false;
            }
            AbstractC2316d.e eVarM8071e = cVarM8065u.m8071e(i2);
            if (!(eVarM8071e instanceof AbstractC2316d.b)) {
                return false;
            }
            ((AbstractC2316d.b) eVarM8071e).mo8101p(list);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Updated list of member routes, controllerId=");
                sb.append(i2);
                sb.append(", memberIds=");
                sb.append(list);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: q */
        public boolean mo8043q(Messenger messenger, int i, int i2, int i3) throws RemoteException {
            AbstractC2316d.e eVarM8071e;
            c cVarM8065u = m8065u(messenger);
            if (cVarM8065u == null || (eVarM8071e = cVarM8065u.m8071e(i2)) == null) {
                return false;
            }
            eVarM8071e.mo8098j(i3);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVarM8065u);
                sb.append(": Route volume updated, controllerId=");
                sb.append(i2);
                sb.append(", delta=");
                sb.append(i3);
            }
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        @Override // androidx.mediarouter.media.MediaRouteProviderService.InterfaceC2308a
        /* renamed from: r */
        public boolean mo8044r(Messenger messenger, int i) throws RemoteException {
            int iM8064t = m8064t(messenger);
            if (iM8064t < 0) {
                return false;
            }
            c cVar = (c) this.f9100b.remove(iM8064t);
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVar);
                sb.append(": Unregistered");
            }
            cVar.mo8055d();
            MediaRouteProviderService.m8022g(messenger, i);
            return true;
        }

        /* renamed from: s */
        public c mo8048s(Messenger messenger, int i, String str) {
            return new c(messenger, i, str);
        }

        /* renamed from: t */
        public int m8064t(Messenger messenger) {
            int size = this.f9100b.size();
            for (int i = 0; i < size; i++) {
                if (((c) this.f9100b.get(i)).m8072f(messenger)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: u */
        public final c m8065u(Messenger messenger) {
            int iM8064t = m8064t(messenger);
            if (iM8064t >= 0) {
                return (c) this.f9100b.get(iM8064t);
            }
            return null;
        }

        /* renamed from: v */
        public MediaRouteProviderService m8066v() {
            return this.f9099a;
        }

        /* renamed from: w */
        public void mo8049w(C2317e c2317e) throws RemoteException {
            int size = this.f9100b.size();
            for (int i = 0; i < size; i++) {
                c cVar = (c) this.f9100b.get(i);
                MediaRouteProviderService.m8023h(cVar.f9112a, 5, 0, 0, cVar.mo8052a(c2317e), null);
                if (MediaRouteProviderService.f9086g) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cVar);
                    sb.append(": Sent descriptor change event, descriptor=");
                    sb.append(c2317e);
                }
            }
        }

        /* renamed from: x */
        public boolean m8067x(e7b e7bVar) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (s6c.m47909a(this.f9102d, e7bVar) && !e7bVar.m24486e()) {
                return false;
            }
            this.f9102d = e7bVar;
            this.f9103e = jElapsedRealtime;
            return m8068y();
        }

        /* renamed from: y */
        public boolean m8068y() {
            C2318f.a aVar;
            this.f9104f.m35169c();
            e7b e7bVar = this.f9102d;
            if (e7bVar != null) {
                this.f9104f.m35168b(e7bVar.m24486e(), this.f9103e);
                aVar = new C2318f.a(this.f9102d.m24485d());
            } else {
                aVar = null;
            }
            int size = this.f9100b.size();
            for (int i = 0; i < size; i++) {
                c cVar = (c) this.f9100b.get(i);
                e7b e7bVar2 = cVar.f9115d;
                if (e7bVar2 != null && (!e7bVar2.m24485d().m8224f() || e7bVar2.m24486e())) {
                    this.f9104f.m35168b(e7bVar2.m24486e(), cVar.f9116e);
                    if (aVar == null) {
                        aVar = new C2318f.a(e7bVar2.m24485d());
                    } else {
                        aVar.m8229c(e7bVar2.m24485d());
                    }
                }
            }
            e7b e7bVar3 = aVar != null ? new e7b(aVar.m8230d(), this.f9104f.m35167a()) : null;
            if (s6c.m47909a(this.f9101c, e7bVar3)) {
                return false;
            }
            this.f9101c = e7bVar3;
            this.f9099a.m8025d().m8188x(e7bVar3);
            return true;
        }
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$d */
    public final class HandlerC2311d extends Handler {
        public HandlerC2311d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            MediaRouteProviderService.this.f9092f.mo8033g((Messenger) message.obj);
        }
    }

    /* renamed from: androidx.mediarouter.media.MediaRouteProviderService$e */
    public static final class HandlerC2312e extends Handler {

        /* renamed from: a */
        public final WeakReference f9123a;

        public HandlerC2312e(MediaRouteProviderService mediaRouteProviderService) {
            this.f9123a = new WeakReference(mediaRouteProviderService);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public final boolean m8077a(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle, String str) {
            MediaRouteProviderService mediaRouteProviderService = (MediaRouteProviderService) this.f9123a.get();
            if (mediaRouteProviderService != null) {
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.f9092f.mo8041o(messenger, i2, i3, str);
                    case 2:
                        return mediaRouteProviderService.f9092f.mo8044r(messenger, i2);
                    case 3:
                        String string = bundle.getString("routeId");
                        String string2 = bundle.getString("routeGroupId");
                        if (string != null) {
                            return mediaRouteProviderService.f9092f.mo8029c(messenger, i2, i3, string, string2);
                        }
                        break;
                    case 4:
                        return mediaRouteProviderService.f9092f.mo8035i(messenger, i2, i3);
                    case 5:
                        return mediaRouteProviderService.f9092f.mo8027a(messenger, i2, i3);
                    case 6:
                        return mediaRouteProviderService.f9092f.mo8039m(messenger, i2, i3, bundle != null ? bundle.getInt("unselectReason", 0) : 0);
                    case 7:
                        int i4 = bundle.getInt("volume", -1);
                        if (i4 >= 0) {
                            return mediaRouteProviderService.f9092f.mo8034h(messenger, i2, i3, i4);
                        }
                        break;
                    case 8:
                        int i5 = bundle.getInt("volume", 0);
                        if (i5 != 0) {
                            return mediaRouteProviderService.f9092f.mo8043q(messenger, i2, i3, i5);
                        }
                        break;
                    case 9:
                        if (obj instanceof Intent) {
                            return mediaRouteProviderService.f9092f.mo8038l(messenger, i2, i3, (Intent) obj);
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            e7b e7bVarM24482c = e7b.m24482c((Bundle) obj);
                            InterfaceC2308a interfaceC2308a = mediaRouteProviderService.f9092f;
                            if (e7bVarM24482c == null || !e7bVarM24482c.m24487f()) {
                                e7bVarM24482c = null;
                            }
                            return interfaceC2308a.mo8032f(messenger, i2, e7bVarM24482c);
                        }
                        break;
                    case 11:
                        String string3 = bundle.getString("memberRouteId");
                        if (string3 != null) {
                            return mediaRouteProviderService.f9092f.mo8037k(messenger, i2, i3, string3);
                        }
                        break;
                    case 12:
                        String string4 = bundle.getString("memberRouteId");
                        if (string4 != null) {
                            return mediaRouteProviderService.f9092f.mo8031e(messenger, i2, i3, string4);
                        }
                        break;
                    case 13:
                        String string5 = bundle.getString("memberRouteId");
                        if (string5 != null) {
                            return mediaRouteProviderService.f9092f.mo8036j(messenger, i2, i3, string5);
                        }
                        break;
                    case 14:
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("memberRouteIds");
                        if (stringArrayList != null) {
                            return mediaRouteProviderService.f9092f.mo8042p(messenger, i2, i3, stringArrayList);
                        }
                        break;
                }
            }
            return false;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws RemoteException {
            String[] packagesForUid;
            Messenger messenger = message.replyTo;
            if (!g7b.m28138a(messenger)) {
                boolean z = MediaRouteProviderService.f9086g;
                return;
            }
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle bundlePeekData = message.peekData();
            if (m8077a(i, messenger, i2, i3, obj, bundlePeekData, (i != 1 || (packagesForUid = ((MediaRouteProviderService) this.f9123a.get()).getPackageManager().getPackagesForUid(message.sendingUid)) == null || packagesForUid.length <= 0) ? null : packagesForUid[0])) {
                return;
            }
            if (MediaRouteProviderService.f9086g) {
                StringBuilder sb = new StringBuilder();
                sb.append(MediaRouteProviderService.m8020c(messenger));
                sb.append(": Message failed, what=");
                sb.append(i);
                sb.append(", requestId=");
                sb.append(i2);
                sb.append(", arg=");
                sb.append(i3);
                sb.append(", obj=");
                sb.append(obj);
                sb.append(", data=");
                sb.append(bundlePeekData);
            }
            MediaRouteProviderService.m8021f(messenger, i2);
        }
    }

    public MediaRouteProviderService() {
        HandlerC2312e handlerC2312e = new HandlerC2312e(this);
        this.f9087a = handlerC2312e;
        this.f9088b = new Messenger(handlerC2312e);
        this.f9089c = new HandlerC2311d();
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9092f = new C2309b(this);
        } else {
            this.f9092f = new C2310c(this);
        }
        this.f9090d = this.f9092f.mo8040n();
    }

    /* renamed from: a */
    public static Bundle m8019a(C2317e c2317e, int i) {
        if (c2317e == null) {
            return null;
        }
        C2317e.a aVar = new C2317e.a(c2317e);
        aVar.m8217d(null);
        if (i < 4) {
            aVar.m8218e(false);
        }
        for (C2315c c2315c : c2317e.m8211c()) {
            if (i >= c2315c.m8149o() && i <= c2315c.m8148n()) {
                aVar.m8214a(c2315c);
            }
        }
        return aVar.m8216c().m8210a();
    }

    /* renamed from: c */
    public static String m8020c(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    /* renamed from: f */
    public static void m8021f(Messenger messenger, int i) throws RemoteException {
        if (i != 0) {
            m8023h(messenger, 0, i, 0, null, null);
        }
    }

    /* renamed from: g */
    public static void m8022g(Messenger messenger, int i) throws RemoteException {
        if (i != 0) {
            m8023h(messenger, 1, i, 0, null, null);
        }
    }

    /* renamed from: h */
    public static void m8023h(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not send message to ");
            sb.append(m8020c(messenger));
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f9092f.mo8030d(context);
    }

    /* renamed from: b */
    public void m8024b() {
        AbstractC2316d abstractC2316dM8026e;
        if (this.f9091e != null || (abstractC2316dM8026e = m8026e()) == null) {
            return;
        }
        String strM8207b = abstractC2316dM8026e.m8185q().m8207b();
        if (strM8207b.equals(getPackageName())) {
            this.f9091e = abstractC2316dM8026e;
            abstractC2316dM8026e.m8186v(this.f9090d);
            return;
        }
        throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + strM8207b + ".  Service package name: " + getPackageName() + ".");
    }

    /* renamed from: d */
    public AbstractC2316d m8025d() {
        return this.f9091e;
    }

    /* renamed from: e */
    public abstract AbstractC2316d m8026e();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f9092f.mo8028b(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        AbstractC2316d abstractC2316d = this.f9091e;
        if (abstractC2316d != null) {
            abstractC2316d.m8186v(null);
        }
        super.onDestroy();
    }
}
