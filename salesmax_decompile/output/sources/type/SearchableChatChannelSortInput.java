package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableChatChannelSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableChatChannelSortableFields> field;

    public static final class Builder {
        private Input<SearchableChatChannelSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableChatChannelSortInput build() {
            return new SearchableChatChannelSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableChatChannelSortableFields searchableChatChannelSortableFields) {
            this.field = Input.fromNullable(searchableChatChannelSortableFields);
            return this;
        }
    }

    public SearchableChatChannelSortInput(Input<SearchableChatChannelSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableChatChannelSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatChannelSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatChannelSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableChatChannelSortInput.this.field.value != 0 ? ((SearchableChatChannelSortableFields) SearchableChatChannelSortInput.this.field.value).name() : null);
                }
                if (SearchableChatChannelSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableChatChannelSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableChatChannelSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
