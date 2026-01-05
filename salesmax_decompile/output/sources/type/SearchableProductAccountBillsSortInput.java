package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableProductAccountBillsSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableProductAccountBillsSortableFields> field;

    public static final class Builder {
        private Input<SearchableProductAccountBillsSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableProductAccountBillsSortInput build() {
            return new SearchableProductAccountBillsSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableProductAccountBillsSortableFields searchableProductAccountBillsSortableFields) {
            this.field = Input.fromNullable(searchableProductAccountBillsSortableFields);
            return this;
        }
    }

    public SearchableProductAccountBillsSortInput(Input<SearchableProductAccountBillsSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableProductAccountBillsSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductAccountBillsSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductAccountBillsSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableProductAccountBillsSortInput.this.field.value != 0 ? ((SearchableProductAccountBillsSortableFields) SearchableProductAccountBillsSortInput.this.field.value).name() : null);
                }
                if (SearchableProductAccountBillsSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableProductAccountBillsSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableProductAccountBillsSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
