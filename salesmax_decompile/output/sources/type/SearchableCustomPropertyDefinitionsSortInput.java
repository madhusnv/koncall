package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCustomPropertyDefinitionsSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCustomPropertyDefinitionsSortableFields> field;

    public static final class Builder {
        private Input<SearchableCustomPropertyDefinitionsSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCustomPropertyDefinitionsSortInput build() {
            return new SearchableCustomPropertyDefinitionsSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCustomPropertyDefinitionsSortableFields searchableCustomPropertyDefinitionsSortableFields) {
            this.field = Input.fromNullable(searchableCustomPropertyDefinitionsSortableFields);
            return this;
        }
    }

    public SearchableCustomPropertyDefinitionsSortInput(Input<SearchableCustomPropertyDefinitionsSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCustomPropertyDefinitionsSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomPropertyDefinitionsSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomPropertyDefinitionsSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCustomPropertyDefinitionsSortInput.this.field.value != 0 ? ((SearchableCustomPropertyDefinitionsSortableFields) SearchableCustomPropertyDefinitionsSortInput.this.field.value).name() : null);
                }
                if (SearchableCustomPropertyDefinitionsSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCustomPropertyDefinitionsSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCustomPropertyDefinitionsSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
