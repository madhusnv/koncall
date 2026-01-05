package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateCloudTelephonyAccountInput implements InputType {
    private final Input<String> accessToken;
    private final Input<String> accountId;
    private final Input<String> cloudTelephonyAccountSid;
    private final Input<String> cloudTelephonySubdomain;
    private final Input<Boolean> createNewLead;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> displayNumber;
    private final Input<String> entityListId;
    private final Input<Boolean> hasOutbound;
    private final String id;
    private final Input<String> providerAccountId;
    private final Input<String> providerName;
    private final Input<String> telephonyNumber;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> providerName = Input.absent();
        private Input<String> telephonyNumber = Input.absent();
        private Input<String> providerAccountId = Input.absent();
        private Input<String> displayNumber = Input.absent();
        private Input<Boolean> hasOutbound = Input.absent();
        private Input<Boolean> createNewLead = Input.absent();
        private Input<String> accessToken = Input.absent();
        private Input<String> cloudTelephonySubdomain = Input.absent();
        private Input<String> cloudTelephonyAccountSid = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> entityListId = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accessToken(String str) {
            this.accessToken = Input.fromNullable(str);
            return this;
        }

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCloudTelephonyAccountInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCloudTelephonyAccountInput(this.id, this.accountId, this.providerName, this.telephonyNumber, this.providerAccountId, this.displayNumber, this.hasOutbound, this.createNewLead, this.accessToken, this.cloudTelephonySubdomain, this.cloudTelephonyAccountSid, this.createdAt, this.updatedAt, this.entityListId, this.createdById, this.updatedById);
        }

        public Builder cloudTelephonyAccountSid(String str) {
            this.cloudTelephonyAccountSid = Input.fromNullable(str);
            return this;
        }

        public Builder cloudTelephonySubdomain(String str) {
            this.cloudTelephonySubdomain = Input.fromNullable(str);
            return this;
        }

        public Builder createNewLead(Boolean bool) {
            this.createNewLead = Input.fromNullable(bool);
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

        public Builder displayNumber(String str) {
            this.displayNumber = Input.fromNullable(str);
            return this;
        }

        public Builder entityListId(String str) {
            this.entityListId = Input.fromNullable(str);
            return this;
        }

        public Builder hasOutbound(Boolean bool) {
            this.hasOutbound = Input.fromNullable(bool);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder providerAccountId(String str) {
            this.providerAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = Input.fromNullable(str);
            return this;
        }

        public Builder telephonyNumber(String str) {
            this.telephonyNumber = Input.fromNullable(str);
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
    }

    public UpdateCloudTelephonyAccountInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Boolean> input6, Input<Boolean> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15) {
        this.id = str;
        this.accountId = input;
        this.providerName = input2;
        this.telephonyNumber = input3;
        this.providerAccountId = input4;
        this.displayNumber = input5;
        this.hasOutbound = input6;
        this.createNewLead = input7;
        this.accessToken = input8;
        this.cloudTelephonySubdomain = input9;
        this.cloudTelephonyAccountSid = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
        this.entityListId = input13;
        this.createdById = input14;
        this.updatedById = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accessToken() {
        return this.accessToken.value;
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String cloudTelephonyAccountSid() {
        return this.cloudTelephonyAccountSid.value;
    }

    public String cloudTelephonySubdomain() {
        return this.cloudTelephonySubdomain.value;
    }

    public Boolean createNewLead() {
        return this.createNewLead.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdById() {
        return this.createdById.value;
    }

    public String displayNumber() {
        return this.displayNumber.value;
    }

    public String entityListId() {
        return this.entityListId.value;
    }

    public Boolean hasOutbound() {
        return this.hasOutbound.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCloudTelephonyAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCloudTelephonyAccountInput.this.id);
                if (UpdateCloudTelephonyAccountInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCloudTelephonyAccountInput.this.accountId.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.providerName.defined) {
                    inputFieldWriter.writeString("providerName", (String) UpdateCloudTelephonyAccountInput.this.providerName.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.telephonyNumber.defined) {
                    inputFieldWriter.writeString("telephonyNumber", (String) UpdateCloudTelephonyAccountInput.this.telephonyNumber.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.providerAccountId.defined) {
                    inputFieldWriter.writeString("providerAccountId", (String) UpdateCloudTelephonyAccountInput.this.providerAccountId.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.displayNumber.defined) {
                    inputFieldWriter.writeString("displayNumber", (String) UpdateCloudTelephonyAccountInput.this.displayNumber.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.hasOutbound.defined) {
                    inputFieldWriter.writeBoolean("hasOutbound", (Boolean) UpdateCloudTelephonyAccountInput.this.hasOutbound.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.createNewLead.defined) {
                    inputFieldWriter.writeBoolean("createNewLead", (Boolean) UpdateCloudTelephonyAccountInput.this.createNewLead.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.accessToken.defined) {
                    inputFieldWriter.writeString("accessToken", (String) UpdateCloudTelephonyAccountInput.this.accessToken.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.cloudTelephonySubdomain.defined) {
                    inputFieldWriter.writeString("cloudTelephonySubdomain", (String) UpdateCloudTelephonyAccountInput.this.cloudTelephonySubdomain.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.cloudTelephonyAccountSid.defined) {
                    inputFieldWriter.writeString("cloudTelephonyAccountSid", (String) UpdateCloudTelephonyAccountInput.this.cloudTelephonyAccountSid.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCloudTelephonyAccountInput.this.createdAt.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCloudTelephonyAccountInput.this.updatedAt.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) UpdateCloudTelephonyAccountInput.this.entityListId.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateCloudTelephonyAccountInput.this.createdById.value);
                }
                if (UpdateCloudTelephonyAccountInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateCloudTelephonyAccountInput.this.updatedById.value);
                }
            }
        };
    }

    public String providerAccountId() {
        return this.providerAccountId.value;
    }

    public String providerName() {
        return this.providerName.value;
    }

    public String telephonyNumber() {
        return this.telephonyNumber.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
