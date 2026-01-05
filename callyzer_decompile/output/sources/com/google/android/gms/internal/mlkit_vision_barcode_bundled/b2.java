package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 extends o0 {

    /* renamed from: b */
    public final c2 f6485b;

    /* renamed from: c */
    public o0 f6486c;

    public b2(d2 d2Var) {
        super(0);
        this.f6485b = new c2(d2Var);
        this.f6486c = m3812b();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0
    /* renamed from: a */
    public final byte mo3811a() {
        o0 o0Var = this.f6486c;
        if (o0Var == null) {
            throw new NoSuchElementException();
        }
        byte bMo3811a = o0Var.mo3811a();
        if (!this.f6486c.hasNext()) {
            this.f6486c = m3812b();
        }
        return bMo3811a;
    }

    /* renamed from: b */
    public final n0 m3812b() {
        c2 c2Var = this.f6485b;
        if (c2Var.hasNext()) {
            return new n0(c2Var.m3814a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6486c != null;
    }
}
