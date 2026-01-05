package mg;

import a2.AbstractC0030c;
import androidx.datastore.preferences.protobuf.C0309d;
import com.sun.mail.util.AbstractC1452a;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class u0 implements Iterable, Serializable {

    /* renamed from: c */
    public static final u0 f23702c = new u0(v0.f23705a);

    /* renamed from: a */
    public int f23703a = 0;

    /* renamed from: b */
    public final byte[] f23704b;

    static {
        int i10 = s0.f23695a;
    }

    public u0(byte[] bArr) {
        bArr.getClass();
        this.f23704b = bArr;
    }

    /* renamed from: j */
    public static int m9649j(int i10, int i11, int i12) {
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

    /* renamed from: k */
    public static u0 m9650k(int i10, byte[] bArr) {
        m9649j(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new u0(bArr2);
    }

    /* renamed from: a */
    public byte mo9644a(int i10) {
        return this.f23704b[i10];
    }

    /* renamed from: b */
    public byte mo9645b(int i10) {
        return this.f23704b[i10];
    }

    /* renamed from: c */
    public int mo9646c() {
        return 0;
    }

    /* renamed from: e */
    public int mo9647e() {
        return this.f23704b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0) || mo9647e() != ((u0) obj).mo9647e()) {
            return false;
        }
        if (mo9647e() == 0) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return obj.equals(this);
        }
        u0 u0Var = (u0) obj;
        int i10 = this.f23703a;
        int i11 = u0Var.f23703a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iMo9647e = mo9647e();
        if (iMo9647e > u0Var.mo9647e()) {
            throw new IllegalArgumentException("Length too large: " + iMo9647e + mo9647e());
        }
        if (iMo9647e > u0Var.mo9647e()) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Ran off end of other: 0, ", iMo9647e, u0Var.mo9647e(), ", "));
        }
        byte[] bArr = u0Var.f23704b;
        int iMo9646c = mo9646c() + iMo9647e;
        int iMo9646c2 = mo9646c();
        int iMo9646c3 = u0Var.mo9646c();
        while (iMo9646c2 < iMo9646c) {
            if (this.f23704b[iMo9646c2] != bArr[iMo9646c3]) {
                return false;
            }
            iMo9646c2++;
            iMo9646c3++;
        }
        return true;
    }

    /* renamed from: g */
    public void mo9648g(int i10, byte[] bArr) {
        System.arraycopy(this.f23704b, 0, bArr, 0, i10);
    }

    /* renamed from: h */
    public final ByteArrayInputStream m9651h() {
        return new ByteArrayInputStream(this.f23704b, mo9646c(), mo9647e());
    }

    public final int hashCode() {
        int i10 = this.f23703a;
        if (i10 != 0) {
            return i10;
        }
        int iMo9647e = mo9647e();
        int iMo9646c = mo9646c();
        byte[] bArr = v0.f23705a;
        int i11 = iMo9647e;
        for (int i12 = iMo9646c; i12 < iMo9646c + iMo9647e; i12++) {
            i11 = (i11 * 31) + this.f23704b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f23703a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0309d(this);
    }

    /* renamed from: m */
    public final byte[] m9652m() {
        int iMo9647e = mo9647e();
        if (iMo9647e == 0) {
            return v0.f23705a;
        }
        byte[] bArr = new byte[iMo9647e];
        mo9648g(iMo9647e, bArr);
        return bArr;
    }

    public final String toString() {
        u0 t0Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo9647e = mo9647e();
        if (mo9647e() <= 50) {
            strConcat = AbstractC4723b.m9602d(this);
        } else {
            int iM9649j = m9649j(0, 47, mo9647e());
            if (iM9649j == 0) {
                t0Var = f23702c;
            } else {
                t0Var = new t0(this.f23704b, mo9646c(), iM9649j);
            }
            strConcat = AbstractC4723b.m9602d(t0Var).concat("...");
        }
        return AbstractC1452a.m4564k(AbstractC0030c.m125p(iMo9647e, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
