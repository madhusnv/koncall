package z0;

import android.util.Range;
import c0.InterfaceC0818k;
import c0.d1;
import d7.EnumC1644p;
import d7.EnumC1645q;
import d7.InterfaceC1648t;
import d7.InterfaceC1649u;
import d7.i0;
import e0.C1894c;
import i0.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.ScheduledExecutorServiceC3894d;
import kotlin.jvm.internal.AbstractC4154l;
import m0.C4612f;
import ng.C5070u;
import qi.RunnableC6224g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z0.b */
/* loaded from: classes.dex */
public final class C8836b implements InterfaceC1648t, InterfaceC0818k {

    /* renamed from: b */
    public final InterfaceC1649u f42541b;

    /* renamed from: c */
    public final C4612f f42542c;

    /* renamed from: a */
    public final Object f42540a = new Object();

    /* renamed from: d */
    public boolean f42543d = false;

    /* renamed from: e */
    public d1 f42544e = null;

    public C8836b(InterfaceC1649u interfaceC1649u, C4612f c4612f) {
        this.f42541b = interfaceC1649u;
        this.f42542c = c4612f;
        if (interfaceC1649u.getLifecycle().mo5344b().isAtLeast(EnumC1645q.STARTED)) {
            c4612f.m9492r();
        } else {
            c4612f.m9494v();
        }
        interfaceC1649u.getLifecycle().mo5343a(this);
    }

    @Override // c0.InterfaceC0818k
    /* renamed from: c */
    public final e0 mo2207c() {
        return this.f42542c.f22834a.f16440b;
    }

    /* renamed from: d */
    public final void m16289d(d1 d1Var) {
        synchronized (this.f42540a) {
            try {
                d1 d1Var2 = this.f42544e;
                if (d1Var2 == null) {
                    this.f42544e = d1Var;
                } else if (d1Var.f5066a) {
                    if (!d1Var2.f5066a) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList((List) this.f42544e.f5069d);
                    arrayList.addAll((List) d1Var.f5069d);
                    this.f42544e = new d1(arrayList, (List) d1Var.f5067b);
                } else {
                    if (d1Var2.f5066a) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f42544e = d1Var;
                    C4612f c4612f = this.f42542c;
                    c4612f.m9489C((ArrayList) c4612f.m9497z());
                }
                synchronized (this.f42542c.f22844l) {
                }
                C4612f c4612f2 = this.f42542c;
                List list = (List) d1Var.f5067b;
                synchronized (c4612f2.f22844l) {
                    c4612f2.f22841h = list;
                }
                synchronized (this.f42542c.f22844l) {
                }
                C4612f c4612f3 = this.f42542c;
                Range range = (Range) d1Var.f5070e;
                synchronized (c4612f3.f22844l) {
                    c4612f3.f22842j = range;
                }
                e0 cameraInfoInternal = mo2207c();
                AbstractC4154l.m8923f(cameraInfoInternal, "cameraInfoInternal");
                C1894c c1894cM10005o = C5070u.m10005o(d1Var, cameraInfoInternal);
                ((ScheduledExecutorServiceC3894d) d1Var.f5073h).execute(new RunnableC6224g(24, c1894cM10005o, d1Var));
                this.f42542c.m9490d((List) d1Var.f5069d, c1894cM10005o);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final InterfaceC1649u m16290e() {
        InterfaceC1649u interfaceC1649u;
        synchronized (this.f42540a) {
            interfaceC1649u = this.f42541b;
        }
        return interfaceC1649u;
    }

    /* renamed from: g */
    public final List m16291g() {
        List listUnmodifiableList;
        synchronized (this.f42540a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f42542c.m9497z());
        }
        return listUnmodifiableList;
    }

    @i0(EnumC1644p.ON_DESTROY)
    public void onDestroy(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42540a) {
            C4612f c4612f = this.f42542c;
            c4612f.m9489C((ArrayList) c4612f.m9497z());
        }
    }

    @i0(EnumC1644p.ON_PAUSE)
    public void onPause(InterfaceC1649u interfaceC1649u) {
        this.f42542c.f22834a.mo7313j(false);
    }

    @i0(EnumC1644p.ON_RESUME)
    public void onResume(InterfaceC1649u interfaceC1649u) {
        this.f42542c.f22834a.mo7313j(true);
    }

    @i0(EnumC1644p.ON_START)
    public void onStart(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42540a) {
            try {
                if (!this.f42543d) {
                    this.f42542c.m9492r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @i0(EnumC1644p.ON_STOP)
    public void onStop(InterfaceC1649u interfaceC1649u) {
        synchronized (this.f42540a) {
            try {
                if (!this.f42543d) {
                    this.f42542c.m9494v();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public final void m16292r() {
        synchronized (this.f42540a) {
            try {
                if (this.f42543d) {
                    return;
                }
                onStop(this.f42541b);
                this.f42543d = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public final void m16293s() {
        synchronized (this.f42540a) {
            C4612f c4612f = this.f42542c;
            c4612f.m9489C((ArrayList) c4612f.m9497z());
            this.f42544e = null;
        }
    }

    /* renamed from: t */
    public final void m16294t() {
        synchronized (this.f42540a) {
            try {
                if (this.f42543d) {
                    this.f42543d = false;
                    if (this.f42541b.getLifecycle().mo5344b().isAtLeast(EnumC1645q.STARTED)) {
                        onStart(this.f42541b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
