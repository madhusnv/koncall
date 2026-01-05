package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableProductServiceAssociationSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableProductServiceAssociationSortableFields> field;

    public static final class Builder {
        private Input<SearchableProductServiceAssociationSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableProductServiceAssociationSortInput build() {
            return new SearchableProductServiceAssociationSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableProductServiceAssociationSortableFields searchableProductServiceAssociationSortableFields) {
            this.field = Input.fromNullable(searchableProductServiceAssociationSortableFields);
            return this;
        }
    }

    public SearchableProductServiceAssociationSortInput(Input<SearchableProductServiceAssociationSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableProductServiceAssociationSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductServiceAssociationSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductServiceAssociationSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableProductServiceAssociationSortInput.this.field.value != 0 ? ((SearchableProductServiceAssociationSortableFields) SearchableProductServiceAssociationSortInput.this.field.value).name() : null);
                }
                if (SearchableProductServiceAssociationSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableProductServiceAssociationSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableProductServiceAssociationSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
