package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCampaignRunSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCampaignRunSortableFields> field;

    public static final class Builder {
        private Input<SearchableCampaignRunSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCampaignRunSortInput build() {
            return new SearchableCampaignRunSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCampaignRunSortableFields searchableCampaignRunSortableFields) {
            this.field = Input.fromNullable(searchableCampaignRunSortableFields);
            return this;
        }
    }

    public SearchableCampaignRunSortInput(Input<SearchableCampaignRunSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCampaignRunSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCampaignRunSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCampaignRunSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCampaignRunSortInput.this.field.value != 0 ? ((SearchableCampaignRunSortableFields) SearchableCampaignRunSortInput.this.field.value).name() : null);
                }
                if (SearchableCampaignRunSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCampaignRunSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCampaignRunSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
