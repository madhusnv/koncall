package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"contactId", "updatedAt"}, name = "filesByContact"), @Index(fields = {"engagementId", "updatedAt"}, name = "filesByEngagement"), @Index(fields = {"productId", "updatedAt"}, name = "filesByProduct"), @Index(fields = {"fileId", "updatedAt"}, name = "filesByFileId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "fileObjectRelationships")
/* loaded from: classes5.dex */
public final class fileObjectRelationship implements Model {

    @BelongsTo(targetName = "accountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account account;

    @BelongsTo(targetName = "businessId", type = Business.class)
    @ModelField(targetType = "Business")
    private final Business business;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @BelongsTo(targetName = "dealId", type = Deal.class)
    @ModelField(targetType = "Deal")
    private final Deal deal;

    @BelongsTo(targetName = "engagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement engagement;

    @ModelField(targetType = "String")
    private final String fieldName;

    @BelongsTo(targetName = "fileId", type = UploadedFile.class)
    @ModelField(targetType = "UploadedFile")
    private final UploadedFile file;

    @ModelField(targetType = "String")
    private final String fileUrl;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSJSON")
    private final String inputContext;

    @ModelField(targetType = "ID")
    private final String parentObjectId;

    @ModelField(targetType = "String")
    private final String parentObjectType;

    @BelongsTo(targetName = "productId", type = ProductService.class)
    @ModelField(targetType = "ProductService")
    private final ProductService productService;

    @ModelField(targetType = "AWSJSON")
    private final String transcription;

    @ModelField(targetType = "AWSJSON")
    private final String translatedTranscription;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("fileObjectRelationship", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT = QueryField.field("fileObjectRelationship", "accountId");
    public static final QueryField FILE = QueryField.field("fileObjectRelationship", "fileId");
    public static final QueryField FILE_URL = QueryField.field("fileObjectRelationship", "fileUrl");
    public static final QueryField CONTACT = QueryField.field("fileObjectRelationship", "contactId");
    public static final QueryField ENGAGEMENT = QueryField.field("fileObjectRelationship", "engagementId");
    public static final QueryField BUSINESS = QueryField.field("fileObjectRelationship", "businessId");
    public static final QueryField DEAL = QueryField.field("fileObjectRelationship", "dealId");
    public static final QueryField PRODUCT_SERVICE = QueryField.field("fileObjectRelationship", "productId");
    public static final QueryField CREATED_AT = QueryField.field("fileObjectRelationship", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("fileObjectRelationship", "updatedAt");
    public static final QueryField PARENT_OBJECT_ID = QueryField.field("fileObjectRelationship", "parentObjectId");
    public static final QueryField PARENT_OBJECT_TYPE = QueryField.field("fileObjectRelationship", "parentObjectType");
    public static final QueryField FIELD_NAME = QueryField.field("fileObjectRelationship", "fieldName");
    public static final QueryField INPUT_CONTEXT = QueryField.field("fileObjectRelationship", "inputContext");
    public static final QueryField TRANSCRIPTION = QueryField.field("fileObjectRelationship", "transcription");
    public static final QueryField TRANSLATED_TRANSCRIPTION = QueryField.field("fileObjectRelationship", "translatedTranscription");

    public interface BuildStep {
        BuildStep account(Account account);

        fileObjectRelationship build();

        BuildStep business(Business business);

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deal(Deal deal);

        BuildStep engagement(Engagement engagement);

        BuildStep fieldName(String str);

        BuildStep file(UploadedFile uploadedFile);

        BuildStep fileUrl(String str);

        BuildStep id(String str);

        BuildStep inputContext(String str);

        BuildStep parentObjectId(String str);

        BuildStep parentObjectType(String str);

        BuildStep productService(ProductService productService);

        BuildStep transcription(String str);

        BuildStep translatedTranscription(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements BuildStep {
        private Account account;
        private Business business;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private Deal deal;
        private Engagement engagement;
        private String fieldName;
        private UploadedFile file;
        private String fileUrl;
        private String id;
        private String inputContext;
        private String parentObjectId;
        private String parentObjectType;
        private ProductService productService;
        private String transcription;
        private String translatedTranscription;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep account(Account account) {
            this.account = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public fileObjectRelationship build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new fileObjectRelationship(string, this.account, this.file, this.fileUrl, this.contact, this.engagement, this.business, this.deal, this.productService, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep business(Business business) {
            this.business = business;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep deal(Deal deal) {
            this.deal = deal;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep engagement(Engagement engagement) {
            this.engagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep fieldName(String str) {
            this.fieldName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep file(UploadedFile uploadedFile) {
            this.file = uploadedFile;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep fileUrl(String str) {
            this.fileUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep inputContext(String str) {
            this.inputContext = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep parentObjectId(String str) {
            this.parentObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep parentObjectType(String str) {
            this.parentObjectType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep productService(ProductService productService) {
            this.productService = productService;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep transcription(String str) {
            this.transcription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep translatedTranscription(String str) {
            this.translatedTranscription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, UploadedFile uploadedFile, String str2, Contact contact, Engagement engagement, Business business, Deal deal, ProductService productService, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.id = str;
            this.account = account;
            this.file = uploadedFile;
            this.fileUrl = str2;
            this.contact = contact;
            this.engagement = engagement;
            this.business = business;
            this.deal = deal;
            this.productService = productService;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.parentObjectId = str3;
            this.parentObjectType = str4;
            this.fieldName = str5;
            this.inputContext = str6;
            this.transcription = str7;
            this.translatedTranscription = str8;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Account account, UploadedFile uploadedFile, String str2, Contact contact, Engagement engagement, Business business, Deal deal, ProductService productService, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str, account, uploadedFile, str2, contact, engagement, business, deal, productService, dateTime, dateTime2, str3, str4, str5, str6, str7, str8);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder account(Account account) {
            return (CopyOfBuilder) super.account(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder business(Business business) {
            return (CopyOfBuilder) super.business(business);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder deal(Deal deal) {
            return (CopyOfBuilder) super.deal(deal);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder engagement(Engagement engagement) {
            return (CopyOfBuilder) super.engagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder fieldName(String str) {
            return (CopyOfBuilder) super.fieldName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder file(UploadedFile uploadedFile) {
            return (CopyOfBuilder) super.file(uploadedFile);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder fileUrl(String str) {
            return (CopyOfBuilder) super.fileUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder inputContext(String str) {
            return (CopyOfBuilder) super.inputContext(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder parentObjectId(String str) {
            return (CopyOfBuilder) super.parentObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder parentObjectType(String str) {
            return (CopyOfBuilder) super.parentObjectType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder productService(ProductService productService) {
            return (CopyOfBuilder) super.productService(productService);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder transcription(String str) {
            return (CopyOfBuilder) super.transcription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder translatedTranscription(String str) {
            return (CopyOfBuilder) super.translatedTranscription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.fileObjectRelationship.Builder, com.amplifyframework.datastore.generated.model.fileObjectRelationship.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static fileObjectRelationship justId(String str) {
        return new fileObjectRelationship(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.account, this.file, this.fileUrl, this.contact, this.engagement, this.business, this.deal, this.productService, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fileObjectRelationship.class != obj.getClass()) {
            return false;
        }
        fileObjectRelationship fileobjectrelationship = (fileObjectRelationship) obj;
        return s6c.m47909a(getId(), fileobjectrelationship.getId()) && s6c.m47909a(getAccount(), fileobjectrelationship.getAccount()) && s6c.m47909a(getFile(), fileobjectrelationship.getFile()) && s6c.m47909a(getFileUrl(), fileobjectrelationship.getFileUrl()) && s6c.m47909a(getContact(), fileobjectrelationship.getContact()) && s6c.m47909a(getEngagement(), fileobjectrelationship.getEngagement()) && s6c.m47909a(getBusiness(), fileobjectrelationship.getBusiness()) && s6c.m47909a(getDeal(), fileobjectrelationship.getDeal()) && s6c.m47909a(getProductService(), fileobjectrelationship.getProductService()) && s6c.m47909a(getCreatedAt(), fileobjectrelationship.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), fileobjectrelationship.getUpdatedAt()) && s6c.m47909a(getParentObjectId(), fileobjectrelationship.getParentObjectId()) && s6c.m47909a(getParentObjectType(), fileobjectrelationship.getParentObjectType()) && s6c.m47909a(getFieldName(), fileobjectrelationship.getFieldName()) && s6c.m47909a(getInputContext(), fileobjectrelationship.getInputContext()) && s6c.m47909a(getTranscription(), fileobjectrelationship.getTranscription()) && s6c.m47909a(getTranslatedTranscription(), fileobjectrelationship.getTranslatedTranscription());
    }

    public Account getAccount() {
        return this.account;
    }

    public Business getBusiness() {
        return this.business;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Deal getDeal() {
        return this.deal;
    }

    public Engagement getEngagement() {
        return this.engagement;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public UploadedFile getFile() {
        return this.file;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getInputContext() {
        return this.inputContext;
    }

    public String getParentObjectId() {
        return this.parentObjectId;
    }

    public String getParentObjectType() {
        return this.parentObjectType;
    }

    public ProductService getProductService() {
        return this.productService;
    }

    public String getTranscription() {
        return this.transcription;
    }

    public String getTranslatedTranscription() {
        return this.translatedTranscription;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccount() + getFile() + getFileUrl() + getContact() + getEngagement() + getBusiness() + getDeal() + getProductService() + getCreatedAt() + getUpdatedAt() + getParentObjectId() + getParentObjectType() + getFieldName() + getInputContext() + getTranscription() + getTranslatedTranscription()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("fileObjectRelationship {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("account=" + String.valueOf(getAccount()) + ", ");
        sb.append("file=" + String.valueOf(getFile()) + ", ");
        sb.append("fileUrl=" + String.valueOf(getFileUrl()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("engagement=" + String.valueOf(getEngagement()) + ", ");
        sb.append("business=" + String.valueOf(getBusiness()) + ", ");
        sb.append("deal=" + String.valueOf(getDeal()) + ", ");
        sb.append("productService=" + String.valueOf(getProductService()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("parentObjectId=" + String.valueOf(getParentObjectId()) + ", ");
        sb.append("parentObjectType=" + String.valueOf(getParentObjectType()) + ", ");
        sb.append("fieldName=" + String.valueOf(getFieldName()) + ", ");
        sb.append("inputContext=" + String.valueOf(getInputContext()) + ", ");
        sb.append("transcription=" + String.valueOf(getTranscription()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("translatedTranscription=");
        sb2.append(String.valueOf(getTranslatedTranscription()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private fileObjectRelationship(String str, Account account, UploadedFile uploadedFile, String str2, Contact contact, Engagement engagement, Business business, Deal deal, ProductService productService, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.id = str;
        this.account = account;
        this.file = uploadedFile;
        this.fileUrl = str2;
        this.contact = contact;
        this.engagement = engagement;
        this.business = business;
        this.deal = deal;
        this.productService = productService;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.parentObjectId = str3;
        this.parentObjectType = str4;
        this.fieldName = str5;
        this.inputContext = str6;
        this.transcription = str7;
        this.translatedTranscription = str8;
    }
}
