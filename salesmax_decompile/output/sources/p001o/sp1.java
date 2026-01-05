package p001o;

import p001o.m18;

/* loaded from: classes3.dex */
public final class sp1 extends m18.AbstractC15193a {

    /* renamed from: b */
    public final byte[] f45724b;

    /* renamed from: c */
    public final long f45725c;

    public sp1(byte[] bArr) {
        sq8.m48649h(bArr, "bytes");
        this.f45724b = bArr;
        this.f45725c = bArr.length;
    }

    @Override // p001o.m18.AbstractC15193a
    /* renamed from: a */
    public byte[] mo38177a() {
        return this.f45724b;
    }

    @Override // p001o.m18
    public Long getContentLength() {
        return Long.valueOf(this.f45725c);
    }
}
