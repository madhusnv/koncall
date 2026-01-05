package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import d7.EnumC1645q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new C0220a(13);

    /* renamed from: a */
    public final String f2659a;

    /* renamed from: b */
    public final String f2660b;

    /* renamed from: c */
    public final boolean f2661c;

    /* renamed from: d */
    public final boolean f2662d;

    /* renamed from: e */
    public final int f2663e;

    /* renamed from: f */
    public final int f2664f;

    /* renamed from: g */
    public final String f2665g;

    /* renamed from: h */
    public final boolean f2666h;

    /* renamed from: j */
    public final boolean f2667j;

    /* renamed from: k */
    public final boolean f2668k;

    /* renamed from: l */
    public final boolean f2669l;

    /* renamed from: m */
    public final int f2670m;

    /* renamed from: n */
    public final String f2671n;

    /* renamed from: p */
    public final int f2672p;

    /* renamed from: q */
    public final boolean f2673q;

    public p1(j0 j0Var) {
        this.f2659a = j0Var.getClass().getName();
        this.f2660b = j0Var.mWho;
        this.f2661c = j0Var.mFromLayout;
        this.f2662d = j0Var.mInDynamicContainer;
        this.f2663e = j0Var.mFragmentId;
        this.f2664f = j0Var.mContainerId;
        this.f2665g = j0Var.mTag;
        this.f2666h = j0Var.mRetainInstance;
        this.f2667j = j0Var.mRemoving;
        this.f2668k = j0Var.mDetached;
        this.f2669l = j0Var.mHidden;
        this.f2670m = j0Var.mMaxState.ordinal();
        this.f2671n = j0Var.mTargetWho;
        this.f2672p = j0Var.mTargetRequestCode;
        this.f2673q = j0Var.mUserVisibleHint;
    }

    /* renamed from: a */
    public final j0 m1230a(b1 b1Var) {
        j0 j0VarM1119a = b1Var.m1119a(this.f2659a);
        j0VarM1119a.mWho = this.f2660b;
        j0VarM1119a.mFromLayout = this.f2661c;
        j0VarM1119a.mInDynamicContainer = this.f2662d;
        j0VarM1119a.mRestored = true;
        j0VarM1119a.mFragmentId = this.f2663e;
        j0VarM1119a.mContainerId = this.f2664f;
        j0VarM1119a.mTag = this.f2665g;
        j0VarM1119a.mRetainInstance = this.f2666h;
        j0VarM1119a.mRemoving = this.f2667j;
        j0VarM1119a.mDetached = this.f2668k;
        j0VarM1119a.mHidden = this.f2669l;
        j0VarM1119a.mMaxState = EnumC1645q.values()[this.f2670m];
        j0VarM1119a.mTargetWho = this.f2671n;
        j0VarM1119a.mTargetRequestCode = this.f2672p;
        j0VarM1119a.mUserVisibleHint = this.f2673q;
        return j0VarM1119a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2659a);
        sb2.append(" (");
        sb2.append(this.f2660b);
        sb2.append(")}:");
        if (this.f2661c) {
            sb2.append(" fromLayout");
        }
        if (this.f2662d) {
            sb2.append(" dynamicContainer");
        }
        int i10 = this.f2664f;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f2665g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f2666h) {
            sb2.append(" retainInstance");
        }
        if (this.f2667j) {
            sb2.append(" removing");
        }
        if (this.f2668k) {
            sb2.append(" detached");
        }
        if (this.f2669l) {
            sb2.append(" hidden");
        }
        String str2 = this.f2671n;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f2672p);
        }
        if (this.f2673q) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2659a);
        parcel.writeString(this.f2660b);
        parcel.writeInt(this.f2661c ? 1 : 0);
        parcel.writeInt(this.f2662d ? 1 : 0);
        parcel.writeInt(this.f2663e);
        parcel.writeInt(this.f2664f);
        parcel.writeString(this.f2665g);
        parcel.writeInt(this.f2666h ? 1 : 0);
        parcel.writeInt(this.f2667j ? 1 : 0);
        parcel.writeInt(this.f2668k ? 1 : 0);
        parcel.writeInt(this.f2669l ? 1 : 0);
        parcel.writeInt(this.f2670m);
        parcel.writeString(this.f2671n);
        parcel.writeInt(this.f2672p);
        parcel.writeInt(this.f2673q ? 1 : 0);
    }

    public p1(Parcel parcel) {
        this.f2659a = parcel.readString();
        this.f2660b = parcel.readString();
        this.f2661c = parcel.readInt() != 0;
        this.f2662d = parcel.readInt() != 0;
        this.f2663e = parcel.readInt();
        this.f2664f = parcel.readInt();
        this.f2665g = parcel.readString();
        this.f2666h = parcel.readInt() != 0;
        this.f2667j = parcel.readInt() != 0;
        this.f2668k = parcel.readInt() != 0;
        this.f2669l = parcel.readInt() != 0;
        this.f2670m = parcel.readInt();
        this.f2671n = parcel.readString();
        this.f2672p = parcel.readInt();
        this.f2673q = parcel.readInt() != 0;
    }
}
