package androidx.datastore.preferences.protobuf;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import fb.AbstractC2227a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.g */
/* loaded from: classes.dex */
public class C0312g implements Iterable, Serializable {

    /* renamed from: c */
    public static final C0312g f2325c = new C0312g(b0.f2294b);

    /* renamed from: d */
    public static final C0310e f2326d;

    /* renamed from: a */
    public int f2327a = 0;

    /* renamed from: b */
    public final byte[] f2328b;

    static {
        f2326d = AbstractC0308c.m852a() ? new C0310e(1) : new C0310e(0);
    }

    public C0312g(byte[] bArr) {
        bArr.getClass();
        this.f2328b = bArr;
    }

    /* renamed from: b */
    public static int m869b(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11232c(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("End index: ", i11, i12, " >= "));
    }

    /* renamed from: c */
    public static C0312g m870c(int i10, int i11, byte[] bArr) {
        byte[] bArrCopyOfRange;
        m869b(i10, i10 + i11, bArr.length);
        switch (f2326d.f2313a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C0312g(bArrCopyOfRange);
    }

    /* renamed from: a */
    public byte mo865a(int i10) {
        return this.f2328b[i10];
    }

    /* renamed from: e */
    public void mo866e(int i10, byte[] bArr) {
        System.arraycopy(this.f2328b, 0, bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0312g) || size() != ((C0312g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0312g)) {
            return obj.equals(this);
        }
        C0312g c0312g = (C0312g) obj;
        int i10 = this.f2327a;
        int i11 = c0312g.f2327a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c0312g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0312g.size()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(size, "Ran off end of other: 0, ", ", ");
            sbM4567n.append(c0312g.size());
            throw new IllegalArgumentException(sbM4567n.toString());
        }
        byte[] bArr = c0312g.f2328b;
        int iMo867g = mo867g() + size;
        int iMo867g2 = mo867g();
        int iMo867g3 = c0312g.mo867g();
        while (iMo867g2 < iMo867g) {
            if (this.f2328b[iMo867g2] != bArr[iMo867g3]) {
                return false;
            }
            iMo867g2++;
            iMo867g3++;
        }
        return true;
    }

    /* renamed from: g */
    public int mo867g() {
        return 0;
    }

    /* renamed from: h */
    public byte mo868h(int i10) {
        return this.f2328b[i10];
    }

    public final int hashCode() {
        int i10 = this.f2327a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iMo867g = mo867g();
        int i11 = size;
        for (int i12 = iMo867g; i12 < iMo867g + size; i12++) {
            i11 = (i11 * 31) + this.f2328b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f2327a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0309d(this);
    }

    public int size() {
        return this.f2328b.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC2227a.m5930a(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iM869b = m869b(0, 47, size());
            sb2.append(AbstractC2227a.m5930a(iM869b == 0 ? f2325c : new C0311f(this.f2328b, mo867g(), iM869b)));
            sb2.append("...");
            string = sb2.toString();
        }
        return AbstractC1452a.m4564k(AbstractC0030c.m125p(size, "<ByteString@", hexString, " size=", " contents=\""), string, "\">");
    }
}
