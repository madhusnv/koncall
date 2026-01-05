package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableExternalEventRecordSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableExternalEventRecordSortableFields> field;

    public static final class Builder {
        private Input<SearchableExternalEventRecordSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableExternalEventRecordSortInput build() {
            return new SearchableExternalEventRecordSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableExternalEventRecordSortableFields searchableExternalEventRecordSortableFields) {
            this.field = Input.fromNullable(searchableExternalEventRecordSortableFields);
            return this;
        }
    }

    public SearchableExternalEventRecordSortInput(Input<SearchableExternalEventRecordSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableExternalEventRecordSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableExternalEventRecordSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableExternalEventRecordSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableExternalEventRecordSortInput.this.field.value != 0 ? ((SearchableExternalEventRecordSortableFields) SearchableExternalEventRecordSortInput.this.field.value).name() : null);
                }
                if (SearchableExternalEventRecordSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableExternalEventRecordSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableExternalEventRecordSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
