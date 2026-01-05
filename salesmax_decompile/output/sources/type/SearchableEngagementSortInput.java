package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableEngagementSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableEngagementSortableFields> field;

    public static final class Builder {
        private Input<SearchableEngagementSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableEngagementSortInput build() {
            return new SearchableEngagementSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableEngagementSortableFields searchableEngagementSortableFields) {
            this.field = Input.fromNullable(searchableEngagementSortableFields);
            return this;
        }
    }

    public SearchableEngagementSortInput(Input<SearchableEngagementSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableEngagementSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableEngagementSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableEngagementSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableEngagementSortInput.this.field.value != 0 ? ((SearchableEngagementSortableFields) SearchableEngagementSortInput.this.field.value).name() : null);
                }
                if (SearchableEngagementSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableEngagementSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableEngagementSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
