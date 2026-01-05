package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> {

    /* renamed from: g */
    public final String f11794g;

    /* renamed from: h */
    public final String f11795h;

    /* renamed from: q */
    public final SharePhoto f11796q;

    /* renamed from: s */
    public final ShareVideo f11797s;

    /* renamed from: x */
    public static final C10883b f11793x = new C10883b(null);
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new C10882a();

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C10882a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideoContent$b */
    public static final class C10883b {
        public C10883b() {
        }

        public /* synthetic */ C10883b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11794g = parcel.readString();
        this.f11795h = parcel.readString();
        SharePhoto.C10872a c10872aM13556j = new SharePhoto.C10872a().m13556j(parcel);
        this.f11796q = (c10872aM13556j.m13553g() == null && c10872aM13556j.m13551e() == null) ? null : c10872aM13556j.m13550d();
        this.f11797s = new ShareVideo.C10879a().m13575g(parcel).m13572d();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11794g);
        parcel.writeString(this.f11795h);
        parcel.writeParcelable(this.f11796q, 0);
        parcel.writeParcelable(this.f11797s, 0);
    }
}
