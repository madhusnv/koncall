package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableClientAccountSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableClientAccountSortableFields> field;

    public static final class Builder {
        private Input<SearchableClientAccountSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableClientAccountSortInput build() {
            return new SearchableClientAccountSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableClientAccountSortableFields searchableClientAccountSortableFields) {
            this.field = Input.fromNullable(searchableClientAccountSortableFields);
            return this;
        }
    }

    public SearchableClientAccountSortInput(Input<SearchableClientAccountSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableClientAccountSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableClientAccountSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableClientAccountSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableClientAccountSortInput.this.field.value != 0 ? ((SearchableClientAccountSortableFields) SearchableClientAccountSortInput.this.field.value).name() : null);
                }
                if (SearchableClientAccountSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableClientAccountSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableClientAccountSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
