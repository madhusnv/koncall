package r8;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.sun.mail.util.AbstractC1452a;
import e1.C1903e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r8.b */
/* loaded from: classes.dex */
public final class C6485b extends AbstractC6484a {

    /* renamed from: d */
    public final SparseIntArray f31154d;

    /* renamed from: e */
    public final Parcel f31155e;

    /* renamed from: f */
    public final int f31156f;

    /* renamed from: g */
    public final int f31157g;

    /* renamed from: h */
    public final String f31158h;

    /* renamed from: i */
    public int f31159i;

    /* renamed from: j */
    public int f31160j;

    /* renamed from: k */
    public int f31161k;

    public C6485b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1903e(0), new C1903e(0), new C1903e(0));
    }

    @Override // r8.AbstractC6484a
    /* renamed from: a */
    public final C6485b mo12485a() {
        Parcel parcel = this.f31155e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f31160j;
        if (i10 == this.f31156f) {
            i10 = this.f31157g;
        }
        return new C6485b(parcel, iDataPosition, i10, AbstractC1452a.m4564k(new StringBuilder(), this.f31158h, "  "), this.f31151a, this.f31152b, this.f31153c);
    }

    @Override // r8.AbstractC6484a
    /* renamed from: e */
    public final boolean mo12489e(int i10) {
        while (this.f31160j < this.f31157g) {
            int i11 = this.f31161k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f31160j;
            Parcel parcel = this.f31155e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f31161k = parcel.readInt();
            this.f31160j += i13;
        }
        return this.f31161k == i10;
    }

    @Override // r8.AbstractC6484a
    /* renamed from: i */
    public final void mo12493i(int i10) {
        int i11 = this.f31159i;
        SparseIntArray sparseIntArray = this.f31154d;
        Parcel parcel = this.f31155e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f31159i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public C6485b(Parcel parcel, int i10, int i11, String str, C1903e c1903e, C1903e c1903e2, C1903e c1903e3) {
        super(c1903e, c1903e2, c1903e3);
        this.f31154d = new SparseIntArray();
        this.f31159i = -1;
        this.f31161k = -1;
        this.f31155e = parcel;
        this.f31156f = i10;
        this.f31157g = i11;
        this.f31160j = i10;
        this.f31158h = str;
    }
}
