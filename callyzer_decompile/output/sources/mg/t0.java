package mg;

import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends u0 {

    /* renamed from: d */
    public final int f23698d;

    /* renamed from: e */
    public final int f23699e;

    public t0(byte[] bArr, int i10, int i11) {
        super(bArr);
        u0.m9649j(i10, i10 + i11, bArr.length);
        this.f23698d = i10;
        this.f23699e = i11;
    }

    @Override // mg.u0
    /* renamed from: a */
    public final byte mo9644a(int i10) {
        int i11 = this.f23699e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f23704b[this.f23698d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC4801l.m9730d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC5601a.m11235f("Index > length: ", i10, i11, ", "));
    }

    @Override // mg.u0
    /* renamed from: b */
    public final byte mo9645b(int i10) {
        return this.f23704b[this.f23698d + i10];
    }

    @Override // mg.u0
    /* renamed from: c */
    public final int mo9646c() {
        return this.f23698d;
    }

    @Override // mg.u0
    /* renamed from: e */
    public final int mo9647e() {
        return this.f23699e;
    }

    @Override // mg.u0
    /* renamed from: g */
    public final void mo9648g(int i10, byte[] bArr) {
        System.arraycopy(this.f23704b, this.f23698d, bArr, 0, i10);
    }
}
