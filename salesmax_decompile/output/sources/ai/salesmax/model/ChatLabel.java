package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class ChatLabel extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChatLabel> CREATOR = new Creator();
    private String color;
    private String label;

    public static final class Creator implements Parcelable.Creator<ChatLabel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatLabel createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ChatLabel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatLabel[] newArray(int i) {
            return new ChatLabel[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatLabel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChatLabel copy$default(ChatLabel chatLabel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatLabel.label;
        }
        if ((i & 2) != 0) {
            str2 = chatLabel.color;
        }
        return chatLabel.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.color;
    }

    public final ChatLabel copy(String str, String str2) {
        sq8.m48649h(str, Constants.ScionAnalytics.PARAM_LABEL);
        sq8.m48649h(str2, "color");
        return new ChatLabel(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatLabel)) {
            return false;
        }
        ChatLabel chatLabel = (ChatLabel) obj;
        return sq8.m48644c(this.label, chatLabel.label) && sq8.m48644c(this.color, chatLabel.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.color.hashCode();
    }

    public final void setColor(String str) {
        sq8.m48649h(str, "<set-?>");
        this.color = str;
    }

    public final void setLabel(String str) {
        sq8.m48649h(str, "<set-?>");
        this.label = str;
    }

    public String toString() {
        return "ChatLabel(label=" + this.label + ", color=" + this.color + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.label);
        parcel.writeString(this.color);
    }

    public /* synthetic */ ChatLabel(String str, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "#768389" : str2);
    }

    public ChatLabel(String str, String str2) {
        sq8.m48649h(str, Constants.ScionAnalytics.PARAM_LABEL);
        sq8.m48649h(str2, "color");
        this.label = str;
        this.color = str2;
    }
}
