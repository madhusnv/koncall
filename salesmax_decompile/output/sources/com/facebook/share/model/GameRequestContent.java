package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class GameRequestContent implements ShareModel {

    /* renamed from: a */
    public final String f11735a;

    /* renamed from: b */
    public final String f11736b;

    /* renamed from: c */
    public final List f11737c;

    /* renamed from: d */
    public final String f11738d;

    /* renamed from: e */
    public final String f11739e;

    /* renamed from: f */
    public final EnumC10854a f11740f;

    /* renamed from: g */
    public final String f11741g;

    /* renamed from: h */
    public final EnumC10857d f11742h;

    /* renamed from: q */
    public final List f11743q;

    /* renamed from: s */
    public static final C10856c f11734s = new C10856c(null);
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C10855b();

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    public enum EnumC10854a {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    public static final class C10855b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$c */
    public static final class C10856c {
        public C10856c() {
        }

        public /* synthetic */ C10856c(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$d */
    public enum EnumC10857d {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    public GameRequestContent(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11735a = parcel.readString();
        this.f11736b = parcel.readString();
        this.f11737c = parcel.createStringArrayList();
        this.f11738d = parcel.readString();
        this.f11739e = parcel.readString();
        this.f11740f = (EnumC10854a) parcel.readSerializable();
        this.f11741g = parcel.readString();
        this.f11742h = (EnumC10857d) parcel.readSerializable();
        this.f11743q = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.f11735a);
        parcel.writeString(this.f11736b);
        parcel.writeStringList(this.f11737c);
        parcel.writeString(this.f11738d);
        parcel.writeString(this.f11739e);
        parcel.writeSerializable(this.f11740f);
        parcel.writeString(this.f11741g);
        parcel.writeSerializable(this.f11742h);
        parcel.writeStringList(this.f11743q);
    }
}
