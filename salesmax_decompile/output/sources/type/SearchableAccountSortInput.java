package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableAccountSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableAccountSortableFields> field;

    public static final class Builder {
        private Input<SearchableAccountSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableAccountSortInput build() {
            return new SearchableAccountSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableAccountSortableFields searchableAccountSortableFields) {
            this.field = Input.fromNullable(searchableAccountSortableFields);
            return this;
        }
    }

    public SearchableAccountSortInput(Input<SearchableAccountSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableAccountSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableAccountSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableAccountSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableAccountSortInput.this.field.value != 0 ? ((SearchableAccountSortableFields) SearchableAccountSortInput.this.field.value).name() : null);
                }
                if (SearchableAccountSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableAccountSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableAccountSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
