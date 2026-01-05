package og;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.q */
/* loaded from: classes.dex */
public final class C5376q implements Iterator {

    /* renamed from: a */
    public int f26749a;

    /* renamed from: b */
    public int f26750b;

    /* renamed from: c */
    public int f26751c;

    /* renamed from: d */
    public final /* synthetic */ C5381v f26752d;

    /* renamed from: e */
    public final /* synthetic */ int f26753e;

    /* renamed from: f */
    public final /* synthetic */ C5381v f26754f;

    public C5376q(C5381v c5381v, int i10) {
        this.f26753e = i10;
        this.f26754f = c5381v;
        this.f26752d = c5381v;
        this.f26749a = c5381v.f26837e;
        this.f26750b = c5381v.isEmpty() ? -1 : 0;
        this.f26751c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26750b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c5379t;
        C5381v c5381v = this.f26752d;
        if (c5381v.f26837e != this.f26749a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26750b;
        this.f26751c = i10;
        int i11 = this.f26753e;
        C5381v c5381v2 = this.f26754f;
        switch (i11) {
            case 0:
                Object obj = C5381v.f26832k;
                c5379t = c5381v2.m10999d()[i10];
                break;
            case 1:
                c5379t = new C5379t(c5381v2, i10);
                break;
            default:
                Object obj2 = C5381v.f26832k;
                c5379t = c5381v2.m11000f()[i10];
                break;
        }
        int i12 = this.f26750b + 1;
        if (i12 >= c5381v.f26838f) {
            i12 = -1;
        }
        this.f26750b = i12;
        return c5379t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5381v c5381v = this.f26752d;
        if (c5381v.f26837e != this.f26749a) {
            throw new ConcurrentModificationException();
        }
        qa.m10850e("no calls to next() since the last call to remove()", this.f26751c >= 0);
        this.f26749a += 32;
        c5381v.remove(c5381v.m10999d()[this.f26751c]);
        this.f26750b--;
        this.f26751c = -1;
    }
}
