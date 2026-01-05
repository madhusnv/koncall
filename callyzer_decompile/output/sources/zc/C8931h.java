package zc;

import java.util.Arrays;
import pg.z9;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.h */
/* loaded from: classes.dex */
public final class C8931h extends z9 {

    /* renamed from: b */
    public static final C8931h f42895b = new C8931h((byte) 127, (byte) 0, (byte) 0, (byte) 1);

    /* renamed from: a */
    public final byte[] f42896a;

    static {
        new C8931h((byte) 0, (byte) 0, (byte) 0, (byte) 0);
    }

    public C8931h(byte[] bArr) {
        this.f42896a = bArr;
        if (bArr.length == 4) {
            return;
        }
        throw new IllegalArgumentException(("Invalid IPv4 repr: " + bArr + "; expected 4 bytes").toString());
    }

    @Override // pg.z9
    /* renamed from: b */
    public final byte[] mo11973b() {
        return this.f42896a;
    }

    @Override // pg.z9
    /* renamed from: c */
    public final boolean mo11974c() {
        return this.f42896a[0] == 127;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8931h.class == obj.getClass() && Arrays.equals(this.f42896a, ((C8931h) obj).f42896a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42896a);
    }

    public final String toString() {
        return AbstractC6662l.m12701D(this.f42896a, ".", new C8930g(0), 30);
    }

    public C8931h(byte b10, byte b11, byte b12, byte b13) {
        this(new byte[]{b10, b11, b12, b13});
    }
}
