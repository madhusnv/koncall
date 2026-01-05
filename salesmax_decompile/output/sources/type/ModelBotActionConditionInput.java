package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelBotActionConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelBotActionConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> endpoint;
    private final Input<ModelBooleanInput> isPaused;
    private final Input<ModelStringInput> name;
    private final Input<ModelBotActionConditionInput> not;
    private final Input<List<ModelBotActionConditionInput>> or;
    private final Input<ModelStringInput> payload;

    /* renamed from: type, reason: collision with root package name */
    private final Input<ModelStringInput> f58191type;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();

        /* renamed from: type, reason: collision with root package name */
        private Input<ModelStringInput> f58192type = Input.absent();
        private Input<ModelStringInput> endpoint = Input.absent();
        private Input<ModelStringInput> payload = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelBooleanInput> isPaused = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelBotActionConditionInput>> and = Input.absent();
        private Input<List<ModelBotActionConditionInput>> or = Input.absent();
        private Input<ModelBotActionConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelBotActionConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelBotActionConditionInput build() {
            return new ModelBotActionConditionInput(this.accountId, this.name, this.f58192type, this.endpoint, this.payload, this.description, this.isPaused, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder endpoint(ModelStringInput modelStringInput) {
            this.endpoint = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder isPaused(ModelBooleanInput modelBooleanInput) {
            this.isPaused = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelBotActionConditionInput modelBotActionConditionInput) {
            this.not = Input.fromNullable(modelBotActionConditionInput);
            return this;
        }

        public Builder or(List<ModelBotActionConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder payload(ModelStringInput modelStringInput) {
            this.payload = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder type(ModelStringInput modelStringInput) {
            this.f58192type = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelBotActionConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelBooleanInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<List<ModelBotActionConditionInput>> input10, Input<List<ModelBotActionConditionInput>> input11, Input<ModelBotActionConditionInput> input12) {
        this.accountId = input;
        this.name = input2;
        this.f58191type = input3;
        this.endpoint = input4;
        this.payload = input5;
        this.description = input6;
        this.isPaused = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
        this.and = input10;
        this.or = input11;
        this.not = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelBotActionConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput endpoint() {
        return this.endpoint.value;
    }

    public ModelBooleanInput isPaused() {
        return this.isPaused.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBotActionConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBotActionConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelBotActionConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelBotActionConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelBotActionConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.f58191type.defined) {
                    inputFieldWriter.writeObject("type", ModelBotActionConditionInput.this.f58191type.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.f58191type.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.endpoint.defined) {
                    inputFieldWriter.writeObject("endpoint", ModelBotActionConditionInput.this.endpoint.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.endpoint.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.payload.defined) {
                    inputFieldWriter.writeObject("payload", ModelBotActionConditionInput.this.payload.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.payload.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelBotActionConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.isPaused.defined) {
                    inputFieldWriter.writeObject("isPaused", ModelBotActionConditionInput.this.isPaused.value != 0 ? ((ModelBooleanInput) ModelBotActionConditionInput.this.isPaused.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelBotActionConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelBotActionConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelBotActionConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelBotActionConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelBotActionConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelBotActionConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelBotActionConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelBotActionConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelBotActionConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelBotActionConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelBotActionConditionInput.this.not.value != 0 ? ((ModelBotActionConditionInput) ModelBotActionConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelBotActionConditionInput not() {
        return this.not.value;
    }

    public List<ModelBotActionConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput payload() {
        return this.payload.value;
    }

    public ModelStringInput type() {
        return this.f58191type.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
