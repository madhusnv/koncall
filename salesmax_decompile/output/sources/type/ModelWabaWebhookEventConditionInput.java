package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaWebhookEventConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaWebhookEventConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> displayPhoneNumber;
    private final Input<ModelStringInput> field;
    private final Input<ModelWabaWebhookEventConditionInput> not;
    private final Input<List<ModelWabaWebhookEventConditionInput>> or;
    private final Input<ModelStringInput> payload;
    private final Input<ModelIDInput> phoneNumberId;
    private final Input<ModelIDInput> wabaAccountId;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> wabaAccountId = Input.absent();
        private Input<ModelIDInput> displayPhoneNumber = Input.absent();
        private Input<ModelIDInput> phoneNumberId = Input.absent();
        private Input<ModelStringInput> field = Input.absent();
        private Input<ModelStringInput> payload = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<List<ModelWabaWebhookEventConditionInput>> and = Input.absent();
        private Input<List<ModelWabaWebhookEventConditionInput>> or = Input.absent();
        private Input<ModelWabaWebhookEventConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaWebhookEventConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaWebhookEventConditionInput build() {
            return new ModelWabaWebhookEventConditionInput(this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.field, this.payload, this.createdAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder displayPhoneNumber(ModelIDInput modelIDInput) {
            this.displayPhoneNumber = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder field(ModelStringInput modelStringInput) {
            this.field = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelWabaWebhookEventConditionInput modelWabaWebhookEventConditionInput) {
            this.not = Input.fromNullable(modelWabaWebhookEventConditionInput);
            return this;
        }

        public Builder or(List<ModelWabaWebhookEventConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder payload(ModelStringInput modelStringInput) {
            this.payload = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder phoneNumberId(ModelIDInput modelIDInput) {
            this.phoneNumberId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder wabaAccountId(ModelIDInput modelIDInput) {
            this.wabaAccountId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelWabaWebhookEventConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<List<ModelWabaWebhookEventConditionInput>> input8, Input<List<ModelWabaWebhookEventConditionInput>> input9, Input<ModelWabaWebhookEventConditionInput> input10) {
        this.accountId = input;
        this.wabaAccountId = input2;
        this.displayPhoneNumber = input3;
        this.phoneNumberId = input4;
        this.field = input5;
        this.payload = input6;
        this.createdAt = input7;
        this.and = input8;
        this.or = input9;
        this.not = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWabaWebhookEventConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput displayPhoneNumber() {
        return this.displayPhoneNumber.value;
    }

    public ModelStringInput field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaWebhookEventConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaWebhookEventConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaWebhookEventConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaWebhookEventConditionInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventConditionInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeObject("displayPhoneNumber", ModelWabaWebhookEventConditionInput.this.displayPhoneNumber.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventConditionInput.this.displayPhoneNumber.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaWebhookEventConditionInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventConditionInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.field.defined) {
                    inputFieldWriter.writeObject("field", ModelWabaWebhookEventConditionInput.this.field.value != 0 ? ((ModelStringInput) ModelWabaWebhookEventConditionInput.this.field.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.payload.defined) {
                    inputFieldWriter.writeObject("payload", ModelWabaWebhookEventConditionInput.this.payload.value != 0 ? ((ModelStringInput) ModelWabaWebhookEventConditionInput.this.payload.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaWebhookEventConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaWebhookEventConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaWebhookEventConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaWebhookEventConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaWebhookEventConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaWebhookEventConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaWebhookEventConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaWebhookEventConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaWebhookEventConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaWebhookEventConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaWebhookEventConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaWebhookEventConditionInput.this.not.value != 0 ? ((ModelWabaWebhookEventConditionInput) ModelWabaWebhookEventConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelWabaWebhookEventConditionInput not() {
        return this.not.value;
    }

    public List<ModelWabaWebhookEventConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput payload() {
        return this.payload.value;
    }

    public ModelIDInput phoneNumberId() {
        return this.phoneNumberId.value;
    }

    public ModelIDInput wabaAccountId() {
        return this.wabaAccountId.value;
    }
}
