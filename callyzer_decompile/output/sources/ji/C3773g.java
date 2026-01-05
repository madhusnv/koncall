package ji;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Trace;
import bl.C0689a;
import c9.C0910e;
import c9.C0917l;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.sun.mail.imap.IMAPStore;
import e1.C1903e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k4.C4001v;
import oj.C5391c;
import pg.p7;
import qi.C6219b;
import qi.C6221d;
import qi.C6225h;
import qi.C6230m;
import qj.InterfaceC6237b;
import rf.ComponentCallbacks2C6498c;
import ri.EnumC6554l;
import sf.AbstractC6840z;
import vj.C7714a;
import zf.AbstractC8947b;
import zf.AbstractC8948c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.g */
/* loaded from: classes.dex */
public final class C3773g {

    /* renamed from: k */
    public static final Object f19660k = new Object();

    /* renamed from: l */
    public static final C1903e f19661l = new C1903e(0);

    /* renamed from: a */
    public final Context f19662a;

    /* renamed from: b */
    public final String f19663b;

    /* renamed from: c */
    public final C3775i f19664c;

    /* renamed from: d */
    public final C6225h f19665d;

    /* renamed from: e */
    public final AtomicBoolean f19666e;

    /* renamed from: f */
    public final AtomicBoolean f19667f;

    /* renamed from: g */
    public final C6230m f19668g;

    /* renamed from: h */
    public final InterfaceC6237b f19669h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f19670i;

    /* renamed from: j */
    public final CopyOnWriteArrayList f19671j;

    public C3773g(Context context, String str, C3775i c3775i) throws PackageManager.NameNotFoundException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f19666e = atomicBoolean;
        this.f19667f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f19670i = copyOnWriteArrayList;
        this.f19671j = new CopyOnWriteArrayList();
        this.f19662a = context;
        AbstractC6840z.m13033d(str);
        this.f19663b = str;
        this.f19664c = c3775i;
        C3767a c3767a = FirebaseInitProvider.f7172a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM2641e = new C0917l(13, context, new C4001v(21, ComponentDiscoveryService.class)).m2641e();
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC6554l enumC6554l = EnumC6554l.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM2641e);
        int i10 = 1;
        arrayList.add(new C6221d(i10, new FirebaseCommonRegistrar()));
        arrayList.add(new C6221d(i10, new ExecutorsRegistrar()));
        arrayList2.add(C6219b.m12233c(context, Context.class, new Class[0]));
        arrayList2.add(C6219b.m12233c(this, C3773g.class, new Class[0]));
        arrayList2.add(C6219b.m12233c(c3775i, C3775i.class, new Class[0]));
        C0689a c0689a = new C0689a(18);
        if (p7.m11823c(context) && FirebaseInitProvider.f7173b.get()) {
            arrayList2.add(C6219b.m12233c(c3767a, C3767a.class, new Class[0]));
        }
        C6225h c6225h = new C6225h(enumC6554l, arrayList, arrayList2, c0689a);
        this.f19665d = c6225h;
        Trace.endSection();
        this.f19668g = new C6230m(new C3769c(0, this, context));
        this.f19669h = c6225h.mo12236c(C5391c.class);
        C3770d c3770d = new C3770d(this);
        m8293a();
        if (atomicBoolean.get()) {
            ComponentCallbacks2C6498c.f31211e.f31212a.get();
        }
        copyOnWriteArrayList.add(c3770d);
        Trace.endSection();
    }

    /* renamed from: c */
    public static C3773g m8291c() {
        C3773g c3773g;
        synchronized (f19660k) {
            try {
                c3773g = (C3773g) f19661l.get("[DEFAULT]");
                if (c3773g == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC8948c.m16432a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C5391c) c3773g.f19669h.get()).m11108b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3773g;
    }

    /* renamed from: f */
    public static C3773g m8292f(Context context, C3775i c3775i) {
        C3773g c3773g;
        AtomicReference atomicReference = C3771e.f19657a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C3771e.f19657a;
            if (atomicReference2.get() == null) {
                C3771e c3771e = new C3771e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, c3771e)) {
                        ComponentCallbacks2C6498c.m12509b(application);
                        ComponentCallbacks2C6498c.f31211e.m12510a(c3771e);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f19660k) {
            C1903e c1903e = f19661l;
            AbstractC6840z.m13038i("FirebaseApp name [DEFAULT] already exists!", !c1903e.containsKey("[DEFAULT]"));
            AbstractC6840z.m13037h(context, "Application context cannot be null.");
            c3773g = new C3773g(context, "[DEFAULT]", c3775i);
            c1903e.put("[DEFAULT]", c3773g);
        }
        c3773g.m8296e();
        return c3773g;
    }

    /* renamed from: a */
    public final void m8293a() {
        AbstractC6840z.m13038i("FirebaseApp was deleted", !this.f19667f.get());
    }

    /* renamed from: b */
    public final Object m8294b(Class cls) {
        m8293a();
        return this.f19665d.mo12234a(cls);
    }

    /* renamed from: d */
    public final String m8295d() {
        StringBuilder sb2 = new StringBuilder();
        m8293a();
        sb2.append(AbstractC8947b.m16426c(this.f19663b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        m8293a();
        sb2.append(AbstractC8947b.m16426c(this.f19664c.f19678b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    /* renamed from: e */
    public final void m8296e() {
        Context context = this.f19662a;
        if (p7.m11823c(context)) {
            m8293a();
            m8293a();
            this.f19665d.m12242i("[DEFAULT]".equals(this.f19663b));
            ((C5391c) this.f19669h.get()).m11108b();
            return;
        }
        m8293a();
        AtomicReference atomicReference = C3772f.f19658b;
        if (atomicReference.get() == null) {
            C3772f c3772f = new C3772f(context);
            while (!atomicReference.compareAndSet(null, c3772f)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c3772f, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3773g)) {
            return false;
        }
        C3773g c3773g = (C3773g) obj;
        c3773g.m8293a();
        return this.f19663b.equals(c3773g.f19663b);
    }

    /* renamed from: g */
    public final boolean m8297g() {
        boolean z6;
        m8293a();
        C7714a c7714a = (C7714a) this.f19668g.get();
        synchronized (c7714a) {
            z6 = c7714a.f37242a;
        }
        return z6;
    }

    public final int hashCode() {
        return this.f19663b.hashCode();
    }

    public final String toString() {
        C0910e c0910e = new C0910e(this);
        c0910e.m2606p(this.f19663b, IMAPStore.ID_NAME);
        c0910e.m2606p(this.f19664c, "options");
        return c0910e.toString();
    }
}
