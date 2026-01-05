package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.MediaRouter2$TransferCallback;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.C2315c;
import androidx.mediarouter.media.C2317e;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.b5b;
import p001o.bae;
import p001o.e7b;
import p001o.rb5;

/* renamed from: androidx.mediarouter.media.a */
/* loaded from: classes2.dex */
public class C2313a extends AbstractC2316d {

    /* renamed from: Z */
    public static final boolean f9124Z = Log.isLoggable("MR2Provider", 3);

    /* renamed from: H */
    public final MediaRouter2$TransferCallback f9125H;

    /* renamed from: L */
    public final MediaRouter2$ControllerCallback f9126L;

    /* renamed from: M */
    public final Handler f9127M;

    /* renamed from: Q */
    public final Executor f9128Q;

    /* renamed from: X */
    public List f9129X;

    /* renamed from: Y */
    public Map f9130Y;

    /* renamed from: q */
    public final MediaRouter2 f9131q;

    /* renamed from: s */
    public final a f9132s;

    /* renamed from: x */
    public final Map f9133x;

    /* renamed from: y */
    public final MediaRouter2$RouteCallback f9134y;

    /* renamed from: androidx.mediarouter.media.a$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo8090a(AbstractC2316d.e eVar);

        /* renamed from: b */
        public abstract void mo8091b(int i);

        /* renamed from: c */
        public abstract void mo8092c(String str, int i);
    }

    /* renamed from: androidx.mediarouter.media.a$b */
    public class b extends MediaRouter2$ControllerCallback {
        public b() {
        }

        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            C2313a.this.m8083D(routingController);
        }
    }

    /* renamed from: androidx.mediarouter.media.a$c */
    public class c extends AbstractC2316d.b {

        /* renamed from: f */
        public final String f9136f;

        /* renamed from: g */
        public final MediaRouter2.RoutingController f9137g;

        /* renamed from: h */
        public final Messenger f9138h;

        /* renamed from: i */
        public final Messenger f9139i;

        /* renamed from: k */
        public final Handler f9141k;

        /* renamed from: o */
        public C2315c f9145o;

        /* renamed from: j */
        public final SparseArray f9140j = new SparseArray();

        /* renamed from: l */
        public AtomicInteger f9142l = new AtomicInteger(1);

        /* renamed from: m */
        public final Runnable f9143m = new Runnable() { // from class: o.a6b
            @Override // java.lang.Runnable
            public final void run() {
                this.f14204a.m8094t();
            }
        };

        /* renamed from: n */
        public int f9144n = -1;

        /* renamed from: androidx.mediarouter.media.a$c$a */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                int i2 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                C2319g.c cVar = (C2319g.c) c.this.f9140j.get(i2);
                if (cVar == null) {
                    return;
                }
                c.this.f9140j.remove(i2);
                if (i == 3) {
                    cVar.mo8070b((Bundle) obj);
                } else {
                    if (i != 4) {
                        return;
                    }
                    cVar.mo8069a(bundlePeekData == null ? null : bundlePeekData.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR), (Bundle) obj);
                }
            }
        }

        public c(MediaRouter2.RoutingController routingController, String str) {
            this.f9137g = routingController;
            this.f9136f = str;
            Messenger messengerM8080z = C2313a.m8080z(routingController);
            this.f9138h = messengerM8080z;
            this.f9139i = messengerM8080z == null ? null : new Messenger(new a());
            this.f9141k = new Handler(Looper.getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m8094t() {
            this.f9144n = -1;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: d */
        public boolean mo8095d(Intent intent, C2319g.c cVar) throws RemoteException {
            MediaRouter2.RoutingController routingController = this.f9137g;
            if (routingController != null && !routingController.isReleased() && this.f9138h != null) {
                int andIncrement = this.f9142l.getAndIncrement();
                Message messageObtain = Message.obtain();
                messageObtain.what = 9;
                messageObtain.arg1 = andIncrement;
                messageObtain.obj = intent;
                messageObtain.replyTo = this.f9139i;
                try {
                    this.f9138h.send(messageObtain);
                    if (cVar == null) {
                        return true;
                    }
                    this.f9140j.put(andIncrement, cVar);
                    return true;
                } catch (DeadObjectException | RemoteException unused) {
                }
            }
            return false;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: e */
        public void mo8096e() {
            this.f9137g.release();
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: g */
        public void mo8097g(int i) {
            MediaRouter2.RoutingController routingController = this.f9137g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i);
            this.f9144n = i;
            m8103u();
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: j */
        public void mo8098j(int i) {
            MediaRouter2.RoutingController routingController = this.f9137g;
            if (routingController == null) {
                return;
            }
            int volume = this.f9144n;
            if (volume < 0) {
                volume = routingController.getVolume();
            }
            int iMax = Math.max(0, Math.min(volume + i, this.f9137g.getVolumeMax()));
            this.f9144n = iMax;
            this.f9137g.setVolume(iMax);
            m8103u();
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: n */
        public void mo8099n(String str) {
            if (str == null || str.isEmpty()) {
                return;
            }
            MediaRoute2Info mediaRoute2InfoM8081A = C2313a.this.m8081A(str);
            if (mediaRoute2InfoM8081A != null) {
                this.f9137g.selectRoute(mediaRoute2InfoM8081A);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onAddMemberRoute: Specified route not found. routeId=");
            sb.append(str);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: o */
        public void mo8100o(String str) {
            if (str == null || str.isEmpty()) {
                return;
            }
            MediaRoute2Info mediaRoute2InfoM8081A = C2313a.this.m8081A(str);
            if (mediaRoute2InfoM8081A != null) {
                this.f9137g.deselectRoute(mediaRoute2InfoM8081A);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRemoveMemberRoute: Specified route not found. routeId=");
            sb.append(str);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: p */
        public void mo8101p(List list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            String str = (String) list.get(0);
            MediaRoute2Info mediaRoute2InfoM8081A = C2313a.this.m8081A(str);
            if (mediaRoute2InfoM8081A != null) {
                C2313a.this.f9131q.transferTo(mediaRoute2InfoM8081A);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onUpdateMemberRoutes: Specified route not found. routeId=");
            sb.append(str);
        }

        /* renamed from: s */
        public String m8102s() {
            C2315c c2315c = this.f9145o;
            return c2315c != null ? c2315c.m8147m() : this.f9137g.getId();
        }

        /* renamed from: u */
        public final void m8103u() {
            this.f9141k.removeCallbacks(this.f9143m);
            this.f9141k.postDelayed(this.f9143m, 1000L);
        }

        /* renamed from: v */
        public void m8104v(C2315c c2315c) {
            this.f9145o = c2315c;
        }

        /* renamed from: w */
        public void m8105w(String str, int i) throws RemoteException {
            MediaRouter2.RoutingController routingController = this.f9137g;
            if (routingController == null || routingController.isReleased() || this.f9138h == null) {
                return;
            }
            int andIncrement = this.f9142l.getAndIncrement();
            Message messageObtain = Message.obtain();
            messageObtain.what = 7;
            messageObtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f9139i;
            try {
                this.f9138h.send(messageObtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }

        /* renamed from: x */
        public void m8106x(String str, int i) throws RemoteException {
            MediaRouter2.RoutingController routingController = this.f9137g;
            if (routingController == null || routingController.isReleased() || this.f9138h == null) {
                return;
            }
            int andIncrement = this.f9142l.getAndIncrement();
            Message messageObtain = Message.obtain();
            messageObtain.what = 8;
            messageObtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f9139i;
            try {
                this.f9138h.send(messageObtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.a$d */
    public class d extends AbstractC2316d.e {

        /* renamed from: a */
        public final String f9148a;

        /* renamed from: b */
        public final c f9149b;

        public d(String str, c cVar) {
            this.f9148a = str;
            this.f9149b = cVar;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: g */
        public void mo8097g(int i) throws RemoteException {
            c cVar;
            String str = this.f9148a;
            if (str == null || (cVar = this.f9149b) == null) {
                return;
            }
            cVar.m8105w(str, i);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: j */
        public void mo8098j(int i) throws RemoteException {
            c cVar;
            String str = this.f9148a;
            if (str == null || (cVar = this.f9149b) == null) {
                return;
            }
            cVar.m8106x(str, i);
        }
    }

    /* renamed from: androidx.mediarouter.media.a$e */
    public class e extends MediaRouter2$RouteCallback {
        public e() {
        }

        public void onRoutesAdded(List list) {
            C2313a.this.m8082C();
        }

        public void onRoutesChanged(List list) {
            C2313a.this.m8082C();
        }

        public void onRoutesRemoved(List list) {
            C2313a.this.m8082C();
        }
    }

    /* renamed from: androidx.mediarouter.media.a$f */
    public class f extends MediaRouter2$TransferCallback {
        public f() {
        }

        public void onStop(MediaRouter2.RoutingController routingController) {
            AbstractC2316d.e eVar = (AbstractC2316d.e) C2313a.this.f9133x.remove(routingController);
            if (eVar != null) {
                C2313a.this.f9132s.mo8090a(eVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onStop: No matching routeController found. routingController=");
            sb.append(routingController);
        }

        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            C2313a.this.f9133x.remove(routingController);
            if (routingController2 == C2313a.this.f9131q.getSystemController()) {
                C2313a.this.f9132s.mo8091b(3);
                return;
            }
            List selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                return;
            }
            String id = b5b.m18167a(selectedRoutes.get(0)).getId();
            C2313a.this.f9133x.put(routingController2, C2313a.this.new c(routingController2, id));
            C2313a.this.f9132s.mo8092c(id, 3);
            C2313a.this.m8083D(routingController2);
        }

        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            StringBuilder sb = new StringBuilder();
            sb.append("Transfer failed. requestedRoute=");
            sb.append(mediaRoute2Info);
        }
    }

    public C2313a(Context context, a aVar) {
        super(context);
        this.f9133x = new ArrayMap();
        this.f9134y = new e();
        this.f9125H = new f();
        this.f9126L = new b();
        this.f9129X = new ArrayList();
        this.f9130Y = new ArrayMap();
        this.f9131q = MediaRouter2.getInstance(context);
        this.f9132s = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f9127M = handler;
        Objects.requireNonNull(handler);
        this.f9128Q = new rb5(handler);
    }

    /* renamed from: B */
    public static String m8079B(AbstractC2316d.e eVar) {
        MediaRouter2.RoutingController routingController;
        if ((eVar instanceof c) && (routingController = ((c) eVar).f9137g) != null) {
            return routingController.getId();
        }
        return null;
    }

    /* renamed from: z */
    public static Messenger m8080z(MediaRouter2.RoutingController routingController) {
        Bundle controlHints;
        if (routingController == null || (controlHints = routingController.getControlHints()) == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    /* renamed from: A */
    public MediaRoute2Info m8081A(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.f9129X.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM18167a = b5b.m18167a(it.next());
            if (TextUtils.equals(mediaRoute2InfoM18167a.getId(), str)) {
                return mediaRoute2InfoM18167a;
            }
        }
        return null;
    }

    /* renamed from: C */
    public void m8082C() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.f9131q.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM18167a = b5b.m18167a(it.next());
            if (mediaRoute2InfoM18167a != null && !arraySet.contains(mediaRoute2InfoM18167a) && !mediaRoute2InfoM18167a.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoM18167a);
                arrayList.add(mediaRoute2InfoM18167a);
            }
        }
        if (arrayList.equals(this.f9129X)) {
            return;
        }
        this.f9129X = arrayList;
        this.f9130Y.clear();
        Iterator it2 = this.f9129X.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM18167a2 = b5b.m18167a(it2.next());
            Bundle extras = mediaRoute2InfoM18167a2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find the original route Id. route=");
                sb.append(mediaRoute2InfoM18167a2);
            } else {
                this.f9130Y.put(mediaRoute2InfoM18167a2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.f9129X.iterator();
        while (it3.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM18167a3 = b5b.m18167a(it3.next());
            C2315c c2315cM8382f = AbstractC2320h.m8382f(mediaRoute2InfoM18167a3);
            if (mediaRoute2InfoM18167a3 != null) {
                arrayList2.add(c2315cM8382f);
            }
        }
        m8187w(new C2317e.a().m8218e(true).m8215b(arrayList2).m8216c());
    }

    /* renamed from: D */
    public void m8083D(MediaRouter2.RoutingController routingController) {
        c cVar = (c) this.f9133x.get(routingController);
        if (cVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setDynamicRouteDescriptors: No matching routeController found. routingController=");
            sb.append(routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=");
            sb2.append(routingController);
            return;
        }
        List listM8377a = AbstractC2320h.m8377a(selectedRoutes);
        C2315c c2315cM8382f = AbstractC2320h.m8382f(b5b.m18167a(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = m8182n().getString(bae.mr_dialog_default_group_name);
        C2315c c2315cM8135e = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c2315cM8135e = C2315c.m8135e(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (c2315cM8135e == null) {
            c2315cM8135e = new C2315c.a(routingController.getId(), string).m8166g(2).m8175p(1).m8177r(routingController.getVolume()).m8179t(routingController.getVolumeMax()).m8178s(routingController.getVolumeHandling()).m8161b(c2315cM8382f.m8141g()).m8163d(listM8377a).m8164e();
        }
        List listM8377a2 = AbstractC2320h.m8377a(routingController.getSelectableRoutes());
        List listM8377a3 = AbstractC2320h.m8377a(routingController.getDeselectableRoutes());
        C2317e c2317eM8183o = m8183o();
        if (c2317eM8183o == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C2315c> listM8211c = c2317eM8183o.m8211c();
        if (!listM8211c.isEmpty()) {
            for (C2315c c2315c : listM8211c) {
                String strM8147m = c2315c.m8147m();
                arrayList.add(new AbstractC2316d.b.c.a(c2315c).m8205e(listM8377a.contains(strM8147m) ? 3 : 1).m8202b(listM8377a2.contains(strM8147m)).m8204d(listM8377a3.contains(strM8147m)).m8203c(true).m8201a());
            }
        }
        cVar.m8104v(c2315cM8135e);
        cVar.m8192m(c2315cM8135e, arrayList);
    }

    /* renamed from: E */
    public void m8084E(String str) {
        MediaRoute2Info mediaRoute2InfoM8081A = m8081A(str);
        if (mediaRoute2InfoM8081A != null) {
            this.f9131q.transferTo(mediaRoute2InfoM8081A);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("transferTo: Specified route not found. routeId=");
        sb.append(str);
    }

    /* renamed from: F */
    public final e7b m8085F(e7b e7bVar, boolean z) {
        if (e7bVar == null) {
            e7bVar = new e7b(C2318f.f9224c, false);
        }
        List listM8223e = e7bVar.m24485d().m8223e();
        if (!z) {
            listM8223e.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!listM8223e.contains("android.media.intent.category.LIVE_AUDIO")) {
            listM8223e.add("android.media.intent.category.LIVE_AUDIO");
        }
        return new e7b(new C2318f.a().m8227a(listM8223e).m8230d(), e7bVar.m24486e());
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: r */
    public AbstractC2316d.b mo8086r(String str) {
        Iterator it = this.f9133x.entrySet().iterator();
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, cVar.f9136f)) {
                return cVar;
            }
        }
        return null;
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: s */
    public AbstractC2316d.e mo8087s(String str) {
        return new d((String) this.f9130Y.get(str), null);
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: t */
    public AbstractC2316d.e mo8088t(String str, String str2) {
        String str3 = (String) this.f9130Y.get(str);
        for (c cVar : this.f9133x.values()) {
            if (TextUtils.equals(str2, cVar.m8102s())) {
                return new d(str3, cVar);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find the matching GroupRouteController. routeId=");
        sb.append(str);
        sb.append(", routeGroupId=");
        sb.append(str2);
        return new d(str3, null);
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: u */
    public void mo8089u(e7b e7bVar) {
        if (C2319g.m8232h() <= 0) {
            this.f9131q.unregisterRouteCallback(this.f9134y);
            this.f9131q.unregisterTransferCallback(this.f9125H);
            this.f9131q.unregisterControllerCallback(this.f9126L);
        } else {
            this.f9131q.registerRouteCallback(this.f9128Q, this.f9134y, AbstractC2320h.m8379c(m8085F(e7bVar, C2319g.m8237r())));
            this.f9131q.registerTransferCallback(this.f9128Q, this.f9125H);
            this.f9131q.registerControllerCallback(this.f9128Q, this.f9126L);
        }
    }
}
