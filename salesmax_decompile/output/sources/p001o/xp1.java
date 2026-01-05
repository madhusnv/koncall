package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public final class xp1 implements h8f {

    /* renamed from: a */
    public final byte[] f54013a;

    /* renamed from: b */
    public int f54014b;

    public xp1(byte[] bArr) {
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f54013a = bArr;
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        int i = this.f54014b;
        if (i >= this.f54013a.length) {
            return -1L;
        }
        long jMin = Math.min(j, r1.length - i);
        int i2 = (int) jMin;
        t6fVar.write(this.f54013a, this.f54014b, i2);
        this.f54014b += i2;
        return jMin;
    }
}
