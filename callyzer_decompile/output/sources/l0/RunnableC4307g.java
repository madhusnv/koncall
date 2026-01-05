package l0;

import a1.C0007f;
import a9.C0073l;
import al.C0184l;
import al.EnumC0185m;
import android.content.ComponentName;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import b2.C0554l;
import b9.C0629a;
import c6.b1;
import c9.C0914i;
import c9.C0917l;
import c9.C0922q;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.RuntimeExecutionException;
import d7.AbstractC1646r;
import d7.d1;
import d9.ExecutorC1668m;
import dj.RunnableC1730c;
import gl.AbstractC2625a;
import gl.C2629e;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import k0.ExecutorC3891a;
import l4.d0;
import ng.AbstractC5063n;
import ng.AbstractC5069t;
import of.RunnableC5355j;
import of.ServiceConnectionC5357l;
import og.dc;
import og.fc;
import og.ja;
import og.qc;
import og.yg;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.x0;
import pf.C5902b;
import qe.C6194e;
import qf.InterfaceC6204c;
import rf.BinderC6520y;
import rf.DialogInterfaceOnCancelListenerC6508m;
import rh.C6525d;
import rh.C6531j;
import rh.C6535n;
import rh.C6539r;
import se.AbstractC6814a;
import sf.AbstractBinderC6815a;
import sf.AbstractC6840z;
import sf.C6833s;
import sf.InterfaceC6823i;
import sf.m0;
import t5.AbstractC7044b;
import t8.C7077w;
import tb.C7105p;
import tx.AbstractC7262v;
import tx.C7251k;
import tx.c0;
import tx.y0;
import u8.C7356d;
import u8.C7378z;
import uf.C7427b;
import ug.AbstractC7444o;
import ug.C7434e;
import ug.h4;
import ug.i0;
import ug.j3;
import ug.k3;
import ug.n1;
import ug.n4;
import ug.q2;
import ug.s1;
import ug.u1;
import ug.v0;
import ug.x2;
import uw.C7565i;
import v8.C7689a;
import wg.C8035h;
import x4.C8299i;
import y8.AbstractC8600i;
import yg.AbstractC8651h;
import yg.C8650g;
import yg.C8653j;
import yg.C8654k;
import yg.C8656m;
import yg.InterfaceC8647d;
import yg.InterfaceC8649f;
import yk.C8687a;
import yx.AbstractC8808b;
import yx.C8813g;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.g */
/* loaded from: classes.dex */
public final class RunnableC4307g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f21733a;

    /* renamed from: b */
    public Object f21734b;

    /* renamed from: c */
    public final Object f21735c;

    public /* synthetic */ RunnableC4307g(int i10, Object obj, Object obj2) {
        this.f21733a = i10;
        this.f21734b = obj;
        this.f21735c = obj2;
    }

    /* renamed from: a */
    private final void m9027a() {
        try {
            ((Runnable) this.f21735c).run();
            synchronized (((ExecutorC1668m) this.f21734b).f8193e) {
                ((ExecutorC1668m) this.f21734b).m5380a();
            }
        } catch (Throwable th2) {
            synchronized (((ExecutorC1668m) this.f21734b).f8193e) {
                ((ExecutorC1668m) this.f21734b).m5380a();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    private final void m9028b() {
        ServiceConnectionC5357l serviceConnectionC5357l = (ServiceConnectionC5357l) this.f21734b;
        IBinder iBinder = (IBinder) this.f21735c;
        synchronized (serviceConnectionC5357l) {
            if (iBinder == null) {
                serviceConnectionC5357l.m10478a("Null service connection");
                return;
            }
            try {
                serviceConnectionC5357l.f26293c = new C7105p(iBinder);
                serviceConnectionC5357l.f26291a = 2;
                ((ScheduledExecutorService) serviceConnectionC5357l.f26296f.f26305c).execute(new RunnableC5355j(serviceConnectionC5357l, 0));
            } catch (RemoteException e2) {
                serviceConnectionC5357l.m10478a(e2.getMessage());
            }
        }
    }

    /* renamed from: c */
    private final void m9029c() {
        j3 j3Var = (j3) this.f21735c;
        synchronized (j3Var) {
            try {
                j3Var.f35545a = false;
                k3 k3Var = j3Var.f35547c;
                if (!k3Var.d0()) {
                    v0 v0Var = ((n1) k3Var.f482a).f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35869n.m14140a("Connected to remote service");
                    i0 i0Var = (i0) this.f21734b;
                    k3Var.mo325M();
                    k3Var.f35570d = i0Var;
                    k3Var.m14026Z();
                    k3Var.b0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k3 k3Var2 = ((j3) this.f21735c).f35547c;
        ScheduledExecutorService scheduledExecutorService = k3Var2.f35573g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            k3Var2.f35573g = null;
        }
    }

    /* renamed from: d */
    private final void m9030d() {
        synchronized (((C8654k) this.f21735c).f41947c) {
            InterfaceC8647d interfaceC8647d = (InterfaceC8647d) ((C8654k) this.f21735c).f41948d;
            Exception excM15982i = ((C8656m) this.f21734b).m15982i();
            AbstractC6840z.m13036g(excM15982i);
            interfaceC8647d.mo780n(excM15982i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [zh.d] */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C0922q c0922q = 0;
        InterfaceC6823i m0Var = null;
        int i10 = 0;
        boolean z6 = false;
        try {
            switch (this.f21733a) {
                case 0:
                    InterfaceC4303c interfaceC4303c = (InterfaceC4303c) this.f21735c;
                    try {
                        interfaceC4303c.mo65g(AbstractC4308h.m9031a((Future) this.f21734b));
                        return;
                    } catch (Error e2) {
                        e = e2;
                        interfaceC4303c.mo45M(e);
                        return;
                    } catch (RuntimeException e10) {
                        e = e10;
                        interfaceC4303c.mo45M(e);
                        return;
                    } catch (ExecutionException e11) {
                        Throwable cause = e11.getCause();
                        if (cause == null) {
                            interfaceC4303c.mo45M(e11);
                            return;
                        } else {
                            interfaceC4303c.mo45M(cause);
                            return;
                        }
                    }
                case 1:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f21734b;
                    while (!((Set) this.f21735c).isEmpty()) {
                        try {
                            C0184l c0184l = (C0184l) referenceQueue.remove();
                            if (c0184l.f560a.remove(c0184l)) {
                                c0184l.clear();
                                c0184l.f561b.getClass();
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                    return;
                case 2:
                    C2629e c2629e = (C2629e) this.f21734b;
                    C8650g c8650g = (C8650g) this.f21735c;
                    int iDecrementAndGet = c2629e.f14211b.decrementAndGet();
                    AbstractC6840z.m13039j(iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        synchronized (c2629e) {
                            try {
                                c2629e.f14214e.mo5891c();
                                C2629e.f14209j = true;
                                x0 x0Var = new x0(8, z6 ? 1 : 0);
                                dc dcVar = c2629e.f14218i ? dc.TYPE_THICK : dc.TYPE_THIN;
                                yg ygVar = c2629e.f14215f;
                                x0Var.f36756d = dcVar;
                                C0073l c0073l = new C0073l();
                                c0073l.f265b = AbstractC2625a.m6597a(c2629e.f14213d);
                                x0Var.f36757e = new qc(c0073l);
                                EnumC0185m.INSTANCE.execute(new b1(ygVar, new C0554l(x0Var, 0), fc.ON_DEVICE_BARCODE_CLOSE, ygVar.m11076c(), 2));
                            } finally {
                            }
                        }
                        c2629e.f14212c.set(false);
                    }
                    AbstractC5063n.f24855a.clear();
                    AbstractC5069t.f24862a.clear();
                    c8650g.m15969b(null);
                    return;
                case 3:
                    C7356d c7356d = ((C0629a) this.f21735c).f4091a.f35048f;
                    String str = (String) this.f21734b;
                    synchronized (c7356d.f35013k) {
                        try {
                            C7378z c7378zM13771c = c7356d.m13771c(str);
                            if (c7378zM13771c != null) {
                                C0922q c0922q2 = c7378zM13771c.f35066a;
                            }
                        } finally {
                        }
                    }
                    if (c0922q == 0 || !c0922q.m2670c()) {
                        return;
                    }
                    synchronized (((C0629a) this.f21735c).f4093c) {
                        ((C0629a) this.f21735c).f4096f.put(ja.m10706a(c0922q), c0922q);
                        C0629a c0629a = (C0629a) this.f21735c;
                        ((C0629a) this.f21735c).f4097g.put(ja.m10706a(c0922q), AbstractC8600i.m15954a(c0629a.f4098h, c0922q, (AbstractC7262v) ((C0914i) c0629a.f4092b).f5586b, c0629a));
                    }
                    return;
                case 4:
                    ((AbstractC1646r) this.f21734b).mo5346d((d1) this.f21735c);
                    return;
                case 5:
                    m9027a();
                    return;
                case 6:
                    ((View) this.f21734b).setLayoutParams((ViewGroup.LayoutParams) this.f21735c);
                    return;
                case 7:
                    try {
                        RunnableC4302b runnableC4302b = (RunnableC4302b) this.f21735c;
                        Object objM9032b = AbstractC4308h.m9032b((InterfaceFutureC8957d) this.f21734b);
                        C8299i c8299i = runnableC4302b.f21727b;
                        if (c8299i != null) {
                            c8299i.m15507b(objM9032b);
                        }
                    } catch (CancellationException unused2) {
                        ((RunnableC4302b) this.f21735c).cancel(false);
                    } catch (ExecutionException e12) {
                        RunnableC4302b runnableC4302b2 = (RunnableC4302b) this.f21735c;
                        Throwable cause2 = e12.getCause();
                        C8299i c8299i2 = runnableC4302b2.f21727b;
                        if (c8299i2 != null) {
                            c8299i2.m15509d(cause2);
                        }
                    }
                    return;
                case 8:
                    m9028b();
                    return;
                case 9:
                    C6194e c6194e = (C6194e) this.f21734b;
                    FFmpegKitConfig.m3080c(c6194e);
                    C0073l c0073l2 = (C0073l) this.f21735c;
                    if (c0073l2 != null) {
                        try {
                            c0073l2.m218j(c6194e);
                        } catch (Exception e13) {
                            AbstractC6814a.m12989a(e13);
                        }
                    }
                    AtomicInteger atomicInteger = FFmpegKitConfig.f5946a;
                    return;
                case 10:
                    BinderC6520y binderC6520y = (BinderC6520y) this.f21735c;
                    C8035h c8035h = (C8035h) this.f21734b;
                    C5902b c5902b = c8035h.f38560b;
                    if (c5902b.f28736b == 0) {
                        C6833s c6833s = c8035h.f38561c;
                        AbstractC6840z.m13036g(c6833s);
                        C5902b c5902b2 = c6833s.f32489c;
                        if (c5902b2.f28736b != 0) {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c5902b2)), new Exception());
                            binderC6520y.f31293l.m87c(c5902b2);
                            binderC6520y.f31292k.m12214e();
                            return;
                        }
                        C0007f c0007f = binderC6520y.f31293l;
                        IBinder iBinder = c6833s.f32488b;
                        if (iBinder != null) {
                            int i11 = AbstractBinderC6815a.f32371f;
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            m0Var = iInterfaceQueryLocalInterface instanceof InterfaceC6823i ? (InterfaceC6823i) iInterfaceQueryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                        }
                        Set set = binderC6520y.f31290i;
                        c0007f.getClass();
                        if (m0Var == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            c0007f.m87c(new C5902b(4));
                        } else {
                            c0007f.f39d = m0Var;
                            c0007f.f40e = set;
                            if (c0007f.f36a) {
                                ((InterfaceC6204c) c0007f.f37b).m12217h(m0Var, set);
                            }
                        }
                    } else {
                        binderC6520y.f31293l.m87c(c5902b);
                    }
                    binderC6520y.f31292k.m12214e();
                    return;
                case 11:
                    DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508m = (DialogInterfaceOnCancelListenerC6508m) this.f21734b;
                    C0554l c0554l = (C0554l) this.f21735c;
                    if (c0554l.f3778b > 0) {
                        Bundle bundle = (Bundle) c0554l.f3780d;
                        dialogInterfaceOnCancelListenerC6508m.m12526b(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                    }
                    if (c0554l.f3778b >= 2) {
                        dialogInterfaceOnCancelListenerC6508m.f31246b = true;
                        dialogInterfaceOnCancelListenerC6508m.m12528d();
                    }
                    if (c0554l.f3778b >= 3) {
                        dialogInterfaceOnCancelListenerC6508m.m12528d();
                    }
                    if (c0554l.f3778b >= 4) {
                        dialogInterfaceOnCancelListenerC6508m.m12527c();
                        return;
                    }
                    return;
                case 12:
                    boolean zIsPopupShowing = ((AutoCompleteTextView) this.f21734b).isPopupShowing();
                    C6531j c6531j = (C6531j) this.f21735c;
                    ((C6535n) c6531j.f31318b).m12559g(zIsPopupShowing);
                    ((C6535n) c6531j.f31318b).f31328i = zIsPopupShowing;
                    return;
                case 13:
                    ((EditText) this.f21734b).removeTextChangedListener(((C6539r) ((C6525d) this.f21735c).f31302b).f31365d);
                    return;
                case 14:
                    ((C7251k) this.f21735c).m13527B((y0) this.f21734b);
                    return;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    u1 u1Var = (u1) this.f21734b;
                    u1Var.mo328c();
                    if (C8687a.m16043t()) {
                        u1Var.mo327b().m14047V(this);
                        return;
                    }
                    AbstractC7444o abstractC7444o = (AbstractC7444o) this.f21735c;
                    boolean z10 = abstractC7444o.f35723c != 0;
                    abstractC7444o.f35723c = 0L;
                    if (z10) {
                        abstractC7444o.mo13868a();
                        return;
                    }
                    return;
                case 16:
                    k3 k3VarM14093p = ((AppMeasurementDynamiteService) this.f21735c).f6714e.m14093p();
                    n0 n0Var = (n0) this.f21734b;
                    k3VarM14093p.mo325M();
                    k3VarM14093p.m13936N();
                    k3VarM14093p.a0(new RunnableC1730c(9, k3VarM14093p, k3VarM14093p.c0(false), n0Var));
                    return;
                case 17:
                    h4 h4Var = ((s1) this.f21735c).f35819e;
                    h4Var.m13947B();
                    C7434e c7434e = (C7434e) this.f21734b;
                    if (c7434e.f35359c.m14016b() == null) {
                        h4Var.getClass();
                        String str2 = c7434e.f35357a;
                        AbstractC6840z.m13036g(str2);
                        n4 n4VarM13958Q = h4Var.m13958Q(str2);
                        if (n4VarM13958Q != null) {
                            h4Var.a0(c7434e, n4VarM13958Q);
                            return;
                        }
                        return;
                    }
                    h4Var.getClass();
                    String str3 = c7434e.f35357a;
                    AbstractC6840z.m13036g(str3);
                    n4 n4VarM13958Q2 = h4Var.m13958Q(str3);
                    if (n4VarM13958Q2 != null) {
                        h4Var.m13963Z(c7434e, n4VarM13958Q2);
                        return;
                    }
                    return;
                case 18:
                    ((q2) this.f21735c).d0((Boolean) this.f21734b, true);
                    return;
                case 19:
                    q2 q2Var = ((AppMeasurementDynamiteService) this.f21735c).f6714e.f35676n;
                    n1.m14084k(q2Var);
                    C0917l c0917l = (C0917l) this.f21734b;
                    q2Var.mo325M();
                    q2Var.m13936N();
                    C0917l c0917l2 = q2Var.f35771d;
                    if (c0917l != c0917l2) {
                        AbstractC6840z.m13038i("EventInterceptor already set.", c0917l2 == null);
                    }
                    q2Var.f35771d = c0917l;
                    return;
                case 20:
                    k3 k3Var = (k3) this.f21735c;
                    i0 i0Var = k3Var.f35570d;
                    n1 n1Var = (n1) k3Var.f482a;
                    if (i0Var == null) {
                        v0 v0Var = n1Var.f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35862f.m14140a("Failed to send current screen to service");
                        return;
                    }
                    try {
                        x2 x2Var = (x2) this.f21734b;
                        if (x2Var == null) {
                            i0Var.mo13909p(0L, null, null, n1Var.f35664a.getPackageName());
                        } else {
                            i0Var.mo13909p(x2Var.f35924c, x2Var.f35922a, x2Var.f35923b, n1Var.f35664a.getPackageName());
                        }
                        k3Var.m14026Z();
                        return;
                    } catch (RemoteException e14) {
                        v0 v0Var2 = n1Var.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14141b(e14, "Failed to send current screen to the service");
                        return;
                    }
                case 21:
                    ((j3) this.f21735c).f35547c.m14024X((ComponentName) this.f21734b);
                    return;
                case 22:
                    m9029c();
                    return;
                case 23:
                    h4 h4Var2 = (h4) this.f21734b;
                    h4Var2.m13947B();
                    Runnable runnable = (Runnable) this.f21735c;
                    h4Var2.mo327b().mo325M();
                    if (h4Var2.f35501r == null) {
                        h4Var2.f35501r = new ArrayList();
                    }
                    h4Var2.f35501r.add(runnable);
                    h4Var2.m13975q();
                    return;
                case 24:
                    C7077w c7077wM13371a = C7077w.m13371a();
                    int i12 = C7689a.f37174e;
                    C0922q c0922q3 = (C0922q) this.f21734b;
                    c7077wM13371a.getClass();
                    ((C7689a) this.f21735c).f37175a.mo13777e(c0922q3);
                    return;
                case 25:
                    d0 d0Var = (d0) this.f21734b;
                    Typeface typeface = (Typeface) this.f21735c;
                    AbstractC7044b abstractC7044b = (AbstractC7044b) d0Var.f21881b;
                    if (abstractC7044b != null) {
                        abstractC7044b.mo9654h(typeface);
                        return;
                    }
                    return;
                case 26:
                    C8653j c8653j = (C8653j) this.f21735c;
                    C8656m c8656m = c8653j.f41944d;
                    try {
                        C8656m c8656m2 = (C8656m) c8653j.f41943c.mo20f((C8656m) this.f21734b);
                        if (c8656m2 == null) {
                            c8653j.mo780n(new NullPointerException("Continuation returned null"));
                            return;
                        }
                        ExecutorC3891a executorC3891a = AbstractC8651h.f41932b;
                        c8656m2.m15979f(executorC3891a, c8653j);
                        c8656m2.m15977d(executorC3891a, c8653j);
                        c8656m2.m15974a(executorC3891a, c8653j);
                        return;
                    } catch (RuntimeExecutionException e15) {
                        if (e15.getCause() instanceof Exception) {
                            c8656m.m15987n((Exception) e15.getCause());
                            return;
                        } else {
                            c8656m.m15987n(e15);
                            return;
                        }
                    } catch (Exception e16) {
                        c8656m.m15987n(e16);
                        return;
                    }
                case 27:
                    m9030d();
                    return;
                case 28:
                    C8654k c8654k = (C8654k) this.f21735c;
                    try {
                        C8656m c8656mMo23p = ((InterfaceC8649f) c8654k.f41947c).mo23p(((C8656m) this.f21734b).m15983j());
                        ExecutorC3891a executorC3891a2 = AbstractC8651h.f41932b;
                        c8656mMo23p.m15979f(executorC3891a2, c8654k);
                        c8656mMo23p.m15977d(executorC3891a2, c8654k);
                        c8656mMo23p.m15974a(executorC3891a2, c8654k);
                        return;
                    } catch (RuntimeExecutionException e17) {
                        if (e17.getCause() instanceof Exception) {
                            c8654k.mo780n((Exception) e17.getCause());
                            return;
                        } else {
                            c8654k.mo780n(e17);
                            return;
                        }
                    } catch (CancellationException unused3) {
                        c8654k.mo1946k();
                        return;
                    } catch (Exception e18) {
                        c8654k.mo780n(e18);
                        return;
                    }
                default:
                    while (true) {
                        try {
                            ((Runnable) this.f21734b).run();
                        } catch (Throwable th2) {
                            c0.m13497t(th2, C7565i.f36440a);
                        }
                        Runnable runnableF0 = ((C8813g) this.f21735c).F0();
                        if (runnableF0 == null) {
                            return;
                        }
                        try {
                            this.f21734b = runnableF0;
                            i10++;
                            if (i10 >= 16) {
                                C8813g c8813g = (C8813g) this.f21735c;
                                if (AbstractC8808b.m16252l(c8813g.f42497d, c8813g)) {
                                    C8813g c8813g2 = (C8813g) this.f21735c;
                                    AbstractC8808b.m16251k(c8813g2.f42497d, c8813g2, this);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C8813g c8813g3 = (C8813g) this.f21735c;
                            synchronized (c8813g3.f42500g) {
                                C8813g.f42495h.decrementAndGet(c8813g3);
                                throw th3;
                            }
                        }
                    }
            }
        } finally {
            ((RunnableC4302b) this.f21735c).f21725g = null;
        }
    }

    public String toString() {
        switch (this.f21733a) {
            case 0:
                return RunnableC4307g.class.getSimpleName() + "," + ((InterfaceC4303c) this.f21735c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC4307g(int i10, Object obj, Object obj2, boolean z6) {
        this.f21733a = i10;
        this.f21735c = obj;
        this.f21734b = obj2;
    }

    public RunnableC4307g(C7427b c7427b, h4 h4Var, Runnable runnable) {
        this.f21733a = 23;
        this.f21734b = h4Var;
        this.f21735c = runnable;
    }

    public RunnableC4307g(k3 k3Var, x2 x2Var) {
        this.f21733a = 20;
        this.f21734b = x2Var;
        Objects.requireNonNull(k3Var);
        this.f21735c = k3Var;
    }

    public RunnableC4307g(C6194e c6194e) {
        this.f21733a = 9;
        this.f21734b = c6194e;
        this.f21735c = c6194e.f30169n;
    }
}
