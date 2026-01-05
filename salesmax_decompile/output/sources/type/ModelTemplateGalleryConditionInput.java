package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelTemplateGalleryConditionInput implements InputType {
    private final Input<List<ModelTemplateGalleryConditionInput>> and;
    private final Input<ModelStringInput> applicableForIndustry;
    private final Input<ModelStringInput> archivedAt;
    private final Input<ModelStringInput> archivedStatus;
    private final Input<ModelStringInput> category;
    private final Input<ModelStringInput> categoryLevelOne;
    private final Input<ModelStringInput> categoryLevelTwo;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelIDInput> defaultMediaId;
    private final Input<ModelStringInput> language;
    private final Input<ModelStringInput> name;
    private final Input<ModelTemplateGalleryConditionInput> not;
    private final Input<List<ModelTemplateGalleryConditionInput>> or;
    private final Input<ModelStringInput> platform;
    private final Input<ModelIntInput> savedToWorkspaceTimes;
    private final Input<ModelIntInput> sentToWhatsappTimes;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> templateId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedBy;
    private final Input<ModelIntInput> viewedTimes;

    public static final class Builder {
        private Input<ModelStringInput> platform = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> language = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> category = Input.absent();
        private Input<ModelIDInput> createdBy = Input.absent();
        private Input<ModelIDInput> updatedBy = Input.absent();
        private Input<ModelStringInput> archivedStatus = Input.absent();
        private Input<ModelStringInput> archivedAt = Input.absent();
        private Input<ModelIDInput> defaultMediaId = Input.absent();
        private Input<ModelStringInput> templateId = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelStringInput> categoryLevelOne = Input.absent();
        private Input<ModelStringInput> categoryLevelTwo = Input.absent();
        private Input<ModelStringInput> applicableForIndustry = Input.absent();
        private Input<ModelIntInput> viewedTimes = Input.absent();
        private Input<ModelIntInput> savedToWorkspaceTimes = Input.absent();
        private Input<ModelIntInput> sentToWhatsappTimes = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelTemplateGalleryConditionInput>> and = Input.absent();
        private Input<List<ModelTemplateGalleryConditionInput>> or = Input.absent();
        private Input<ModelTemplateGalleryConditionInput> not = Input.absent();

        public Builder and(List<ModelTemplateGalleryConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder applicableForIndustry(ModelStringInput modelStringInput) {
            this.applicableForIndustry = Input.fromNullable(modelStringInput);
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

        public ModelTemplateGalleryConditionInput build() {
            return new ModelTemplateGalleryConditionInput(this.platform, this.name, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.templateId, this.tags, this.categoryLevelOne, this.categoryLevelTwo, this.applicableForIndustry, this.viewedTimes, this.savedToWorkspaceTimes, this.sentToWhatsappTimes, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder category(ModelStringInput modelStringInput) {
            this.category = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder categoryLevelOne(ModelStringInput modelStringInput) {
            this.categoryLevelOne = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder categoryLevelTwo(ModelStringInput modelStringInput) {
            this.categoryLevelTwo = Input.fromNullable(modelStringInput);
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

        public Builder language(ModelStringInput modelStringInput) {
            this.language = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelTemplateGalleryConditionInput modelTemplateGalleryConditionInput) {
            this.not = Input.fromNullable(modelTemplateGalleryConditionInput);
            return this;
        }

        public Builder or(List<ModelTemplateGalleryConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder platform(ModelStringInput modelStringInput) {
            this.platform = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder savedToWorkspaceTimes(ModelIntInput modelIntInput) {
            this.savedToWorkspaceTimes = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder sentToWhatsappTimes(ModelIntInput modelIntInput) {
            this.sentToWhatsappTimes = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
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

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedBy(ModelIDInput modelIDInput) {
            this.updatedBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder viewedTimes(ModelIntInput modelIntInput) {
            this.viewedTimes = Input.fromNullable(modelIntInput);
            return this;
        }
    }

    public ModelTemplateGalleryConditionInput(Input<ModelStringInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelIDInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelIntInput> input16, Input<ModelIntInput> input17, Input<ModelIntInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<List<ModelTemplateGalleryConditionInput>> input21, Input<List<ModelTemplateGalleryConditionInput>> input22, Input<ModelTemplateGalleryConditionInput> input23) {
        this.platform = input;
        this.name = input2;
        this.language = input3;
        this.status = input4;
        this.category = input5;
        this.createdBy = input6;
        this.updatedBy = input7;
        this.archivedStatus = input8;
        this.archivedAt = input9;
        this.defaultMediaId = input10;
        this.templateId = input11;
        this.tags = input12;
        this.categoryLevelOne = input13;
        this.categoryLevelTwo = input14;
        this.applicableForIndustry = input15;
        this.viewedTimes = input16;
        this.savedToWorkspaceTimes = input17;
        this.sentToWhatsappTimes = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
        this.and = input21;
        this.or = input22;
        this.not = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelTemplateGalleryConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput applicableForIndustry() {
        return this.applicableForIndustry.value;
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

    public ModelStringInput categoryLevelOne() {
        return this.categoryLevelOne.value;
    }

    public ModelStringInput categoryLevelTwo() {
        return this.categoryLevelTwo.value;
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

    public ModelStringInput language() {
        return this.language.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTemplateGalleryConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTemplateGalleryConditionInput.this.platform.defined) {
                    inputFieldWriter.writeObject("platform", ModelTemplateGalleryConditionInput.this.platform.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.platform.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelTemplateGalleryConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.language.defined) {
                    inputFieldWriter.writeObject("language", ModelTemplateGalleryConditionInput.this.language.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.language.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelTemplateGalleryConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelTemplateGalleryConditionInput.this.category.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.category.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelTemplateGalleryConditionInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelTemplateGalleryConditionInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelTemplateGalleryConditionInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelTemplateGalleryConditionInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeObject("archivedStatus", ModelTemplateGalleryConditionInput.this.archivedStatus.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.archivedStatus.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.archivedAt.defined) {
                    inputFieldWriter.writeObject("archivedAt", ModelTemplateGalleryConditionInput.this.archivedAt.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.archivedAt.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeObject("defaultMediaId", ModelTemplateGalleryConditionInput.this.defaultMediaId.value != 0 ? ((ModelIDInput) ModelTemplateGalleryConditionInput.this.defaultMediaId.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.templateId.defined) {
                    inputFieldWriter.writeObject("templateId", ModelTemplateGalleryConditionInput.this.templateId.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.templateId.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelTemplateGalleryConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.categoryLevelOne.defined) {
                    inputFieldWriter.writeObject("categoryLevelOne", ModelTemplateGalleryConditionInput.this.categoryLevelOne.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.categoryLevelOne.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.categoryLevelTwo.defined) {
                    inputFieldWriter.writeObject("categoryLevelTwo", ModelTemplateGalleryConditionInput.this.categoryLevelTwo.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.categoryLevelTwo.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.applicableForIndustry.defined) {
                    inputFieldWriter.writeObject("applicableForIndustry", ModelTemplateGalleryConditionInput.this.applicableForIndustry.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.applicableForIndustry.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.viewedTimes.defined) {
                    inputFieldWriter.writeObject("viewedTimes", ModelTemplateGalleryConditionInput.this.viewedTimes.value != 0 ? ((ModelIntInput) ModelTemplateGalleryConditionInput.this.viewedTimes.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.savedToWorkspaceTimes.defined) {
                    inputFieldWriter.writeObject("savedToWorkspaceTimes", ModelTemplateGalleryConditionInput.this.savedToWorkspaceTimes.value != 0 ? ((ModelIntInput) ModelTemplateGalleryConditionInput.this.savedToWorkspaceTimes.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.sentToWhatsappTimes.defined) {
                    inputFieldWriter.writeObject("sentToWhatsappTimes", ModelTemplateGalleryConditionInput.this.sentToWhatsappTimes.value != 0 ? ((ModelIntInput) ModelTemplateGalleryConditionInput.this.sentToWhatsappTimes.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelTemplateGalleryConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelTemplateGalleryConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelTemplateGalleryConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelTemplateGalleryConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelTemplateGalleryConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTemplateGalleryConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTemplateGalleryConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTemplateGalleryConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTemplateGalleryConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelTemplateGalleryConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTemplateGalleryConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTemplateGalleryConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTemplateGalleryConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTemplateGalleryConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelTemplateGalleryConditionInput.this.not.value != 0 ? ((ModelTemplateGalleryConditionInput) ModelTemplateGalleryConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelTemplateGalleryConditionInput not() {
        return this.not.value;
    }

    public List<ModelTemplateGalleryConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput platform() {
        return this.platform.value;
    }

    public ModelIntInput savedToWorkspaceTimes() {
        return this.savedToWorkspaceTimes.value;
    }

    public ModelIntInput sentToWhatsappTimes() {
        return this.sentToWhatsappTimes.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelStringInput templateId() {
        return this.templateId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedBy() {
        return this.updatedBy.value;
    }

    public ModelIntInput viewedTimes() {
        return this.viewedTimes.value;
    }
}
