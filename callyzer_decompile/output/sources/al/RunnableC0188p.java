package al;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n0;
import com.google.mlkit.common.MlKitException;
import gl.C2629e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import ug.g1;
import ug.h4;
import ug.i0;
import ug.k0;
import ug.k3;
import ug.l4;
import ug.n1;
import ug.n4;
import ug.s1;
import ug.v0;
import v0.C7622f;
import yg.C8650g;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0188p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f565a;

    /* renamed from: b */
    public final /* synthetic */ Object f566b;

    /* renamed from: c */
    public final /* synthetic */ Object f567c;

    /* renamed from: d */
    public final /* synthetic */ Object f568d;

    /* renamed from: e */
    public final /* synthetic */ Object f569e;

    /* renamed from: f */
    public final /* synthetic */ Object f570f;

    public /* synthetic */ RunnableC0188p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f565a = i10;
        this.f566b = obj;
        this.f567c = obj2;
        this.f568d = obj3;
        this.f569e = obj4;
        this.f570f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        AtomicReference atomicReference;
        k3 k3Var;
        i0 i0Var;
        l4 l4Var;
        i0 i0Var2;
        switch (this.f565a) {
            case 0:
                C2629e c2629e = (C2629e) this.f566b;
                C7622f c7622f = (C7622f) this.f567c;
                g1 g1Var = (g1) this.f568d;
                Callable callable = (Callable) this.f569e;
                C8650g c8650g = (C8650g) this.f570f;
                try {
                    if (((C8656m) c7622f.f36778a).m15984k()) {
                        g1Var.m13926q();
                        return;
                    }
                    try {
                        if (!c2629e.f14212c.get()) {
                            synchronized (c2629e) {
                                c2629e.f14218i = c2629e.f14214e.mo5890b();
                            }
                            c2629e.f14212c.set(true);
                        }
                        if (((C8656m) c7622f.f36778a).m15984k()) {
                            g1Var.m13926q();
                            return;
                        }
                        Object objCall = callable.call();
                        if (((C8656m) c7622f.f36778a).m15984k()) {
                            g1Var.m13926q();
                            return;
                        } else {
                            c8650g.m15969b(objCall);
                            return;
                        }
                    } catch (RuntimeException e2) {
                        throw new MlKitException("Internal error has occurred when executing ML Kit tasks", e2);
                    }
                } catch (Exception e10) {
                    if (((C8656m) c7622f.f36778a).m15984k()) {
                        g1Var.m13926q();
                        return;
                    } else {
                        c8650g.m15968a(e10);
                        return;
                    }
                }
            case 1:
                s1 s1Var = (s1) this.f566b;
                n4 n4Var = (n4) this.f567c;
                Bundle bundle = (Bundle) this.f568d;
                k0 k0Var = (k0) this.f569e;
                String str = (String) this.f570f;
                h4 h4Var = s1Var.f35819e;
                h4Var.m13947B();
                try {
                    k0Var.mo13869M(h4Var.d0(bundle, n4Var));
                    return;
                } catch (RemoteException e11) {
                    h4Var.mo326a().f35862f.m14142c("Failed to return trigger URIs for app", str, e11);
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f566b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            k3Var = (k3) this.f570f;
                            i0Var = k3Var.f35570d;
                        } catch (RemoteException e12) {
                            v0 v0Var = ((n1) ((k3) this.f570f).f482a).f35669f;
                            n1.m14085m(v0Var);
                            v0Var.f35862f.m14143d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f567c, e12);
                            ((AtomicReference) this.f566b).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f566b;
                        }
                        if (i0Var == null) {
                            v0 v0Var2 = ((n1) k3Var.f482a).f35669f;
                            n1.m14085m(v0Var2);
                            v0Var2.f35862f.m14143d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f567c, (String) this.f568d);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i0Var.mo13908o((String) this.f567c, (String) this.f568d, (n4) this.f569e));
                        } else {
                            atomicReference2.set(i0Var.mo13911t(null, (String) this.f567c, (String) this.f568d));
                        }
                        k3Var.m14026Z();
                        atomicReference = (AtomicReference) this.f566b;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f566b).notify();
                        throw th2;
                    }
                }
            default:
                n0 n0Var = (n0) this.f569e;
                String str2 = (String) this.f567c;
                String str3 = (String) this.f566b;
                k3 k3Var2 = (k3) this.f570f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        i0Var2 = k3Var2.f35570d;
                    } catch (RemoteException e13) {
                        v0 v0Var3 = ((n1) k3Var2.f482a).f35669f;
                        n1.m14085m(v0Var3);
                        v0Var3.f35862f.m14143d("Failed to get conditional properties; remote exception", str3, str2, e13);
                    }
                    if (i0Var2 != null) {
                        arrayList = l4.C0(i0Var2.mo13908o(str3, str2, (n4) this.f568d));
                        k3Var2.m14026Z();
                        l4Var = ((n1) k3Var2.f482a).f35672j;
                        n1.m14083i(l4Var);
                        l4Var.B0(n0Var, arrayList);
                        return;
                    }
                    n1 n1Var = (n1) k3Var2.f482a;
                    v0 v0Var4 = n1Var.f35669f;
                    n1.m14085m(v0Var4);
                    v0Var4.f35862f.m14142c("Failed to get conditional properties; not connected to service", str3, str2);
                    l4Var = n1Var.f35672j;
                    n1.m14083i(l4Var);
                    l4Var.B0(n0Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    l4 l4Var2 = ((n1) k3Var2.f482a).f35672j;
                    n1.m14083i(l4Var2);
                    l4Var2.B0(n0Var, arrayList);
                    throw th3;
                }
        }
    }

    public /* synthetic */ RunnableC0188p(k3 k3Var, Serializable serializable, String str, Object obj, Object obj2, int i10) {
        this.f565a = i10;
        this.f566b = serializable;
        this.f567c = str;
        this.f568d = obj;
        this.f569e = obj2;
        this.f570f = k3Var;
    }
}
