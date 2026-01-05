package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableDealSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableDealSortableFields> field;

    public static final class Builder {
        private Input<SearchableDealSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableDealSortInput build() {
            return new SearchableDealSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableDealSortableFields searchableDealSortableFields) {
            this.field = Input.fromNullable(searchableDealSortableFields);
            return this;
        }
    }

    public SearchableDealSortInput(Input<SearchableDealSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableDealSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableDealSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableDealSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableDealSortInput.this.field.value != 0 ? ((SearchableDealSortableFields) SearchableDealSortInput.this.field.value).name() : null);
                }
                if (SearchableDealSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableDealSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableDealSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
