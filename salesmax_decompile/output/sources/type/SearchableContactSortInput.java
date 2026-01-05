package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableContactSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableContactSortableFields> field;

    public static final class Builder {
        private Input<SearchableContactSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableContactSortInput build() {
            return new SearchableContactSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableContactSortableFields searchableContactSortableFields) {
            this.field = Input.fromNullable(searchableContactSortableFields);
            return this;
        }
    }

    public SearchableContactSortInput(Input<SearchableContactSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableContactSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableContactSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableContactSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableContactSortInput.this.field.value != 0 ? ((SearchableContactSortableFields) SearchableContactSortInput.this.field.value).name() : null);
                }
                if (SearchableContactSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableContactSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableContactSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
