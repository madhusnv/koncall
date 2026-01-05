package e1;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C1899a implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public int f8919a;

    /* renamed from: b */
    public int f8920b;

    /* renamed from: c */
    public boolean f8921c;

    /* renamed from: d */
    public final /* synthetic */ int f8922d;

    /* renamed from: e */
    public final /* synthetic */ Object f8923e;

    public C1899a(int i10) {
        this.f8919a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8920b < this.f8919a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM5634j;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8920b;
        switch (this.f8922d) {
            case 0:
                objM5634j = ((C1903e) this.f8923e).m5634j(i10);
                break;
            case 1:
                objM5634j = ((C1903e) this.f8923e).m5637o(i10);
                break;
            default:
                objM5634j = ((C1904f) this.f8923e).f8959b[i10];
                break;
        }
        this.f8920b++;
        this.f8921c = true;
        return objM5634j;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8921c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f8920b - 1;
        this.f8920b = i10;
        switch (this.f8922d) {
            case 0:
                ((C1903e) this.f8923e).m5635l(i10);
                break;
            case 1:
                ((C1903e) this.f8923e).m5635l(i10);
                break;
            default:
                ((C1904f) this.f8923e).m5556b(i10);
                break;
        }
        this.f8919a--;
        this.f8921c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1899a(C1904f c1904f) {
        this(c1904f.f8960c);
        this.f8922d = 2;
        this.f8923e = c1904f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1899a(C1903e c1903e, int i10) {
        this(c1903e.f9065c);
        this.f8922d = i10;
        switch (i10) {
            case 1:
                this.f8923e = c1903e;
                this(c1903e.f9065c);
                break;
            default:
                this.f8923e = c1903e;
                break;
        }
    }
}
