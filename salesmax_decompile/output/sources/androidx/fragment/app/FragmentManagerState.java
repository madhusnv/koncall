package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C2111a();

    /* renamed from: a */
    public ArrayList f7462a;

    /* renamed from: b */
    public ArrayList f7463b;

    /* renamed from: c */
    public BackStackRecordState[] f7464c;

    /* renamed from: d */
    public int f7465d;

    /* renamed from: e */
    public String f7466e;

    /* renamed from: f */
    public ArrayList f7467f;

    /* renamed from: g */
    public ArrayList f7468g;

    /* renamed from: h */
    public ArrayList f7469h;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C2111a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f7466e = null;
        this.f7467f = new ArrayList();
        this.f7468g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7462a);
        parcel.writeStringList(this.f7463b);
        parcel.writeTypedArray(this.f7464c, i);
        parcel.writeInt(this.f7465d);
        parcel.writeString(this.f7466e);
        parcel.writeStringList(this.f7467f);
        parcel.writeTypedList(this.f7468g);
        parcel.writeTypedList(this.f7469h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f7466e = null;
        this.f7467f = new ArrayList();
        this.f7468g = new ArrayList();
        this.f7462a = parcel.createStringArrayList();
        this.f7463b = parcel.createStringArrayList();
        this.f7464c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f7465d = parcel.readInt();
        this.f7466e = parcel.readString();
        this.f7467f = parcel.createStringArrayList();
        this.f7468g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f7469h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
