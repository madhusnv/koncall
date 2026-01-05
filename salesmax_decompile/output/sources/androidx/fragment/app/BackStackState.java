package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C2071a();

    /* renamed from: a */
    public final List f7340a;

    /* renamed from: b */
    public final List f7341b;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    public class C2071a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(List list, List list2) {
        this.f7340a = list;
        this.f7341b = list2;
    }

    /* renamed from: a */
    public List m6138a(FragmentManager fragmentManager, Map map) {
        HashMap map2 = new HashMap(this.f7340a.size());
        for (String str : this.f7340a) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleM6391B = fragmentManager.A0().m6391B(str, null);
                if (bundleM6391B != null) {
                    ClassLoader classLoader = fragmentManager.C0().m18966f().getClassLoader();
                    Fragment fragmentM6242a = ((FragmentState) bundleM6391B.getParcelable("state")).m6242a(fragmentManager.z0(), classLoader);
                    fragmentM6242a.mSavedFragmentState = bundleM6391B;
                    if (bundleM6391B.getBundle("savedInstanceState") == null) {
                        fragmentM6242a.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleM6391B.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentM6242a.setArguments(bundle);
                    map2.put(fragmentM6242a.mWho, fragmentM6242a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7341b.iterator();
        while (it.hasNext()) {
            arrayList.add(((BackStackRecordState) it.next()).m6135c(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7340a);
        parcel.writeTypedList(this.f7341b);
    }

    public BackStackState(Parcel parcel) {
        this.f7340a = parcel.createStringArrayList();
        this.f7341b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
