package w3;

import android.os.Handler;
import android.view.Choreographer;
import ci.C0973a;
import java.util.ArrayList;
import og.nd;
import qw.C6366p;
import rw.C6661k;
import tx.AbstractC7262v;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends AbstractC7262v {

    /* renamed from: n */
    public static final C6366p f37968n = nd.m10782c(n0.f37880h);

    /* renamed from: p */
    public static final C0973a f37969p = new C0973a(11);

    /* renamed from: c */
    public final Choreographer f37970c;

    /* renamed from: d */
    public final Handler f37971d;

    /* renamed from: j */
    public boolean f37976j;

    /* renamed from: k */
    public boolean f37977k;

    /* renamed from: m */
    public final k2.g1 f37979m;

    /* renamed from: e */
    public final Object f37972e = new Object();

    /* renamed from: f */
    public final C6661k f37973f = new C6661k();

    /* renamed from: g */
    public ArrayList f37974g = new ArrayList();

    /* renamed from: h */
    public ArrayList f37975h = new ArrayList();

    /* renamed from: l */
    public final t0 f37978l = new t0(this);

    public u0(Choreographer choreographer, Handler handler) {
        this.f37970c = choreographer;
        this.f37971d = handler;
        this.f37979m = new k2.g1(choreographer, this);
    }

    public static final void F0(u0 u0Var) {
        Runnable runnable;
        boolean z6;
        do {
            synchronized (u0Var.f37972e) {
                C6661k c6661k = u0Var.f37973f;
                runnable = (Runnable) (c6661k.isEmpty() ? null : c6661k.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (u0Var.f37972e) {
                    C6661k c6661k2 = u0Var.f37973f;
                    runnable = (Runnable) (c6661k2.isEmpty() ? null : c6661k2.removeFirst());
                }
            }
            synchronized (u0Var.f37972e) {
                if (u0Var.f37973f.isEmpty()) {
                    z6 = false;
                    u0Var.f37976j = false;
                } else {
                    z6 = true;
                }
            }
        } while (z6);
    }

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        synchronized (this.f37972e) {
            this.f37973f.addLast(runnable);
            if (!this.f37976j) {
                this.f37976j = true;
                this.f37971d.post(this.f37978l);
                if (!this.f37977k) {
                    this.f37977k = true;
                    this.f37970c.postFrameCallback(this.f37978l);
                }
            }
        }
    }
}
