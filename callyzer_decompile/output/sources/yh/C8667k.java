package yh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.k */
/* loaded from: classes.dex */
public final class C8667k extends AbstractC8662f {

    /* renamed from: d */
    public final transient C8669m f41977d;

    /* renamed from: e */
    public final transient C8668l f41978e;

    public C8667k(C8669m c8669m, C8668l c8668l) {
        this.f41977d = c8669m;
        this.f41978e = c8668l;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: a */
    public final int mo15993a(Object[] objArr) {
        return this.f41978e.mo15993a(objArr);
    }

    @Override // yh.AbstractC8657a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41977d.get(obj) != null;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: g */
    public final boolean mo15997g() {
        return true;
    }

    @Override // yh.AbstractC8662f
    /* renamed from: h */
    public final AbstractC8660d mo16005h() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final o0 iterator() {
        return this.f41978e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41977d.f41988f;
    }
}
