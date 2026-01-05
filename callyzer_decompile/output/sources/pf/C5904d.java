package pf;

import android.os.Parcel;
import android.os.Parcelable;
import c9.C0910e;
import com.sun.mail.imap.IMAPStore;
import java.util.Arrays;
import lf.C4462m;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.d */
/* loaded from: classes.dex */
public final class C5904d extends AbstractC7149a {
    public static final Parcelable.Creator<C5904d> CREATOR = new C4462m(13);

    /* renamed from: a */
    public final String f28742a;

    /* renamed from: b */
    public final int f28743b;

    /* renamed from: c */
    public final long f28744c;

    public C5904d(String str, int i10, long j6) {
        this.f28742a = str;
        this.f28743b = i10;
        this.f28744c = j6;
    }

    /* renamed from: b */
    public final long m11508b() {
        long j6 = this.f28744c;
        return j6 == -1 ? this.f28743b : j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5904d) {
            C5904d c5904d = (C5904d) obj;
            String str = c5904d.f28742a;
            String str2 = this.f28742a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && m11508b() == c5904d.m11508b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28742a, Long.valueOf(m11508b())});
    }

    public final String toString() {
        C0910e c0910e = new C0910e(this);
        c0910e.m2606p(this.f28742a, IMAPStore.ID_NAME);
        c0910e.m2606p(Long.valueOf(m11508b()), IMAPStore.ID_VERSION);
        return c0910e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f28742a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f28743b);
        long jM11508b = m11508b();
        AbstractC5932m.m11785m(parcel, 3, 8);
        parcel.writeLong(jM11508b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    public C5904d(String str, long j6) {
        this.f28742a = str;
        this.f28744c = j6;
        this.f28743b = -1;
    }
}
