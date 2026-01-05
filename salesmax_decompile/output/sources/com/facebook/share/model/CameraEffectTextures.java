package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CameraEffectTextures implements ShareModel {

    /* renamed from: a */
    public final Bundle f11732a;

    /* renamed from: b */
    public static final C10853c f11731b = new C10853c(null);
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C10852b();

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static final class C10851a {

        /* renamed from: a */
        public final Bundle f11733a = new Bundle();

        /* renamed from: a */
        public CameraEffectTextures m13516a() {
            return new CameraEffectTextures(this, null);
        }

        /* renamed from: b */
        public final Bundle m13517b() {
            return this.f11733a;
        }

        /* renamed from: c */
        public final C10851a m13518c(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return m13519d((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: d */
        public C10851a m13519d(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f11733a.putAll(cameraEffectTextures.f11732a);
            }
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$b */
    public static final class C10852b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$c */
    public static final class C10853c {
        public C10853c() {
        }

        public /* synthetic */ C10853c(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ CameraEffectTextures(C10851a c10851a, id5 id5Var) {
        this(c10851a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeBundle(this.f11732a);
    }

    public CameraEffectTextures(C10851a c10851a) {
        this.f11732a = c10851a.m13517b();
    }

    public CameraEffectTextures(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11732a = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
