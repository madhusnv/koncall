package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CameraEffectArguments implements ShareModel {

    /* renamed from: a */
    public final Bundle f11729a;

    /* renamed from: b */
    public static final C10850c f11728b = new C10850c(null);
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C10849b();

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static final class C10848a {

        /* renamed from: a */
        public final Bundle f11730a = new Bundle();

        /* renamed from: a */
        public CameraEffectArguments m13509a() {
            return new CameraEffectArguments(this, null);
        }

        /* renamed from: b */
        public final Bundle m13510b() {
            return this.f11730a;
        }

        /* renamed from: c */
        public final C10848a m13511c(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return m13512d((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: d */
        public C10848a m13512d(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f11730a.putAll(cameraEffectArguments.f11729a);
            }
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$b */
    public static final class C10849b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$c */
    public static final class C10850c {
        public C10850c() {
        }

        public /* synthetic */ C10850c(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ CameraEffectArguments(C10848a c10848a, id5 id5Var) {
        this(c10848a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeBundle(this.f11729a);
    }

    public CameraEffectArguments(C10848a c10848a) {
        this.f11729a = c10848a.m13510b();
    }

    public CameraEffectArguments(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11729a = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
