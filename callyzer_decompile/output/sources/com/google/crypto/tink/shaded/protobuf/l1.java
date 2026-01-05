package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 implements Iterator {

    /* renamed from: a */
    public Iterator f7070a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7070a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f7070a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
