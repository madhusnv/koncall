package ux;

import android.os.Handler;
import android.os.Looper;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.sun.mail.util.AbstractC1452a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4154l;
import o6.r0;
import qi.RunnableC6224g;
import qv.C6334i;
import tx.AbstractC7262v;
import tx.C7251k;
import tx.c0;
import tx.h0;
import tx.m0;
import tx.o0;
import tx.p1;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ux.c */
/* loaded from: classes3.dex */
public final class C7569c extends AbstractC7262v implements h0 {

    /* renamed from: c */
    public final Handler f36443c;

    /* renamed from: d */
    public final String f36444d;

    /* renamed from: e */
    public final boolean f36445e;

    /* renamed from: f */
    public final C7569c f36446f;

    public C7569c(Handler handler, String str, boolean z6) {
        this.f36443c = handler;
        this.f36444d = str;
        this.f36445e = z6;
        this.f36446f = z6 ? this : new C7569c(handler, str, true);
    }

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        if (this.f36443c.post(runnable)) {
            return;
        }
        F0(interfaceC7564h, runnable);
    }

    @Override // tx.AbstractC7262v
    public final boolean D0(InterfaceC7564h interfaceC7564h) {
        return (this.f36445e && AbstractC4154l.m8918a(Looper.myLooper(), this.f36443c.getLooper())) ? false : true;
    }

    @Override // tx.AbstractC7262v
    public AbstractC7262v E0(int i10) {
        AbstractC8808b.m16243c(i10);
        return this;
    }

    public final void F0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        c0.m13486i(interfaceC7564h, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0496f c0496f = m0.f34659a;
        ExecutorC0495e.f3538c.B0(interfaceC7564h, runnable);
    }

    @Override // tx.h0
    /* renamed from: R */
    public final o0 mo13506R(long j6, Runnable runnable, InterfaceC7564h interfaceC7564h) {
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f36443c.postDelayed(runnable, j6)) {
            return new r0(1, this, runnable);
        }
        F0(interfaceC7564h, runnable);
        return p1.f34666a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7569c)) {
            return false;
        }
        C7569c c7569c = (C7569c) obj;
        return c7569c.f36443c == this.f36443c && c7569c.f36445e == this.f36445e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f36443c) ^ (this.f36445e ? 1231 : 1237);
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        C7569c c7569c;
        String str;
        C0496f c0496f = m0.f34659a;
        C7569c c7569c2 = AbstractC8819m.f42514a;
        if (this == c7569c2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c7569c = c7569c2.f36446f;
            } catch (UnsupportedOperationException unused) {
                c7569c = null;
            }
            str = this == c7569c ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f36444d;
        if (string == null) {
            string = this.f36443c.toString();
        }
        return this.f36445e ? AbstractC1452a.m4561h(string, ".immediate") : string;
    }

    @Override // tx.h0
    /* renamed from: w */
    public final void mo13517w(long j6, C7251k c7251k) {
        RunnableC6224g runnableC6224g = new RunnableC6224g(7, c7251k, this);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f36443c.postDelayed(runnableC6224g, j6)) {
            c7251k.m13542t(new C6334i(5, this, runnableC6224g));
        } else {
            F0(c7251k.f34651e, runnableC6224g);
        }
    }

    public C7569c(Handler handler) {
        this(handler, null, false);
    }
}
