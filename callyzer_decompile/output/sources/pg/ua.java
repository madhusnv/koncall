package pg;

import java.util.AbstractMap;
import og.tb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ua extends ra {

    /* renamed from: c */
    public final /* synthetic */ va f29081c;

    public ua(va vaVar) {
        this.f29081c = vaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        va vaVar = this.f29081c;
        tb.m10929b(i10, vaVar.f29094e);
        Object[] objArr = vaVar.f29093d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29081c.f29094e;
    }
}
