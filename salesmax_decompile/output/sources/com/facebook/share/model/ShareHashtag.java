package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareHashtag implements ShareModel {

    /* renamed from: a */
    public final String f11755a;

    /* renamed from: b */
    public static final C10862c f11754b = new C10862c(null);
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C10861b();

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static final class C10860a {

        /* renamed from: a */
        public String f11756a;

        /* renamed from: a */
        public ShareHashtag m13528a() {
            return new ShareHashtag(this, null);
        }

        /* renamed from: b */
        public final String m13529b() {
            return this.f11756a;
        }

        /* renamed from: c */
        public C10860a m13530c(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : m13532e(shareHashtag.m13527a());
        }

        /* renamed from: d */
        public final C10860a m13531d(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return m13530c((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: e */
        public final C10860a m13532e(String str) {
            this.f11756a = str;
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    public static final class C10861b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$c */
    public static final class C10862c {
        public C10862c() {
        }

        public /* synthetic */ C10862c(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ShareHashtag(C10860a c10860a, id5 id5Var) {
        this(c10860a);
    }

    /* renamed from: a */
    public final String m13527a() {
        return this.f11755a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeString(this.f11755a);
    }

    public ShareHashtag(C10860a c10860a) {
        this.f11755a = c10860a.m13529b();
    }

    public ShareHashtag(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11755a = parcel.readString();
    }
}
