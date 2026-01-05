package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateTemplateGalleryInput implements InputType {
    private final Input<List<String>> applicableForIndustry;
    private final Input<String> archivedAt;
    private final Input<String> archivedStatus;
    private final Input<String> category;
    private final Input<String> categoryLevelOne;
    private final Input<String> categoryLevelTwo;
    private final Input<List<TemplateComponentInput>> components;
    private final Input<String> createdAt;
    private final Input<String> createdBy;
    private final Input<String> defaultMediaId;
    private final Input<List<MappedVariableInput>> defaultVariableMap;
    private final Input<String> id;
    private final Input<String> language;
    private final Input<String> name;
    private final Input<String> platform;
    private final Input<Integer> savedToWorkspaceTimes;
    private final Input<Integer> sentToWhatsappTimes;
    private final Input<String> status;
    private final Input<List<String>> tags;
    private final Input<String> templateId;
    private final Input<String> updatedAt;
    private final Input<String> updatedBy;
    private final Input<Integer> viewedTimes;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> platform = Input.absent();
        private Input<String> name = Input.absent();
        private Input<List<TemplateComponentInput>> components = Input.absent();
        private Input<String> language = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> category = Input.absent();
        private Input<String> createdBy = Input.absent();
        private Input<String> updatedBy = Input.absent();
        private Input<String> archivedStatus = Input.absent();
        private Input<String> archivedAt = Input.absent();
        private Input<String> defaultMediaId = Input.absent();
        private Input<List<MappedVariableInput>> defaultVariableMap = Input.absent();
        private Input<String> templateId = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<String> categoryLevelOne = Input.absent();
        private Input<String> categoryLevelTwo = Input.absent();
        private Input<List<String>> applicableForIndustry = Input.absent();
        private Input<Integer> viewedTimes = Input.absent();
        private Input<Integer> savedToWorkspaceTimes = Input.absent();
        private Input<Integer> sentToWhatsappTimes = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder applicableForIndustry(List<String> list) {
            this.applicableForIndustry = Input.fromNullable(list);
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

        public CreateTemplateGalleryInput build() {
            return new CreateTemplateGalleryInput(this.id, this.platform, this.name, this.components, this.language, this.status, this.category, this.createdBy, this.updatedBy, this.archivedStatus, this.archivedAt, this.defaultMediaId, this.defaultVariableMap, this.templateId, this.tags, this.categoryLevelOne, this.categoryLevelTwo, this.applicableForIndustry, this.viewedTimes, this.savedToWorkspaceTimes, this.sentToWhatsappTimes, this.createdAt, this.updatedAt);
        }

        public Builder category(String str) {
            this.category = Input.fromNullable(str);
            return this;
        }

        public Builder categoryLevelOne(String str) {
            this.categoryLevelOne = Input.fromNullable(str);
            return this;
        }

        public Builder categoryLevelTwo(String str) {
            this.categoryLevelTwo = Input.fromNullable(str);
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

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder language(String str) {
            this.language = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder platform(String str) {
            this.platform = Input.fromNullable(str);
            return this;
        }

        public Builder savedToWorkspaceTimes(Integer num) {
            this.savedToWorkspaceTimes = Input.fromNullable(num);
            return this;
        }

        public Builder sentToWhatsappTimes(Integer num) {
            this.sentToWhatsappTimes = Input.fromNullable(num);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
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

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedBy(String str) {
            this.updatedBy = Input.fromNullable(str);
            return this;
        }

        public Builder viewedTimes(Integer num) {
            this.viewedTimes = Input.fromNullable(num);
            return this;
        }
    }

    public CreateTemplateGalleryInput(Input<String> input, Input<String> input2, Input<String> input3, Input<List<TemplateComponentInput>> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<List<MappedVariableInput>> input13, Input<String> input14, Input<List<String>> input15, Input<String> input16, Input<String> input17, Input<List<String>> input18, Input<Integer> input19, Input<Integer> input20, Input<Integer> input21, Input<String> input22, Input<String> input23) {
        this.id = input;
        this.platform = input2;
        this.name = input3;
        this.components = input4;
        this.language = input5;
        this.status = input6;
        this.category = input7;
        this.createdBy = input8;
        this.updatedBy = input9;
        this.archivedStatus = input10;
        this.archivedAt = input11;
        this.defaultMediaId = input12;
        this.defaultVariableMap = input13;
        this.templateId = input14;
        this.tags = input15;
        this.categoryLevelOne = input16;
        this.categoryLevelTwo = input17;
        this.applicableForIndustry = input18;
        this.viewedTimes = input19;
        this.savedToWorkspaceTimes = input20;
        this.sentToWhatsappTimes = input21;
        this.createdAt = input22;
        this.updatedAt = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> applicableForIndustry() {
        return this.applicableForIndustry.value;
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

    public String categoryLevelOne() {
        return this.categoryLevelOne.value;
    }

    public String categoryLevelTwo() {
        return this.categoryLevelTwo.value;
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

    public String id() {
        return this.id.value;
    }

    public String language() {
        return this.language.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateTemplateGalleryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateTemplateGalleryInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateTemplateGalleryInput.this.id.value);
                }
                if (CreateTemplateGalleryInput.this.platform.defined) {
                    inputFieldWriter.writeString("platform", (String) CreateTemplateGalleryInput.this.platform.value);
                }
                if (CreateTemplateGalleryInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateTemplateGalleryInput.this.name.value);
                }
                if (CreateTemplateGalleryInput.this.components.defined) {
                    inputFieldWriter.writeList("components", CreateTemplateGalleryInput.this.components.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateTemplateGalleryInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateTemplateGalleryInput.this.components.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TemplateComponentInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateTemplateGalleryInput.this.language.defined) {
                    inputFieldWriter.writeString("language", (String) CreateTemplateGalleryInput.this.language.value);
                }
                if (CreateTemplateGalleryInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateTemplateGalleryInput.this.status.value);
                }
                if (CreateTemplateGalleryInput.this.category.defined) {
                    inputFieldWriter.writeString("category", (String) CreateTemplateGalleryInput.this.category.value);
                }
                if (CreateTemplateGalleryInput.this.createdBy.defined) {
                    inputFieldWriter.writeString("createdBy", (String) CreateTemplateGalleryInput.this.createdBy.value);
                }
                if (CreateTemplateGalleryInput.this.updatedBy.defined) {
                    inputFieldWriter.writeString("updatedBy", (String) CreateTemplateGalleryInput.this.updatedBy.value);
                }
                if (CreateTemplateGalleryInput.this.archivedStatus.defined) {
                    inputFieldWriter.writeString("archivedStatus", (String) CreateTemplateGalleryInput.this.archivedStatus.value);
                }
                if (CreateTemplateGalleryInput.this.archivedAt.defined) {
                    inputFieldWriter.writeString("archivedAt", (String) CreateTemplateGalleryInput.this.archivedAt.value);
                }
                if (CreateTemplateGalleryInput.this.defaultMediaId.defined) {
                    inputFieldWriter.writeString("defaultMediaId", (String) CreateTemplateGalleryInput.this.defaultMediaId.value);
                }
                if (CreateTemplateGalleryInput.this.defaultVariableMap.defined) {
                    inputFieldWriter.writeList("defaultVariableMap", CreateTemplateGalleryInput.this.defaultVariableMap.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateTemplateGalleryInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateTemplateGalleryInput.this.defaultVariableMap.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MappedVariableInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateTemplateGalleryInput.this.templateId.defined) {
                    inputFieldWriter.writeString("templateId", (String) CreateTemplateGalleryInput.this.templateId.value);
                }
                if (CreateTemplateGalleryInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateTemplateGalleryInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateTemplateGalleryInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateTemplateGalleryInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateTemplateGalleryInput.this.categoryLevelOne.defined) {
                    inputFieldWriter.writeString("categoryLevelOne", (String) CreateTemplateGalleryInput.this.categoryLevelOne.value);
                }
                if (CreateTemplateGalleryInput.this.categoryLevelTwo.defined) {
                    inputFieldWriter.writeString("categoryLevelTwo", (String) CreateTemplateGalleryInput.this.categoryLevelTwo.value);
                }
                if (CreateTemplateGalleryInput.this.applicableForIndustry.defined) {
                    inputFieldWriter.writeList("applicableForIndustry", CreateTemplateGalleryInput.this.applicableForIndustry.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateTemplateGalleryInput.1.4
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateTemplateGalleryInput.this.applicableForIndustry.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateTemplateGalleryInput.this.viewedTimes.defined) {
                    inputFieldWriter.writeInt("viewedTimes", (Integer) CreateTemplateGalleryInput.this.viewedTimes.value);
                }
                if (CreateTemplateGalleryInput.this.savedToWorkspaceTimes.defined) {
                    inputFieldWriter.writeInt("savedToWorkspaceTimes", (Integer) CreateTemplateGalleryInput.this.savedToWorkspaceTimes.value);
                }
                if (CreateTemplateGalleryInput.this.sentToWhatsappTimes.defined) {
                    inputFieldWriter.writeInt("sentToWhatsappTimes", (Integer) CreateTemplateGalleryInput.this.sentToWhatsappTimes.value);
                }
                if (CreateTemplateGalleryInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateTemplateGalleryInput.this.createdAt.value);
                }
                if (CreateTemplateGalleryInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateTemplateGalleryInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String platform() {
        return this.platform.value;
    }

    public Integer savedToWorkspaceTimes() {
        return this.savedToWorkspaceTimes.value;
    }

    public Integer sentToWhatsappTimes() {
        return this.sentToWhatsappTimes.value;
    }

    public String status() {
        return this.status.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public String templateId() {
        return this.templateId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedBy() {
        return this.updatedBy.value;
    }

    public Integer viewedTimes() {
        return this.viewedTimes.value;
    }
}
