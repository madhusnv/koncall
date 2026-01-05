package com.google.crypto.tink.shaded.protobuf;

import a2.AbstractC0030c;
import androidx.datastore.preferences.protobuf.C0309d;
import com.sun.mail.util.AbstractC1452a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* loaded from: classes.dex */
public abstract class AbstractC1382i implements Iterable, Serializable {

    /* renamed from: b */
    public static final C1381h f7044b = new C1381h(g0.f7038b);

    /* renamed from: c */
    public static final C1379f f7045c;

    /* renamed from: a */
    public int f7046a;

    static {
        f7045c = AbstractC1376c.m4171a() ? new C1379f(1) : new C1379f(0);
    }

    /* renamed from: b */
    public static int m4276b(int i10, int i11, int i12) {
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
    public static C1381h m4277c(int i10, int i11, byte[] bArr) {
        byte[] bArrCopyOfRange;
        m4276b(i10, i10 + i11, bArr.length);
        switch (f7045c.f7034a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C1381h(bArrCopyOfRange);
    }

    /* renamed from: a */
    public abstract byte mo4224a(int i10);

    /* renamed from: e */
    public abstract void mo4225e(int i10, byte[] bArr);

    /* renamed from: g */
    public abstract byte mo4226g(int i10);

    /* renamed from: h */
    public final byte[] m4278h() {
        int size = size();
        if (size == 0) {
            return g0.f7038b;
        }
        byte[] bArr = new byte[size];
        mo4225e(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i10 = this.f7046a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        C1381h c1381h = (C1381h) this;
        int iMo4227j = c1381h.mo4227j();
        int i11 = size;
        for (int i12 = iMo4227j; i12 < iMo4227j + size; i12++) {
            i11 = (i11 * 31) + c1381h.f7043d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f7046a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0309d(this);
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = t0.m4414t(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C1381h c1381h = (C1381h) this;
            int iM4276b = m4276b(0, 47, c1381h.size());
            sb2.append(t0.m4414t(iM4276b == 0 ? f7044b : new C1380g(c1381h.f7043d, c1381h.mo4227j(), iM4276b)));
            sb2.append("...");
            string = sb2.toString();
        }
        return AbstractC1452a.m4564k(AbstractC0030c.m125p(size, "<ByteString@", hexString, " size=", " contents=\""), string, "\">");
    }
}
