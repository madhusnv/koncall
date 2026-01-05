package rf;

import c9.C0910e;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Arrays;
import pf.C5904d;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.q */
/* loaded from: classes.dex */
public final class C6512q {

    /* renamed from: a */
    public final C6496a f31268a;

    /* renamed from: b */
    public final C5904d f31269b;

    public /* synthetic */ C6512q(C6496a c6496a, C5904d c5904d) {
        this.f31268a = c6496a;
        this.f31269b = c5904d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C6512q)) {
            C6512q c6512q = (C6512q) obj;
            if (AbstractC6840z.m13040k(this.f31268a, c6512q.f31268a) && AbstractC6840z.m13040k(this.f31269b, c6512q.f31269b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31268a, this.f31269b});
    }

    public final String toString() {
        C0910e c0910e = new C0910e(this);
        c0910e.m2606p(this.f31268a, TransferTable.COLUMN_KEY);
        c0910e.m2606p(this.f31269b, "feature");
        return c0910e.toString();
    }
}
