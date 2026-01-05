package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AppGroupCreationContent implements ShareModel {

    /* renamed from: a */
    public final String f11725a;

    /* renamed from: b */
    public final String f11726b;

    /* renamed from: c */
    public final EnumC10845a f11727c;

    /* renamed from: d */
    public static final C10847c f11724d = new C10847c(null);
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C10846b();

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    public enum EnumC10845a {
        Open,
        Closed
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$b */
    public static final class C10846b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$c */
    public static final class C10847c {
        public C10847c() {
        }

        public /* synthetic */ C10847c(id5 id5Var) {
            this();
        }
    }

    public AppGroupCreationContent(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11725a = parcel.readString();
        this.f11726b = parcel.readString();
        this.f11727c = (EnumC10845a) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.f11725a);
        parcel.writeString(this.f11726b);
        parcel.writeSerializable(this.f11727c);
    }
}
