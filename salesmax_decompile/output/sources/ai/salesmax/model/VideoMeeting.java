package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class VideoMeeting implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VideoMeeting> CREATOR = new Creator();
    private String dueDate;
    private String id;
    private String videoCallLink;
    private String videoCallPlatform;

    public static final class Creator implements Parcelable.Creator<VideoMeeting> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoMeeting createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new VideoMeeting(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoMeeting[] newArray(int i) {
            return new VideoMeeting[i];
        }
    }

    public VideoMeeting() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ VideoMeeting copy$default(VideoMeeting videoMeeting, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoMeeting.id;
        }
        if ((i & 2) != 0) {
            str2 = videoMeeting.videoCallPlatform;
        }
        if ((i & 4) != 0) {
            str3 = videoMeeting.dueDate;
        }
        if ((i & 8) != 0) {
            str4 = videoMeeting.videoCallLink;
        }
        return videoMeeting.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.videoCallPlatform;
    }

    public final String component3() {
        return this.dueDate;
    }

    public final String component4() {
        return this.videoCallLink;
    }

    public final VideoMeeting copy(String str, String str2, String str3, String str4) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "videoCallPlatform");
        sq8.m48649h(str3, "dueDate");
        sq8.m48649h(str4, "videoCallLink");
        return new VideoMeeting(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMeeting)) {
            return false;
        }
        VideoMeeting videoMeeting = (VideoMeeting) obj;
        return sq8.m48644c(this.id, videoMeeting.id) && sq8.m48644c(this.videoCallPlatform, videoMeeting.videoCallPlatform) && sq8.m48644c(this.dueDate, videoMeeting.dueDate) && sq8.m48644c(this.videoCallLink, videoMeeting.videoCallLink);
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getVideoCallLink() {
        return this.videoCallLink;
    }

    public final String getVideoCallPlatform() {
        return this.videoCallPlatform;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.videoCallPlatform.hashCode()) * 31) + this.dueDate.hashCode()) * 31) + this.videoCallLink.hashCode();
    }

    public final void setDueDate(String str) {
        sq8.m48649h(str, "<set-?>");
        this.dueDate = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setVideoCallLink(String str) {
        sq8.m48649h(str, "<set-?>");
        this.videoCallLink = str;
    }

    public final void setVideoCallPlatform(String str) {
        sq8.m48649h(str, "<set-?>");
        this.videoCallPlatform = str;
    }

    public String toString() {
        return "VideoMeeting(id=" + this.id + ", videoCallPlatform=" + this.videoCallPlatform + ", dueDate=" + this.dueDate + ", videoCallLink=" + this.videoCallLink + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.videoCallPlatform);
        parcel.writeString(this.dueDate);
        parcel.writeString(this.videoCallLink);
    }

    public VideoMeeting(String str, String str2, String str3, String str4) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "videoCallPlatform");
        sq8.m48649h(str3, "dueDate");
        sq8.m48649h(str4, "videoCallLink");
        this.id = str;
        this.videoCallPlatform = str2;
        this.dueDate = str3;
        this.videoCallLink = str4;
    }

    public /* synthetic */ VideoMeeting(String str, String str2, String str3, String str4, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
