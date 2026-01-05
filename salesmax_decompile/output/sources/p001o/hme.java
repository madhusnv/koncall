package p001o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.it3;

/* loaded from: classes5.dex */
public class hme implements ComponentCallbacks2, vca {

    /* renamed from: a */
    public final ComponentCallbacks2C10724a f27176a;

    /* renamed from: b */
    public final Context f27177b;

    /* renamed from: c */
    public final qca f27178c;

    /* renamed from: d */
    public final wme f27179d;

    /* renamed from: e */
    public final kme f27180e;

    /* renamed from: f */
    public final ujg f27181f;

    /* renamed from: g */
    public final Runnable f27182g;

    /* renamed from: h */
    public final it3 f27183h;

    /* renamed from: q */
    public final CopyOnWriteArrayList f27184q;

    /* renamed from: s */
    public qme f27185s;

    /* renamed from: x */
    public boolean f27186x;

    /* renamed from: y */
    public static final qme f27175y = (qme) qme.m0(Bitmap.class).mo17809P();

    /* renamed from: H */
    public static final qme f27173H = (qme) qme.m0(js7.class).mo17809P();

    /* renamed from: L */
    public static final qme f27174L = (qme) ((qme) qme.n0(qt5.f42384c).mo17814W(gid.LOW)).e0(true);

    /* renamed from: o.hme$a */
    public class RunnableC14003a implements Runnable {
        public RunnableC14003a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hme hmeVar = hme.this;
            hmeVar.f27178c.mo43994a(hmeVar);
        }
    }

    /* renamed from: o.hme$b */
    public class C14004b implements it3.InterfaceC14366a {

        /* renamed from: a */
        public final wme f27188a;

        public C14004b(wme wmeVar) {
            this.f27188a = wmeVar;
        }

        @Override // p001o.it3.InterfaceC14366a
        /* renamed from: a */
        public void mo19874a(boolean z) {
            if (z) {
                synchronized (hme.this) {
                    this.f27188a.m54719e();
                }
            }
        }
    }

    public hme(ComponentCallbacks2C10724a componentCallbacks2C10724a, qca qcaVar, kme kmeVar, Context context) {
        this(componentCallbacks2C10724a, qcaVar, kmeVar, new wme(), componentCallbacks2C10724a.m12657g(), context);
    }

    /* renamed from: A */
    public synchronized boolean m30818A(pjg pjgVar) {
        wle wleVarMo36380a = pjgVar.mo36380a();
        if (wleVarMo36380a == null) {
            return true;
        }
        if (!this.f27179d.m54715a(wleVarMo36380a)) {
            return false;
        }
        this.f27181f.m51660l(pjgVar);
        pjgVar.mo36382d(null);
        return true;
    }

    /* renamed from: B */
    public final void m30819B(pjg pjgVar) {
        boolean zM30818A = m30818A(pjgVar);
        wle wleVarMo36380a = pjgVar.mo36380a();
        if (zM30818A || this.f27176a.m12663p(pjgVar) || wleVarMo36380a == null) {
            return;
        }
        pjgVar.mo36382d(null);
        wleVarMo36380a.clear();
    }

    /* renamed from: c */
    public yle mo21760c(Class cls) {
        return new yle(this.f27176a, this, cls, this.f27177b);
    }

    /* renamed from: f */
    public yle mo21761f() {
        return mo21760c(Bitmap.class).n0(f27175y);
    }

    /* renamed from: k */
    public yle mo21762k() {
        return mo21760c(Drawable.class);
    }

    /* renamed from: l */
    public void m30820l(pjg pjgVar) {
        if (pjgVar == null) {
            return;
        }
        m30819B(pjgVar);
    }

    /* renamed from: m */
    public List m30821m() {
        return this.f27184q;
    }

    /* renamed from: n */
    public synchronized qme m30822n() {
        return this.f27185s;
    }

    /* renamed from: o */
    public ovh m30823o(Class cls) {
        return this.f27176a.m12659i().m12672e(cls);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p001o.vca
    public synchronized void onDestroy() {
        this.f27181f.onDestroy();
        Iterator it = this.f27181f.m51658f().iterator();
        while (it.hasNext()) {
            m30820l((pjg) it.next());
        }
        this.f27181f.m51657c();
        this.f27179d.m54716b();
        this.f27178c.mo43995b(this);
        this.f27178c.mo43995b(this.f27183h);
        uqi.m51940u(this.f27182g);
        this.f27176a.m12665s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p001o.vca
    public synchronized void onStart() {
        m30832x();
        this.f27181f.onStart();
    }

    @Override // p001o.vca
    public synchronized void onStop() {
        m30831w();
        this.f27181f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f27186x) {
            m30830v();
        }
    }

    /* renamed from: p */
    public yle m30824p(Drawable drawable) {
        return mo21762k().C0(drawable);
    }

    /* renamed from: q */
    public yle m30825q(Uri uri) {
        return mo21762k().D0(uri);
    }

    /* renamed from: r */
    public yle m30826r(Integer num) {
        return mo21762k().E0(num);
    }

    /* renamed from: s */
    public yle m30827s(String str) {
        return mo21762k().I0(str);
    }

    /* renamed from: t */
    public yle m30828t(URL url) {
        return mo21762k().J0(url);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f27179d + ", treeNode=" + this.f27180e + "}";
    }

    /* renamed from: u */
    public synchronized void m30829u() {
        this.f27179d.m54717c();
    }

    /* renamed from: v */
    public synchronized void m30830v() {
        m30829u();
        Iterator it = this.f27180e.mo12711a().iterator();
        while (it.hasNext()) {
            ((hme) it.next()).m30829u();
        }
    }

    /* renamed from: w */
    public synchronized void m30831w() {
        this.f27179d.m54718d();
    }

    /* renamed from: x */
    public synchronized void m30832x() {
        this.f27179d.m54720f();
    }

    /* renamed from: y */
    public synchronized void mo21763y(qme qmeVar) {
        this.f27185s = (qme) ((qme) qmeVar.r0()).mo17816b();
    }

    /* renamed from: z */
    public synchronized void m30833z(pjg pjgVar, wle wleVar) {
        this.f27181f.m51659k(pjgVar);
        this.f27179d.m54721g(wleVar);
    }

    public hme(ComponentCallbacks2C10724a componentCallbacks2C10724a, qca qcaVar, kme kmeVar, wme wmeVar, jt3 jt3Var, Context context) {
        this.f27181f = new ujg();
        RunnableC14003a runnableC14003a = new RunnableC14003a();
        this.f27182g = runnableC14003a;
        this.f27176a = componentCallbacks2C10724a;
        this.f27178c = qcaVar;
        this.f27180e = kmeVar;
        this.f27179d = wmeVar;
        this.f27177b = context;
        it3 it3VarMo30251a = jt3Var.mo30251a(context.getApplicationContext(), new C14004b(wmeVar));
        this.f27183h = it3VarMo30251a;
        if (uqi.m51935p()) {
            uqi.m51939t(runnableC14003a);
        } else {
            qcaVar.mo43994a(this);
        }
        qcaVar.mo43994a(it3VarMo30251a);
        this.f27184q = new CopyOnWriteArrayList(componentCallbacks2C10724a.m12659i().m12670c());
        mo21763y(componentCallbacks2C10724a.m12659i().m12671d());
        componentCallbacks2C10724a.m12662o(this);
    }
}
