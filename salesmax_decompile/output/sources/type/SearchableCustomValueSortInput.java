package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCustomValueSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCustomValueSortableFields> field;

    public static final class Builder {
        private Input<SearchableCustomValueSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCustomValueSortInput build() {
            return new SearchableCustomValueSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCustomValueSortableFields searchableCustomValueSortableFields) {
            this.field = Input.fromNullable(searchableCustomValueSortableFields);
            return this;
        }
    }

    public SearchableCustomValueSortInput(Input<SearchableCustomValueSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCustomValueSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCustomValueSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCustomValueSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCustomValueSortInput.this.field.value != 0 ? ((SearchableCustomValueSortableFields) SearchableCustomValueSortInput.this.field.value).name() : null);
                }
                if (SearchableCustomValueSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCustomValueSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCustomValueSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
