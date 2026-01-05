package ug;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35566a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f35567b;

    /* renamed from: c */
    public final /* synthetic */ q2 f35568c;

    public k2(q2 q2Var, AtomicReference atomicReference, int i10) {
        this.f35566a = i10;
        switch (i10) {
            case 1:
                this.f35567b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f35568c = q2Var;
                break;
            case 2:
                this.f35568c = q2Var;
                this.f35567b = atomicReference;
                break;
            default:
                this.f35567b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f35568c = q2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f35566a) {
            case 0:
                AtomicReference atomicReference = this.f35567b;
                synchronized (atomicReference) {
                    try {
                        try {
                            n1 n1Var = (n1) this.f35568c.f482a;
                            atomicReference.set(Long.valueOf(n1Var.f35667d.m13886T(n1Var.m14095r().m14080S(), f0.f44802c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f35567b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            n1 n1Var2 = (n1) this.f35568c.f482a;
                            atomicReference2.set(Double.valueOf(n1Var2.f35667d.m13888V(n1Var2.m14095r().m14080S(), f0.f44806e0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                q2 q2Var = this.f35568c;
                d1 d1Var = ((n1) q2Var.f482a).f35668e;
                n1.m14083i(d1Var);
                Bundle bundleM15246Y = d1Var.f35340p.m15246Y();
                k3 k3VarM14093p = ((n1) q2Var.f482a).m14093p();
                AtomicReference atomicReference3 = this.f35567b;
                k3VarM14093p.mo325M();
                k3VarM14093p.m13936N();
                k3VarM14093p.a0(new c6.b1(k3VarM14093p, atomicReference3, k3VarM14093p.c0(false), bundleM15246Y, 10));
                return;
        }
    }
}
