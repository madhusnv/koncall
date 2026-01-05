package mj;

import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mj.b */
/* loaded from: classes.dex */
public final class C4754b extends OutputStream {

    /* renamed from: a */
    public final /* synthetic */ int f23749a;

    /* renamed from: b */
    public long f23750b;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        switch (this.f23749a) {
            case 0:
                this.f23750b++;
                break;
            case 1:
                this.f23750b++;
                break;
            default:
                this.f23750b++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f23749a) {
            case 0:
                this.f23750b += bArr.length;
                break;
            case 1:
                this.f23750b += bArr.length;
                break;
            default:
                this.f23750b += bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        int length;
        int i13;
        int length2;
        int i14;
        switch (this.f23749a) {
            case 0:
                if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
                    this.f23750b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i13 = i10 + i11) <= length && i13 >= 0) {
                    this.f23750b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i10 >= 0 && i10 <= (length2 = bArr.length) && i11 >= 0 && (i14 = i10 + i11) <= length2 && i14 >= 0) {
                    this.f23750b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
