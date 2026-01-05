package ug;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35315a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f35316b;

    /* renamed from: c */
    public final /* synthetic */ String f35317c;

    /* renamed from: d */
    public final /* synthetic */ n4 f35318d;

    /* renamed from: e */
    public final /* synthetic */ boolean f35319e;

    /* renamed from: f */
    public final /* synthetic */ k3 f35320f;

    /* renamed from: g */
    public final /* synthetic */ Object f35321g;

    public c3(k3 k3Var, String str, String str2, n4 n4Var, boolean z6, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f35316b = str;
        this.f35317c = str2;
        this.f35318d = n4Var;
        this.f35319e = z6;
        this.f35321g = n0Var;
        this.f35320f = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        l4 l4Var;
        i0 i0Var;
        n1 n1Var;
        AtomicReference atomicReference;
        k3 k3Var;
        i0 i0Var2;
        switch (this.f35315a) {
            case 0:
                String str = this.f35317c;
                String str2 = this.f35316b;
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.f35321g;
                k3 k3Var2 = this.f35320f;
                Bundle bundle = new Bundle();
                try {
                    try {
                        i0Var = k3Var2.f35570d;
                        n1Var = (n1) k3Var2.f482a;
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                    if (i0Var == null) {
                        v0 v0Var = n1Var.f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35862f.m14142c("Failed to get user properties; not connected to service", str2, str);
                        l4Var = n1Var.f35672j;
                        n1.m14083i(l4Var);
                        l4Var.A0(n0Var, bundle);
                        return;
                    }
                    List<j4> listMo13893B = i0Var.mo13893B(str2, str, this.f35319e, this.f35318d);
                    Bundle bundle2 = new Bundle();
                    if (listMo13893B != null) {
                        for (j4 j4Var : listMo13893B) {
                            String str3 = j4Var.f35552e;
                            String str4 = j4Var.f35549b;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l9 = j4Var.f35551d;
                                if (l9 != null) {
                                    bundle2.putLong(str4, l9.longValue());
                                } else {
                                    Double d2 = j4Var.f35554g;
                                    if (d2 != null) {
                                        bundle2.putDouble(str4, d2.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        k3Var2.m14026Z();
                        l4 l4Var2 = n1Var.f35672j;
                        n1.m14083i(l4Var2);
                        l4Var2.A0(n0Var, bundle2);
                        return;
                    } catch (RemoteException e10) {
                        e = e10;
                        bundle = bundle2;
                        v0 v0Var2 = ((n1) k3Var2.f482a).f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14142c("Failed to get user properties; remote exception", str2, e);
                        l4Var = ((n1) k3Var2.f482a).f35672j;
                        n1.m14083i(l4Var);
                        l4Var.A0(n0Var, bundle);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bundle = bundle2;
                        l4 l4Var3 = ((n1) k3Var2.f482a).f35672j;
                        n1.m14083i(l4Var3);
                        l4Var3.A0(n0Var, bundle);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f35321g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            k3Var = this.f35320f;
                            i0Var2 = k3Var.f35570d;
                        } catch (RemoteException e11) {
                            v0 v0Var3 = ((n1) this.f35320f.f482a).f35669f;
                            n1.m14085m(v0Var3);
                            v0Var3.f35862f.m14143d("(legacy) Failed to get user properties; remote exception", null, this.f35316b, e11);
                            ((AtomicReference) this.f35321g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f35321g;
                        }
                        if (i0Var2 == null) {
                            v0 v0Var4 = ((n1) k3Var.f482a).f35669f;
                            n1.m14085m(v0Var4);
                            v0Var4.f35862f.m14143d("(legacy) Failed to get user properties; not connected to service", null, this.f35316b, this.f35317c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i0Var2.mo13893B(this.f35316b, this.f35317c, this.f35319e, this.f35318d));
                        } else {
                            atomicReference2.set(i0Var2.mo13902h(null, this.f35316b, this.f35317c, this.f35319e));
                        }
                        k3Var.m14026Z();
                        atomicReference = (AtomicReference) this.f35321g;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th4) {
                        ((AtomicReference) this.f35321g).notify();
                        throw th4;
                    }
                }
        }
    }

    public c3(k3 k3Var, AtomicReference atomicReference, String str, String str2, n4 n4Var, boolean z6) {
        this.f35321g = atomicReference;
        this.f35316b = str;
        this.f35317c = str2;
        this.f35318d = n4Var;
        this.f35319e = z6;
        this.f35320f = k3Var;
    }
}
