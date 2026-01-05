package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCloudTelephonyUserConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> agentId;
    private final Input<ModelStringInput> agentNumber;
    private final Input<ModelStringInput> agentStatus;
    private final Input<ModelStringInput> allowedOutboundNumbers;
    private final Input<List<ModelCloudTelephonyUserConditionInput>> and;
    private final Input<ModelIDInput> cloudTelephonyAccount;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdById;
    private final Input<ModelCloudTelephonyUserConditionInput> not;
    private final Input<List<ModelCloudTelephonyUserConditionInput>> or;
    private final Input<ModelBooleanInput> ouboundEnabled;
    private final Input<ModelStringInput> providerName;
    private final Input<ModelStringInput> remoteUserId;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedById;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
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
        private Input<List<ModelCloudTelephonyUserConditionInput>> and = Input.absent();
        private Input<List<ModelCloudTelephonyUserConditionInput>> or = Input.absent();
        private Input<ModelCloudTelephonyUserConditionInput> not = Input.absent();

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

        public Builder and(List<ModelCloudTelephonyUserConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCloudTelephonyUserConditionInput build() {
            return new ModelCloudTelephonyUserConditionInput(this.userId, this.remoteUserId, this.accountId, this.cloudTelephonyAccount, this.agentNumber, this.agentId, this.providerName, this.agentStatus, this.ouboundEnabled, this.allowedOutboundNumbers, this.createdAt, this.updatedAt, this.createdById, this.updatedById, this.and, this.or, this.not);
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

        public Builder not(ModelCloudTelephonyUserConditionInput modelCloudTelephonyUserConditionInput) {
            this.not = Input.fromNullable(modelCloudTelephonyUserConditionInput);
            return this;
        }

        public Builder or(List<ModelCloudTelephonyUserConditionInput> list) {
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

    public ModelCloudTelephonyUserConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelIDInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelBooleanInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelIDInput> input13, Input<ModelIDInput> input14, Input<List<ModelCloudTelephonyUserConditionInput>> input15, Input<List<ModelCloudTelephonyUserConditionInput>> input16, Input<ModelCloudTelephonyUserConditionInput> input17) {
        this.userId = input;
        this.remoteUserId = input2;
        this.accountId = input3;
        this.cloudTelephonyAccount = input4;
        this.agentNumber = input5;
        this.agentId = input6;
        this.providerName = input7;
        this.agentStatus = input8;
        this.ouboundEnabled = input9;
        this.allowedOutboundNumbers = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.createdById = input13;
        this.updatedById = input14;
        this.and = input15;
        this.or = input16;
        this.not = input17;
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

    public List<ModelCloudTelephonyUserConditionInput> and() {
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudTelephonyUserConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudTelephonyUserConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelCloudTelephonyUserConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.remoteUserId.defined) {
                    inputFieldWriter.writeObject("remoteUserId", ModelCloudTelephonyUserConditionInput.this.remoteUserId.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.remoteUserId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCloudTelephonyUserConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.cloudTelephonyAccount.defined) {
                    inputFieldWriter.writeObject("cloudTelephonyAccount", ModelCloudTelephonyUserConditionInput.this.cloudTelephonyAccount.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserConditionInput.this.cloudTelephonyAccount.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.agentNumber.defined) {
                    inputFieldWriter.writeObject("agentNumber", ModelCloudTelephonyUserConditionInput.this.agentNumber.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.agentNumber.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.agentId.defined) {
                    inputFieldWriter.writeObject("agentId", ModelCloudTelephonyUserConditionInput.this.agentId.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.agentId.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.providerName.defined) {
                    inputFieldWriter.writeObject("providerName", ModelCloudTelephonyUserConditionInput.this.providerName.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.providerName.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.agentStatus.defined) {
                    inputFieldWriter.writeObject("agentStatus", ModelCloudTelephonyUserConditionInput.this.agentStatus.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.agentStatus.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.ouboundEnabled.defined) {
                    inputFieldWriter.writeObject("ouboundEnabled", ModelCloudTelephonyUserConditionInput.this.ouboundEnabled.value != 0 ? ((ModelBooleanInput) ModelCloudTelephonyUserConditionInput.this.ouboundEnabled.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.allowedOutboundNumbers.defined) {
                    inputFieldWriter.writeObject("allowedOutboundNumbers", ModelCloudTelephonyUserConditionInput.this.allowedOutboundNumbers.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.allowedOutboundNumbers.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCloudTelephonyUserConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCloudTelephonyUserConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCloudTelephonyUserConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.createdById.defined) {
                    inputFieldWriter.writeObject("createdById", ModelCloudTelephonyUserConditionInput.this.createdById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserConditionInput.this.createdById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", ModelCloudTelephonyUserConditionInput.this.updatedById.value != 0 ? ((ModelIDInput) ModelCloudTelephonyUserConditionInput.this.updatedById.value).marshaller() : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCloudTelephonyUserConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyUserConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyUserConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyUserConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCloudTelephonyUserConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudTelephonyUserConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudTelephonyUserConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudTelephonyUserConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudTelephonyUserConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCloudTelephonyUserConditionInput.this.not.value != 0 ? ((ModelCloudTelephonyUserConditionInput) ModelCloudTelephonyUserConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCloudTelephonyUserConditionInput not() {
        return this.not.value;
    }

    public List<ModelCloudTelephonyUserConditionInput> or() {
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
