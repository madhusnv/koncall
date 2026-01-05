package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {

    /* renamed from: b */
    public final Uri f11766b;

    /* renamed from: c */
    public final Uri f11767c;

    /* renamed from: d */
    public final boolean f11768d;

    /* renamed from: e */
    public final boolean f11769e;

    /* renamed from: f */
    public final EnumC10871c f11770f;

    /* renamed from: g */
    public static final C10870b f11765g = new C10870b(null);
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C10869a();

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public static final class C10869a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$b */
    public static final class C10870b {
        public C10870b() {
        }

        public /* synthetic */ C10870b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$c */
    public enum EnumC10871c {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11766b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f11768d = parcel.readByte() != 0;
        this.f11767c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f11770f = (EnumC10871c) parcel.readSerializable();
        this.f11769e = parcel.readByte() != 0;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f11766b, 0);
        parcel.writeByte(this.f11768d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f11767c, 0);
        parcel.writeSerializable(this.f11770f);
        parcel.writeByte(this.f11768d ? (byte) 1 : (byte) 0);
    }
}
