package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends o0 {

    /* renamed from: b */
    public int f6611b;

    /* renamed from: c */
    public final int f6612c;

    /* renamed from: d */
    public final /* synthetic */ r0 f6613d;

    public n0(r0 r0Var) {
        super(0);
        this.f6613d = r0Var;
        this.f6611b = 0;
        this.f6612c = r0Var.mo3818e();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0
    /* renamed from: a */
    public final byte mo3811a() {
        int i10 = this.f6611b;
        if (i10 >= this.f6612c) {
            throw new NoSuchElementException();
        }
        this.f6611b = i10 + 1;
        return this.f6613d.mo3817b(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6611b < this.f6612c;
    }
}
