package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCustomAttributeFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> fieldName;
    private final Input<SearchableStringFilterInput> fieldValue;

    public static final class Builder {
        private Input<SearchableIDFilterInput> fieldName = Input.absent();
        private Input<SearchableStringFilterInput> fieldValue = Input.absent();

        public SearchableCustomAttributeFilterInput build() {
            return new SearchableCustomAttributeFilterInput(this.fieldName, this.fieldValue);
        }

        public Builder fieldName(SearchableIDFilterInput searchableIDFilterInput) {
            this.fieldName = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder fieldValue(SearchableStringFilterInput searchableStringFilterInput) {
            this.fieldValue = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableCustomAttributeFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableStringFilterInput> input2) {
        this.fieldName = input;
        this.fieldValue = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput fieldName() {
        return this.fieldName.value;
    }

    public SearchableStringFilterInput fieldValue() {
        return this.fieldValue.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomAttributeFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomAttributeFilterInput.this.fieldName.defined) {
                    inputFieldWriter.writeObject("fieldName", SearchableCustomAttributeFilterInput.this.fieldName.value != 0 ? ((SearchableIDFilterInput) SearchableCustomAttributeFilterInput.this.fieldName.value).marshaller() : null);
                }
                if (SearchableCustomAttributeFilterInput.this.fieldValue.defined) {
                    inputFieldWriter.writeObject("fieldValue", SearchableCustomAttributeFilterInput.this.fieldValue.value != 0 ? ((SearchableStringFilterInput) SearchableCustomAttributeFilterInput.this.fieldValue.value).marshaller() : null);
                }
            }
        };
    }
}
