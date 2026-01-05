package mg;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.u */
/* loaded from: classes.dex */
public final class C4742u extends e0 {

    /* renamed from: b */
    public static final Object f23700b = new Object();

    /* renamed from: a */
    public Object f23701a;

    public C4742u(Object obj) {
        this.f23701a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23701a != f23700b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f23701a;
        Object obj2 = f23700b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f23701a = obj2;
        return obj;
    }
}
