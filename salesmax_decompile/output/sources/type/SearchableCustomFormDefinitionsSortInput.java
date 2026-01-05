package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCustomFormDefinitionsSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCustomFormDefinitionsSortableFields> field;

    public static final class Builder {
        private Input<SearchableCustomFormDefinitionsSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCustomFormDefinitionsSortInput build() {
            return new SearchableCustomFormDefinitionsSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCustomFormDefinitionsSortableFields searchableCustomFormDefinitionsSortableFields) {
            this.field = Input.fromNullable(searchableCustomFormDefinitionsSortableFields);
            return this;
        }
    }

    public SearchableCustomFormDefinitionsSortInput(Input<SearchableCustomFormDefinitionsSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCustomFormDefinitionsSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomFormDefinitionsSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomFormDefinitionsSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCustomFormDefinitionsSortInput.this.field.value != 0 ? ((SearchableCustomFormDefinitionsSortableFields) SearchableCustomFormDefinitionsSortInput.this.field.value).name() : null);
                }
                if (SearchableCustomFormDefinitionsSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCustomFormDefinitionsSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCustomFormDefinitionsSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
