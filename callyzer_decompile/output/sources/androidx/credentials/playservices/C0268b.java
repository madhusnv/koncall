package androidx.credentials.playservices;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import h6.InterfaceC2855k;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import l0.AbstractC4308h;
import l0.C4310j;
import l0.InterfaceC4301a;
import l0.RunnableC4307g;
import og.y0;
import p020v.g1;
import p020v.x0;
import p021w.C7845k;
import p021w.C7846l;
import p021w.C7847m;
import p022x.C8249s;
import pg.i7;
import pg.t8;
import uf.C7427b;
import x4.C8299i;
import x4.C8302l;
import x4.InterfaceC8300j;
import yg.InterfaceC8647d;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0268b implements InterfaceC8647d, InterfaceC8300j, InterfaceC4301a {

    /* renamed from: a */
    public final /* synthetic */ Object f2251a;

    /* renamed from: b */
    public final /* synthetic */ Object f2252b;

    /* renamed from: c */
    public final /* synthetic */ Object f2253c;

    /* renamed from: d */
    public final /* synthetic */ Object f2254d;

    public /* synthetic */ C0268b(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2251a = obj;
        this.f2252b = obj2;
        this.f2253c = obj3;
        this.f2254d = obj4;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        String str;
        g1 g1Var = (g1) this.f2251a;
        List list = (List) this.f2252b;
        ug.g1 g1Var2 = (ug.g1) this.f2253c;
        C8249s c8249s = (C8249s) this.f2254d;
        synchronized (g1Var.f36544a) {
            synchronized (g1Var.f36544a) {
                synchronized (g1Var.f36544a) {
                    try {
                        List list2 = g1Var.f36554k;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((v0) it.next()).m7417b();
                            }
                            g1Var.f36554k = null;
                        }
                    } finally {
                    }
                }
                if (!list.isEmpty()) {
                    int i10 = 0;
                    do {
                        try {
                            ((v0) list.get(i10)).m7419d();
                            i10++;
                        } catch (DeferrableSurface$SurfaceClosedException e2) {
                            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                                ((v0) list.get(i11)).m7417b();
                            }
                            throw e2;
                        }
                    } while (i10 < list.size());
                }
                g1Var.f36554k = list;
            }
            y0.m11056f("The openCaptureSessionCompleter can only set once!", g1Var.f36552i == null);
            g1Var.f36552i = c8299i;
            ((C7845k) g1Var2.f35448a).mo14829e(c8249s);
            str = "openCaptureSession[session=" + g1Var + "]";
        }
        return str;
    }

    @Override // l0.InterfaceC4301a, p016r.InterfaceC6409a
    public InterfaceFutureC8957d apply(Object obj) throws CameraAccessException {
        g1 g1Var = (g1) this.f2251a;
        CameraDevice cameraDevice = (CameraDevice) this.f2252b;
        C8249s c8249s = (C8249s) this.f2253c;
        List list = (List) this.f2254d;
        if (g1Var.f36565v.f9420a) {
            ArrayList arrayListM14488r = g1Var.f36545b.m14488r();
            int size = arrayListM14488r.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayListM14488r.get(i10);
                i10++;
                ((g1) obj2).m14378i();
            }
        }
        g1Var.m14380k("start openCaptureSession");
        synchronized (g1Var.f36544a) {
            try {
                if (g1Var.f36556m) {
                    return new C4310j(1, new CancellationException("Opener is disabled"));
                }
                x0 x0Var = g1Var.f36545b;
                synchronized (x0Var.f36755c) {
                    ((LinkedHashSet) x0Var.f36758f).add(g1Var);
                }
                Handler handler = g1Var.f36546c;
                ug.g1 g1Var2 = new ug.g1();
                if (Build.VERSION.SDK_INT >= 28) {
                    cameraDevice.getClass();
                    g1Var2.f35448a = new C7846l(cameraDevice, null);
                } else {
                    g1Var2.f35448a = new C7845k(cameraDevice, new C7847m(handler));
                }
                C8302l c8302lM11697b = i7.m11697b(new C0268b(g1Var, list, g1Var2, c8249s));
                g1Var.f36551h = c8302lM11697b;
                C7427b c7427b = new C7427b(5, g1Var);
                c8302lM11697b.mo9026a(new RunnableC4307g(0, c8302lM11697b, c7427b), t8.m11872a());
                return AbstractC4308h.m9034d(g1Var.f36551h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$2((CredentialProviderPlayServicesImpl) this.f2251a, (CancellationSignal) this.f2252b, (Executor) this.f2253c, (InterfaceC2855k) this.f2254d, exc);
    }
}
