package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {

    /* renamed from: H */
    public final String f11717H;

    /* renamed from: g */
    public final String f11718g;

    /* renamed from: h */
    public final String f11719h;

    /* renamed from: q */
    public final String f11720q;

    /* renamed from: s */
    public final String f11721s;

    /* renamed from: x */
    public final String f11722x;

    /* renamed from: y */
    public final String f11723y;

    /* renamed from: L */
    public static final C10844b f11716L = new C10844b(null);
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new C10843a();

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    public static final class C10843a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ShareFeedContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }

    /* renamed from: com.facebook.share.internal.ShareFeedContent$b */
    public static final class C10844b {
        public C10844b() {
        }

        public /* synthetic */ C10844b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11718g = parcel.readString();
        this.f11719h = parcel.readString();
        this.f11720q = parcel.readString();
        this.f11721s = parcel.readString();
        this.f11722x = parcel.readString();
        this.f11723y = parcel.readString();
        this.f11717H = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11718g);
        parcel.writeString(this.f11719h);
        parcel.writeString(this.f11720q);
        parcel.writeString(this.f11721s);
        parcel.writeString(this.f11722x);
        parcel.writeString(this.f11723y);
        parcel.writeString(this.f11717H);
    }
}
