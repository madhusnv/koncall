package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2139h;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C2112a();

    /* renamed from: H */
    public final String f7470H;

    /* renamed from: L */
    public final int f7471L;

    /* renamed from: M */
    public final boolean f7472M;

    /* renamed from: a */
    public final String f7473a;

    /* renamed from: b */
    public final String f7474b;

    /* renamed from: c */
    public final boolean f7475c;

    /* renamed from: d */
    public final boolean f7476d;

    /* renamed from: e */
    public final int f7477e;

    /* renamed from: f */
    public final int f7478f;

    /* renamed from: g */
    public final String f7479g;

    /* renamed from: h */
    public final boolean f7480h;

    /* renamed from: q */
    public final boolean f7481q;

    /* renamed from: s */
    public final boolean f7482s;

    /* renamed from: x */
    public final boolean f7483x;

    /* renamed from: y */
    public final int f7484y;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    public class C2112a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f7473a = fragment.getClass().getName();
        this.f7474b = fragment.mWho;
        this.f7475c = fragment.mFromLayout;
        this.f7476d = fragment.mInDynamicContainer;
        this.f7477e = fragment.mFragmentId;
        this.f7478f = fragment.mContainerId;
        this.f7479g = fragment.mTag;
        this.f7480h = fragment.mRetainInstance;
        this.f7481q = fragment.mRemoving;
        this.f7482s = fragment.mDetached;
        this.f7483x = fragment.mHidden;
        this.f7484y = fragment.mMaxState.ordinal();
        this.f7470H = fragment.mTargetWho;
        this.f7471L = fragment.mTargetRequestCode;
        this.f7472M = fragment.mUserVisibleHint;
    }

    /* renamed from: a */
    public Fragment m6242a(AbstractC2118d abstractC2118d, ClassLoader classLoader) {
        Fragment fragmentMo6226a = abstractC2118d.mo6226a(classLoader, this.f7473a);
        fragmentMo6226a.mWho = this.f7474b;
        fragmentMo6226a.mFromLayout = this.f7475c;
        fragmentMo6226a.mInDynamicContainer = this.f7476d;
        fragmentMo6226a.mRestored = true;
        fragmentMo6226a.mFragmentId = this.f7477e;
        fragmentMo6226a.mContainerId = this.f7478f;
        fragmentMo6226a.mTag = this.f7479g;
        fragmentMo6226a.mRetainInstance = this.f7480h;
        fragmentMo6226a.mRemoving = this.f7481q;
        fragmentMo6226a.mDetached = this.f7482s;
        fragmentMo6226a.mHidden = this.f7483x;
        fragmentMo6226a.mMaxState = AbstractC2139h.b.values()[this.f7484y];
        fragmentMo6226a.mTargetWho = this.f7470H;
        fragmentMo6226a.mTargetRequestCode = this.f7471L;
        fragmentMo6226a.mUserVisibleHint = this.f7472M;
        return fragmentMo6226a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f7473a);
        sb.append(" (");
        sb.append(this.f7474b);
        sb.append(")}:");
        if (this.f7475c) {
            sb.append(" fromLayout");
        }
        if (this.f7476d) {
            sb.append(" dynamicContainer");
        }
        if (this.f7478f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f7478f));
        }
        String str = this.f7479g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f7479g);
        }
        if (this.f7480h) {
            sb.append(" retainInstance");
        }
        if (this.f7481q) {
            sb.append(" removing");
        }
        if (this.f7482s) {
            sb.append(" detached");
        }
        if (this.f7483x) {
            sb.append(" hidden");
        }
        if (this.f7470H != null) {
            sb.append(" targetWho=");
            sb.append(this.f7470H);
            sb.append(" targetRequestCode=");
            sb.append(this.f7471L);
        }
        if (this.f7472M) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7473a);
        parcel.writeString(this.f7474b);
        parcel.writeInt(this.f7475c ? 1 : 0);
        parcel.writeInt(this.f7476d ? 1 : 0);
        parcel.writeInt(this.f7477e);
        parcel.writeInt(this.f7478f);
        parcel.writeString(this.f7479g);
        parcel.writeInt(this.f7480h ? 1 : 0);
        parcel.writeInt(this.f7481q ? 1 : 0);
        parcel.writeInt(this.f7482s ? 1 : 0);
        parcel.writeInt(this.f7483x ? 1 : 0);
        parcel.writeInt(this.f7484y);
        parcel.writeString(this.f7470H);
        parcel.writeInt(this.f7471L);
        parcel.writeInt(this.f7472M ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f7473a = parcel.readString();
        this.f7474b = parcel.readString();
        this.f7475c = parcel.readInt() != 0;
        this.f7476d = parcel.readInt() != 0;
        this.f7477e = parcel.readInt();
        this.f7478f = parcel.readInt();
        this.f7479g = parcel.readString();
        this.f7480h = parcel.readInt() != 0;
        this.f7481q = parcel.readInt() != 0;
        this.f7482s = parcel.readInt() != 0;
        this.f7483x = parcel.readInt() != 0;
        this.f7484y = parcel.readInt();
        this.f7470H = parcel.readString();
        this.f7471L = parcel.readInt();
        this.f7472M = parcel.readInt() != 0;
    }
}
