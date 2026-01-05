package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {

    /* renamed from: g */
    public final String f11758g;

    /* renamed from: h */
    public static final C10864b f11757h = new C10864b(null);
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C10863a();

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C10863a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new ShareLinkContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareLinkContent$b */
    public static final class C10864b {
        public C10864b() {
        }

        public /* synthetic */ C10864b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11758g = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11758g);
    }
}
