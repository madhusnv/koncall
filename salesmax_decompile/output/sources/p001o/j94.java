package p001o;

import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public final class j94 extends k94 {

    /* renamed from: c */
    public final CRC32 f29978c = new CRC32();

    @Override // p001o.ax7
    /* renamed from: b */
    public void mo17933b(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "input");
        this.f29978c.update(bArr, i, i2);
    }

    @Override // p001o.k94
    /* renamed from: d */
    public int mo33424d() {
        return j0i.m33018c((int) this.f29978c.getValue());
    }

    @Override // p001o.ax7
    public void reset() {
        this.f29978c.reset();
    }
}
