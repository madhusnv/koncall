package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class uig {

    /* renamed from: a */
    public int f48973a;

    /* renamed from: b */
    public ByteBuffer f48974b;

    /* renamed from: c */
    public int f48975c;

    /* renamed from: d */
    public int f48976d;

    /* renamed from: e */
    public lqi f48977e = lqi.m37788a();

    /* renamed from: a */
    public int m51636a(int i) {
        return i + this.f48974b.getInt(i);
    }

    /* renamed from: b */
    public int m51637b(int i) {
        if (i < this.f48976d) {
            return this.f48974b.getShort(this.f48975c + i);
        }
        return 0;
    }

    /* renamed from: c */
    public void m51638c(int i, ByteBuffer byteBuffer) {
        this.f48974b = byteBuffer;
        if (byteBuffer == null) {
            this.f48973a = 0;
            this.f48975c = 0;
            this.f48976d = 0;
        } else {
            this.f48973a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f48975c = i2;
            this.f48976d = this.f48974b.getShort(i2);
        }
    }

    /* renamed from: d */
    public int m51639d(int i) {
        int i2 = i + this.f48973a;
        return i2 + this.f48974b.getInt(i2) + 4;
    }

    /* renamed from: e */
    public int m51640e(int i) {
        int i2 = i + this.f48973a;
        return this.f48974b.getInt(i2 + this.f48974b.getInt(i2));
    }
}
