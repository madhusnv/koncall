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
public final class UpdateCloudTelephonyUserInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> agentId;
    private final Input<String> agentNumber;
    private final Input<String> agentStatus;
    private final Input<List<String>> allowedOutboundNumbers;
    private final Input<String> cloudTelephonyAccount;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final String id;
    private final Input<Boolean> ouboundEnabled;
    private final Input<String> providerName;
    private final Input<String> remoteUserId;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<String> userId;

    public static final class Builder {
        private String id;
        private Input<String> userId = Input.absent();
        private Input<String> remoteUserId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> cloudTelephonyAccount = Input.absent();
        private Input<String> agentNumber = Input.absent();
        private Input<String> agentId = Input.absent();
        private Input<String> providerName = Input.absent();
        private Input<String> agentStatus = Input.absent();
        private Input<Boolean> ouboundEnabled = Input.absent();
        private Input<List<String>> allowedOutboundNumbers = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder agentId(String str) {
            this.agentId = Input.fromNullable(str);
            return this;
        }

        public Builder agentNumber(String str) {
            this.agentNumber = Input.fromNullable(str);
            return this;
        }

        public Builder agentStatus(String str) {
            this.agentStatus = Input.fromNullable(str);
            return this;
        }

        public Builder allowedOutboundNumbers(List<String> list) {
            this.allowedOutboundNumbers = Input.fromNullable(list);
            return this;
        }

        public UpdateCloudTelephonyUserInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCloudTelephonyUserInput(this.id, this.userId, this.remoteUserId, this.accountId, this.cloudTelephonyAccount, this.agentNumber, this.agentId, this.providerName, this.agentStatus, this.ouboundEnabled, this.allowedOutboundNumbers, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        public Builder cloudTelephonyAccount(String str) {
            this.cloudTelephonyAccount = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder ouboundEnabled(Boolean bool) {
            this.ouboundEnabled = Input.fromNullable(bool);
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = Input.fromNullable(str);
            return this;
        }

        public Builder remoteUserId(String str) {
            this.remoteUserId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCloudTelephonyUserInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<Boolean> input9, Input<List<String>> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String agentId() {
        return this.agentId.value;
    }

    public String agentNumber() {
        return this.agentNumber.value;
    }

    public String agentStatus() {
        return this.agentStatus.value;
    }

    public List<String> allowedOutboundNumbers() {
        return this.allowedOutboundNumbers.value;
    }

    public String cloudTelephonyAccount() {
        return this.cloudTelephonyAccount.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCloudTelephonyUserInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCloudTelephonyUserInput.this.id);
                if (UpdateCloudTelephonyUserInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateCloudTelephonyUserInput.this.userId.value);
                }
                if (UpdateCloudTelephonyUserInput.this.remoteUserId.defined) {
                    inputFieldWriter.writeString("remoteUserId", (String) UpdateCloudTelephonyUserInput.this.remoteUserId.value);
                }
                if (UpdateCloudTelephonyUserInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCloudTelephonyUserInput.this.accountId.value);
                }
                if (UpdateCloudTelephonyUserInput.this.cloudTelephonyAccount.defined) {
                    inputFieldWriter.writeString("cloudTelephonyAccount", (String) UpdateCloudTelephonyUserInput.this.cloudTelephonyAccount.value);
                }
                if (UpdateCloudTelephonyUserInput.this.agentNumber.defined) {
                    inputFieldWriter.writeString("agentNumber", (String) UpdateCloudTelephonyUserInput.this.agentNumber.value);
                }
                if (UpdateCloudTelephonyUserInput.this.agentId.defined) {
                    inputFieldWriter.writeString("agentId", (String) UpdateCloudTelephonyUserInput.this.agentId.value);
                }
                if (UpdateCloudTelephonyUserInput.this.providerName.defined) {
                    inputFieldWriter.writeString("providerName", (String) UpdateCloudTelephonyUserInput.this.providerName.value);
                }
                if (UpdateCloudTelephonyUserInput.this.agentStatus.defined) {
                    inputFieldWriter.writeString("agentStatus", (String) UpdateCloudTelephonyUserInput.this.agentStatus.value);
                }
                if (UpdateCloudTelephonyUserInput.this.ouboundEnabled.defined) {
                    inputFieldWriter.writeBoolean("ouboundEnabled", (Boolean) UpdateCloudTelephonyUserInput.this.ouboundEnabled.value);
                }
                if (UpdateCloudTelephonyUserInput.this.allowedOutboundNumbers.defined) {
                    inputFieldWriter.writeList("allowedOutboundNumbers", UpdateCloudTelephonyUserInput.this.allowedOutboundNumbers.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateCloudTelephonyUserInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateCloudTelephonyUserInput.this.allowedOutboundNumbers.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateCloudTelephonyUserInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCloudTelephonyUserInput.this.createdAt.value);
                }
                if (UpdateCloudTelephonyUserInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCloudTelephonyUserInput.this.updatedAt.value);
                }
                if (UpdateCloudTelephonyUserInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateCloudTelephonyUserInput.this.createdById.value);
                }
                if (UpdateCloudTelephonyUserInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateCloudTelephonyUserInput.this.updatedById.value);
                }
            }
        };
    }

    public Boolean ouboundEnabled() {
        return this.ouboundEnabled.value;
    }

    public String providerName() {
        return this.providerName.value;
    }

    public String remoteUserId() {
        return this.remoteUserId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
