package com.google.android.gms.internal.measurement;

import a2.AbstractC0030c;
import androidx.datastore.preferences.protobuf.C0309d;
import com.sun.mail.util.AbstractC1452a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import og.xa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class z4 implements Iterable, Serializable {

    /* renamed from: c */
    public static final z4 f6468c = new z4(p5.f6343b);

    /* renamed from: a */
    public int f6469a = 0;

    /* renamed from: b */
    public final byte[] f6470b;

    static {
        int i10 = v4.f6421a;
    }

    public z4(byte[] bArr) {
        bArr.getClass();
        this.f6470b = bArr;
    }

    /* renamed from: e */
    public static z4 m3801e(int i10, int i11, byte[] bArr) {
        m3802g(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new z4(bArr2);
    }

    /* renamed from: g */
    public static int m3802g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    /* renamed from: a */
    public byte mo3792a(int i10) {
        return this.f6470b[i10];
    }

    /* renamed from: b */
    public byte mo3793b(int i10) {
        return this.f6470b[i10];
    }

    /* renamed from: c */
    public int mo3794c() {
        return this.f6470b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z4) && mo3794c() == ((z4) obj).mo3794c()) {
            if (mo3794c() == 0) {
                return true;
            }
            if (!(obj instanceof z4)) {
                return obj.equals(this);
            }
            z4 z4Var = (z4) obj;
            int i10 = this.f6469a;
            int i11 = z4Var.f6469a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int iMo3794c = mo3794c();
                if (iMo3794c > z4Var.mo3794c()) {
                    int iMo3794c2 = mo3794c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iMo3794c).length() + 18 + String.valueOf(iMo3794c2).length());
                    sb2.append("Length too large: ");
                    sb2.append(iMo3794c);
                    sb2.append(iMo3794c2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (iMo3794c <= z4Var.mo3794c()) {
                    byte[] bArr = z4Var.f6470b;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < iMo3794c) {
                        if (this.f6470b[i12] == bArr[i13]) {
                            i12++;
                            i13++;
                        }
                    }
                    return true;
                }
                int iMo3794c3 = z4Var.mo3794c();
                StringBuilder sb3 = new StringBuilder(String.valueOf(iMo3794c).length() + 27 + String.valueOf(iMo3794c3).length());
                sb3.append("Ran off end of other: 0, ");
                sb3.append(iMo3794c);
                sb3.append(", ");
                sb3.append(iMo3794c3);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6469a;
        if (i10 != 0) {
            return i10;
        }
        int iMo3794c = mo3794c();
        int i11 = iMo3794c;
        for (int i12 = 0; i12 < iMo3794c; i12++) {
            i11 = (i11 * 31) + this.f6470b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f6469a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0309d(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo3794c = mo3794c();
        if (mo3794c() <= 50) {
            strConcat = xa.m11038a(this);
        } else {
            int iM3802g = m3802g(0, 47, mo3794c());
            strConcat = xa.m11038a(iM3802g == 0 ? f6468c : new y4(this.f6470b, iM3802g)).concat("...");
        }
        return AbstractC1452a.m4564k(AbstractC0030c.m125p(iMo3794c, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
