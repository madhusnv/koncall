package p001o;

import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class v0b extends w0b {

    /* renamed from: c */
    public final MessageDigest f49725c = MessageDigest.getInstance("MD5");

    @Override // p001o.ax7
    /* renamed from: a */
    public byte[] mo17932a() {
        byte[] bArrDigest = this.f49725c.digest();
        sq8.m48648g(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    @Override // p001o.ax7
    /* renamed from: b */
    public void mo17933b(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "input");
        this.f49725c.update(bArr, i, i2);
    }
}
