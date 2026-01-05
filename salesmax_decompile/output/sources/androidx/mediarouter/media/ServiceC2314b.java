package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.C2319g;
import androidx.mediarouter.media.MediaRouteProviderService;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p001o.c6b;
import p001o.m6b;
import p001o.vo0;

/* renamed from: androidx.mediarouter.media.b */
/* loaded from: classes2.dex */
public class ServiceC2314b extends MediaRoute2ProviderService {

    /* renamed from: f */
    public static final boolean f9153f = Log.isLoggable("MR2ProviderService", 3);

    /* renamed from: b */
    public final MediaRouteProviderService.C2309b f9155b;

    /* renamed from: e */
    public volatile C2317e f9158e;

    /* renamed from: a */
    public final Object f9154a = new Object();

    /* renamed from: c */
    public final Map f9156c = new vo0();

    /* renamed from: d */
    public final SparseArray f9157d = new SparseArray();

    /* renamed from: androidx.mediarouter.media.b$a */
    public class a extends C2319g.c {

        /* renamed from: a */
        public final /* synthetic */ String f9159a;

        /* renamed from: b */
        public final /* synthetic */ Intent f9160b;

        /* renamed from: c */
        public final /* synthetic */ Messenger f9161c;

        /* renamed from: d */
        public final /* synthetic */ int f9162d;

        public a(String str, Intent intent, Messenger messenger, int i) {
            this.f9159a = str;
            this.f9160b = intent;
            this.f9161c = messenger;
            this.f9162d = i;
        }

        @Override // androidx.mediarouter.media.C2319g.c
        /* renamed from: a */
        public void mo8069a(String str, Bundle bundle) throws RemoteException {
            if (ServiceC2314b.f9153f) {
                StringBuilder sb = new StringBuilder();
                sb.append("Route control request failed, sessionId=");
                sb.append(this.f9159a);
                sb.append(", intent=");
                sb.append(this.f9160b);
                sb.append(", error=");
                sb.append(str);
                sb.append(", data=");
                sb.append(bundle);
            }
            if (str == null) {
                m8121c(this.f9161c, 4, this.f9162d, 0, bundle, null);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            m8121c(this.f9161c, 4, this.f9162d, 0, bundle, bundle2);
        }

        @Override // androidx.mediarouter.media.C2319g.c
        /* renamed from: b */
        public void mo8070b(Bundle bundle) throws RemoteException {
            if (ServiceC2314b.f9153f) {
                StringBuilder sb = new StringBuilder();
                sb.append("Route control request succeeded, sessionId=");
                sb.append(this.f9159a);
                sb.append(", intent=");
                sb.append(this.f9160b);
                sb.append(", data=");
                sb.append(bundle);
            }
            m8121c(this.f9161c, 3, this.f9162d, 0, bundle, null);
        }

        /* renamed from: c */
        public void m8121c(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i3;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            try {
                messenger.send(messageObtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.b$b */
    public static class b extends AbstractC2316d.b {

        /* renamed from: f */
        public final String f9164f;

        /* renamed from: g */
        public final AbstractC2316d.e f9165g;

        public b(String str, AbstractC2316d.e eVar) {
            this.f9164f = str;
            this.f9165g = eVar;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: d */
        public boolean mo8095d(Intent intent, C2319g.c cVar) {
            return this.f9165g.mo8095d(intent, cVar);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: e */
        public void mo8096e() {
            this.f9165g.mo8096e();
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: f */
        public void mo8122f() {
            this.f9165g.mo8122f();
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: g */
        public void mo8097g(int i) {
            this.f9165g.mo8097g(i);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: i */
        public void mo8123i(int i) {
            this.f9165g.mo8123i(i);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: j */
        public void mo8098j(int i) {
            this.f9165g.mo8098j(i);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: n */
        public void mo8099n(String str) {
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: o */
        public void mo8100o(String str) {
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: p */
        public void mo8101p(List list) {
        }

        /* renamed from: r */
        public String m8124r() {
            return this.f9164f;
        }
    }

    /* renamed from: androidx.mediarouter.media.b$c */
    public static class c extends Handler {

        /* renamed from: a */
        public final ServiceC2314b f9166a;

        /* renamed from: b */
        public final String f9167b;

        public c(ServiceC2314b serviceC2314b, String str) {
            super(Looper.myLooper());
            this.f9166a = serviceC2314b;
            this.f9167b = str;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            int i = message.what;
            int i2 = message.arg1;
            Object obj = message.obj;
            Bundle data = message.getData();
            if (i == 7) {
                int i3 = data.getInt("volume", -1);
                String string = data.getString("routeId");
                if (i3 < 0 || string == null) {
                    return;
                }
                this.f9166a.m8118l(string, i3);
                return;
            }
            if (i != 8) {
                if (i == 9 && (obj instanceof Intent)) {
                    this.f9166a.m8115i(messenger, i2, this.f9167b, (Intent) obj);
                    return;
                }
                return;
            }
            int i4 = data.getInt("volume", 0);
            String string2 = data.getString("routeId");
            if (i4 == 0 || string2 == null) {
                return;
            }
            this.f9166a.m8119m(string2, i4);
        }
    }

    /* renamed from: androidx.mediarouter.media.b$d */
    public final class d {

        /* renamed from: a */
        public final Map f9168a;

        /* renamed from: b */
        public final AbstractC2316d.b f9169b;

        /* renamed from: c */
        public final long f9170c;

        /* renamed from: d */
        public final int f9171d;

        /* renamed from: e */
        public final WeakReference f9172e;

        /* renamed from: f */
        public boolean f9173f;

        /* renamed from: g */
        public boolean f9174g;

        /* renamed from: h */
        public RoutingSessionInfo f9175h;

        /* renamed from: i */
        public String f9176i;

        /* renamed from: j */
        public String f9177j;

        public d(ServiceC2314b serviceC2314b, AbstractC2316d.b bVar, long j, int i) {
            this(bVar, j, i, null);
        }

        /* renamed from: a */
        public AbstractC2316d.e m8125a(String str) {
            MediaRouteProviderService.C2309b.a aVar = (MediaRouteProviderService.C2309b.a) this.f9172e.get();
            return aVar != null ? aVar.m8060n(str) : (AbstractC2316d.e) this.f9168a.get(str);
        }

        /* renamed from: b */
        public int m8126b() {
            return this.f9171d;
        }

        /* renamed from: c */
        public AbstractC2316d.b m8127c() {
            return this.f9169b;
        }

        /* renamed from: d */
        public final AbstractC2316d.e m8128d(String str, String str2) {
            AbstractC2316d.e eVar = (AbstractC2316d.e) this.f9168a.get(str);
            if (eVar != null) {
                return eVar;
            }
            AbstractC2316d.e eVarMo8087s = str2 == null ? ServiceC2314b.this.m8111e().mo8087s(str) : ServiceC2314b.this.m8111e().mo8088t(str, str2);
            if (eVarMo8087s != null) {
                this.f9168a.put(str, eVarMo8087s);
            }
            return eVarMo8087s;
        }

        /* renamed from: e */
        public final void m8129e() {
            if (this.f9173f) {
                return;
            }
            this.f9173f = true;
            ServiceC2314b.this.notifySessionCreated(this.f9170c, this.f9175h);
        }

        /* renamed from: f */
        public void m8130f(boolean z) throws RemoteException {
            MediaRouteProviderService.C2309b.a aVar;
            if (this.f9174g) {
                return;
            }
            if ((this.f9171d & 3) == 3) {
                m8133i(null, this.f9175h, null);
            }
            if (z) {
                this.f9169b.mo8123i(2);
                this.f9169b.mo8096e();
                if ((this.f9171d & 1) == 0 && (aVar = (MediaRouteProviderService.C2309b.a) this.f9172e.get()) != null) {
                    AbstractC2316d.e eVar = this.f9169b;
                    if (eVar instanceof b) {
                        eVar = ((b) eVar).f9165g;
                    }
                    aVar.m8062q(eVar, this.f9177j);
                }
            }
            this.f9174g = true;
            ServiceC2314b.this.notifySessionReleased(this.f9176i);
        }

        /* renamed from: g */
        public final boolean m8131g(String str) {
            AbstractC2316d.e eVar = (AbstractC2316d.e) this.f9168a.remove(str);
            if (eVar == null) {
                return false;
            }
            eVar.mo8123i(0);
            eVar.mo8096e();
            return true;
        }

        /* renamed from: h */
        public void m8132h(RoutingSessionInfo routingSessionInfo) {
            if (this.f9175h != null) {
                return;
            }
            Messenger messenger = new Messenger(new c(ServiceC2314b.this, this.f9176i));
            RoutingSessionInfo.Builder builderM38410a = m6b.m38410a(routingSessionInfo);
            Bundle bundle = new Bundle();
            bundle.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", messenger);
            bundle.putString("androidx.mediarouter.media.KEY_SESSION_NAME", routingSessionInfo.getName() != null ? routingSessionInfo.getName().toString() : null);
            this.f9175h = builderM38410a.setControlHints(bundle).build();
        }

        /* renamed from: i */
        public void m8133i(String str, RoutingSessionInfo routingSessionInfo, RoutingSessionInfo routingSessionInfo2) {
            List<String> listEmptyList = routingSessionInfo == null ? Collections.emptyList() : routingSessionInfo.getSelectedRoutes();
            List<String> listEmptyList2 = routingSessionInfo2 == null ? Collections.emptyList() : routingSessionInfo2.getSelectedRoutes();
            for (String str2 : listEmptyList2) {
                if (m8125a(str2) == null) {
                    m8128d(str2, str).mo8122f();
                }
            }
            for (String str3 : listEmptyList) {
                if (!listEmptyList2.contains(str3)) {
                    m8131g(str3);
                }
            }
        }

        /* renamed from: j */
        public void m8134j(C2315c c2315c, Collection collection) throws RemoteException {
            RoutingSessionInfo routingSessionInfo = this.f9175h;
            if (routingSessionInfo == null) {
                return;
            }
            if (c2315c != null && !c2315c.m8158x()) {
                ServiceC2314b.this.onReleaseSession(0L, this.f9176i);
                return;
            }
            RoutingSessionInfo.Builder builderM38410a = m6b.m38410a(routingSessionInfo);
            if (c2315c != null) {
                this.f9177j = c2315c.m8147m();
                builderM38410a.setName(c2315c.m8150p()).setVolume(c2315c.m8155u()).setVolumeMax(c2315c.m8157w()).setVolumeHandling(c2315c.m8156v());
                builderM38410a.clearSelectedRoutes();
                if (c2315c.m8145k().isEmpty()) {
                    builderM38410a.addSelectedRoute(this.f9177j);
                } else {
                    Iterator it = c2315c.m8145k().iterator();
                    while (it.hasNext()) {
                        builderM38410a.addSelectedRoute((String) it.next());
                    }
                }
                Bundle controlHints = routingSessionInfo.getControlHints();
                if (controlHints == null) {
                    controlHints = new Bundle();
                }
                controlHints.putString("androidx.mediarouter.media.KEY_SESSION_NAME", c2315c.m8150p());
                controlHints.putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", c2315c.m8136a());
                builderM38410a.setControlHints(controlHints);
            }
            this.f9175h = builderM38410a.build();
            if (collection != null && !collection.isEmpty()) {
                builderM38410a.clearSelectedRoutes();
                builderM38410a.clearSelectableRoutes();
                builderM38410a.clearDeselectableRoutes();
                builderM38410a.clearTransferableRoutes();
                Iterator it2 = collection.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    AbstractC2316d.b.c cVar = (AbstractC2316d.b.c) it2.next();
                    String strM8147m = cVar.m8195b().m8147m();
                    int i = cVar.f9207b;
                    if (i == 2 || i == 3) {
                        builderM38410a.addSelectedRoute(strM8147m);
                        z = true;
                    }
                    if (cVar.m8197d()) {
                        builderM38410a.addSelectableRoute(strM8147m);
                    }
                    if (cVar.m8199f()) {
                        builderM38410a.addDeselectableRoute(strM8147m);
                    }
                    if (cVar.m8198e()) {
                        builderM38410a.addTransferableRoute(strM8147m);
                    }
                }
                if (z) {
                    this.f9175h = builderM38410a.build();
                }
            }
            if (ServiceC2314b.f9153f) {
                StringBuilder sb = new StringBuilder();
                sb.append("updateSessionInfo: groupRoute=");
                sb.append(c2315c);
                sb.append(", sessionInfo=");
                sb.append(this.f9175h);
            }
            if ((this.f9171d & 5) == 5 && c2315c != null) {
                m8133i(c2315c.m8147m(), routingSessionInfo, this.f9175h);
            }
            if (this.f9173f) {
                ServiceC2314b.this.notifySessionUpdated(this.f9175h);
            } else {
                m8129e();
            }
        }

        public d(AbstractC2316d.b bVar, long j, int i, MediaRouteProviderService.C2309b.a aVar) {
            this.f9168a = new vo0();
            this.f9173f = false;
            this.f9169b = bVar;
            this.f9170c = j;
            this.f9171d = i;
            this.f9172e = new WeakReference(aVar);
        }
    }

    public ServiceC2314b(MediaRouteProviderService.C2309b c2309b) {
        this.f9155b = c2309b;
    }

    /* renamed from: a */
    public final String m8107a(d dVar) {
        String string;
        synchronized (this.f9154a) {
            do {
                string = UUID.randomUUID().toString();
            } while (this.f9156c.containsKey(string));
            dVar.f9176i = string;
            this.f9156c.put(string, dVar);
        }
        return string;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final AbstractC2316d.e m8108b(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f9154a) {
            arrayList.addAll(this.f9156c.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2316d.e eVarM8125a = ((d) it.next()).m8125a(str);
            if (eVarM8125a != null) {
                return eVarM8125a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final AbstractC2316d.b m8109c(String str) {
        AbstractC2316d.b bVarM8127c;
        synchronized (this.f9154a) {
            d dVar = (d) this.f9156c.get(str);
            bVarM8127c = dVar == null ? null : dVar.m8127c();
        }
        return bVarM8127c;
    }

    /* renamed from: d */
    public final d m8110d(AbstractC2316d.b bVar) {
        synchronized (this.f9154a) {
            Iterator it = this.f9156c.entrySet().iterator();
            while (it.hasNext()) {
                d dVar = (d) ((Map.Entry) it.next()).getValue();
                if (dVar.m8127c() == bVar) {
                    return dVar;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    public AbstractC2316d m8111e() {
        MediaRouteProviderService mediaRouteProviderServiceM8066v = this.f9155b.m8066v();
        if (mediaRouteProviderServiceM8066v == null) {
            return null;
        }
        return mediaRouteProviderServiceM8066v.m8025d();
    }

    /* renamed from: f */
    public final C2315c m8112f(String str, String str2) {
        if (m8111e() == null || this.f9158e == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(": no provider info");
            return null;
        }
        for (C2315c c2315c : this.f9158e.m8211c()) {
            if (TextUtils.equals(c2315c.m8147m(), str)) {
                return c2315c;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(": Couldn't find a route : ");
        sb2.append(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.mediarouter.media.d$b] */
    /* renamed from: g */
    public void m8113g(MediaRouteProviderService.C2309b.a aVar, AbstractC2316d.e eVar, int i, String str, String str2) {
        int i2;
        b bVar;
        C2315c c2315cM8112f = m8112f(str2, "notifyRouteControllerAdded");
        if (c2315cM8112f == null) {
            return;
        }
        if (eVar instanceof AbstractC2316d.b) {
            bVar = (AbstractC2316d.b) eVar;
            i2 = 6;
        } else {
            i2 = !c2315cM8112f.m8145k().isEmpty() ? 2 : 0;
            bVar = new b(str2, eVar);
        }
        d dVar = new d(bVar, 0L, i2, aVar);
        dVar.f9177j = str2;
        String strM8107a = m8107a(dVar);
        this.f9157d.put(i, strM8107a);
        RoutingSessionInfo.Builder volumeMax = c6b.m20344a(strM8107a, str).setName(c2315cM8112f.m8150p()).setVolumeHandling(c2315cM8112f.m8156v()).setVolume(c2315cM8112f.m8155u()).setVolumeMax(c2315cM8112f.m8157w());
        if (c2315cM8112f.m8145k().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator it = c2315cM8112f.m8145k().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute((String) it.next());
            }
        }
        dVar.m8132h(volumeMax.build());
    }

    /* renamed from: h */
    public void m8114h(int i) {
        d dVar;
        String str = (String) this.f9157d.get(i);
        if (str == null) {
            return;
        }
        this.f9157d.remove(i);
        synchronized (this.f9154a) {
            dVar = (d) this.f9156c.remove(str);
        }
        if (dVar != null) {
            dVar.m8130f(false);
        }
    }

    /* renamed from: i */
    public void m8115i(Messenger messenger, int i, String str, Intent intent) {
        if (getSessionInfo(str) == null) {
            return;
        }
        AbstractC2316d.b bVarM8109c = m8109c(str);
        if (bVarM8109c == null) {
            notifyRequestFailed(i, 3);
        } else {
            bVarM8109c.mo8095d(intent, new a(str, intent, messenger, i));
        }
    }

    /* renamed from: j */
    public void m8116j(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) {
        d dVarM8110d = m8110d(bVar);
        if (dVarM8110d == null) {
            return;
        }
        dVarM8110d.m8134j(c2315c, collection);
    }

    /* renamed from: k */
    public void m8117k(C2317e c2317e) {
        this.f9158e = c2317e;
        List<C2315c> listEmptyList = c2317e == null ? Collections.emptyList() : c2317e.m8211c();
        vo0 vo0Var = new vo0();
        for (C2315c c2315c : listEmptyList) {
            if (c2315c != null) {
                vo0Var.put(c2315c.m8147m(), c2315c);
            }
        }
        m8120n(vo0Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = vo0Var.values().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM8381e = AbstractC2320h.m8381e((C2315c) it.next());
            if (mediaRoute2InfoM8381e != null) {
                arrayList.add(mediaRoute2InfoM8381e);
            }
        }
        notifyRoutes(arrayList);
    }

    /* renamed from: l */
    public void m8118l(String str, int i) {
        AbstractC2316d.e eVarM8108b = m8108b(str);
        if (eVarM8108b != null) {
            eVarM8108b.mo8097g(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setRouteVolume: Couldn't find a controller for routeId=");
        sb.append(str);
    }

    /* renamed from: m */
    public void m8119m(String str, int i) {
        AbstractC2316d.e eVarM8108b = m8108b(str);
        if (eVarM8108b != null) {
            eVarM8108b.mo8098j(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateRouteVolume: Couldn't find a controller for routeId=");
        sb.append(str);
    }

    /* renamed from: n */
    public void m8120n(Map map) throws RemoteException {
        ArrayList<d> arrayList = new ArrayList();
        synchronized (this.f9154a) {
            for (d dVar : this.f9156c.values()) {
                if ((dVar.m8126b() & 4) == 0) {
                    arrayList.add(dVar);
                }
            }
        }
        for (d dVar2 : arrayList) {
            b bVar = (b) dVar2.m8127c();
            if (map.containsKey(bVar.m8124r())) {
                dVar2.m8134j((C2315c) map.get(bVar.m8124r()), null);
            }
        }
    }

    public void onCreateSession(long j, String str, String str2, Bundle bundle) {
        int i;
        AbstractC2316d.b bVar;
        AbstractC2316d abstractC2316dM8111e = m8111e();
        C2315c c2315cM8112f = m8112f(str2, "onCreateSession");
        if (c2315cM8112f == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        if (this.f9158e.m8213e()) {
            bVar = abstractC2316dM8111e.mo8086r(str2);
            if (bVar == null) {
                notifyRequestFailed(j, 1);
                return;
            }
            i = 7;
        } else {
            AbstractC2316d.e eVarMo8087s = abstractC2316dM8111e.mo8087s(str2);
            if (eVarMo8087s == null) {
                notifyRequestFailed(j, 1);
                return;
            } else {
                i = c2315cM8112f.m8145k().isEmpty() ? 1 : 3;
                bVar = new b(str2, eVarMo8087s);
            }
        }
        bVar.mo8122f();
        d dVar = new d(this, bVar, j, i);
        RoutingSessionInfo.Builder volumeMax = c6b.m20344a(m8107a(dVar), str).setName(c2315cM8112f.m8150p()).setVolumeHandling(c2315cM8112f.m8156v()).setVolume(c2315cM8112f.m8155u()).setVolumeMax(c2315cM8112f.m8157w());
        if (c2315cM8112f.m8145k().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator it = c2315cM8112f.m8145k().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute((String) it.next());
            }
        }
        RoutingSessionInfo routingSessionInfoBuild = volumeMax.build();
        dVar.m8132h(routingSessionInfoBuild);
        if ((i & 6) == 2) {
            dVar.m8133i(str2, null, routingSessionInfoBuild);
        }
        this.f9155b.m8047B(bVar);
    }

    public void onDeselectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (m8112f(str2, "onDeselectRoute") == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        AbstractC2316d.b bVarM8109c = m8109c(str);
        if (bVarM8109c == null) {
            notifyRequestFailed(j, 3);
        } else {
            bVarM8109c.mo8100o(str2);
        }
    }

    public void onDiscoveryPreferenceChanged(RouteDiscoveryPreference routeDiscoveryPreference) {
        this.f9155b.m8067x(AbstractC2320h.m8383g(routeDiscoveryPreference));
    }

    public void onReleaseSession(long j, String str) throws RemoteException {
        d dVar;
        if (getSessionInfo(str) == null) {
            return;
        }
        synchronized (this.f9154a) {
            dVar = (d) this.f9156c.remove(str);
        }
        if (dVar == null) {
            notifyRequestFailed(j, 4);
        } else {
            dVar.m8130f(true);
        }
    }

    public void onSelectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (m8112f(str2, "onSelectRoute") == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        AbstractC2316d.b bVarM8109c = m8109c(str);
        if (bVarM8109c == null) {
            notifyRequestFailed(j, 3);
        } else {
            bVarM8109c.mo8099n(str2);
        }
    }

    public void onSetRouteVolume(long j, String str, int i) {
        AbstractC2316d.e eVarM8108b = m8108b(str);
        if (eVarM8108b != null) {
            eVarM8108b.mo8097g(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onSetRouteVolume: Couldn't find a controller for routeId=");
        sb.append(str);
        notifyRequestFailed(j, 3);
    }

    public void onSetSessionVolume(long j, String str, int i) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        AbstractC2316d.b bVarM8109c = m8109c(str);
        if (bVarM8109c == null) {
            notifyRequestFailed(j, 3);
        } else {
            bVarM8109c.mo8097g(i);
        }
    }

    public void onTransferToRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (m8112f(str2, "onTransferToRoute") == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        AbstractC2316d.b bVarM8109c = m8109c(str);
        if (bVarM8109c == null) {
            notifyRequestFailed(j, 3);
        } else {
            bVarM8109c.mo8101p(Collections.singletonList(str2));
        }
    }
}
