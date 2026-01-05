package p001o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public class wti extends vti {

    /* renamed from: d */
    public final SparseIntArray f52659d;

    /* renamed from: e */
    public final Parcel f52660e;

    /* renamed from: f */
    public final int f52661f;

    /* renamed from: g */
    public final int f52662g;

    /* renamed from: h */
    public final String f52663h;

    /* renamed from: i */
    public int f52664i;

    /* renamed from: j */
    public int f52665j;

    /* renamed from: k */
    public int f52666k;

    public wti(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new vo0(), new vo0(), new vo0());
    }

    @Override // p001o.vti
    /* renamed from: A */
    public void mo53412A(byte[] bArr) {
        if (bArr == null) {
            this.f52660e.writeInt(-1);
        } else {
            this.f52660e.writeInt(bArr.length);
            this.f52660e.writeByteArray(bArr);
        }
    }

    @Override // p001o.vti
    /* renamed from: C */
    public void mo53414C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f52660e, 0);
    }

    @Override // p001o.vti
    /* renamed from: E */
    public void mo53416E(int i) {
        this.f52660e.writeInt(i);
    }

    @Override // p001o.vti
    /* renamed from: G */
    public void mo53418G(Parcelable parcelable) {
        this.f52660e.writeParcelable(parcelable, 0);
    }

    @Override // p001o.vti
    /* renamed from: I */
    public void mo53420I(String str) {
        this.f52660e.writeString(str);
    }

    @Override // p001o.vti
    /* renamed from: a */
    public void mo53426a() {
        int i = this.f52664i;
        if (i >= 0) {
            int i2 = this.f52659d.get(i);
            int iDataPosition = this.f52660e.dataPosition();
            this.f52660e.setDataPosition(i2);
            this.f52660e.writeInt(iDataPosition - i2);
            this.f52660e.setDataPosition(iDataPosition);
        }
    }

    @Override // p001o.vti
    /* renamed from: b */
    public vti mo53427b() {
        Parcel parcel = this.f52660e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f52665j;
        if (i == this.f52661f) {
            i = this.f52662g;
        }
        return new wti(parcel, iDataPosition, i, this.f52663h + "  ", this.f50888a, this.f50889b, this.f50890c);
    }

    @Override // p001o.vti
    /* renamed from: g */
    public boolean mo53432g() {
        return this.f52660e.readInt() != 0;
    }

    @Override // p001o.vti
    /* renamed from: i */
    public byte[] mo53434i() {
        int i = this.f52660e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f52660e.readByteArray(bArr);
        return bArr;
    }

    @Override // p001o.vti
    /* renamed from: k */
    public CharSequence mo53436k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f52660e);
    }

    @Override // p001o.vti
    /* renamed from: m */
    public boolean mo53438m(int i) {
        while (this.f52665j < this.f52662g) {
            int i2 = this.f52666k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f52660e.setDataPosition(this.f52665j);
            int i3 = this.f52660e.readInt();
            this.f52666k = this.f52660e.readInt();
            this.f52665j += i3;
        }
        return this.f52666k == i;
    }

    @Override // p001o.vti
    /* renamed from: o */
    public int mo53440o() {
        return this.f52660e.readInt();
    }

    @Override // p001o.vti
    /* renamed from: q */
    public Parcelable mo53442q() {
        return this.f52660e.readParcelable(getClass().getClassLoader());
    }

    @Override // p001o.vti
    /* renamed from: s */
    public String mo53444s() {
        return this.f52660e.readString();
    }

    @Override // p001o.vti
    /* renamed from: w */
    public void mo53448w(int i) {
        mo53426a();
        this.f52664i = i;
        this.f52659d.put(i, this.f52660e.dataPosition());
        mo53416E(0);
        mo53416E(i);
    }

    @Override // p001o.vti
    /* renamed from: y */
    public void mo53450y(boolean z) {
        this.f52660e.writeInt(z ? 1 : 0);
    }

    public wti(Parcel parcel, int i, int i2, String str, vo0 vo0Var, vo0 vo0Var2, vo0 vo0Var3) {
        super(vo0Var, vo0Var2, vo0Var3);
        this.f52659d = new SparseIntArray();
        this.f52664i = -1;
        this.f52666k = -1;
        this.f52660e = parcel;
        this.f52661f = i;
        this.f52662g = i2;
        this.f52665j = i;
        this.f52663h = str;
    }
}
