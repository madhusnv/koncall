package rw;

import java.util.List;
import java.util.RandomAccess;
import og.oe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.c */
/* loaded from: classes3.dex */
public final class C6653c extends AbstractC6654d implements RandomAccess {

    /* renamed from: a */
    public final AbstractC6654d f31933a;

    /* renamed from: b */
    public final int f31934b;

    /* renamed from: c */
    public final int f31935c;

    public C6653c(AbstractC6654d abstractC6654d, int i10, int i11) {
        this.f31933a = abstractC6654d;
        this.f31934b = i10;
        oe.m10800b(i10, i11, abstractC6654d.mo1628b());
        this.f31935c = i11 - i10;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f31935c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f31935c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return this.f31933a.get(this.f31934b + i10);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final List subList(int i10, int i11) {
        oe.m10800b(i10, i11, this.f31935c);
        int i12 = this.f31934b;
        return new C6653c(this.f31933a, i10 + i12, i12 + i11);
    }
}
