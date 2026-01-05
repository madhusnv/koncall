package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableActivitySortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableActivitySortableFields> field;

    public static final class Builder {
        private Input<SearchableActivitySortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableActivitySortInput build() {
            return new SearchableActivitySortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableActivitySortableFields searchableActivitySortableFields) {
            this.field = Input.fromNullable(searchableActivitySortableFields);
            return this;
        }
    }

    public SearchableActivitySortInput(Input<SearchableActivitySortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableActivitySortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableActivitySortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableActivitySortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableActivitySortInput.this.field.value != 0 ? ((SearchableActivitySortableFields) SearchableActivitySortInput.this.field.value).name() : null);
                }
                if (SearchableActivitySortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableActivitySortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableActivitySortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
