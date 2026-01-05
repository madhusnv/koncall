package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.SubMenuC1799l;
import com.google.android.material.badge.AbstractC10937b;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes3.dex */
public class NavigationBarPresenter implements InterfaceC1796i {

    /* renamed from: a */
    public NavigationBarMenuView f12751a;

    /* renamed from: b */
    public boolean f12752b = false;

    /* renamed from: c */
    public int f12753c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11076a();

        /* renamed from: a */
        public int f12754a;

        /* renamed from: b */
        public ParcelableSparseArray f12755b;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        public class C11076a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f12754a = parcel.readInt();
            this.f12755b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f12754a);
            parcel.writeParcelable(this.f12755b, 0);
        }
    }

    /* renamed from: a */
    public void m14832a(int i) {
        this.f12753c = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: c */
    public boolean mo3964c(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: e */
    public void mo3987e(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f12751a.m14828q(savedState.f12754a);
            this.f12751a.m14827p(AbstractC10937b.m14071c(this.f12751a.getContext(), savedState.f12755b));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: g */
    public Parcelable mo3988g() {
        SavedState savedState = new SavedState();
        savedState.f12754a = this.f12751a.getSelectedItemId();
        savedState.f12755b = AbstractC10937b.m14072d(this.f12751a.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    public int getId() {
        return this.f12753c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) throws Resources.NotFoundException {
        if (this.f12752b) {
            return;
        }
        if (z) {
            this.f12751a.m14816d();
        } else {
            this.f12751a.m14830s();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: i */
    public boolean mo3989i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: j */
    public boolean mo3968j(C1792e c1792e, C1794g c1794g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: k */
    public void mo3969k(Context context, C1792e c1792e) {
        this.f12751a.mo3956a(c1792e);
    }

    /* renamed from: l */
    public void m14833l(NavigationBarMenuView navigationBarMenuView) {
        this.f12751a = navigationBarMenuView;
    }

    /* renamed from: m */
    public void m14834m(boolean z) {
        this.f12752b = z;
    }
}
