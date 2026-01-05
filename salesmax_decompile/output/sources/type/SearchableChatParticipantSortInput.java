package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableChatParticipantSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableChatParticipantSortableFields> field;

    public static final class Builder {
        private Input<SearchableChatParticipantSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableChatParticipantSortInput build() {
            return new SearchableChatParticipantSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableChatParticipantSortableFields searchableChatParticipantSortableFields) {
            this.field = Input.fromNullable(searchableChatParticipantSortableFields);
            return this;
        }
    }

    public SearchableChatParticipantSortInput(Input<SearchableChatParticipantSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableChatParticipantSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatParticipantSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatParticipantSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableChatParticipantSortInput.this.field.value != 0 ? ((SearchableChatParticipantSortableFields) SearchableChatParticipantSortInput.this.field.value).name() : null);
                }
                if (SearchableChatParticipantSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableChatParticipantSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableChatParticipantSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
