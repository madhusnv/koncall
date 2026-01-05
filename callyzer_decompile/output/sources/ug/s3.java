package ug;

import android.os.Looper;
import c9.C0910e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s3 extends h0 {

    /* renamed from: c */
    public com.google.android.gms.internal.measurement.h0 f35822c;

    /* renamed from: d */
    public boolean f35823d;

    /* renamed from: e */
    public final g1 f35824e;

    /* renamed from: f */
    public final h1.e2 f35825f;

    /* renamed from: g */
    public final C0910e f35826g;

    public s3(n1 n1Var) {
        super(n1Var);
        this.f35823d = true;
        this.f35824e = new g1(this);
        this.f35825f = new h1.e2(this);
        this.f35826g = new C0910e(this);
    }

    @Override // ug.h0
    /* renamed from: P */
    public final boolean mo13839P() {
        return false;
    }

    /* renamed from: Q */
    public final void m14139Q() {
        mo325M();
        if (this.f35822c == null) {
            this.f35822c = new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 0);
        }
    }
}
