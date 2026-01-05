package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, C10872a> {

    /* renamed from: b */
    public final Bitmap f11772b;

    /* renamed from: c */
    public final Uri f11773c;

    /* renamed from: d */
    public final boolean f11774d;

    /* renamed from: e */
    public final String f11775e;

    /* renamed from: f */
    public final ShareMedia.EnumC10866b f11776f;

    /* renamed from: g */
    public static final C10874c f11771g = new C10874c(null);
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C10873b();

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C10872a extends ShareMedia.AbstractC10865a {

        /* renamed from: g */
        public static final a f11777g = new a(null);

        /* renamed from: c */
        public Bitmap f11778c;

        /* renamed from: d */
        public Uri f11779d;

        /* renamed from: e */
        public boolean f11780e;

        /* renamed from: f */
        public String f11781f;

        /* renamed from: com.facebook.share.model.SharePhoto$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final List m13561a(Parcel parcel) {
                sq8.m48649h(parcel, "parcel");
                List listM13541a = ShareMedia.AbstractC10865a.f11760b.m13541a(parcel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM13541a) {
                    if (obj instanceof SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            /* renamed from: b */
            public final void m13562b(Parcel parcel, int i, List list) {
                sq8.m48649h(parcel, "out");
                sq8.m48649h(list, "photos");
                parcel.writeParcelableArray((SharePhoto[]) list.toArray(new SharePhoto[0]), i);
            }
        }

        /* renamed from: d */
        public SharePhoto m13550d() {
            return new SharePhoto(this, null);
        }

        /* renamed from: e */
        public final Bitmap m13551e() {
            return this.f11778c;
        }

        /* renamed from: f */
        public final String m13552f() {
            return this.f11781f;
        }

        /* renamed from: g */
        public final Uri m13553g() {
            return this.f11779d;
        }

        /* renamed from: h */
        public final boolean m13554h() {
            return this.f11780e;
        }

        /* renamed from: i */
        public C10872a m13555i(SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((C10872a) super.m13539b(sharePhoto)).m13557k(sharePhoto.m13546b()).m13559m(sharePhoto.m13548d()).m13560n(sharePhoto.m13549e()).m13558l(sharePhoto.m13547c());
        }

        /* renamed from: j */
        public final C10872a m13556j(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return m13555i((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: k */
        public final C10872a m13557k(Bitmap bitmap) {
            this.f11778c = bitmap;
            return this;
        }

        /* renamed from: l */
        public final C10872a m13558l(String str) {
            this.f11781f = str;
            return this;
        }

        /* renamed from: m */
        public final C10872a m13559m(Uri uri) {
            this.f11779d = uri;
            return this;
        }

        /* renamed from: n */
        public final C10872a m13560n(boolean z) {
            this.f11780e = z;
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$b */
    public static final class C10873b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$c */
    public static final class C10874c {
        public C10874c() {
        }

        public /* synthetic */ C10874c(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ SharePhoto(C10872a c10872a, id5 id5Var) {
        this(c10872a);
    }

    /* renamed from: b */
    public final Bitmap m13546b() {
        return this.f11772b;
    }

    /* renamed from: c */
    public final String m13547c() {
        return this.f11775e;
    }

    /* renamed from: d */
    public final Uri m13548d() {
        return this.f11773c;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m13549e() {
        return this.f11774d;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f11772b, 0);
        parcel.writeParcelable(this.f11773c, 0);
        parcel.writeByte(this.f11774d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f11775e);
    }

    public SharePhoto(C10872a c10872a) {
        super(c10872a);
        this.f11776f = ShareMedia.EnumC10866b.PHOTO;
        this.f11772b = c10872a.m13551e();
        this.f11773c = c10872a.m13553g();
        this.f11774d = c10872a.m13554h();
        this.f11775e = c10872a.m13552f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11776f = ShareMedia.EnumC10866b.PHOTO;
        this.f11772b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f11773c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f11774d = parcel.readByte() != 0;
        this.f11775e = parcel.readString();
    }
}
