package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC1375b implements j0, RandomAccess {

    /* renamed from: b */
    public final ArrayList f7047b;

    static {
        new i0(10).f7018a = false;
    }

    public i0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m4167a();
        this.f7047b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1375b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f7047b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1375b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4167a();
        this.f7047b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: d */
    public final List mo4279d() {
        return Collections.unmodifiableList(this.f7047b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f7047b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC1382i)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, g0.f7037a);
            if (u1.f7121a.m4418v(0, bArr.length, bArr)) {
                arrayList.set(i10, str2);
            }
            return str2;
        }
        AbstractC1382i abstractC1382i = (AbstractC1382i) obj;
        Charset charset = g0.f7037a;
        if (abstractC1382i.size() == 0) {
            str = "";
        } else {
            C1381h c1381h = (C1381h) abstractC1382i;
            str = new String(c1381h.f7043d, c1381h.mo4227j(), c1381h.size(), charset);
        }
        C1381h c1381h2 = (C1381h) abstractC1382i;
        int iMo4227j = c1381h2.mo4227j();
        byte[] bArr2 = c1381h2.f7043d;
        if (u1.f7121a.m4418v(iMo4227j, c1381h2.size() + iMo4227j, bArr2)) {
            arrayList.set(i10, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /* renamed from: i */
    public final f0 mo4173i(int i10) {
        ArrayList arrayList = this.f7047b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new i0(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: l */
    public final void mo4280l(C1381h c1381h) {
        m4167a();
        this.f7047b.add(c1381h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: n */
    public final j0 mo4281n() {
        return this.f7018a ? new m1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: p */
    public final Object mo4282p(int i10) {
        return this.f7047b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m4167a();
        Object objRemove = this.f7047b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC1382i)) {
            return new String((byte[]) objRemove, g0.f7037a);
        }
        AbstractC1382i abstractC1382i = (AbstractC1382i) objRemove;
        Charset charset = g0.f7037a;
        if (abstractC1382i.size() == 0) {
            return "";
        }
        C1381h c1381h = (C1381h) abstractC1382i;
        return new String(c1381h.f7043d, c1381h.mo4227j(), c1381h.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m4167a();
        Object obj2 = this.f7047b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC1382i)) {
            return new String((byte[]) obj2, g0.f7037a);
        }
        AbstractC1382i abstractC1382i = (AbstractC1382i) obj2;
        Charset charset = g0.f7037a;
        if (abstractC1382i.size() == 0) {
            return "";
        }
        C1381h c1381h = (C1381h) abstractC1382i;
        return new String(c1381h.f7043d, c1381h.mo4227j(), c1381h.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7047b.size();
    }

    public i0(ArrayList arrayList) {
        this.f7047b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1375b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m4167a();
        if (collection instanceof j0) {
            collection = ((j0) collection).mo4279d();
        }
        boolean zAddAll = this.f7047b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
