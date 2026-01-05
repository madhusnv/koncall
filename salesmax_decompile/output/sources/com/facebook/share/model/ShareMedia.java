package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.AbstractC10865a;
import java.util.ArrayList;
import java.util.List;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends AbstractC10865a> implements ShareModel {

    /* renamed from: a */
    public final Bundle f11759a;

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class AbstractC10865a {

        /* renamed from: b */
        public static final a f11760b = new a(null);

        /* renamed from: a */
        public Bundle f11761a = new Bundle();

        /* renamed from: com.facebook.share.model.ShareMedia$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final List m13541a(Parcel parcel) {
                sq8.m48649h(parcel, "parcel");
                Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (parcelableArray == null) {
                    return ch3.m21246k();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }
        }

        /* renamed from: a */
        public final Bundle m13538a() {
            return this.f11761a;
        }

        /* renamed from: b */
        public AbstractC10865a m13539b(ShareMedia shareMedia) {
            if (shareMedia != null) {
                return m13540c(shareMedia.f11759a);
            }
            sq8.m48647f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }

        /* renamed from: c */
        public final AbstractC10865a m13540c(Bundle bundle) {
            sq8.m48649h(bundle, "parameters");
            this.f11761a.putAll(bundle);
            sq8.m48647f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.ShareMedia$b */
    public enum EnumC10866b {
        PHOTO,
        VIDEO
    }

    public ShareMedia(AbstractC10865a abstractC10865a) {
        sq8.m48649h(abstractC10865a, "builder");
        this.f11759a = new Bundle(abstractC10865a.m13538a());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeBundle(this.f11759a);
    }

    public ShareMedia(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.f11759a = bundle == null ? new Bundle() : bundle;
    }
}
