package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableEntityActionDefinitionSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableEntityActionDefinitionSortableFields> field;

    public static final class Builder {
        private Input<SearchableEntityActionDefinitionSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableEntityActionDefinitionSortInput build() {
            return new SearchableEntityActionDefinitionSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableEntityActionDefinitionSortableFields searchableEntityActionDefinitionSortableFields) {
            this.field = Input.fromNullable(searchableEntityActionDefinitionSortableFields);
            return this;
        }
    }

    public SearchableEntityActionDefinitionSortInput(Input<SearchableEntityActionDefinitionSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableEntityActionDefinitionSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableEntityActionDefinitionSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableEntityActionDefinitionSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableEntityActionDefinitionSortInput.this.field.value != 0 ? ((SearchableEntityActionDefinitionSortableFields) SearchableEntityActionDefinitionSortInput.this.field.value).name() : null);
                }
                if (SearchableEntityActionDefinitionSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableEntityActionDefinitionSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableEntityActionDefinitionSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
