package com.facebook.share.model;

import android.os.Parcel;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: a */
    public final String f11764a;

    public ShareMessengerActionButton(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11764a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeString(this.f11764a);
    }
}
