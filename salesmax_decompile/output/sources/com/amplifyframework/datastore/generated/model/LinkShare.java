package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "sharedById", "updatedAt"}, name = "byOwner")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "LinkShares")
/* loaded from: classes5.dex */
public final class LinkShare implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String accountLogoUrl;

    @ModelField(targetType = "String")
    private final String accountName;

    @ModelField(targetType = "String")
    private final String accountWebsite;

    @ModelField(isRequired = true, targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "String")
    private final String contactName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String engagementId;

    @ModelField(targetType = "String")
    private final String externalLink;

    @ModelField(targetType = "String")
    private final String fileKey;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String mimeType;

    @ModelField(targetType = "String")
    private final String sharedByEmail;

    @ModelField(isRequired = true, targetType = "ID")
    private final String sharedById;

    @ModelField(targetType = "String")
    private final String sharedByName;

    @ModelField(targetType = "String")
    private final String sharedByNumber;

    @ModelField(targetType = "String")
    private final String templateTitle;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("LinkShare", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("LinkShare", "accountId");
    public static final QueryField CONTACT_ID = QueryField.field("LinkShare", "contactId");
    public static final QueryField CONTACT_NAME = QueryField.field("LinkShare", "contactName");
    public static final QueryField ENGAGEMENT_ID = QueryField.field("LinkShare", "engagementId");
    public static final QueryField FILE_KEY = QueryField.field("LinkShare", "fileKey");
    public static final QueryField MIME_TYPE = QueryField.field("LinkShare", "mimeType");
    public static final QueryField EXTERNAL_LINK = QueryField.field("LinkShare", "externalLink");
    public static final QueryField SHARED_BY_ID = QueryField.field("LinkShare", "sharedById");
    public static final QueryField SHARED_BY_NAME = QueryField.field("LinkShare", "sharedByName");
    public static final QueryField SHARED_BY_EMAIL = QueryField.field("LinkShare", "sharedByEmail");
    public static final QueryField TEMPLATE_TITLE = QueryField.field("LinkShare", "templateTitle");
    public static final QueryField ACCOUNT_NAME = QueryField.field("LinkShare", "accountName");
    public static final QueryField ACCOUNT_LOGO_URL = QueryField.field("LinkShare", "accountLogoUrl");
    public static final QueryField ACCOUNT_WEBSITE = QueryField.field("LinkShare", "accountWebsite");
    public static final QueryField SHARED_BY_NUMBER = QueryField.field("LinkShare", "sharedByNumber");
    public static final QueryField CREATED_AT = QueryField.field("LinkShare", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("LinkShare", "updatedAt");

    public interface AccountIdStep {
        ContactIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep accountLogoUrl(String str);

        BuildStep accountName(String str);

        BuildStep accountWebsite(String str);

        LinkShare build();

        BuildStep contactName(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep externalLink(String str);

        BuildStep fileKey(String str);

        BuildStep id(String str);

        BuildStep mimeType(String str);

        BuildStep sharedByEmail(String str);

        BuildStep sharedByName(String str);

        BuildStep sharedByNumber(String str);

        BuildStep templateTitle(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, ContactIdStep, EngagementIdStep, SharedByIdStep, BuildStep {
        private String accountId;
        private String accountLogoUrl;
        private String accountName;
        private String accountWebsite;
        private String contactId;
        private String contactName;
        private Temporal.DateTime createdAt;
        private String engagementId;
        private String externalLink;
        private String fileKey;
        private String id;
        private String mimeType;
        private String sharedByEmail;
        private String sharedById;
        private String sharedByName;
        private String sharedByNumber;
        private String templateTitle;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.AccountIdStep
        public ContactIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep accountLogoUrl(String str) {
            this.accountLogoUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep accountName(String str) {
            this.accountName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep accountWebsite(String str) {
            this.accountWebsite = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public LinkShare build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new LinkShare(string, this.accountId, this.contactId, this.contactName, this.engagementId, this.fileKey, this.mimeType, this.externalLink, this.sharedById, this.sharedByName, this.sharedByEmail, this.templateTitle, this.accountName, this.accountLogoUrl, this.accountWebsite, this.sharedByNumber, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.ContactIdStep
        public EngagementIdStep contactId(String str) {
            Objects.requireNonNull(str);
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep contactName(String str) {
            this.contactName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.EngagementIdStep
        public SharedByIdStep engagementId(String str) {
            Objects.requireNonNull(str);
            this.engagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep externalLink(String str) {
            this.externalLink = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep fileKey(String str) {
            this.fileKey = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep mimeType(String str) {
            this.mimeType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep sharedByEmail(String str) {
            this.sharedByEmail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.SharedByIdStep
        public BuildStep sharedById(String str) {
            Objects.requireNonNull(str);
            this.sharedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep sharedByName(String str) {
            this.sharedByName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep sharedByNumber(String str) {
            this.sharedByNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep templateTitle(String str) {
            this.templateTitle = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.contactId = str3;
            this.contactName = str4;
            this.engagementId = str5;
            this.fileKey = str6;
            this.mimeType = str7;
            this.externalLink = str8;
            this.sharedById = str9;
            this.sharedByName = str10;
            this.sharedByEmail = str11;
            this.templateTitle = str12;
            this.accountName = str13;
            this.accountLogoUrl = str14;
            this.accountWebsite = str15;
            this.sharedByNumber = str16;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public interface ContactIdStep {
        EngagementIdStep contactId(String str);
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(str9);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder accountLogoUrl(String str) {
            return (CopyOfBuilder) super.accountLogoUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder accountName(String str) {
            return (CopyOfBuilder) super.accountName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder accountWebsite(String str) {
            return (CopyOfBuilder) super.accountWebsite(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.ContactIdStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder contactName(String str) {
            return (CopyOfBuilder) super.contactName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.EngagementIdStep
        public CopyOfBuilder engagementId(String str) {
            return (CopyOfBuilder) super.engagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder externalLink(String str) {
            return (CopyOfBuilder) super.externalLink(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder fileKey(String str) {
            return (CopyOfBuilder) super.fileKey(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder mimeType(String str) {
            return (CopyOfBuilder) super.mimeType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder sharedByEmail(String str) {
            return (CopyOfBuilder) super.sharedByEmail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.SharedByIdStep
        public CopyOfBuilder sharedById(String str) {
            return (CopyOfBuilder) super.sharedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder sharedByName(String str) {
            return (CopyOfBuilder) super.sharedByName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder sharedByNumber(String str) {
            return (CopyOfBuilder) super.sharedByNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder templateTitle(String str) {
            return (CopyOfBuilder) super.templateTitle(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.LinkShare.Builder, com.amplifyframework.datastore.generated.model.LinkShare.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface EngagementIdStep {
        SharedByIdStep engagementId(String str);
    }

    public interface SharedByIdStep {
        BuildStep sharedById(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static LinkShare justId(String str) {
        return new LinkShare(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contactId, this.contactName, this.engagementId, this.fileKey, this.mimeType, this.externalLink, this.sharedById, this.sharedByName, this.sharedByEmail, this.templateTitle, this.accountName, this.accountLogoUrl, this.accountWebsite, this.sharedByNumber, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LinkShare.class != obj.getClass()) {
            return false;
        }
        LinkShare linkShare = (LinkShare) obj;
        return s6c.m47909a(getId(), linkShare.getId()) && s6c.m47909a(getAccountId(), linkShare.getAccountId()) && s6c.m47909a(getContactId(), linkShare.getContactId()) && s6c.m47909a(getContactName(), linkShare.getContactName()) && s6c.m47909a(getEngagementId(), linkShare.getEngagementId()) && s6c.m47909a(getFileKey(), linkShare.getFileKey()) && s6c.m47909a(getMimeType(), linkShare.getMimeType()) && s6c.m47909a(getExternalLink(), linkShare.getExternalLink()) && s6c.m47909a(getSharedById(), linkShare.getSharedById()) && s6c.m47909a(getSharedByName(), linkShare.getSharedByName()) && s6c.m47909a(getSharedByEmail(), linkShare.getSharedByEmail()) && s6c.m47909a(getTemplateTitle(), linkShare.getTemplateTitle()) && s6c.m47909a(getAccountName(), linkShare.getAccountName()) && s6c.m47909a(getAccountLogoUrl(), linkShare.getAccountLogoUrl()) && s6c.m47909a(getAccountWebsite(), linkShare.getAccountWebsite()) && s6c.m47909a(getSharedByNumber(), linkShare.getSharedByNumber()) && s6c.m47909a(getCreatedAt(), linkShare.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), linkShare.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountLogoUrl() {
        return this.accountLogoUrl;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountWebsite() {
        return this.accountWebsite;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public String getExternalLink() {
        return this.externalLink;
    }

    public String getFileKey() {
        return this.fileKey;
    }

    public String getId() {
        return this.id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getSharedByEmail() {
        return this.sharedByEmail;
    }

    public String getSharedById() {
        return this.sharedById;
    }

    public String getSharedByName() {
        return this.sharedByName;
    }

    public String getSharedByNumber() {
        return this.sharedByNumber;
    }

    public String getTemplateTitle() {
        return this.templateTitle;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getContactId() + getContactName() + getEngagementId() + getFileKey() + getMimeType() + getExternalLink() + getSharedById() + getSharedByName() + getSharedByEmail() + getTemplateTitle() + getAccountName() + getAccountLogoUrl() + getAccountWebsite() + getSharedByNumber() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkShare {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("contactName=" + String.valueOf(getContactName()) + ", ");
        sb.append("engagementId=" + String.valueOf(getEngagementId()) + ", ");
        sb.append("fileKey=" + String.valueOf(getFileKey()) + ", ");
        sb.append("mimeType=" + String.valueOf(getMimeType()) + ", ");
        sb.append("externalLink=" + String.valueOf(getExternalLink()) + ", ");
        sb.append("sharedById=" + String.valueOf(getSharedById()) + ", ");
        sb.append("sharedByName=" + String.valueOf(getSharedByName()) + ", ");
        sb.append("sharedByEmail=" + String.valueOf(getSharedByEmail()) + ", ");
        sb.append("templateTitle=" + String.valueOf(getTemplateTitle()) + ", ");
        sb.append("accountName=" + String.valueOf(getAccountName()) + ", ");
        sb.append("accountLogoUrl=" + String.valueOf(getAccountLogoUrl()) + ", ");
        sb.append("accountWebsite=" + String.valueOf(getAccountWebsite()) + ", ");
        sb.append("sharedByNumber=" + String.valueOf(getSharedByNumber()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private LinkShare(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.contactId = str3;
        this.contactName = str4;
        this.engagementId = str5;
        this.fileKey = str6;
        this.mimeType = str7;
        this.externalLink = str8;
        this.sharedById = str9;
        this.sharedByName = str10;
        this.sharedByEmail = str11;
        this.templateTitle = str12;
        this.accountName = str13;
        this.accountLogoUrl = str14;
        this.accountWebsite = str15;
        this.sharedByNumber = str16;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
