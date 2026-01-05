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
public final class CreateCustomFormDefinitionsInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final String displayName;
    private final String formName;
    private final Input<List<FormStepSchemaInput>> formSchema;
    private final Input<String> formTitle;
    private final Input<String> id;
    private final Input<String> updaedById;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String displayName;
        private String formName;
        private Input<String> id = Input.absent();
        private Input<String> formTitle = Input.absent();
        private Input<List<FormStepSchemaInput>> formSchema = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updaedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCustomFormDefinitionsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.formName, "formName == null");
            Utils.checkNotNull(this.displayName, "displayName == null");
            return new CreateCustomFormDefinitionsInput(this.id, this.accountId, this.formName, this.displayName, this.formTitle, this.formSchema, this.createdById, this.updaedById, this.createdAt, this.updatedAt);
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
            this.displayName = str;
            return this;
        }

        public Builder formName(String str) {
            this.formName = str;
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
            this.id = Input.fromNullable(str);
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

    public CreateCustomFormDefinitionsInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<List<FormStepSchemaInput>> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = input;
        this.accountId = str;
        this.formName = str2;
        this.displayName = str3;
        this.formTitle = input2;
        this.formSchema = input3;
        this.createdById = input4;
        this.updaedById = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String displayName() {
        return this.displayName;
    }

    public String formName() {
        return this.formName;
    }

    public List<FormStepSchemaInput> formSchema() {
        return this.formSchema.value;
    }

    public String formTitle() {
        return this.formTitle.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCustomFormDefinitionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCustomFormDefinitionsInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCustomFormDefinitionsInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCustomFormDefinitionsInput.this.accountId);
                inputFieldWriter.writeString("formName", CreateCustomFormDefinitionsInput.this.formName);
                inputFieldWriter.writeString("displayName", CreateCustomFormDefinitionsInput.this.displayName);
                if (CreateCustomFormDefinitionsInput.this.formTitle.defined) {
                    inputFieldWriter.writeString("formTitle", (String) CreateCustomFormDefinitionsInput.this.formTitle.value);
                }
                if (CreateCustomFormDefinitionsInput.this.formSchema.defined) {
                    inputFieldWriter.writeList("formSchema", CreateCustomFormDefinitionsInput.this.formSchema.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateCustomFormDefinitionsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateCustomFormDefinitionsInput.this.formSchema.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FormStepSchemaInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateCustomFormDefinitionsInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateCustomFormDefinitionsInput.this.createdById.value);
                }
                if (CreateCustomFormDefinitionsInput.this.updaedById.defined) {
                    inputFieldWriter.writeString("updaedById", (String) CreateCustomFormDefinitionsInput.this.updaedById.value);
                }
                if (CreateCustomFormDefinitionsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCustomFormDefinitionsInput.this.createdAt.value);
                }
                if (CreateCustomFormDefinitionsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCustomFormDefinitionsInput.this.updatedAt.value);
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
