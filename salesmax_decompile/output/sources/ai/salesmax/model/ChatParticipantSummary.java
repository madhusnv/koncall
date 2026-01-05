package ai.salesmax.model;

import ai.salesmax.model.ChatParticipantSummary;
import com.amplifyframework.datastore.generated.model.ChatParticipant;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import p001o.a81;
import p001o.id5;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatParticipantSummary {
    private long createdAt;
    private ChatParticipant underlyingChatParticipant;
    private long updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final ChatParticipant newInstance() {
            ChatParticipant chatParticipantBuild = ChatParticipant.builder().accountId("").participantId("").participationStatus("").id("").build();
            sq8.m48648g(chatParticipantBuild, "build(...)");
            return chatParticipantBuild;
        }
    }

    /* renamed from: ai.salesmax.model.ChatParticipantSummary$getContact$1 */
    public static final class C01041 extends kf9 implements xk7 {
        public static final C01041 INSTANCE = new C01041();

        public C01041() {
            super(1);
        }

        @Override // p001o.xk7
        public final Contact invoke(com.amplifyframework.datastore.generated.model.ChatChannel chatChannel) {
            return chatChannel.getContact();
        }
    }

    /* renamed from: ai.salesmax.model.ChatParticipantSummary$getContact$2 */
    public static final class C01052 extends kf9 implements xk7 {
        public static final C01052 INSTANCE = new C01052();

        public C01052() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsSummary invoke(Contact contact) {
            sq8.m48649h(contact, "x");
            return new LeadsSummary(contact);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatParticipantSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_joinedAt_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_lastViewed_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_leftAt_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long createdAt$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Contact getContact$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Contact) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsSummary getContact$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long updatedAt$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.underlyingChatParticipant.getAccountId();
    }

    public final ChatChannelSummary getChannel() {
        com.amplifyframework.datastore.generated.model.ChatChannel channel = this.underlyingChatParticipant.getChannel();
        if (channel != null) {
            return new ChatChannelSummary(channel);
        }
        return null;
    }

    public final LeadsSummary getContact() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatParticipant.getChannel());
        final C01041 c01041 = C01041.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.vx2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary.getContact$lambda$1(c01041, obj);
            }
        });
        final C01052 c01052 = C01052.INSTANCE;
        return (LeadsSummary) map.map(new Function() { // from class: o.wx2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary.getContact$lambda$2(c01052, obj);
            }
        }).orElse(null);
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.underlyingChatParticipant.getId();
    }

    public final long getJoinedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatParticipant.getJoinedAt());
        final ChatParticipantSummary$joinedAt$1 chatParticipantSummary$joinedAt$1 = ChatParticipantSummary$joinedAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.xx2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary._get_joinedAt_$lambda$6(chatParticipantSummary$joinedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final long getLastViewed() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatParticipant.getLastViewed());
        final ChatParticipantSummary$lastViewed$1 chatParticipantSummary$lastViewed$1 = ChatParticipantSummary$lastViewed$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.yx2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary._get_lastViewed_$lambda$5(chatParticipantSummary$lastViewed$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final long getLeftAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatParticipant.getLeftAt());
        final ChatParticipantSummary$leftAt$1 chatParticipantSummary$leftAt$1 = ChatParticipantSummary$leftAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.ux2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary._get_leftAt_$lambda$7(chatParticipantSummary$leftAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final LeadsUser getParticipant() {
        User participant = this.underlyingChatParticipant.getParticipant();
        if (participant != null) {
            return new LeadsUser(participant, null, null, null, 14, null);
        }
        return null;
    }

    public final String getParticipantId() {
        return this.underlyingChatParticipant.getParticipantId();
    }

    public final String getParticipationStatus() {
        return this.underlyingChatParticipant.getParticipationStatus();
    }

    public final ChatParticipant getUnderlyingChatParticipant() {
        return this.underlyingChatParticipant;
    }

    public final Integer getUnreadMessageCount() {
        return this.underlyingChatParticipant.getUnreadMessageCount();
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final Boolean isStarred() {
        return this.underlyingChatParticipant.getIsStarred();
    }

    public final void setAccountId(String str) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().accountId(str).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setChannel(ChatChannelSummary chatChannelSummary) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().channel(chatChannelSummary != null ? chatChannelSummary.getUnderlyingChatChannel() : null).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setId(String str) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().id(getId()).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setJoinedAt(long j) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().joinedAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setLastViewed(long j) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().lastViewed(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setLeftAt(long j) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().leftAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setParticipant(LeadsUser leadsUser) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().participantId(leadsUser != null ? leadsUser.getId() : null).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setParticipantId(String str) {
        if (str != null) {
            ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().participantId(str).build();
            sq8.m48648g(chatParticipantBuild, "build(...)");
            this.underlyingChatParticipant = chatParticipantBuild;
        }
    }

    public final void setParticipationStatus(String str) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().participationStatus(str).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setStarred(Boolean bool) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().isStarred(bool).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setUnderlyingChatParticipant(ChatParticipant chatParticipant) {
        sq8.m48649h(chatParticipant, "<set-?>");
        this.underlyingChatParticipant = chatParticipant;
    }

    public final void setUnreadMessageCount(Integer num) {
        ChatParticipant chatParticipantBuild = this.underlyingChatParticipant.copyOfBuilder().unreadMessageCount(num).build();
        sq8.m48648g(chatParticipantBuild, "build(...)");
        this.underlyingChatParticipant = chatParticipantBuild;
    }

    public final void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChatChannel toChatChannel() {
        ChatMessages chatMessages;
        LeadsUser owner;
        LeadsUser owner2;
        LeadsUser owner3;
        List<ChatMessageSummary> messages;
        Object next;
        ChatChannel chatChannel = new ChatChannel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, false, false, false, null, null, false, null, null, 1073741823, null);
        ChatChannelSummary channel = getChannel();
        chatChannel.setChannelId(channel != null ? channel.getId() : null);
        ChatChannelSummary channel2 = getChannel();
        chatChannel.setPhoneNumberIdExternal(channel2 != null ? channel2.getPhoneNumberIdExternal() : null);
        ChatChannelSummary channel3 = getChannel();
        chatChannel.setMessagePlatform(channel3 != null ? channel3.getMessagePlatform() : null);
        ChatChannelSummary channel4 = getChannel();
        chatChannel.setRecipientExternalId(channel4 != null ? channel4.getRecepientExternalId() : null);
        ChatChannelSummary channel5 = getChannel();
        chatChannel.setRecipientExternalIdType(channel5 != null ? channel5.getRecepientExternalIdType() : null);
        ChatChannelSummary channel6 = getChannel();
        chatChannel.setChannelName(channel6 != null ? channel6.getChannelName() : null);
        ChatChannelSummary channel7 = getChannel();
        chatChannel.setChannelType(channel7 != null ? channel7.getChannelType() : null);
        ChatChannelSummary channel8 = getChannel();
        chatChannel.setChannelStatus(channel8 != null ? channel8.getChannelStatus() : null);
        LeadsSummary contact = getContact();
        chatChannel.setContact(contact != null ? contact.toLeads() : null);
        ChatChannelSummary channel9 = getChannel();
        if (channel9 == null || (messages = channel9.getMessages()) == null) {
            chatMessages = null;
        } else {
            Iterator<T> it = messages.iterator();
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
            }
            ChatMessageSummary chatMessageSummary = (ChatMessageSummary) next;
            if (chatMessageSummary != null) {
                chatMessages = chatMessageSummary.toChatMessages();
            }
        }
        chatChannel.setLastMessage(chatMessages);
        Integer unreadMessageCount = getUnreadMessageCount();
        chatChannel.setUnreadMessageCount(unreadMessageCount != null ? unreadMessageCount.intValue() : 0);
        Boolean boolIsStarred = isStarred();
        Boolean bool = Boolean.TRUE;
        chatChannel.setStarred(sq8.m48644c(boolIsStarred, bool));
        ChatChannelSummary channel10 = getChannel();
        chatChannel.setChatUserId((channel10 == null || (owner3 = channel10.getOwner()) == null) ? null : owner3.getId());
        ChatChannelSummary channel11 = getChannel();
        chatChannel.setChatUserName((channel11 == null || (owner2 = channel11.getOwner()) == null) ? null : owner2.getName());
        ChatChannelSummary channel12 = getChannel();
        chatChannel.setChatUserProfile((channel12 == null || (owner = channel12.getOwner()) == null) ? null : owner.getProfilePic());
        ChatChannelSummary channel13 = getChannel();
        chatChannel.setChannelOpenUntil(channel13 != null ? channel13.getChannelOpenUntil() : null);
        ChatChannelSummary channel14 = getChannel();
        chatChannel.setChannelWillBeChargedNext(channel14 != null ? channel14.getChannelWillBeChargedNext() : null);
        chatChannel.setUpdatedAt(Long.valueOf(this.updatedAt));
        chatChannel.setCreatedAt(Long.valueOf(this.createdAt));
        ChatChannelSummary channel15 = getChannel();
        chatChannel.setUserIdsForDirectChannel(channel15 != null ? channel15.getUserIdsForDirectChannel() : null);
        ChatChannelSummary channel16 = getChannel();
        chatChannel.setParticipantScopeIfInternal(channel16 != null ? channel16.getParticipantScopeIfInternal() : null);
        ChatChannelSummary channel17 = getChannel();
        chatChannel.setExternalParticipantsAllowed(channel17 != null ? sq8.m48644c(channel17.getExternalParticipantsAllowed(), bool) : false);
        return chatChannel;
    }

    public ChatParticipantSummary(ChatParticipant chatParticipant) {
        sq8.m48649h(chatParticipant, "underlyingChatParticipant");
        this.underlyingChatParticipant = chatParticipant;
        Optional optionalOfNullable = Optional.ofNullable(chatParticipant.getCreatedAt());
        final ChatParticipantSummary$createdAt$1 chatParticipantSummary$createdAt$1 = ChatParticipantSummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.zx2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary.createdAt$lambda$8(chatParticipantSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        this.createdAt = ((Number) objOrElse).longValue();
        Optional optionalOfNullable2 = Optional.ofNullable(this.underlyingChatParticipant.getUpdatedAt());
        final ChatParticipantSummary$updatedAt$1 chatParticipantSummary$updatedAt$1 = ChatParticipantSummary$updatedAt$1.INSTANCE;
        Object objOrElse2 = optionalOfNullable2.map(new Function() { // from class: o.ay2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatParticipantSummary.updatedAt$lambda$9(chatParticipantSummary$updatedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse2, "orElse(...)");
        this.updatedAt = ((Number) objOrElse2).longValue();
    }

    public /* synthetic */ ChatParticipantSummary(ChatParticipant chatParticipant, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : chatParticipant);
    }
}
