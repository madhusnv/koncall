package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCampaignRunFrequencyUnitInput implements InputType {
    private final Input<CampaignRunFrequencyUnit> eq;
    private final Input<CampaignRunFrequencyUnit> ne;

    public static final class Builder {
        private Input<CampaignRunFrequencyUnit> eq = Input.absent();
        private Input<CampaignRunFrequencyUnit> ne = Input.absent();

        public ModelCampaignRunFrequencyUnitInput build() {
            return new ModelCampaignRunFrequencyUnitInput(this.eq, this.ne);
        }

        public Builder eq(CampaignRunFrequencyUnit campaignRunFrequencyUnit) {
            this.eq = Input.fromNullable(campaignRunFrequencyUnit);
            return this;
        }

        public Builder ne(CampaignRunFrequencyUnit campaignRunFrequencyUnit) {
            this.ne = Input.fromNullable(campaignRunFrequencyUnit);
            return this;
        }
    }

    public ModelCampaignRunFrequencyUnitInput(Input<CampaignRunFrequencyUnit> input, Input<CampaignRunFrequencyUnit> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CampaignRunFrequencyUnit eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignRunFrequencyUnitInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignRunFrequencyUnitInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelCampaignRunFrequencyUnitInput.this.eq.value != 0 ? ((CampaignRunFrequencyUnit) ModelCampaignRunFrequencyUnitInput.this.eq.value).name() : null);
                }
                if (ModelCampaignRunFrequencyUnitInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelCampaignRunFrequencyUnitInput.this.ne.value != 0 ? ((CampaignRunFrequencyUnit) ModelCampaignRunFrequencyUnitInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public CampaignRunFrequencyUnit ne() {
        return this.ne.value;
    }
}
