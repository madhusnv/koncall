package ai.salesmax.model;

import ai.salesmax.model.ChatMentionsSummary;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.ChatMentions;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import com.amplifyframework.datastore.generated.model.Contact;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import p001o.id5;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMentionsSummary {
    private long createdAt;
    private ChatMentions underlyingChatMentions;
    private long updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final ChatMentions newInstance() {
            ChatMentions chatMentionsBuild = ChatMentions.builder().accountId("").mentionedUserId("").mentionedMessageId("").id("").build();
            sq8.m48648g(chatMentionsBuild, "build(...)");
            return chatMentionsBuild;
        }
    }

    /* renamed from: ai.salesmax.model.ChatMentionsSummary$getContact$1 */
    public static final class C00991 extends kf9 implements xk7 {
        public static final C00991 INSTANCE = new C00991();

        public C00991() {
            super(1);
        }

        @Override // p001o.xk7
        public final Contact invoke(com.amplifyframework.datastore.generated.model.ChatChannel chatChannel) {
            return chatChannel.getContact();
        }
    }

    /* renamed from: ai.salesmax.model.ChatMentionsSummary$getContact$2 */
    public static final class C01002 extends kf9 implements xk7 {
        public static final C01002 INSTANCE = new C01002();

        public C01002() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsSummary invoke(Contact contact) {
            sq8.m48649h(contact, "x");
            return new LeadsSummary(contact);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMentionsSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_expirationUnixTime_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long createdAt$lambda$5(xk7 xk7Var, Object obj) {
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
    public static final Long updatedAt$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.underlyingChatMentions.getAccountId();
    }

    public final ChatChannelSummary getChannel() {
        com.amplifyframework.datastore.generated.model.ChatChannel channel = this.underlyingChatMentions.getChannel();
        if (channel != null) {
            return new ChatChannelSummary(channel);
        }
        return null;
    }

    public final LeadsSummary getContact() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMentions.getChannel());
        final C00991 c00991 = C00991.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.ko2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMentionsSummary.getContact$lambda$1(c00991, obj);
            }
        });
        final C01002 c01002 = C01002.INSTANCE;
        return (LeadsSummary) map.map(new Function() { // from class: o.lo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMentionsSummary.getContact$lambda$2(c01002, obj);
            }
        }).orElse(null);
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getExpirationUnixTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMentions.getExpirationUnixTime());
        final ChatMentionsSummary$expirationUnixTime$1 chatMentionsSummary$expirationUnixTime$1 = ChatMentionsSummary$expirationUnixTime$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.oo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMentionsSummary._get_expirationUnixTime_$lambda$4(chatMentionsSummary$expirationUnixTime$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getId() {
        return this.underlyingChatMentions.getId();
    }

    public final String getMentionedById() {
        return this.underlyingChatMentions.getMentionedById();
    }

    public final ChatMessageSummary getMentionedMessage() {
        ChatMessage mentionedMessage = this.underlyingChatMentions.getMentionedMessage();
        if (mentionedMessage != null) {
            return new ChatMessageSummary(mentionedMessage);
        }
        return null;
    }

    public final String getMentionedMessageId() {
        return this.underlyingChatMentions.getMentionedMessageId();
    }

    public final String getMentionedUserId() {
        return this.underlyingChatMentions.getMentionedUserId();
    }

    public final String getStatus() {
        return this.underlyingChatMentions.getStatus();
    }

    public final ChatMentions getUnderlyingChatMentions() {
        return this.underlyingChatMentions;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final void setAccountId(String str) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().accountId(str).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setChannel(ChatChannelSummary chatChannelSummary) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().channel(chatChannelSummary != null ? chatChannelSummary.getUnderlyingChatChannel() : null).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setExpirationUnixTime(long j) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().expirationUnixTime(new Temporal.Timestamp(j, TimeUnit.MILLISECONDS)).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setId(String str) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().id(getId()).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setMentionedById(String str) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().mentionedById(str).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setMentionedMessage(ChatMessageSummary chatMessageSummary) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().mentionedMessageId(chatMessageSummary != null ? chatMessageSummary.getId() : null).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setMentionedMessageId(String str) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().mentionedMessageId(str).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setMentionedUserId(String str) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().mentionedUserId(str).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setStatus(String str) {
        ChatMentions chatMentionsBuild = this.underlyingChatMentions.copyOfBuilder().status(str).build();
        sq8.m48648g(chatMentionsBuild, "build(...)");
        this.underlyingChatMentions = chatMentionsBuild;
    }

    public final void setUnderlyingChatMentions(ChatMentions chatMentions) {
        sq8.m48649h(chatMentions, "<set-?>");
        this.underlyingChatMentions = chatMentions;
    }

    public final void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
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
        chatChannel.setMessagePlatform(channel2 != null ? channel2.getMessagePlatform() : null);
        ChatChannelSummary channel3 = getChannel();
        chatChannel.setRecipientExternalId(channel3 != null ? channel3.getRecepientExternalId() : null);
        ChatChannelSummary channel4 = getChannel();
        chatChannel.setRecipientExternalIdType(channel4 != null ? channel4.getRecepientExternalIdType() : null);
        ChatChannelSummary channel5 = getChannel();
        chatChannel.setChannelName(channel5 != null ? channel5.getChannelName() : null);
        ChatChannelSummary channel6 = getChannel();
        chatChannel.setChannelType(channel6 != null ? channel6.getChannelType() : null);
        ChatChannelSummary channel7 = getChannel();
        chatChannel.setChannelStatus(channel7 != null ? channel7.getChannelStatus() : null);
        LeadsSummary contact = getContact();
        chatChannel.setContact(contact != null ? contact.toLeads() : null);
        ChatChannelSummary channel8 = getChannel();
        if (channel8 == null || (messages = channel8.getMessages()) == null) {
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
        chatChannel.setUnreadMessageCount(0);
        ChatChannelSummary channel9 = getChannel();
        chatChannel.setChatUserId((channel9 == null || (owner3 = channel9.getOwner()) == null) ? null : owner3.getId());
        ChatChannelSummary channel10 = getChannel();
        chatChannel.setChatUserName((channel10 == null || (owner2 = channel10.getOwner()) == null) ? null : owner2.getName());
        ChatChannelSummary channel11 = getChannel();
        chatChannel.setChatUserProfile((channel11 == null || (owner = channel11.getOwner()) == null) ? null : owner.getProfilePic());
        ChatChannelSummary channel12 = getChannel();
        chatChannel.setChannelOpenUntil(channel12 != null ? channel12.getChannelOpenUntil() : null);
        ChatChannelSummary channel13 = getChannel();
        chatChannel.setChannelWillBeChargedNext(channel13 != null ? channel13.getChannelWillBeChargedNext() : null);
        chatChannel.setUpdatedAt(Long.valueOf(this.updatedAt));
        chatChannel.setCreatedAt(Long.valueOf(this.createdAt));
        return chatChannel;
    }

    public ChatMentionsSummary(ChatMentions chatMentions) {
        sq8.m48649h(chatMentions, "underlyingChatMentions");
        this.underlyingChatMentions = chatMentions;
        Optional optionalOfNullable = Optional.ofNullable(chatMentions.getCreatedAt());
        final ChatMentionsSummary$createdAt$1 chatMentionsSummary$createdAt$1 = ChatMentionsSummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.mo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMentionsSummary.createdAt$lambda$5(chatMentionsSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        this.createdAt = ((Number) objOrElse).longValue();
        Optional optionalOfNullable2 = Optional.ofNullable(this.underlyingChatMentions.getUpdatedAt());
        final ChatMentionsSummary$updatedAt$1 chatMentionsSummary$updatedAt$1 = ChatMentionsSummary$updatedAt$1.INSTANCE;
        Object objOrElse2 = optionalOfNullable2.map(new Function() { // from class: o.no2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMentionsSummary.updatedAt$lambda$6(chatMentionsSummary$updatedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse2, "orElse(...)");
        this.updatedAt = ((Number) objOrElse2).longValue();
    }

    public /* synthetic */ ChatMentionsSummary(ChatMentions chatMentions, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : chatMentions);
    }
}
