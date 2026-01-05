package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import java.util.Iterator;
import java.util.Map;
import p001o.c0f;
import p001o.eo0;
import p001o.n9c;
import p001o.xca;

/* renamed from: androidx.lifecycle.n */
/* loaded from: classes2.dex */
public abstract class AbstractC2145n {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private c0f mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* renamed from: androidx.lifecycle.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC2145n.this.mDataLock) {
                obj = AbstractC2145n.this.mPendingData;
                AbstractC2145n.this.mPendingData = AbstractC2145n.NOT_SET;
            }
            AbstractC2145n.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.n$b */
    public class b extends d {
        public b(n9c n9cVar) {
            super(n9cVar);
        }

        @Override // androidx.lifecycle.AbstractC2145n.d
        /* renamed from: d */
        public boolean mo6549d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.n$c */
    public class c extends d implements InterfaceC2142k {

        /* renamed from: e */
        public final xca f7696e;

        public c(xca xcaVar, n9c n9cVar) {
            super(n9cVar);
            this.f7696e = xcaVar;
        }

        @Override // androidx.lifecycle.AbstractC2145n.d
        /* renamed from: b */
        public void mo6550b() {
            this.f7696e.getLifecycle().mo6524d(this);
        }

        @Override // androidx.lifecycle.AbstractC2145n.d
        /* renamed from: c */
        public boolean mo6551c(xca xcaVar) {
            return this.f7696e == xcaVar;
        }

        @Override // androidx.lifecycle.AbstractC2145n.d
        /* renamed from: d */
        public boolean mo6549d() {
            return this.f7696e.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            AbstractC2139h.b bVarMo6522b = this.f7696e.getLifecycle().mo6522b();
            if (bVarMo6522b == AbstractC2139h.b.DESTROYED) {
                AbstractC2145n.this.removeObserver(this.f7698a);
                return;
            }
            AbstractC2139h.b bVar = null;
            while (bVar != bVarMo6522b) {
                m6552a(mo6549d());
                bVar = bVarMo6522b;
                bVarMo6522b = this.f7696e.getLifecycle().mo6522b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.n$d */
    public abstract class d {

        /* renamed from: a */
        public final n9c f7698a;

        /* renamed from: b */
        public boolean f7699b;

        /* renamed from: c */
        public int f7700c = -1;

        public d(n9c n9cVar) {
            this.f7698a = n9cVar;
        }

        /* renamed from: a */
        public void m6552a(boolean z) {
            if (z == this.f7699b) {
                return;
            }
            this.f7699b = z;
            AbstractC2145n.this.changeActiveCounter(z ? 1 : -1);
            if (this.f7699b) {
                AbstractC2145n.this.dispatchingValue(this);
            }
        }

        /* renamed from: b */
        public void mo6550b() {
        }

        /* renamed from: c */
        public boolean mo6551c(xca xcaVar) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo6549d();
    }

    public AbstractC2145n(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new c0f();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (eo0.m25356h().mo25360c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: b */
    public final void m6548b(d dVar) {
        if (dVar.f7699b) {
            if (!dVar.mo6549d()) {
                dVar.m6552a(false);
                return;
            }
            int i = dVar.f7700c;
            int i2 = this.mVersion;
            if (i >= i2) {
                return;
            }
            dVar.f7700c = i2;
            dVar.f7698a.onChanged(this.mData);
        }
    }

    public void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    onActive();
                } else if (z2) {
                    onInactive();
                }
                i2 = i3;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    public void dispatchingValue(androidx.lifecycle.n.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                m6548b(dVar);
                dVar = null;
            } else {
                c0f.C12527d c12527dM20018e = this.mObservers.m20018e();
                while (c12527dM20018e.hasNext()) {
                    m6548b((d) ((Map.Entry) c12527dM20018e.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(xca xcaVar, n9c n9cVar) {
        assertMainThread("observe");
        if (xcaVar.getLifecycle().mo6522b() == AbstractC2139h.b.DESTROYED) {
            return;
        }
        c cVar = new c(xcaVar, n9cVar);
        d dVar = (d) this.mObservers.mo19712l(n9cVar, cVar);
        if (dVar != null && !dVar.mo6551c(xcaVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        xcaVar.getLifecycle().mo6521a(cVar);
    }

    public void observeForever(n9c n9cVar) {
        assertMainThread("observeForever");
        b bVar = new b(n9cVar);
        d dVar = (d) this.mObservers.mo19712l(n9cVar, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.m6552a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object obj) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = obj;
        }
        if (z) {
            eo0.m25356h().mo25361d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(n9c n9cVar) {
        assertMainThread("removeObserver");
        d dVar = (d) this.mObservers.mo19713m(n9cVar);
        if (dVar == null) {
            return;
        }
        dVar.mo6550b();
        dVar.m6552a(false);
    }

    public void removeObservers(xca xcaVar) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((d) entry.getValue()).mo6551c(xcaVar)) {
                removeObserver((n9c) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public AbstractC2145n() {
        this.mDataLock = new Object();
        this.mObservers = new c0f();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
