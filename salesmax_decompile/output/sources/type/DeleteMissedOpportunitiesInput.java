package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteMissedOpportunitiesInput implements InputType {
    private final String accountId;
    private final String contactId;
    private final MissedOpportunityType missedOpportunityType;
    private final String ownerId;

    public static final class Builder {
        private String accountId;
        private String contactId;
        private MissedOpportunityType missedOpportunityType;
        private String ownerId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteMissedOpportunitiesInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            Utils.checkNotNull(this.missedOpportunityType, "missedOpportunityType == null");
            return new DeleteMissedOpportunitiesInput(this.accountId, this.ownerId, this.contactId, this.missedOpportunityType);
        }

        public Builder contactId(String str) {
            this.contactId = str;
            return this;
        }

        public Builder missedOpportunityType(MissedOpportunityType missedOpportunityType) {
            this.missedOpportunityType = missedOpportunityType;
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }
    }

    public DeleteMissedOpportunitiesInput(String str, String str2, String str3, MissedOpportunityType missedOpportunityType) {
        this.accountId = str;
        this.ownerId = str2;
        this.contactId = str3;
        this.missedOpportunityType = missedOpportunityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String contactId() {
        return this.contactId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteMissedOpportunitiesInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteMissedOpportunitiesInput.this.accountId);
                inputFieldWriter.writeString("ownerId", DeleteMissedOpportunitiesInput.this.ownerId);
                inputFieldWriter.writeString("contactId", DeleteMissedOpportunitiesInput.this.contactId);
                inputFieldWriter.writeString("missedOpportunityType", DeleteMissedOpportunitiesInput.this.missedOpportunityType.name());
            }
        };
    }

    public MissedOpportunityType missedOpportunityType() {
        return this.missedOpportunityType;
    }

    public String ownerId() {
        return this.ownerId;
    }
}
