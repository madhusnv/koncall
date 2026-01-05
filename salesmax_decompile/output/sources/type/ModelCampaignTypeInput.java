package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCampaignTypeInput implements InputType {
    private final Input<CampaignType> eq;
    private final Input<CampaignType> ne;

    public static final class Builder {
        private Input<CampaignType> eq = Input.absent();
        private Input<CampaignType> ne = Input.absent();

        public ModelCampaignTypeInput build() {
            return new ModelCampaignTypeInput(this.eq, this.ne);
        }

        public Builder eq(CampaignType campaignType) {
            this.eq = Input.fromNullable(campaignType);
            return this;
        }

        public Builder ne(CampaignType campaignType) {
            this.ne = Input.fromNullable(campaignType);
            return this;
        }
    }

    public ModelCampaignTypeInput(Input<CampaignType> input, Input<CampaignType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CampaignType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCampaignTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCampaignTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelCampaignTypeInput.this.eq.value != 0 ? ((CampaignType) ModelCampaignTypeInput.this.eq.value).name() : null);
                }
                if (ModelCampaignTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelCampaignTypeInput.this.ne.value != 0 ? ((CampaignType) ModelCampaignTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public CampaignType ne() {
        return this.ne.value;
    }
}
