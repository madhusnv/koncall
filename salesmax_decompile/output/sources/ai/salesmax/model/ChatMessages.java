package ai.salesmax.model;

import ai.salesmax.model.CommentSummary;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.th1;
import p001o.yfe;

/* loaded from: classes.dex */
public final class ChatMessages extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChatMessages> CREATOR = new Creator();
    private ActionInteractive actionInteractive;
    private AddressMessageParameters adddressMessageParameters;
    private List<WaButton> buttons;
    private String channelId;
    private String chatUserAccountNameIfExternal;
    private Leads contact;
    private String contactId;
    private String contactName;
    private Long createdAt;
    private long deliveredAt;
    private String directChatUserId;
    private String errorMessages;
    private String externalMessageReferenceId;
    private String externalTemplateId;
    private String followUpType;
    private String footerText;
    private String headerText;
    private String headerType;
    private String id;
    private String internalTemplateId;
    private boolean isExistingId;
    private Boolean isInbound;
    private boolean isPendingUpload;
    private boolean isSelected;
    private Boolean isStarred;
    private LocationObject locationObject;
    private ArrayList<CommentSummary.MentionedEntity> mentioned;
    private String messageCategory;
    private FileData messageFile;
    private String messagePlatform;
    private String messageSubType;
    private String messageText;
    private long messageTime;
    private String messageType;
    private String messageUserId;
    private String messageUserName;
    private String messageUserProfile;
    private List<TemplateParameter> parameters;
    private Bitmap pdfThumbnailBitmap;
    private String phoneNumberIdExternal;
    private long readAt;
    private String recipientExternalId;
    private String recipientExternalIdType;
    private Leads referredContact;
    private String referredContactId;
    private ChatMessages replyingToMessage;
    private ChatMessages responseMessage;
    private long sentAt;
    private Boolean sentByMe;
    private ArrayList<Leads> sentContacts;
    private boolean showDateText;
    private boolean showSelection;
    private String status;
    private Long updatedAt;

    public static final class Creator implements Parcelable.Creator<ChatMessages> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatMessages createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Leads leadsCreateFromParcel = parcel.readInt() == 0 ? null : Leads.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(WaButton.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(TemplateParameter.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Bitmap bitmap = (Bitmap) parcel.readParcelable(ChatMessages.class.getClassLoader());
            FileData fileDataCreateFromParcel = parcel.readInt() == 0 ? null : FileData.CREATOR.createFromParcel(parcel);
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            ChatMessages chatMessagesCreateFromParcel = parcel.readInt() == 0 ? null : ChatMessages.CREATOR.createFromParcel(parcel);
            ChatMessages chatMessagesCreateFromParcel2 = parcel.readInt() == 0 ? null : ChatMessages.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList3.add(CommentSummary.MentionedEntity.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            boolean z5 = parcel.readInt() != 0;
            ActionInteractive actionInteractiveCreateFromParcel = parcel.readInt() == 0 ? null : ActionInteractive.CREATOR.createFromParcel(parcel);
            LocationObject locationObjectCreateFromParcel = parcel.readInt() == 0 ? null : LocationObject.CREATOR.createFromParcel(parcel);
            AddressMessageParameters addressMessageParametersCreateFromParcel = parcel.readInt() == 0 ? null : AddressMessageParameters.CREATOR.createFromParcel(parcel);
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList4.add(Leads.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            return new ChatMessages(string, string2, string3, string4, string5, string6, string7, string8, string9, leadsCreateFromParcel, string10, string11, string12, string13, arrayList, arrayList2, string14, string15, string16, string17, boolValueOf, bitmap, fileDataCreateFromParcel, string18, string19, string20, string21, string22, boolValueOf2, boolValueOf3, j, j2, j3, j4, string23, string24, z, z2, z3, z4, chatMessagesCreateFromParcel, chatMessagesCreateFromParcel2, arrayList3, string25, string26, z5, actionInteractiveCreateFromParcel, locationObjectCreateFromParcel, addressMessageParametersCreateFromParcel, arrayList4, parcel.readString(), parcel.readInt() == 0 ? null : Leads.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatMessages[] newArray(int i) {
            return new ChatMessages[i];
        }
    }

    public ChatMessages() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, null, null, false, false, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    public static /* synthetic */ ChatMessageSummary toChatMessageSummary$default(ChatMessages chatMessages, ChatMessageSummary chatMessageSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            chatMessageSummary = null;
        }
        return chatMessages.toChatMessageSummary(chatMessageSummary);
    }

    public final String component1() {
        return this.id;
    }

    public final Leads component10() {
        return this.contact;
    }

    public final String component11() {
        return this.messageText;
    }

    public final String component12() {
        return this.headerText;
    }

    public final String component13() {
        return this.headerType;
    }

    public final String component14() {
        return this.footerText;
    }

    public final List<WaButton> component15() {
        return this.buttons;
    }

    public final List<TemplateParameter> component16() {
        return this.parameters;
    }

    public final String component17() {
        return this.messageType;
    }

    public final String component18() {
        return this.messageSubType;
    }

    public final String component19() {
        return this.followUpType;
    }

    public final String component2() {
        return this.messagePlatform;
    }

    public final String component20() {
        return this.messageCategory;
    }

    public final Boolean component21() {
        return this.isStarred;
    }

    public final Bitmap component22() {
        return this.pdfThumbnailBitmap;
    }

    public final FileData component23() {
        return this.messageFile;
    }

    public final String component24() {
        return this.messageUserId;
    }

    public final String component25() {
        return this.messageUserName;
    }

    public final String component26() {
        return this.directChatUserId;
    }

    public final String component27() {
        return this.chatUserAccountNameIfExternal;
    }

    public final String component28() {
        return this.messageUserProfile;
    }

    public final Boolean component29() {
        return this.sentByMe;
    }

    public final String component3() {
        return this.externalMessageReferenceId;
    }

    public final Boolean component30() {
        return this.isInbound;
    }

    public final long component31() {
        return this.messageTime;
    }

    public final long component32() {
        return this.sentAt;
    }

    public final long component33() {
        return this.deliveredAt;
    }

    public final long component34() {
        return this.readAt;
    }

    public final String component35() {
        return this.status;
    }

    public final String component36() {
        return this.errorMessages;
    }

    public final boolean component37() {
        return this.showSelection;
    }

    public final boolean component38() {
        return this.isSelected;
    }

    public final boolean component39() {
        return this.showDateText;
    }

    public final String component4() {
        return this.phoneNumberIdExternal;
    }

    public final boolean component40() {
        return this.isExistingId;
    }

    public final ChatMessages component41() {
        return this.replyingToMessage;
    }

    public final ChatMessages component42() {
        return this.responseMessage;
    }

    public final ArrayList<CommentSummary.MentionedEntity> component43() {
        return this.mentioned;
    }

    public final String component44() {
        return this.internalTemplateId;
    }

    public final String component45() {
        return this.externalTemplateId;
    }

    public final boolean component46() {
        return this.isPendingUpload;
    }

    public final ActionInteractive component47() {
        return this.actionInteractive;
    }

    public final LocationObject component48() {
        return this.locationObject;
    }

    public final AddressMessageParameters component49() {
        return this.adddressMessageParameters;
    }

    public final String component5() {
        return this.recipientExternalId;
    }

    public final ArrayList<Leads> component50() {
        return this.sentContacts;
    }

    public final String component51() {
        return this.referredContactId;
    }

    public final Leads component52() {
        return this.referredContact;
    }

    public final Long component53() {
        return this.updatedAt;
    }

    public final Long component54() {
        return this.createdAt;
    }

    public final String component6() {
        return this.recipientExternalIdType;
    }

    public final String component7() {
        return this.channelId;
    }

    public final String component8() {
        return this.contactId;
    }

    public final String component9() {
        return this.contactName;
    }

    public final ChatMessages copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Leads leads, String str10, String str11, String str12, String str13, List<WaButton> list, List<TemplateParameter> list2, String str14, String str15, String str16, String str17, Boolean bool, Bitmap bitmap, FileData fileData, String str18, String str19, String str20, String str21, String str22, Boolean bool2, Boolean bool3, long j, long j2, long j3, long j4, String str23, String str24, boolean z, boolean z2, boolean z3, boolean z4, ChatMessages chatMessages, ChatMessages chatMessages2, ArrayList<CommentSummary.MentionedEntity> arrayList, String str25, String str26, boolean z5, ActionInteractive actionInteractive, LocationObject locationObject, AddressMessageParameters addressMessageParameters, ArrayList<Leads> arrayList2, String str27, Leads leads2, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(list, "buttons");
        sq8.m48649h(list2, "parameters");
        sq8.m48649h(arrayList, "mentioned");
        sq8.m48649h(arrayList2, "sentContacts");
        return new ChatMessages(str, str2, str3, str4, str5, str6, str7, str8, str9, leads, str10, str11, str12, str13, list, list2, str14, str15, str16, str17, bool, bitmap, fileData, str18, str19, str20, str21, str22, bool2, bool3, j, j2, j3, j4, str23, str24, z, z2, z3, z4, chatMessages, chatMessages2, arrayList, str25, str26, z5, actionInteractive, locationObject, addressMessageParameters, arrayList2, str27, leads2, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessages)) {
            return false;
        }
        ChatMessages chatMessages = (ChatMessages) obj;
        return sq8.m48644c(this.id, chatMessages.id) && sq8.m48644c(this.messagePlatform, chatMessages.messagePlatform) && sq8.m48644c(this.externalMessageReferenceId, chatMessages.externalMessageReferenceId) && sq8.m48644c(this.phoneNumberIdExternal, chatMessages.phoneNumberIdExternal) && sq8.m48644c(this.recipientExternalId, chatMessages.recipientExternalId) && sq8.m48644c(this.recipientExternalIdType, chatMessages.recipientExternalIdType) && sq8.m48644c(this.channelId, chatMessages.channelId) && sq8.m48644c(this.contactId, chatMessages.contactId) && sq8.m48644c(this.contactName, chatMessages.contactName) && sq8.m48644c(this.contact, chatMessages.contact) && sq8.m48644c(this.messageText, chatMessages.messageText) && sq8.m48644c(this.headerText, chatMessages.headerText) && sq8.m48644c(this.headerType, chatMessages.headerType) && sq8.m48644c(this.footerText, chatMessages.footerText) && sq8.m48644c(this.buttons, chatMessages.buttons) && sq8.m48644c(this.parameters, chatMessages.parameters) && sq8.m48644c(this.messageType, chatMessages.messageType) && sq8.m48644c(this.messageSubType, chatMessages.messageSubType) && sq8.m48644c(this.followUpType, chatMessages.followUpType) && sq8.m48644c(this.messageCategory, chatMessages.messageCategory) && sq8.m48644c(this.isStarred, chatMessages.isStarred) && sq8.m48644c(this.pdfThumbnailBitmap, chatMessages.pdfThumbnailBitmap) && sq8.m48644c(this.messageFile, chatMessages.messageFile) && sq8.m48644c(this.messageUserId, chatMessages.messageUserId) && sq8.m48644c(this.messageUserName, chatMessages.messageUserName) && sq8.m48644c(this.directChatUserId, chatMessages.directChatUserId) && sq8.m48644c(this.chatUserAccountNameIfExternal, chatMessages.chatUserAccountNameIfExternal) && sq8.m48644c(this.messageUserProfile, chatMessages.messageUserProfile) && sq8.m48644c(this.sentByMe, chatMessages.sentByMe) && sq8.m48644c(this.isInbound, chatMessages.isInbound) && this.messageTime == chatMessages.messageTime && this.sentAt == chatMessages.sentAt && this.deliveredAt == chatMessages.deliveredAt && this.readAt == chatMessages.readAt && sq8.m48644c(this.status, chatMessages.status) && sq8.m48644c(this.errorMessages, chatMessages.errorMessages) && this.showSelection == chatMessages.showSelection && this.isSelected == chatMessages.isSelected && this.showDateText == chatMessages.showDateText && this.isExistingId == chatMessages.isExistingId && sq8.m48644c(this.replyingToMessage, chatMessages.replyingToMessage) && sq8.m48644c(this.responseMessage, chatMessages.responseMessage) && sq8.m48644c(this.mentioned, chatMessages.mentioned) && sq8.m48644c(this.internalTemplateId, chatMessages.internalTemplateId) && sq8.m48644c(this.externalTemplateId, chatMessages.externalTemplateId) && this.isPendingUpload == chatMessages.isPendingUpload && sq8.m48644c(this.actionInteractive, chatMessages.actionInteractive) && sq8.m48644c(this.locationObject, chatMessages.locationObject) && sq8.m48644c(this.adddressMessageParameters, chatMessages.adddressMessageParameters) && sq8.m48644c(this.sentContacts, chatMessages.sentContacts) && sq8.m48644c(this.referredContactId, chatMessages.referredContactId) && sq8.m48644c(this.referredContact, chatMessages.referredContact) && sq8.m48644c(this.updatedAt, chatMessages.updatedAt) && sq8.m48644c(this.createdAt, chatMessages.createdAt);
    }

    public final ActionInteractive getActionInteractive() {
        return this.actionInteractive;
    }

    public final AddressMessageParameters getAdddressMessageParameters() {
        return this.adddressMessageParameters;
    }

    public final List<WaButton> getButtons() {
        return this.buttons;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChatUserAccountNameIfExternal() {
        return this.chatUserAccountNameIfExternal;
    }

    public final Leads getContact() {
        return this.contact;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getContactName() {
        return this.contactName;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final long getDeliveredAt() {
        return this.deliveredAt;
    }

    public final String getDirectChatUserId() {
        return this.directChatUserId;
    }

    public final String getErrorMessages() {
        return this.errorMessages;
    }

    public final String getExternalMessageReferenceId() {
        return this.externalMessageReferenceId;
    }

    public final String getExternalTemplateId() {
        return this.externalTemplateId;
    }

    public final String getFollowUpType() {
        return this.followUpType;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getHeaderType() {
        return this.headerType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInternalTemplateId() {
        return this.internalTemplateId;
    }

    public final LocationObject getLocationObject() {
        return this.locationObject;
    }

    public final ArrayList<CommentSummary.MentionedEntity> getMentioned() {
        return this.mentioned;
    }

    public final String getMessageCategory() {
        return this.messageCategory;
    }

    public final FileData getMessageFile() {
        return this.messageFile;
    }

    public final String getMessagePlatform() {
        return this.messagePlatform;
    }

    public final String getMessageSubType() {
        return this.messageSubType;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final long getMessageTime() {
        return this.messageTime;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMessageUserId() {
        return this.messageUserId;
    }

    public final String getMessageUserName() {
        return this.messageUserName;
    }

    public final String getMessageUserProfile() {
        return this.messageUserProfile;
    }

    public final List<TemplateParameter> getParameters() {
        return this.parameters;
    }

    public final Bitmap getPdfThumbnailBitmap() {
        return this.pdfThumbnailBitmap;
    }

    public final String getPhoneNumberIdExternal() {
        return this.phoneNumberIdExternal;
    }

    public final long getReadAt() {
        return this.readAt;
    }

    public final String getRecipientExternalId() {
        return this.recipientExternalId;
    }

    public final String getRecipientExternalIdType() {
        return this.recipientExternalIdType;
    }

    public final Leads getReferredContact() {
        return this.referredContact;
    }

    public final String getReferredContactId() {
        return this.referredContactId;
    }

    public final ChatMessages getReplyingToMessage() {
        return this.replyingToMessage;
    }

    public final ChatMessages getResponseMessage() {
        return this.responseMessage;
    }

    public final long getSentAt() {
        return this.sentAt;
    }

    public final Boolean getSentByMe() {
        return this.sentByMe;
    }

    public final ArrayList<Leads> getSentContacts() {
        return this.sentContacts;
    }

    public final boolean getShowDateText() {
        return this.showDateText;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final String getStatus() {
        return this.status;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.messagePlatform;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.externalMessageReferenceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumberIdExternal;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recipientExternalId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recipientExternalIdType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channelId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contactId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contactName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Leads leads = this.contact;
        int iHashCode10 = (iHashCode9 + (leads == null ? 0 : leads.hashCode())) * 31;
        String str9 = this.messageText;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.headerText;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.headerType;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.footerText;
        int iHashCode14 = (((((iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.buttons.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        String str13 = this.messageType;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.messageSubType;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.followUpType;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.messageCategory;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.isStarred;
        int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Bitmap bitmap = this.pdfThumbnailBitmap;
        int iHashCode20 = (iHashCode19 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        FileData fileData = this.messageFile;
        int iHashCode21 = (iHashCode20 + (fileData == null ? 0 : fileData.hashCode())) * 31;
        String str17 = this.messageUserId;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.messageUserName;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.directChatUserId;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.chatUserAccountNameIfExternal;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.messageUserProfile;
        int iHashCode26 = (iHashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Boolean bool2 = this.sentByMe;
        int iHashCode27 = (iHashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isInbound;
        int iHashCode28 = (((((((((iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + Long.hashCode(this.messageTime)) * 31) + Long.hashCode(this.sentAt)) * 31) + Long.hashCode(this.deliveredAt)) * 31) + Long.hashCode(this.readAt)) * 31;
        String str22 = this.status;
        int iHashCode29 = (iHashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.errorMessages;
        int iHashCode30 = (iHashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        boolean z = this.showSelection;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode30 + i) * 31;
        boolean z2 = this.isSelected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.showDateText;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isExistingId;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        ChatMessages chatMessages = this.replyingToMessage;
        int iHashCode31 = (i8 + (chatMessages == null ? 0 : chatMessages.hashCode())) * 31;
        ChatMessages chatMessages2 = this.responseMessage;
        int iHashCode32 = (((iHashCode31 + (chatMessages2 == null ? 0 : chatMessages2.hashCode())) * 31) + this.mentioned.hashCode()) * 31;
        String str24 = this.internalTemplateId;
        int iHashCode33 = (iHashCode32 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.externalTemplateId;
        int iHashCode34 = (iHashCode33 + (str25 == null ? 0 : str25.hashCode())) * 31;
        boolean z5 = this.isPendingUpload;
        int i9 = (iHashCode34 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        ActionInteractive actionInteractive = this.actionInteractive;
        int iHashCode35 = (i9 + (actionInteractive == null ? 0 : actionInteractive.hashCode())) * 31;
        LocationObject locationObject = this.locationObject;
        int iHashCode36 = (iHashCode35 + (locationObject == null ? 0 : locationObject.hashCode())) * 31;
        AddressMessageParameters addressMessageParameters = this.adddressMessageParameters;
        int iHashCode37 = (((iHashCode36 + (addressMessageParameters == null ? 0 : addressMessageParameters.hashCode())) * 31) + this.sentContacts.hashCode()) * 31;
        String str26 = this.referredContactId;
        int iHashCode38 = (iHashCode37 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Leads leads2 = this.referredContact;
        int iHashCode39 = (iHashCode38 + (leads2 == null ? 0 : leads2.hashCode())) * 31;
        Long l = this.updatedAt;
        int iHashCode40 = (iHashCode39 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode40 + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean isExistingId() {
        return this.isExistingId;
    }

    public final Boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isPendingUpload() {
        return this.isPendingUpload;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final Boolean isStarred() {
        return this.isStarred;
    }

    public final void setActionInteractive(ActionInteractive actionInteractive) {
        this.actionInteractive = actionInteractive;
    }

    public final void setAdddressMessageParameters(AddressMessageParameters addressMessageParameters) {
        this.adddressMessageParameters = addressMessageParameters;
    }

    public final void setButtons(List<WaButton> list) {
        sq8.m48649h(list, "<set-?>");
        this.buttons = list;
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }

    public final void setChatUserAccountNameIfExternal(String str) {
        this.chatUserAccountNameIfExternal = str;
    }

    public final void setContact(Leads leads) {
        this.contact = leads;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setContactName(String str) {
        this.contactName = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setDeliveredAt(long j) {
        this.deliveredAt = j;
    }

    public final void setDirectChatUserId(String str) {
        this.directChatUserId = str;
    }

    public final void setErrorMessages(String str) {
        this.errorMessages = str;
    }

    public final void setExistingId(boolean z) {
        this.isExistingId = z;
    }

    public final void setExternalMessageReferenceId(String str) {
        this.externalMessageReferenceId = str;
    }

    public final void setExternalTemplateId(String str) {
        this.externalTemplateId = str;
    }

    public final void setFollowUpType(String str) {
        this.followUpType = str;
    }

    public final void setFooterText(String str) {
        this.footerText = str;
    }

    public final void setHeaderText(String str) {
        this.headerText = str;
    }

    public final void setHeaderType(String str) {
        this.headerType = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setInbound(Boolean bool) {
        this.isInbound = bool;
    }

    public final void setInternalTemplateId(String str) {
        this.internalTemplateId = str;
    }

    public final void setLocationObject(LocationObject locationObject) {
        this.locationObject = locationObject;
    }

    public final void setMentioned(ArrayList<CommentSummary.MentionedEntity> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.mentioned = arrayList;
    }

    public final void setMessageCategory(String str) {
        this.messageCategory = str;
    }

    public final void setMessageFile(FileData fileData) {
        this.messageFile = fileData;
    }

    public final void setMessagePlatform(String str) {
        this.messagePlatform = str;
    }

    public final void setMessageSubType(String str) {
        this.messageSubType = str;
    }

    public final void setMessageText(String str) {
        this.messageText = str;
    }

    public final void setMessageTime(long j) {
        this.messageTime = j;
    }

    public final void setMessageType(String str) {
        this.messageType = str;
    }

    public final void setMessageUserId(String str) {
        this.messageUserId = str;
    }

    public final void setMessageUserName(String str) {
        this.messageUserName = str;
    }

    public final void setMessageUserProfile(String str) {
        this.messageUserProfile = str;
    }

    public final void setParameters(List<TemplateParameter> list) {
        sq8.m48649h(list, "<set-?>");
        this.parameters = list;
    }

    public final void setPdfThumbnailBitmap(Bitmap bitmap) {
        this.pdfThumbnailBitmap = bitmap;
    }

    public final void setPendingUpload(boolean z) {
        this.isPendingUpload = z;
    }

    public final void setPhoneNumberIdExternal(String str) {
        this.phoneNumberIdExternal = str;
    }

    public final void setReadAt(long j) {
        this.readAt = j;
    }

    public final void setRecipientExternalId(String str) {
        this.recipientExternalId = str;
    }

    public final void setRecipientExternalIdType(String str) {
        this.recipientExternalIdType = str;
    }

    public final void setReferredContact(Leads leads) {
        this.referredContact = leads;
    }

    public final void setReferredContactId(String str) {
        this.referredContactId = str;
    }

    public final void setReplyingToMessage(ChatMessages chatMessages) {
        this.replyingToMessage = chatMessages;
    }

    public final void setResponseMessage(ChatMessages chatMessages) {
        this.responseMessage = chatMessages;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setSentAt(long j) {
        this.sentAt = j;
    }

    public final void setSentByMe(Boolean bool) {
        this.sentByMe = bool;
    }

    public final void setSentContacts(ArrayList<Leads> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.sentContacts = arrayList;
    }

    public final void setShowDateText(boolean z) {
        this.showDateText = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public final void setStarred(Boolean bool) {
        this.isStarred = bool;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChatMessageSummary toChatMessageSummary(ChatMessageSummary chatMessageSummary) {
        int i = 1;
        ChatMessage chatMessage = null;
        Object[] objArr = 0;
        if (chatMessageSummary == null) {
            chatMessageSummary = new ChatMessageSummary(chatMessage, i, objArr == true ? 1 : 0);
        }
        chatMessageSummary.setId(this.id);
        chatMessageSummary.setExternalMessageReferenceId(this.externalMessageReferenceId);
        chatMessageSummary.setPhoneNumberIdExternal(this.phoneNumberIdExternal);
        chatMessageSummary.setMessagePlatform(this.messagePlatform);
        chatMessageSummary.setRecipientExternalId(this.recipientExternalId);
        chatMessageSummary.setRecipientExternalIdType(this.recipientExternalIdType);
        chatMessageSummary.setContactId(this.contactId);
        Leads leads = this.contact;
        if (leads != null) {
            sq8.m48646e(leads);
            chatMessageSummary.setContact(th1.m49865q(leads, null, 1, null));
        } else {
            chatMessageSummary.setContact(null);
        }
        chatMessageSummary.setChannelId(this.channelId);
        chatMessageSummary.setText(this.messageText);
        chatMessageSummary.setHeaderText(this.headerText);
        chatMessageSummary.setFooterText(this.footerText);
        chatMessageSummary.setButtons(this.buttons);
        chatMessageSummary.setMessageType(this.messageType);
        chatMessageSummary.setFollowUpType(this.followUpType);
        chatMessageSummary.setMessageSubType(this.messageSubType);
        chatMessageSummary.setMessageCategory(this.messageCategory);
        chatMessageSummary.setStatus(this.status);
        chatMessageSummary.setErrorMessages(this.errorMessages);
        chatMessageSummary.setMedia(this.messageFile);
        chatMessageSummary.setCreatedAt(this.messageTime);
        chatMessageSummary.setMentioned(this.mentioned);
        chatMessageSummary.setExistingId(this.isExistingId);
        chatMessageSummary.setInbound(this.isInbound);
        chatMessageSummary.setChatUserId(this.messageUserId);
        ChatMessages chatMessages = this.replyingToMessage;
        chatMessageSummary.setReplyingToMessage(chatMessages != null ? toChatMessageSummary$default(chatMessages, null, 1, null) : null);
        ChatMessages chatMessages2 = this.responseMessage;
        chatMessageSummary.setResponseMessage(chatMessages2 != null ? toChatMessageSummary$default(chatMessages2, null, 1, null) : null);
        chatMessageSummary.setInternalTemplateId(this.internalTemplateId);
        chatMessageSummary.setExternalTemplateId(this.externalTemplateId);
        chatMessageSummary.setParameters(this.parameters);
        chatMessageSummary.setActionInteractive(this.actionInteractive);
        chatMessageSummary.setLocationObject(this.locationObject);
        chatMessageSummary.setDirectChatUserId(this.directChatUserId);
        chatMessageSummary.setChatUserName(this.messageUserName);
        chatMessageSummary.setChatUserAccountNameIfExternal(this.chatUserAccountNameIfExternal);
        chatMessageSummary.setReferredContactId(this.referredContactId);
        Leads leads2 = this.referredContact;
        if (leads2 != null) {
            sq8.m48646e(leads2);
            chatMessageSummary.setReferredContact(th1.m49865q(leads2, null, 1, null));
        } else {
            chatMessageSummary.setReferredContact(null);
        }
        Leads leads3 = this.referredContact;
        if (leads3 != null) {
            sq8.m48646e(leads3);
            chatMessageSummary.setReferredContact(th1.m49865q(leads3, null, 1, null));
        } else {
            chatMessageSummary.setReferredContact(null);
        }
        return chatMessageSummary;
    }

    public String toString() {
        return "ChatMessages(id=" + this.id + ", messagePlatform=" + this.messagePlatform + ", externalMessageReferenceId=" + this.externalMessageReferenceId + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", recipientExternalId=" + this.recipientExternalId + ", recipientExternalIdType=" + this.recipientExternalIdType + ", channelId=" + this.channelId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", contact=" + this.contact + ", messageText=" + this.messageText + ", headerText=" + this.headerText + ", headerType=" + this.headerType + ", footerText=" + this.footerText + ", buttons=" + this.buttons + ", parameters=" + this.parameters + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", followUpType=" + this.followUpType + ", messageCategory=" + this.messageCategory + ", isStarred=" + this.isStarred + ", pdfThumbnailBitmap=" + this.pdfThumbnailBitmap + ", messageFile=" + this.messageFile + ", messageUserId=" + this.messageUserId + ", messageUserName=" + this.messageUserName + ", directChatUserId=" + this.directChatUserId + ", chatUserAccountNameIfExternal=" + this.chatUserAccountNameIfExternal + ", messageUserProfile=" + this.messageUserProfile + ", sentByMe=" + this.sentByMe + ", isInbound=" + this.isInbound + ", messageTime=" + this.messageTime + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", status=" + this.status + ", errorMessages=" + this.errorMessages + ", showSelection=" + this.showSelection + ", isSelected=" + this.isSelected + ", showDateText=" + this.showDateText + ", isExistingId=" + this.isExistingId + ", replyingToMessage=" + this.replyingToMessage + ", responseMessage=" + this.responseMessage + ", mentioned=" + this.mentioned + ", internalTemplateId=" + this.internalTemplateId + ", externalTemplateId=" + this.externalTemplateId + ", isPendingUpload=" + this.isPendingUpload + ", actionInteractive=" + this.actionInteractive + ", locationObject=" + this.locationObject + ", adddressMessageParameters=" + this.adddressMessageParameters + ", sentContacts=" + this.sentContacts + ", referredContactId=" + this.referredContactId + ", referredContact=" + this.referredContact + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.messagePlatform);
        parcel.writeString(this.externalMessageReferenceId);
        parcel.writeString(this.phoneNumberIdExternal);
        parcel.writeString(this.recipientExternalId);
        parcel.writeString(this.recipientExternalIdType);
        parcel.writeString(this.channelId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.contactName);
        Leads leads = this.contact;
        if (leads == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leads.writeToParcel(parcel, i);
        }
        parcel.writeString(this.messageText);
        parcel.writeString(this.headerText);
        parcel.writeString(this.headerType);
        parcel.writeString(this.footerText);
        List<WaButton> list = this.buttons;
        parcel.writeInt(list.size());
        Iterator<WaButton> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<TemplateParameter> list2 = this.parameters;
        parcel.writeInt(list2.size());
        Iterator<TemplateParameter> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.messageType);
        parcel.writeString(this.messageSubType);
        parcel.writeString(this.followUpType);
        parcel.writeString(this.messageCategory);
        Boolean bool = this.isStarred;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.pdfThumbnailBitmap, i);
        FileData fileData = this.messageFile;
        if (fileData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fileData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.messageUserId);
        parcel.writeString(this.messageUserName);
        parcel.writeString(this.directChatUserId);
        parcel.writeString(this.chatUserAccountNameIfExternal);
        parcel.writeString(this.messageUserProfile);
        Boolean bool2 = this.sentByMe;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isInbound;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeLong(this.messageTime);
        parcel.writeLong(this.sentAt);
        parcel.writeLong(this.deliveredAt);
        parcel.writeLong(this.readAt);
        parcel.writeString(this.status);
        parcel.writeString(this.errorMessages);
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showDateText ? 1 : 0);
        parcel.writeInt(this.isExistingId ? 1 : 0);
        ChatMessages chatMessages = this.replyingToMessage;
        if (chatMessages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMessages.writeToParcel(parcel, i);
        }
        ChatMessages chatMessages2 = this.responseMessage;
        if (chatMessages2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMessages2.writeToParcel(parcel, i);
        }
        ArrayList<CommentSummary.MentionedEntity> arrayList = this.mentioned;
        parcel.writeInt(arrayList.size());
        Iterator<CommentSummary.MentionedEntity> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.internalTemplateId);
        parcel.writeString(this.externalTemplateId);
        parcel.writeInt(this.isPendingUpload ? 1 : 0);
        ActionInteractive actionInteractive = this.actionInteractive;
        if (actionInteractive == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionInteractive.writeToParcel(parcel, i);
        }
        LocationObject locationObject = this.locationObject;
        if (locationObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationObject.writeToParcel(parcel, i);
        }
        AddressMessageParameters addressMessageParameters = this.adddressMessageParameters;
        if (addressMessageParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressMessageParameters.writeToParcel(parcel, i);
        }
        ArrayList<Leads> arrayList2 = this.sentContacts;
        parcel.writeInt(arrayList2.size());
        Iterator<Leads> it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.referredContactId);
        Leads leads2 = this.referredContact;
        if (leads2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leads2.writeToParcel(parcel, i);
        }
        Long l = this.updatedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.createdAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public /* synthetic */ ChatMessages(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Leads leads, String str10, String str11, String str12, String str13, List list, List list2, String str14, String str15, String str16, String str17, Boolean bool, Bitmap bitmap, FileData fileData, String str18, String str19, String str20, String str21, String str22, Boolean bool2, Boolean bool3, long j, long j2, long j3, long j4, String str23, String str24, boolean z, boolean z2, boolean z3, boolean z4, ChatMessages chatMessages, ChatMessages chatMessages2, ArrayList arrayList, String str25, String str26, boolean z5, ActionInteractive actionInteractive, LocationObject locationObject, AddressMessageParameters addressMessageParameters, ArrayList arrayList2, String str27, Leads leads2, Long l, Long l2, int i, int i2, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "WHATSAPP" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : leads, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & Opcodes.ACC_ENUM) != 0 ? new ArrayList() : list, (i & 32768) != 0 ? new ArrayList() : list2, (i & 65536) != 0 ? "text" : str14, (i & Opcodes.ACC_DEPRECATED) != 0 ? null : str15, (i & 262144) != 0 ? null : str16, (i & Opcodes.ASM8) != 0 ? "external" : str17, (i & 1048576) != 0 ? Boolean.FALSE : bool, (i & 2097152) != 0 ? null : bitmap, (i & 4194304) != 0 ? null : fileData, (i & 8388608) != 0 ? null : str18, (i & 16777216) != 0 ? null : str19, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str20, (i & 67108864) != 0 ? null : str21, (i & 134217728) != 0 ? null : str22, (i & 268435456) != 0 ? Boolean.FALSE : bool2, (i & 536870912) != 0 ? Boolean.FALSE : bool3, (i & 1073741824) != 0 ? -1L : j, (i & Integer.MIN_VALUE) != 0 ? -1L : j2, (i2 & 1) != 0 ? -1L : j3, (i2 & 2) == 0 ? j4 : -1L, (i2 & 4) != 0 ? null : str23, (i2 & 8) != 0 ? null : str24, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? null : chatMessages, (i2 & 512) != 0 ? null : chatMessages2, (i2 & 1024) != 0 ? new ArrayList() : arrayList, (i2 & 2048) != 0 ? null : str25, (i2 & 4096) != 0 ? null : str26, (i2 & 8192) == 0 ? z5 : false, (i2 & Opcodes.ACC_ENUM) != 0 ? null : actionInteractive, (i2 & 32768) != 0 ? null : locationObject, (i2 & 65536) != 0 ? null : addressMessageParameters, (i2 & Opcodes.ACC_DEPRECATED) != 0 ? new ArrayList() : arrayList2, (i2 & 262144) != 0 ? null : str27, (i2 & Opcodes.ASM8) != 0 ? null : leads2, (i2 & 1048576) != 0 ? null : l, (i2 & 2097152) != 0 ? null : l2);
    }

    public ChatMessages(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Leads leads, String str10, String str11, String str12, String str13, List<WaButton> list, List<TemplateParameter> list2, String str14, String str15, String str16, String str17, Boolean bool, Bitmap bitmap, FileData fileData, String str18, String str19, String str20, String str21, String str22, Boolean bool2, Boolean bool3, long j, long j2, long j3, long j4, String str23, String str24, boolean z, boolean z2, boolean z3, boolean z4, ChatMessages chatMessages, ChatMessages chatMessages2, ArrayList<CommentSummary.MentionedEntity> arrayList, String str25, String str26, boolean z5, ActionInteractive actionInteractive, LocationObject locationObject, AddressMessageParameters addressMessageParameters, ArrayList<Leads> arrayList2, String str27, Leads leads2, Long l, Long l2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(list, "buttons");
        sq8.m48649h(list2, "parameters");
        sq8.m48649h(arrayList, "mentioned");
        sq8.m48649h(arrayList2, "sentContacts");
        this.id = str;
        this.messagePlatform = str2;
        this.externalMessageReferenceId = str3;
        this.phoneNumberIdExternal = str4;
        this.recipientExternalId = str5;
        this.recipientExternalIdType = str6;
        this.channelId = str7;
        this.contactId = str8;
        this.contactName = str9;
        this.contact = leads;
        this.messageText = str10;
        this.headerText = str11;
        this.headerType = str12;
        this.footerText = str13;
        this.buttons = list;
        this.parameters = list2;
        this.messageType = str14;
        this.messageSubType = str15;
        this.followUpType = str16;
        this.messageCategory = str17;
        this.isStarred = bool;
        this.pdfThumbnailBitmap = bitmap;
        this.messageFile = fileData;
        this.messageUserId = str18;
        this.messageUserName = str19;
        this.directChatUserId = str20;
        this.chatUserAccountNameIfExternal = str21;
        this.messageUserProfile = str22;
        this.sentByMe = bool2;
        this.isInbound = bool3;
        this.messageTime = j;
        this.sentAt = j2;
        this.deliveredAt = j3;
        this.readAt = j4;
        this.status = str23;
        this.errorMessages = str24;
        this.showSelection = z;
        this.isSelected = z2;
        this.showDateText = z3;
        this.isExistingId = z4;
        this.replyingToMessage = chatMessages;
        this.responseMessage = chatMessages2;
        this.mentioned = arrayList;
        this.internalTemplateId = str25;
        this.externalTemplateId = str26;
        this.isPendingUpload = z5;
        this.actionInteractive = actionInteractive;
        this.locationObject = locationObject;
        this.adddressMessageParameters = addressMessageParameters;
        this.sentContacts = arrayList2;
        this.referredContactId = str27;
        this.referredContact = leads2;
        this.updatedAt = l;
        this.createdAt = l2;
    }
}
