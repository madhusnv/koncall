package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableContactNumberSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableContactNumberSortableFields> field;

    public static final class Builder {
        private Input<SearchableContactNumberSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableContactNumberSortInput build() {
            return new SearchableContactNumberSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableContactNumberSortableFields searchableContactNumberSortableFields) {
            this.field = Input.fromNullable(searchableContactNumberSortableFields);
            return this;
        }
    }

    public SearchableContactNumberSortInput(Input<SearchableContactNumberSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableContactNumberSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableContactNumberSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableContactNumberSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableContactNumberSortInput.this.field.value != 0 ? ((SearchableContactNumberSortableFields) SearchableContactNumberSortInput.this.field.value).name() : null);
                }
                if (SearchableContactNumberSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableContactNumberSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableContactNumberSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
