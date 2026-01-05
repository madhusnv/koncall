package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {

    /* renamed from: g */
    public final List f11763g;

    /* renamed from: h */
    public static final C10868b f11762h = new C10868b(null);
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new C10867a();

    /* renamed from: com.facebook.share.model.ShareMediaContent$a */
    public static final class C10867a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new ShareMediaContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMediaContent$b */
    public static final class C10868b {
        public C10868b() {
        }

        public /* synthetic */ C10868b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMediaContent(Parcel parcel) {
        List listM21246k;
        super(parcel);
        sq8.m48649h(parcel, "source");
        Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (parcelableArray != null) {
            listM21246k = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                ShareMedia shareMedia = (ShareMedia) parcelable;
                if (shareMedia != null) {
                    listM21246k.add(shareMedia);
                }
            }
        } else {
            listM21246k = ch3.m21246k();
        }
        this.f11763g = listM21246k;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((Parcelable[]) this.f11763g.toArray(new ShareMedia[0]), i);
    }
}
