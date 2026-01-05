package c0;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d0 implements b1 {

    /* renamed from: b */
    public final b1 f5064b;

    /* renamed from: a */
    public final Object f5063a = new Object();

    /* renamed from: c */
    public final HashSet f5065c = new HashSet();

    public d0(b1 b1Var) {
        this.f5064b = b1Var;
    }

    @Override // c0.b1
    /* renamed from: X */
    public w0 mo2135X() {
        return this.f5064b.mo2135X();
    }

    @Override // c0.b1
    /* renamed from: b */
    public int mo2136b() {
        return this.f5064b.mo2136b();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f5064b.close();
        synchronized (this.f5063a) {
            hashSet = new HashSet(this.f5065c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).mo2178c(this);
        }
    }

    @Override // c0.b1
    public final Image e0() {
        return this.f5064b.e0();
    }

    @Override // c0.b1
    public final int getFormat() {
        return this.f5064b.getFormat();
    }

    @Override // c0.b1
    public int getHeight() {
        return this.f5064b.getHeight();
    }

    /* renamed from: h */
    public final void m2179h(c0 c0Var) {
        synchronized (this.f5063a) {
            this.f5065c.add(c0Var);
        }
    }

    @Override // c0.b1
    /* renamed from: l */
    public a1[] mo2137l() {
        return this.f5064b.mo2137l();
    }
}
