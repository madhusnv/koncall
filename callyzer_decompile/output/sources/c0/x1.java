package c0;

import a1.C0004c;
import a1.C0005d;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import b6.InterfaceC0600a;
import i0.C3082m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k0.ExecutorC3891a;
import l0.AbstractC4308h;
import l0.RunnableC4307g;
import nf.C5047i;
import pg.i7;
import pg.t8;
import q0.RunnableC6064e;
import x4.C8299i;
import x4.C8302l;
import x4.InterfaceC8300j;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a */
    public final Object f5258a = new Object();

    /* renamed from: b */
    public final Size f5259b;

    /* renamed from: c */
    public final a0 f5260c;

    /* renamed from: d */
    public final i0.g0 f5261d;

    /* renamed from: e */
    public final boolean f5262e;

    /* renamed from: f */
    public final C8302l f5263f;

    /* renamed from: g */
    public final C8299i f5264g;

    /* renamed from: h */
    public final C8302l f5265h;

    /* renamed from: i */
    public final C8299i f5266i;

    /* renamed from: j */
    public final C8299i f5267j;

    /* renamed from: k */
    public final u1 f5268k;

    /* renamed from: l */
    public C0817j f5269l;

    /* renamed from: m */
    public w1 f5270m;

    /* renamed from: n */
    public Executor f5271n;

    static {
        Range range = C3082m.f16521h;
    }

    public x1(Size size, i0.g0 g0Var, boolean z6, a0 a0Var, RunnableC6064e runnableC6064e) {
        this.f5259b = size;
        this.f5261d = g0Var;
        this.f5262e = z6;
        og.y0.m11051a("SurfaceRequest's DynamicRange must always be fully specified.", a0Var.m2139b());
        this.f5260c = a0Var;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i10 = 0;
        C8302l c8302lM11697b = i7.m11697b(new InterfaceC8300j() { // from class: c0.r1
            @Override // x4.InterfaceC8300j
            /* renamed from: I */
            public final Object mo15I(C8299i c8299i) {
                switch (i10) {
                    case 0:
                        atomicReference.set(c8299i);
                        return str + "-cancellation";
                    case 1:
                        atomicReference.set(c8299i);
                        return str + "-status";
                    default:
                        atomicReference.set(c8299i);
                        return str + "-Surface";
                }
            }
        });
        C8299i c8299i = (C8299i) atomicReference.get();
        c8299i.getClass();
        this.f5267j = c8299i;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i11 = 1;
        C8302l c8302lM11697b2 = i7.m11697b(new InterfaceC8300j() { // from class: c0.r1
            @Override // x4.InterfaceC8300j
            /* renamed from: I */
            public final Object mo15I(C8299i c8299i2) {
                switch (i11) {
                    case 0:
                        atomicReference2.set(c8299i2);
                        return str + "-cancellation";
                    case 1:
                        atomicReference2.set(c8299i2);
                        return str + "-status";
                    default:
                        atomicReference2.set(c8299i2);
                        return str + "-Surface";
                }
            }
        });
        this.f5265h = c8302lM11697b2;
        c8302lM11697b2.mo9026a(new RunnableC4307g(0, c8302lM11697b2, new C0833z(1, c8299i, c8302lM11697b)), t8.m11872a());
        C8299i c8299i2 = (C8299i) atomicReference2.get();
        c8299i2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i12 = 2;
        C8302l c8302lM11697b3 = i7.m11697b(new InterfaceC8300j() { // from class: c0.r1
            @Override // x4.InterfaceC8300j
            /* renamed from: I */
            public final Object mo15I(C8299i c8299i22) {
                switch (i12) {
                    case 0:
                        atomicReference3.set(c8299i22);
                        return str + "-cancellation";
                    case 1:
                        atomicReference3.set(c8299i22);
                        return str + "-status";
                    default:
                        atomicReference3.set(c8299i22);
                        return str + "-Surface";
                }
            }
        });
        this.f5263f = c8302lM11697b3;
        C8299i c8299i3 = (C8299i) atomicReference3.get();
        c8299i3.getClass();
        this.f5264g = c8299i3;
        u1 u1Var = new u1(this, size);
        this.f5268k = u1Var;
        InterfaceFutureC8957d interfaceFutureC8957dM9034d = AbstractC4308h.m9034d(u1Var.f16604e);
        c8302lM11697b3.mo9026a(new RunnableC4307g(0, c8302lM11697b3, new C0005d(3, interfaceFutureC8957dM9034d, c8299i2, str, false)), t8.m11872a());
        interfaceFutureC8957dM9034d.mo9026a(new s1(this, 0), t8.m11872a());
        ExecutorC3891a executorC3891aM11872a = t8.m11872a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        C8302l c8302lM11697b4 = i7.m11697b(new C0004c(9, this, atomicReference4));
        c8302lM11697b4.mo9026a(new RunnableC4307g(0, c8302lM11697b4, new C5047i(6, runnableC6064e)), executorC3891aM11872a);
        C8299i c8299i4 = (C8299i) atomicReference4.get();
        c8299i4.getClass();
        this.f5266i = c8299i4;
    }

    /* renamed from: a */
    public final void m2236a(final Surface surface, Executor executor, final InterfaceC0600a interfaceC0600a) {
        if (!surface.isValid()) {
            final int i10 = 0;
            executor.execute(new Runnable() { // from class: c0.t1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            interfaceC0600a.accept(new C0816i(2, surface));
                            break;
                        case 1:
                            interfaceC0600a.accept(new C0816i(3, surface));
                            break;
                        default:
                            interfaceC0600a.accept(new C0816i(4, surface));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.f5264g.m15507b(surface)) {
            C8302l c8302l = this.f5263f;
            if (!c8302l.isCancelled()) {
                og.y0.m11056f(null, c8302l.f39850b.isDone());
                try {
                    c8302l.get();
                    final int i11 = 1;
                    executor.execute(new Runnable() { // from class: c0.t1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    interfaceC0600a.accept(new C0816i(2, surface));
                                    break;
                                case 1:
                                    interfaceC0600a.accept(new C0816i(3, surface));
                                    break;
                                default:
                                    interfaceC0600a.accept(new C0816i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i12 = 2;
                    executor.execute(new Runnable() { // from class: c0.t1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    interfaceC0600a.accept(new C0816i(2, surface));
                                    break;
                                case 1:
                                    interfaceC0600a.accept(new C0816i(3, surface));
                                    break;
                                default:
                                    interfaceC0600a.accept(new C0816i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        C0833z c0833z = new C0833z(2, interfaceC0600a, surface);
        C8302l c8302l2 = this.f5265h;
        c8302l2.mo9026a(new RunnableC4307g(0, c8302l2, c0833z), executor);
    }

    /* renamed from: b */
    public final void m2237b(Executor executor, w1 w1Var) {
        C0817j c0817j;
        synchronized (this.f5258a) {
            this.f5270m = w1Var;
            this.f5271n = executor;
            c0817j = this.f5269l;
        }
        if (c0817j != null) {
            executor.execute(new q1(w1Var, c0817j, 1));
        }
    }

    /* renamed from: c */
    public final void m2238c() {
        this.f5264g.m15509d(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
