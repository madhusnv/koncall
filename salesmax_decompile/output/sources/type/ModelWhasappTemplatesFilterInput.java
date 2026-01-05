package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWhasappTemplatesFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWhasappTemplatesFilterInput>> and;
    private final Input<ModelStringInput> archivedAt;
    private final Input<ModelStringInput> archivedStatus;
    private final Input<ModelStringInput> category;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelIDInput> defaultMediaId;
    private final Input<ModelStringInput> footerText;
    private final Input<ModelStringInput> headerText;
    private final Input<ModelStringInput> headerType;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isSample;
    private final Input<ModelStringInput> language;
    private final Input<ModelStringInput> lastUsed;
    private final Input<ModelStringInput> locationObjectToSend;
    private final Input<ModelStringInput> messageSubType;
    private final Input<ModelStringInput> messageTemplateQualityNew;
    private final Input<ModelStringInput> messageTemplateQualityPrevious;
    private final Input<ModelStringInput> messageTemplateQualityUpdatedAt;
    private final Input<ModelStringInput> messageTemplateStatusUpdatedAt;
    private final Input<ModelStringInput> messageType;
    private final Input<ModelStringInput> name;
    private final Input<ModelWhasappTemplatesFilterInput> not;
    private final Input<List<ModelWhasappTemplatesFilterInput>> or;
    private final Input<ModelStringInput> otherDetail;
    private final Input<ModelStringInput> platform;
    private final Input<ModelStringInput> snippetCategory;
    private final Input<ModelStringInput> snippetSubCategory;
    private final Input<ModelStringInput> snippetType;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> stausUpdateReason;
    private final Input<ModelStringInput> subCategory;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> templateId;
    private final Input<ModelStringInput> templateType;
    private final Input<ModelStringInput> text;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedBy;
    private final Input<ModelIDInput> whatsappBusinessAccount;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> whatsappBusinessAccount = Input.absent();
        private Input<ModelStringInput> templateType = Input.absent();
        private Input<ModelStringInput> snippetType = Input.absent();
        private Input<ModelStringInput> platform = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> language = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> category = Input.absent();
        private Input<ModelStringInput> subCategory = Input.absent();
        private Input<ModelStringInput> snippetCategory = Input.absent();
        private Input<ModelStringInput> snippetSubCategory = Input.absent();
        private Input<ModelIDInput> createdBy = Input.absent();
        private Input<ModelIDInput> updatedBy = Input.absent();
        private Input<ModelStringInput> archivedStatus = Input.absent();
        private Input<ModelStringInput> archivedAt = Input.absent();
        private Input<ModelIDInput> defaultMediaId = Input.absent();
        private Input<ModelStringInput> templateId = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelBooleanInput> isSample = Input.absent();
        private Input<ModelStringInput> messageType = Input.absent();
        private Input<ModelStringInput> messageSubType = Input.absent();
        private Input<ModelStringInput> text = Input.absent();
        private Input<ModelStringInput> locationObjectToSend = Input.absent();
        private Input<ModelStringInput> headerText = Input.absent();
        private Input<ModelStringInput> footerText = Input.absent();
        private Input<ModelStringInput> headerType = Input.absent();
        private Input<ModelStringInput> messageTemplateQualityNew = Input.absent();
        private Input<ModelStringInput> messageTemplateQualityPrevious = Input.absent();
        private Input<ModelStringInput> messageTemplateQualityUpdatedAt = Input.absent();
        private Input<ModelStringInput> messageTemplateStatusUpdatedAt = Input.absent();
        private Input<ModelStringInput> stausUpdateReason = Input.absent();
        private Input<ModelStringInput> otherDetail = Input.absent();
        private Input<ModelStringInput> lastUsed = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelWhasappTemplatesFilterInput>> and = Input.absent();
        private Input<List<ModelWhasappTemplatesFilterInput>> or = Input.absent();
        private Input<ModelWhasappTemplatesFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWhasappTemplatesFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder archivedAt(ModelStringInput modelStringInput) {
            this.archivedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder archivedStatus(ModelStringInput modelStringInput) {
            this.archivedStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelWhasappTemplatesFilterInput build() {
            return new ModelWhasappTemplatesFilterInput(this.id, this.accountId, this.whatsappBusinessAccount, this.templateType, this.snippetType, this.platform, this.name, this.language, this.status, this.category, this.subCategory, this.snippetCategory, this.snippetSubCategory, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.templateId, this.tags, this.isSample, this.messageType, this.messageSubType, this.text, this.locationObjectToSend, this.headerText, this.footerText, this.headerType, this.messageTemplateQualityNew, this.messageTemplateQualityPrevious, this.messageTemplateQualityUpdatedAt, this.messageTemplateStatusUpdatedAt, this.stausUpdateReason, this.otherDetail, this.lastUsed, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(ModelStringInput modelStringInput) {
            this.category = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdBy(ModelIDInput modelIDInput) {
            this.createdBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder defaultMediaId(ModelIDInput modelIDInput) {
            this.defaultMediaId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder footerText(ModelStringInput modelStringInput) {
            this.footerText = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder headerText(ModelStringInput modelStringInput) {
            this.headerText = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder headerType(ModelStringInput modelStringInput) {
            this.headerType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isSample(ModelBooleanInput modelBooleanInput) {
            this.isSample = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder language(ModelStringInput modelStringInput) {
            this.language = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder lastUsed(ModelStringInput modelStringInput) {
            this.lastUsed = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder locationObjectToSend(ModelStringInput modelStringInput) {
            this.locationObjectToSend = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageSubType(ModelStringInput modelStringInput) {
            this.messageSubType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageTemplateQualityNew(ModelStringInput modelStringInput) {
            this.messageTemplateQualityNew = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageTemplateQualityPrevious(ModelStringInput modelStringInput) {
            this.messageTemplateQualityPrevious = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageTemplateQualityUpdatedAt(ModelStringInput modelStringInput) {
            this.messageTemplateQualityUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageTemplateStatusUpdatedAt(ModelStringInput modelStringInput) {
            this.messageTemplateStatusUpdatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder messageType(ModelStringInput modelStringInput) {
            this.messageType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInput) {
            this.not = Input.fromNullable(modelWhasappTemplatesFilterInput);
            return this;
        }

        public Builder or(List<ModelWhasappTemplatesFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder otherDetail(ModelStringInput modelStringInput) {
            this.otherDetail = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder platform(ModelStringInput modelStringInput) {
            this.platform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder snippetCategory(ModelStringInput modelStringInput) {
            this.snippetCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder snippetSubCategory(ModelStringInput modelStringInput) {
            this.snippetSubCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder snippetType(ModelStringInput modelStringInput) {
            this.snippetType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder stausUpdateReason(ModelStringInput modelStringInput) {
            this.stausUpdateReason = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder subCategory(ModelStringInput modelStringInput) {
            this.subCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateId(ModelStringInput modelStringInput) {
            this.templateId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateType(ModelStringInput modelStringInput) {
            this.templateType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder text(ModelStringInput modelStringInput) {
            this.text = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedBy(ModelIDInput modelIDInput) {
            this.updatedBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder whatsappBusinessAccount(ModelIDInput modelIDInput) {
            this.whatsappBusinessAccount = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelWhasappTemplatesFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelIDInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelBooleanInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<ModelStringInput> input37, Input<List<ModelWhasappTemplatesFilterInput>> input38, Input<List<ModelWhasappTemplatesFilterInput>> input39, Input<ModelWhasappTemplatesFilterInput> input40) {
        this.id = input;
        this.accountId = input2;
        this.whatsappBusinessAccount = input3;
        this.templateType = input4;
        this.snippetType = input5;
        this.platform = input6;
        this.name = input7;
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
        this.templateId = input19;
        this.tags = input20;
        this.isSample = input21;
        this.messageType = input22;
        this.messageSubType = input23;
        this.text = input24;
        this.locationObjectToSend = input25;
        this.headerText = input26;
        this.footerText = input27;
        this.headerType = input28;
        this.messageTemplateQualityNew = input29;
        this.messageTemplateQualityPrevious = input30;
        this.messageTemplateQualityUpdatedAt = input31;
        this.messageTemplateStatusUpdatedAt = input32;
        this.stausUpdateReason = input33;
        this.otherDetail = input34;
        this.lastUsed = input35;
        this.createdAt = input36;
        this.updatedAt = input37;
        this.and = input38;
        this.or = input39;
        this.not = input40;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWhasappTemplatesFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput archivedAt() {
        return this.archivedAt.value;
    }

    public ModelStringInput archivedStatus() {
        return this.archivedStatus.value;
    }

    public ModelStringInput category() {
        return this.category.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdBy() {
        return this.createdBy.value;
    }

    public ModelIDInput defaultMediaId() {
        return this.defaultMediaId.value;
    }

    public ModelStringInput footerText() {
        return this.footerText.value;
    }

    public ModelStringInput headerText() {
        return this.headerText.value;
    }

    public ModelStringInput headerType() {
        return this.headerType.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isSample() {
        return this.isSample.value;
    }

    public ModelStringInput language() {
        return this.language.value;
    }

    public ModelStringInput lastUsed() {
        return this.lastUsed.value;
    }

    public ModelStringInput locationObjectToSend() {
        return this.locationObjectToSend.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWhasappTemplatesFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWhasappTemplatesFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelWhasappTemplatesFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWhasappTemplatesFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.whatsappBusinessAccount.defined) {
                    inputFieldWriter.writeObject("whatsappBusinessAccount", ModelWhasappTemplatesFilterInput.this.whatsappBusinessAccount.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesFilterInput.this.whatsappBusinessAccount.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.templateType.defined) {
                    inputFieldWriter.writeObject("templateType", ModelWhasappTemplatesFilterInput.this.templateType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.templateType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.snippetType.defined) {
                    inputFieldWriter.writeObject("snippetType", ModelWhasappTemplatesFilterInput.this.snippetType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.snippetType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.platform.defined) {
                    inputFieldWriter.writeObject("platform", ModelWhasappTemplatesFilterInput.this.platform.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.platform.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelWhasappTemplatesFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.language.defined) {
                    inputFieldWriter.writeObject("language", ModelWhasappTemplatesFilterInput.this.language.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.language.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWhasappTemplatesFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelWhasappTemplatesFilterInput.this.category.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.category.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.subCategory.defined) {
                    inputFieldWriter.writeObject("subCategory", ModelWhasappTemplatesFilterInput.this.subCategory.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.subCategory.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.snippetCategory.defined) {
                    inputFieldWriter.writeObject("snippetCategory", ModelWhasappTemplatesFilterInput.this.snippetCategory.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.snippetCategory.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.snippetSubCategory.defined) {
                    inputFieldWriter.writeObject("snippetSubCategory", ModelWhasappTemplatesFilterInput.this.snippetSubCategory.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.snippetSubCategory.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelWhasappTemplatesFilterInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelWhasappTemplatesFilterInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeObject("archivedStatus", ModelWhasappTemplatesFilterInput.this.archivedStatus.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.archivedStatus.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.archivedAt.defined) {
                    inputFieldWriter.writeObject("archivedAt", ModelWhasappTemplatesFilterInput.this.archivedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.archivedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeObject("defaultMediaId", ModelWhasappTemplatesFilterInput.this.defaultMediaId.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesFilterInput.this.defaultMediaId.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.templateId.defined) {
                    inputFieldWriter.writeObject("templateId", ModelWhasappTemplatesFilterInput.this.templateId.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.templateId.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelWhasappTemplatesFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.isSample.defined) {
                    inputFieldWriter.writeObject("isSample", ModelWhasappTemplatesFilterInput.this.isSample.value != 0 ? ((ModelBooleanInput) ModelWhasappTemplatesFilterInput.this.isSample.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", ModelWhasappTemplatesFilterInput.this.messageType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.messageType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.messageSubType.defined) {
                    inputFieldWriter.writeObject("messageSubType", ModelWhasappTemplatesFilterInput.this.messageSubType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.messageSubType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.text.defined) {
                    inputFieldWriter.writeObject("text", ModelWhasappTemplatesFilterInput.this.text.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.text.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeObject("locationObjectToSend", ModelWhasappTemplatesFilterInput.this.locationObjectToSend.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.locationObjectToSend.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.headerText.defined) {
                    inputFieldWriter.writeObject("headerText", ModelWhasappTemplatesFilterInput.this.headerText.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.headerText.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.footerText.defined) {
                    inputFieldWriter.writeObject("footerText", ModelWhasappTemplatesFilterInput.this.footerText.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.footerText.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.headerType.defined) {
                    inputFieldWriter.writeObject("headerType", ModelWhasappTemplatesFilterInput.this.headerType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.headerType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.messageTemplateQualityNew.defined) {
                    inputFieldWriter.writeObject("messageTemplateQualityNew", ModelWhasappTemplatesFilterInput.this.messageTemplateQualityNew.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.messageTemplateQualityNew.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.messageTemplateQualityPrevious.defined) {
                    inputFieldWriter.writeObject("messageTemplateQualityPrevious", ModelWhasappTemplatesFilterInput.this.messageTemplateQualityPrevious.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.messageTemplateQualityPrevious.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.messageTemplateQualityUpdatedAt.defined) {
                    inputFieldWriter.writeObject("messageTemplateQualityUpdatedAt", ModelWhasappTemplatesFilterInput.this.messageTemplateQualityUpdatedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.messageTemplateQualityUpdatedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.messageTemplateStatusUpdatedAt.defined) {
                    inputFieldWriter.writeObject("messageTemplateStatusUpdatedAt", ModelWhasappTemplatesFilterInput.this.messageTemplateStatusUpdatedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.messageTemplateStatusUpdatedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.stausUpdateReason.defined) {
                    inputFieldWriter.writeObject("stausUpdateReason", ModelWhasappTemplatesFilterInput.this.stausUpdateReason.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.stausUpdateReason.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.otherDetail.defined) {
                    inputFieldWriter.writeObject("otherDetail", ModelWhasappTemplatesFilterInput.this.otherDetail.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.otherDetail.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.lastUsed.defined) {
                    inputFieldWriter.writeObject("lastUsed", ModelWhasappTemplatesFilterInput.this.lastUsed.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.lastUsed.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWhasappTemplatesFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWhasappTemplatesFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWhasappTemplatesFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWhasappTemplatesFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWhasappTemplatesFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWhasappTemplatesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWhasappTemplatesFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWhasappTemplatesFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWhasappTemplatesFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWhasappTemplatesFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWhasappTemplatesFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWhasappTemplatesFilterInput.this.not.value != 0 ? ((ModelWhasappTemplatesFilterInput) ModelWhasappTemplatesFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput messageSubType() {
        return this.messageSubType.value;
    }

    public ModelStringInput messageTemplateQualityNew() {
        return this.messageTemplateQualityNew.value;
    }

    public ModelStringInput messageTemplateQualityPrevious() {
        return this.messageTemplateQualityPrevious.value;
    }

    public ModelStringInput messageTemplateQualityUpdatedAt() {
        return this.messageTemplateQualityUpdatedAt.value;
    }

    public ModelStringInput messageTemplateStatusUpdatedAt() {
        return this.messageTemplateStatusUpdatedAt.value;
    }

    public ModelStringInput messageType() {
        return this.messageType.value;
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelWhasappTemplatesFilterInput not() {
        return this.not.value;
    }

    public List<ModelWhasappTemplatesFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput otherDetail() {
        return this.otherDetail.value;
    }

    public ModelStringInput platform() {
        return this.platform.value;
    }

    public ModelStringInput snippetCategory() {
        return this.snippetCategory.value;
    }

    public ModelStringInput snippetSubCategory() {
        return this.snippetSubCategory.value;
    }

    public ModelStringInput snippetType() {
        return this.snippetType.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput stausUpdateReason() {
        return this.stausUpdateReason.value;
    }

    public ModelStringInput subCategory() {
        return this.subCategory.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelStringInput templateId() {
        return this.templateId.value;
    }

    public ModelStringInput templateType() {
        return this.templateType.value;
    }

    public ModelStringInput text() {
        return this.text.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedBy() {
        return this.updatedBy.value;
    }

    public ModelIDInput whatsappBusinessAccount() {
        return this.whatsappBusinessAccount.value;
    }
}
