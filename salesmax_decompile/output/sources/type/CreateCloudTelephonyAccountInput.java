package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateCloudTelephonyAccountInput implements InputType {
    private final Input<String> accessToken;
    private final String accountId;
    private final Input<String> cloudTelephonyAccountSid;
    private final Input<String> cloudTelephonySubdomain;
    private final Input<Boolean> createNewLead;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> displayNumber;
    private final Input<String> entityListId;
    private final Input<Boolean> hasOutbound;
    private final Input<String> id;
    private final Input<String> providerAccountId;
    private final String providerName;
    private final Input<String> telephonyNumber;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String accountId;
        private String providerName;
        private Input<String> id = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public CreateCloudTelephonyAccountInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.providerName, "providerName == null");
            return new CreateCloudTelephonyAccountInput(this.id, this.accountId, this.providerName, this.telephonyNumber, this.providerAccountId, this.displayNumber, this.hasOutbound, this.createNewLead, this.accessToken, this.cloudTelephonySubdomain, this.cloudTelephonyAccountSid, this.createdAt, this.updatedAt, this.entityListId, this.createdById, this.updatedById);
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
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder providerAccountId(String str) {
            this.providerAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = str;
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

    public CreateCloudTelephonyAccountInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<Boolean> input5, Input<Boolean> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14) {
        this.id = input;
        this.accountId = str;
        this.providerName = str2;
        this.telephonyNumber = input2;
        this.providerAccountId = input3;
        this.displayNumber = input4;
        this.hasOutbound = input5;
        this.createNewLead = input6;
        this.accessToken = input7;
        this.cloudTelephonySubdomain = input8;
        this.cloudTelephonyAccountSid = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.entityListId = input12;
        this.createdById = input13;
        this.updatedById = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accessToken() {
        return this.accessToken.value;
    }

    public String accountId() {
        return this.accountId;
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
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCloudTelephonyAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCloudTelephonyAccountInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCloudTelephonyAccountInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateCloudTelephonyAccountInput.this.accountId);
                inputFieldWriter.writeString("providerName", CreateCloudTelephonyAccountInput.this.providerName);
                if (CreateCloudTelephonyAccountInput.this.telephonyNumber.defined) {
                    inputFieldWriter.writeString("telephonyNumber", (String) CreateCloudTelephonyAccountInput.this.telephonyNumber.value);
                }
                if (CreateCloudTelephonyAccountInput.this.providerAccountId.defined) {
                    inputFieldWriter.writeString("providerAccountId", (String) CreateCloudTelephonyAccountInput.this.providerAccountId.value);
                }
                if (CreateCloudTelephonyAccountInput.this.displayNumber.defined) {
                    inputFieldWriter.writeString("displayNumber", (String) CreateCloudTelephonyAccountInput.this.displayNumber.value);
                }
                if (CreateCloudTelephonyAccountInput.this.hasOutbound.defined) {
                    inputFieldWriter.writeBoolean("hasOutbound", (Boolean) CreateCloudTelephonyAccountInput.this.hasOutbound.value);
                }
                if (CreateCloudTelephonyAccountInput.this.createNewLead.defined) {
                    inputFieldWriter.writeBoolean("createNewLead", (Boolean) CreateCloudTelephonyAccountInput.this.createNewLead.value);
                }
                if (CreateCloudTelephonyAccountInput.this.accessToken.defined) {
                    inputFieldWriter.writeString("accessToken", (String) CreateCloudTelephonyAccountInput.this.accessToken.value);
                }
                if (CreateCloudTelephonyAccountInput.this.cloudTelephonySubdomain.defined) {
                    inputFieldWriter.writeString("cloudTelephonySubdomain", (String) CreateCloudTelephonyAccountInput.this.cloudTelephonySubdomain.value);
                }
                if (CreateCloudTelephonyAccountInput.this.cloudTelephonyAccountSid.defined) {
                    inputFieldWriter.writeString("cloudTelephonyAccountSid", (String) CreateCloudTelephonyAccountInput.this.cloudTelephonyAccountSid.value);
                }
                if (CreateCloudTelephonyAccountInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCloudTelephonyAccountInput.this.createdAt.value);
                }
                if (CreateCloudTelephonyAccountInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCloudTelephonyAccountInput.this.updatedAt.value);
                }
                if (CreateCloudTelephonyAccountInput.this.entityListId.defined) {
                    inputFieldWriter.writeString("entityListId", (String) CreateCloudTelephonyAccountInput.this.entityListId.value);
                }
                if (CreateCloudTelephonyAccountInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateCloudTelephonyAccountInput.this.createdById.value);
                }
                if (CreateCloudTelephonyAccountInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateCloudTelephonyAccountInput.this.updatedById.value);
                }
            }
        };
    }

    public String providerAccountId() {
        return this.providerAccountId.value;
    }

    public String providerName() {
        return this.providerName;
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
