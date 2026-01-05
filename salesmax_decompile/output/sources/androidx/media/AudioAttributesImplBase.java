package androidx.media;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f7782a = 0;

    /* renamed from: b */
    public int f7783b = 0;

    /* renamed from: c */
    public int f7784c = 0;

    /* renamed from: d */
    public int f7785d = -1;

    /* renamed from: a */
    public int m6611a() {
        return this.f7783b;
    }

    /* renamed from: b */
    public int m6612b() {
        int i = this.f7784c;
        int iM6613c = m6613c();
        if (iM6613c == 6) {
            i |= 4;
        } else if (iM6613c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m6613c() {
        int i = this.f7785d;
        return i != -1 ? i : AudioAttributesCompat.m6608a(false, this.f7784c, this.f7782a);
    }

    /* renamed from: d */
    public int m6614d() {
        return this.f7782a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f7783b == audioAttributesImplBase.m6611a() && this.f7784c == audioAttributesImplBase.m6612b() && this.f7782a == audioAttributesImplBase.m6614d() && this.f7785d == audioAttributesImplBase.f7785d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7783b), Integer.valueOf(this.f7784c), Integer.valueOf(this.f7782a), Integer.valueOf(this.f7785d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f7785d != -1) {
            sb.append(" stream=");
            sb.append(this.f7785d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m6609b(this.f7782a));
        sb.append(" content=");
        sb.append(this.f7783b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f7784c).toUpperCase());
        return sb.toString();
    }
}
