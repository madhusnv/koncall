package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableProductServiceSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableProductServiceSortableFields> field;

    public static final class Builder {
        private Input<SearchableProductServiceSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableProductServiceSortInput build() {
            return new SearchableProductServiceSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableProductServiceSortableFields searchableProductServiceSortableFields) {
            this.field = Input.fromNullable(searchableProductServiceSortableFields);
            return this;
        }
    }

    public SearchableProductServiceSortInput(Input<SearchableProductServiceSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableProductServiceSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductServiceSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductServiceSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableProductServiceSortInput.this.field.value != 0 ? ((SearchableProductServiceSortableFields) SearchableProductServiceSortInput.this.field.value).name() : null);
                }
                if (SearchableProductServiceSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableProductServiceSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableProductServiceSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
