package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelTemplateGalleryFilterInput implements InputType {
    private final Input<List<ModelTemplateGalleryFilterInput>> and;
    private final Input<ModelStringInput> applicableForIndustry;
    private final Input<ModelStringInput> archivedAt;
    private final Input<ModelStringInput> archivedStatus;
    private final Input<ModelStringInput> category;
    private final Input<ModelStringInput> categoryLevelOne;
    private final Input<ModelStringInput> categoryLevelTwo;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelIDInput> defaultMediaId;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> language;
    private final Input<ModelStringInput> name;
    private final Input<ModelTemplateGalleryFilterInput> not;
    private final Input<List<ModelTemplateGalleryFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelTemplateGalleryFilterInput>> and = Input.absent();
        private Input<List<ModelTemplateGalleryFilterInput>> or = Input.absent();
        private Input<ModelTemplateGalleryFilterInput> not = Input.absent();

        public Builder and(List<ModelTemplateGalleryFilterInput> list) {
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

        public ModelTemplateGalleryFilterInput build() {
            return new ModelTemplateGalleryFilterInput(this.id, this.platform, this.name, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.templateId, this.tags, this.categoryLevelOne, this.categoryLevelTwo, this.applicableForIndustry, this.viewedTimes, this.savedToWorkspaceTimes, this.sentToWhatsappTimes, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelTemplateGalleryFilterInput modelTemplateGalleryFilterInput) {
            this.not = Input.fromNullable(modelTemplateGalleryFilterInput);
            return this;
        }

        public Builder or(List<ModelTemplateGalleryFilterInput> list) {
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

    public ModelTemplateGalleryFilterInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelIntInput> input17, Input<ModelIntInput> input18, Input<ModelIntInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<List<ModelTemplateGalleryFilterInput>> input22, Input<List<ModelTemplateGalleryFilterInput>> input23, Input<ModelTemplateGalleryFilterInput> input24) {
        this.id = input;
        this.platform = input2;
        this.name = input3;
        this.language = input4;
        this.status = input5;
        this.category = input6;
        this.createdBy = input7;
        this.updatedBy = input8;
        this.archivedStatus = input9;
        this.archivedAt = input10;
        this.defaultMediaId = input11;
        this.templateId = input12;
        this.tags = input13;
        this.categoryLevelOne = input14;
        this.categoryLevelTwo = input15;
        this.applicableForIndustry = input16;
        this.viewedTimes = input17;
        this.savedToWorkspaceTimes = input18;
        this.sentToWhatsappTimes = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<ModelTemplateGalleryFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput language() {
        return this.language.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelTemplateGalleryFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelTemplateGalleryFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelTemplateGalleryFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelTemplateGalleryFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.platform.defined) {
                    inputFieldWriter.writeObject("platform", ModelTemplateGalleryFilterInput.this.platform.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.platform.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelTemplateGalleryFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.language.defined) {
                    inputFieldWriter.writeObject("language", ModelTemplateGalleryFilterInput.this.language.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.language.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelTemplateGalleryFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.category.defined) {
                    inputFieldWriter.writeObject("category", ModelTemplateGalleryFilterInput.this.category.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.category.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelTemplateGalleryFilterInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelTemplateGalleryFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelTemplateGalleryFilterInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelTemplateGalleryFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeObject("archivedStatus", ModelTemplateGalleryFilterInput.this.archivedStatus.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.archivedStatus.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.archivedAt.defined) {
                    inputFieldWriter.writeObject("archivedAt", ModelTemplateGalleryFilterInput.this.archivedAt.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.archivedAt.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeObject("defaultMediaId", ModelTemplateGalleryFilterInput.this.defaultMediaId.value != 0 ? ((ModelIDInput) ModelTemplateGalleryFilterInput.this.defaultMediaId.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.templateId.defined) {
                    inputFieldWriter.writeObject("templateId", ModelTemplateGalleryFilterInput.this.templateId.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.templateId.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelTemplateGalleryFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.categoryLevelOne.defined) {
                    inputFieldWriter.writeObject("categoryLevelOne", ModelTemplateGalleryFilterInput.this.categoryLevelOne.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.categoryLevelOne.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.categoryLevelTwo.defined) {
                    inputFieldWriter.writeObject("categoryLevelTwo", ModelTemplateGalleryFilterInput.this.categoryLevelTwo.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.categoryLevelTwo.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.applicableForIndustry.defined) {
                    inputFieldWriter.writeObject("applicableForIndustry", ModelTemplateGalleryFilterInput.this.applicableForIndustry.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.applicableForIndustry.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.viewedTimes.defined) {
                    inputFieldWriter.writeObject("viewedTimes", ModelTemplateGalleryFilterInput.this.viewedTimes.value != 0 ? ((ModelIntInput) ModelTemplateGalleryFilterInput.this.viewedTimes.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.savedToWorkspaceTimes.defined) {
                    inputFieldWriter.writeObject("savedToWorkspaceTimes", ModelTemplateGalleryFilterInput.this.savedToWorkspaceTimes.value != 0 ? ((ModelIntInput) ModelTemplateGalleryFilterInput.this.savedToWorkspaceTimes.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.sentToWhatsappTimes.defined) {
                    inputFieldWriter.writeObject("sentToWhatsappTimes", ModelTemplateGalleryFilterInput.this.sentToWhatsappTimes.value != 0 ? ((ModelIntInput) ModelTemplateGalleryFilterInput.this.sentToWhatsappTimes.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelTemplateGalleryFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelTemplateGalleryFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelTemplateGalleryFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelTemplateGalleryFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelTemplateGalleryFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTemplateGalleryFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTemplateGalleryFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTemplateGalleryFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTemplateGalleryFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelTemplateGalleryFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelTemplateGalleryFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelTemplateGalleryFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelTemplateGalleryFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelTemplateGalleryFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelTemplateGalleryFilterInput.this.not.value != 0 ? ((ModelTemplateGalleryFilterInput) ModelTemplateGalleryFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelTemplateGalleryFilterInput not() {
        return this.not.value;
    }

    public List<ModelTemplateGalleryFilterInput> or() {
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
