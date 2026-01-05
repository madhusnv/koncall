package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelWabaWebhookEventFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelWabaWebhookEventFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> displayPhoneNumber;
    private final Input<ModelStringInput> field;
    private final Input<ModelIDInput> id;
    private final Input<ModelWabaWebhookEventFilterInput> not;
    private final Input<List<ModelWabaWebhookEventFilterInput>> or;
    private final Input<ModelStringInput> payload;
    private final Input<ModelIDInput> phoneNumberId;
    private final Input<ModelIDInput> wabaAccountId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> wabaAccountId = Input.absent();
        private Input<ModelIDInput> displayPhoneNumber = Input.absent();
        private Input<ModelIDInput> phoneNumberId = Input.absent();
        private Input<ModelStringInput> field = Input.absent();
        private Input<ModelStringInput> payload = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<List<ModelWabaWebhookEventFilterInput>> and = Input.absent();
        private Input<List<ModelWabaWebhookEventFilterInput>> or = Input.absent();
        private Input<ModelWabaWebhookEventFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelWabaWebhookEventFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelWabaWebhookEventFilterInput build() {
            return new ModelWabaWebhookEventFilterInput(this.id, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.field, this.payload, this.createdAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelWabaWebhookEventFilterInput modelWabaWebhookEventFilterInput) {
            this.not = Input.fromNullable(modelWabaWebhookEventFilterInput);
            return this;
        }

        public Builder or(List<ModelWabaWebhookEventFilterInput> list) {
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

    public ModelWabaWebhookEventFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<List<ModelWabaWebhookEventFilterInput>> input9, Input<List<ModelWabaWebhookEventFilterInput>> input10, Input<ModelWabaWebhookEventFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.wabaAccountId = input3;
        this.displayPhoneNumber = input4;
        this.phoneNumberId = input5;
        this.field = input6;
        this.payload = input7;
        this.createdAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelWabaWebhookEventFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelWabaWebhookEventFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelWabaWebhookEventFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelWabaWebhookEventFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelWabaWebhookEventFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.wabaAccountId.defined) {
                    inputFieldWriter.writeObject("wabaAccountId", ModelWabaWebhookEventFilterInput.this.wabaAccountId.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventFilterInput.this.wabaAccountId.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.displayPhoneNumber.defined) {
                    inputFieldWriter.writeObject("displayPhoneNumber", ModelWabaWebhookEventFilterInput.this.displayPhoneNumber.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventFilterInput.this.displayPhoneNumber.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.phoneNumberId.defined) {
                    inputFieldWriter.writeObject("phoneNumberId", ModelWabaWebhookEventFilterInput.this.phoneNumberId.value != 0 ? ((ModelIDInput) ModelWabaWebhookEventFilterInput.this.phoneNumberId.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.field.defined) {
                    inputFieldWriter.writeObject("field", ModelWabaWebhookEventFilterInput.this.field.value != 0 ? ((ModelStringInput) ModelWabaWebhookEventFilterInput.this.field.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.payload.defined) {
                    inputFieldWriter.writeObject("payload", ModelWabaWebhookEventFilterInput.this.payload.value != 0 ? ((ModelStringInput) ModelWabaWebhookEventFilterInput.this.payload.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelWabaWebhookEventFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelWabaWebhookEventFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelWabaWebhookEventFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaWebhookEventFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaWebhookEventFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaWebhookEventFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelWabaWebhookEventFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelWabaWebhookEventFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelWabaWebhookEventFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelWabaWebhookEventFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelWabaWebhookEventFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelWabaWebhookEventFilterInput.this.not.value != 0 ? ((ModelWabaWebhookEventFilterInput) ModelWabaWebhookEventFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelWabaWebhookEventFilterInput not() {
        return this.not.value;
    }

    public List<ModelWabaWebhookEventFilterInput> or() {
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
