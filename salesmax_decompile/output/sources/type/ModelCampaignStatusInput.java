package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCampaignStatusInput implements InputType {
    private final Input<CampaignStatus> eq;
    private final Input<CampaignStatus> ne;

    public static final class Builder {
        private Input<CampaignStatus> eq = Input.absent();
        private Input<CampaignStatus> ne = Input.absent();

        public ModelCampaignStatusInput build() {
            return new ModelCampaignStatusInput(this.eq, this.ne);
        }

        public Builder eq(CampaignStatus campaignStatus) {
            this.eq = Input.fromNullable(campaignStatus);
            return this;
        }

        public Builder ne(CampaignStatus campaignStatus) {
            this.ne = Input.fromNullable(campaignStatus);
            return this;
        }
    }

    public ModelCampaignStatusInput(Input<CampaignStatus> input, Input<CampaignStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CampaignStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelCampaignStatusInput.this.eq.value != 0 ? ((CampaignStatus) ModelCampaignStatusInput.this.eq.value).name() : null);
                }
                if (ModelCampaignStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelCampaignStatusInput.this.ne.value != 0 ? ((CampaignStatus) ModelCampaignStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public CampaignStatus ne() {
        return this.ne.value;
    }
}
