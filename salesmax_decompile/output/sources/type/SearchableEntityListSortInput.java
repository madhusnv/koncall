package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableEntityListSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableEntityListSortableFields> field;

    public static final class Builder {
        private Input<SearchableEntityListSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableEntityListSortInput build() {
            return new SearchableEntityListSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableEntityListSortableFields searchableEntityListSortableFields) {
            this.field = Input.fromNullable(searchableEntityListSortableFields);
            return this;
        }
    }

    public SearchableEntityListSortInput(Input<SearchableEntityListSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableEntityListSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableEntityListSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableEntityListSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableEntityListSortInput.this.field.value != 0 ? ((SearchableEntityListSortableFields) SearchableEntityListSortInput.this.field.value).name() : null);
                }
                if (SearchableEntityListSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableEntityListSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableEntityListSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
