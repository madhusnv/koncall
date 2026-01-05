package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableStagedLeadDataSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableStagedLeadDataSortableFields> field;

    public static final class Builder {
        private Input<SearchableStagedLeadDataSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableStagedLeadDataSortInput build() {
            return new SearchableStagedLeadDataSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableStagedLeadDataSortableFields searchableStagedLeadDataSortableFields) {
            this.field = Input.fromNullable(searchableStagedLeadDataSortableFields);
            return this;
        }
    }

    public SearchableStagedLeadDataSortInput(Input<SearchableStagedLeadDataSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableStagedLeadDataSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableStagedLeadDataSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableStagedLeadDataSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableStagedLeadDataSortInput.this.field.value != 0 ? ((SearchableStagedLeadDataSortableFields) SearchableStagedLeadDataSortInput.this.field.value).name() : null);
                }
                if (SearchableStagedLeadDataSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableStagedLeadDataSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableStagedLeadDataSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
