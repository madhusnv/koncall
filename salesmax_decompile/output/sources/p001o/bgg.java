package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001o.g32;
import p001o.yj5;

/* loaded from: classes2.dex */
public final class bgg {

    /* renamed from: p */
    public static final Range f16165p = k7g.f31605a;

    /* renamed from: a */
    public final Object f16166a = new Object();

    /* renamed from: b */
    public final Size f16167b;

    /* renamed from: c */
    public final y16 f16168c;

    /* renamed from: d */
    public final Range f16169d;

    /* renamed from: e */
    public final v92 f16170e;

    /* renamed from: f */
    public final boolean f16171f;

    /* renamed from: g */
    public final zfa f16172g;

    /* renamed from: h */
    public final g32.C13614a f16173h;

    /* renamed from: i */
    public final zfa f16174i;

    /* renamed from: j */
    public final g32.C13614a f16175j;

    /* renamed from: k */
    public final g32.C13614a f16176k;

    /* renamed from: l */
    public final yj5 f16177l;

    /* renamed from: m */
    public AbstractC12390h f16178m;

    /* renamed from: n */
    public InterfaceC12391i f16179n;

    /* renamed from: o */
    public Executor f16180o;

    /* renamed from: o.bgg$a */
    public class C12383a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f16181a;

        /* renamed from: b */
        public final /* synthetic */ zfa f16182b;

        public C12383a(g32.C13614a c13614a, zfa zfaVar) {
            this.f16181a = c13614a;
            this.f16182b = zfaVar;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            if (th instanceof C12388f) {
                fgd.m26665i(this.f16182b.cancel(false));
            } else {
                fgd.m26665i(this.f16181a.m28005c(null));
            }
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            fgd.m26665i(this.f16181a.m28005c(null));
        }
    }

    /* renamed from: o.bgg$b */
    public class C12384b extends yj5 {
        public C12384b(Size size, int i) {
            super(size, i);
        }

        @Override // p001o.yj5
        /* renamed from: r */
        public zfa mo18935r() {
            return bgg.this.f16172g;
        }
    }

    /* renamed from: o.bgg$c */
    public class C12385c implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ zfa f16185a;

        /* renamed from: b */
        public final /* synthetic */ g32.C13614a f16186b;

        /* renamed from: c */
        public final /* synthetic */ String f16187c;

        public C12385c(zfa zfaVar, g32.C13614a c13614a, String str) {
            this.f16185a = zfaVar;
            this.f16186b = c13614a;
            this.f16187c = str;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f16186b.m28005c(null);
                return;
            }
            fgd.m26665i(this.f16186b.m28008f(new C12388f(this.f16187c + " cancelled.", th)));
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            bn7.m19408C(this.f16185a, this.f16186b);
        }
    }

    /* renamed from: o.bgg$d */
    public class C12386d implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ hu3 f16189a;

        /* renamed from: b */
        public final /* synthetic */ Surface f16190b;

        public C12386d(hu3 hu3Var, Surface surface) {
            this.f16189a = hu3Var;
            this.f16190b = surface;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            fgd.m26666j(th instanceof C12388f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f16189a.accept(AbstractC12389g.m18939c(1, this.f16190b));
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            this.f16189a.accept(AbstractC12389g.m18939c(0, this.f16190b));
        }
    }

    /* renamed from: o.bgg$e */
    public class C12387e implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ Runnable f16192a;

        public C12387e(Runnable runnable) {
            this.f16192a = runnable;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            this.f16192a.run();
        }
    }

    /* renamed from: o.bgg$f */
    public static final class C12388f extends RuntimeException {
        public C12388f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: o.bgg$g */
    public static abstract class AbstractC12389g {
        /* renamed from: c */
        public static AbstractC12389g m18939c(int i, Surface surface) {
            return new t51(i, surface);
        }

        /* renamed from: a */
        public abstract int mo18940a();

        /* renamed from: b */
        public abstract Surface mo18941b();
    }

    /* renamed from: o.bgg$h */
    public static abstract class AbstractC12390h {
        /* renamed from: g */
        public static AbstractC12390h m18942g(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
            return new u51(rect, i, i2, z, matrix, z2);
        }

        /* renamed from: a */
        public abstract Rect mo18943a();

        /* renamed from: b */
        public abstract int mo18944b();

        /* renamed from: c */
        public abstract Matrix mo18945c();

        /* renamed from: d */
        public abstract int mo18946d();

        /* renamed from: e */
        public abstract boolean mo18947e();

        /* renamed from: f */
        public abstract boolean mo18948f();
    }

    /* renamed from: o.bgg$i */
    public interface InterfaceC12391i {
        /* renamed from: a */
        void mo18949a(AbstractC12390h abstractC12390h);
    }

    public bgg(Size size, v92 v92Var, boolean z, y16 y16Var, Range range, Runnable runnable) {
        this.f16167b = size;
        this.f16170e = v92Var;
        this.f16171f = z;
        this.f16168c = y16Var;
        this.f16169d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.sfg
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return bgg.m18914t(atomicReference, str, c13614a);
            }
        });
        g32.C13614a c13614a = (g32.C13614a) fgd.m26663g((g32.C13614a) atomicReference.get());
        this.f16176k = c13614a;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        zfa zfaVarM28002a2 = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.tfg
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a2) {
                return bgg.m18915u(atomicReference2, str, c13614a2);
            }
        });
        this.f16174i = zfaVarM28002a2;
        bn7.m19424j(zfaVarM28002a2, new C12383a(c13614a, zfaVarM28002a), gb2.m28293a());
        g32.C13614a c13614a2 = (g32.C13614a) fgd.m26663g((g32.C13614a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        zfa zfaVarM28002a3 = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.ufg
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a3) {
                return bgg.m18916v(atomicReference3, str, c13614a3);
            }
        });
        this.f16172g = zfaVarM28002a3;
        this.f16173h = (g32.C13614a) fgd.m26663g((g32.C13614a) atomicReference3.get());
        C12384b c12384b = new C12384b(size, 34);
        this.f16177l = c12384b;
        zfa zfaVarM57873k = c12384b.m57873k();
        bn7.m19424j(zfaVarM28002a3, new C12385c(zfaVarM57873k, c13614a2, str), gb2.m28293a());
        zfaVarM57873k.addListener(new Runnable() { // from class: o.vfg
            @Override // java.lang.Runnable
            public final void run() {
                this.f50287a.m18917w();
            }
        }, gb2.m28293a());
        this.f16175j = m18931p(gb2.m28293a(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m18913s(AtomicReference atomicReference, g32.C13614a c13614a) {
        atomicReference.set(c13614a);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* renamed from: t */
    public static /* synthetic */ Object m18914t(AtomicReference atomicReference, String str, g32.C13614a c13614a) {
        atomicReference.set(c13614a);
        return str + "-cancellation";
    }

    /* renamed from: u */
    public static /* synthetic */ Object m18915u(AtomicReference atomicReference, String str, g32.C13614a c13614a) {
        atomicReference.set(c13614a);
        return str + "-status";
    }

    /* renamed from: v */
    public static /* synthetic */ Object m18916v(AtomicReference atomicReference, String str, g32.C13614a c13614a) {
        atomicReference.set(c13614a);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m18917w() {
        this.f16172g.cancel(true);
    }

    /* renamed from: x */
    public static /* synthetic */ void m18918x(hu3 hu3Var, Surface surface) {
        hu3Var.accept(AbstractC12389g.m18939c(3, surface));
    }

    /* renamed from: y */
    public static /* synthetic */ void m18919y(hu3 hu3Var, Surface surface) {
        hu3Var.accept(AbstractC12389g.m18939c(4, surface));
    }

    /* renamed from: B */
    public void m18921B(final Surface surface, Executor executor, final hu3 hu3Var) throws ExecutionException, InterruptedException {
        if (this.f16173h.m28005c(surface) || this.f16172g.isCancelled()) {
            bn7.m19424j(this.f16174i, new C12386d(hu3Var, surface), executor);
            return;
        }
        fgd.m26665i(this.f16172g.isDone());
        try {
            this.f16172g.get();
            executor.execute(new Runnable() { // from class: o.yfg
                @Override // java.lang.Runnable
                public final void run() {
                    bgg.m18918x(hu3Var, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: o.zfg
                @Override // java.lang.Runnable
                public final void run() {
                    bgg.m18919y(hu3Var, surface);
                }
            });
        }
    }

    /* renamed from: C */
    public void m18922C(Executor executor, final InterfaceC12391i interfaceC12391i) {
        final AbstractC12390h abstractC12390h;
        synchronized (this.f16166a) {
            this.f16179n = interfaceC12391i;
            this.f16180o = executor;
            abstractC12390h = this.f16178m;
        }
        if (abstractC12390h != null) {
            executor.execute(new Runnable() { // from class: o.agg
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC12391i.mo18949a(abstractC12390h);
                }
            });
        }
    }

    /* renamed from: D */
    public void m18923D(final AbstractC12390h abstractC12390h) {
        final InterfaceC12391i interfaceC12391i;
        Executor executor;
        synchronized (this.f16166a) {
            this.f16178m = abstractC12390h;
            interfaceC12391i = this.f16179n;
            executor = this.f16180o;
        }
        if (interfaceC12391i == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: o.wfg
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC12391i.mo18949a(abstractC12390h);
            }
        });
    }

    /* renamed from: E */
    public boolean m18924E() {
        return this.f16173h.m28008f(new yj5.C18419b("Surface request will not complete."));
    }

    /* renamed from: j */
    public void m18925j(Executor executor, Runnable runnable) {
        this.f16176k.m28003a(runnable, executor);
    }

    /* renamed from: k */
    public void m18926k() {
        synchronized (this.f16166a) {
            this.f16179n = null;
            this.f16180o = null;
        }
    }

    /* renamed from: l */
    public v92 m18927l() {
        return this.f16170e;
    }

    /* renamed from: m */
    public yj5 m18928m() {
        return this.f16177l;
    }

    /* renamed from: n */
    public y16 m18929n() {
        return this.f16168c;
    }

    /* renamed from: o */
    public Size m18930o() {
        return this.f16167b;
    }

    /* renamed from: p */
    public final g32.C13614a m18931p(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        bn7.m19424j(g32.m28002a(new g32.InterfaceC13616c() { // from class: o.xfg
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f53714a.m18913s(atomicReference, c13614a);
            }
        }), new C12387e(runnable), executor);
        return (g32.C13614a) fgd.m26663g((g32.C13614a) atomicReference.get());
    }

    /* renamed from: q */
    public boolean m18932q() {
        m18924E();
        return this.f16175j.m28005c(null);
    }

    /* renamed from: r */
    public boolean m18933r() {
        return this.f16171f;
    }
}
