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
public final class UpdateCustomFormDefinitionsInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> displayName;
    private final Input<String> formName;
    private final Input<List<FormStepSchemaInput>> formSchema;
    private final Input<String> formTitle;
    private final String id;
    private final Input<String> updaedById;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> formName = Input.absent();
        private Input<String> displayName = Input.absent();
        private Input<String> formTitle = Input.absent();
        private Input<List<FormStepSchemaInput>> formSchema = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updaedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCustomFormDefinitionsInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCustomFormDefinitionsInput(this.id, this.accountId, this.formName, this.displayName, this.formTitle, this.formSchema, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder displayName(String str) {
            this.displayName = Input.fromNullable(str);
            return this;
        }

        public Builder formName(String str) {
            this.formName = Input.fromNullable(str);
            return this;
        }

        public Builder formSchema(List<FormStepSchemaInput> list) {
            this.formSchema = Input.fromNullable(list);
            return this;
        }

        public Builder formTitle(String str) {
            this.formTitle = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder updaedById(String str) {
            this.updaedById = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCustomFormDefinitionsInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<List<FormStepSchemaInput>> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.accountId = input;
        this.formName = input2;
        this.displayName = input3;
        this.formTitle = input4;
        this.formSchema = input5;
        this.createdById = input6;
        this.updaedById = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String displayName() {
        return this.displayName.value;
    }

    public String formName() {
        return this.formName.value;
    }

    public List<FormStepSchemaInput> formSchema() {
        return this.formSchema.value;
    }

    public String formTitle() {
        return this.formTitle.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomFormDefinitionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCustomFormDefinitionsInput.this.id);
                if (UpdateCustomFormDefinitionsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCustomFormDefinitionsInput.this.accountId.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.formName.defined) {
                    inputFieldWriter.writeString("formName", (String) UpdateCustomFormDefinitionsInput.this.formName.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.displayName.defined) {
                    inputFieldWriter.writeString("displayName", (String) UpdateCustomFormDefinitionsInput.this.displayName.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.formTitle.defined) {
                    inputFieldWriter.writeString("formTitle", (String) UpdateCustomFormDefinitionsInput.this.formTitle.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.formSchema.defined) {
                    inputFieldWriter.writeList("formSchema", UpdateCustomFormDefinitionsInput.this.formSchema.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCustomFormDefinitionsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCustomFormDefinitionsInput.this.formSchema.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FormStepSchemaInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateCustomFormDefinitionsInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateCustomFormDefinitionsInput.this.createdById.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.updaedById.defined) {
                    inputFieldWriter.writeString("updaedById", (String) UpdateCustomFormDefinitionsInput.this.updaedById.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCustomFormDefinitionsInput.this.createdAt.value);
                }
                if (UpdateCustomFormDefinitionsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCustomFormDefinitionsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updaedById() {
        return this.updaedById.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
