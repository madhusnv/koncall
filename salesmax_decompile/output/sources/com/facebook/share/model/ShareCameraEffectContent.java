package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {

    /* renamed from: g */
    public String f11745g;

    /* renamed from: h */
    public CameraEffectArguments f11746h;

    /* renamed from: q */
    public CameraEffectTextures f11747q;

    /* renamed from: s */
    public static final C10859b f11744s = new C10859b(null);
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C10858a();

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    public static final class C10858a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ShareCameraEffectContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$b */
    public static final class C10859b {
        public C10859b() {
        }

        public /* synthetic */ C10859b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11745g = parcel.readString();
        this.f11746h = new CameraEffectArguments.C10848a().m13511c(parcel).m13509a();
        this.f11747q = new CameraEffectTextures.C10851a().m13518c(parcel).m13516a();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11745g);
        parcel.writeParcelable(this.f11746h, 0);
        parcel.writeParcelable(this.f11747q, 0);
    }
}
