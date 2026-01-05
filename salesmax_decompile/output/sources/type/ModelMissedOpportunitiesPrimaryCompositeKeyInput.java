package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelMissedOpportunitiesPrimaryCompositeKeyInput implements InputType {
    private final Input<String> contactId;
    private final Input<MissedOpportunityType> missedOpportunityType;
    private final Input<String> ownerId;

    public static final class Builder {
        private Input<String> ownerId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<MissedOpportunityType> missedOpportunityType = Input.absent();

        public ModelMissedOpportunitiesPrimaryCompositeKeyInput build() {
            return new ModelMissedOpportunitiesPrimaryCompositeKeyInput(this.ownerId, this.contactId, this.missedOpportunityType);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder missedOpportunityType(MissedOpportunityType missedOpportunityType) {
            this.missedOpportunityType = Input.fromNullable(missedOpportunityType);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }
    }

    public ModelMissedOpportunitiesPrimaryCompositeKeyInput(Input<String> input, Input<String> input2, Input<MissedOpportunityType> input3) {
        this.ownerId = input;
        this.contactId = input2;
        this.missedOpportunityType = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String contactId() {
        return this.contactId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMissedOpportunitiesPrimaryCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.ownerId.value);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.contactId.value);
                }
                if (ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.missedOpportunityType.defined) {
                    inputFieldWriter.writeString("missedOpportunityType", ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.missedOpportunityType.value != 0 ? ((MissedOpportunityType) ModelMissedOpportunitiesPrimaryCompositeKeyInput.this.missedOpportunityType.value).name() : null);
                }
            }
        };
    }

    public MissedOpportunityType missedOpportunityType() {
        return this.missedOpportunityType.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }
}
