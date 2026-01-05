package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, C10879a> {

    /* renamed from: b */
    public final Uri f11790b;

    /* renamed from: c */
    public final ShareMedia.EnumC10866b f11791c;

    /* renamed from: d */
    public static final C10881c f11789d = new C10881c(null);
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C10880b();

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C10879a extends ShareMedia.AbstractC10865a {

        /* renamed from: c */
        public Uri f11792c;

        /* renamed from: d */
        public ShareVideo m13572d() {
            return new ShareVideo(this, null);
        }

        /* renamed from: e */
        public final Uri m13573e() {
            return this.f11792c;
        }

        /* renamed from: f */
        public C10879a m13574f(ShareVideo shareVideo) {
            return shareVideo == null ? this : m13576h(shareVideo.m13571b());
        }

        /* renamed from: g */
        public final C10879a m13575g(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return m13574f((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        /* renamed from: h */
        public final C10879a m13576h(Uri uri) {
            this.f11792c = uri;
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$b */
    public static final class C10880b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new ShareVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$c */
    public static final class C10881c {
        public C10881c() {
        }

        public /* synthetic */ C10881c(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ShareVideo(C10879a c10879a, id5 id5Var) {
        this(c10879a);
    }

    /* renamed from: b */
    public final Uri m13571b() {
        return this.f11790b;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f11790b, 0);
    }

    public ShareVideo(C10879a c10879a) {
        super(c10879a);
        this.f11791c = ShareMedia.EnumC10866b.VIDEO;
        this.f11790b = c10879a.m13573e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11791c = ShareMedia.EnumC10866b.VIDEO;
        this.f11790b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
