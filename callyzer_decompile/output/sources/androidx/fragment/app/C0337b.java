package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import android.text.TextUtils;
import d7.EnumC1645q;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0337b implements Parcelable {
    public static final Parcelable.Creator<C0337b> CREATOR = new C0220a(9);

    /* renamed from: a */
    public final int[] f2457a;

    /* renamed from: b */
    public final ArrayList f2458b;

    /* renamed from: c */
    public final int[] f2459c;

    /* renamed from: d */
    public final int[] f2460d;

    /* renamed from: e */
    public final int f2461e;

    /* renamed from: f */
    public final String f2462f;

    /* renamed from: g */
    public final int f2463g;

    /* renamed from: h */
    public final int f2464h;

    /* renamed from: j */
    public final CharSequence f2465j;

    /* renamed from: k */
    public final int f2466k;

    /* renamed from: l */
    public final CharSequence f2467l;

    /* renamed from: m */
    public final ArrayList f2468m;

    /* renamed from: n */
    public final ArrayList f2469n;

    /* renamed from: p */
    public final boolean f2470p;

    public C0337b(C0336a c0336a) {
        int size = c0336a.f2434a.size();
        this.f2457a = new int[size * 6];
        if (!c0336a.f2440g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2458b = new ArrayList(size);
        this.f2459c = new int[size];
        this.f2460d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            u1 u1Var = (u1) c0336a.f2434a.get(i11);
            int i12 = i10 + 1;
            this.f2457a[i10] = u1Var.f2711a;
            ArrayList arrayList = this.f2458b;
            j0 j0Var = u1Var.f2712b;
            arrayList.add(j0Var != null ? j0Var.mWho : null);
            int[] iArr = this.f2457a;
            iArr[i12] = u1Var.f2713c ? 1 : 0;
            iArr[i10 + 2] = u1Var.f2714d;
            iArr[i10 + 3] = u1Var.f2715e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = u1Var.f2716f;
            i10 += 6;
            iArr[i13] = u1Var.f2717g;
            this.f2459c[i11] = u1Var.f2718h.ordinal();
            this.f2460d[i11] = u1Var.f2719i.ordinal();
        }
        this.f2461e = c0336a.f2439f;
        this.f2462f = c0336a.f2442i;
        this.f2463g = c0336a.f2453t;
        this.f2464h = c0336a.f2443j;
        this.f2465j = c0336a.f2444k;
        this.f2466k = c0336a.f2445l;
        this.f2467l = c0336a.f2446m;
        this.f2468m = c0336a.f2447n;
        this.f2469n = c0336a.f2448o;
        this.f2470p = c0336a.f2449p;
    }

    /* renamed from: a */
    public final void m1114a(C0336a c0336a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f2457a;
            boolean z6 = true;
            if (i10 >= iArr.length) {
                c0336a.f2439f = this.f2461e;
                c0336a.f2442i = this.f2462f;
                c0336a.f2440g = true;
                c0336a.f2443j = this.f2464h;
                c0336a.f2444k = this.f2465j;
                c0336a.f2445l = this.f2466k;
                c0336a.f2446m = this.f2467l;
                c0336a.f2447n = this.f2468m;
                c0336a.f2448o = this.f2469n;
                c0336a.f2449p = this.f2470p;
                return;
            }
            u1 u1Var = new u1();
            int i12 = i10 + 1;
            u1Var.f2711a = iArr[i10];
            if (j1.m1152K(2)) {
                Objects.toString(c0336a);
                int i13 = iArr[i12];
            }
            u1Var.f2718h = EnumC1645q.values()[this.f2459c[i11]];
            u1Var.f2719i = EnumC1645q.values()[this.f2460d[i11]];
            int i14 = i10 + 2;
            if (iArr[i12] == 0) {
                z6 = false;
            }
            u1Var.f2713c = z6;
            int i15 = iArr[i14];
            u1Var.f2714d = i15;
            int i16 = iArr[i10 + 3];
            u1Var.f2715e = i16;
            int i17 = i10 + 5;
            int i18 = iArr[i10 + 4];
            u1Var.f2716f = i18;
            i10 += 6;
            int i19 = iArr[i17];
            u1Var.f2717g = i19;
            c0336a.f2435b = i15;
            c0336a.f2436c = i16;
            c0336a.f2437d = i18;
            c0336a.f2438e = i19;
            c0336a.m1087b(u1Var);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2457a);
        parcel.writeStringList(this.f2458b);
        parcel.writeIntArray(this.f2459c);
        parcel.writeIntArray(this.f2460d);
        parcel.writeInt(this.f2461e);
        parcel.writeString(this.f2462f);
        parcel.writeInt(this.f2463g);
        parcel.writeInt(this.f2464h);
        TextUtils.writeToParcel(this.f2465j, parcel, 0);
        parcel.writeInt(this.f2466k);
        TextUtils.writeToParcel(this.f2467l, parcel, 0);
        parcel.writeStringList(this.f2468m);
        parcel.writeStringList(this.f2469n);
        parcel.writeInt(this.f2470p ? 1 : 0);
    }

    public C0337b(Parcel parcel) {
        this.f2457a = parcel.createIntArray();
        this.f2458b = parcel.createStringArrayList();
        this.f2459c = parcel.createIntArray();
        this.f2460d = parcel.createIntArray();
        this.f2461e = parcel.readInt();
        this.f2462f = parcel.readString();
        this.f2463g = parcel.readInt();
        this.f2464h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2465j = (CharSequence) creator.createFromParcel(parcel);
        this.f2466k = parcel.readInt();
        this.f2467l = (CharSequence) creator.createFromParcel(parcel);
        this.f2468m = parcel.createStringArrayList();
        this.f2469n = parcel.createStringArrayList();
        this.f2470p = parcel.readInt() != 0;
    }
}
