package yi;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.j */
/* loaded from: classes.dex */
public final class C8681j extends InputStream {

    /* renamed from: a */
    public int f42022a;

    /* renamed from: b */
    public int f42023b;

    /* renamed from: c */
    public final /* synthetic */ C8683l f42024c;

    public C8681j(C8683l c8683l, C8680i c8680i) {
        this.f42024c = c8683l;
        this.f42022a = c8683l.m16027R(c8680i.f42020a + 4);
        this.f42023b = c8680i.f42021b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f42023b;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f42022a;
        C8683l c8683l = this.f42024c;
        c8683l.m16024H(i13, i10, bArr, i11);
        this.f42022a = c8683l.m16027R(this.f42022a + i11);
        this.f42023b -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f42023b == 0) {
            return -1;
        }
        C8683l c8683l = this.f42024c;
        c8683l.f42026a.seek(this.f42022a);
        int i10 = c8683l.f42026a.read();
        this.f42022a = c8683l.m16027R(this.f42022a + 1);
        this.f42023b--;
        return i10;
    }
}
