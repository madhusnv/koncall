package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableMissedOpportunitiesSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableMissedOpportunitiesSortableFields> field;

    public static final class Builder {
        private Input<SearchableMissedOpportunitiesSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableMissedOpportunitiesSortInput build() {
            return new SearchableMissedOpportunitiesSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableMissedOpportunitiesSortableFields searchableMissedOpportunitiesSortableFields) {
            this.field = Input.fromNullable(searchableMissedOpportunitiesSortableFields);
            return this;
        }
    }

    public SearchableMissedOpportunitiesSortInput(Input<SearchableMissedOpportunitiesSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableMissedOpportunitiesSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableMissedOpportunitiesSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableMissedOpportunitiesSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableMissedOpportunitiesSortInput.this.field.value != 0 ? ((SearchableMissedOpportunitiesSortableFields) SearchableMissedOpportunitiesSortInput.this.field.value).name() : null);
                }
                if (SearchableMissedOpportunitiesSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableMissedOpportunitiesSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableMissedOpportunitiesSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
