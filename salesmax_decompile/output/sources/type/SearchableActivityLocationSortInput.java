package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableActivityLocationSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableActivityLocationSortableFields> field;

    public static final class Builder {
        private Input<SearchableActivityLocationSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableActivityLocationSortInput build() {
            return new SearchableActivityLocationSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableActivityLocationSortableFields searchableActivityLocationSortableFields) {
            this.field = Input.fromNullable(searchableActivityLocationSortableFields);
            return this;
        }
    }

    public SearchableActivityLocationSortInput(Input<SearchableActivityLocationSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableActivityLocationSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableActivityLocationSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableActivityLocationSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableActivityLocationSortInput.this.field.value != 0 ? ((SearchableActivityLocationSortableFields) SearchableActivityLocationSortInput.this.field.value).name() : null);
                }
                if (SearchableActivityLocationSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableActivityLocationSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableActivityLocationSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
