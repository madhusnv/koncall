package mk;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.l */
/* loaded from: classes.dex */
public final class C4773l implements Iterator {

    /* renamed from: a */
    public C4775n f23790a;

    /* renamed from: b */
    public C4775n f23791b = null;

    /* renamed from: c */
    public int f23792c;

    /* renamed from: d */
    public final /* synthetic */ C4776o f23793d;

    /* renamed from: e */
    public final /* synthetic */ int f23794e;

    public C4773l(C4776o c4776o, int i10) {
        this.f23794e = i10;
        this.f23793d = c4776o;
        this.f23790a = c4776o.f23812f.f23800d;
        this.f23792c = c4776o.f23811e;
    }

    /* renamed from: a */
    public final Object m9701a() {
        return m9702b();
    }

    /* renamed from: b */
    public final C4775n m9702b() {
        C4775n c4775n = this.f23790a;
        C4776o c4776o = this.f23793d;
        if (c4775n == c4776o.f23812f) {
            throw new NoSuchElementException();
        }
        if (c4776o.f23811e != this.f23792c) {
            throw new ConcurrentModificationException();
        }
        this.f23790a = c4775n.f23800d;
        this.f23791b = c4775n;
        return c4775n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23790a != this.f23793d.f23812f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f23794e) {
            case 1:
                return m9702b().f23802f;
            default:
                return m9701a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4775n c4775n = this.f23791b;
        if (c4775n == null) {
            throw new IllegalStateException();
        }
        C4776o c4776o = this.f23793d;
        c4776o.m9705f(c4775n, true);
        this.f23791b = null;
        this.f23792c = c4776o.f23811e;
    }
}
