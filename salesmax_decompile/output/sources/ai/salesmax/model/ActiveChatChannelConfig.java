package ai.salesmax.model;

import p001o.id5;

/* loaded from: classes.dex */
public final class ActiveChatChannelConfig {
    private String channelId;
    private String contactId;
    private String userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ActiveChatChannelConfig _instance = new ActiveChatChannelConfig(null, null, null, 7, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final ActiveChatChannelConfig instance() {
            return ActiveChatChannelConfig._instance;
        }

        public final void resetInstance() {
            ActiveChatChannelConfig._instance.setChannelId(null);
            ActiveChatChannelConfig._instance.setContactId(null);
        }
    }

    public ActiveChatChannelConfig() {
        this(null, null, null, 7, null);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public ActiveChatChannelConfig(String str, String str2, String str3) {
        this.channelId = str;
        this.contactId = str2;
        this.userId = str3;
    }

    public /* synthetic */ ActiveChatChannelConfig(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
