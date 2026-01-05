package ai.salesmax.services.model;

/* loaded from: classes.dex */
public class GlobalChatParticipantNotification {
    public final int unreadChannelCount;
    public final int unreadInternalChannelCount;
    public int unreadMessageCount;

    public GlobalChatParticipantNotification(int i, int i2) {
        this.unreadChannelCount = i;
        this.unreadInternalChannelCount = i2;
    }

    public static GlobalChatParticipantNotification empty() {
        return new GlobalChatParticipantNotification(0, 0);
    }
}
