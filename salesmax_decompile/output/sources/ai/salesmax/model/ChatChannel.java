package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class ChatChannel extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChatChannel> CREATOR = new Creator();
    private String channelId;
    private String channelName;
    private Long channelOpenUntil;
    private String channelStatus;
    private String channelSubType;
    private String channelType;
    private Long channelWillBeChargedNext;
    private String chatUserId;
    private String chatUserName;
    private String chatUserProfile;
    private Leads contact;
    private Long createdAt;
    private boolean externalParticipantsAllowed;
    private boolean isSelected;
    private boolean isStarred;
    private ChatMessages lastMessage;
    private String messagePlatform;
    private String participantScopeIfInternal;
    private String phoneNumberIdExternal;
    private String recipientExternalId;
    private String recipientExternalIdType;
    private String recipientType;
    private String salesmaxAccountId;
    private boolean showBottom;
    private boolean showSelection;
    private ArrayList<String> tags;
    private int unreadMessageCount;
    private Long updatedAt;
    private String userIdsForDirectChannel;
    private String visitorId;

    public static final class Creator implements Parcelable.Creator<ChatChannel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatChannel createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ChatChannel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Leads.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ChatMessages.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatChannel[] newArray(int i) {
            return new ChatChannel[i];
        }
    }

    public ChatChannel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, false, false, false, null, null, false, null, null, 1073741823, null);
    }

    public static /* synthetic */ ChatChannelSummary toChatChannelSummary$default(ChatChannel chatChannel, ChatChannelSummary chatChannelSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            chatChannelSummary = null;
        }
        return chatChannel.toChatChannelSummary(chatChannelSummary);
    }

    public final String component1() {
        return this.channelId;
    }

    public final String component10() {
        return this.channelSubType;
    }

    public final String component11() {
        return this.salesmaxAccountId;
    }

    public final String component12() {
        return this.channelStatus;
    }

    public final Leads component13() {
        return this.contact;
    }

    public final String component14() {
        return this.visitorId;
    }

    public final ChatMessages component15() {
        return this.lastMessage;
    }

    public final int component16() {
        return this.unreadMessageCount;
    }

    public final boolean component17() {
        return this.isStarred;
    }

    public final String component18() {
        return this.chatUserId;
    }

    public final String component19() {
        return this.chatUserName;
    }

    public final String component2() {
        return this.channelName;
    }

    public final String component20() {
        return this.chatUserProfile;
    }

    public final Long component21() {
        return this.channelOpenUntil;
    }

    public final Long component22() {
        return this.channelWillBeChargedNext;
    }

    public final boolean component23() {
        return this.isSelected;
    }

    public final boolean component24() {
        return this.showSelection;
    }

    public final boolean component25() {
        return this.showBottom;
    }

    public final String component26() {
        return this.participantScopeIfInternal;
    }

    public final String component27() {
        return this.userIdsForDirectChannel;
    }

    public final boolean component28() {
        return this.externalParticipantsAllowed;
    }

    public final Long component29() {
        return this.updatedAt;
    }

    public final String component3() {
        return this.phoneNumberIdExternal;
    }

    public final Long component30() {
        return this.createdAt;
    }

    public final String component4() {
        return this.messagePlatform;
    }

    public final ArrayList<String> component5() {
        return this.tags;
    }

    public final String component6() {
        return this.recipientType;
    }

    public final String component7() {
        return this.recipientExternalId;
    }

    public final String component8() {
        return this.recipientExternalIdType;
    }

    public final String component9() {
        return this.channelType;
    }

    public final ChatChannel copy(String str, String str2, String str3, String str4, ArrayList<String> arrayList, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Leads leads, String str12, ChatMessages chatMessages, int i, boolean z, String str13, String str14, String str15, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str16, String str17, boolean z5, Long l3, Long l4) {
        sq8.m48649h(arrayList, "tags");
        return new ChatChannel(str, str2, str3, str4, arrayList, str5, str6, str7, str8, str9, str10, str11, leads, str12, chatMessages, i, z, str13, str14, str15, l, l2, z2, z3, z4, str16, str17, z5, l3, l4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatChannel)) {
            return false;
        }
        ChatChannel chatChannel = (ChatChannel) obj;
        return sq8.m48644c(this.channelId, chatChannel.channelId) && sq8.m48644c(this.channelName, chatChannel.channelName) && sq8.m48644c(this.phoneNumberIdExternal, chatChannel.phoneNumberIdExternal) && sq8.m48644c(this.messagePlatform, chatChannel.messagePlatform) && sq8.m48644c(this.tags, chatChannel.tags) && sq8.m48644c(this.recipientType, chatChannel.recipientType) && sq8.m48644c(this.recipientExternalId, chatChannel.recipientExternalId) && sq8.m48644c(this.recipientExternalIdType, chatChannel.recipientExternalIdType) && sq8.m48644c(this.channelType, chatChannel.channelType) && sq8.m48644c(this.channelSubType, chatChannel.channelSubType) && sq8.m48644c(this.salesmaxAccountId, chatChannel.salesmaxAccountId) && sq8.m48644c(this.channelStatus, chatChannel.channelStatus) && sq8.m48644c(this.contact, chatChannel.contact) && sq8.m48644c(this.visitorId, chatChannel.visitorId) && sq8.m48644c(this.lastMessage, chatChannel.lastMessage) && this.unreadMessageCount == chatChannel.unreadMessageCount && this.isStarred == chatChannel.isStarred && sq8.m48644c(this.chatUserId, chatChannel.chatUserId) && sq8.m48644c(this.chatUserName, chatChannel.chatUserName) && sq8.m48644c(this.chatUserProfile, chatChannel.chatUserProfile) && sq8.m48644c(this.channelOpenUntil, chatChannel.channelOpenUntil) && sq8.m48644c(this.channelWillBeChargedNext, chatChannel.channelWillBeChargedNext) && this.isSelected == chatChannel.isSelected && this.showSelection == chatChannel.showSelection && this.showBottom == chatChannel.showBottom && sq8.m48644c(this.participantScopeIfInternal, chatChannel.participantScopeIfInternal) && sq8.m48644c(this.userIdsForDirectChannel, chatChannel.userIdsForDirectChannel) && this.externalParticipantsAllowed == chatChannel.externalParticipantsAllowed && sq8.m48644c(this.updatedAt, chatChannel.updatedAt) && sq8.m48644c(this.createdAt, chatChannel.createdAt);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final Long getChannelOpenUntil() {
        return this.channelOpenUntil;
    }

    public final String getChannelStatus() {
        return this.channelStatus;
    }

    public final String getChannelSubType() {
        return this.channelSubType;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final Long getChannelWillBeChargedNext() {
        return this.channelWillBeChargedNext;
    }

    public final String getChatUserId() {
        return this.chatUserId;
    }

    public final String getChatUserName() {
        return this.chatUserName;
    }

    public final String getChatUserProfile() {
        return this.chatUserProfile;
    }

    public final Leads getContact() {
        return this.contact;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getExternalParticipantsAllowed() {
        return this.externalParticipantsAllowed;
    }

    public final ChatMessages getLastMessage() {
        return this.lastMessage;
    }

    public final String getMessagePlatform() {
        return this.messagePlatform;
    }

    public final String getParticipantScopeIfInternal() {
        return this.participantScopeIfInternal;
    }

    public final String getPhoneNumberIdExternal() {
        return this.phoneNumberIdExternal;
    }

    public final String getRecipientExternalId() {
        return this.recipientExternalId;
    }

    public final String getRecipientExternalIdType() {
        return this.recipientExternalIdType;
    }

    public final String getRecipientType() {
        return this.recipientType;
    }

    public final String getSalesmaxAccountId() {
        return this.salesmaxAccountId;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final ArrayList<String> getTags() {
        return this.tags;
    }

    public final int getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserIdsForDirectChannel() {
        return this.userIdsForDirectChannel;
    }

    public final String getVisitorId() {
        return this.visitorId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumberIdExternal;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.messagePlatform;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.tags.hashCode()) * 31;
        String str5 = this.recipientType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.recipientExternalId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recipientExternalIdType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.channelType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.channelSubType;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.salesmaxAccountId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.channelStatus;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Leads leads = this.contact;
        int iHashCode12 = (iHashCode11 + (leads == null ? 0 : leads.hashCode())) * 31;
        String str12 = this.visitorId;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        ChatMessages chatMessages = this.lastMessage;
        int iHashCode14 = (((iHashCode13 + (chatMessages == null ? 0 : chatMessages.hashCode())) * 31) + Integer.hashCode(this.unreadMessageCount)) * 31;
        boolean z = this.isStarred;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode14 + i) * 31;
        String str13 = this.chatUserId;
        int iHashCode15 = (i2 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.chatUserName;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.chatUserProfile;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l = this.channelOpenUntil;
        int iHashCode18 = (iHashCode17 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.channelWillBeChargedNext;
        int iHashCode19 = (iHashCode18 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z2 = this.isSelected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode19 + i3) * 31;
        boolean z3 = this.showSelection;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.showBottom;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str16 = this.participantScopeIfInternal;
        int iHashCode20 = (i8 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.userIdsForDirectChannel;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        boolean z5 = this.externalParticipantsAllowed;
        int i9 = (iHashCode21 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        Long l3 = this.updatedAt;
        int iHashCode22 = (i9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.createdAt;
        return iHashCode22 + (l4 != null ? l4.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isStarred() {
        return this.isStarred;
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }

    public final void setChannelName(String str) {
        this.channelName = str;
    }

    public final void setChannelOpenUntil(Long l) {
        this.channelOpenUntil = l;
    }

    public final void setChannelStatus(String str) {
        this.channelStatus = str;
    }

    public final void setChannelSubType(String str) {
        this.channelSubType = str;
    }

    public final void setChannelType(String str) {
        this.channelType = str;
    }

    public final void setChannelWillBeChargedNext(Long l) {
        this.channelWillBeChargedNext = l;
    }

    public final void setChatUserId(String str) {
        this.chatUserId = str;
    }

    public final void setChatUserName(String str) {
        this.chatUserName = str;
    }

    public final void setChatUserProfile(String str) {
        this.chatUserProfile = str;
    }

    public final void setContact(Leads leads) {
        this.contact = leads;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setExternalParticipantsAllowed(boolean z) {
        this.externalParticipantsAllowed = z;
    }

    public final void setLastMessage(ChatMessages chatMessages) {
        this.lastMessage = chatMessages;
    }

    public final void setMessagePlatform(String str) {
        this.messagePlatform = str;
    }

    public final void setParticipantScopeIfInternal(String str) {
        this.participantScopeIfInternal = str;
    }

    public final void setPhoneNumberIdExternal(String str) {
        this.phoneNumberIdExternal = str;
    }

    public final void setRecipientExternalId(String str) {
        this.recipientExternalId = str;
    }

    public final void setRecipientExternalIdType(String str) {
        this.recipientExternalIdType = str;
    }

    public final void setRecipientType(String str) {
        this.recipientType = str;
    }

    public final void setSalesmaxAccountId(String str) {
        this.salesmaxAccountId = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public final void setStarred(boolean z) {
        this.isStarred = z;
    }

    public final void setTags(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.tags = arrayList;
    }

    public final void setUnreadMessageCount(int i) {
        this.unreadMessageCount = i;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setUserIdsForDirectChannel(String str) {
        this.userIdsForDirectChannel = str;
    }

    public final void setVisitorId(String str) {
        this.visitorId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChatChannelSummary toChatChannelSummary(ChatChannelSummary chatChannelSummary) {
        if (chatChannelSummary == null) {
            chatChannelSummary = new ChatChannelSummary(null, 1, 0 == true ? 1 : 0);
        }
        chatChannelSummary.setId(this.channelId);
        chatChannelSummary.setChannelName(this.channelName);
        chatChannelSummary.setPhoneNumberIdExternal(this.phoneNumberIdExternal);
        chatChannelSummary.setRecipientType(this.recipientType);
        String str = this.channelType;
        if (str != null) {
            sq8.m48646e(str);
            chatChannelSummary.setChannelType(str);
        }
        String str2 = this.channelSubType;
        if (str2 != null) {
            sq8.m48646e(str2);
            chatChannelSummary.setChannelSubType(str2);
        }
        String str3 = this.salesmaxAccountId;
        if (str3 != null) {
            sq8.m48646e(str3);
            chatChannelSummary.setSalesmaxAccountId(str3);
        }
        chatChannelSummary.setParticipantScopeIfInternal(this.participantScopeIfInternal);
        chatChannelSummary.setExternalParticipantsAllowed(Boolean.valueOf(this.externalParticipantsAllowed));
        chatChannelSummary.setMessagePlatform(this.messagePlatform);
        String str4 = this.channelStatus;
        if (str4 != null) {
            sq8.m48646e(str4);
            chatChannelSummary.setChannelStatus(str4);
        }
        return chatChannelSummary;
    }

    public String toString() {
        return "ChatChannel(channelId=" + this.channelId + ", channelName=" + this.channelName + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", messagePlatform=" + this.messagePlatform + ", tags=" + this.tags + ", recipientType=" + this.recipientType + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelType=" + this.channelType + ", channelSubType=" + this.channelSubType + ", salesmaxAccountId=" + this.salesmaxAccountId + ", channelStatus=" + this.channelStatus + ", contact=" + this.contact + ", visitorId=" + this.visitorId + ", lastMessage=" + this.lastMessage + ", unreadMessageCount=" + this.unreadMessageCount + ", isStarred=" + this.isStarred + ", chatUserId=" + this.chatUserId + ", chatUserName=" + this.chatUserName + ", chatUserProfile=" + this.chatUserProfile + ", channelOpenUntil=" + this.channelOpenUntil + ", channelWillBeChargedNext=" + this.channelWillBeChargedNext + ", isSelected=" + this.isSelected + ", showSelection=" + this.showSelection + ", showBottom=" + this.showBottom + ", participantScopeIfInternal=" + this.participantScopeIfInternal + ", userIdsForDirectChannel=" + this.userIdsForDirectChannel + ", externalParticipantsAllowed=" + this.externalParticipantsAllowed + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.channelId);
        parcel.writeString(this.channelName);
        parcel.writeString(this.phoneNumberIdExternal);
        parcel.writeString(this.messagePlatform);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.recipientType);
        parcel.writeString(this.recipientExternalId);
        parcel.writeString(this.recipientExternalIdType);
        parcel.writeString(this.channelType);
        parcel.writeString(this.channelSubType);
        parcel.writeString(this.salesmaxAccountId);
        parcel.writeString(this.channelStatus);
        Leads leads = this.contact;
        if (leads == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leads.writeToParcel(parcel, i);
        }
        parcel.writeString(this.visitorId);
        ChatMessages chatMessages = this.lastMessage;
        if (chatMessages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMessages.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.unreadMessageCount);
        parcel.writeInt(this.isStarred ? 1 : 0);
        parcel.writeString(this.chatUserId);
        parcel.writeString(this.chatUserName);
        parcel.writeString(this.chatUserProfile);
        Long l = this.channelOpenUntil;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.channelWillBeChargedNext;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.showBottom ? 1 : 0);
        parcel.writeString(this.participantScopeIfInternal);
        parcel.writeString(this.userIdsForDirectChannel);
        parcel.writeInt(this.externalParticipantsAllowed ? 1 : 0);
        Long l3 = this.updatedAt;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.createdAt;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
    }

    public /* synthetic */ ChatChannel(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Leads leads, String str12, ChatMessages chatMessages, int i, boolean z, String str13, String str14, String str15, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str16, String str17, boolean z5, Long l3, Long l4, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? "WHATSAPP" : str4, (i2 & 16) != 0 ? new ArrayList() : arrayList, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : leads, (i2 & 8192) != 0 ? null : str12, (i2 & Opcodes.ACC_ENUM) != 0 ? null : chatMessages, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? false : z, (i2 & Opcodes.ACC_DEPRECATED) != 0 ? null : str13, (i2 & 262144) != 0 ? null : str14, (i2 & Opcodes.ASM8) != 0 ? null : str15, (i2 & 1048576) != 0 ? null : l, (i2 & 2097152) != 0 ? null : l2, (i2 & 4194304) != 0 ? false : z2, (i2 & 8388608) != 0 ? false : z3, (i2 & 16777216) != 0 ? false : z4, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str16, (i2 & 67108864) != 0 ? null : str17, (i2 & 134217728) == 0 ? z5 : false, (i2 & 268435456) != 0 ? null : l3, (i2 & 536870912) != 0 ? null : l4);
    }

    public ChatChannel(String str, String str2, String str3, String str4, ArrayList<String> arrayList, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Leads leads, String str12, ChatMessages chatMessages, int i, boolean z, String str13, String str14, String str15, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str16, String str17, boolean z5, Long l3, Long l4) {
        sq8.m48649h(arrayList, "tags");
        this.channelId = str;
        this.channelName = str2;
        this.phoneNumberIdExternal = str3;
        this.messagePlatform = str4;
        this.tags = arrayList;
        this.recipientType = str5;
        this.recipientExternalId = str6;
        this.recipientExternalIdType = str7;
        this.channelType = str8;
        this.channelSubType = str9;
        this.salesmaxAccountId = str10;
        this.channelStatus = str11;
        this.contact = leads;
        this.visitorId = str12;
        this.lastMessage = chatMessages;
        this.unreadMessageCount = i;
        this.isStarred = z;
        this.chatUserId = str13;
        this.chatUserName = str14;
        this.chatUserProfile = str15;
        this.channelOpenUntil = l;
        this.channelWillBeChargedNext = l2;
        this.isSelected = z2;
        this.showSelection = z3;
        this.showBottom = z4;
        this.participantScopeIfInternal = str16;
        this.userIdsForDirectChannel = str17;
        this.externalParticipantsAllowed = z5;
        this.updatedAt = l3;
        this.createdAt = l4;
    }
}
