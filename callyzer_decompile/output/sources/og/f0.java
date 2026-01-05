package og;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends a0 {

    /* renamed from: c */
    public final /* synthetic */ g0 f26418c;

    public f0(g0 g0Var) {
        this.f26418c = g0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        g0 g0Var = this.f26418c;
        qa.m10846a(i10, g0Var.f26456e);
        Object[] objArr = g0Var.f26455d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26418c.f26456e;
    }
}
