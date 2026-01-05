package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCampaignRunDataByCampaignRunIdCompositeKeyInput implements InputType {
    private final Input<String> campaignRunId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> campaignRunId = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput build() {
            return new ModelCampaignRunDataByCampaignRunIdCompositeKeyInput(this.campaignRunId, this.updatedAt);
        }

        public Builder campaignRunId(String str) {
            this.campaignRunId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelCampaignRunDataByCampaignRunIdCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.campaignRunId = input;
        this.updatedAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String campaignRunId() {
        return this.campaignRunId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunDataByCampaignRunIdCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyInput.this.campaignRunId.defined) {
                    inputFieldWriter.writeString("campaignRunId", (String) ModelCampaignRunDataByCampaignRunIdCompositeKeyInput.this.campaignRunId.value);
                }
                if (ModelCampaignRunDataByCampaignRunIdCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelCampaignRunDataByCampaignRunIdCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
