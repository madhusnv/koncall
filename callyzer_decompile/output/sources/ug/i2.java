package ug;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35521a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f35522b;

    /* renamed from: c */
    public final /* synthetic */ q2 f35523c;

    public i2(q2 q2Var, AtomicReference atomicReference, int i10) {
        this.f35521a = i10;
        switch (i10) {
            case 1:
                this.f35522b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f35523c = q2Var;
                break;
            case 2:
                this.f35522b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f35523c = q2Var;
                break;
            case 3:
                this.f35523c = q2Var;
                this.f35522b = atomicReference;
                break;
            default:
                this.f35522b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f35523c = q2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35521a) {
            case 0:
                AtomicReference atomicReference = this.f35522b;
                synchronized (atomicReference) {
                    try {
                        try {
                            n1 n1Var = (n1) this.f35523c.f482a;
                            atomicReference.set(Boolean.valueOf(n1Var.f35667d.m13889W(n1Var.m14095r().m14080S(), f0.f44798a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f35522b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            n1 n1Var2 = (n1) this.f35523c.f482a;
                            atomicReference2.set(n1Var2.f35667d.m13885S(n1Var2.m14095r().m14080S(), f0.f44800b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f35522b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            n1 n1Var3 = (n1) this.f35523c.f482a;
                            atomicReference3.set(Integer.valueOf(n1Var3.f35667d.m13887U(n1Var3.m14095r().m14080S(), f0.f44804d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                k3 k3VarM14093p = ((n1) this.f35523c.f482a).m14093p();
                a4 a4VarM13831b = a4.m13831b(w2.SGTM_CLIENT);
                AtomicReference atomicReference4 = this.f35522b;
                k3VarM14093p.mo325M();
                k3VarM14093p.m13936N();
                k3VarM14093p.a0(new c6.b1(k3VarM14093p, atomicReference4, k3VarM14093p.c0(false), a4VarM13831b, 11));
                return;
        }
    }
}
