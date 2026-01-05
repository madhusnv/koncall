package xe;

import android.util.Base64;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import ue.EnumC7422d;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.i */
/* loaded from: classes.dex */
public final class C8357i {

    /* renamed from: a */
    public final String f39998a;

    /* renamed from: b */
    public final byte[] f39999b;

    /* renamed from: c */
    public final EnumC7422d f40000c;

    public C8357i(String str, byte[] bArr, EnumC7422d enumC7422d) {
        this.f39998a = str;
        this.f39999b = bArr;
        this.f40000c = enumC7422d;
    }

    /* renamed from: a */
    public static C7439j m15532a() {
        C7439j c7439j = new C7439j(15);
        EnumC7422d enumC7422d = EnumC7422d.DEFAULT;
        if (enumC7422d == null) {
            throw new NullPointerException("Null priority");
        }
        c7439j.f35539d = enumC7422d;
        return c7439j;
    }

    /* renamed from: b */
    public final C8357i m15533b(EnumC7422d enumC7422d) {
        C7439j c7439jM15532a = m15532a();
        c7439jM15532a.m13997C(this.f39998a);
        if (enumC7422d == null) {
            throw new NullPointerException("Null priority");
        }
        c7439jM15532a.f35539d = enumC7422d;
        c7439jM15532a.f35537b = this.f39999b;
        return c7439jM15532a.m14003n();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8357i) {
            C8357i c8357i = (C8357i) obj;
            if (this.f39998a.equals(c8357i.f39998a) && Arrays.equals(this.f39999b, c8357i.f39999b) && this.f40000c.equals(c8357i.f40000c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f39998a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f39999b)) * 1000003) ^ this.f40000c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f39999b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f39998a);
        sb2.append(", ");
        sb2.append(this.f40000c);
        sb2.append(", ");
        return AbstractC1452a.m4564k(sb2, strEncodeToString, ")");
    }
}
