package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractBinderC1309y implements n0 {

    /* renamed from: e */
    public final AtomicReference f6240e;

    /* renamed from: f */
    public boolean f6241f;

    public i0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f6240e = new AtomicReference();
    }

    /* renamed from: g */
    public static final Object m3310g(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    /* renamed from: E */
    public final void mo3311E(Bundle bundle) {
        AtomicReference atomicReference = this.f6240e;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f6241f = true;
                } finally {
                    this.f6240e.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
        AbstractC1310z.m3798d(parcel);
        mo3311E(bundle);
        parcel2.writeNoException();
        return true;
    }

    /* renamed from: f */
    public final Bundle m3312f(long j6) {
        Bundle bundle;
        AtomicReference atomicReference = this.f6240e;
        synchronized (atomicReference) {
            if (!this.f6241f) {
                try {
                    atomicReference.wait(j6);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f6240e.get();
        }
        return bundle;
    }
}
