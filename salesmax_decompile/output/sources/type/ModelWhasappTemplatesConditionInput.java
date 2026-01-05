package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWhasappTemplatesConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWhasappTemplatesConditionInput>> and;
    private final Input<ModelStringInput> archivedAt;
    private final Input<ModelStringInput> archivedStatus;
    private final Input<ModelStringInput> category;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelIDInput> defaultMediaId;
    private final Input<ModelStringInput> footerText;
    private final Input<ModelStringInput> headerText;
    private final Input<ModelStringInput> headerType;
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
    private final Input<ModelWhasappTemplatesConditionInput> not;
    private final Input<List<ModelWhasappTemplatesConditionInput>> or;
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
        private Input<List<ModelWhasappTemplatesConditionInput>> and = Input.absent();
        private Input<List<ModelWhasappTemplatesConditionInput>> or = Input.absent();
        private Input<ModelWhasappTemplatesConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWhasappTemplatesConditionInput> list) {
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

        public ModelWhasappTemplatesConditionInput build() {
            return new ModelWhasappTemplatesConditionInput(this.accountId, this.whatsappBusinessAccount, this.templateType, this.snippetType, this.platform, this.name, this.language, this.status, this.category, this.subCategory, this.snippetCategory, this.snippetSubCategory, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.templateId, this.tags, this.isSample, this.messageType, this.messageSubType, this.text, this.locationObjectToSend, this.headerText, this.footerText, this.headerType, this.messageTemplateQualityNew, this.messageTemplateQualityPrevious, this.messageTemplateQualityUpdatedAt, this.messageTemplateStatusUpdatedAt, this.stausUpdateReason, this.otherDetail, this.lastUsed, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelWhasappTemplatesConditionInput modelWhasappTemplatesConditionInput) {
            this.not = Input.fromNullable(modelWhasappTemplatesConditionInput);
            return this;
        }

        public Builder or(List<ModelWhasappTemplatesConditionInput> list) {
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

    public ModelWhasappTemplatesConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelBooleanInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<ModelStringInput> input27, Input<ModelStringInput> input28, Input<ModelStringInput> input29, Input<ModelStringInput> input30, Input<ModelStringInput> input31, Input<ModelStringInput> input32, Input<ModelStringInput> input33, Input<ModelStringInput> input34, Input<ModelStringInput> input35, Input<ModelStringInput> input36, Input<List<ModelWhasappTemplatesConditionInput>> input37, Input<List<ModelWhasappTemplatesConditionInput>> input38, Input<ModelWhasappTemplatesConditionInput> input39) {
        this.accountId = input;
        this.whatsappBusinessAccount = input2;
        this.templateType = input3;
        this.snippetType = input4;
        this.platform = input5;
        this.name = input6;
        this.language = input7;
        this.status = input8;
        this.category = input9;
        this.subCategory = input10;
        this.snippetCategory = input11;
        this.snippetSubCategory = input12;
        this.createdBy = input13;
        this.updatedBy = input14;
        this.archivedStatus = input15;
        this.archivedAt = input16;
        this.defaultMediaId = input17;
        this.templateId = input18;
        this.tags = input19;
        this.isSample = input20;
        this.messageType = input21;
        this.messageSubType = input22;
        this.text = input23;
        this.locationObjectToSend = input24;
        this.headerText = input25;
        this.footerText = input26;
        this.headerType = input27;
        this.messageTemplateQualityNew = input28;
        this.messageTemplateQualityPrevious = input29;
        this.messageTemplateQualityUpdatedAt = input30;
        this.messageTemplateStatusUpdatedAt = input31;
        this.stausUpdateReason = input32;
        this.otherDetail = input33;
        this.lastUsed = input34;
        this.createdAt = input35;
        this.updatedAt = input36;
        this.and = input37;
        this.or = input38;
        this.not = input39;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWhasappTemplatesConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelWhasappTemplatesConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWhasappTemplatesConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWhasappTemplatesConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.whatsappBusinessAccount.defined) {
                    inputFieldWriter.writeObject("whatsappBusinessAccount", ModelWhasappTemplatesConditionInput.this.whatsappBusinessAccount.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesConditionInput.this.whatsappBusinessAccount.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.templateType.defined) {
                    inputFieldWriter.writeObject("templateType", ModelWhasappTemplatesConditionInput.this.templateType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.templateType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.snippetType.defined) {
                    inputFieldWriter.writeObject("snippetType", ModelWhasappTemplatesConditionInput.this.snippetType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.snippetType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.platform.defined) {
                    inputFieldWriter.writeObject("platform", ModelWhasappTemplatesConditionInput.this.platform.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.platform.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelWhasappTemplatesConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.language.defined) {
                    inputFieldWriter.writeObject("language", ModelWhasappTemplatesConditionInput.this.language.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.language.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelWhasappTemplatesConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelWhasappTemplatesConditionInput.this.category.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.category.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.subCategory.defined) {
                    inputFieldWriter.writeObject("subCategory", ModelWhasappTemplatesConditionInput.this.subCategory.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.subCategory.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.snippetCategory.defined) {
                    inputFieldWriter.writeObject("snippetCategory", ModelWhasappTemplatesConditionInput.this.snippetCategory.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.snippetCategory.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.snippetSubCategory.defined) {
                    inputFieldWriter.writeObject("snippetSubCategory", ModelWhasappTemplatesConditionInput.this.snippetSubCategory.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.snippetSubCategory.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelWhasappTemplatesConditionInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesConditionInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelWhasappTemplatesConditionInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesConditionInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeObject("archivedStatus", ModelWhasappTemplatesConditionInput.this.archivedStatus.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.archivedStatus.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.archivedAt.defined) {
                    inputFieldWriter.writeObject("archivedAt", ModelWhasappTemplatesConditionInput.this.archivedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.archivedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeObject("defaultMediaId", ModelWhasappTemplatesConditionInput.this.defaultMediaId.value != 0 ? ((ModelIDInput) ModelWhasappTemplatesConditionInput.this.defaultMediaId.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.templateId.defined) {
                    inputFieldWriter.writeObject("templateId", ModelWhasappTemplatesConditionInput.this.templateId.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.templateId.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelWhasappTemplatesConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.isSample.defined) {
                    inputFieldWriter.writeObject("isSample", ModelWhasappTemplatesConditionInput.this.isSample.value != 0 ? ((ModelBooleanInput) ModelWhasappTemplatesConditionInput.this.isSample.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.messageType.defined) {
                    inputFieldWriter.writeObject("messageType", ModelWhasappTemplatesConditionInput.this.messageType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.messageType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.messageSubType.defined) {
                    inputFieldWriter.writeObject("messageSubType", ModelWhasappTemplatesConditionInput.this.messageSubType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.messageSubType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.text.defined) {
                    inputFieldWriter.writeObject("text", ModelWhasappTemplatesConditionInput.this.text.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.text.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.locationObjectToSend.defined) {
                    inputFieldWriter.writeObject("locationObjectToSend", ModelWhasappTemplatesConditionInput.this.locationObjectToSend.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.locationObjectToSend.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.headerText.defined) {
                    inputFieldWriter.writeObject("headerText", ModelWhasappTemplatesConditionInput.this.headerText.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.headerText.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.footerText.defined) {
                    inputFieldWriter.writeObject("footerText", ModelWhasappTemplatesConditionInput.this.footerText.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.footerText.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.headerType.defined) {
                    inputFieldWriter.writeObject("headerType", ModelWhasappTemplatesConditionInput.this.headerType.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.headerType.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.messageTemplateQualityNew.defined) {
                    inputFieldWriter.writeObject("messageTemplateQualityNew", ModelWhasappTemplatesConditionInput.this.messageTemplateQualityNew.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.messageTemplateQualityNew.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.messageTemplateQualityPrevious.defined) {
                    inputFieldWriter.writeObject("messageTemplateQualityPrevious", ModelWhasappTemplatesConditionInput.this.messageTemplateQualityPrevious.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.messageTemplateQualityPrevious.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.messageTemplateQualityUpdatedAt.defined) {
                    inputFieldWriter.writeObject("messageTemplateQualityUpdatedAt", ModelWhasappTemplatesConditionInput.this.messageTemplateQualityUpdatedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.messageTemplateQualityUpdatedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.messageTemplateStatusUpdatedAt.defined) {
                    inputFieldWriter.writeObject("messageTemplateStatusUpdatedAt", ModelWhasappTemplatesConditionInput.this.messageTemplateStatusUpdatedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.messageTemplateStatusUpdatedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.stausUpdateReason.defined) {
                    inputFieldWriter.writeObject("stausUpdateReason", ModelWhasappTemplatesConditionInput.this.stausUpdateReason.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.stausUpdateReason.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.otherDetail.defined) {
                    inputFieldWriter.writeObject("otherDetail", ModelWhasappTemplatesConditionInput.this.otherDetail.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.otherDetail.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.lastUsed.defined) {
                    inputFieldWriter.writeObject("lastUsed", ModelWhasappTemplatesConditionInput.this.lastUsed.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.lastUsed.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWhasappTemplatesConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelWhasappTemplatesConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelWhasappTemplatesConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWhasappTemplatesConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWhasappTemplatesConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWhasappTemplatesConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWhasappTemplatesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWhasappTemplatesConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWhasappTemplatesConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWhasappTemplatesConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWhasappTemplatesConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWhasappTemplatesConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWhasappTemplatesConditionInput.this.not.value != 0 ? ((ModelWhasappTemplatesConditionInput) ModelWhasappTemplatesConditionInput.this.not.value).marshaller() : null);
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

    public ModelWhasappTemplatesConditionInput not() {
        return this.not.value;
    }

    public List<ModelWhasappTemplatesConditionInput> or() {
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
