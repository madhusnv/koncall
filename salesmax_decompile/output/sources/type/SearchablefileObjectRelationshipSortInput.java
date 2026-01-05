package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchablefileObjectRelationshipSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchablefileObjectRelationshipSortableFields> field;

    public static final class Builder {
        private Input<SearchablefileObjectRelationshipSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchablefileObjectRelationshipSortInput build() {
            return new SearchablefileObjectRelationshipSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchablefileObjectRelationshipSortableFields searchablefileObjectRelationshipSortableFields) {
            this.field = Input.fromNullable(searchablefileObjectRelationshipSortableFields);
            return this;
        }
    }

    public SearchablefileObjectRelationshipSortInput(Input<SearchablefileObjectRelationshipSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchablefileObjectRelationshipSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchablefileObjectRelationshipSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchablefileObjectRelationshipSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchablefileObjectRelationshipSortInput.this.field.value != 0 ? ((SearchablefileObjectRelationshipSortableFields) SearchablefileObjectRelationshipSortInput.this.field.value).name() : null);
                }
                if (SearchablefileObjectRelationshipSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchablefileObjectRelationshipSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchablefileObjectRelationshipSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
