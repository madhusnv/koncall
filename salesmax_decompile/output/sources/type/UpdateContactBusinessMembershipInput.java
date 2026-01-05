package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateContactBusinessMembershipInput implements InputType {
    private final Input<String> accountId;
    private final Input<AssociatedCreationType> associatedCreationType;
    private final Input<String> businessId;
    private final Input<String> contactId;
    private final Input<String> contactRelationship;
    private final Input<String> createdAt;
    private final Input<String> department;
    private final Input<String> designation;
    private final String id;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> businessId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> contactRelationship = Input.absent();
        private Input<String> department = Input.absent();
        private Input<String> designation = Input.absent();
        private Input<AssociatedCreationType> associatedCreationType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder associatedCreationType(AssociatedCreationType associatedCreationType) {
            this.associatedCreationType = Input.fromNullable(associatedCreationType);
            return this;
        }

        public UpdateContactBusinessMembershipInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateContactBusinessMembershipInput(this.id, this.accountId, this.businessId, this.contactId, this.contactRelationship, this.department, this.designation, this.associatedCreationType, this.createdAt, this.updatedAt);
        }

        public Builder businessId(String str) {
            this.businessId = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
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
            this.id = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateContactBusinessMembershipInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<AssociatedCreationType> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.accountId = input;
        this.businessId = input2;
        this.contactId = input3;
        this.contactRelationship = input4;
        this.department = input5;
        this.designation = input6;
        this.associatedCreationType = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public AssociatedCreationType associatedCreationType() {
        return this.associatedCreationType.value;
    }

    public String businessId() {
        return this.businessId.value;
    }

    public String contactId() {
        return this.contactId.value;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateContactBusinessMembershipInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateContactBusinessMembershipInput.this.id);
                if (UpdateContactBusinessMembershipInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateContactBusinessMembershipInput.this.accountId.value);
                }
                if (UpdateContactBusinessMembershipInput.this.businessId.defined) {
                    inputFieldWriter.writeString("businessId", (String) UpdateContactBusinessMembershipInput.this.businessId.value);
                }
                if (UpdateContactBusinessMembershipInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateContactBusinessMembershipInput.this.contactId.value);
                }
                if (UpdateContactBusinessMembershipInput.this.contactRelationship.defined) {
                    inputFieldWriter.writeString("contactRelationship", (String) UpdateContactBusinessMembershipInput.this.contactRelationship.value);
                }
                if (UpdateContactBusinessMembershipInput.this.department.defined) {
                    inputFieldWriter.writeString("department", (String) UpdateContactBusinessMembershipInput.this.department.value);
                }
                if (UpdateContactBusinessMembershipInput.this.designation.defined) {
                    inputFieldWriter.writeString("designation", (String) UpdateContactBusinessMembershipInput.this.designation.value);
                }
                if (UpdateContactBusinessMembershipInput.this.associatedCreationType.defined) {
                    inputFieldWriter.writeString("associatedCreationType", UpdateContactBusinessMembershipInput.this.associatedCreationType.value != 0 ? ((AssociatedCreationType) UpdateContactBusinessMembershipInput.this.associatedCreationType.value).name() : null);
                }
                if (UpdateContactBusinessMembershipInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateContactBusinessMembershipInput.this.createdAt.value);
                }
                if (UpdateContactBusinessMembershipInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateContactBusinessMembershipInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
