package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCloudTelephonyUserFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> agentId;
    private final Input<ModelStringInput> agentNumber;
    private final Input<ModelStringInput> agentStatus;
    private final Input<ModelStringInput> allowedOutboundNumbers;
    private final Input<List<ModelCloudTelephonyUserFilterInput>> and;
    private final Input<ModelIDInput> cloudTelephonyAccount;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelIDInput> id;
    private final Input<ModelCloudTelephonyUserFilterInput> not;
    private final Input<List<ModelCloudTelephonyUserFilterInput>> or;
    private final Input<ModelBooleanInput> ouboundEnabled;
    private final Input<ModelStringInput> providerName;
    private final Input<ModelStringInput> remoteUserId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelStringInput> remoteUserId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> cloudTelephonyAccount = Input.absent();
        private Input<ModelStringInput> agentNumber = Input.absent();
        private Input<ModelStringInput> agentId = Input.absent();
        private Input<ModelStringInput> providerName = Input.absent();
        private Input<ModelStringInput> agentStatus = Input.absent();
        private Input<ModelBooleanInput> ouboundEnabled = Input.absent();
        private Input<ModelStringInput> allowedOutboundNumbers = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> createdById = Input.absent();
        private Input<ModelIDInput> updatedById = Input.absent();
        private Input<List<ModelCloudTelephonyUserFilterInput>> and = Input.absent();
        private Input<List<ModelCloudTelephonyUserFilterInput>> or = Input.absent();
        private Input<ModelCloudTelephonyUserFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder agentId(ModelStringInput modelStringInput) {
            this.agentId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder agentNumber(ModelStringInput modelStringInput) {
            this.agentNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder agentStatus(ModelStringInput modelStringInput) {
            this.agentStatus = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder allowedOutboundNumbers(ModelStringInput modelStringInput) {
            this.allowedOutboundNumbers = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelCloudTelephonyUserFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCloudTelephonyUserFilterInput build() {
            return new ModelCloudTelephonyUserFilterInput(this.id, this.userId, this.remoteUserId, this.accountId, this.cloudTelephonyAccount, this.agentNumber, this.agentId, this.providerName, this.agentStatus, this.ouboundEnabled, this.allowedOutboundNumbers, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
        }

        public Builder cloudTelephonyAccount(ModelIDInput modelIDInput) {
            this.cloudTelephonyAccount = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdById(ModelIDInput modelIDInput) {
            this.createdById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCloudTelephonyUserFilterInput modelCloudTelephonyUserFilterInput) {
            this.not = Input.fromNullable(modelCloudTelephonyUserFilterInput);
            return this;
        }

        public Builder or(List<ModelCloudTelephonyUserFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ouboundEnabled(ModelBooleanInput modelBooleanInput) {
            this.ouboundEnabled = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder providerName(ModelStringInput modelStringInput) {
            this.providerName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder remoteUserId(ModelStringInput modelStringInput) {
            this.remoteUserId = Input.fromNullable(modelStringInput);
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

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelCloudTelephonyUserFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelBooleanInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelIDInput> input14, Input<ModelIDInput> input15, Input<List<ModelCloudTelephonyUserFilterInput>> input16, Input<List<ModelCloudTelephonyUserFilterInput>> input17, Input<ModelCloudTelephonyUserFilterInput> input18) {
        this.id = input;
        this.userId = input2;
        this.remoteUserId = input3;
        this.accountId = input4;
        this.cloudTelephonyAccount = input5;
        this.agentNumber = input6;
        this.agentId = input7;
        this.providerName = input8;
        this.agentStatus = input9;
        this.ouboundEnabled = input10;
        this.allowedOutboundNumbers = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.createdById = input14;
        this.updatedById = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput agentId() {
        return this.agentId.value;
    }

    public ModelStringInput agentNumber() {
        return this.agentNumber.value;
    }

    public ModelStringInput agentStatus() {
        return this.agentStatus.value;
    }

    public ModelStringInput allowedOutboundNumbers() {
        return this.allowedOutboundNumbers.value;
    }

    public List<ModelCloudTelephonyUserFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput cloudTelephonyAccount() {
        return this.cloudTelephonyAccount.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdById() {
        return this.createdById.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudTelephonyUserFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudTelephonyUserFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCloudTelephonyUserFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelCloudTelephonyUserFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.remoteUserId.defined) {
                    inputFieldWriter.writeObject("remoteUserId", ModelCloudTelephonyUserFilterInput.this.remoteUserId.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.remoteUserId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCloudTelephonyUserFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.cloudTelephonyAccount.defined) {
                    inputFieldWriter.writeObject("cloudTelephonyAccount", ModelCloudTelephonyUserFilterInput.this.cloudTelephonyAccount.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserFilterInput.this.cloudTelephonyAccount.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.agentNumber.defined) {
                    inputFieldWriter.writeObject("agentNumber", ModelCloudTelephonyUserFilterInput.this.agentNumber.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.agentNumber.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.agentId.defined) {
                    inputFieldWriter.writeObject("agentId", ModelCloudTelephonyUserFilterInput.this.agentId.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.agentId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.providerName.defined) {
                    inputFieldWriter.writeObject("providerName", ModelCloudTelephonyUserFilterInput.this.providerName.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.providerName.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.agentStatus.defined) {
                    inputFieldWriter.writeObject("agentStatus", ModelCloudTelephonyUserFilterInput.this.agentStatus.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.agentStatus.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.ouboundEnabled.defined) {
                    inputFieldWriter.writeObject("ouboundEnabled", ModelCloudTelephonyUserFilterInput.this.ouboundEnabled.value != 0 ? ((ModelBooleanInput) ModelCloudTelephonyUserFilterInput.this.ouboundEnabled.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.allowedOutboundNumbers.defined) {
                    inputFieldWriter.writeObject("allowedOutboundNumbers", ModelCloudTelephonyUserFilterInput.this.allowedOutboundNumbers.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.allowedOutboundNumbers.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCloudTelephonyUserFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCloudTelephonyUserFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCloudTelephonyUserFilterInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserFilterInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelCloudTelephonyUserFilterInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCloudTelephonyUserFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyUserFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyUserFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyUserFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCloudTelephonyUserFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyUserFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyUserFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyUserFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyUserFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCloudTelephonyUserFilterInput.this.not.value != 0 ? ((ModelCloudTelephonyUserFilterInput) ModelCloudTelephonyUserFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCloudTelephonyUserFilterInput not() {
        return this.not.value;
    }

    public List<ModelCloudTelephonyUserFilterInput> or() {
        return this.or.value;
    }

    public ModelBooleanInput ouboundEnabled() {
        return this.ouboundEnabled.value;
    }

    public ModelStringInput providerName() {
        return this.providerName.value;
    }

    public ModelStringInput remoteUserId() {
        return this.remoteUserId.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedById() {
        return this.updatedById.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
