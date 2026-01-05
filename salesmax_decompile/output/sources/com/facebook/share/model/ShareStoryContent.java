package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {

    /* renamed from: g */
    public final ShareMedia f11785g;

    /* renamed from: h */
    public final SharePhoto f11786h;

    /* renamed from: q */
    public final List f11787q;

    /* renamed from: s */
    public final String f11788s;

    /* renamed from: x */
    public static final C10878b f11784x = new C10878b(null);
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C10877a();

    /* renamed from: com.facebook.share.model.ShareStoryContent$a */
    public static final class C10877a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareStoryContent$b */
    public static final class C10878b {
        public C10878b() {
        }

        public /* synthetic */ C10878b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11785g = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f11786h = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.f11787q = m13567a(parcel);
        this.f11788s = parcel.readString();
    }

    /* renamed from: a */
    private final List m13567a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return kh3.Q0(arrayList);
    }

    /* renamed from: b */
    public final List m13568b() {
        List list = this.f11787q;
        if (list != null) {
            return kh3.Q0(list);
        }
        return null;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f11785g, 0);
        parcel.writeParcelable(this.f11786h, 0);
        parcel.writeStringList(m13568b());
        parcel.writeString(this.f11788s);
    }
}
