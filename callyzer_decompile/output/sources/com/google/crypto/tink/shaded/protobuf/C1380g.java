package com.google.crypto.tink.shaded.protobuf;

import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.g */
/* loaded from: classes.dex */
public final class C1380g extends C1381h {

    /* renamed from: e */
    public final int f7035e;

    /* renamed from: f */
    public final int f7036f;

    public C1380g(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC1382i.m4276b(i10, i10 + i11, bArr.length);
        this.f7035e = i10;
        this.f7036f = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1381h, com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    /* renamed from: a */
    public final byte mo4224a(int i10) {
        int i11 = this.f7036f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f7043d[this.f7035e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC4801l.m9730d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC5601a.m11235f("Index > length: ", i10, i11, ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1381h, com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    /* renamed from: e */
    public final void mo4225e(int i10, byte[] bArr) {
        System.arraycopy(this.f7043d, this.f7035e, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1381h, com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    /* renamed from: g */
    public final byte mo4226g(int i10) {
        return this.f7043d[this.f7035e + i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1381h
    /* renamed from: j */
    public final int mo4227j() {
        return this.f7035e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1381h, com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    public final int size() {
        return this.f7036f;
    }
}
