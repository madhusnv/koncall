package zc;

import er.C2123w;
import java.util.Arrays;
import kx.C4266h;
import og.nd;
import org.bouncycastle.crypto.hpke.HPKE;
import pg.z9;
import qc.C6158d;
import qw.C6366p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.k */
/* loaded from: classes.dex */
public final class C8934k extends z9 {

    /* renamed from: e */
    public static final C8934k f42901e = new C8934k(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, null);

    /* renamed from: f */
    public static final C8934k f42902f = new C8934k(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null);

    /* renamed from: g */
    public static final byte[] f42903g = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};

    /* renamed from: a */
    public final byte[] f42904a;

    /* renamed from: b */
    public final String f42905b;

    /* renamed from: c */
    public final C6366p f42906c;

    /* renamed from: d */
    public final C6366p f42907d;

    public C8934k(byte[] bArr, String str) {
        this.f42904a = bArr;
        this.f42905b = str;
        if (bArr.length == 16) {
            this.f42906c = nd.m10782c(new C2123w(10, this));
            this.f42907d = nd.m10782c(new C6158d(22, this));
        } else {
            throw new IllegalArgumentException(("Invalid IPv6 repr: " + bArr + "; expected 16 bytes").toString());
        }
    }

    @Override // pg.z9
    /* renamed from: b */
    public final byte[] mo11973b() {
        return this.f42904a;
    }

    @Override // pg.z9
    /* renamed from: c */
    public final boolean mo11974c() {
        return equals(f42901e);
    }

    /* renamed from: d */
    public final void m16408d(StringBuilder sb2, C4266h c4266h) {
        AbstractC6663m.m12747K(c4266h, sb2, ":", new C8932i(0, this), 60);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8934k.class == obj.getClass() && Arrays.equals(this.f42904a, ((C8934k) obj).f42904a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42904a);
    }

    public final String toString() {
        return (String) this.f42907d.getValue();
    }

    public C8934k(short s5, short s10, short s11, short s12, short s13, short s14, short s15, short s16, String str) {
        this(new byte[]{(byte) (((s5 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s5 & 255), (byte) (((s10 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s10 & 255), (byte) (((s11 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s11 & 255), (byte) (((s12 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s12 & 255), (byte) (((s13 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s13 & 255), (byte) (((s14 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s14 & 255), (byte) (((s15 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s15 & 255), (byte) (((s16 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s16 & 255)}, str);
    }
}
