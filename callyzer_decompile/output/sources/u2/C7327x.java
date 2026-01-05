package u2;

import fx.InterfaceC2395a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.x */
/* loaded from: classes.dex */
public final class C7327x implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final C7323t f34938a;

    /* renamed from: b */
    public final Iterator f34939b;

    /* renamed from: c */
    public int f34940c;

    /* renamed from: d */
    public Map.Entry f34941d;

    /* renamed from: e */
    public Map.Entry f34942e;

    /* renamed from: f */
    public final /* synthetic */ int f34943f;

    public C7327x(C7323t c7323t, Iterator it, int i10) {
        this.f34943f = i10;
        this.f34938a = c7323t;
        this.f34939b = it;
        this.f34940c = c7323t.m13712f().f34908d;
        m13723b();
    }

    /* renamed from: b */
    public final void m13723b() {
        this.f34941d = this.f34942e;
        Iterator it = this.f34939b;
        this.f34942e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34942e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f34943f) {
            case 0:
                m13723b();
                if (this.f34941d != null) {
                    return new C7326w(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f34942e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                m13723b();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f34942e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                m13723b();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C7323t c7323t = this.f34938a;
        if (c7323t.m13712f().f34908d != this.f34940c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f34941d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c7323t.remove(entry.getKey());
        this.f34941d = null;
        this.f34940c = c7323t.m13712f().f34908d;
    }
}
