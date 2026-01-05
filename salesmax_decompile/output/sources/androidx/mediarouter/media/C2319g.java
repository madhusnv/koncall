package androidx.mediarouter.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.AbstractC2326n;
import androidx.mediarouter.media.AbstractC2327o;
import androidx.mediarouter.media.C2313a;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2325m;
import com.google.android.gms.cast.CredentialsData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.c64;
import p001o.e7b;
import p001o.iwc;
import p001o.k7b;
import p001o.k8b;
import p001o.m2j;
import p001o.m8b;
import p001o.s6c;
import p001o.vo0;
import p001o.xq;
import p001o.zfa;

/* renamed from: androidx.mediarouter.media.g */
/* loaded from: classes2.dex */
public final class C2319g {

    /* renamed from: c */
    public static final boolean f9228c = Log.isLoggable("MediaRouter", 3);

    /* renamed from: d */
    public static d f9229d;

    /* renamed from: a */
    public final Context f9230a;

    /* renamed from: b */
    public final ArrayList f9231b = new ArrayList();

    /* renamed from: androidx.mediarouter.media.g$a */
    public static abstract class a {
        public void onProviderAdded(C2319g c2319g, g gVar) {
        }

        public void onProviderChanged(C2319g c2319g, g gVar) {
        }

        public void onProviderRemoved(C2319g c2319g, g gVar) {
        }

        public void onRouteAdded(C2319g c2319g, h hVar) {
        }

        public void onRouteChanged(C2319g c2319g, h hVar) {
        }

        public void onRoutePresentationDisplayChanged(C2319g c2319g, h hVar) {
        }

        public void onRouteRemoved(C2319g c2319g, h hVar) {
        }

        @Deprecated
        public void onRouteSelected(C2319g c2319g, h hVar) {
        }

        @Deprecated
        public void onRouteUnselected(C2319g c2319g, h hVar) {
        }

        public void onRouteVolumeChanged(C2319g c2319g, h hVar) {
        }

        public void onRouterParamsChanged(C2319g c2319g, m8b m8bVar) {
        }

        public void onRouteSelected(C2319g c2319g, h hVar, int i) {
            onRouteSelected(c2319g, hVar);
        }

        public void onRouteUnselected(C2319g c2319g, h hVar, int i) {
            onRouteUnselected(c2319g, hVar);
        }

        public void onRouteSelected(C2319g c2319g, h hVar, int i, h hVar2) {
            onRouteSelected(c2319g, hVar, i);
        }
    }

    /* renamed from: androidx.mediarouter.media.g$b */
    public static final class b {

        /* renamed from: a */
        public final C2319g f9232a;

        /* renamed from: b */
        public final a f9233b;

        /* renamed from: c */
        public C2318f f9234c = C2318f.f9224c;

        /* renamed from: d */
        public int f9235d;

        /* renamed from: e */
        public long f9236e;

        public b(C2319g c2319g, a aVar) {
            this.f9232a = c2319g;
            this.f9233b = aVar;
        }

        /* renamed from: a */
        public boolean m8257a(h hVar, int i, h hVar2, int i2) {
            if ((this.f9235d & 2) != 0 || hVar.m8339E(this.f9234c)) {
                return true;
            }
            if (C2319g.m8237r() && hVar.m8369w() && i == 262 && i2 == 3 && hVar2 != null) {
                return !hVar2.m8369w();
            }
            return false;
        }
    }

    /* renamed from: androidx.mediarouter.media.g$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract void mo8069a(String str, Bundle bundle);

        /* renamed from: b */
        public abstract void mo8070b(Bundle bundle);
    }

    /* renamed from: androidx.mediarouter.media.g$d */
    public static final class d implements AbstractC2327o.e, C2325m.c {

        /* renamed from: A */
        public int f9237A;

        /* renamed from: B */
        public e f9238B;

        /* renamed from: C */
        public f f9239C;

        /* renamed from: D */
        public e f9240D;

        /* renamed from: E */
        public MediaSessionCompat f9241E;

        /* renamed from: F */
        public MediaSessionCompat f9242F;

        /* renamed from: a */
        public final Context f9245a;

        /* renamed from: b */
        public boolean f9246b;

        /* renamed from: c */
        public AbstractC2327o f9247c;

        /* renamed from: d */
        public C2325m f9248d;

        /* renamed from: e */
        public boolean f9249e;

        /* renamed from: f */
        public C2313a f9250f;

        /* renamed from: o */
        public final boolean f9259o;

        /* renamed from: p */
        public k8b f9260p;

        /* renamed from: q */
        public m8b f9261q;

        /* renamed from: r */
        public h f9262r;

        /* renamed from: s */
        public h f9263s;

        /* renamed from: t */
        public h f9264t;

        /* renamed from: u */
        public AbstractC2316d.e f9265u;

        /* renamed from: v */
        public h f9266v;

        /* renamed from: w */
        public AbstractC2316d.e f9267w;

        /* renamed from: y */
        public e7b f9269y;

        /* renamed from: z */
        public e7b f9270z;

        /* renamed from: g */
        public final ArrayList f9251g = new ArrayList();

        /* renamed from: h */
        public final ArrayList f9252h = new ArrayList();

        /* renamed from: i */
        public final Map f9253i = new HashMap();

        /* renamed from: j */
        public final ArrayList f9254j = new ArrayList();

        /* renamed from: k */
        public final ArrayList f9255k = new ArrayList();

        /* renamed from: l */
        public final AbstractC2326n.b f9256l = new AbstractC2326n.b();

        /* renamed from: m */
        public final g f9257m = new g();

        /* renamed from: n */
        public final HandlerC19568d f9258n = new HandlerC19568d();

        /* renamed from: x */
        public final Map f9268x = new HashMap();

        /* renamed from: G */
        public final MediaSessionCompat.InterfaceC1725h f9243G = new a();

        /* renamed from: H */
        public AbstractC2316d.b.d f9244H = new c();

        /* renamed from: androidx.mediarouter.media.g$d$a */
        public class a implements MediaSessionCompat.InterfaceC1725h {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC1725h
            /* renamed from: a */
            public void mo3645a() {
                MediaSessionCompat mediaSessionCompat = d.this.f9241E;
                if (mediaSessionCompat != null) {
                    if (mediaSessionCompat.m3565f()) {
                        d dVar = d.this;
                        dVar.m8286f(dVar.f9241E.m3563c());
                    } else {
                        d dVar2 = d.this;
                        dVar2.m8264G(dVar2.f9241E.m3563c());
                    }
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.m8274Q();
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$c */
        public class c implements AbstractC2316d.b.d {
            public c() {
            }

            @Override // androidx.mediarouter.media.AbstractC2316d.b.d
            /* renamed from: a */
            public void mo8075a(AbstractC2316d.b bVar, C2315c c2315c, Collection collection) {
                d dVar = d.this;
                if (bVar != dVar.f9267w || c2315c == null) {
                    if (bVar == dVar.f9265u) {
                        if (c2315c != null) {
                            dVar.m8279V(dVar.f9264t, c2315c);
                        }
                        d.this.f9264t.m8346L(collection);
                        return;
                    }
                    return;
                }
                g gVarM8363q = dVar.f9266v.m8363q();
                String strM8147m = c2315c.m8147m();
                h hVar = new h(gVarM8363q, strM8147m, d.this.m8287g(gVarM8363q, strM8147m));
                hVar.m8340F(c2315c);
                d dVar2 = d.this;
                if (dVar2.f9264t == hVar) {
                    return;
                }
                dVar2.m8262E(dVar2, hVar, dVar2.f9267w, 3, dVar2.f9266v, collection);
                d dVar3 = d.this;
                dVar3.f9266v = null;
                dVar3.f9267w = null;
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$d, reason: collision with other inner class name */
        public final class HandlerC19568d extends Handler {

            /* renamed from: a */
            public final ArrayList f9274a = new ArrayList();

            /* renamed from: b */
            public final List f9275b = new ArrayList();

            public HandlerC19568d() {
            }

            /* renamed from: a */
            public final void m8307a(b bVar, int i, Object obj, int i2) {
                C2319g c2319g = bVar.f9232a;
                a aVar = bVar.f9233b;
                int i3 = 65280 & i;
                if (i3 != 256) {
                    if (i3 != 512) {
                        if (i3 == 768 && i == 769) {
                            aVar.onRouterParamsChanged(c2319g, (m8b) obj);
                            return;
                        }
                        return;
                    }
                    g gVar = (g) obj;
                    switch (i) {
                        case 513:
                            aVar.onProviderAdded(c2319g, gVar);
                            break;
                        case 514:
                            aVar.onProviderRemoved(c2319g, gVar);
                            break;
                        case 515:
                            aVar.onProviderChanged(c2319g, gVar);
                            break;
                    }
                }
                h hVar = (i == 264 || i == 262) ? (h) ((iwc) obj).f29292b : (h) obj;
                h hVar2 = (i == 264 || i == 262) ? (h) ((iwc) obj).f29291a : null;
                if (hVar == null || !bVar.m8257a(hVar, i, hVar2, i2)) {
                    return;
                }
                switch (i) {
                    case 257:
                        aVar.onRouteAdded(c2319g, hVar);
                        break;
                    case 258:
                        aVar.onRouteRemoved(c2319g, hVar);
                        break;
                    case 259:
                        aVar.onRouteChanged(c2319g, hVar);
                        break;
                    case 260:
                        aVar.onRouteVolumeChanged(c2319g, hVar);
                        break;
                    case 261:
                        aVar.onRoutePresentationDisplayChanged(c2319g, hVar);
                        break;
                    case 262:
                        aVar.onRouteSelected(c2319g, hVar, i2, hVar);
                        break;
                    case 263:
                        aVar.onRouteUnselected(c2319g, hVar, i2);
                        break;
                    case 264:
                        aVar.onRouteSelected(c2319g, hVar, i2, hVar2);
                        break;
                }
            }

            /* renamed from: b */
            public void m8308b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            /* renamed from: c */
            public void m8309c(int i, Object obj, int i2) {
                Message messageObtainMessage = obtainMessage(i, obj);
                messageObtainMessage.arg1 = i2;
                messageObtainMessage.sendToTarget();
            }

            /* renamed from: d */
            public final void m8310d(int i, Object obj) {
                if (i == 262) {
                    h hVar = (h) ((iwc) obj).f29292b;
                    d.this.f9247c.mo8503D(hVar);
                    if (d.this.f9262r == null || !hVar.m8369w()) {
                        return;
                    }
                    Iterator it = this.f9275b.iterator();
                    while (it.hasNext()) {
                        d.this.f9247c.mo8502C((h) it.next());
                    }
                    this.f9275b.clear();
                }
                if (i == 264) {
                    h hVar2 = (h) ((iwc) obj).f29292b;
                    this.f9275b.add(hVar2);
                    d.this.f9247c.mo8500A(hVar2);
                    d.this.f9247c.mo8503D(hVar2);
                    return;
                }
                switch (i) {
                    case 257:
                        d.this.f9247c.mo8500A((h) obj);
                        break;
                    case 258:
                        d.this.f9247c.mo8502C((h) obj);
                        break;
                    case 259:
                        d.this.f9247c.mo8501B((h) obj);
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && d.this.m8302v().m8357k().equals(((h) obj).m8357k())) {
                    d.this.m8280W(true);
                }
                m8310d(i, obj);
                try {
                    int size = d.this.f9251g.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C2319g c2319g = (C2319g) ((WeakReference) d.this.f9251g.get(size)).get();
                        if (c2319g == null) {
                            d.this.f9251g.remove(size);
                        } else {
                            this.f9274a.addAll(c2319g.f9231b);
                        }
                    }
                    int size2 = this.f9274a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        m8307a((b) this.f9274a.get(i3), i, obj, i2);
                    }
                } finally {
                    this.f9274a.clear();
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$e */
        public final class e {

            /* renamed from: a */
            public final MediaSessionCompat f9277a;

            /* renamed from: b */
            public int f9278b;

            /* renamed from: c */
            public int f9279c;

            /* renamed from: d */
            public m2j f9280d;

            /* renamed from: androidx.mediarouter.media.g$d$e$a */
            public class a extends m2j {

                /* renamed from: androidx.mediarouter.media.g$d$e$a$a, reason: collision with other inner class name */
                public class RunnableC19569a implements Runnable {

                    /* renamed from: a */
                    public final /* synthetic */ int f9283a;

                    public RunnableC19569a(int i) {
                        this.f9283a = i;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = d.this.f9264t;
                        if (hVar != null) {
                            hVar.m8341G(this.f9283a);
                        }
                    }
                }

                /* renamed from: androidx.mediarouter.media.g$d$e$a$b */
                public class b implements Runnable {

                    /* renamed from: a */
                    public final /* synthetic */ int f9285a;

                    public b(int i) {
                        this.f9285a = i;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = d.this.f9264t;
                        if (hVar != null) {
                            hVar.m8342H(this.f9285a);
                        }
                    }
                }

                public a(int i, int i2, int i3, String str) {
                    super(i, i2, i3, str);
                }

                @Override // p001o.m2j
                /* renamed from: b */
                public void mo8314b(int i) {
                    d.this.f9258n.post(new b(i));
                }

                @Override // p001o.m2j
                /* renamed from: c */
                public void mo8315c(int i) {
                    d.this.f9258n.post(new RunnableC19569a(i));
                }
            }

            public e(MediaSessionCompat mediaSessionCompat) {
                this.f9277a = mediaSessionCompat;
            }

            /* renamed from: a */
            public void m8311a() {
                MediaSessionCompat mediaSessionCompat = this.f9277a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.m3573n(d.this.f9256l.f9392d);
                    this.f9280d = null;
                }
            }

            /* renamed from: b */
            public void m8312b(int i, int i2, int i3, String str) {
                if (this.f9277a != null) {
                    m2j m2jVar = this.f9280d;
                    if (m2jVar != null && i == this.f9278b && i2 == this.f9279c) {
                        m2jVar.m38223d(i3);
                        return;
                    }
                    a aVar = new a(i, i2, i3, str);
                    this.f9280d = aVar;
                    this.f9277a.m3574o(aVar);
                }
            }

            /* renamed from: c */
            public MediaSessionCompat.Token m8313c() {
                MediaSessionCompat mediaSessionCompat = this.f9277a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.m3564d();
                }
                return null;
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$f */
        public final class f extends C2313a.a {
            public f() {
            }

            @Override // androidx.mediarouter.media.C2313a.a
            /* renamed from: a */
            public void mo8090a(AbstractC2316d.e eVar) {
                if (eVar == d.this.f9265u) {
                    m8316d(2);
                } else if (C2319g.f9228c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("A RouteController unrelated to the selected route is released. controller=");
                    sb.append(eVar);
                }
            }

            @Override // androidx.mediarouter.media.C2313a.a
            /* renamed from: b */
            public void mo8091b(int i) {
                m8316d(i);
            }

            @Override // androidx.mediarouter.media.C2313a.a
            /* renamed from: c */
            public void mo8092c(String str, int i) {
                h hVar;
                Iterator it = d.this.m8301u().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVar = null;
                        break;
                    }
                    hVar = (h) it.next();
                    if (hVar.m8364r() == d.this.f9250f && TextUtils.equals(str, hVar.m8351e())) {
                        break;
                    }
                }
                if (hVar != null) {
                    d.this.m8268K(hVar, i);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onSelectRoute: The target RouteInfo is not found for descriptorId=");
                sb.append(str);
            }

            /* renamed from: d */
            public void m8316d(int i) {
                h hVarM8288h = d.this.m8288h();
                if (d.this.m8302v() != hVarM8288h) {
                    d.this.m8268K(hVarM8288h, i);
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$g */
        public final class g extends AbstractC2316d.a {
            public g() {
            }

            @Override // androidx.mediarouter.media.AbstractC2316d.a
            /* renamed from: a */
            public void mo8076a(AbstractC2316d abstractC2316d, C2317e c2317e) {
                d.this.m8278U(abstractC2316d, c2317e);
            }
        }

        /* renamed from: androidx.mediarouter.media.g$d$h */
        public final class h implements AbstractC2326n.c {

            /* renamed from: a */
            public final AbstractC2326n f9289a;

            /* renamed from: b */
            public boolean f9290b;

            public h(Object obj) {
                AbstractC2326n abstractC2326nM8495b = AbstractC2326n.m8495b(d.this.f9245a, obj);
                this.f9289a = abstractC2326nM8495b;
                abstractC2326nM8495b.m8498d(this);
                m8321e();
            }

            @Override // androidx.mediarouter.media.AbstractC2326n.c
            /* renamed from: a */
            public void mo8317a(int i) {
                h hVar;
                if (this.f9290b || (hVar = d.this.f9264t) == null) {
                    return;
                }
                hVar.m8341G(i);
            }

            @Override // androidx.mediarouter.media.AbstractC2326n.c
            /* renamed from: b */
            public void mo8318b(int i) {
                h hVar;
                if (this.f9290b || (hVar = d.this.f9264t) == null) {
                    return;
                }
                hVar.m8342H(i);
            }

            /* renamed from: c */
            public void m8319c() {
                this.f9290b = true;
                this.f9289a.m8498d(null);
            }

            /* renamed from: d */
            public Object m8320d() {
                return this.f9289a.m8496a();
            }

            /* renamed from: e */
            public void m8321e() {
                this.f9289a.mo8497c(d.this.f9256l);
            }
        }

        public d(Context context) {
            this.f9245a = context;
            this.f9259o = xq.m56575a((ActivityManager) context.getSystemService("activity"));
        }

        /* renamed from: A */
        public final boolean m8258A(h hVar) {
            return hVar.m8364r() == this.f9247c && hVar.f9307b.equals("DEFAULT_ROUTE");
        }

        /* renamed from: B */
        public final boolean m8259B(h hVar) {
            return hVar.m8364r() == this.f9247c && hVar.m8344J("android.media.intent.category.LIVE_AUDIO") && !hVar.m8344J("android.media.intent.category.LIVE_VIDEO");
        }

        /* renamed from: C */
        public boolean m8260C() {
            m8b m8bVar = this.f9261q;
            if (m8bVar == null) {
                return false;
            }
            return m8bVar.m38559e();
        }

        /* renamed from: D */
        public void m8261D() {
            if (this.f9264t.m8371y()) {
                List<h> listM8358l = this.f9264t.m8358l();
                HashSet hashSet = new HashSet();
                Iterator it = listM8358l.iterator();
                while (it.hasNext()) {
                    hashSet.add(((h) it.next()).f9308c);
                }
                Iterator it2 = this.f9268x.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        AbstractC2316d.e eVar = (AbstractC2316d.e) entry.getValue();
                        eVar.mo8123i(0);
                        eVar.mo8096e();
                        it2.remove();
                    }
                }
                for (h hVar : listM8358l) {
                    if (!this.f9268x.containsKey(hVar.f9308c)) {
                        AbstractC2316d.e eVarMo8088t = hVar.m8364r().mo8088t(hVar.f9307b, this.f9264t.f9307b);
                        eVarMo8088t.mo8122f();
                        this.f9268x.put(hVar.f9308c, eVarMo8088t);
                    }
                }
            }
        }

        /* renamed from: E */
        public void m8262E(d dVar, h hVar, AbstractC2316d.e eVar, int i, h hVar2, Collection collection) {
            e eVar2;
            f fVar = this.f9239C;
            if (fVar != null) {
                fVar.m8322a();
                this.f9239C = null;
            }
            f fVar2 = new f(dVar, hVar, eVar, i, hVar2, collection);
            this.f9239C = fVar2;
            if (fVar2.f9293b != 3 || (eVar2 = this.f9238B) == null) {
                fVar2.m8323b();
                return;
            }
            zfa zfaVarOnPrepareTransfer = eVar2.onPrepareTransfer(this.f9264t, fVar2.f9295d);
            if (zfaVarOnPrepareTransfer == null) {
                this.f9239C.m8323b();
            } else {
                this.f9239C.m8325d(zfaVarOnPrepareTransfer);
            }
        }

        /* renamed from: F */
        public void m8263F(h hVar) {
            if (!(this.f9265u instanceof AbstractC2316d.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a aVarM8296p = m8296p(hVar);
            if (this.f9264t.m8358l().contains(hVar) && aVarM8296p != null && aVarM8296p.m8376d()) {
                if (this.f9264t.m8358l().size() <= 1) {
                    return;
                }
                ((AbstractC2316d.b) this.f9265u).mo8100o(hVar.m8351e());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring attempt to remove a non-unselectable member route : ");
                sb.append(hVar);
            }
        }

        /* renamed from: G */
        public void m8264G(Object obj) {
            int iM8291k = m8291k(obj);
            if (iM8291k >= 0) {
                ((h) this.f9255k.remove(iM8291k)).m8319c();
            }
        }

        /* renamed from: H */
        public void m8265H(h hVar, int i) {
            AbstractC2316d.e eVar;
            AbstractC2316d.e eVar2;
            if (hVar == this.f9264t && (eVar2 = this.f9265u) != null) {
                eVar2.mo8097g(i);
            } else {
                if (this.f9268x.isEmpty() || (eVar = (AbstractC2316d.e) this.f9268x.get(hVar.f9308c)) == null) {
                    return;
                }
                eVar.mo8097g(i);
            }
        }

        /* renamed from: I */
        public void m8266I(h hVar, int i) {
            AbstractC2316d.e eVar;
            AbstractC2316d.e eVar2;
            if (hVar == this.f9264t && (eVar2 = this.f9265u) != null) {
                eVar2.mo8098j(i);
            } else {
                if (this.f9268x.isEmpty() || (eVar = (AbstractC2316d.e) this.f9268x.get(hVar.f9308c)) == null) {
                    return;
                }
                eVar.mo8098j(i);
            }
        }

        /* renamed from: J */
        public void m8267J(h hVar, int i) {
            if (!this.f9252h.contains(hVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring attempt to select removed route: ");
                sb.append(hVar);
            } else {
                if (!hVar.f9312g) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring attempt to select disabled route: ");
                    sb2.append(hVar);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    AbstractC2316d abstractC2316dM8364r = hVar.m8364r();
                    C2313a c2313a = this.f9250f;
                    if (abstractC2316dM8364r == c2313a && this.f9264t != hVar) {
                        c2313a.m8084E(hVar.m8351e());
                        return;
                    }
                }
                m8268K(hVar, i);
            }
        }

        /* renamed from: K */
        public void m8268K(h hVar, int i) {
            if (C2319g.f9229d == null || (this.f9263s != null && hVar.m8368v())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (C2319g.f9229d == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                    sb2.append(this.f9245a.getPackageName());
                    sb2.append(", callers=");
                    sb2.append(sb.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Default route is selected while a BT route is available: pkgName=");
                    sb3.append(this.f9245a.getPackageName());
                    sb3.append(", callers=");
                    sb3.append(sb.toString());
                }
            }
            if (this.f9264t == hVar) {
                return;
            }
            if (this.f9266v != null) {
                this.f9266v = null;
                AbstractC2316d.e eVar = this.f9267w;
                if (eVar != null) {
                    eVar.mo8123i(3);
                    this.f9267w.mo8096e();
                    this.f9267w = null;
                }
            }
            if (m8305y() && hVar.m8363q().m8333g()) {
                AbstractC2316d.b bVarMo8086r = hVar.m8364r().mo8086r(hVar.f9307b);
                if (bVarMo8086r != null) {
                    bVarMo8086r.m8193q(c64.getMainExecutor(this.f9245a), this.f9244H);
                    this.f9266v = hVar;
                    this.f9267w = bVarMo8086r;
                    bVarMo8086r.mo8122f();
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("setSelectedRouteInternal: Failed to create dynamic group route controller. route=");
                sb4.append(hVar);
            }
            AbstractC2316d.e eVarMo8087s = hVar.m8364r().mo8087s(hVar.f9307b);
            if (eVarMo8087s != null) {
                eVarMo8087s.mo8122f();
            }
            if (C2319g.f9228c) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Route selected: ");
                sb5.append(hVar);
            }
            if (this.f9264t != null) {
                m8262E(this, hVar, eVarMo8087s, i, null, null);
                return;
            }
            this.f9264t = hVar;
            this.f9265u = eVarMo8087s;
            this.f9258n.m8309c(262, new iwc(null, hVar), i);
        }

        /* renamed from: L */
        public void m8269L(MediaSessionCompat mediaSessionCompat) {
            this.f9242F = mediaSessionCompat;
            m8270M(mediaSessionCompat != null ? new e(mediaSessionCompat) : null);
        }

        /* renamed from: M */
        public final void m8270M(e eVar) {
            e eVar2 = this.f9240D;
            if (eVar2 != null) {
                eVar2.m8311a();
            }
            this.f9240D = eVar;
            if (eVar != null) {
                m8276S();
            }
        }

        /* renamed from: N */
        public void m8271N(m8b m8bVar) {
            m8b m8bVar2 = this.f9261q;
            this.f9261q = m8bVar;
            if (m8305y()) {
                if (this.f9250f == null) {
                    C2313a c2313a = new C2313a(this.f9245a, new f());
                    this.f9250f = c2313a;
                    mo8281a(c2313a);
                    m8274Q();
                    this.f9248d.m8492f();
                }
                if ((m8bVar2 == null ? false : m8bVar2.m38559e()) != (m8bVar != null ? m8bVar.m38559e() : false)) {
                    this.f9250f.m8189y(this.f9270z);
                }
            } else {
                AbstractC2316d abstractC2316d = this.f9250f;
                if (abstractC2316d != null) {
                    mo8282b(abstractC2316d);
                    this.f9250f = null;
                    this.f9248d.m8492f();
                }
            }
            this.f9258n.m8308b(769, m8bVar);
        }

        /* renamed from: O */
        public final void m8272O() {
            this.f9260p = new k8b(new b());
            mo8281a(this.f9247c);
            C2313a c2313a = this.f9250f;
            if (c2313a != null) {
                mo8281a(c2313a);
            }
            C2325m c2325m = new C2325m(this.f9245a, this);
            this.f9248d = c2325m;
            c2325m.m8494h();
        }

        /* renamed from: P */
        public void m8273P(h hVar) {
            if (!(this.f9265u instanceof AbstractC2316d.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a aVarM8296p = m8296p(hVar);
            if (aVarM8296p == null || !aVarM8296p.m8375c()) {
                return;
            }
            ((AbstractC2316d.b) this.f9265u).mo8101p(Collections.singletonList(hVar.m8351e()));
        }

        /* renamed from: Q */
        public void m8274Q() {
            C2318f.a aVar = new C2318f.a();
            this.f9260p.m35169c();
            int size = this.f9251g.size();
            int i = 0;
            boolean z = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C2319g c2319g = (C2319g) ((WeakReference) this.f9251g.get(size)).get();
                if (c2319g == null) {
                    this.f9251g.remove(size);
                } else {
                    int size2 = c2319g.f9231b.size();
                    i += size2;
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = (b) c2319g.f9231b.get(i2);
                        aVar.m8229c(bVar.f9234c);
                        boolean z2 = (bVar.f9235d & 1) != 0;
                        this.f9260p.m35168b(z2, bVar.f9236e);
                        if (z2) {
                            z = true;
                        }
                        int i3 = bVar.f9235d;
                        if ((i3 & 4) != 0 && !this.f9259o) {
                            z = true;
                        }
                        if ((i3 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            boolean zM35167a = this.f9260p.m35167a();
            this.f9237A = i;
            C2318f c2318fM8230d = z ? aVar.m8230d() : C2318f.f9224c;
            m8275R(aVar.m8230d(), zM35167a);
            e7b e7bVar = this.f9269y;
            if (e7bVar != null && e7bVar.m24485d().equals(c2318fM8230d) && this.f9269y.m24486e() == zM35167a) {
                return;
            }
            if (!c2318fM8230d.m8224f() || zM35167a) {
                this.f9269y = new e7b(c2318fM8230d, zM35167a);
            } else if (this.f9269y == null) {
                return;
            } else {
                this.f9269y = null;
            }
            if (C2319g.f9228c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updated discovery request: ");
                sb.append(this.f9269y);
            }
            int size3 = this.f9254j.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC2316d abstractC2316d = ((g) this.f9254j.get(i4)).f9302a;
                if (abstractC2316d != this.f9250f) {
                    abstractC2316d.m8188x(this.f9269y);
                }
            }
        }

        /* renamed from: R */
        public final void m8275R(C2318f c2318f, boolean z) {
            if (m8305y()) {
                e7b e7bVar = this.f9270z;
                if (e7bVar != null && e7bVar.m24485d().equals(c2318f) && this.f9270z.m24486e() == z) {
                    return;
                }
                if (!c2318f.m8224f() || z) {
                    this.f9270z = new e7b(c2318f, z);
                } else if (this.f9270z == null) {
                    return;
                } else {
                    this.f9270z = null;
                }
                if (C2319g.f9228c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Updated MediaRoute2Provider's discovery request: ");
                    sb.append(this.f9270z);
                }
                this.f9250f.m8188x(this.f9270z);
            }
        }

        /* renamed from: S */
        public void m8276S() {
            h hVar = this.f9264t;
            if (hVar == null) {
                e eVar = this.f9240D;
                if (eVar != null) {
                    eVar.m8311a();
                    return;
                }
                return;
            }
            this.f9256l.f9389a = hVar.m8365s();
            this.f9256l.f9390b = this.f9264t.m8367u();
            this.f9256l.f9391c = this.f9264t.m8366t();
            this.f9256l.f9392d = this.f9264t.m8360n();
            this.f9256l.f9393e = this.f9264t.m8361o();
            if (m8305y() && this.f9264t.m8364r() == this.f9250f) {
                this.f9256l.f9394f = C2313a.m8079B(this.f9265u);
            } else {
                this.f9256l.f9394f = null;
            }
            int size = this.f9255k.size();
            for (int i = 0; i < size; i++) {
                ((h) this.f9255k.get(i)).m8321e();
            }
            if (this.f9240D != null) {
                if (this.f9264t == m8295o() || this.f9264t == m8293m()) {
                    this.f9240D.m8311a();
                } else {
                    AbstractC2326n.b bVar = this.f9256l;
                    this.f9240D.m8312b(bVar.f9391c == 1 ? 2 : 0, bVar.f9390b, bVar.f9389a, bVar.f9394f);
                }
            }
        }

        /* renamed from: T */
        public final void m8277T(g gVar, C2317e c2317e) {
            boolean z;
            if (gVar.m8334h(c2317e)) {
                int i = 0;
                if (c2317e == null || !(c2317e.m8212d() || c2317e == this.f9247c.m8183o())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring invalid provider descriptor: ");
                    sb.append(c2317e);
                    z = false;
                } else {
                    List<C2315c> listM8211c = c2317e.m8211c();
                    ArrayList<iwc> arrayList = new ArrayList();
                    ArrayList<iwc> arrayList2 = new ArrayList();
                    z = false;
                    for (C2315c c2315c : listM8211c) {
                        if (c2315c == null || !c2315c.m8159y()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Ignoring invalid system route descriptor: ");
                            sb2.append(c2315c);
                        } else {
                            String strM8147m = c2315c.m8147m();
                            int iM8328b = gVar.m8328b(strM8147m);
                            if (iM8328b < 0) {
                                h hVar = new h(gVar, strM8147m, m8287g(gVar, strM8147m));
                                int i2 = i + 1;
                                gVar.f9303b.add(i, hVar);
                                this.f9252h.add(hVar);
                                if (c2315c.m8145k().size() > 0) {
                                    arrayList.add(new iwc(hVar, c2315c));
                                } else {
                                    hVar.m8340F(c2315c);
                                    if (C2319g.f9228c) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Route added: ");
                                        sb3.append(hVar);
                                    }
                                    this.f9258n.m8308b(257, hVar);
                                }
                                i = i2;
                            } else if (iM8328b < i) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Ignoring route descriptor with duplicate id: ");
                                sb4.append(c2315c);
                            } else {
                                h hVar2 = (h) gVar.f9303b.get(iM8328b);
                                int i3 = i + 1;
                                Collections.swap(gVar.f9303b, iM8328b, i);
                                if (c2315c.m8145k().size() > 0) {
                                    arrayList2.add(new iwc(hVar2, c2315c));
                                } else if (m8279V(hVar2, c2315c) != 0 && hVar2 == this.f9264t) {
                                    z = true;
                                }
                                i = i3;
                            }
                        }
                    }
                    for (iwc iwcVar : arrayList) {
                        h hVar3 = (h) iwcVar.f29291a;
                        hVar3.m8340F((C2315c) iwcVar.f29292b);
                        if (C2319g.f9228c) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Route added: ");
                            sb5.append(hVar3);
                        }
                        this.f9258n.m8308b(257, hVar3);
                    }
                    for (iwc iwcVar2 : arrayList2) {
                        h hVar4 = (h) iwcVar2.f29291a;
                        if (m8279V(hVar4, (C2315c) iwcVar2.f29292b) != 0 && hVar4 == this.f9264t) {
                            z = true;
                        }
                    }
                }
                for (int size = gVar.f9303b.size() - 1; size >= i; size--) {
                    h hVar5 = (h) gVar.f9303b.get(size);
                    hVar5.m8340F(null);
                    this.f9252h.remove(hVar5);
                }
                m8280W(z);
                for (int size2 = gVar.f9303b.size() - 1; size2 >= i; size2--) {
                    h hVar6 = (h) gVar.f9303b.remove(size2);
                    if (C2319g.f9228c) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Route removed: ");
                        sb6.append(hVar6);
                    }
                    this.f9258n.m8308b(258, hVar6);
                }
                if (C2319g.f9228c) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Provider changed: ");
                    sb7.append(gVar);
                }
                this.f9258n.m8308b(515, gVar);
            }
        }

        /* renamed from: U */
        public void m8278U(AbstractC2316d abstractC2316d, C2317e c2317e) {
            g gVarM8290j = m8290j(abstractC2316d);
            if (gVarM8290j != null) {
                m8277T(gVarM8290j, c2317e);
            }
        }

        /* renamed from: V */
        public int m8279V(h hVar, C2315c c2315c) {
            int iM8340F = hVar.m8340F(c2315c);
            if (iM8340F != 0) {
                if ((iM8340F & 1) != 0) {
                    if (C2319g.f9228c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Route changed: ");
                        sb.append(hVar);
                    }
                    this.f9258n.m8308b(259, hVar);
                }
                if ((iM8340F & 2) != 0) {
                    if (C2319g.f9228c) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Route volume changed: ");
                        sb2.append(hVar);
                    }
                    this.f9258n.m8308b(260, hVar);
                }
                if ((iM8340F & 4) != 0) {
                    if (C2319g.f9228c) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Route presentation display changed: ");
                        sb3.append(hVar);
                    }
                    this.f9258n.m8308b(261, hVar);
                }
            }
            return iM8340F;
        }

        /* renamed from: W */
        public void m8280W(boolean z) {
            h hVar = this.f9262r;
            if (hVar != null && !hVar.m8337B()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Clearing the default route because it is no longer selectable: ");
                sb.append(this.f9262r);
                this.f9262r = null;
            }
            if (this.f9262r == null && !this.f9252h.isEmpty()) {
                Iterator it = this.f9252h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h hVar2 = (h) it.next();
                    if (m8258A(hVar2) && hVar2.m8337B()) {
                        this.f9262r = hVar2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found default route: ");
                        sb2.append(this.f9262r);
                        break;
                    }
                }
            }
            h hVar3 = this.f9263s;
            if (hVar3 != null && !hVar3.m8337B()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Clearing the bluetooth route because it is no longer selectable: ");
                sb3.append(this.f9263s);
                this.f9263s = null;
            }
            if (this.f9263s == null && !this.f9252h.isEmpty()) {
                Iterator it2 = this.f9252h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h hVar4 = (h) it2.next();
                    if (m8259B(hVar4) && hVar4.m8337B()) {
                        this.f9263s = hVar4;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Found bluetooth route: ");
                        sb4.append(this.f9263s);
                        break;
                    }
                }
            }
            h hVar5 = this.f9264t;
            if (hVar5 == null || !hVar5.m8370x()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Unselecting the current route because it is no longer selectable: ");
                sb5.append(this.f9264t);
                m8268K(m8288h(), 0);
                return;
            }
            if (z) {
                m8261D();
                m8276S();
            }
        }

        @Override // androidx.mediarouter.media.C2325m.c
        /* renamed from: a */
        public void mo8281a(AbstractC2316d abstractC2316d) {
            if (m8290j(abstractC2316d) == null) {
                g gVar = new g(abstractC2316d);
                this.f9254j.add(gVar);
                if (C2319g.f9228c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Provider added: ");
                    sb.append(gVar);
                }
                this.f9258n.m8308b(513, gVar);
                m8277T(gVar, abstractC2316d.m8183o());
                abstractC2316d.m8186v(this.f9257m);
                abstractC2316d.m8188x(this.f9269y);
            }
        }

        @Override // androidx.mediarouter.media.C2325m.c
        /* renamed from: b */
        public void mo8282b(AbstractC2316d abstractC2316d) {
            g gVarM8290j = m8290j(abstractC2316d);
            if (gVarM8290j != null) {
                abstractC2316d.m8186v(null);
                abstractC2316d.m8188x(null);
                m8277T(gVarM8290j, null);
                if (C2319g.f9228c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Provider removed: ");
                    sb.append(gVarM8290j);
                }
                this.f9258n.m8308b(514, gVarM8290j);
                this.f9254j.remove(gVarM8290j);
            }
        }

        @Override // androidx.mediarouter.media.AbstractC2327o.e
        /* renamed from: c */
        public void mo8283c(String str) {
            h hVarM8327a;
            this.f9258n.removeMessages(262);
            g gVarM8290j = m8290j(this.f9247c);
            if (gVarM8290j == null || (hVarM8327a = gVarM8290j.m8327a(str)) == null) {
                return;
            }
            hVarM8327a.m8343I();
        }

        @Override // androidx.mediarouter.media.C2325m.c
        /* renamed from: d */
        public void mo8284d(ServiceConnectionC2324l serviceConnectionC2324l, AbstractC2316d.e eVar) {
            if (this.f9265u == eVar) {
                m8267J(m8288h(), 2);
            }
        }

        /* renamed from: e */
        public void m8285e(h hVar) {
            if (!(this.f9265u instanceof AbstractC2316d.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a aVarM8296p = m8296p(hVar);
            if (!this.f9264t.m8358l().contains(hVar) && aVarM8296p != null && aVarM8296p.m8374b()) {
                ((AbstractC2316d.b) this.f9265u).mo8099n(hVar.m8351e());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring attempt to add a non-groupable route to dynamic group : ");
            sb.append(hVar);
        }

        /* renamed from: f */
        public void m8286f(Object obj) {
            if (m8291k(obj) < 0) {
                this.f9255k.add(new h(obj));
            }
        }

        /* renamed from: g */
        public String m8287g(g gVar, String str) {
            String strFlattenToShortString = gVar.m8329c().flattenToShortString();
            String str2 = strFlattenToShortString + ":" + str;
            if (m8292l(str2) < 0) {
                this.f9253i.put(new iwc(strFlattenToShortString, str), str2);
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Either ");
            sb.append(str);
            sb.append(" isn't unique in ");
            sb.append(strFlattenToShortString);
            sb.append(" or we're trying to assign a unique ID for an already added route");
            int i = 2;
            while (true) {
                String str3 = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
                if (m8292l(str3) < 0) {
                    this.f9253i.put(new iwc(strFlattenToShortString, str), str3);
                    return str3;
                }
                i++;
            }
        }

        /* renamed from: h */
        public h m8288h() {
            Iterator it = this.f9252h.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar != this.f9262r && m8259B(hVar) && hVar.m8337B()) {
                    return hVar;
                }
            }
            return this.f9262r;
        }

        /* renamed from: i */
        public void m8289i() {
            if (this.f9246b) {
                return;
            }
            this.f9246b = true;
            if (Build.VERSION.SDK_INT >= 30) {
                this.f9249e = MediaTransferReceiver.m8078a(this.f9245a);
            } else {
                this.f9249e = false;
            }
            if (this.f9249e) {
                this.f9250f = new C2313a(this.f9245a, new f());
            } else {
                this.f9250f = null;
            }
            this.f9247c = AbstractC2327o.m8499z(this.f9245a, this);
            m8272O();
        }

        /* renamed from: j */
        public final g m8290j(AbstractC2316d abstractC2316d) {
            int size = this.f9254j.size();
            for (int i = 0; i < size; i++) {
                if (((g) this.f9254j.get(i)).f9302a == abstractC2316d) {
                    return (g) this.f9254j.get(i);
                }
            }
            return null;
        }

        /* renamed from: k */
        public final int m8291k(Object obj) {
            int size = this.f9255k.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.f9255k.get(i)).m8320d() == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: l */
        public final int m8292l(String str) {
            int size = this.f9252h.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.f9252h.get(i)).f9308c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: m */
        public h m8293m() {
            return this.f9263s;
        }

        /* renamed from: n */
        public int m8294n() {
            return this.f9237A;
        }

        /* renamed from: o */
        public h m8295o() {
            h hVar = this.f9262r;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        /* renamed from: p */
        public h.a m8296p(h hVar) {
            return this.f9264t.m8354h(hVar);
        }

        /* renamed from: q */
        public MediaSessionCompat.Token m8297q() {
            e eVar = this.f9240D;
            if (eVar != null) {
                return eVar.m8313c();
            }
            MediaSessionCompat mediaSessionCompat = this.f9242F;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.m3564d();
            }
            return null;
        }

        /* renamed from: r */
        public h m8298r(String str) {
            Iterator it = this.f9252h.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar.f9308c.equals(str)) {
                    return hVar;
                }
            }
            return null;
        }

        /* renamed from: s */
        public C2319g m8299s(Context context) {
            int size = this.f9251g.size();
            while (true) {
                size--;
                if (size < 0) {
                    C2319g c2319g = new C2319g(context);
                    this.f9251g.add(new WeakReference(c2319g));
                    return c2319g;
                }
                C2319g c2319g2 = (C2319g) ((WeakReference) this.f9251g.get(size)).get();
                if (c2319g2 == null) {
                    this.f9251g.remove(size);
                } else if (c2319g2.f9230a == context) {
                    return c2319g2;
                }
            }
        }

        /* renamed from: t */
        public m8b m8300t() {
            return this.f9261q;
        }

        /* renamed from: u */
        public List m8301u() {
            return this.f9252h;
        }

        /* renamed from: v */
        public h m8302v() {
            h hVar = this.f9264t;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* renamed from: w */
        public String m8303w(g gVar, String str) {
            return (String) this.f9253i.get(new iwc(gVar.m8329c().flattenToShortString(), str));
        }

        /* renamed from: x */
        public boolean m8304x() {
            Bundle bundle;
            m8b m8bVar = this.f9261q;
            return m8bVar == null || (bundle = m8bVar.f34969e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
        }

        /* renamed from: y */
        public boolean m8305y() {
            m8b m8bVar;
            return this.f9249e && ((m8bVar = this.f9261q) == null || m8bVar.m38557c());
        }

        /* renamed from: z */
        public boolean m8306z(C2318f c2318f, int i) {
            if (c2318f.m8224f()) {
                return false;
            }
            if ((i & 2) == 0 && this.f9259o) {
                return true;
            }
            m8b m8bVar = this.f9261q;
            boolean z = m8bVar != null && m8bVar.m38558d() && m8305y();
            int size = this.f9252h.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = (h) this.f9252h.get(i2);
                if (((i & 1) == 0 || !hVar.m8369w()) && ((!z || hVar.m8369w() || hVar.m8364r() == this.f9250f) && hVar.m8339E(c2318f))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.mediarouter.media.g$e */
    public interface e {
        zfa onPrepareTransfer(h hVar, h hVar2);
    }

    /* renamed from: androidx.mediarouter.media.g$f */
    public static final class f {

        /* renamed from: a */
        public final AbstractC2316d.e f9292a;

        /* renamed from: b */
        public final int f9293b;

        /* renamed from: c */
        public final h f9294c;

        /* renamed from: d */
        public final h f9295d;

        /* renamed from: e */
        public final h f9296e;

        /* renamed from: f */
        public final List f9297f;

        /* renamed from: g */
        public final WeakReference f9298g;

        /* renamed from: h */
        public zfa f9299h = null;

        /* renamed from: i */
        public boolean f9300i = false;

        /* renamed from: j */
        public boolean f9301j = false;

        public f(d dVar, h hVar, AbstractC2316d.e eVar, int i, h hVar2, Collection collection) {
            this.f9298g = new WeakReference(dVar);
            this.f9295d = hVar;
            this.f9292a = eVar;
            this.f9293b = i;
            this.f9294c = dVar.f9264t;
            this.f9296e = hVar2;
            this.f9297f = collection != null ? new ArrayList(collection) : null;
            dVar.f9258n.postDelayed(new k7b(this), 15000L);
        }

        /* renamed from: a */
        public void m8322a() {
            if (this.f9300i || this.f9301j) {
                return;
            }
            this.f9301j = true;
            AbstractC2316d.e eVar = this.f9292a;
            if (eVar != null) {
                eVar.mo8123i(0);
                this.f9292a.mo8096e();
            }
        }

        /* renamed from: b */
        public void m8323b() {
            zfa zfaVar;
            C2319g.m8231d();
            if (this.f9300i || this.f9301j) {
                return;
            }
            d dVar = (d) this.f9298g.get();
            if (dVar == null || dVar.f9239C != this || ((zfaVar = this.f9299h) != null && zfaVar.isCancelled())) {
                m8322a();
                return;
            }
            this.f9300i = true;
            dVar.f9239C = null;
            m8326e();
            m8324c();
        }

        /* renamed from: c */
        public final void m8324c() {
            d dVar = (d) this.f9298g.get();
            if (dVar == null) {
                return;
            }
            h hVar = this.f9295d;
            dVar.f9264t = hVar;
            dVar.f9265u = this.f9292a;
            h hVar2 = this.f9296e;
            if (hVar2 == null) {
                dVar.f9258n.m8309c(262, new iwc(this.f9294c, hVar), this.f9293b);
            } else {
                dVar.f9258n.m8309c(264, new iwc(hVar2, hVar), this.f9293b);
            }
            dVar.f9268x.clear();
            dVar.m8261D();
            dVar.m8276S();
            List list = this.f9297f;
            if (list != null) {
                dVar.f9264t.m8346L(list);
            }
        }

        /* renamed from: d */
        public void m8325d(zfa zfaVar) {
            d dVar = (d) this.f9298g.get();
            if (dVar == null || dVar.f9239C != this) {
                m8322a();
                return;
            }
            if (this.f9299h != null) {
                throw new IllegalStateException("future is already set");
            }
            this.f9299h = zfaVar;
            k7b k7bVar = new k7b(this);
            final d.HandlerC19568d handlerC19568d = dVar.f9258n;
            Objects.requireNonNull(handlerC19568d);
            zfaVar.addListener(k7bVar, new Executor() { // from class: o.l7b
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handlerC19568d.post(runnable);
                }
            });
        }

        /* renamed from: e */
        public final void m8326e() {
            d dVar = (d) this.f9298g.get();
            if (dVar != null) {
                h hVar = dVar.f9264t;
                h hVar2 = this.f9294c;
                if (hVar != hVar2) {
                    return;
                }
                dVar.f9258n.m8309c(263, hVar2, this.f9293b);
                AbstractC2316d.e eVar = dVar.f9265u;
                if (eVar != null) {
                    eVar.mo8123i(this.f9293b);
                    dVar.f9265u.mo8096e();
                }
                if (!dVar.f9268x.isEmpty()) {
                    for (AbstractC2316d.e eVar2 : dVar.f9268x.values()) {
                        eVar2.mo8123i(this.f9293b);
                        eVar2.mo8096e();
                    }
                    dVar.f9268x.clear();
                }
                dVar.f9265u = null;
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.g$g */
    public static final class g {

        /* renamed from: a */
        public final AbstractC2316d f9302a;

        /* renamed from: b */
        public final List f9303b = new ArrayList();

        /* renamed from: c */
        public final AbstractC2316d.d f9304c;

        /* renamed from: d */
        public C2317e f9305d;

        public g(AbstractC2316d abstractC2316d) {
            this.f9302a = abstractC2316d;
            this.f9304c = abstractC2316d.m8185q();
        }

        /* renamed from: a */
        public h m8327a(String str) {
            int size = this.f9303b.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.f9303b.get(i)).f9307b.equals(str)) {
                    return (h) this.f9303b.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public int m8328b(String str) {
            int size = this.f9303b.size();
            for (int i = 0; i < size; i++) {
                if (((h) this.f9303b.get(i)).f9307b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: c */
        public ComponentName m8329c() {
            return this.f9304c.m8206a();
        }

        /* renamed from: d */
        public String m8330d() {
            return this.f9304c.m8207b();
        }

        /* renamed from: e */
        public AbstractC2316d m8331e() {
            C2319g.m8231d();
            return this.f9302a;
        }

        /* renamed from: f */
        public List m8332f() {
            C2319g.m8231d();
            return Collections.unmodifiableList(this.f9303b);
        }

        /* renamed from: g */
        public boolean m8333g() {
            C2317e c2317e = this.f9305d;
            return c2317e != null && c2317e.m8213e();
        }

        /* renamed from: h */
        public boolean m8334h(C2317e c2317e) {
            if (this.f9305d == c2317e) {
                return false;
            }
            this.f9305d = c2317e;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + m8330d() + " }";
        }
    }

    /* renamed from: androidx.mediarouter.media.g$h */
    public static class h {

        /* renamed from: a */
        public final g f9306a;

        /* renamed from: b */
        public final String f9307b;

        /* renamed from: c */
        public final String f9308c;

        /* renamed from: d */
        public String f9309d;

        /* renamed from: e */
        public String f9310e;

        /* renamed from: f */
        public Uri f9311f;

        /* renamed from: g */
        public boolean f9312g;

        /* renamed from: h */
        public int f9313h;

        /* renamed from: i */
        public boolean f9314i;

        /* renamed from: k */
        public int f9316k;

        /* renamed from: l */
        public int f9317l;

        /* renamed from: m */
        public int f9318m;

        /* renamed from: n */
        public int f9319n;

        /* renamed from: o */
        public int f9320o;

        /* renamed from: p */
        public int f9321p;

        /* renamed from: q */
        public Display f9322q;

        /* renamed from: s */
        public Bundle f9324s;

        /* renamed from: t */
        public IntentSender f9325t;

        /* renamed from: u */
        public C2315c f9326u;

        /* renamed from: w */
        public Map f9328w;

        /* renamed from: j */
        public final ArrayList f9315j = new ArrayList();

        /* renamed from: r */
        public int f9323r = -1;

        /* renamed from: v */
        public List f9327v = new ArrayList();

        /* renamed from: androidx.mediarouter.media.g$h$a */
        public static final class a {

            /* renamed from: a */
            public final AbstractC2316d.b.c f9329a;

            public a(AbstractC2316d.b.c cVar) {
                this.f9329a = cVar;
            }

            /* renamed from: a */
            public int m8373a() {
                AbstractC2316d.b.c cVar = this.f9329a;
                if (cVar != null) {
                    return cVar.m8196c();
                }
                return 1;
            }

            /* renamed from: b */
            public boolean m8374b() {
                AbstractC2316d.b.c cVar = this.f9329a;
                return cVar != null && cVar.m8197d();
            }

            /* renamed from: c */
            public boolean m8375c() {
                AbstractC2316d.b.c cVar = this.f9329a;
                return cVar != null && cVar.m8198e();
            }

            /* renamed from: d */
            public boolean m8376d() {
                AbstractC2316d.b.c cVar = this.f9329a;
                return cVar == null || cVar.m8199f();
            }
        }

        public h(g gVar, String str, String str2) {
            this.f9306a = gVar;
            this.f9307b = str;
            this.f9308c = str2;
        }

        /* renamed from: D */
        public static boolean m8335D(h hVar) {
            return TextUtils.equals(hVar.m8364r().m8185q().m8207b(), CredentialsData.CREDENTIALS_TYPE_ANDROID);
        }

        /* renamed from: A */
        public final boolean m8336A(List list, List list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator listIterator = list.listIterator();
            ListIterator listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!m8372z((IntentFilter) listIterator.next(), (IntentFilter) listIterator2.next())) {
                    return false;
                }
            }
            return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
        }

        /* renamed from: B */
        public boolean m8337B() {
            return this.f9326u != null && this.f9312g;
        }

        /* renamed from: C */
        public boolean m8338C() {
            C2319g.m8231d();
            return C2319g.m8233i().m8302v() == this;
        }

        /* renamed from: E */
        public boolean m8339E(C2318f c2318f) {
            if (c2318f == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            C2319g.m8231d();
            return c2318f.m8226h(this.f9315j);
        }

        /* renamed from: F */
        public int m8340F(C2315c c2315c) {
            if (this.f9326u != c2315c) {
                return m8345K(c2315c);
            }
            return 0;
        }

        /* renamed from: G */
        public void m8341G(int i) {
            C2319g.m8231d();
            C2319g.m8233i().m8265H(this, Math.min(this.f9321p, Math.max(0, i)));
        }

        /* renamed from: H */
        public void m8342H(int i) {
            C2319g.m8231d();
            if (i != 0) {
                C2319g.m8233i().m8266I(this, i);
            }
        }

        /* renamed from: I */
        public void m8343I() {
            C2319g.m8231d();
            C2319g.m8233i().m8267J(this, 3);
        }

        /* renamed from: J */
        public boolean m8344J(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            C2319g.m8231d();
            int size = this.f9315j.size();
            for (int i = 0; i < size; i++) {
                if (((IntentFilter) this.f9315j.get(i)).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: K */
        public int m8345K(C2315c c2315c) {
            int i;
            this.f9326u = c2315c;
            if (c2315c == null) {
                return 0;
            }
            if (s6c.m47909a(this.f9309d, c2315c.m8150p())) {
                i = 0;
            } else {
                this.f9309d = c2315c.m8150p();
                i = 1;
            }
            if (!s6c.m47909a(this.f9310e, c2315c.m8142h())) {
                this.f9310e = c2315c.m8142h();
                i |= 1;
            }
            if (!s6c.m47909a(this.f9311f, c2315c.m8146l())) {
                this.f9311f = c2315c.m8146l();
                i |= 1;
            }
            if (this.f9312g != c2315c.m8158x()) {
                this.f9312g = c2315c.m8158x();
                i |= 1;
            }
            if (this.f9313h != c2315c.m8140f()) {
                this.f9313h = c2315c.m8140f();
                i |= 1;
            }
            if (!m8336A(this.f9315j, c2315c.m8141g())) {
                this.f9315j.clear();
                this.f9315j.addAll(c2315c.m8141g());
                i |= 1;
            }
            if (this.f9316k != c2315c.m8152r()) {
                this.f9316k = c2315c.m8152r();
                i |= 1;
            }
            if (this.f9317l != c2315c.m8151q()) {
                this.f9317l = c2315c.m8151q();
                i |= 1;
            }
            if (this.f9318m != c2315c.m8143i()) {
                this.f9318m = c2315c.m8143i();
                i |= 1;
            }
            if (this.f9319n != c2315c.m8156v()) {
                this.f9319n = c2315c.m8156v();
                i |= 3;
            }
            if (this.f9320o != c2315c.m8155u()) {
                this.f9320o = c2315c.m8155u();
                i |= 3;
            }
            if (this.f9321p != c2315c.m8157w()) {
                this.f9321p = c2315c.m8157w();
                i |= 3;
            }
            if (this.f9323r != c2315c.m8153s()) {
                this.f9323r = c2315c.m8153s();
                this.f9322q = null;
                i |= 5;
            }
            if (!s6c.m47909a(this.f9324s, c2315c.m8144j())) {
                this.f9324s = c2315c.m8144j();
                i |= 1;
            }
            if (!s6c.m47909a(this.f9325t, c2315c.m8154t())) {
                this.f9325t = c2315c.m8154t();
                i |= 1;
            }
            if (this.f9314i != c2315c.m8137b()) {
                this.f9314i = c2315c.m8137b();
                i |= 5;
            }
            List listM8145k = c2315c.m8145k();
            ArrayList arrayList = new ArrayList();
            boolean z = listM8145k.size() != this.f9327v.size();
            if (!listM8145k.isEmpty()) {
                d dVarM8233i = C2319g.m8233i();
                Iterator it = listM8145k.iterator();
                while (it.hasNext()) {
                    h hVarM8298r = dVarM8233i.m8298r(dVarM8233i.m8303w(m8363q(), (String) it.next()));
                    if (hVarM8298r != null) {
                        arrayList.add(hVarM8298r);
                        if (!z && !this.f9327v.contains(hVarM8298r)) {
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return i;
            }
            this.f9327v = arrayList;
            return i | 1;
        }

        /* renamed from: L */
        public void m8346L(Collection collection) {
            this.f9327v.clear();
            if (this.f9328w == null) {
                this.f9328w = new vo0();
            }
            this.f9328w.clear();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC2316d.b.c cVar = (AbstractC2316d.b.c) it.next();
                h hVarM8348b = m8348b(cVar);
                if (hVarM8348b != null) {
                    this.f9328w.put(hVarM8348b.f9308c, cVar);
                    if (cVar.m8196c() == 2 || cVar.m8196c() == 3) {
                        this.f9327v.add(hVarM8348b);
                    }
                }
            }
            C2319g.m8233i().f9258n.m8308b(259, this);
        }

        /* renamed from: a */
        public boolean m8347a() {
            return this.f9314i;
        }

        /* renamed from: b */
        public h m8348b(AbstractC2316d.b.c cVar) {
            return m8363q().m8327a(cVar.m8195b().m8147m());
        }

        /* renamed from: c */
        public int m8349c() {
            return this.f9313h;
        }

        /* renamed from: d */
        public String m8350d() {
            return this.f9310e;
        }

        /* renamed from: e */
        public String m8351e() {
            return this.f9307b;
        }

        /* renamed from: f */
        public int m8352f() {
            return this.f9318m;
        }

        /* renamed from: g */
        public AbstractC2316d.b m8353g() {
            C2319g.m8231d();
            AbstractC2316d.e eVar = C2319g.m8233i().f9265u;
            if (eVar instanceof AbstractC2316d.b) {
                return (AbstractC2316d.b) eVar;
            }
            return null;
        }

        /* renamed from: h */
        public a m8354h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("route must not be null");
            }
            Map map = this.f9328w;
            if (map == null || !map.containsKey(hVar.f9308c)) {
                return null;
            }
            return new a((AbstractC2316d.b.c) this.f9328w.get(hVar.f9308c));
        }

        /* renamed from: i */
        public Bundle m8355i() {
            return this.f9324s;
        }

        /* renamed from: j */
        public Uri m8356j() {
            return this.f9311f;
        }

        /* renamed from: k */
        public String m8357k() {
            return this.f9308c;
        }

        /* renamed from: l */
        public List m8358l() {
            return Collections.unmodifiableList(this.f9327v);
        }

        /* renamed from: m */
        public String m8359m() {
            return this.f9309d;
        }

        /* renamed from: n */
        public int m8360n() {
            return this.f9317l;
        }

        /* renamed from: o */
        public int m8361o() {
            return this.f9316k;
        }

        /* renamed from: p */
        public int m8362p() {
            return this.f9323r;
        }

        /* renamed from: q */
        public g m8363q() {
            return this.f9306a;
        }

        /* renamed from: r */
        public AbstractC2316d m8364r() {
            return this.f9306a.m8331e();
        }

        /* renamed from: s */
        public int m8365s() {
            return this.f9320o;
        }

        /* renamed from: t */
        public int m8366t() {
            if (!m8371y() || C2319g.m8235o()) {
                return this.f9319n;
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.f9308c + ", name=" + this.f9309d + ", description=" + this.f9310e + ", iconUri=" + this.f9311f + ", enabled=" + this.f9312g + ", connectionState=" + this.f9313h + ", canDisconnect=" + this.f9314i + ", playbackType=" + this.f9316k + ", playbackStream=" + this.f9317l + ", deviceType=" + this.f9318m + ", volumeHandling=" + this.f9319n + ", volume=" + this.f9320o + ", volumeMax=" + this.f9321p + ", presentationDisplayId=" + this.f9323r + ", extras=" + this.f9324s + ", settingsIntent=" + this.f9325t + ", providerPackageName=" + this.f9306a.m8330d());
            if (m8371y()) {
                sb.append(", members=[");
                int size = this.f9327v.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (this.f9327v.get(i) != this) {
                        sb.append(((h) this.f9327v.get(i)).m8357k());
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }

        /* renamed from: u */
        public int m8367u() {
            return this.f9321p;
        }

        /* renamed from: v */
        public boolean m8368v() {
            C2319g.m8231d();
            return C2319g.m8233i().m8295o() == this;
        }

        /* renamed from: w */
        public boolean m8369w() {
            if (m8368v() || this.f9318m == 3) {
                return true;
            }
            return m8335D(this) && m8344J("android.media.intent.category.LIVE_AUDIO") && !m8344J("android.media.intent.category.LIVE_VIDEO");
        }

        /* renamed from: x */
        public boolean m8370x() {
            return this.f9312g;
        }

        /* renamed from: y */
        public boolean m8371y() {
            return m8358l().size() >= 1;
        }

        /* renamed from: z */
        public final boolean m8372z(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int iCountActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (iCountActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i = 0; i < iCountActions; i++) {
                if (!intentFilter.getAction(i).equals(intentFilter2.getAction(i))) {
                    return false;
                }
            }
            int iCountCategories = intentFilter.countCategories();
            if (iCountCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i2 = 0; i2 < iCountCategories; i2++) {
                if (!intentFilter.getCategory(i2).equals(intentFilter2.getCategory(i2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public C2319g(Context context) {
        this.f9230a = context;
    }

    /* renamed from: d */
    public static void m8231d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* renamed from: h */
    public static int m8232h() {
        if (f9229d == null) {
            return 0;
        }
        return m8233i().m8294n();
    }

    /* renamed from: i */
    public static d m8233i() {
        d dVar = f9229d;
        if (dVar == null) {
            return null;
        }
        dVar.m8289i();
        return f9229d;
    }

    /* renamed from: j */
    public static C2319g m8234j(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        m8231d();
        if (f9229d == null) {
            f9229d = new d(context.getApplicationContext());
        }
        return f9229d.m8299s(context);
    }

    /* renamed from: o */
    public static boolean m8235o() {
        if (f9229d == null) {
            return false;
        }
        return m8233i().m8304x();
    }

    /* renamed from: p */
    public static boolean m8236p() {
        if (f9229d == null) {
            return false;
        }
        return m8233i().m8305y();
    }

    /* renamed from: r */
    public static boolean m8237r() {
        d dVarM8233i = m8233i();
        if (dVarM8233i == null) {
            return false;
        }
        return dVarM8233i.m8260C();
    }

    /* renamed from: a */
    public void m8238a(C2318f c2318f, a aVar) {
        m8239b(c2318f, aVar, 0);
    }

    /* renamed from: b */
    public void m8239b(C2318f c2318f, a aVar, int i) {
        b bVar;
        boolean z;
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m8231d();
        if (f9228c) {
            StringBuilder sb = new StringBuilder();
            sb.append("addCallback: selector=");
            sb.append(c2318f);
            sb.append(", callback=");
            sb.append(aVar);
            sb.append(", flags=");
            sb.append(Integer.toHexString(i));
        }
        int iM8241e = m8241e(aVar);
        if (iM8241e < 0) {
            bVar = new b(this, aVar);
            this.f9231b.add(bVar);
        } else {
            bVar = (b) this.f9231b.get(iM8241e);
        }
        boolean z2 = true;
        if (i != bVar.f9235d) {
            bVar.f9235d = i;
            z = true;
        } else {
            z = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        bVar.f9236e = jElapsedRealtime;
        if (bVar.f9234c.m8221b(c2318f)) {
            z2 = z;
        } else {
            bVar.f9234c = new C2318f.a(bVar.f9234c).m8229c(c2318f).m8230d();
        }
        if (z2) {
            m8233i().m8274Q();
        }
    }

    /* renamed from: c */
    public void m8240c(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        m8231d();
        m8233i().m8285e(hVar);
    }

    /* renamed from: e */
    public final int m8241e(a aVar) {
        int size = this.f9231b.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.f9231b.get(i)).f9233b == aVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public h m8242f() {
        m8231d();
        d dVarM8233i = m8233i();
        if (dVarM8233i == null) {
            return null;
        }
        return dVarM8233i.m8293m();
    }

    /* renamed from: g */
    public h m8243g() {
        m8231d();
        return m8233i().m8295o();
    }

    /* renamed from: k */
    public MediaSessionCompat.Token m8244k() {
        d dVar = f9229d;
        if (dVar == null) {
            return null;
        }
        return dVar.m8297q();
    }

    /* renamed from: l */
    public m8b m8245l() {
        m8231d();
        d dVarM8233i = m8233i();
        if (dVarM8233i == null) {
            return null;
        }
        return dVarM8233i.m8300t();
    }

    /* renamed from: m */
    public List m8246m() {
        m8231d();
        d dVarM8233i = m8233i();
        return dVarM8233i == null ? Collections.emptyList() : dVarM8233i.m8301u();
    }

    /* renamed from: n */
    public h m8247n() {
        m8231d();
        return m8233i().m8302v();
    }

    /* renamed from: q */
    public boolean m8248q(C2318f c2318f, int i) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        m8231d();
        return m8233i().m8306z(c2318f, i);
    }

    /* renamed from: s */
    public void m8249s(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m8231d();
        if (f9228c) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeCallback: callback=");
            sb.append(aVar);
        }
        int iM8241e = m8241e(aVar);
        if (iM8241e >= 0) {
            this.f9231b.remove(iM8241e);
            m8233i().m8274Q();
        }
    }

    /* renamed from: t */
    public void m8250t(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        m8231d();
        m8233i().m8263F(hVar);
    }

    /* renamed from: u */
    public void m8251u(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        m8231d();
        if (f9228c) {
            StringBuilder sb = new StringBuilder();
            sb.append("selectRoute: ");
            sb.append(hVar);
        }
        m8233i().m8267J(hVar, 3);
    }

    /* renamed from: v */
    public void m8252v(MediaSessionCompat mediaSessionCompat) {
        m8231d();
        if (f9228c) {
            StringBuilder sb = new StringBuilder();
            sb.append("setMediaSessionCompat: ");
            sb.append(mediaSessionCompat);
        }
        m8233i().m8269L(mediaSessionCompat);
    }

    /* renamed from: w */
    public void m8253w(e eVar) {
        m8231d();
        m8233i().f9238B = eVar;
    }

    /* renamed from: x */
    public void m8254x(m8b m8bVar) {
        m8231d();
        m8233i().m8271N(m8bVar);
    }

    /* renamed from: y */
    public void m8255y(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        m8231d();
        m8233i().m8273P(hVar);
    }

    /* renamed from: z */
    public void m8256z(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        m8231d();
        d dVarM8233i = m8233i();
        h hVarM8288h = dVarM8233i.m8288h();
        if (dVarM8233i.m8302v() != hVarM8288h) {
            dVarM8233i.m8267J(hVarM8288h, i);
        }
    }
}
