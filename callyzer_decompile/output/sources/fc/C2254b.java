package fc;

import ex.InterfaceC2139c;
import fx.InterfaceC2395a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import mx.C4915k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.b */
/* loaded from: classes.dex */
public class C2254b implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f10242a = 0;

    /* renamed from: b */
    public final Iterator f10243b;

    /* renamed from: c */
    public final Object f10244c;

    public C2254b(Iterator src, InterfaceC2139c src2Dest) {
        AbstractC4154l.m8923f(src, "src");
        AbstractC4154l.m8923f(src2Dest, "src2Dest");
        this.f10243b = src;
        this.f10244c = src2Dest;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10242a) {
        }
        return this.f10243b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10242a) {
            case 0:
                return ((InterfaceC2139c) this.f10244c).invoke(this.f10243b.next());
            default:
                return ((C4915k) this.f10244c).f24457c.invoke(this.f10243b.next());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f10242a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2254b(C4915k c4915k) {
        this.f10244c = c4915k;
        this.f10243b = c4915k.f24456b.iterator();
    }
}
