package p001o;

import java.io.RandomAccessFile;

/* loaded from: classes6.dex */
public final class ib9 extends rw6 {

    /* renamed from: e */
    public final RandomAccessFile f28379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib9(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        sq8.m48649h(randomAccessFile, "randomAccessFile");
        this.f28379e = randomAccessFile;
    }

    @Override // p001o.rw6
    /* renamed from: h */
    public synchronized void mo31817h() {
        this.f28379e.close();
    }

    @Override // p001o.rw6
    /* renamed from: k */
    public synchronized int mo31818k(long j, byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "array");
        this.f28379e.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.f28379e.read(bArr, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // p001o.rw6
    /* renamed from: o */
    public synchronized long mo31819o() {
        return this.f28379e.length();
    }
}
