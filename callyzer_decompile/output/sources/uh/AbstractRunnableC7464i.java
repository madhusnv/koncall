package uh;

import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.i */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC7464i implements Runnable {

    /* renamed from: a */
    public final C8650g f36053a;

    public AbstractRunnableC7464i() {
        this.f36053a = null;
    }

    /* renamed from: a */
    public abstract void mo13417a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo13417a();
        } catch (Exception e2) {
            C8650g c8650g = this.f36053a;
            if (c8650g != null) {
                c8650g.m15970c(e2);
            }
        }
    }

    public AbstractRunnableC7464i(C8650g c8650g) {
        this.f36053a = c8650g;
    }
}
