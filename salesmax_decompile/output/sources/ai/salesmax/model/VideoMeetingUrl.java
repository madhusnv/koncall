package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class VideoMeetingUrl {
    public static final int $stable = 0;
    private final String meetingUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMeetingUrl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoMeetingUrl copy$default(VideoMeetingUrl videoMeetingUrl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoMeetingUrl.meetingUrl;
        }
        return videoMeetingUrl.copy(str);
    }

    public final String component1() {
        return this.meetingUrl;
    }

    public final VideoMeetingUrl copy(String str) {
        return new VideoMeetingUrl(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoMeetingUrl) && sq8.m48644c(this.meetingUrl, ((VideoMeetingUrl) obj).meetingUrl);
    }

    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    public int hashCode() {
        String str = this.meetingUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "VideoMeetingUrl(meetingUrl=" + this.meetingUrl + ")";
    }

    public VideoMeetingUrl(String str) {
        this.meetingUrl = str;
    }

    public /* synthetic */ VideoMeetingUrl(String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str);
    }
}
