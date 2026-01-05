package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p001o.k27;

/* loaded from: classes2.dex */
public final class dga {

    /* renamed from: a */
    public final jb3 f19787a;

    /* renamed from: b */
    public final uw7 f19788b;

    /* renamed from: c */
    public final InterfaceC12902b f19789c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f19790d;

    /* renamed from: e */
    public final ArrayDeque f19791e;

    /* renamed from: f */
    public final ArrayDeque f19792f;

    /* renamed from: g */
    public final Object f19793g;

    /* renamed from: h */
    public boolean f19794h;

    /* renamed from: i */
    public boolean f19795i;

    /* renamed from: o.dga$a */
    public interface InterfaceC12901a {
        void invoke(Object obj);
    }

    /* renamed from: o.dga$b */
    public interface InterfaceC12902b {
        /* renamed from: a */
        void mo23025a(Object obj, k27 k27Var);
    }

    /* renamed from: o.dga$c */
    public static final class C12903c {

        /* renamed from: a */
        public final Object f19796a;

        /* renamed from: b */
        public k27.C14706b f19797b = new k27.C14706b();

        /* renamed from: c */
        public boolean f19798c;

        /* renamed from: d */
        public boolean f19799d;

        public C12903c(Object obj) {
            this.f19796a = obj;
        }

        /* renamed from: a */
        public void m23026a(int i, InterfaceC12901a interfaceC12901a) {
            if (this.f19799d) {
                return;
            }
            if (i != -1) {
                this.f19797b.m34926a(i);
            }
            this.f19798c = true;
            interfaceC12901a.invoke(this.f19796a);
        }

        /* renamed from: b */
        public void m23027b(InterfaceC12902b interfaceC12902b) {
            if (this.f19799d || !this.f19798c) {
                return;
            }
            k27 k27VarM34930e = this.f19797b.m34930e();
            this.f19797b = new k27.C14706b();
            this.f19798c = false;
            interfaceC12902b.mo23025a(this.f19796a, k27VarM34930e);
        }

        /* renamed from: c */
        public void m23028c(InterfaceC12902b interfaceC12902b) {
            this.f19799d = true;
            if (this.f19798c) {
                this.f19798c = false;
                interfaceC12902b.mo23025a(this.f19796a, this.f19797b.m34930e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12903c.class != obj.getClass()) {
                return false;
            }
            return this.f19796a.equals(((C12903c) obj).f19796a);
        }

        public int hashCode() {
            return this.f19796a.hashCode();
        }
    }

    public dga(Looper looper, jb3 jb3Var, InterfaceC12902b interfaceC12902b) {
        this(new CopyOnWriteArraySet(), looper, jb3Var, interfaceC12902b, true);
    }

    /* renamed from: h */
    public static /* synthetic */ void m23014h(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC12901a interfaceC12901a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C12903c) it.next()).m23026a(i, interfaceC12901a);
        }
    }

    /* renamed from: c */
    public void m23015c(Object obj) {
        op0.m42515e(obj);
        synchronized (this.f19793g) {
            if (this.f19794h) {
                return;
            }
            this.f19790d.add(new C12903c(obj));
        }
    }

    /* renamed from: d */
    public dga m23016d(Looper looper, jb3 jb3Var, InterfaceC12902b interfaceC12902b) {
        return new dga(this.f19790d, looper, jb3Var, interfaceC12902b, this.f19795i);
    }

    /* renamed from: e */
    public dga m23017e(Looper looper, InterfaceC12902b interfaceC12902b) {
        return m23016d(looper, this.f19787a, interfaceC12902b);
    }

    /* renamed from: f */
    public void m23018f() {
        m23024m();
        if (this.f19792f.isEmpty()) {
            return;
        }
        if (!this.f19788b.mo28833b(1)) {
            uw7 uw7Var = this.f19788b;
            uw7Var.mo28838g(uw7Var.mo28832a(1));
        }
        boolean z = !this.f19791e.isEmpty();
        this.f19791e.addAll(this.f19792f);
        this.f19792f.clear();
        if (z) {
            return;
        }
        while (!this.f19791e.isEmpty()) {
            ((Runnable) this.f19791e.peekFirst()).run();
            this.f19791e.removeFirst();
        }
    }

    /* renamed from: g */
    public final boolean m23019g(Message message) {
        Iterator it = this.f19790d.iterator();
        while (it.hasNext()) {
            ((C12903c) it.next()).m23027b(this.f19789c);
            if (this.f19788b.mo28833b(1)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: i */
    public void m23020i(final int i, final InterfaceC12901a interfaceC12901a) {
        m23024m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f19790d);
        this.f19792f.add(new Runnable() { // from class: o.cga
            @Override // java.lang.Runnable
            public final void run() {
                dga.m23014h(copyOnWriteArraySet, i, interfaceC12901a);
            }
        });
    }

    /* renamed from: j */
    public void m23021j() {
        m23024m();
        synchronized (this.f19793g) {
            this.f19794h = true;
        }
        Iterator it = this.f19790d.iterator();
        while (it.hasNext()) {
            ((C12903c) it.next()).m23028c(this.f19789c);
        }
        this.f19790d.clear();
    }

    /* renamed from: k */
    public void m23022k(Object obj) {
        m23024m();
        Iterator it = this.f19790d.iterator();
        while (it.hasNext()) {
            C12903c c12903c = (C12903c) it.next();
            if (c12903c.f19796a.equals(obj)) {
                c12903c.m23028c(this.f19789c);
                this.f19790d.remove(c12903c);
            }
        }
    }

    /* renamed from: l */
    public void m23023l(int i, InterfaceC12901a interfaceC12901a) {
        m23020i(i, interfaceC12901a);
        m23018f();
    }

    /* renamed from: m */
    public final void m23024m() {
        if (this.f19795i) {
            op0.m42517g(Thread.currentThread() == this.f19788b.mo28836e().getThread());
        }
    }

    public dga(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, jb3 jb3Var, InterfaceC12902b interfaceC12902b, boolean z) {
        this.f19787a = jb3Var;
        this.f19790d = copyOnWriteArraySet;
        this.f19789c = interfaceC12902b;
        this.f19793g = new Object();
        this.f19791e = new ArrayDeque();
        this.f19792f = new ArrayDeque();
        this.f19788b = jb3Var.mo21305b(looper, new Handler.Callback() { // from class: o.bga
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f16145a.m23019g(message);
            }
        });
        this.f19795i = z;
    }
}
