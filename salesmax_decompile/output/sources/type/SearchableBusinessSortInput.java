package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableBusinessSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableBusinessSortableFields> field;

    public static final class Builder {
        private Input<SearchableBusinessSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableBusinessSortInput build() {
            return new SearchableBusinessSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableBusinessSortableFields searchableBusinessSortableFields) {
            this.field = Input.fromNullable(searchableBusinessSortableFields);
            return this;
        }
    }

    public SearchableBusinessSortInput(Input<SearchableBusinessSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableBusinessSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableBusinessSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableBusinessSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableBusinessSortInput.this.field.value != 0 ? ((SearchableBusinessSortableFields) SearchableBusinessSortInput.this.field.value).name() : null);
                }
                if (SearchableBusinessSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableBusinessSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableBusinessSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
