package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateContactBusinessMembershipInput implements InputType {
    private final String accountId;
    private final Input<AssociatedCreationType> associatedCreationType;
    private final String businessId;
    private final String contactId;
    private final Input<String> contactRelationship;
    private final Input<String> createdAt;
    private final Input<String> department;
    private final Input<String> designation;
    private final Input<String> id;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String businessId;
        private String contactId;
        private Input<String> id = Input.absent();
        private Input<String> contactRelationship = Input.absent();
        private Input<String> department = Input.absent();
        private Input<String> designation = Input.absent();
        private Input<AssociatedCreationType> associatedCreationType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder associatedCreationType(AssociatedCreationType associatedCreationType) {
            this.associatedCreationType = Input.fromNullable(associatedCreationType);
            return this;
        }

        public CreateContactBusinessMembershipInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.businessId, "businessId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            return new CreateContactBusinessMembershipInput(this.id, this.accountId, this.businessId, this.contactId, this.contactRelationship, this.department, this.designation, this.associatedCreationType, this.createdAt, this.updatedAt);
        }

        public Builder businessId(String str) {
            this.businessId = str;
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = str;
            return this;
        }

        public Builder contactRelationship(String str) {
            this.contactRelationship = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder department(String str) {
            this.department = Input.fromNullable(str);
            return this;
        }

        public Builder designation(String str) {
            this.designation = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateContactBusinessMembershipInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<String> input3, Input<String> input4, Input<AssociatedCreationType> input5, Input<String> input6, Input<String> input7) {
        this.id = input;
        this.accountId = str;
        this.businessId = str2;
        this.contactId = str3;
        this.contactRelationship = input2;
        this.department = input3;
        this.designation = input4;
        this.associatedCreationType = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public AssociatedCreationType associatedCreationType() {
        return this.associatedCreationType.value;
    }

    public String businessId() {
        return this.businessId;
    }

    public String contactId() {
        return this.contactId;
    }

    public String contactRelationship() {
        return this.contactRelationship.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String department() {
        return this.department.value;
    }

    public String designation() {
        return this.designation.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateContactBusinessMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateContactBusinessMembershipInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateContactBusinessMembershipInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateContactBusinessMembershipInput.this.accountId);
                inputFieldWriter.writeString("businessId", CreateContactBusinessMembershipInput.this.businessId);
                inputFieldWriter.writeString("contactId", CreateContactBusinessMembershipInput.this.contactId);
                if (CreateContactBusinessMembershipInput.this.contactRelationship.defined) {
                    inputFieldWriter.writeString("contactRelationship", (String) CreateContactBusinessMembershipInput.this.contactRelationship.value);
                }
                if (CreateContactBusinessMembershipInput.this.department.defined) {
                    inputFieldWriter.writeString("department", (String) CreateContactBusinessMembershipInput.this.department.value);
                }
                if (CreateContactBusinessMembershipInput.this.designation.defined) {
                    inputFieldWriter.writeString("designation", (String) CreateContactBusinessMembershipInput.this.designation.value);
                }
                if (CreateContactBusinessMembershipInput.this.associatedCreationType.defined) {
                    inputFieldWriter.writeString("associatedCreationType", CreateContactBusinessMembershipInput.this.associatedCreationType.value != 0 ? ((AssociatedCreationType) CreateContactBusinessMembershipInput.this.associatedCreationType.value).name() : null);
                }
                if (CreateContactBusinessMembershipInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateContactBusinessMembershipInput.this.createdAt.value);
                }
                if (CreateContactBusinessMembershipInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateContactBusinessMembershipInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
