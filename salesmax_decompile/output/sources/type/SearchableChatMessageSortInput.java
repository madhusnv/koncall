package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableChatMessageSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableChatMessageSortableFields> field;

    public static final class Builder {
        private Input<SearchableChatMessageSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableChatMessageSortInput build() {
            return new SearchableChatMessageSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableChatMessageSortableFields searchableChatMessageSortableFields) {
            this.field = Input.fromNullable(searchableChatMessageSortableFields);
            return this;
        }
    }

    public SearchableChatMessageSortInput(Input<SearchableChatMessageSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableChatMessageSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatMessageSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatMessageSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableChatMessageSortInput.this.field.value != 0 ? ((SearchableChatMessageSortableFields) SearchableChatMessageSortInput.this.field.value).name() : null);
                }
                if (SearchableChatMessageSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableChatMessageSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableChatMessageSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
