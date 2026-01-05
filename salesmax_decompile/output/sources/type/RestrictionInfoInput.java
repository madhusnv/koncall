package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class RestrictionInfoInput implements InputType {
    private final Input<String> restrictionExpiry;
    private final Input<String> restrictionType;

    public static final class Builder {
        private Input<String> restrictionType = Input.absent();
        private Input<String> restrictionExpiry = Input.absent();

        public RestrictionInfoInput build() {
            return new RestrictionInfoInput(this.restrictionType, this.restrictionExpiry);
        }

        public Builder restrictionExpiry(String str) {
            this.restrictionExpiry = Input.fromNullable(str);
            return this;
        }

        public Builder restrictionType(String str) {
            this.restrictionType = Input.fromNullable(str);
            return this;
        }
    }

    public RestrictionInfoInput(Input<String> input, Input<String> input2) {
        this.restrictionType = input;
        this.restrictionExpiry = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.RestrictionInfoInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (RestrictionInfoInput.this.restrictionType.defined) {
                    inputFieldWriter.writeString("restrictionType", (String) RestrictionInfoInput.this.restrictionType.value);
                }
                if (RestrictionInfoInput.this.restrictionExpiry.defined) {
                    inputFieldWriter.writeString("restrictionExpiry", (String) RestrictionInfoInput.this.restrictionExpiry.value);
                }
            }
        };
    }

    public String restrictionExpiry() {
        return this.restrictionExpiry.value;
    }

    public String restrictionType() {
        return this.restrictionType.value;
    }
}
