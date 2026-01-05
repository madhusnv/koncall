package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableSavedTableViewsSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableSavedTableViewsSortableFields> field;

    public static final class Builder {
        private Input<SearchableSavedTableViewsSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableSavedTableViewsSortInput build() {
            return new SearchableSavedTableViewsSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableSavedTableViewsSortableFields searchableSavedTableViewsSortableFields) {
            this.field = Input.fromNullable(searchableSavedTableViewsSortableFields);
            return this;
        }
    }

    public SearchableSavedTableViewsSortInput(Input<SearchableSavedTableViewsSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableSavedTableViewsSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableSavedTableViewsSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableSavedTableViewsSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableSavedTableViewsSortInput.this.field.value != 0 ? ((SearchableSavedTableViewsSortableFields) SearchableSavedTableViewsSortInput.this.field.value).name() : null);
                }
                if (SearchableSavedTableViewsSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableSavedTableViewsSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableSavedTableViewsSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
