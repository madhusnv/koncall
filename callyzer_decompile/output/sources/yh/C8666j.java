package yh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.j */
/* loaded from: classes.dex */
public final class C8666j extends AbstractC8662f {

    /* renamed from: d */
    public final transient C8669m f41974d;

    /* renamed from: e */
    public final transient Object[] f41975e;

    /* renamed from: f */
    public final transient int f41976f;

    public C8666j(C8669m c8669m, Object[] objArr, int i10) {
        this.f41974d = c8669m;
        this.f41975e = objArr;
        this.f41976f = i10;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: a */
    public final int mo15993a(Object[] objArr) {
        return mo16005h().mo15993a(objArr);
    }

    @Override // yh.AbstractC8657a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f41974d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: g */
    public final boolean mo15997g() {
        return true;
    }

    @Override // yh.AbstractC8662f
    /* renamed from: m */
    public final AbstractC8660d mo16006m() {
        return new C8665i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final o0 iterator() {
        return mo16005h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41976f;
    }
}
