package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableWabaConversationSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableWabaConversationSortableFields> field;

    public static final class Builder {
        private Input<SearchableWabaConversationSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableWabaConversationSortInput build() {
            return new SearchableWabaConversationSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableWabaConversationSortableFields searchableWabaConversationSortableFields) {
            this.field = Input.fromNullable(searchableWabaConversationSortableFields);
            return this;
        }
    }

    public SearchableWabaConversationSortInput(Input<SearchableWabaConversationSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableWabaConversationSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableWabaConversationSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableWabaConversationSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableWabaConversationSortInput.this.field.value != 0 ? ((SearchableWabaConversationSortableFields) SearchableWabaConversationSortInput.this.field.value).name() : null);
                }
                if (SearchableWabaConversationSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableWabaConversationSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableWabaConversationSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
