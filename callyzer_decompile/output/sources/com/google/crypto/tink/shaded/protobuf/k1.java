package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 implements ListIterator {

    /* renamed from: a */
    public ListIterator f7065a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7065a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7065a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f7065a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7065a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f7065a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7065a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
