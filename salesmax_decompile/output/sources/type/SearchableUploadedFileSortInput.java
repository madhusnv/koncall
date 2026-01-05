package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableUploadedFileSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableUploadedFileSortableFields> field;

    public static final class Builder {
        private Input<SearchableUploadedFileSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableUploadedFileSortInput build() {
            return new SearchableUploadedFileSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableUploadedFileSortableFields searchableUploadedFileSortableFields) {
            this.field = Input.fromNullable(searchableUploadedFileSortableFields);
            return this;
        }
    }

    public SearchableUploadedFileSortInput(Input<SearchableUploadedFileSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableUploadedFileSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableUploadedFileSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableUploadedFileSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableUploadedFileSortInput.this.field.value != 0 ? ((SearchableUploadedFileSortableFields) SearchableUploadedFileSortInput.this.field.value).name() : null);
                }
                if (SearchableUploadedFileSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableUploadedFileSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableUploadedFileSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
