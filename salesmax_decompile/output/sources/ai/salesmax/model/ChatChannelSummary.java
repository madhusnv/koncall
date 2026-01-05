package ai.salesmax.model;

import ai.salesmax.model.ChatChannelSummary;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ContactAssignmentStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import p001o.a81;
import p001o.ch3;
import p001o.dh3;
import p001o.id5;
import p001o.kh3;
import p001o.lpi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatChannelSummary {
    private com.amplifyframework.datastore.generated.model.ChatChannel underlyingChatChannel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final com.amplifyframework.datastore.generated.model.ChatChannel newInstance() {
            com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = com.amplifyframework.datastore.generated.model.ChatChannel.builder().accountId("").id("").build();
            sq8.m48648g(chatChannelBuild, "build(...)");
            return chatChannelBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatChannelSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_owner_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.underlyingChatChannel.getAccountId();
    }

    public final String getChannelName() {
        return this.underlyingChatChannel.getChannelName();
    }

    public final Long getChannelOpenUntil() {
        return a81.m16645F(this.underlyingChatChannel.getChannelOpenUntil());
    }

    public final String getChannelStatus() {
        String channelStatus = this.underlyingChatChannel.getChannelStatus();
        sq8.m48648g(channelStatus, "getChannelStatus(...)");
        return channelStatus;
    }

    public final String getChannelSubType() {
        return this.underlyingChatChannel.getChannelSubType();
    }

    public final String getChannelType() {
        String channelType = this.underlyingChatChannel.getChannelType();
        sq8.m48648g(channelType, "getChannelType(...)");
        return channelType;
    }

    public final Long getChannelWillBeChargedNext() {
        return a81.m16645F(this.underlyingChatChannel.getChannelWillBeChargedNext());
    }

    public final String getCreatedById() {
        return this.underlyingChatChannel.getCreatedById();
    }

    public final Boolean getExternalParticipantsAllowed() {
        return this.underlyingChatChannel.getExternalParticipantsAllowed();
    }

    public final String getId() {
        return this.underlyingChatChannel.getId();
    }

    public final String getMessagePlatform() {
        return this.underlyingChatChannel.getMessagePlatform();
    }

    public final List<ChatMessageSummary> getMessages() {
        ArrayList arrayList;
        List<ChatMessage> messages = this.underlyingChatChannel.getMessages();
        if (messages != null) {
            List listC0 = kh3.c0(messages);
            arrayList = new ArrayList(dh3.m23088v(listC0, 10));
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add(new ChatMessageSummary((ChatMessage) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? ch3.m21246k() : arrayList;
    }

    public final LeadsUser getOwner() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatChannel.getOwner());
        final ChatChannelSummary$owner$1 chatChannelSummary$owner$1 = ChatChannelSummary$owner$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.ti2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatChannelSummary._get_owner_$lambda$0(chatChannelSummary$owner$1, obj);
            }
        }).orElse(lpi.a0(this.underlyingChatChannel.getOwnerId()));
    }

    public final String getOwnerId() {
        return this.underlyingChatChannel.getOwnerId();
    }

    public final String getParticipantScopeIfInternal() {
        return this.underlyingChatChannel.getParticipantScopeIfInternal();
    }

    public final String getPhoneNumberIdExternal() {
        return this.underlyingChatChannel.getPhoneNumberIdExternal();
    }

    public final String getPrimaryTeamId() {
        return this.underlyingChatChannel.getPrimaryTeamId();
    }

    public final String getRecepientExternalId() {
        return this.underlyingChatChannel.getRecipientExternalId();
    }

    public final String getRecepientExternalIdType() {
        return this.underlyingChatChannel.getRecipientExternalIdType();
    }

    public final String getRecipientType() {
        return this.underlyingChatChannel.getRecipientType();
    }

    public final String getSalesmaxAccountId() {
        return this.underlyingChatChannel.getSalesmaxAccountId();
    }

    public final List<String> getTags() {
        return this.underlyingChatChannel.getTags();
    }

    public final String getToBeAssigned() {
        ContactAssignmentStatus toBeAssigned = this.underlyingChatChannel.getToBeAssigned();
        if (toBeAssigned != null) {
            return toBeAssigned.name();
        }
        return null;
    }

    public final com.amplifyframework.datastore.generated.model.ChatChannel getUnderlyingChatChannel() {
        return this.underlyingChatChannel;
    }

    public final String getUserIdsForDirectChannel() {
        return this.underlyingChatChannel.getUserIdsForDirectChannel();
    }

    public final String getVisitorId() {
        return this.underlyingChatChannel.getVisitorId();
    }

    public final void setAccountId(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().accountId(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setChannelName(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().channelName(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setChannelOpenUntil(Long l) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().channelOpenUntil(a81.m16658m(l)).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setChannelStatus(String str) {
        sq8.m48649h(str, "value");
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().channelStatus(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setChannelSubType(String str) {
        if (str != null) {
            com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().channelSubType(str).build();
            sq8.m48648g(chatChannelBuild, "build(...)");
            this.underlyingChatChannel = chatChannelBuild;
        }
    }

    public final void setChannelType(String str) {
        sq8.m48649h(str, "value");
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().channelType(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setChannelWillBeChargedNext(Long l) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().channelWillBeChargedNext(a81.m16658m(l)).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setCreatedById(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().createdById(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setExternalParticipantsAllowed(Boolean bool) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().externalParticipantsAllowed(bool).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setId(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().id(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setMessagePlatform(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().messagePlatform(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setOwner(LeadsUser leadsUser) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().ownerId(leadsUser != null ? leadsUser.getId() : null).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setOwnerId(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().ownerId(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setParticipantScopeIfInternal(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().participantScopeIfInternal(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setPhoneNumberIdExternal(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().phoneNumberIdExternal(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setPrimaryTeamId(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().primaryTeamId(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setRecepientExternalId(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().recipientExternalId(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setRecepientExternalIdType(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().recipientExternalIdType(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setRecipientType(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().recipientType(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setSalesmaxAccountId(String str) {
        if (str != null) {
            com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().salesmaxAccountId(str).build();
            sq8.m48648g(chatChannelBuild, "build(...)");
            this.underlyingChatChannel = chatChannelBuild;
        }
    }

    public final void setTags(List<String> list) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().tags(list).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setToBeAssigned(String str) {
        if (str != null) {
            com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().toBeAssigned(ContactAssignmentStatus.valueOf(str)).build();
            sq8.m48648g(chatChannelBuild, "build(...)");
            this.underlyingChatChannel = chatChannelBuild;
        }
    }

    public final void setUnderlyingChatChannel(com.amplifyframework.datastore.generated.model.ChatChannel chatChannel) {
        sq8.m48649h(chatChannel, "<set-?>");
        this.underlyingChatChannel = chatChannel;
    }

    public final void setUserIdsForDirectChannel(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().userIdsForDirectChannel(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    public final void setVisitorId(String str) {
        com.amplifyframework.datastore.generated.model.ChatChannel chatChannelBuild = this.underlyingChatChannel.copyOfBuilder().visitorId(str).build();
        sq8.m48648g(chatChannelBuild, "build(...)");
        this.underlyingChatChannel = chatChannelBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChatChannel toChatChannel() {
        Object next;
        long jM16645F;
        long jM16645F2;
        ChatChannel chatChannel = new ChatChannel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null == true ? 1 : 0, 0, false, null, null, null, null, null, false, false, false, null, null, false, null, null, 1073741823, null);
        chatChannel.setChannelId(this.underlyingChatChannel.getId());
        chatChannel.setMessagePlatform(this.underlyingChatChannel.getMessagePlatform());
        chatChannel.setRecipientExternalId(this.underlyingChatChannel.getRecipientExternalId());
        chatChannel.setRecipientExternalIdType(this.underlyingChatChannel.getRecipientExternalIdType());
        chatChannel.setChannelName(this.underlyingChatChannel.getChannelName());
        chatChannel.setChannelType(this.underlyingChatChannel.getChannelType());
        chatChannel.setChannelSubType(this.underlyingChatChannel.getChannelSubType());
        chatChannel.setSalesmaxAccountId(this.underlyingChatChannel.getSalesmaxAccountId());
        chatChannel.setChannelStatus(this.underlyingChatChannel.getChannelStatus());
        Contact contact = this.underlyingChatChannel.getContact();
        chatChannel.setContact(contact != null ? new LeadsSummary(contact).toLeads() : null);
        Iterator<T> it = getMessages().iterator();
        if (it.hasNext()) {
            next = it.next();
        } else {
            next = null;
        }
        ChatMessageSummary chatMessageSummary = (ChatMessageSummary) next;
        chatChannel.setLastMessage(chatMessageSummary != null ? chatMessageSummary.toChatMessages() : null);
        chatChannel.setUnreadMessageCount(0);
        chatChannel.setChatUserId(getOwnerId());
        chatChannel.setVisitorId(getVisitorId());
        LeadsUser owner = getOwner();
        chatChannel.setChatUserName(owner != null ? owner.getName() : null);
        LeadsUser owner2 = getOwner();
        chatChannel.setChatUserProfile(owner2 != null ? owner2.getProfilePic() : null);
        chatChannel.setChannelOpenUntil(getChannelOpenUntil());
        chatChannel.setChannelWillBeChargedNext(getChannelWillBeChargedNext());
        Temporal.DateTime updatedAt = this.underlyingChatChannel.getUpdatedAt();
        if (updatedAt == null || (jM16645F = a81.m16645F(updatedAt)) == null) {
            jM16645F = 0L;
        }
        chatChannel.setUpdatedAt(jM16645F);
        Temporal.DateTime createdAt = this.underlyingChatChannel.getCreatedAt();
        if (createdAt == null || (jM16645F2 = a81.m16645F(createdAt)) == null) {
            jM16645F2 = 0L;
        }
        chatChannel.setCreatedAt(jM16645F2);
        chatChannel.setUserIdsForDirectChannel(getUserIdsForDirectChannel());
        chatChannel.setParticipantScopeIfInternal(getParticipantScopeIfInternal());
        chatChannel.setExternalParticipantsAllowed(sq8.m48644c(getExternalParticipantsAllowed(), Boolean.TRUE));
        return chatChannel;
    }

    public ChatChannelSummary(com.amplifyframework.datastore.generated.model.ChatChannel chatChannel) {
        sq8.m48649h(chatChannel, "underlyingChatChannel");
        this.underlyingChatChannel = chatChannel;
    }

    public /* synthetic */ ChatChannelSummary(com.amplifyframework.datastore.generated.model.ChatChannel chatChannel, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : chatChannel);
    }
}
