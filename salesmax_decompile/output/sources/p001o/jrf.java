package p001o;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.SidecarCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p001o.jrf;
import p001o.kp6;

/* loaded from: classes2.dex */
public final class jrf implements u8j {

    /* renamed from: d */
    public static volatile jrf f31007d;

    /* renamed from: a */
    public kp6 f31009a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f31010b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static final C14641a f31006c = new C14641a(null);

    /* renamed from: e */
    public static final ReentrantLock f31008e = new ReentrantLock();

    /* renamed from: o.jrf$a */
    public static final class C14641a {
        public C14641a() {
        }

        public /* synthetic */ C14641a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final jrf m34404a(Context context) {
            sq8.m48649h(context, "context");
            if (jrf.f31007d == null) {
                ReentrantLock reentrantLock = jrf.f31008e;
                reentrantLock.lock();
                try {
                    if (jrf.f31007d == null) {
                        jrf.f31007d = new jrf(jrf.f31006c.m34405b(context));
                    }
                    y3i y3iVar = y3i.f54824a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            jrf jrfVar = jrf.f31007d;
            sq8.m48646e(jrfVar);
            return jrfVar;
        }

        /* renamed from: b */
        public final kp6 m34405b(Context context) {
            sq8.m48649h(context, "context");
            try {
                if (!m34406c(SidecarCompat.f10555f.m10098c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.m10095l()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final boolean m34406c(oti otiVar) {
            return otiVar != null && otiVar.compareTo(oti.f38921f.m42695a()) >= 0;
        }
    }

    /* renamed from: o.jrf$b */
    public final class C14642b implements kp6.InterfaceC14897a {

        /* renamed from: a */
        public final /* synthetic */ jrf f31011a;

        public C14642b(jrf jrfVar) {
            sq8.m48649h(jrfVar, "this$0");
            this.f31011a = jrfVar;
        }

        @Override // p001o.kp6.InterfaceC14897a
        /* renamed from: a */
        public void mo10099a(Activity activity, taj tajVar) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(tajVar, "newLayout");
            Iterator it = this.f31011a.m34402h().iterator();
            while (it.hasNext()) {
                C14643c c14643c = (C14643c) it.next();
                if (sq8.m48644c(c14643c.m34410d(), activity)) {
                    c14643c.m34409b(tajVar);
                }
            }
        }
    }

    /* renamed from: o.jrf$c */
    public static final class C14643c {

        /* renamed from: a */
        public final Activity f31012a;

        /* renamed from: b */
        public final Executor f31013b;

        /* renamed from: c */
        public final hu3 f31014c;

        /* renamed from: d */
        public taj f31015d;

        public C14643c(Activity activity, Executor executor, hu3 hu3Var) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(executor, "executor");
            sq8.m48649h(hu3Var, "callback");
            this.f31012a = activity;
            this.f31013b = executor;
            this.f31014c = hu3Var;
        }

        /* renamed from: c */
        public static final void m34408c(C14643c c14643c, taj tajVar) {
            sq8.m48649h(c14643c, "this$0");
            sq8.m48649h(tajVar, "$newLayoutInfo");
            c14643c.f31014c.accept(tajVar);
        }

        /* renamed from: b */
        public final void m34409b(final taj tajVar) {
            sq8.m48649h(tajVar, "newLayoutInfo");
            this.f31015d = tajVar;
            this.f31013b.execute(new Runnable() { // from class: o.krf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.C14643c.m34408c(this.f32609a, tajVar);
                }
            });
        }

        /* renamed from: d */
        public final Activity m34410d() {
            return this.f31012a;
        }

        /* renamed from: e */
        public final hu3 m34411e() {
            return this.f31014c;
        }

        /* renamed from: f */
        public final taj m34412f() {
            return this.f31015d;
        }
    }

    public jrf(kp6 kp6Var) {
        this.f31009a = kp6Var;
        kp6 kp6Var2 = this.f31009a;
        if (kp6Var2 == null) {
            return;
        }
        kp6Var2.mo10089c(new C14642b(this));
    }

    @Override // p001o.u8j
    /* renamed from: a */
    public void mo34398a(Activity activity, Executor executor, hu3 hu3Var) {
        taj tajVarM34412f;
        Object next;
        sq8.m48649h(activity, "activity");
        sq8.m48649h(executor, "executor");
        sq8.m48649h(hu3Var, "callback");
        ReentrantLock reentrantLock = f31008e;
        reentrantLock.lock();
        try {
            kp6 kp6VarM34401g = m34401g();
            if (kp6VarM34401g == null) {
                hu3Var.accept(new taj(ch3.m21246k()));
                return;
            }
            boolean zM34403i = m34403i(activity);
            C14643c c14643c = new C14643c(activity, executor, hu3Var);
            m34402h().add(c14643c);
            if (zM34403i) {
                Iterator it = m34402h().iterator();
                while (true) {
                    tajVarM34412f = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (sq8.m48644c(activity, ((C14643c) next).m34410d())) {
                            break;
                        }
                    }
                }
                C14643c c14643c2 = (C14643c) next;
                if (c14643c2 != null) {
                    tajVarM34412f = c14643c2.m34412f();
                }
                if (tajVarM34412f != null) {
                    c14643c.m34409b(tajVarM34412f);
                }
            } else {
                kp6VarM34401g.mo10087a(activity);
            }
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p001o.u8j
    /* renamed from: b */
    public void mo34399b(hu3 hu3Var) {
        sq8.m48649h(hu3Var, "callback");
        synchronized (f31008e) {
            if (m34401g() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = m34402h().iterator();
            while (it.hasNext()) {
                C14643c c14643c = (C14643c) it.next();
                if (c14643c.m34411e() == hu3Var) {
                    sq8.m48648g(c14643c, "callbackWrapper");
                    arrayList.add(c14643c);
                }
            }
            m34402h().removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m34400f(((C14643c) it2.next()).m34410d());
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: f */
    public final void m34400f(Activity activity) {
        kp6 kp6Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f31010b;
        boolean z = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (sq8.m48644c(((C14643c) it.next()).m34410d(), activity)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || (kp6Var = this.f31009a) == null) {
            return;
        }
        kp6Var.mo10088b(activity);
    }

    /* renamed from: g */
    public final kp6 m34401g() {
        return this.f31009a;
    }

    /* renamed from: h */
    public final CopyOnWriteArrayList m34402h() {
        return this.f31010b;
    }

    /* renamed from: i */
    public final boolean m34403i(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f31010b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (sq8.m48644c(((C14643c) it.next()).m34410d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
