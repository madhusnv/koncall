package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Object> {

    /* renamed from: g */
    public final List f11783g;

    /* renamed from: h */
    public static final C10876b f11782h = new C10876b(null);
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new C10875a();

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static final class C10875a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhotoContent$b */
    public static final class C10876b {
        public C10876b() {
        }

        public /* synthetic */ C10876b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11783g = kh3.Q0(SharePhoto.C10872a.f11777g.m13561a(parcel));
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        SharePhoto.C10872a.f11777g.m13562b(parcel, i, this.f11783g);
    }
}
