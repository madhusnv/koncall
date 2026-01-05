package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableBooleanFilterInput implements InputType {
    private final Input<Boolean> eq;
    private final Input<Boolean> ne;

    public static final class Builder {
        private Input<Boolean> eq = Input.absent();
        private Input<Boolean> ne = Input.absent();

        public SearchableBooleanFilterInput build() {
            return new SearchableBooleanFilterInput(this.eq, this.ne);
        }

        public Builder eq(Boolean bool) {
            this.eq = Input.fromNullable(bool);
            return this;
        }

        public Builder ne(Boolean bool) {
            this.ne = Input.fromNullable(bool);
            return this;
        }
    }

    public SearchableBooleanFilterInput(Input<Boolean> input, Input<Boolean> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableBooleanFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableBooleanFilterInput.this.eq.defined) {
                    inputFieldWriter.writeBoolean("eq", (Boolean) SearchableBooleanFilterInput.this.eq.value);
                }
                if (SearchableBooleanFilterInput.this.ne.defined) {
                    inputFieldWriter.writeBoolean("ne", (Boolean) SearchableBooleanFilterInput.this.ne.value);
                }
            }
        };
    }

    public Boolean ne() {
        return this.ne.value;
    }
}
