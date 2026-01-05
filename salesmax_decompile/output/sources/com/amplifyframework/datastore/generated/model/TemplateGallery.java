package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "TemplateGalleries")
/* loaded from: classes5.dex */
public final class TemplateGallery implements Model {

    @ModelField(targetType = "String")
    private final List<String> applicableForIndustry;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime archivedAt;

    @ModelField(targetType = "String")
    private final String archivedStatus;

    @ModelField(targetType = "String")
    private final String category;

    @ModelField(targetType = "String")
    private final String categoryLevelOne;

    @ModelField(targetType = "String")
    private final String categoryLevelTwo;

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

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String language;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String platform;

    @ModelField(targetType = "Int")
    private final Integer savedToWorkspaceTimes;

    @ModelField(targetType = "Int")
    private final Integer sentToWhatsappTimes;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "String")
    private final String templateId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedBy;

    @ModelField(targetType = "Int")
    private final Integer viewedTimes;
    public static final QueryField ID = QueryField.field("TemplateGallery", OutcomeConstants.OUTCOME_ID);
    public static final QueryField PLATFORM = QueryField.field("TemplateGallery", "platform");
    public static final QueryField NAME = QueryField.field("TemplateGallery", "name");
    public static final QueryField COMPONENTS = QueryField.field("TemplateGallery", "components");
    public static final QueryField LANGUAGE = QueryField.field("TemplateGallery", "language");
    public static final QueryField STATUS = QueryField.field("TemplateGallery", "status");
    public static final QueryField CATEGORY = QueryField.field("TemplateGallery", "category");
    public static final QueryField CREATED_BY = QueryField.field("TemplateGallery", "createdBy");
    public static final QueryField UPDATED_BY = QueryField.field("TemplateGallery", "updatedBy");
    public static final QueryField ARCHIVED_STATUS = QueryField.field("TemplateGallery", "archivedStatus");
    public static final QueryField ARCHIVED_AT = QueryField.field("TemplateGallery", "archivedAt");
    public static final QueryField DEFAULT_MEDIA = QueryField.field("TemplateGallery", "defaultMediaId");
    public static final QueryField DEFAULT_VARIABLE_MAP = QueryField.field("TemplateGallery", "defaultVariableMap");
    public static final QueryField TEMPLATE_ID = QueryField.field("TemplateGallery", "templateId");
    public static final QueryField TAGS = QueryField.field("TemplateGallery", "tags");
    public static final QueryField CATEGORY_LEVEL_ONE = QueryField.field("TemplateGallery", "categoryLevelOne");
    public static final QueryField CATEGORY_LEVEL_TWO = QueryField.field("TemplateGallery", "categoryLevelTwo");
    public static final QueryField APPLICABLE_FOR_INDUSTRY = QueryField.field("TemplateGallery", "applicableForIndustry");
    public static final QueryField VIEWED_TIMES = QueryField.field("TemplateGallery", "viewedTimes");
    public static final QueryField SAVED_TO_WORKSPACE_TIMES = QueryField.field("TemplateGallery", "savedToWorkspaceTimes");
    public static final QueryField SENT_TO_WHATSAPP_TIMES = QueryField.field("TemplateGallery", "sentToWhatsappTimes");
    public static final QueryField CREATED_AT = QueryField.field("TemplateGallery", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("TemplateGallery", "updatedAt");

    public interface BuildStep {
        BuildStep applicableForIndustry(List<String> list);

        BuildStep archivedAt(Temporal.DateTime dateTime);

        BuildStep archivedStatus(String str);

        TemplateGallery build();

        BuildStep category(String str);

        BuildStep categoryLevelOne(String str);

        BuildStep categoryLevelTwo(String str);

        BuildStep components(List<TemplateComponent> list);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdBy(String str);

        BuildStep defaultMedia(UploadedFile uploadedFile);

        BuildStep defaultVariableMap(List<MappedVariable> list);

        BuildStep id(String str);

        BuildStep language(String str);

        BuildStep name(String str);

        BuildStep platform(String str);

        BuildStep savedToWorkspaceTimes(Integer num);

        BuildStep sentToWhatsappTimes(Integer num);

        BuildStep status(String str);

        BuildStep tags(List<String> list);

        BuildStep templateId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedBy(String str);

        BuildStep viewedTimes(Integer num);
    }

    public static class Builder implements BuildStep {
        private List<String> applicableForIndustry;
        private Temporal.DateTime archivedAt;
        private String archivedStatus;
        private String category;
        private String categoryLevelOne;
        private String categoryLevelTwo;
        private List<TemplateComponent> components;
        private Temporal.DateTime createdAt;
        private String createdBy;
        private UploadedFile defaultMedia;
        private List<MappedVariable> defaultVariableMap;
        private String id;
        private String language;
        private String name;
        private String platform;
        private Integer savedToWorkspaceTimes;
        private Integer sentToWhatsappTimes;
        private String status;
        private List<String> tags;
        private String templateId;
        private Temporal.DateTime updatedAt;
        private String updatedBy;
        private Integer viewedTimes;

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep applicableForIndustry(List<String> list) {
            this.applicableForIndustry = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep archivedAt(Temporal.DateTime dateTime) {
            this.archivedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep archivedStatus(String str) {
            this.archivedStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public TemplateGallery build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new TemplateGallery(string, this.platform, this.name, this.components, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMedia, this.defaultVariableMap, this.templateId, this.tags, this.categoryLevelOne, this.categoryLevelTwo, this.applicableForIndustry, this.viewedTimes, this.savedToWorkspaceTimes, this.sentToWhatsappTimes, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep category(String str) {
            this.category = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep categoryLevelOne(String str) {
            this.categoryLevelOne = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep categoryLevelTwo(String str) {
            this.categoryLevelTwo = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep components(List<TemplateComponent> list) {
            this.components = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep createdBy(String str) {
            this.createdBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep defaultMedia(UploadedFile uploadedFile) {
            this.defaultMedia = uploadedFile;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep defaultVariableMap(List<MappedVariable> list) {
            this.defaultVariableMap = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep language(String str) {
            this.language = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep platform(String str) {
            this.platform = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep savedToWorkspaceTimes(Integer num) {
            this.savedToWorkspaceTimes = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep sentToWhatsappTimes(Integer num) {
            this.sentToWhatsappTimes = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep templateId(String str) {
            this.templateId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep updatedBy(String str) {
            this.updatedBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public BuildStep viewedTimes(Integer num) {
            this.viewedTimes = num;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, List<TemplateComponent> list, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime, UploadedFile uploadedFile, List<MappedVariable> list2, String str10, List<String> list3, String str11, String str12, List<String> list4, Integer num, Integer num2, Integer num3, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.platform = str2;
            this.name = str3;
            this.components = list;
            this.language = str4;
            this.status = str5;
            this.category = str6;
            this.createdBy = str7;
            this.updatedBy = str8;
            this.archivedStatus = str9;
            this.archivedAt = dateTime;
            this.defaultMedia = uploadedFile;
            this.defaultVariableMap = list2;
            this.templateId = str10;
            this.tags = list3;
            this.categoryLevelOne = str11;
            this.categoryLevelTwo = str12;
            this.applicableForIndustry = list4;
            this.viewedTimes = num;
            this.savedToWorkspaceTimes = num2;
            this.sentToWhatsappTimes = num3;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public /* bridge */ /* synthetic */ BuildStep applicableForIndustry(List list) {
            return applicableForIndustry((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public /* bridge */ /* synthetic */ BuildStep components(List list) {
            return components((List<TemplateComponent>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public /* bridge */ /* synthetic */ BuildStep defaultVariableMap(List list) {
            return defaultVariableMap((List<MappedVariable>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, List<TemplateComponent> list, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime, UploadedFile uploadedFile, List<MappedVariable> list2, String str10, List<String> list3, String str11, String str12, List<String> list4, Integer num, Integer num2, Integer num3, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, str2, str3, list, str4, str5, str6, str7, str8, str9, dateTime, uploadedFile, list2, str10, list3, str11, str12, list4, num, num2, num3, dateTime2, dateTime3);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder applicableForIndustry(List<String> list) {
            return (CopyOfBuilder) super.applicableForIndustry(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder archivedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.archivedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder archivedStatus(String str) {
            return (CopyOfBuilder) super.archivedStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder category(String str) {
            return (CopyOfBuilder) super.category(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder categoryLevelOne(String str) {
            return (CopyOfBuilder) super.categoryLevelOne(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder categoryLevelTwo(String str) {
            return (CopyOfBuilder) super.categoryLevelTwo(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder components(List<TemplateComponent> list) {
            return (CopyOfBuilder) super.components(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder createdBy(String str) {
            return (CopyOfBuilder) super.createdBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder defaultMedia(UploadedFile uploadedFile) {
            return (CopyOfBuilder) super.defaultMedia(uploadedFile);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder defaultVariableMap(List<MappedVariable> list) {
            return (CopyOfBuilder) super.defaultVariableMap(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder language(String str) {
            return (CopyOfBuilder) super.language(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder platform(String str) {
            return (CopyOfBuilder) super.platform(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder savedToWorkspaceTimes(Integer num) {
            return (CopyOfBuilder) super.savedToWorkspaceTimes(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder sentToWhatsappTimes(Integer num) {
            return (CopyOfBuilder) super.sentToWhatsappTimes(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder templateId(String str) {
            return (CopyOfBuilder) super.templateId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder updatedBy(String str) {
            return (CopyOfBuilder) super.updatedBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateGallery.Builder, com.amplifyframework.datastore.generated.model.TemplateGallery.BuildStep
        public CopyOfBuilder viewedTimes(Integer num) {
            return (CopyOfBuilder) super.viewedTimes(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static TemplateGallery justId(String str) {
        return new TemplateGallery(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.platform, this.name, this.components, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMedia, this.defaultVariableMap, this.templateId, this.tags, this.categoryLevelOne, this.categoryLevelTwo, this.applicableForIndustry, this.viewedTimes, this.savedToWorkspaceTimes, this.sentToWhatsappTimes, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TemplateGallery.class != obj.getClass()) {
            return false;
        }
        TemplateGallery templateGallery = (TemplateGallery) obj;
        return s6c.m47909a(getId(), templateGallery.getId()) && s6c.m47909a(getPlatform(), templateGallery.getPlatform()) && s6c.m47909a(getName(), templateGallery.getName()) && s6c.m47909a(getComponents(), templateGallery.getComponents()) && s6c.m47909a(getLanguage(), templateGallery.getLanguage()) && s6c.m47909a(getStatus(), templateGallery.getStatus()) && s6c.m47909a(getCategory(), templateGallery.getCategory()) && s6c.m47909a(getCreatedBy(), templateGallery.getCreatedBy()) && s6c.m47909a(getUpdatedBy(), templateGallery.getUpdatedBy()) && s6c.m47909a(getArchivedStatus(), templateGallery.getArchivedStatus()) && s6c.m47909a(getArchivedAt(), templateGallery.getArchivedAt()) && s6c.m47909a(getDefaultMedia(), templateGallery.getDefaultMedia()) && s6c.m47909a(getDefaultVariableMap(), templateGallery.getDefaultVariableMap()) && s6c.m47909a(getTemplateId(), templateGallery.getTemplateId()) && s6c.m47909a(getTags(), templateGallery.getTags()) && s6c.m47909a(getCategoryLevelOne(), templateGallery.getCategoryLevelOne()) && s6c.m47909a(getCategoryLevelTwo(), templateGallery.getCategoryLevelTwo()) && s6c.m47909a(getApplicableForIndustry(), templateGallery.getApplicableForIndustry()) && s6c.m47909a(getViewedTimes(), templateGallery.getViewedTimes()) && s6c.m47909a(getSavedToWorkspaceTimes(), templateGallery.getSavedToWorkspaceTimes()) && s6c.m47909a(getSentToWhatsappTimes(), templateGallery.getSentToWhatsappTimes()) && s6c.m47909a(getCreatedAt(), templateGallery.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), templateGallery.getUpdatedAt());
    }

    public List<String> getApplicableForIndustry() {
        return this.applicableForIndustry;
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

    public String getCategoryLevelOne() {
        return this.categoryLevelOne;
    }

    public String getCategoryLevelTwo() {
        return this.categoryLevelTwo;
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

    public String getId() {
        return this.id;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getName() {
        return this.name;
    }

    public String getPlatform() {
        return this.platform;
    }

    public Integer getSavedToWorkspaceTimes() {
        return this.savedToWorkspaceTimes;
    }

    public Integer getSentToWhatsappTimes() {
        return this.sentToWhatsappTimes;
    }

    public String getStatus() {
        return this.status;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public Integer getViewedTimes() {
        return this.viewedTimes;
    }

    public int hashCode() {
        return (getId() + getPlatform() + getName() + getComponents() + getLanguage() + getStatus() + getCategory() + getCreatedBy() + getUpdatedBy() + getArchivedStatus() + getArchivedAt() + getDefaultMedia() + getDefaultVariableMap() + getTemplateId() + getTags() + getCategoryLevelOne() + getCategoryLevelTwo() + getApplicableForIndustry() + getViewedTimes() + getSavedToWorkspaceTimes() + getSentToWhatsappTimes() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TemplateGallery {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("platform=" + String.valueOf(getPlatform()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("components=" + String.valueOf(getComponents()) + ", ");
        sb.append("language=" + String.valueOf(getLanguage()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("category=" + String.valueOf(getCategory()) + ", ");
        sb.append("createdBy=" + String.valueOf(getCreatedBy()) + ", ");
        sb.append("updatedBy=" + String.valueOf(getUpdatedBy()) + ", ");
        sb.append("archivedStatus=" + String.valueOf(getArchivedStatus()) + ", ");
        sb.append("archivedAt=" + String.valueOf(getArchivedAt()) + ", ");
        sb.append("defaultMedia=" + String.valueOf(getDefaultMedia()) + ", ");
        sb.append("defaultVariableMap=" + String.valueOf(getDefaultVariableMap()) + ", ");
        sb.append("templateId=" + String.valueOf(getTemplateId()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("categoryLevelOne=" + String.valueOf(getCategoryLevelOne()) + ", ");
        sb.append("categoryLevelTwo=" + String.valueOf(getCategoryLevelTwo()) + ", ");
        sb.append("applicableForIndustry=" + String.valueOf(getApplicableForIndustry()) + ", ");
        sb.append("viewedTimes=" + String.valueOf(getViewedTimes()) + ", ");
        sb.append("savedToWorkspaceTimes=" + String.valueOf(getSavedToWorkspaceTimes()) + ", ");
        sb.append("sentToWhatsappTimes=" + String.valueOf(getSentToWhatsappTimes()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private TemplateGallery(String str, String str2, String str3, List<TemplateComponent> list, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime, UploadedFile uploadedFile, List<MappedVariable> list2, String str10, List<String> list3, String str11, String str12, List<String> list4, Integer num, Integer num2, Integer num3, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.id = str;
        this.platform = str2;
        this.name = str3;
        this.components = list;
        this.language = str4;
        this.status = str5;
        this.category = str6;
        this.createdBy = str7;
        this.updatedBy = str8;
        this.archivedStatus = str9;
        this.archivedAt = dateTime;
        this.defaultMedia = uploadedFile;
        this.defaultVariableMap = list2;
        this.templateId = str10;
        this.tags = list3;
        this.categoryLevelOne = str11;
        this.categoryLevelTwo = str12;
        this.applicableForIndustry = list4;
        this.viewedTimes = num;
        this.savedToWorkspaceTimes = num2;
        this.sentToWhatsappTimes = num3;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
