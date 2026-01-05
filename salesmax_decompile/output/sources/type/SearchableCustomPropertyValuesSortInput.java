package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCustomPropertyValuesSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCustomPropertyValuesSortableFields> field;

    public static final class Builder {
        private Input<SearchableCustomPropertyValuesSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCustomPropertyValuesSortInput build() {
            return new SearchableCustomPropertyValuesSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCustomPropertyValuesSortableFields searchableCustomPropertyValuesSortableFields) {
            this.field = Input.fromNullable(searchableCustomPropertyValuesSortableFields);
            return this;
        }
    }

    public SearchableCustomPropertyValuesSortInput(Input<SearchableCustomPropertyValuesSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCustomPropertyValuesSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomPropertyValuesSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomPropertyValuesSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCustomPropertyValuesSortInput.this.field.value != 0 ? ((SearchableCustomPropertyValuesSortableFields) SearchableCustomPropertyValuesSortInput.this.field.value).name() : null);
                }
                if (SearchableCustomPropertyValuesSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCustomPropertyValuesSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCustomPropertyValuesSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
