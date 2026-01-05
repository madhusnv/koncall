package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"templateId"}, name = "templateByExternalId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "WhasappTemplates")
/* loaded from: classes5.dex */
public final class WhasappTemplates implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ActionInteractive")
    private final ActionInteractive actionInteractive;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime archivedAt;

    @ModelField(targetType = "String")
    private final String archivedStatus;

    @ModelField(targetType = "String")
    private final String category;

    @ModelField(targetType = "TemplateComponent")
    private final List<TemplateComponent> components;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdBy;

    @BelongsTo(targetName = "defaultMediaId", type = UploadedFile.class)
    @ModelField(targetType = "UploadedFile")
    private final UploadedFile defaultMedia;

    @ModelField(targetType = "MappedVariable")
    private final List<MappedVariable> defaultVariableMap;

    @ModelField(targetType = "String")
    private final String footerText;

    @ModelField(targetType = "String")
    private final String headerText;

    @ModelField(targetType = "String")
    private final String headerType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isSample;

    @ModelField(targetType = "String")
    private final String language;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime lastUsed;

    @ModelField(targetType = "AWSJSON")
    private final String locationObjectToSend;

    @ModelField(targetType = "String")
    private final String messageSubType;

    @ModelField(targetType = "String")
    private final String messageTemplateQualityNew;

    @ModelField(targetType = "String")
    private final String messageTemplateQualityPrevious;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime messageTemplateQualityUpdatedAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime messageTemplateStatusUpdatedAt;

    @ModelField(targetType = "String")
    private final String messageType;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String otherDetail;

    @ModelField(targetType = "String")
    private final String platform;

    @ModelField(targetType = "String")
    private final String snippetCategory;

    @ModelField(targetType = "String")
    private final String snippetSubCategory;

    @ModelField(targetType = "String")
    private final String snippetType;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final String stausUpdateReason;

    @ModelField(targetType = "String")
    private final String subCategory;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "String")
    private final String templateId;

    @ModelField(targetType = "String")
    private final String templateType;

    @ModelField(targetType = "String")
    private final String text;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedBy;

    @ModelField(targetType = "ID")
    private final String whatsappBusinessAccount;
    public static final QueryField ID = QueryField.field("WhasappTemplates", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("WhasappTemplates", "accountId");
    public static final QueryField WHATSAPP_BUSINESS_ACCOUNT = QueryField.field("WhasappTemplates", "whatsappBusinessAccount");
    public static final QueryField TEMPLATE_TYPE = QueryField.field("WhasappTemplates", "templateType");
    public static final QueryField SNIPPET_TYPE = QueryField.field("WhasappTemplates", "snippetType");
    public static final QueryField PLATFORM = QueryField.field("WhasappTemplates", "platform");
    public static final QueryField NAME = QueryField.field("WhasappTemplates", "name");
    public static final QueryField COMPONENTS = QueryField.field("WhasappTemplates", "components");
    public static final QueryField LANGUAGE = QueryField.field("WhasappTemplates", "language");
    public static final QueryField STATUS = QueryField.field("WhasappTemplates", "status");
    public static final QueryField CATEGORY = QueryField.field("WhasappTemplates", "category");
    public static final QueryField SUB_CATEGORY = QueryField.field("WhasappTemplates", "subCategory");
    public static final QueryField SNIPPET_CATEGORY = QueryField.field("WhasappTemplates", "snippetCategory");
    public static final QueryField SNIPPET_SUB_CATEGORY = QueryField.field("WhasappTemplates", "snippetSubCategory");
    public static final QueryField CREATED_BY = QueryField.field("WhasappTemplates", "createdBy");
    public static final QueryField UPDATED_BY = QueryField.field("WhasappTemplates", "updatedBy");
    public static final QueryField ARCHIVED_STATUS = QueryField.field("WhasappTemplates", "archivedStatus");
    public static final QueryField ARCHIVED_AT = QueryField.field("WhasappTemplates", "archivedAt");
    public static final QueryField DEFAULT_MEDIA = QueryField.field("WhasappTemplates", "defaultMediaId");
    public static final QueryField DEFAULT_VARIABLE_MAP = QueryField.field("WhasappTemplates", "defaultVariableMap");
    public static final QueryField TEMPLATE_ID = QueryField.field("WhasappTemplates", "templateId");
    public static final QueryField TAGS = QueryField.field("WhasappTemplates", "tags");
    public static final QueryField IS_SAMPLE = QueryField.field("WhasappTemplates", "isSample");
    public static final QueryField MESSAGE_TYPE = QueryField.field("WhasappTemplates", "messageType");
    public static final QueryField MESSAGE_SUB_TYPE = QueryField.field("WhasappTemplates", "messageSubType");
    public static final QueryField TEXT = QueryField.field("WhasappTemplates", "text");
    public static final QueryField LOCATION_OBJECT_TO_SEND = QueryField.field("WhasappTemplates", "locationObjectToSend");
    public static final QueryField HEADER_TEXT = QueryField.field("WhasappTemplates", "headerText");
    public static final QueryField FOOTER_TEXT = QueryField.field("WhasappTemplates", "footerText");
    public static final QueryField HEADER_TYPE = QueryField.field("WhasappTemplates", "headerType");
    public static final QueryField ACTION_INTERACTIVE = QueryField.field("WhasappTemplates", "actionInteractive");
    public static final QueryField MESSAGE_TEMPLATE_QUALITY_NEW = QueryField.field("WhasappTemplates", "messageTemplateQualityNew");
    public static final QueryField MESSAGE_TEMPLATE_QUALITY_PREVIOUS = QueryField.field("WhasappTemplates", "messageTemplateQualityPrevious");
    public static final QueryField MESSAGE_TEMPLATE_QUALITY_UPDATED_AT = QueryField.field("WhasappTemplates", "messageTemplateQualityUpdatedAt");
    public static final QueryField MESSAGE_TEMPLATE_STATUS_UPDATED_AT = QueryField.field("WhasappTemplates", "messageTemplateStatusUpdatedAt");
    public static final QueryField STAUS_UPDATE_REASON = QueryField.field("WhasappTemplates", "stausUpdateReason");
    public static final QueryField OTHER_DETAIL = QueryField.field("WhasappTemplates", "otherDetail");
    public static final QueryField LAST_USED = QueryField.field("WhasappTemplates", "lastUsed");
    public static final QueryField CREATED_AT = QueryField.field("WhasappTemplates", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("WhasappTemplates", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep actionInteractive(ActionInteractive actionInteractive);

        BuildStep archivedAt(Temporal.DateTime dateTime);

        BuildStep archivedStatus(String str);

        WhasappTemplates build();

        BuildStep category(String str);

        BuildStep components(List<TemplateComponent> list);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdBy(String str);

        BuildStep defaultMedia(UploadedFile uploadedFile);

        BuildStep defaultVariableMap(List<MappedVariable> list);

        BuildStep footerText(String str);

        BuildStep headerText(String str);

        BuildStep headerType(String str);

        BuildStep id(String str);

        BuildStep isSample(Boolean bool);

        BuildStep language(String str);

        BuildStep lastUsed(Temporal.DateTime dateTime);

        BuildStep locationObjectToSend(String str);

        BuildStep messageSubType(String str);

        BuildStep messageTemplateQualityNew(String str);

        BuildStep messageTemplateQualityPrevious(String str);

        BuildStep messageTemplateQualityUpdatedAt(Temporal.DateTime dateTime);

        BuildStep messageTemplateStatusUpdatedAt(Temporal.DateTime dateTime);

        BuildStep messageType(String str);

        BuildStep name(String str);

        BuildStep otherDetail(String str);

        BuildStep platform(String str);

        BuildStep snippetCategory(String str);

        BuildStep snippetSubCategory(String str);

        BuildStep snippetType(String str);

        BuildStep status(String str);

        BuildStep stausUpdateReason(String str);

        BuildStep subCategory(String str);

        BuildStep tags(List<String> list);

        BuildStep templateId(String str);

        BuildStep templateType(String str);

        BuildStep text(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedBy(String str);

        BuildStep whatsappBusinessAccount(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private ActionInteractive actionInteractive;
        private Temporal.DateTime archivedAt;
        private String archivedStatus;
        private String category;
        private List<TemplateComponent> components;
        private Temporal.DateTime createdAt;
        private String createdBy;
        private UploadedFile defaultMedia;
        private List<MappedVariable> defaultVariableMap;
        private String footerText;
        private String headerText;
        private String headerType;
        private String id;
        private Boolean isSample;
        private String language;
        private Temporal.DateTime lastUsed;
        private String locationObjectToSend;
        private String messageSubType;
        private String messageTemplateQualityNew;
        private String messageTemplateQualityPrevious;
        private Temporal.DateTime messageTemplateQualityUpdatedAt;
        private Temporal.DateTime messageTemplateStatusUpdatedAt;
        private String messageType;
        private String name;
        private String otherDetail;
        private String platform;
        private String snippetCategory;
        private String snippetSubCategory;
        private String snippetType;
        private String status;
        private String stausUpdateReason;
        private String subCategory;
        private List<String> tags;
        private String templateId;
        private String templateType;
        private String text;
        private Temporal.DateTime updatedAt;
        private String updatedBy;
        private String whatsappBusinessAccount;

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep actionInteractive(ActionInteractive actionInteractive) {
            this.actionInteractive = actionInteractive;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep archivedAt(Temporal.DateTime dateTime) {
            this.archivedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep archivedStatus(String str) {
            this.archivedStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public WhasappTemplates build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WhasappTemplates(string, this.accountId, this.whatsappBusinessAccount, this.templateType, this.snippetType, this.platform, this.name, this.components, this.language, this.status, this.category, this.subCategory, this.snippetCategory, this.snippetSubCategory, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMedia, this.defaultVariableMap, this.templateId, this.tags, this.isSample, this.messageType, this.messageSubType, this.text, this.locationObjectToSend, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.messageTemplateQualityNew, this.messageTemplateQualityPrevious, this.messageTemplateQualityUpdatedAt, this.messageTemplateStatusUpdatedAt, this.stausUpdateReason, this.otherDetail, this.lastUsed, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep category(String str) {
            this.category = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep components(List<TemplateComponent> list) {
            this.components = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep createdBy(String str) {
            this.createdBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep defaultMedia(UploadedFile uploadedFile) {
            this.defaultMedia = uploadedFile;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep defaultVariableMap(List<MappedVariable> list) {
            this.defaultVariableMap = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep footerText(String str) {
            this.footerText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep headerText(String str) {
            this.headerText = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep headerType(String str) {
            this.headerType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep isSample(Boolean bool) {
            this.isSample = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep language(String str) {
            this.language = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep lastUsed(Temporal.DateTime dateTime) {
            this.lastUsed = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep locationObjectToSend(String str) {
            this.locationObjectToSend = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep messageSubType(String str) {
            this.messageSubType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep messageTemplateQualityNew(String str) {
            this.messageTemplateQualityNew = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep messageTemplateQualityPrevious(String str) {
            this.messageTemplateQualityPrevious = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep messageTemplateQualityUpdatedAt(Temporal.DateTime dateTime) {
            this.messageTemplateQualityUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep messageTemplateStatusUpdatedAt(Temporal.DateTime dateTime) {
            this.messageTemplateStatusUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep messageType(String str) {
            this.messageType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep otherDetail(String str) {
            this.otherDetail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep platform(String str) {
            this.platform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep snippetCategory(String str) {
            this.snippetCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep snippetSubCategory(String str) {
            this.snippetSubCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep snippetType(String str) {
            this.snippetType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep stausUpdateReason(String str) {
            this.stausUpdateReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep subCategory(String str) {
            this.subCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep templateId(String str) {
            this.templateId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep templateType(String str) {
            this.templateType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep text(String str) {
            this.text = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep updatedBy(String str) {
            this.updatedBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public BuildStep whatsappBusinessAccount(String str) {
            this.whatsappBusinessAccount = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<TemplateComponent> list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, UploadedFile uploadedFile, List<MappedVariable> list2, String str17, List<String> list3, Boolean bool, String str18, String str19, String str20, String str21, String str22, String str23, String str24, ActionInteractive actionInteractive, String str25, String str26, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str27, String str28, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6) {
            this.id = str;
            this.accountId = str2;
            this.whatsappBusinessAccount = str3;
            this.templateType = str4;
            this.snippetType = str5;
            this.platform = str6;
            this.name = str7;
            this.components = list;
            this.language = str8;
            this.status = str9;
            this.category = str10;
            this.subCategory = str11;
            this.snippetCategory = str12;
            this.snippetSubCategory = str13;
            this.createdBy = str14;
            this.updatedBy = str15;
            this.archivedStatus = str16;
            this.archivedAt = dateTime;
            this.defaultMedia = uploadedFile;
            this.defaultVariableMap = list2;
            this.templateId = str17;
            this.tags = list3;
            this.isSample = bool;
            this.messageType = str18;
            this.messageSubType = str19;
            this.text = str20;
            this.locationObjectToSend = str21;
            this.headerText = str22;
            this.footerText = str23;
            this.headerType = str24;
            this.actionInteractive = actionInteractive;
            this.messageTemplateQualityNew = str25;
            this.messageTemplateQualityPrevious = str26;
            this.messageTemplateQualityUpdatedAt = dateTime2;
            this.messageTemplateStatusUpdatedAt = dateTime3;
            this.stausUpdateReason = str27;
            this.otherDetail = str28;
            this.lastUsed = dateTime4;
            this.createdAt = dateTime5;
            this.updatedAt = dateTime6;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public /* bridge */ /* synthetic */ BuildStep components(List list) {
            return components((List<TemplateComponent>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public /* bridge */ /* synthetic */ BuildStep defaultVariableMap(List list) {
            return defaultVariableMap((List<MappedVariable>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<TemplateComponent> list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, UploadedFile uploadedFile, List<MappedVariable> list2, String str17, List<String> list3, Boolean bool, String str18, String str19, String str20, String str21, String str22, String str23, String str24, ActionInteractive actionInteractive, String str25, String str26, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str27, String str28, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6) {
            super(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11, str12, str13, str14, str15, str16, dateTime, uploadedFile, list2, str17, list3, bool, str18, str19, str20, str21, str22, str23, str24, actionInteractive, str25, str26, dateTime2, dateTime3, str27, str28, dateTime4, dateTime5, dateTime6);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder actionInteractive(ActionInteractive actionInteractive) {
            return (CopyOfBuilder) super.actionInteractive(actionInteractive);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder archivedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.archivedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder archivedStatus(String str) {
            return (CopyOfBuilder) super.archivedStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder category(String str) {
            return (CopyOfBuilder) super.category(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder components(List<TemplateComponent> list) {
            return (CopyOfBuilder) super.components(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder createdBy(String str) {
            return (CopyOfBuilder) super.createdBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder defaultMedia(UploadedFile uploadedFile) {
            return (CopyOfBuilder) super.defaultMedia(uploadedFile);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder defaultVariableMap(List<MappedVariable> list) {
            return (CopyOfBuilder) super.defaultVariableMap(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder footerText(String str) {
            return (CopyOfBuilder) super.footerText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder headerText(String str) {
            return (CopyOfBuilder) super.headerText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder headerType(String str) {
            return (CopyOfBuilder) super.headerType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder isSample(Boolean bool) {
            return (CopyOfBuilder) super.isSample(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder language(String str) {
            return (CopyOfBuilder) super.language(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder lastUsed(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastUsed(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder locationObjectToSend(String str) {
            return (CopyOfBuilder) super.locationObjectToSend(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder messageSubType(String str) {
            return (CopyOfBuilder) super.messageSubType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder messageTemplateQualityNew(String str) {
            return (CopyOfBuilder) super.messageTemplateQualityNew(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder messageTemplateQualityPrevious(String str) {
            return (CopyOfBuilder) super.messageTemplateQualityPrevious(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder messageTemplateQualityUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.messageTemplateQualityUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder messageTemplateStatusUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.messageTemplateStatusUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder messageType(String str) {
            return (CopyOfBuilder) super.messageType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder otherDetail(String str) {
            return (CopyOfBuilder) super.otherDetail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder platform(String str) {
            return (CopyOfBuilder) super.platform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder snippetCategory(String str) {
            return (CopyOfBuilder) super.snippetCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder snippetSubCategory(String str) {
            return (CopyOfBuilder) super.snippetSubCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder snippetType(String str) {
            return (CopyOfBuilder) super.snippetType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder stausUpdateReason(String str) {
            return (CopyOfBuilder) super.stausUpdateReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder subCategory(String str) {
            return (CopyOfBuilder) super.subCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder templateId(String str) {
            return (CopyOfBuilder) super.templateId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder templateType(String str) {
            return (CopyOfBuilder) super.templateType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder text(String str) {
            return (CopyOfBuilder) super.text(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder updatedBy(String str) {
            return (CopyOfBuilder) super.updatedBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WhasappTemplates.Builder, com.amplifyframework.datastore.generated.model.WhasappTemplates.BuildStep
        public CopyOfBuilder whatsappBusinessAccount(String str) {
            return (CopyOfBuilder) super.whatsappBusinessAccount(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static WhasappTemplates justId(String str) {
        return new WhasappTemplates(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.whatsappBusinessAccount, this.templateType, this.snippetType, this.platform, this.name, this.components, this.language, this.status, this.category, this.subCategory, this.snippetCategory, this.snippetSubCategory, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMedia, this.defaultVariableMap, this.templateId, this.tags, this.isSample, this.messageType, this.messageSubType, this.text, this.locationObjectToSend, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.messageTemplateQualityNew, this.messageTemplateQualityPrevious, this.messageTemplateQualityUpdatedAt, this.messageTemplateStatusUpdatedAt, this.stausUpdateReason, this.otherDetail, this.lastUsed, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WhasappTemplates.class != obj.getClass()) {
            return false;
        }
        WhasappTemplates whasappTemplates = (WhasappTemplates) obj;
        return s6c.m47909a(getId(), whasappTemplates.getId()) && s6c.m47909a(getAccountId(), whasappTemplates.getAccountId()) && s6c.m47909a(getWhatsappBusinessAccount(), whasappTemplates.getWhatsappBusinessAccount()) && s6c.m47909a(getTemplateType(), whasappTemplates.getTemplateType()) && s6c.m47909a(getSnippetType(), whasappTemplates.getSnippetType()) && s6c.m47909a(getPlatform(), whasappTemplates.getPlatform()) && s6c.m47909a(getName(), whasappTemplates.getName()) && s6c.m47909a(getComponents(), whasappTemplates.getComponents()) && s6c.m47909a(getLanguage(), whasappTemplates.getLanguage()) && s6c.m47909a(getStatus(), whasappTemplates.getStatus()) && s6c.m47909a(getCategory(), whasappTemplates.getCategory()) && s6c.m47909a(getSubCategory(), whasappTemplates.getSubCategory()) && s6c.m47909a(getSnippetCategory(), whasappTemplates.getSnippetCategory()) && s6c.m47909a(getSnippetSubCategory(), whasappTemplates.getSnippetSubCategory()) && s6c.m47909a(getCreatedBy(), whasappTemplates.getCreatedBy()) && s6c.m47909a(getUpdatedBy(), whasappTemplates.getUpdatedBy()) && s6c.m47909a(getArchivedStatus(), whasappTemplates.getArchivedStatus()) && s6c.m47909a(getArchivedAt(), whasappTemplates.getArchivedAt()) && s6c.m47909a(getDefaultMedia(), whasappTemplates.getDefaultMedia()) && s6c.m47909a(getDefaultVariableMap(), whasappTemplates.getDefaultVariableMap()) && s6c.m47909a(getTemplateId(), whasappTemplates.getTemplateId()) && s6c.m47909a(getTags(), whasappTemplates.getTags()) && s6c.m47909a(getIsSample(), whasappTemplates.getIsSample()) && s6c.m47909a(getMessageType(), whasappTemplates.getMessageType()) && s6c.m47909a(getMessageSubType(), whasappTemplates.getMessageSubType()) && s6c.m47909a(getText(), whasappTemplates.getText()) && s6c.m47909a(getLocationObjectToSend(), whasappTemplates.getLocationObjectToSend()) && s6c.m47909a(getHeaderText(), whasappTemplates.getHeaderText()) && s6c.m47909a(getFooterText(), whasappTemplates.getFooterText()) && s6c.m47909a(getHeaderType(), whasappTemplates.getHeaderType()) && s6c.m47909a(getActionInteractive(), whasappTemplates.getActionInteractive()) && s6c.m47909a(getMessageTemplateQualityNew(), whasappTemplates.getMessageTemplateQualityNew()) && s6c.m47909a(getMessageTemplateQualityPrevious(), whasappTemplates.getMessageTemplateQualityPrevious()) && s6c.m47909a(getMessageTemplateQualityUpdatedAt(), whasappTemplates.getMessageTemplateQualityUpdatedAt()) && s6c.m47909a(getMessageTemplateStatusUpdatedAt(), whasappTemplates.getMessageTemplateStatusUpdatedAt()) && s6c.m47909a(getStausUpdateReason(), whasappTemplates.getStausUpdateReason()) && s6c.m47909a(getOtherDetail(), whasappTemplates.getOtherDetail()) && s6c.m47909a(getLastUsed(), whasappTemplates.getLastUsed()) && s6c.m47909a(getCreatedAt(), whasappTemplates.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), whasappTemplates.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ActionInteractive getActionInteractive() {
        return this.actionInteractive;
    }

    public Temporal.DateTime getArchivedAt() {
        return this.archivedAt;
    }

    public String getArchivedStatus() {
        return this.archivedStatus;
    }

    public String getCategory() {
        return this.category;
    }

    public List<TemplateComponent> getComponents() {
        return this.components;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public UploadedFile getDefaultMedia() {
        return this.defaultMedia;
    }

    public List<MappedVariable> getDefaultVariableMap() {
        return this.defaultVariableMap;
    }

    public String getFooterText() {
        return this.footerText;
    }

    public String getHeaderText() {
        return this.headerText;
    }

    public String getHeaderType() {
        return this.headerType;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsSample() {
        return this.isSample;
    }

    public String getLanguage() {
        return this.language;
    }

    public Temporal.DateTime getLastUsed() {
        return this.lastUsed;
    }

    public String getLocationObjectToSend() {
        return this.locationObjectToSend;
    }

    public String getMessageSubType() {
        return this.messageSubType;
    }

    public String getMessageTemplateQualityNew() {
        return this.messageTemplateQualityNew;
    }

    public String getMessageTemplateQualityPrevious() {
        return this.messageTemplateQualityPrevious;
    }

    public Temporal.DateTime getMessageTemplateQualityUpdatedAt() {
        return this.messageTemplateQualityUpdatedAt;
    }

    public Temporal.DateTime getMessageTemplateStatusUpdatedAt() {
        return this.messageTemplateStatusUpdatedAt;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getName() {
        return this.name;
    }

    public String getOtherDetail() {
        return this.otherDetail;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getSnippetCategory() {
        return this.snippetCategory;
    }

    public String getSnippetSubCategory() {
        return this.snippetSubCategory;
    }

    public String getSnippetType() {
        return this.snippetType;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStausUpdateReason() {
        return this.stausUpdateReason;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public String getText() {
        return this.text;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public String getWhatsappBusinessAccount() {
        return this.whatsappBusinessAccount;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getWhatsappBusinessAccount() + getTemplateType() + getSnippetType() + getPlatform() + getName() + getComponents() + getLanguage() + getStatus() + getCategory() + getSubCategory() + getSnippetCategory() + getSnippetSubCategory() + getCreatedBy() + getUpdatedBy() + getArchivedStatus() + getArchivedAt() + getDefaultMedia() + getDefaultVariableMap() + getTemplateId() + getTags() + getIsSample() + getMessageType() + getMessageSubType() + getText() + getLocationObjectToSend() + getHeaderText() + getFooterText() + getHeaderType() + getActionInteractive() + getMessageTemplateQualityNew() + getMessageTemplateQualityPrevious() + getMessageTemplateQualityUpdatedAt() + getMessageTemplateStatusUpdatedAt() + getStausUpdateReason() + getOtherDetail() + getLastUsed() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WhasappTemplates {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("whatsappBusinessAccount=" + String.valueOf(getWhatsappBusinessAccount()) + ", ");
        sb.append("templateType=" + String.valueOf(getTemplateType()) + ", ");
        sb.append("snippetType=" + String.valueOf(getSnippetType()) + ", ");
        sb.append("platform=" + String.valueOf(getPlatform()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("components=" + String.valueOf(getComponents()) + ", ");
        sb.append("language=" + String.valueOf(getLanguage()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("category=" + String.valueOf(getCategory()) + ", ");
        sb.append("subCategory=" + String.valueOf(getSubCategory()) + ", ");
        sb.append("snippetCategory=" + String.valueOf(getSnippetCategory()) + ", ");
        sb.append("snippetSubCategory=" + String.valueOf(getSnippetSubCategory()) + ", ");
        sb.append("createdBy=" + String.valueOf(getCreatedBy()) + ", ");
        sb.append("updatedBy=" + String.valueOf(getUpdatedBy()) + ", ");
        sb.append("archivedStatus=" + String.valueOf(getArchivedStatus()) + ", ");
        sb.append("archivedAt=" + String.valueOf(getArchivedAt()) + ", ");
        sb.append("defaultMedia=" + String.valueOf(getDefaultMedia()) + ", ");
        sb.append("defaultVariableMap=" + String.valueOf(getDefaultVariableMap()) + ", ");
        sb.append("templateId=" + String.valueOf(getTemplateId()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("isSample=" + String.valueOf(getIsSample()) + ", ");
        sb.append("messageType=" + String.valueOf(getMessageType()) + ", ");
        sb.append("messageSubType=" + String.valueOf(getMessageSubType()) + ", ");
        sb.append("text=" + String.valueOf(getText()) + ", ");
        sb.append("locationObjectToSend=" + String.valueOf(getLocationObjectToSend()) + ", ");
        sb.append("headerText=" + String.valueOf(getHeaderText()) + ", ");
        sb.append("footerText=" + String.valueOf(getFooterText()) + ", ");
        sb.append("headerType=" + String.valueOf(getHeaderType()) + ", ");
        sb.append("actionInteractive=" + String.valueOf(getActionInteractive()) + ", ");
        sb.append("messageTemplateQualityNew=" + String.valueOf(getMessageTemplateQualityNew()) + ", ");
        sb.append("messageTemplateQualityPrevious=" + String.valueOf(getMessageTemplateQualityPrevious()) + ", ");
        sb.append("messageTemplateQualityUpdatedAt=" + String.valueOf(getMessageTemplateQualityUpdatedAt()) + ", ");
        sb.append("messageTemplateStatusUpdatedAt=" + String.valueOf(getMessageTemplateStatusUpdatedAt()) + ", ");
        sb.append("stausUpdateReason=" + String.valueOf(getStausUpdateReason()) + ", ");
        sb.append("otherDetail=" + String.valueOf(getOtherDetail()) + ", ");
        sb.append("lastUsed=" + String.valueOf(getLastUsed()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WhasappTemplates(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<TemplateComponent> list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, UploadedFile uploadedFile, List<MappedVariable> list2, String str17, List<String> list3, Boolean bool, String str18, String str19, String str20, String str21, String str22, String str23, String str24, ActionInteractive actionInteractive, String str25, String str26, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str27, String str28, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, Temporal.DateTime dateTime6) {
        this.id = str;
        this.accountId = str2;
        this.whatsappBusinessAccount = str3;
        this.templateType = str4;
        this.snippetType = str5;
        this.platform = str6;
        this.name = str7;
        this.components = list;
        this.language = str8;
        this.status = str9;
        this.category = str10;
        this.subCategory = str11;
        this.snippetCategory = str12;
        this.snippetSubCategory = str13;
        this.createdBy = str14;
        this.updatedBy = str15;
        this.archivedStatus = str16;
        this.archivedAt = dateTime;
        this.defaultMedia = uploadedFile;
        this.defaultVariableMap = list2;
        this.templateId = str17;
        this.tags = list3;
        this.isSample = bool;
        this.messageType = str18;
        this.messageSubType = str19;
        this.text = str20;
        this.locationObjectToSend = str21;
        this.headerText = str22;
        this.footerText = str23;
        this.headerType = str24;
        this.actionInteractive = actionInteractive;
        this.messageTemplateQualityNew = str25;
        this.messageTemplateQualityPrevious = str26;
        this.messageTemplateQualityUpdatedAt = dateTime2;
        this.messageTemplateStatusUpdatedAt = dateTime3;
        this.stausUpdateReason = str27;
        this.otherDetail = str28;
        this.lastUsed = dateTime4;
        this.createdAt = dateTime5;
        this.updatedAt = dateTime6;
    }
}
