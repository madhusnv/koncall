package ai.salesmax.model;

import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CustomizedMessage {
    public static final int $stable = 8;
    private Leads contact;
    private String customBody;
    private String customTitle;
    private String engagementSource;
    private List<FileData> fileList;
    private FileData messageFile;
    private String selectedChannel;
    private boolean sendTrackingLink;
    private String templateId;
    private String templateTitle;

    public CustomizedMessage() {
        this(null, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    public static /* synthetic */ ChatMessages toChatMessages$default(CustomizedMessage customizedMessage, ChatMessages chatMessages, int i, Object obj) {
        if ((i & 1) != 0) {
            chatMessages = null;
        }
        return customizedMessage.toChatMessages(chatMessages);
    }

    public final Leads component1() {
        return this.contact;
    }

    public final String component10() {
        return this.engagementSource;
    }

    public final String component2() {
        return this.templateId;
    }

    public final String component3() {
        return this.templateTitle;
    }

    public final List<FileData> component4() {
        return this.fileList;
    }

    public final FileData component5() {
        return this.messageFile;
    }

    public final String component6() {
        return this.customTitle;
    }

    public final String component7() {
        return this.customBody;
    }

    public final boolean component8() {
        return this.sendTrackingLink;
    }

    public final String component9() {
        return this.selectedChannel;
    }

    public final CustomizedMessage copy(Leads leads, String str, String str2, List<FileData> list, FileData fileData, String str3, String str4, boolean z, String str5, String str6) {
        sq8.m48649h(list, "fileList");
        sq8.m48649h(str3, "customTitle");
        sq8.m48649h(str4, "customBody");
        sq8.m48649h(str5, "selectedChannel");
        sq8.m48649h(str6, "engagementSource");
        return new CustomizedMessage(leads, str, str2, list, fileData, str3, str4, z, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizedMessage)) {
            return false;
        }
        CustomizedMessage customizedMessage = (CustomizedMessage) obj;
        return sq8.m48644c(this.contact, customizedMessage.contact) && sq8.m48644c(this.templateId, customizedMessage.templateId) && sq8.m48644c(this.templateTitle, customizedMessage.templateTitle) && sq8.m48644c(this.fileList, customizedMessage.fileList) && sq8.m48644c(this.messageFile, customizedMessage.messageFile) && sq8.m48644c(this.customTitle, customizedMessage.customTitle) && sq8.m48644c(this.customBody, customizedMessage.customBody) && this.sendTrackingLink == customizedMessage.sendTrackingLink && sq8.m48644c(this.selectedChannel, customizedMessage.selectedChannel) && sq8.m48644c(this.engagementSource, customizedMessage.engagementSource);
    }

    public final Leads getContact() {
        return this.contact;
    }

    public final String getCustomBody() {
        return this.customBody;
    }

    public final String getCustomTitle() {
        return this.customTitle;
    }

    public final String getEngagementSource() {
        return this.engagementSource;
    }

    public final List<FileData> getFileList() {
        return this.fileList;
    }

    public final FileData getMessageFile() {
        return this.messageFile;
    }

    public final String getSelectedChannel() {
        return this.selectedChannel;
    }

    public final boolean getSendTrackingLink() {
        return this.sendTrackingLink;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Leads leads = this.contact;
        int iHashCode = (leads == null ? 0 : leads.hashCode()) * 31;
        String str = this.templateId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.templateTitle;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fileList.hashCode()) * 31;
        FileData fileData = this.messageFile;
        int iHashCode4 = (((((iHashCode3 + (fileData != null ? fileData.hashCode() : 0)) * 31) + this.customTitle.hashCode()) * 31) + this.customBody.hashCode()) * 31;
        boolean z = this.sendTrackingLink;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((iHashCode4 + i) * 31) + this.selectedChannel.hashCode()) * 31) + this.engagementSource.hashCode();
    }

    public final void setContact(Leads leads) {
        this.contact = leads;
    }

    public final void setCustomBody(String str) {
        sq8.m48649h(str, "<set-?>");
        this.customBody = str;
    }

    public final void setCustomTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.customTitle = str;
    }

    public final void setEngagementSource(String str) {
        sq8.m48649h(str, "<set-?>");
        this.engagementSource = str;
    }

    public final void setFileList(List<FileData> list) {
        sq8.m48649h(list, "<set-?>");
        this.fileList = list;
    }

    public final void setMessageFile(FileData fileData) {
        this.messageFile = fileData;
    }

    public final void setSelectedChannel(String str) {
        sq8.m48649h(str, "<set-?>");
        this.selectedChannel = str;
    }

    public final void setSendTrackingLink(boolean z) {
        this.sendTrackingLink = z;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateTitle(String str) {
        this.templateTitle = str;
    }

    public final ChatMessages toChatMessages(ChatMessages chatMessages) {
        ChatMessages chatMessages2 = chatMessages == null ? new ChatMessages(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, null, null, false, false, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 4194303, null) : chatMessages;
        if (this.customTitle.length() > 0) {
            chatMessages2.setMessageText(this.customTitle + "\n" + this.customBody);
        }
        if (this.fileList.size() == 1 && !this.sendTrackingLink) {
            chatMessages2.setMessageFile(this.fileList.get(0));
        }
        return chatMessages2;
    }

    public String toString() {
        return "CustomizedMessage(contact=" + this.contact + ", templateId=" + this.templateId + ", templateTitle=" + this.templateTitle + ", fileList=" + this.fileList + ", messageFile=" + this.messageFile + ", customTitle=" + this.customTitle + ", customBody=" + this.customBody + ", sendTrackingLink=" + this.sendTrackingLink + ", selectedChannel=" + this.selectedChannel + ", engagementSource=" + this.engagementSource + ")";
    }

    public CustomizedMessage(Leads leads, String str, String str2, List<FileData> list, FileData fileData, String str3, String str4, boolean z, String str5, String str6) {
        sq8.m48649h(list, "fileList");
        sq8.m48649h(str3, "customTitle");
        sq8.m48649h(str4, "customBody");
        sq8.m48649h(str5, "selectedChannel");
        sq8.m48649h(str6, "engagementSource");
        this.contact = leads;
        this.templateId = str;
        this.templateTitle = str2;
        this.fileList = list;
        this.messageFile = fileData;
        this.customTitle = str3;
        this.customBody = str4;
        this.sendTrackingLink = z;
        this.selectedChannel = str5;
        this.engagementSource = str6;
    }

    public /* synthetic */ CustomizedMessage(Leads leads, String str, String str2, List list, FileData fileData, String str3, String str4, boolean z, String str5, String str6, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : leads, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? new ArrayList() : list, (i & 16) == 0 ? fileData : null, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "" : str5, (i & 512) == 0 ? str6 : "");
    }
}
