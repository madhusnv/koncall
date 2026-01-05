package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableChatAssociationSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableChatAssociationSortableFields> field;

    public static final class Builder {
        private Input<SearchableChatAssociationSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableChatAssociationSortInput build() {
            return new SearchableChatAssociationSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableChatAssociationSortableFields searchableChatAssociationSortableFields) {
            this.field = Input.fromNullable(searchableChatAssociationSortableFields);
            return this;
        }
    }

    public SearchableChatAssociationSortInput(Input<SearchableChatAssociationSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableChatAssociationSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatAssociationSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatAssociationSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableChatAssociationSortInput.this.field.value != 0 ? ((SearchableChatAssociationSortableFields) SearchableChatAssociationSortInput.this.field.value).name() : null);
                }
                if (SearchableChatAssociationSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableChatAssociationSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableChatAssociationSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
