package jakarta.mail.internet;

import java.io.EOFException;
import java.io.OutputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.a */
/* loaded from: classes3.dex */
public final class C3652a extends OutputStream {

    /* renamed from: a */
    public final boolean f19333a;

    /* renamed from: g */
    public final boolean f19339g;

    /* renamed from: b */
    public int f19334b = 0;

    /* renamed from: c */
    public int f19335c = 0;

    /* renamed from: d */
    public int f19336d = 0;

    /* renamed from: e */
    public boolean f19337e = false;

    /* renamed from: f */
    public boolean f19338f = false;

    /* renamed from: h */
    public int f19340h = 0;

    /* renamed from: j */
    public int f19341j = 0;

    public C3652a(boolean z6, boolean z10) {
        boolean z11 = false;
        this.f19339g = false;
        this.f19333a = z6;
        if (z10 && z6) {
            z11 = true;
        }
        this.f19339g = z11;
    }

    /* renamed from: h */
    public final void m8200h(int i10) throws EOFException {
        int i11;
        int i12 = i10 & 255;
        if (this.f19339g && (((i11 = this.f19340h) == 13 && i12 != 10) || (i11 != 13 && i12 == 10))) {
            this.f19338f = true;
        }
        if (i12 == 13 || i12 == 10) {
            this.f19336d = 0;
        } else {
            int i13 = this.f19336d + 1;
            this.f19336d = i13;
            if (i13 > 998) {
                this.f19337e = true;
            }
        }
        if (AbstractC3670s.m8254r(i12)) {
            this.f19335c++;
            if (this.f19333a) {
                this.f19341j = 3;
                throw new EOFException();
            }
        } else {
            this.f19334b++;
        }
        this.f19340h = i12;
    }

    /* renamed from: j */
    public final int m8201j() {
        int i10 = this.f19341j;
        if (i10 != 0) {
            return i10;
        }
        if (this.f19338f) {
            return 3;
        }
        int i11 = this.f19335c;
        return i11 == 0 ? this.f19337e ? 2 : 1 : this.f19334b > i11 ? 2 : 3;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws EOFException {
        m8200h(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws EOFException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws EOFException {
        int i12 = i11 + i10;
        while (i10 < i12) {
            m8200h(bArr[i10]);
            i10++;
        }
    }
}
