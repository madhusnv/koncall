package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o0 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f6623a;

    /* renamed from: a */
    public abstract byte mo3811a();

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(mo3811a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6623a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
