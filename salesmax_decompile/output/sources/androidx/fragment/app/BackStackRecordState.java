package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC2124j;
import androidx.lifecycle.AbstractC2139h;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C2070a();

    /* renamed from: H */
    public final ArrayList f7326H;

    /* renamed from: L */
    public final boolean f7327L;

    /* renamed from: a */
    public final int[] f7328a;

    /* renamed from: b */
    public final ArrayList f7329b;

    /* renamed from: c */
    public final int[] f7330c;

    /* renamed from: d */
    public final int[] f7331d;

    /* renamed from: e */
    public final int f7332e;

    /* renamed from: f */
    public final String f7333f;

    /* renamed from: g */
    public final int f7334g;

    /* renamed from: h */
    public final int f7335h;

    /* renamed from: q */
    public final CharSequence f7336q;

    /* renamed from: s */
    public final int f7337s;

    /* renamed from: x */
    public final CharSequence f7338x;

    /* renamed from: y */
    public final ArrayList f7339y;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C2070a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C2115a c2115a) {
        int size = c2115a.f7581c.size();
        this.f7328a = new int[size * 6];
        if (!c2115a.f7587i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f7329b = new ArrayList(size);
        this.f7330c = new int[size];
        this.f7331d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AbstractC2124j.a aVar = (AbstractC2124j.a) c2115a.f7581c.get(i);
            int i3 = i2 + 1;
            this.f7328a[i2] = aVar.f7598a;
            ArrayList arrayList = this.f7329b;
            Fragment fragment = aVar.f7599b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f7328a;
            int i4 = i3 + 1;
            iArr[i3] = aVar.f7600c ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = aVar.f7601d;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f7602e;
            int i7 = i6 + 1;
            iArr[i6] = aVar.f7603f;
            iArr[i7] = aVar.f7604g;
            this.f7330c[i] = aVar.f7605h.ordinal();
            this.f7331d[i] = aVar.f7606i.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f7332e = c2115a.f7586h;
        this.f7333f = c2115a.f7589k;
        this.f7334g = c2115a.f7495v;
        this.f7335h = c2115a.f7590l;
        this.f7336q = c2115a.f7591m;
        this.f7337s = c2115a.f7592n;
        this.f7338x = c2115a.f7593o;
        this.f7339y = c2115a.f7594p;
        this.f7326H = c2115a.f7595q;
        this.f7327L = c2115a.f7596r;
    }

    /* renamed from: a */
    public final void m6133a(C2115a c2115a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f7328a.length) {
                c2115a.f7586h = this.f7332e;
                c2115a.f7589k = this.f7333f;
                c2115a.f7587i = true;
                c2115a.f7590l = this.f7335h;
                c2115a.f7591m = this.f7336q;
                c2115a.f7592n = this.f7337s;
                c2115a.f7593o = this.f7338x;
                c2115a.f7594p = this.f7339y;
                c2115a.f7595q = this.f7326H;
                c2115a.f7596r = this.f7327L;
                return;
            }
            AbstractC2124j.a aVar = new AbstractC2124j.a();
            int i3 = i + 1;
            aVar.f7598a = this.f7328a[i];
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(c2115a);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f7328a[i3]);
            }
            aVar.f7605h = AbstractC2139h.b.values()[this.f7330c[i2]];
            aVar.f7606i = AbstractC2139h.b.values()[this.f7331d[i2]];
            int[] iArr = this.f7328a;
            int i4 = i3 + 1;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar.f7600c = z;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar.f7601d = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar.f7602e = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar.f7603f = i10;
            int i11 = iArr[i9];
            aVar.f7604g = i11;
            c2115a.f7582d = i6;
            c2115a.f7583e = i8;
            c2115a.f7584f = i10;
            c2115a.f7585g = i11;
            c2115a.m6422f(aVar);
            i2++;
            i = i9 + 1;
        }
    }

    /* renamed from: b */
    public C2115a m6134b(FragmentManager fragmentManager) {
        C2115a c2115a = new C2115a(fragmentManager);
        m6133a(c2115a);
        c2115a.f7495v = this.f7334g;
        for (int i = 0; i < this.f7329b.size(); i++) {
            String str = (String) this.f7329b.get(i);
            if (str != null) {
                ((AbstractC2124j.a) c2115a.f7581c.get(i)).f7599b = fragmentManager.i0(str);
            }
        }
        c2115a.m6269x(1);
        return c2115a;
    }

    /* renamed from: c */
    public C2115a m6135c(FragmentManager fragmentManager, Map map) {
        C2115a c2115a = new C2115a(fragmentManager);
        m6133a(c2115a);
        for (int i = 0; i < this.f7329b.size(); i++) {
            String str = (String) this.f7329b.get(i);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f7333f + " failed due to missing saved state for Fragment (" + str + ")");
                }
                ((AbstractC2124j.a) c2115a.f7581c.get(i)).f7599b = fragment;
            }
        }
        return c2115a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7328a);
        parcel.writeStringList(this.f7329b);
        parcel.writeIntArray(this.f7330c);
        parcel.writeIntArray(this.f7331d);
        parcel.writeInt(this.f7332e);
        parcel.writeString(this.f7333f);
        parcel.writeInt(this.f7334g);
        parcel.writeInt(this.f7335h);
        TextUtils.writeToParcel(this.f7336q, parcel, 0);
        parcel.writeInt(this.f7337s);
        TextUtils.writeToParcel(this.f7338x, parcel, 0);
        parcel.writeStringList(this.f7339y);
        parcel.writeStringList(this.f7326H);
        parcel.writeInt(this.f7327L ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f7328a = parcel.createIntArray();
        this.f7329b = parcel.createStringArrayList();
        this.f7330c = parcel.createIntArray();
        this.f7331d = parcel.createIntArray();
        this.f7332e = parcel.readInt();
        this.f7333f = parcel.readString();
        this.f7334g = parcel.readInt();
        this.f7335h = parcel.readInt();
        this.f7336q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7337s = parcel.readInt();
        this.f7338x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7339y = parcel.createStringArrayList();
        this.f7326H = parcel.createStringArrayList();
        this.f7327L = parcel.readInt() != 0;
    }
}
