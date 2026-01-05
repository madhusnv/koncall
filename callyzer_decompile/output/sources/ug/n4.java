package ug;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n4 extends AbstractC7149a {
    public static final Parcelable.Creator<n4> CREATOR = new sf.g0(24);

    /* renamed from: B */
    public final int f35689B;

    /* renamed from: C */
    public final String f35690C;

    /* renamed from: D */
    public final int f35691D;

    /* renamed from: E */
    public final long f35692E;

    /* renamed from: F */
    public final String f35693F;

    /* renamed from: G */
    public final String f35694G;

    /* renamed from: H */
    public final long f35695H;

    /* renamed from: I */
    public final int f35696I;

    /* renamed from: a */
    public final String f35697a;

    /* renamed from: b */
    public final String f35698b;

    /* renamed from: c */
    public final String f35699c;

    /* renamed from: d */
    public final String f35700d;

    /* renamed from: e */
    public final long f35701e;

    /* renamed from: f */
    public final long f35702f;

    /* renamed from: g */
    public final String f35703g;

    /* renamed from: h */
    public final boolean f35704h;

    /* renamed from: j */
    public final boolean f35705j;

    /* renamed from: k */
    public final long f35706k;

    /* renamed from: l */
    public final String f35707l;

    /* renamed from: m */
    public final long f35708m;

    /* renamed from: n */
    public final int f35709n;

    /* renamed from: p */
    public final boolean f35710p;

    /* renamed from: q */
    public final boolean f35711q;

    /* renamed from: r */
    public final Boolean f35712r;

    /* renamed from: s */
    public final long f35713s;

    /* renamed from: t */
    public final List f35714t;

    /* renamed from: v */
    public final String f35715v;

    /* renamed from: w */
    public final String f35716w;

    /* renamed from: x */
    public final String f35717x;

    /* renamed from: y */
    public final boolean f35718y;

    /* renamed from: z */
    public final long f35719z;

    public n4(String str, String str2, String str3, long j6, String str4, long j10, long j11, String str5, boolean z6, boolean z10, String str6, long j12, int i10, boolean z11, boolean z12, Boolean bool, long j13, List list, String str7, String str8, String str9, boolean z13, long j14, int i11, String str10, int i12, long j15, String str11, String str12, long j16, int i13) {
        AbstractC6840z.m13033d(str);
        this.f35697a = str;
        this.f35698b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f35699c = str3;
        this.f35706k = j6;
        this.f35700d = str4;
        this.f35701e = j10;
        this.f35702f = j11;
        this.f35703g = str5;
        this.f35704h = z6;
        this.f35705j = z10;
        this.f35707l = str6;
        this.f35708m = j12;
        this.f35709n = i10;
        this.f35710p = z11;
        this.f35711q = z12;
        this.f35712r = bool;
        this.f35713s = j13;
        this.f35714t = list;
        this.f35715v = str7;
        this.f35716w = str8;
        this.f35717x = str9;
        this.f35718y = z13;
        this.f35719z = j14;
        this.f35689B = i11;
        this.f35690C = str10;
        this.f35691D = i12;
        this.f35692E = j15;
        this.f35693F = str11;
        this.f35694G = str12;
        this.f35695H = j16;
        this.f35696I = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f35697a);
        AbstractC5932m.m11778f(parcel, 3, this.f35698b);
        AbstractC5932m.m11778f(parcel, 4, this.f35699c);
        AbstractC5932m.m11778f(parcel, 5, this.f35700d);
        AbstractC5932m.m11785m(parcel, 6, 8);
        parcel.writeLong(this.f35701e);
        AbstractC5932m.m11785m(parcel, 7, 8);
        parcel.writeLong(this.f35702f);
        AbstractC5932m.m11778f(parcel, 8, this.f35703g);
        AbstractC5932m.m11785m(parcel, 9, 4);
        parcel.writeInt(this.f35704h ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 10, 4);
        parcel.writeInt(this.f35705j ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 11, 8);
        parcel.writeLong(this.f35706k);
        AbstractC5932m.m11778f(parcel, 12, this.f35707l);
        AbstractC5932m.m11785m(parcel, 14, 8);
        parcel.writeLong(this.f35708m);
        AbstractC5932m.m11785m(parcel, 15, 4);
        parcel.writeInt(this.f35709n);
        AbstractC5932m.m11785m(parcel, 16, 4);
        parcel.writeInt(this.f35710p ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 18, 4);
        parcel.writeInt(this.f35711q ? 1 : 0);
        Boolean bool = this.f35712r;
        if (bool != null) {
            AbstractC5932m.m11785m(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC5932m.m11785m(parcel, 22, 8);
        parcel.writeLong(this.f35713s);
        AbstractC5932m.m11780h(parcel, 23, this.f35714t);
        AbstractC5932m.m11778f(parcel, 25, this.f35715v);
        AbstractC5932m.m11778f(parcel, 26, this.f35716w);
        AbstractC5932m.m11778f(parcel, 27, this.f35717x);
        AbstractC5932m.m11785m(parcel, 28, 4);
        parcel.writeInt(this.f35718y ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 29, 8);
        parcel.writeLong(this.f35719z);
        AbstractC5932m.m11785m(parcel, 30, 4);
        parcel.writeInt(this.f35689B);
        AbstractC5932m.m11778f(parcel, 31, this.f35690C);
        AbstractC5932m.m11785m(parcel, 32, 4);
        parcel.writeInt(this.f35691D);
        AbstractC5932m.m11785m(parcel, 34, 8);
        parcel.writeLong(this.f35692E);
        AbstractC5932m.m11778f(parcel, 35, this.f35693F);
        AbstractC5932m.m11778f(parcel, 36, this.f35694G);
        AbstractC5932m.m11785m(parcel, 37, 8);
        parcel.writeLong(this.f35695H);
        AbstractC5932m.m11785m(parcel, 38, 4);
        parcel.writeInt(this.f35696I);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    public n4(String str, String str2, String str3, String str4, long j6, long j10, String str5, boolean z6, boolean z10, long j11, String str6, long j12, int i10, boolean z11, boolean z12, Boolean bool, long j13, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j14, int i11, String str10, int i12, long j15, String str11, String str12, long j16, int i13) {
        this.f35697a = str;
        this.f35698b = str2;
        this.f35699c = str3;
        this.f35706k = j11;
        this.f35700d = str4;
        this.f35701e = j6;
        this.f35702f = j10;
        this.f35703g = str5;
        this.f35704h = z6;
        this.f35705j = z10;
        this.f35707l = str6;
        this.f35708m = j12;
        this.f35709n = i10;
        this.f35710p = z11;
        this.f35711q = z12;
        this.f35712r = bool;
        this.f35713s = j13;
        this.f35714t = arrayList;
        this.f35715v = str7;
        this.f35716w = str8;
        this.f35717x = str9;
        this.f35718y = z13;
        this.f35719z = j14;
        this.f35689B = i11;
        this.f35690C = str10;
        this.f35691D = i12;
        this.f35692E = j15;
        this.f35693F = str11;
        this.f35694G = str12;
        this.f35695H = j16;
        this.f35696I = i13;
    }
}
