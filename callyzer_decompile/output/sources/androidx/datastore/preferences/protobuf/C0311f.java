package androidx.datastore.preferences.protobuf;

import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes.dex */
public final class C0311f extends C0312g {

    /* renamed from: e */
    public final int f2319e;

    /* renamed from: f */
    public final int f2320f;

    public C0311f(byte[] bArr, int i10, int i11) {
        super(bArr);
        C0312g.m869b(i10, i10 + i11, bArr.length);
        this.f2319e = i10;
        this.f2320f = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.C0312g
    /* renamed from: a */
    public final byte mo865a(int i10) {
        int i11 = this.f2320f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f2328b[this.f2319e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC4801l.m9730d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC5601a.m11235f("Index > length: ", i10, i11, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0312g
    /* renamed from: e */
    public final void mo866e(int i10, byte[] bArr) {
        System.arraycopy(this.f2328b, this.f2319e, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.C0312g
    /* renamed from: g */
    public final int mo867g() {
        return this.f2319e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0312g
    /* renamed from: h */
    public final byte mo868h(int i10) {
        return this.f2328b[this.f2319e + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C0312g
    public final int size() {
        return this.f2320f;
    }
}
