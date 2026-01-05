package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B> implements ShareModel {

    /* renamed from: a */
    public final Uri f11748a;

    /* renamed from: b */
    public final List f11749b;

    /* renamed from: c */
    public final String f11750c;

    /* renamed from: d */
    public final String f11751d;

    /* renamed from: e */
    public final String f11752e;

    /* renamed from: f */
    public final ShareHashtag f11753f;

    public ShareContent(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11748a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f11749b = m13526a(parcel);
        this.f11750c = parcel.readString();
        this.f11751d = parcel.readString();
        this.f11752e = parcel.readString();
        this.f11753f = new ShareHashtag.C10860a().m13531d(parcel).m13528a();
    }

    /* renamed from: a */
    public final List m13526a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeParcelable(this.f11748a, 0);
        parcel.writeStringList(this.f11749b);
        parcel.writeString(this.f11750c);
        parcel.writeString(this.f11751d);
        parcel.writeString(this.f11752e);
        parcel.writeParcelable(this.f11753f, 0);
    }
}
