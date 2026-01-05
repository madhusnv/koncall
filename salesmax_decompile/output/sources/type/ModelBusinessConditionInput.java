package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes7.dex */
public final class ModelBusinessConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIDInput> addedById;
    private final Input<List<ModelBusinessConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> domain;
    private final Input<ModelStringInput> industry;
    private final Input<ModelStringInput> logo;
    private final Input<ModelStringInput> name;
    private final Input<ModelBusinessConditionInput> not;
    private final Input<List<ModelBusinessConditionInput>> or;
    private final Input<ModelStringInput> priority;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelStringInput> userDefinedTags;
    private final Input<ModelStringInput> website;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> industry = Input.absent();
        private Input<ModelStringInput> priority = Input.absent();
        private Input<ModelStringInput> website = Input.absent();
        private Input<ModelStringInput> domain = Input.absent();
        private Input<ModelStringInput> logo = Input.absent();
        private Input<ModelStringInput> userDefinedTags = Input.absent();
        private Input<ModelIDInput> addedById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelBusinessConditionInput>> and = Input.absent();
        private Input<List<ModelBusinessConditionInput>> or = Input.absent();
        private Input<ModelBusinessConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedById(ModelIDInput modelIDInput) {
            this.addedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelBusinessConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelBusinessConditionInput build() {
            return new ModelBusinessConditionInput(this.accountId, this.name, this.industry, this.priority, this.website, this.domain, this.logo, this.userDefinedTags, this.addedById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder domain(ModelStringInput modelStringInput) {
            this.domain = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder industry(ModelStringInput modelStringInput) {
            this.industry = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder logo(ModelStringInput modelStringInput) {
            this.logo = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelBusinessConditionInput modelBusinessConditionInput) {
            this.not = Input.fromNullable(modelBusinessConditionInput);
            return this;
        }

        public Builder or(List<ModelBusinessConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder priority(ModelStringInput modelStringInput) {
            this.priority = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedById(ModelIDInput modelIDInput) {
            this.updatedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder userDefinedTags(ModelStringInput modelStringInput) {
            this.userDefinedTags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder website(ModelStringInput modelStringInput) {
            this.website = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelBusinessConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelIDInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<List<ModelBusinessConditionInput>> input13, Input<List<ModelBusinessConditionInput>> input14, Input<ModelBusinessConditionInput> input15) {
        this.accountId = input;
        this.name = input2;
        this.industry = input3;
        this.priority = input4;
        this.website = input5;
        this.domain = input6;
        this.logo = input7;
        this.userDefinedTags = input8;
        this.addedById = input9;
        this.updatedById = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.and = input13;
        this.or = input14;
        this.not = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIDInput addedById() {
        return this.addedById.value;
    }

    public List<ModelBusinessConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput domain() {
        return this.domain.value;
    }

    public ModelStringInput industry() {
        return this.industry.value;
    }

    public ModelStringInput logo() {
        return this.logo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBusinessConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBusinessConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelBusinessConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelBusinessConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelBusinessConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.industry.defined) {
                    inputFieldWriter.writeObject("industry", ModelBusinessConditionInput.this.industry.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.industry.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.priority.defined) {
                    inputFieldWriter.writeObject("priority", ModelBusinessConditionInput.this.priority.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.priority.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.website.defined) {
                    inputFieldWriter.writeObject("website", ModelBusinessConditionInput.this.website.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.website.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.domain.defined) {
                    inputFieldWriter.writeObject(ClientCookie.DOMAIN_ATTR, ModelBusinessConditionInput.this.domain.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.domain.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.logo.defined) {
                    inputFieldWriter.writeObject("logo", ModelBusinessConditionInput.this.logo.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.logo.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeObject("userDefinedTags", ModelBusinessConditionInput.this.userDefinedTags.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.userDefinedTags.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", ModelBusinessConditionInput.this.addedById.value != 0 ? ((ModelIDInput) ModelBusinessConditionInput.this.addedById.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelBusinessConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelBusinessConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelBusinessConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelBusinessConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelBusinessConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelBusinessConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelBusinessConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBusinessConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBusinessConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBusinessConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBusinessConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelBusinessConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBusinessConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBusinessConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBusinessConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBusinessConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelBusinessConditionInput.this.not.value != 0 ? ((ModelBusinessConditionInput) ModelBusinessConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelBusinessConditionInput not() {
        return this.not.value;
    }

    public List<ModelBusinessConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput priority() {
        return this.priority.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelStringInput userDefinedTags() {
        return this.userDefinedTags.value;
    }

    public ModelStringInput website() {
        return this.website.value;
    }
}
