package ai.salesmax.model;

import ai.salesmax.model.ChatMessageSummary;
import ai.salesmax.model.CommentSummary;
import android.net.Uri;
import com.amplifyframework.datastore.generated.model.ActionInteractive;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.MentionedEntities;
import com.amplifyframework.datastore.generated.model.SectionInteractive;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.a81;
import p001o.ch3;
import p001o.dh3;
import p001o.f9g;
import p001o.id5;
import p001o.ja8;
import p001o.kf9;
import p001o.kh3;
import p001o.lpi;
import p001o.ryh;
import p001o.sq8;
import p001o.uni;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary {
    private boolean isExistingId;
    private ChatMessage underlyingChatMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final ChatMessage newInstance() {
            ChatMessage chatMessageBuild = ChatMessage.builder().accountId("").id("").build();
            sq8.m48648g(chatMessageBuild, "build(...)");
            return chatMessageBuild;
        }
    }

    /* renamed from: ai.salesmax.model.ChatMessageSummary$toChatMessages$1 */
    public static final class C01031 extends kf9 implements xk7 {
        public static final C01031 INSTANCE = new C01031();

        public C01031() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(ryh ryhVar) {
            return (String) ryhVar.f44266b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaButton _get_buttons_$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (WaButton) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_chatUser_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_deliveredAt_$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommentSummary.MentionedEntity _get_mentioned_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (CommentSummary.MentionedEntity) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemplateParameter _get_parameters_$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (TemplateParameter) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_readAt_$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_sentAt_$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$16(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.amplifyframework.datastore.generated.model.WaButton _set_buttons_$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (com.amplifyframework.datastore.generated.model.WaButton) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MentionedEntities _set_mentioned_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (MentionedEntities) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.amplifyframework.datastore.generated.model.TemplateParameter _set_parameters_$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (com.amplifyframework.datastore.generated.model.TemplateParameter) xk7Var.invoke(obj);
    }

    private final FileData getFileData(String str) {
        FileData fileData;
        String str2 = null;
        FileData fileData2 = new FileData(0, null, null, null, str, null, false, false, false, null, null, null, null, null, str2, str2, null, null, null, false, null, null, null, null, null, null, null, null, 268435439, null);
        String filenameFromURL = getFilenameFromURL(Uri.parse(str));
        if (filenameFromURL == null) {
            filenameFromURL = TransferTable.COLUMN_FILE;
        }
        List listD0 = f9g.D0(filenameFromURL, new String[]{"."}, true, 0, 4, null);
        if (listD0.size() > 1) {
            fileData = fileData2;
            fileData.setMimeType((String) listD0.get(1));
        } else {
            fileData = fileData2;
        }
        if (!listD0.isEmpty()) {
            fileData.setFileName((String) listD0.get(0));
        }
        fileData.setSuccess(true);
        fileData.setUploaded(true);
        return fileData;
    }

    private final String getFilenameFromURL(Uri uri) {
        return new File(String.valueOf(uri.getPath())).getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toChatMessages$lambda$19(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final com.amplifyframework.datastore.generated.model.ActionInteractive convertToJavaActionInteractive(ActionInteractive actionInteractive) {
        sq8.m48649h(actionInteractive, "kotlinAction");
        ActionInteractive.BuildStep buildStepButton = com.amplifyframework.datastore.generated.model.ActionInteractive.builder().actionName(actionInteractive.getActionName()).displayText(actionInteractive.getDisplay_text()).ctaUrl(actionInteractive.getCtaUrl()).addressCountry(actionInteractive.getAddressCountry()).savedAddresses(actionInteractive.getSavedAddresses()).button(actionInteractive.getButton());
        List<ReplyButton> buttons = actionInteractive.getButtons();
        ArrayList arrayList = new ArrayList(dh3.m23088v(buttons, 10));
        for (ReplyButton replyButton : buttons) {
            arrayList.add(com.amplifyframework.datastore.generated.model.ReplyButton.builder().typeReply(replyButton.getTypeReply()).titleReply(replyButton.getTitleReply()).idReply(replyButton.getIdReply()).build());
        }
        ActionInteractive.BuildStep buildStepProductRetailerId = buildStepButton.buttons(arrayList).catalogId(actionInteractive.getCatalog_id()).productRetailerId(actionInteractive.getProduct_retailer_id());
        List<SectionInteractive> sections = actionInteractive.getSections();
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(sections, 10));
        for (SectionInteractive sectionInteractive : sections) {
            SectionInteractive.BuildStep buildStepSectionTitle = com.amplifyframework.datastore.generated.model.SectionInteractive.builder().sectionTitle(sectionInteractive.getSectionTitle());
            List<ProductWa> sectionProductItems = sectionInteractive.getSectionProductItems();
            ArrayList arrayList3 = new ArrayList(dh3.m23088v(sectionProductItems, 10));
            Iterator<T> it = sectionProductItems.iterator();
            while (it.hasNext()) {
                arrayList3.add(com.amplifyframework.datastore.generated.model.ProductWa.builder().productRetailerId(((ProductWa) it.next()).getProduct_retailer_id()).build());
            }
            SectionInteractive.BuildStep buildStepSectionProductItems = buildStepSectionTitle.sectionProductItems(arrayList3);
            List<SectionRow> sectionRows = sectionInteractive.getSectionRows();
            ArrayList arrayList4 = new ArrayList(dh3.m23088v(sectionRows, 10));
            for (SectionRow sectionRow : sectionRows) {
                arrayList4.add(com.amplifyframework.datastore.generated.model.SectionRow.builder().sectionRowId(sectionRow.getSectionRowId()).sectionRowTitle(sectionRow.getSectionRowTitle()).sectionRowDescription(sectionRow.getSectionRowDescription()).build());
            }
            arrayList2.add(buildStepSectionProductItems.sectionRows(arrayList4).build());
        }
        ActionInteractive.BuildStep buildStepFlowAction = buildStepProductRetailerId.sections(arrayList2).flowMode(actionInteractive.getFlow_mode()).flowMessageVersion(actionInteractive.getFlow_message_version()).flowToken(actionInteractive.getFlow_token()).flowId(actionInteractive.getFlow_id()).flowCta(actionInteractive.getFlow_cta()).flowAction(actionInteractive.getFlow_action());
        FlowActionPayload flow_action_payload = actionInteractive.getFlow_action_payload();
        com.amplifyframework.datastore.generated.model.ActionInteractive actionInteractiveBuild = buildStepFlowAction.flowActionPayload(flow_action_payload != null ? com.amplifyframework.datastore.generated.model.FlowActionPayload.builder().screen(flow_action_payload.getScreen()).flowData(flow_action_payload.getFlowData()).build() : null).build();
        sq8.m48648g(actionInteractiveBuild, "build(...)");
        return actionInteractiveBuild;
    }

    public final String getAccountId() {
        return this.underlyingChatMessage.getAccountId();
    }

    public final ActionInteractive getActionInteractive() {
        com.amplifyframework.datastore.generated.model.ActionInteractive actionInteractive = this.underlyingChatMessage.getActionInteractive();
        sq8.m48648g(actionInteractive, "getActionInteractive(...)");
        return (ActionInteractive) Optional.ofNullable(ActionInteractiveKt.convertToKotlinActionInteractive(actionInteractive)).orElse(null);
    }

    public final List<WaButton> getButtons() {
        List<com.amplifyframework.datastore.generated.model.WaButton> buttons = this.underlyingChatMessage.getButtons();
        List listQ0 = buttons != null ? kh3.Q0(buttons) : null;
        if (listQ0 == null) {
            listQ0 = ch3.m21246k();
        }
        Stream stream = listQ0.stream();
        final ChatMessageSummary$buttons$1 chatMessageSummary$buttons$1 = ChatMessageSummary$buttons$1.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: o.zo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_buttons_$lambda$8(chatMessageSummary$buttons$1, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final ChatChannelSummary getChannel() {
        com.amplifyframework.datastore.generated.model.ChatChannel channel = this.underlyingChatMessage.getChannel();
        if (channel != null) {
            return new ChatChannelSummary(channel);
        }
        return null;
    }

    public final String getChannelId() {
        com.amplifyframework.datastore.generated.model.ChatChannel channel = this.underlyingChatMessage.getChannel();
        if (channel != null) {
            return channel.getId();
        }
        return null;
    }

    public final LeadsUser getChatUser() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMessage.getChatUser());
        final ChatMessageSummary$chatUser$1 chatMessageSummary$chatUser$1 = ChatMessageSummary$chatUser$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.so2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_chatUser_$lambda$5(chatMessageSummary$chatUser$1, obj);
            }
        }).orElse(lpi.a0(this.underlyingChatMessage.getChatUserId()));
    }

    public final String getChatUserAccountNameIfExternal() {
        return this.underlyingChatMessage.getChatUserAccountNameIfExternal();
    }

    public final String getChatUserId() {
        return this.underlyingChatMessage.getChatUserId();
    }

    public final String getChatUserName() {
        return this.underlyingChatMessage.getChatUserName();
    }

    public final LeadsSummary getContact() {
        Contact contact = this.underlyingChatMessage.getContact();
        if (contact != null) {
            return new LeadsSummary(contact);
        }
        return null;
    }

    public final String getContactId() {
        Contact contact = this.underlyingChatMessage.getContact();
        if (contact != null) {
            return contact.getId();
        }
        return null;
    }

    public final long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMessage.getCreatedAt());
        final ChatMessageSummary$createdAt$1 chatMessageSummary$createdAt$1 = ChatMessageSummary$createdAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.to2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_createdAt_$lambda$12(chatMessageSummary$createdAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final long getDeliveredAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMessage.getDeliveredAt());
        final ChatMessageSummary$deliveredAt$1 chatMessageSummary$deliveredAt$1 = ChatMessageSummary$deliveredAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.bp2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_deliveredAt_$lambda$14(chatMessageSummary$deliveredAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getDirectChatUserId() {
        return this.underlyingChatMessage.getDirectChatUserId();
    }

    public final String getErrorMessages() {
        return this.underlyingChatMessage.getErrorMessages();
    }

    public final String getExternalMessageReferenceId() {
        return this.underlyingChatMessage.getExternalMessageReferenceId();
    }

    public final String getExternalTemplateId() {
        return this.underlyingChatMessage.getExternalTemplateId();
    }

    public final String getFollowUpType() {
        return this.underlyingChatMessage.getFollowUpType();
    }

    public final String getFooterText() {
        return this.underlyingChatMessage.getFooterText();
    }

    public final Boolean getHasImage() {
        return this.underlyingChatMessage.getHasImage();
    }

    public final String getHeaderText() {
        return this.underlyingChatMessage.getHeaderText();
    }

    public final String getHeaderType() {
        return this.underlyingChatMessage.getHeaderType();
    }

    public final String getId() {
        String id = this.underlyingChatMessage.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getInternalTemplateId() {
        return this.underlyingChatMessage.getInternalTemplateId();
    }

    public final LocationObject getLocationObject() {
        return (LocationObject) ja8.f30035c.fromJson(this.underlyingChatMessage.getLocationObjectToSend(), LocationObject.class);
    }

    public final FileData getMedia() {
        UploadedFile media = this.underlyingChatMessage.getMedia();
        Uri uri = null;
        if (media == null) {
            return null;
        }
        int i = 0;
        String fileUrl = media.getFileUrl();
        if (fileUrl != null) {
            sq8.m48646e(fileUrl);
            uri = Uri.parse(fileUrl);
        }
        Uri uri2 = uri;
        String fileName = media.getFileName();
        String str = fileName == null ? "" : fileName;
        String fileMimeType = media.getFileMimeType();
        String str2 = fileMimeType == null ? "" : fileMimeType;
        String fileUrl2 = media.getFileUrl();
        String str3 = fileUrl2 == null ? "" : fileUrl2;
        String fileThumbnailUrl = media.getFileThumbnailUrl();
        String str4 = fileThumbnailUrl == null ? "" : fileThumbnailUrl;
        String id = media.getId();
        return new FileData(i, uri2, str, str2, str3, str4, !(id == null || f9g.d0(id)), true, true, media.getId(), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 268434432, null);
    }

    public final String getMediaMetadata() {
        return this.underlyingChatMessage.getMediaMetadata();
    }

    public final List<CommentSummary.MentionedEntity> getMentioned() {
        Stream stream = ((List) Optional.ofNullable(this.underlyingChatMessage.getMentioned()).orElse(ch3.m21246k())).stream();
        final ChatMessageSummary$mentioned$1 chatMessageSummary$mentioned$1 = ChatMessageSummary$mentioned$1.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: o.cp2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_mentioned_$lambda$6(chatMessageSummary$mentioned$1, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final String getMessageCategory() {
        return this.underlyingChatMessage.getMessageCategory();
    }

    public final String getMessageCreatedBy() {
        return this.underlyingChatMessage.getChatUserId();
    }

    public final String getMessagePlatform() {
        return this.underlyingChatMessage.getMessagePlatform();
    }

    public final String getMessageSubType() {
        return this.underlyingChatMessage.getMessageSubType();
    }

    public final String getMessageType() {
        return this.underlyingChatMessage.getMessageType();
    }

    public final List<TemplateParameter> getParameters() {
        List<com.amplifyframework.datastore.generated.model.TemplateParameter> parameters = this.underlyingChatMessage.getParameters();
        List listQ0 = parameters != null ? kh3.Q0(parameters) : null;
        if (listQ0 == null) {
            listQ0 = ch3.m21246k();
        }
        Stream stream = listQ0.stream();
        final ChatMessageSummary$parameters$1 chatMessageSummary$parameters$1 = ChatMessageSummary$parameters$1.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: o.ep2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_parameters_$lambda$10(chatMessageSummary$parameters$1, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final String getPhoneNumberIdExternal() {
        return this.underlyingChatMessage.getPhoneNumberIdExternal();
    }

    public final String getPrimaryTeamId() {
        return this.underlyingChatMessage.getPrimaryTeamId();
    }

    public final long getReadAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMessage.getReadAt());
        final ChatMessageSummary$readAt$1 chatMessageSummary$readAt$1 = ChatMessageSummary$readAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.uo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_readAt_$lambda$15(chatMessageSummary$readAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getRecipientExternalId() {
        return this.underlyingChatMessage.getRecipientExternalId();
    }

    public final String getRecipientExternalIdType() {
        com.amplifyframework.datastore.generated.model.ChatChannel channel = this.underlyingChatMessage.getChannel();
        if (channel != null) {
            return channel.getRecipientExternalIdType();
        }
        return null;
    }

    public final LeadsSummary getReferredContact() {
        Contact referredContact = this.underlyingChatMessage.getReferredContact();
        if (referredContact != null) {
            return new LeadsSummary(referredContact);
        }
        return null;
    }

    public final String getReferredContactId() {
        Contact referredContact = this.underlyingChatMessage.getReferredContact();
        if (referredContact != null) {
            return referredContact.getId();
        }
        return null;
    }

    public final ChatMessageSummary getReplyingToMessage() {
        ChatMessage replyingToMessage = this.underlyingChatMessage.getReplyingToMessage();
        if (replyingToMessage != null) {
            return new ChatMessageSummary(replyingToMessage);
        }
        return null;
    }

    public final String getReplyingToMessageId() {
        return this.underlyingChatMessage.getReplyingToMessageId();
    }

    public final String getReplyingToMessageIdExternal() {
        return this.underlyingChatMessage.getReplyingToMessageIdExternal();
    }

    public final ChatMessageSummary getResponseMessage() {
        ChatMessage responseMessage = this.underlyingChatMessage.getResponseMessage();
        if (responseMessage != null) {
            return new ChatMessageSummary(responseMessage);
        }
        return null;
    }

    public final long getSentAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMessage.getSentAt());
        final ChatMessageSummary$sentAt$1 chatMessageSummary$sentAt$1 = ChatMessageSummary$sentAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.vo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_sentAt_$lambda$13(chatMessageSummary$sentAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getStatus() {
        return this.underlyingChatMessage.getStatus();
    }

    public final String getText() {
        return this.underlyingChatMessage.getText();
    }

    public final String getThumbnailUrl() {
        return this.underlyingChatMessage.getThumbnailUrl();
    }

    public final ChatMessage getUnderlyingChatMessage() {
        return this.underlyingChatMessage;
    }

    public final long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingChatMessage.getUpdatedAt());
        final ChatMessageSummary$updatedAt$1 chatMessageSummary$updatedAt$1 = ChatMessageSummary$updatedAt$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.wo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._get_updatedAt_$lambda$16(chatMessageSummary$updatedAt$1, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final boolean isExistingId() {
        return this.isExistingId;
    }

    public final Boolean isInbound() {
        return this.underlyingChatMessage.getIsInbound();
    }

    public final Boolean isStarred() {
        return this.underlyingChatMessage.getIsStarred();
    }

    public final void setAccountId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().accountId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setActionInteractive(ActionInteractive actionInteractive) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().actionInteractive(actionInteractive != null ? convertToJavaActionInteractive(actionInteractive) : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setButtons(List<WaButton> list) {
        sq8.m48649h(list, "value");
        Stream<WaButton> stream = list.stream();
        final ChatMessageSummary$buttons$waButtons$1 chatMessageSummary$buttons$waButtons$1 = ChatMessageSummary$buttons$waButtons$1.INSTANCE;
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().buttons((List<com.amplifyframework.datastore.generated.model.WaButton>) stream.map(new Function() { // from class: o.yo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._set_buttons_$lambda$9(chatMessageSummary$buttons$waButtons$1, obj);
            }
        }).collect(Collectors.toList())).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setChannel(ChatChannelSummary chatChannelSummary) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().channel(chatChannelSummary != null ? chatChannelSummary.getUnderlyingChatChannel() : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setChannelId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().channel(com.amplifyframework.datastore.generated.model.ChatChannel.justId(str)).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setChatUser(LeadsUser leadsUser) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().chatUserId(leadsUser != null ? leadsUser.getId() : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setChatUserAccountNameIfExternal(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().chatUserAccountNameIfExternal(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setChatUserId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().chatUserId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setChatUserName(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().chatUserName(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setContact(LeadsSummary leadsSummary) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().contact(leadsSummary != null ? leadsSummary.getUnderlyingContact() : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setContactId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().contact(Contact.justId(str)).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setCreatedAt(long j) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().createdAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setDeliveredAt(long j) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().deliveredAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setDirectChatUserId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().directChatUserId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setErrorMessages(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().errorMessages(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setExistingId(boolean z) {
        this.isExistingId = z;
    }

    public final void setExternalMessageReferenceId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().externalMessageReferenceId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setExternalTemplateId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().externalTemplateId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setFollowUpType(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().followUpType(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setFooterText(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().footerText(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setHasImage(Boolean bool) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().hasImage(bool).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setHeaderText(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().headerText(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setHeaderType(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().headerType(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().id(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setInbound(Boolean bool) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().isInbound(bool).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setInternalTemplateId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().internalTemplateId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setLocationObject(LocationObject locationObject) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().locationObjectToSend(ja8.f30035c.toJson(locationObject)).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMedia(FileData fileData) {
        UploadedFileSummary uploadedFileSummary$default;
        ChatMessage.CopyOfBuilder copyOfBuilder = this.underlyingChatMessage.copyOfBuilder();
        UploadedFile underlyingUploadedFile = null;
        if (fileData != null && (uploadedFileSummary$default = FileData.toUploadedFileSummary$default(fileData, null, 1, null)) != null) {
            underlyingUploadedFile = uploadedFileSummary$default.getUnderlyingUploadedFile();
        }
        ChatMessage chatMessageBuild = copyOfBuilder.media(underlyingUploadedFile).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMediaMetadata(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().mediaMetadata(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMentioned(List<CommentSummary.MentionedEntity> list) {
        sq8.m48649h(list, "value");
        Stream<CommentSummary.MentionedEntity> stream = list.stream();
        final ChatMessageSummary$mentioned$mentionedEntities$1 chatMessageSummary$mentioned$mentionedEntities$1 = ChatMessageSummary$mentioned$mentionedEntities$1.INSTANCE;
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().mentioned((List<MentionedEntities>) stream.map(new Function() { // from class: o.dp2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._set_mentioned_$lambda$7(chatMessageSummary$mentioned$mentionedEntities$1, obj);
            }
        }).collect(Collectors.toList())).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMessageCategory(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().messageCategory(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMessagePlatform(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().messagePlatform(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMessageSubType(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().messageSubType(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setMessageType(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().messageType(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setParameters(List<TemplateParameter> list) {
        sq8.m48649h(list, "value");
        Stream<TemplateParameter> stream = list.stream();
        final ChatMessageSummary$parameters$templateParameters$1 chatMessageSummary$parameters$templateParameters$1 = ChatMessageSummary$parameters$templateParameters$1.INSTANCE;
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().parameters((List<com.amplifyframework.datastore.generated.model.TemplateParameter>) stream.map(new Function() { // from class: o.xo2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary._set_parameters_$lambda$11(chatMessageSummary$parameters$templateParameters$1, obj);
            }
        }).collect(Collectors.toList())).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setPhoneNumberIdExternal(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().phoneNumberIdExternal(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setPrimaryTeamId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().primaryTeamId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setReadAt(long j) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().readAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setRecipientExternalId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().recipientExternalId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setRecipientExternalIdType(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().recipientExternalIdType(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setReferredContact(LeadsSummary leadsSummary) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().referredContact(leadsSummary != null ? leadsSummary.getUnderlyingContact() : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setReferredContactId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().referredContact(Contact.justId(str)).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setReplyingToMessage(ChatMessageSummary chatMessageSummary) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().replyingToMessageId(chatMessageSummary != null ? chatMessageSummary.getId() : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setReplyingToMessageId(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().replyingToMessageId(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setReplyingToMessageIdExternal(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().replyingToMessageIdExternal(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setResponseMessage(ChatMessageSummary chatMessageSummary) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().responseMessageId(chatMessageSummary != null ? chatMessageSummary.getId() : null).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setSentAt(long j) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().sentAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setStarred(Boolean bool) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().isStarred(bool).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setStatus(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().status(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setText(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().text(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setThumbnailUrl(String str) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().thumbnailUrl(str).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    public final void setUnderlyingChatMessage(ChatMessage chatMessage) {
        sq8.m48649h(chatMessage, "<set-?>");
        this.underlyingChatMessage = chatMessage;
    }

    public final void setUpdatedAt(long j) {
        ChatMessage chatMessageBuild = this.underlyingChatMessage.copyOfBuilder().updatedAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(chatMessageBuild, "build(...)");
        this.underlyingChatMessage = chatMessageBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChatMessages toChatMessages() {
        List list = null;
        ChatMessages chatMessages = new ChatMessages(null, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, list, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, null, null, false, false, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 4194303, null);
        chatMessages.setId(getId());
        chatMessages.setContactId(getContactId());
        chatMessages.setExternalMessageReferenceId(getExternalMessageReferenceId());
        chatMessages.setMessagePlatform(getMessagePlatform());
        chatMessages.setRecipientExternalId(getRecipientExternalId());
        chatMessages.setRecipientExternalIdType(getRecipientExternalIdType());
        if (getContact() != null) {
            LeadsSummary contact = getContact();
            String name = contact != null ? contact.getName() : null;
            if (name == null) {
                name = "";
            }
            chatMessages.setContactName(name);
            LeadsSummary contact2 = getContact();
            chatMessages.setContact(contact2 != null ? contact2.toLeads() : null);
        } else {
            chatMessages.setContactName(null);
            chatMessages.setContact(null);
        }
        chatMessages.setChannelId(getChannelId());
        chatMessages.setMessageType(getMessageType());
        chatMessages.setFollowUpType(getFollowUpType());
        chatMessages.setMessageCategory(getMessageCategory());
        chatMessages.setStarred(isStarred());
        chatMessages.setMessageText(getText());
        chatMessages.setHeaderText(getHeaderText());
        chatMessages.setHeaderType(getHeaderType());
        chatMessages.setFooterText(getFooterText());
        chatMessages.setMessageTime(getCreatedAt());
        chatMessages.setSentAt(getSentAt());
        chatMessages.setDeliveredAt(getDeliveredAt());
        chatMessages.setReadAt(getReadAt());
        chatMessages.setMessageFile(getMedia());
        chatMessages.setStatus(getStatus());
        chatMessages.setErrorMessages(getErrorMessages());
        chatMessages.setInbound(isInbound());
        String messageCreatedBy = getMessageCreatedBy();
        Optional optionalYB = uni.YB();
        final C01031 c01031 = C01031.INSTANCE;
        chatMessages.setSentByMe(Boolean.valueOf(sq8.m48644c(messageCreatedBy, optionalYB.map(new Function() { // from class: o.ap2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary.toChatMessages$lambda$19(c01031, obj);
            }
        }).orElse(""))));
        chatMessages.setExistingId(this.isExistingId);
        chatMessages.setCreatedAt(Long.valueOf(getCreatedAt()));
        chatMessages.setUpdatedAt(Long.valueOf(getUpdatedAt()));
        chatMessages.setMessageUserId(getChatUserId());
        chatMessages.setDirectChatUserId(getDirectChatUserId());
        chatMessages.setMessageUserName(getChatUserName());
        chatMessages.setChatUserAccountNameIfExternal(getChatUserAccountNameIfExternal());
        LeadsUser chatUser = getChatUser();
        chatMessages.setMessageUserProfile(chatUser != null ? chatUser.getProfilePic() : null);
        ChatMessageSummary replyingToMessage = getReplyingToMessage();
        chatMessages.setReplyingToMessage(replyingToMessage != null ? replyingToMessage.toChatMessages() : null);
        ChatMessageSummary responseMessage = getResponseMessage();
        chatMessages.setResponseMessage(responseMessage != null ? responseMessage.toChatMessages() : null);
        chatMessages.setInternalTemplateId(getInternalTemplateId());
        chatMessages.setExternalTemplateId(getExternalTemplateId());
        chatMessages.setButtons(getButtons());
        chatMessages.setParameters(getParameters());
        chatMessages.setLocationObject(getLocationObject());
        chatMessages.setReferredContactId(getReferredContactId());
        if (getReferredContact() != null) {
            LeadsSummary referredContact = getReferredContact();
            chatMessages.setReferredContact(referredContact != null ? referredContact.toLeads() : null);
        } else {
            chatMessages.setReferredContact(null);
        }
        return chatMessages;
    }

    public ChatMessageSummary(ChatMessage chatMessage) {
        sq8.m48649h(chatMessage, "underlyingChatMessage");
        this.underlyingChatMessage = chatMessage;
        this.isExistingId = true;
    }

    public /* synthetic */ ChatMessageSummary(ChatMessage chatMessage, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : chatMessage);
    }
}
