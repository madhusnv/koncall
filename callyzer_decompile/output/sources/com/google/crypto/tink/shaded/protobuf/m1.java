package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 extends AbstractList implements j0, RandomAccess {

    /* renamed from: a */
    public final i0 f7079a;

    public m1(i0 i0Var) {
        this.f7079a = i0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: d */
    public final List mo4279d() {
        return Collections.unmodifiableList(this.f7079a.f7047b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f7079a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        l1 l1Var = new l1();
        l1Var.f7070a = this.f7079a.iterator();
        return l1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: l */
    public final void mo4280l(C1381h c1381h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        k1 k1Var = new k1();
        k1Var.f7065a = this.f7079a.listIterator(i10);
        return k1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: p */
    public final Object mo4282p(int i10) {
        return this.f7079a.f7047b.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7079a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    /* renamed from: n */
    public final j0 mo4281n() {
        return this;
    }
}
