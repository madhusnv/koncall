package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateWhasappTemplatesInput implements InputType {
    private final String accountId;
    private final Input<ActionInteractiveInput> actionInteractive;
    private final Input<String> archivedAt;
    private final Input<String> archivedStatus;
    private final Input<String> category;
    private final Input<List<TemplateComponentInput>> components;
    private final Input<String> createdAt;
    private final Input<String> createdBy;
    private final Input<String> defaultMediaId;
    private final Input<List<MappedVariableInput>> defaultVariableMap;
    private final Input<String> footerText;
    private final Input<String> headerText;
    private final Input<String> headerType;
    private final Input<String> id;
    private final Input<Boolean> isSample;
    private final Input<String> language;
    private final Input<String> lastUsed;
    private final Input<String> locationObjectToSend;
    private final Input<String> messageSubType;
    private final Input<String> messageTemplateQualityNew;
    private final Input<String> messageTemplateQualityPrevious;
    private final Input<String> messageTemplateQualityUpdatedAt;
    private final Input<String> messageTemplateStatusUpdatedAt;
    private final Input<String> messageType;
    private final Input<String> name;
    private final Input<String> otherDetail;
    private final Input<String> platform;
    private final Input<String> snippetCategory;
    private final Input<String> snippetSubCategory;
    private final Input<String> snippetType;
    private final Input<String> status;
    private final Input<String> stausUpdateReason;
    private final Input<String> subCategory;
    private final Input<List<String>> tags;
    private final Input<String> templateId;
    private final Input<String> templateType;
    private final Input<String> text;
    private final Input<String> updatedAt;
    private final Input<String> updatedBy;
    private final Input<String> whatsappBusinessAccount;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> whatsappBusinessAccount = Input.absent();
        private Input<String> templateType = Input.absent();
        private Input<String> snippetType = Input.absent();
        private Input<String> platform = Input.absent();
        private Input<String> name = Input.absent();
        private Input<List<TemplateComponentInput>> components = Input.absent();
        private Input<String> language = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> category = Input.absent();
        private Input<String> subCategory = Input.absent();
        private Input<String> snippetCategory = Input.absent();
        private Input<String> snippetSubCategory = Input.absent();
        private Input<String> createdBy = Input.absent();
        private Input<String> updatedBy = Input.absent();
        private Input<String> archivedStatus = Input.absent();
        private Input<String> archivedAt = Input.absent();
        private Input<String> defaultMediaId = Input.absent();
        private Input<List<MappedVariableInput>> defaultVariableMap = Input.absent();
        private Input<String> templateId = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<Boolean> isSample = Input.absent();
        private Input<String> messageType = Input.absent();
        private Input<String> messageSubType = Input.absent();
        private Input<String> text = Input.absent();
        private Input<String> locationObjectToSend = Input.absent();
        private Input<String> headerText = Input.absent();
        private Input<String> footerText = Input.absent();
        private Input<String> headerType = Input.absent();
        private Input<ActionInteractiveInput> actionInteractive = Input.absent();
        private Input<String> messageTemplateQualityNew = Input.absent();
        private Input<String> messageTemplateQualityPrevious = Input.absent();
        private Input<String> messageTemplateQualityUpdatedAt = Input.absent();
        private Input<String> messageTemplateStatusUpdatedAt = Input.absent();
        private Input<String> stausUpdateReason = Input.absent();
        private Input<String> otherDetail = Input.absent();
        private Input<String> lastUsed = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder actionInteractive(ActionInteractiveInput actionInteractiveInput) {
            this.actionInteractive = Input.fromNullable(actionInteractiveInput);
            return this;
        }

        public Builder archivedAt(String str) {
            this.archivedAt = Input.fromNullable(str);
            return this;
        }

        public Builder archivedStatus(String str) {
            this.archivedStatus = Input.fromNullable(str);
            return this;
        }

        public CreateWhasappTemplatesInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateWhasappTemplatesInput(this.id, this.accountId, this.whatsappBusinessAccount, this.templateType, this.snippetType, this.platform, this.name, this.components, this.language, this.status, this.category, this.subCategory, this.snippetCategory, this.snippetSubCategory, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.defaultVariableMap, this.templateId, this.tags, this.isSample, this.messageType, this.messageSubType, this.text, this.locationObjectToSend, this.headerText, this.footerText, this.headerType, this.actionInteractive, this.messageTemplateQualityNew, this.messageTemplateQualityPrevious, this.messageTemplateQualityUpdatedAt, this.messageTemplateStatusUpdatedAt, this.stausUpdateReason, this.otherDetail, this.lastUsed, this.createdAt, this.updatedAt);
        }

        public Builder category(String str) {
            this.category = Input.fromNullable(str);
            return this;
        }

        public Builder components(List<TemplateComponentInput> list) {
            this.components = Input.fromNullable(list);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdBy(String str) {
            this.createdBy = Input.fromNullable(str);
            return this;
        }

        public Builder defaultMediaId(String str) {
            this.defaultMediaId = Input.fromNullable(str);
            return this;
        }

        public Builder defaultVariableMap(List<MappedVariableInput> list) {
            this.defaultVariableMap = Input.fromNullable(list);
            return this;
        }

        public Builder footerText(String str) {
            this.footerText = Input.fromNullable(str);
            return this;
        }

        public Builder headerText(String str) {
            this.headerText = Input.fromNullable(str);
            return this;
        }

        public Builder headerType(String str) {
            this.headerType = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder isSample(Boolean bool) {
            this.isSample = Input.fromNullable(bool);
            return this;
        }

        public Builder language(String str) {
            this.language = Input.fromNullable(str);
            return this;
        }

        public Builder lastUsed(String str) {
            this.lastUsed = Input.fromNullable(str);
            return this;
        }

        public Builder locationObjectToSend(String str) {
            this.locationObjectToSend = Input.fromNullable(str);
            return this;
        }

        public Builder messageSubType(String str) {
            this.messageSubType = Input.fromNullable(str);
            return this;
        }

        public Builder messageTemplateQualityNew(String str) {
            this.messageTemplateQualityNew = Input.fromNullable(str);
            return this;
        }

        public Builder messageTemplateQualityPrevious(String str) {
            this.messageTemplateQualityPrevious = Input.fromNullable(str);
            return this;
        }

        public Builder messageTemplateQualityUpdatedAt(String str) {
            this.messageTemplateQualityUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder messageTemplateStatusUpdatedAt(String str) {
            this.messageTemplateStatusUpdatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder messageType(String str) {
            this.messageType = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder otherDetail(String str) {
            this.otherDetail = Input.fromNullable(str);
            return this;
        }

        public Builder platform(String str) {
            this.platform = Input.fromNullable(str);
            return this;
        }

        public Builder snippetCategory(String str) {
            this.snippetCategory = Input.fromNullable(str);
            return this;
        }

        public Builder snippetSubCategory(String str) {
            this.snippetSubCategory = Input.fromNullable(str);
            return this;
        }

        public Builder snippetType(String str) {
            this.snippetType = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder stausUpdateReason(String str) {
            this.stausUpdateReason = Input.fromNullable(str);
            return this;
        }

        public Builder subCategory(String str) {
            this.subCategory = Input.fromNullable(str);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder templateId(String str) {
            this.templateId = Input.fromNullable(str);
            return this;
        }

        public Builder templateType(String str) {
            this.templateType = Input.fromNullable(str);
            return this;
        }

        public Builder text(String str) {
            this.text = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedBy(String str) {
            this.updatedBy = Input.fromNullable(str);
            return this;
        }

        public Builder whatsappBusinessAccount(String str) {
            this.whatsappBusinessAccount = Input.fromNullable(str);
            return this;
        }
    }

    public CreateWhasappTemplatesInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<List<TemplateComponentInput>> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<List<MappedVariableInput>> input19, Input<String> input20, Input<List<String>> input21, Input<Boolean> input22, Input<String> input23, Input<String> input24, Input<String> input25, Input<String> input26, Input<String> input27, Input<String> input28, Input<String> input29, Input<ActionInteractiveInput> input30, Input<String> input31, Input<String> input32, Input<String> input33, Input<String> input34, Input<String> input35, Input<String> input36, Input<String> input37, Input<String> input38, Input<String> input39) {
        this.id = input;
        this.accountId = str;
        this.whatsappBusinessAccount = input2;
        this.templateType = input3;
        this.snippetType = input4;
        this.platform = input5;
        this.name = input6;
        this.components = input7;
        this.language = input8;
        this.status = input9;
        this.category = input10;
        this.subCategory = input11;
        this.snippetCategory = input12;
        this.snippetSubCategory = input13;
        this.createdBy = input14;
        this.updatedBy = input15;
        this.archivedStatus = input16;
        this.archivedAt = input17;
        this.defaultMediaId = input18;
        this.defaultVariableMap = input19;
        this.templateId = input20;
        this.tags = input21;
        this.isSample = input22;
        this.messageType = input23;
        this.messageSubType = input24;
        this.text = input25;
        this.locationObjectToSend = input26;
        this.headerText = input27;
        this.footerText = input28;
        this.headerType = input29;
        this.actionInteractive = input30;
        this.messageTemplateQualityNew = input31;
        this.messageTemplateQualityPrevious = input32;
        this.messageTemplateQualityUpdatedAt = input33;
        this.messageTemplateStatusUpdatedAt = input34;
        this.stausUpdateReason = input35;
        this.otherDetail = input36;
        this.lastUsed = input37;
        this.createdAt = input38;
        this.updatedAt = input39;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public ActionInteractiveInput actionInteractive() {
        return this.actionInteractive.value;
    }

    public String archivedAt() {
        return this.archivedAt.value;
    }

    public String archivedStatus() {
        return this.archivedStatus.value;
    }

    public String category() {
        return this.category.value;
    }

    public List<TemplateComponentInput> components() {
        return this.components.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdBy() {
        return this.createdBy.value;
    }

    public String defaultMediaId() {
        return this.defaultMediaId.value;
    }

    public List<MappedVariableInput> defaultVariableMap() {
        return this.defaultVariableMap.value;
    }

    public String footerText() {
        return this.footerText.value;
    }

    public String headerText() {
        return this.headerText.value;
    }

    public String headerType() {
        return this.headerType.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isSample() {
        return this.isSample.value;
    }

    public String language() {
        return this.language.value;
    }

    public String lastUsed() {
        return this.lastUsed.value;
    }

    public String locationObjectToSend() {
        return this.locationObjectToSend.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWhasappTemplatesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateWhasappTemplatesInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateWhasappTemplatesInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateWhasappTemplatesInput.this.accountId);
                if (CreateWhasappTemplatesInput.this.whatsappBusinessAccount.defined) {
                    inputFieldWriter.writeString("whatsappBusinessAccount", (String) CreateWhasappTemplatesInput.this.whatsappBusinessAccount.value);
                }
                if (CreateWhasappTemplatesInput.this.templateType.defined) {
                    inputFieldWriter.writeString("templateType", (String) CreateWhasappTemplatesInput.this.templateType.value);
                }
                if (CreateWhasappTemplatesInput.this.snippetType.defined) {
                    inputFieldWriter.writeString("snippetType", (String) CreateWhasappTemplatesInput.this.snippetType.value);
                }
                if (CreateWhasappTemplatesInput.this.platform.defined) {
                    inputFieldWriter.writeString("platform", (String) CreateWhasappTemplatesInput.this.platform.value);
                }
                if (CreateWhasappTemplatesInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateWhasappTemplatesInput.this.name.value);
                }
                if (CreateWhasappTemplatesInput.this.components.defined) {
                    inputFieldWriter.writeList("components", CreateWhasappTemplatesInput.this.components.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateWhasappTemplatesInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateWhasappTemplatesInput.this.components.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TemplateComponentInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateWhasappTemplatesInput.this.language.defined) {
                    inputFieldWriter.writeString("language", (String) CreateWhasappTemplatesInput.this.language.value);
                }
                if (CreateWhasappTemplatesInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateWhasappTemplatesInput.this.status.value);
                }
                if (CreateWhasappTemplatesInput.this.category.defined) {
                    inputFieldWriter.writeString("category", (String) CreateWhasappTemplatesInput.this.category.value);
                }
                if (CreateWhasappTemplatesInput.this.subCategory.defined) {
                    inputFieldWriter.writeString("subCategory", (String) CreateWhasappTemplatesInput.this.subCategory.value);
                }
                if (CreateWhasappTemplatesInput.this.snippetCategory.defined) {
                    inputFieldWriter.writeString("snippetCategory", (String) CreateWhasappTemplatesInput.this.snippetCategory.value);
                }
                if (CreateWhasappTemplatesInput.this.snippetSubCategory.defined) {
                    inputFieldWriter.writeString("snippetSubCategory", (String) CreateWhasappTemplatesInput.this.snippetSubCategory.value);
                }
                if (CreateWhasappTemplatesInput.this.createdBy.defined) {
                    inputFieldWriter.writeString("createdBy", (String) CreateWhasappTemplatesInput.this.createdBy.value);
                }
                if (CreateWhasappTemplatesInput.this.updatedBy.defined) {
                    inputFieldWriter.writeString("updatedBy", (String) CreateWhasappTemplatesInput.this.updatedBy.value);
                }
                if (CreateWhasappTemplatesInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeString("archivedStatus", (String) CreateWhasappTemplatesInput.this.archivedStatus.value);
                }
                if (CreateWhasappTemplatesInput.this.archivedAt.defined) {
                    inputFieldWriter.writeString("archivedAt", (String) CreateWhasappTemplatesInput.this.archivedAt.value);
                }
                if (CreateWhasappTemplatesInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeString("defaultMediaId", (String) CreateWhasappTemplatesInput.this.defaultMediaId.value);
                }
                if (CreateWhasappTemplatesInput.this.defaultVariableMap.defined) {
                    inputFieldWriter.writeList("defaultVariableMap", CreateWhasappTemplatesInput.this.defaultVariableMap.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateWhasappTemplatesInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateWhasappTemplatesInput.this.defaultVariableMap.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MappedVariableInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateWhasappTemplatesInput.this.templateId.defined) {
                    inputFieldWriter.writeString("templateId", (String) CreateWhasappTemplatesInput.this.templateId.value);
                }
                if (CreateWhasappTemplatesInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateWhasappTemplatesInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateWhasappTemplatesInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateWhasappTemplatesInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateWhasappTemplatesInput.this.isSample.defined) {
                    inputFieldWriter.writeBoolean("isSample", (Boolean) CreateWhasappTemplatesInput.this.isSample.value);
                }
                if (CreateWhasappTemplatesInput.this.messageType.defined) {
                    inputFieldWriter.writeString("messageType", (String) CreateWhasappTemplatesInput.this.messageType.value);
                }
                if (CreateWhasappTemplatesInput.this.messageSubType.defined) {
                    inputFieldWriter.writeString("messageSubType", (String) CreateWhasappTemplatesInput.this.messageSubType.value);
                }
                if (CreateWhasappTemplatesInput.this.text.defined) {
                    inputFieldWriter.writeString("text", (String) CreateWhasappTemplatesInput.this.text.value);
                }
                if (CreateWhasappTemplatesInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeString("locationObjectToSend", (String) CreateWhasappTemplatesInput.this.locationObjectToSend.value);
                }
                if (CreateWhasappTemplatesInput.this.headerText.defined) {
                    inputFieldWriter.writeString("headerText", (String) CreateWhasappTemplatesInput.this.headerText.value);
                }
                if (CreateWhasappTemplatesInput.this.footerText.defined) {
                    inputFieldWriter.writeString("footerText", (String) CreateWhasappTemplatesInput.this.footerText.value);
                }
                if (CreateWhasappTemplatesInput.this.headerType.defined) {
                    inputFieldWriter.writeString("headerType", (String) CreateWhasappTemplatesInput.this.headerType.value);
                }
                if (CreateWhasappTemplatesInput.this.actionInteractive.defined) {
                    inputFieldWriter.writeObject("actionInteractive", CreateWhasappTemplatesInput.this.actionInteractive.value != 0 ? ((ActionInteractiveInput) CreateWhasappTemplatesInput.this.actionInteractive.value).marshaller() : null);
                }
                if (CreateWhasappTemplatesInput.this.messageTemplateQualityNew.defined) {
                    inputFieldWriter.writeString("messageTemplateQualityNew", (String) CreateWhasappTemplatesInput.this.messageTemplateQualityNew.value);
                }
                if (CreateWhasappTemplatesInput.this.messageTemplateQualityPrevious.defined) {
                    inputFieldWriter.writeString("messageTemplateQualityPrevious", (String) CreateWhasappTemplatesInput.this.messageTemplateQualityPrevious.value);
                }
                if (CreateWhasappTemplatesInput.this.messageTemplateQualityUpdatedAt.defined) {
                    inputFieldWriter.writeString("messageTemplateQualityUpdatedAt", (String) CreateWhasappTemplatesInput.this.messageTemplateQualityUpdatedAt.value);
                }
                if (CreateWhasappTemplatesInput.this.messageTemplateStatusUpdatedAt.defined) {
                    inputFieldWriter.writeString("messageTemplateStatusUpdatedAt", (String) CreateWhasappTemplatesInput.this.messageTemplateStatusUpdatedAt.value);
                }
                if (CreateWhasappTemplatesInput.this.stausUpdateReason.defined) {
                    inputFieldWriter.writeString("stausUpdateReason", (String) CreateWhasappTemplatesInput.this.stausUpdateReason.value);
                }
                if (CreateWhasappTemplatesInput.this.otherDetail.defined) {
                    inputFieldWriter.writeString("otherDetail", (String) CreateWhasappTemplatesInput.this.otherDetail.value);
                }
                if (CreateWhasappTemplatesInput.this.lastUsed.defined) {
                    inputFieldWriter.writeString("lastUsed", (String) CreateWhasappTemplatesInput.this.lastUsed.value);
                }
                if (CreateWhasappTemplatesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateWhasappTemplatesInput.this.createdAt.value);
                }
                if (CreateWhasappTemplatesInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateWhasappTemplatesInput.this.updatedAt.value);
                }
            }
        };
    }

    public String messageSubType() {
        return this.messageSubType.value;
    }

    public String messageTemplateQualityNew() {
        return this.messageTemplateQualityNew.value;
    }

    public String messageTemplateQualityPrevious() {
        return this.messageTemplateQualityPrevious.value;
    }

    public String messageTemplateQualityUpdatedAt() {
        return this.messageTemplateQualityUpdatedAt.value;
    }

    public String messageTemplateStatusUpdatedAt() {
        return this.messageTemplateStatusUpdatedAt.value;
    }

    public String messageType() {
        return this.messageType.value;
    }

    public String name() {
        return this.name.value;
    }

    public String otherDetail() {
        return this.otherDetail.value;
    }

    public String platform() {
        return this.platform.value;
    }

    public String snippetCategory() {
        return this.snippetCategory.value;
    }

    public String snippetSubCategory() {
        return this.snippetSubCategory.value;
    }

    public String snippetType() {
        return this.snippetType.value;
    }

    public String status() {
        return this.status.value;
    }

    public String stausUpdateReason() {
        return this.stausUpdateReason.value;
    }

    public String subCategory() {
        return this.subCategory.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public String templateId() {
        return this.templateId.value;
    }

    public String templateType() {
        return this.templateType.value;
    }

    public String text() {
        return this.text.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedBy() {
        return this.updatedBy.value;
    }

    public String whatsappBusinessAccount() {
        return this.whatsappBusinessAccount.value;
    }
}
