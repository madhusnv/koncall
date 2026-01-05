package zd;

import java.io.Closeable;
import nx.C5176n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zd.b */
/* loaded from: classes.dex */
public final class C8938b implements Closeable {

    /* renamed from: a */
    public final C8937a f42922a;

    /* renamed from: b */
    public boolean f42923b;

    /* renamed from: c */
    public final /* synthetic */ C8940d f42924c;

    public C8938b(C8940d c8940d, C8937a c8937a) {
        this.f42924c = c8940d;
        this.f42922a = c8937a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42923b) {
            return;
        }
        this.f42923b = true;
        C8940d c8940d = this.f42924c;
        synchronized (c8940d) {
            C8937a c8937a = this.f42922a;
            int i10 = c8937a.f42920h - 1;
            c8937a.f42920h = i10;
            if (i10 == 0 && c8937a.f42918f) {
                C5176n c5176n = C8940d.f42926s;
                c8940d.m16415P(c8937a);
            }
        }
    }
}
