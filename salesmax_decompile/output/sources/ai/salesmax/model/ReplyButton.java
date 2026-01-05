package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ReplyButton implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReplyButton> CREATOR = new Creator();
    private String idReply;
    private String titleReply;
    private String typeReply;

    public static final class Creator implements Parcelable.Creator<ReplyButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyButton createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ReplyButton(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyButton[] newArray(int i) {
            return new ReplyButton[i];
        }
    }

    public ReplyButton() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ReplyButton copy$default(ReplyButton replyButton, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyButton.typeReply;
        }
        if ((i & 2) != 0) {
            str2 = replyButton.titleReply;
        }
        if ((i & 4) != 0) {
            str3 = replyButton.idReply;
        }
        return replyButton.copy(str, str2, str3);
    }

    public final String component1() {
        return this.typeReply;
    }

    public final String component2() {
        return this.titleReply;
    }

    public final String component3() {
        return this.idReply;
    }

    public final ReplyButton copy(String str, String str2, String str3) {
        return new ReplyButton(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyButton)) {
            return false;
        }
        ReplyButton replyButton = (ReplyButton) obj;
        return sq8.m48644c(this.typeReply, replyButton.typeReply) && sq8.m48644c(this.titleReply, replyButton.titleReply) && sq8.m48644c(this.idReply, replyButton.idReply);
    }

    public final String getIdReply() {
        return this.idReply;
    }

    public final String getTitleReply() {
        return this.titleReply;
    }

    public final String getTypeReply() {
        return this.typeReply;
    }

    public int hashCode() {
        String str = this.typeReply;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleReply;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idReply;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setIdReply(String str) {
        this.idReply = str;
    }

    public final void setTitleReply(String str) {
        this.titleReply = str;
    }

    public final void setTypeReply(String str) {
        this.typeReply = str;
    }

    public String toString() {
        return "ReplyButton(typeReply=" + this.typeReply + ", titleReply=" + this.titleReply + ", idReply=" + this.idReply + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.typeReply);
        parcel.writeString(this.titleReply);
        parcel.writeString(this.idReply);
    }

    public ReplyButton(String str, String str2, String str3) {
        this.typeReply = str;
        this.titleReply = str2;
        this.idReply = str3;
    }

    public /* synthetic */ ReplyButton(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
