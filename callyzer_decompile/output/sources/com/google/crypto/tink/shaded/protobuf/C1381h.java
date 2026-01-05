package com.google.crypto.tink.shaded.protobuf;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* loaded from: classes.dex */
public class C1381h extends AbstractC1382i {

    /* renamed from: d */
    public final byte[] f7043d;

    public C1381h(byte[] bArr) {
        this.f7046a = 0;
        bArr.getClass();
        this.f7043d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    /* renamed from: a */
    public byte mo4224a(int i10) {
        return this.f7043d[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    /* renamed from: e */
    public void mo4225e(int i10, byte[] bArr) {
        System.arraycopy(this.f7043d, 0, bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1382i) || size() != ((AbstractC1382i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1381h)) {
            return obj.equals(this);
        }
        C1381h c1381h = (C1381h) obj;
        int i10 = this.f7046a;
        int i11 = c1381h.f7046a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c1381h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1381h.size()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(size, "Ran off end of other: 0, ", ", ");
            sbM4567n.append(c1381h.size());
            throw new IllegalArgumentException(sbM4567n.toString());
        }
        byte[] bArr = c1381h.f7043d;
        int iMo4227j = mo4227j() + size;
        int iMo4227j2 = mo4227j();
        int iMo4227j3 = c1381h.mo4227j();
        while (iMo4227j2 < iMo4227j) {
            if (this.f7043d[iMo4227j2] != bArr[iMo4227j3]) {
                return false;
            }
            iMo4227j2++;
            iMo4227j3++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    /* renamed from: g */
    public byte mo4226g(int i10) {
        return this.f7043d[i10];
    }

    /* renamed from: j */
    public int mo4227j() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1382i
    public int size() {
        return this.f7043d.length;
    }
}
