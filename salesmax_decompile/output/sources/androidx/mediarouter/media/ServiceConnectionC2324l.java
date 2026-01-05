package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.C2319g;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.e7b;
import p001o.g7b;

/* renamed from: androidx.mediarouter.media.l */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2324l extends AbstractC2316d implements ServiceConnection {

    /* renamed from: X */
    public static final boolean f9332X = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* renamed from: H */
    public boolean f9333H;

    /* renamed from: L */
    public a f9334L;

    /* renamed from: M */
    public boolean f9335M;

    /* renamed from: Q */
    public b f9336Q;

    /* renamed from: q */
    public final ComponentName f9337q;

    /* renamed from: s */
    public final d f9338s;

    /* renamed from: x */
    public final ArrayList f9339x;

    /* renamed from: y */
    public boolean f9340y;

    /* renamed from: androidx.mediarouter.media.l$a */
    public final class a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final Messenger f9341a;

        /* renamed from: b */
        public final e f9342b;

        /* renamed from: c */
        public final Messenger f9343c;

        /* renamed from: f */
        public int f9346f;

        /* renamed from: g */
        public int f9347g;

        /* renamed from: d */
        public int f9344d = 1;

        /* renamed from: e */
        public int f9345e = 1;

        /* renamed from: h */
        public final SparseArray f9348h = new SparseArray();

        /* renamed from: androidx.mediarouter.media.l$a$a, reason: collision with other inner class name */
        public class RunnableC19570a implements Runnable {
            public RunnableC19570a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.m8459e();
            }
        }

        /* renamed from: androidx.mediarouter.media.l$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() throws RemoteException {
                a aVar = a.this;
                ServiceConnectionC2324l.this.m8442J(aVar);
            }
        }

        public a(Messenger messenger) {
            this.f9341a = messenger;
            e eVar = new e(this);
            this.f9342b = eVar;
            this.f9343c = new Messenger(eVar);
        }

        /* renamed from: a */
        public void m8455a(int i, String str) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            m8474t(12, i2, i, null, bundle);
        }

        /* renamed from: b */
        public int m8456b(String str, C2319g.c cVar) throws RemoteException {
            int i = this.f9345e;
            this.f9345e = i + 1;
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            m8474t(11, i2, i, null, bundle);
            this.f9348h.put(i2, cVar);
            return i;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            ServiceConnectionC2324l.this.f9338s.post(new b());
        }

        /* renamed from: c */
        public int m8457c(String str, String str2) throws RemoteException {
            int i = this.f9345e;
            this.f9345e = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            m8474t(3, i2, i, null, bundle);
            return i;
        }

        /* renamed from: d */
        public void m8458d() throws RemoteException {
            m8474t(2, 0, 0, null, null);
            this.f9342b.m8484a();
            this.f9341a.getBinder().unlinkToDeath(this, 0);
            ServiceConnectionC2324l.this.f9338s.post(new RunnableC19570a());
        }

        /* renamed from: e */
        public void m8459e() {
            int size = this.f9348h.size();
            for (int i = 0; i < size; i++) {
                ((C2319g.c) this.f9348h.valueAt(i)).mo8069a(null, null);
            }
            this.f9348h.clear();
        }

        /* renamed from: f */
        public boolean m8460f(int i, String str, Bundle bundle) {
            C2319g.c cVar = (C2319g.c) this.f9348h.get(i);
            if (cVar == null) {
                return false;
            }
            this.f9348h.remove(i);
            cVar.mo8069a(str, bundle);
            return true;
        }

        /* renamed from: g */
        public boolean m8461g(int i, Bundle bundle) {
            C2319g.c cVar = (C2319g.c) this.f9348h.get(i);
            if (cVar == null) {
                return false;
            }
            this.f9348h.remove(i);
            cVar.mo8070b(bundle);
            return true;
        }

        /* renamed from: h */
        public void m8462h(int i) throws RemoteException {
            ServiceConnectionC2324l.this.m8440H(this, i);
        }

        /* renamed from: i */
        public boolean m8463i(Bundle bundle) {
            if (this.f9346f == 0) {
                return false;
            }
            ServiceConnectionC2324l.this.m8441I(this, C2317e.m8209b(bundle));
            return true;
        }

        /* renamed from: j */
        public void m8464j(int i, Bundle bundle) {
            C2319g.c cVar = (C2319g.c) this.f9348h.get(i);
            if (bundle == null || !bundle.containsKey("routeId")) {
                cVar.mo8069a("DynamicGroupRouteController is created without valid route id.", bundle);
            } else {
                this.f9348h.remove(i);
                cVar.mo8070b(bundle);
            }
        }

        /* renamed from: k */
        public boolean m8465k(int i, Bundle bundle) {
            if (this.f9346f == 0) {
                return false;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable("groupRoute");
            C2315c c2315cM8135e = bundle2 != null ? C2315c.m8135e(bundle2) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2316d.b.c.m8194a((Bundle) it.next()));
            }
            ServiceConnectionC2324l.this.m8446N(this, i, c2315cM8135e, arrayList);
            return true;
        }

        /* renamed from: l */
        public boolean m8466l(int i) throws RemoteException {
            if (i == this.f9347g) {
                this.f9347g = 0;
                ServiceConnectionC2324l.this.m8443K(this, "Registration failed");
            }
            C2319g.c cVar = (C2319g.c) this.f9348h.get(i);
            if (cVar == null) {
                return true;
            }
            this.f9348h.remove(i);
            cVar.mo8069a(null, null);
            return true;
        }

        /* renamed from: m */
        public boolean m8467m(int i) {
            return true;
        }

        /* renamed from: n */
        public boolean m8468n(int i, int i2, Bundle bundle) throws RemoteException {
            if (this.f9346f != 0 || i != this.f9347g || i2 < 1) {
                return false;
            }
            this.f9347g = 0;
            this.f9346f = i2;
            ServiceConnectionC2324l.this.m8441I(this, C2317e.m8209b(bundle));
            ServiceConnectionC2324l.this.m8444L(this);
            return true;
        }

        /* renamed from: o */
        public boolean m8469o() throws RemoteException {
            int i = this.f9344d;
            this.f9344d = i + 1;
            this.f9347g = i;
            if (!m8474t(1, i, 4, null, null)) {
                return false;
            }
            try {
                this.f9341a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        /* renamed from: p */
        public void m8470p(int i) throws RemoteException {
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            m8474t(4, i2, i, null, null);
        }

        /* renamed from: q */
        public void m8471q(int i, String str) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            m8474t(13, i2, i, null, bundle);
        }

        /* renamed from: r */
        public void m8472r(int i) throws RemoteException {
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            m8474t(5, i2, i, null, null);
        }

        /* renamed from: s */
        public boolean m8473s(int i, Intent intent, C2319g.c cVar) {
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            if (!m8474t(9, i2, i, intent, null)) {
                return false;
            }
            if (cVar == null) {
                return true;
            }
            this.f9348h.put(i2, cVar);
            return true;
        }

        /* renamed from: t */
        public final boolean m8474t(int i, int i2, int i3, Object obj, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i3;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f9343c;
            try {
                this.f9341a.send(messageObtain);
                return true;
            } catch (DeadObjectException | RemoteException unused) {
                return false;
            }
        }

        /* renamed from: u */
        public void m8475u(e7b e7bVar) throws RemoteException {
            int i = this.f9344d;
            this.f9344d = i + 1;
            m8474t(10, i, 0, e7bVar != null ? e7bVar.m24483a() : null, null);
        }

        /* renamed from: v */
        public void m8476v(int i, int i2) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f9344d;
            this.f9344d = i3 + 1;
            m8474t(7, i3, i, null, bundle);
        }

        /* renamed from: w */
        public void m8477w(int i, int i2) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.f9344d;
            this.f9344d = i3 + 1;
            m8474t(6, i3, i, null, bundle);
        }

        /* renamed from: x */
        public void m8478x(int i, List list) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = this.f9344d;
            this.f9344d = i2 + 1;
            m8474t(14, i2, i, null, bundle);
        }

        /* renamed from: y */
        public void m8479y(int i, int i2) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f9344d;
            this.f9344d = i3 + 1;
            m8474t(8, i3, i, null, bundle);
        }
    }

    /* renamed from: androidx.mediarouter.media.l$b */
    public interface b {
        /* renamed from: a */
        void mo8480a(AbstractC2316d.e eVar);
    }

    /* renamed from: androidx.mediarouter.media.l$c */
    public interface c {
        /* renamed from: a */
        int mo8481a();

        /* renamed from: b */
        void mo8482b();

        /* renamed from: c */
        void mo8483c(a aVar);
    }

    /* renamed from: androidx.mediarouter.media.l$d */
    public static final class d extends Handler {
    }

    /* renamed from: androidx.mediarouter.media.l$e */
    public static final class e extends Handler {

        /* renamed from: a */
        public final WeakReference f9352a;

        public e(a aVar) {
            this.f9352a = new WeakReference(aVar);
        }

        /* renamed from: a */
        public void m8484a() {
            this.f9352a.clear();
        }

        /* renamed from: b */
        public final boolean m8485b(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) throws RemoteException {
            switch (i) {
                case 0:
                    aVar.m8466l(i2);
                    return true;
                case 1:
                    aVar.m8467m(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m8468n(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m8461g(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m8460f(i2, bundle == null ? null : bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR), (Bundle) obj);
                    }
                    return false;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m8463i((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (!(obj instanceof Bundle)) {
                        return false;
                    }
                    aVar.m8464j(i2, (Bundle) obj);
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m8465k(i3, (Bundle) obj);
                    }
                    return false;
                case 8:
                    aVar.m8462h(i3);
                    return false;
                default:
                    return false;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) this.f9352a.get();
            if (aVar == null || m8485b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !ServiceConnectionC2324l.f9332X) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled message from server: ");
            sb.append(message);
        }
    }

    /* renamed from: androidx.mediarouter.media.l$f */
    public final class f extends AbstractC2316d.b implements c {

        /* renamed from: f */
        public final String f9353f;

        /* renamed from: g */
        public String f9354g;

        /* renamed from: h */
        public String f9355h;

        /* renamed from: i */
        public boolean f9356i;

        /* renamed from: k */
        public int f9358k;

        /* renamed from: l */
        public a f9359l;

        /* renamed from: j */
        public int f9357j = -1;

        /* renamed from: m */
        public int f9360m = -1;

        /* renamed from: androidx.mediarouter.media.l$f$a */
        public class a extends C2319g.c {
            public a() {
            }

            @Override // androidx.mediarouter.media.C2319g.c
            /* renamed from: a */
            public void mo8069a(String str, Bundle bundle) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error: ");
                sb.append(str);
                sb.append(", data: ");
                sb.append(bundle);
            }

            @Override // androidx.mediarouter.media.C2319g.c
            /* renamed from: b */
            public void mo8070b(Bundle bundle) {
                f.this.f9354g = bundle.getString("groupableTitle");
                f.this.f9355h = bundle.getString("transferableTitle");
            }
        }

        public f(String str) {
            this.f9353f = str;
        }

        @Override // androidx.mediarouter.media.ServiceConnectionC2324l.c
        /* renamed from: a */
        public int mo8481a() {
            return this.f9360m;
        }

        @Override // androidx.mediarouter.media.ServiceConnectionC2324l.c
        /* renamed from: b */
        public void mo8482b() throws RemoteException {
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8470p(this.f9360m);
                this.f9359l = null;
                this.f9360m = 0;
            }
        }

        @Override // androidx.mediarouter.media.ServiceConnectionC2324l.c
        /* renamed from: c */
        public void mo8483c(a aVar) throws RemoteException {
            a aVar2 = new a();
            this.f9359l = aVar;
            int iM8456b = aVar.m8456b(this.f9353f, aVar2);
            this.f9360m = iM8456b;
            if (this.f9356i) {
                aVar.m8472r(iM8456b);
                int i = this.f9357j;
                if (i >= 0) {
                    aVar.m8476v(this.f9360m, i);
                    this.f9357j = -1;
                }
                int i2 = this.f9358k;
                if (i2 != 0) {
                    aVar.m8479y(this.f9360m, i2);
                    this.f9358k = 0;
                }
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: d */
        public boolean mo8095d(Intent intent, C2319g.c cVar) {
            a aVar = this.f9359l;
            if (aVar != null) {
                return aVar.m8473s(this.f9360m, intent, cVar);
            }
            return false;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: e */
        public void mo8096e() throws RemoteException {
            ServiceConnectionC2324l.this.m8445M(this);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: f */
        public void mo8122f() throws RemoteException {
            this.f9356i = true;
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8472r(this.f9360m);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: g */
        public void mo8097g(int i) throws RemoteException {
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8476v(this.f9360m, i);
            } else {
                this.f9357j = i;
                this.f9358k = 0;
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: h */
        public void mo8208h() throws RemoteException {
            mo8123i(0);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: i */
        public void mo8123i(int i) throws RemoteException {
            this.f9356i = false;
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8477w(this.f9360m, i);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: j */
        public void mo8098j(int i) throws RemoteException {
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8479y(this.f9360m, i);
            } else {
                this.f9358k += i;
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: k */
        public String mo8190k() {
            return this.f9354g;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: l */
        public String mo8191l() {
            return this.f9355h;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: n */
        public void mo8099n(String str) throws RemoteException {
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8455a(this.f9360m, str);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: o */
        public void mo8100o(String str) throws RemoteException {
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8471q(this.f9360m, str);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.b
        /* renamed from: p */
        public void mo8101p(List list) throws RemoteException {
            a aVar = this.f9359l;
            if (aVar != null) {
                aVar.m8478x(this.f9360m, list);
            }
        }

        /* renamed from: r */
        public void m8486r(C2315c c2315c, List list) {
            m8192m(c2315c, list);
        }
    }

    /* renamed from: androidx.mediarouter.media.l$g */
    public final class g extends AbstractC2316d.e implements c {

        /* renamed from: a */
        public final String f9363a;

        /* renamed from: b */
        public final String f9364b;

        /* renamed from: c */
        public boolean f9365c;

        /* renamed from: d */
        public int f9366d = -1;

        /* renamed from: e */
        public int f9367e;

        /* renamed from: f */
        public a f9368f;

        /* renamed from: g */
        public int f9369g;

        public g(String str, String str2) {
            this.f9363a = str;
            this.f9364b = str2;
        }

        @Override // androidx.mediarouter.media.ServiceConnectionC2324l.c
        /* renamed from: a */
        public int mo8481a() {
            return this.f9369g;
        }

        @Override // androidx.mediarouter.media.ServiceConnectionC2324l.c
        /* renamed from: b */
        public void mo8482b() throws RemoteException {
            a aVar = this.f9368f;
            if (aVar != null) {
                aVar.m8470p(this.f9369g);
                this.f9368f = null;
                this.f9369g = 0;
            }
        }

        @Override // androidx.mediarouter.media.ServiceConnectionC2324l.c
        /* renamed from: c */
        public void mo8483c(a aVar) throws RemoteException {
            this.f9368f = aVar;
            int iM8457c = aVar.m8457c(this.f9363a, this.f9364b);
            this.f9369g = iM8457c;
            if (this.f9365c) {
                aVar.m8472r(iM8457c);
                int i = this.f9366d;
                if (i >= 0) {
                    aVar.m8476v(this.f9369g, i);
                    this.f9366d = -1;
                }
                int i2 = this.f9367e;
                if (i2 != 0) {
                    aVar.m8479y(this.f9369g, i2);
                    this.f9367e = 0;
                }
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: d */
        public boolean mo8095d(Intent intent, C2319g.c cVar) {
            a aVar = this.f9368f;
            if (aVar != null) {
                return aVar.m8473s(this.f9369g, intent, cVar);
            }
            return false;
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: e */
        public void mo8096e() throws RemoteException {
            ServiceConnectionC2324l.this.m8445M(this);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: f */
        public void mo8122f() throws RemoteException {
            this.f9365c = true;
            a aVar = this.f9368f;
            if (aVar != null) {
                aVar.m8472r(this.f9369g);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: g */
        public void mo8097g(int i) throws RemoteException {
            a aVar = this.f9368f;
            if (aVar != null) {
                aVar.m8476v(this.f9369g, i);
            } else {
                this.f9366d = i;
                this.f9367e = 0;
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: h */
        public void mo8208h() throws RemoteException {
            mo8123i(0);
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: i */
        public void mo8123i(int i) throws RemoteException {
            this.f9365c = false;
            a aVar = this.f9368f;
            if (aVar != null) {
                aVar.m8477w(this.f9369g, i);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2316d.e
        /* renamed from: j */
        public void mo8098j(int i) throws RemoteException {
            a aVar = this.f9368f;
            if (aVar != null) {
                aVar.m8479y(this.f9369g, i);
            } else {
                this.f9367e += i;
            }
        }
    }

    public ServiceConnectionC2324l(Context context, ComponentName componentName) {
        super(context, new AbstractC2316d.d(componentName));
        this.f9339x = new ArrayList();
        this.f9337q = componentName;
        this.f9338s = new d();
    }

    /* renamed from: A */
    public final void m8433A() {
        if (this.f9333H) {
            return;
        }
        boolean z = f9332X;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f9337q);
        try {
            boolean zBindService = m8182n().bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
            this.f9333H = zBindService;
            if (zBindService || !z) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            sb2.append(": Bind failed");
        } catch (SecurityException unused) {
            if (f9332X) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(": Bind failed");
            }
        }
    }

    /* renamed from: B */
    public final AbstractC2316d.b m8434B(String str) throws RemoteException {
        C2317e c2317eM8183o = m8183o();
        if (c2317eM8183o == null) {
            return null;
        }
        List listM8211c = c2317eM8183o.m8211c();
        int size = listM8211c.size();
        for (int i = 0; i < size; i++) {
            if (((C2315c) listM8211c.get(i)).m8147m().equals(str)) {
                f fVar = new f(str);
                this.f9339x.add(fVar);
                if (this.f9335M) {
                    fVar.mo8483c(this.f9334L);
                }
                m8453U();
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: C */
    public final AbstractC2316d.e m8435C(String str, String str2) throws RemoteException {
        C2317e c2317eM8183o = m8183o();
        if (c2317eM8183o == null) {
            return null;
        }
        List listM8211c = c2317eM8183o.m8211c();
        int size = listM8211c.size();
        for (int i = 0; i < size; i++) {
            if (((C2315c) listM8211c.get(i)).m8147m().equals(str)) {
                g gVar = new g(str, str2);
                this.f9339x.add(gVar);
                if (this.f9335M) {
                    gVar.mo8483c(this.f9334L);
                }
                m8453U();
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final void m8436D() {
        int size = this.f9339x.size();
        for (int i = 0; i < size; i++) {
            ((c) this.f9339x.get(i)).mo8482b();
        }
    }

    /* renamed from: E */
    public final void m8437E() throws RemoteException {
        if (this.f9334L != null) {
            m8187w(null);
            this.f9335M = false;
            m8436D();
            this.f9334L.m8458d();
            this.f9334L = null;
        }
    }

    /* renamed from: F */
    public final c m8438F(int i) {
        Iterator it = this.f9339x.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.mo8481a() == i) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: G */
    public boolean m8439G(String str, String str2) {
        return this.f9337q.getPackageName().equals(str) && this.f9337q.getClassName().equals(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public void m8440H(a aVar, int i) throws RemoteException {
        if (this.f9334L == aVar) {
            c cVarM8438F = m8438F(i);
            b bVar = this.f9336Q;
            if (bVar != null && (cVarM8438F instanceof AbstractC2316d.e)) {
                bVar.mo8480a((AbstractC2316d.e) cVarM8438F);
            }
            m8445M(cVarM8438F);
        }
    }

    /* renamed from: I */
    public void m8441I(a aVar, C2317e c2317e) {
        if (this.f9334L == aVar) {
            if (f9332X) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Descriptor changed, descriptor=");
                sb.append(c2317e);
            }
            m8187w(c2317e);
        }
    }

    /* renamed from: J */
    public void m8442J(a aVar) throws RemoteException {
        if (this.f9334L == aVar) {
            if (f9332X) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Service connection died");
            }
            m8437E();
        }
    }

    /* renamed from: K */
    public void m8443K(a aVar, String str) throws RemoteException {
        if (this.f9334L == aVar) {
            if (f9332X) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Service connection error - ");
                sb.append(str);
            }
            m8452T();
        }
    }

    /* renamed from: L */
    public void m8444L(a aVar) throws RemoteException {
        if (this.f9334L == aVar) {
            this.f9335M = true;
            m8454z();
            e7b e7bVarM8184p = m8184p();
            if (e7bVarM8184p != null) {
                this.f9334L.m8475u(e7bVarM8184p);
            }
        }
    }

    /* renamed from: M */
    public void m8445M(c cVar) throws RemoteException {
        this.f9339x.remove(cVar);
        cVar.mo8482b();
        m8453U();
    }

    /* renamed from: N */
    public void m8446N(a aVar, int i, C2315c c2315c, List list) {
        if (this.f9334L == aVar) {
            if (f9332X) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": DynamicRouteDescriptors changed, descriptors=");
                sb.append(list);
            }
            c cVarM8438F = m8438F(i);
            if (cVarM8438F instanceof f) {
                ((f) cVarM8438F).m8486r(c2315c, list);
            }
        }
    }

    /* renamed from: O */
    public void m8447O() throws RemoteException {
        if (this.f9334L == null && m8449Q()) {
            m8452T();
            m8433A();
        }
    }

    /* renamed from: P */
    public void m8448P(b bVar) {
        this.f9336Q = bVar;
    }

    /* renamed from: Q */
    public final boolean m8449Q() {
        if (this.f9340y) {
            return (m8184p() == null && this.f9339x.isEmpty()) ? false : true;
        }
        return false;
    }

    /* renamed from: R */
    public void m8450R() throws RemoteException {
        if (this.f9340y) {
            return;
        }
        if (f9332X) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Starting");
        }
        this.f9340y = true;
        m8453U();
    }

    /* renamed from: S */
    public void m8451S() throws RemoteException {
        if (this.f9340y) {
            if (f9332X) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Stopping");
            }
            this.f9340y = false;
            m8453U();
        }
    }

    /* renamed from: T */
    public final void m8452T() throws RemoteException {
        if (this.f9333H) {
            if (f9332X) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Unbinding");
            }
            this.f9333H = false;
            m8437E();
            try {
                m8182n().unbindService(this);
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": unbindService failed");
            }
        }
    }

    /* renamed from: U */
    public final void m8453U() throws RemoteException {
        if (m8449Q()) {
            m8433A();
        } else {
            m8452T();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        boolean z = f9332X;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Connected");
        }
        if (this.f9333H) {
            m8437E();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!g7b.m28138a(messenger)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(messenger);
            if (aVar.m8469o()) {
                this.f9334L = aVar;
            } else if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) throws RemoteException {
        if (f9332X) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Service disconnected");
        }
        m8437E();
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: r */
    public AbstractC2316d.b mo8086r(String str) {
        if (str != null) {
            return m8434B(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: s */
    public AbstractC2316d.e mo8087s(String str) {
        if (str != null) {
            return m8435C(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: t */
    public AbstractC2316d.e mo8088t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return m8435C(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.f9337q.flattenToShortString();
    }

    @Override // androidx.mediarouter.media.AbstractC2316d
    /* renamed from: u */
    public void mo8089u(e7b e7bVar) throws RemoteException {
        if (this.f9335M) {
            this.f9334L.m8475u(e7bVar);
        }
        m8453U();
    }

    /* renamed from: z */
    public final void m8454z() {
        int size = this.f9339x.size();
        for (int i = 0; i < size; i++) {
            ((c) this.f9339x.get(i)).mo8483c(this.f9334L);
        }
    }
}
