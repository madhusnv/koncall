package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableChatMentionsSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableChatMentionsSortableFields> field;

    public static final class Builder {
        private Input<SearchableChatMentionsSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableChatMentionsSortInput build() {
            return new SearchableChatMentionsSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableChatMentionsSortableFields searchableChatMentionsSortableFields) {
            this.field = Input.fromNullable(searchableChatMentionsSortableFields);
            return this;
        }
    }

    public SearchableChatMentionsSortInput(Input<SearchableChatMentionsSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableChatMentionsSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatMentionsSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatMentionsSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableChatMentionsSortInput.this.field.value != 0 ? ((SearchableChatMentionsSortableFields) SearchableChatMentionsSortInput.this.field.value).name() : null);
                }
                if (SearchableChatMentionsSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableChatMentionsSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableChatMentionsSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
