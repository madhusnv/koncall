package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCampaignRunDataSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCampaignRunDataSortableFields> field;

    public static final class Builder {
        private Input<SearchableCampaignRunDataSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCampaignRunDataSortInput build() {
            return new SearchableCampaignRunDataSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCampaignRunDataSortableFields searchableCampaignRunDataSortableFields) {
            this.field = Input.fromNullable(searchableCampaignRunDataSortableFields);
            return this;
        }
    }

    public SearchableCampaignRunDataSortInput(Input<SearchableCampaignRunDataSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCampaignRunDataSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCampaignRunDataSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCampaignRunDataSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCampaignRunDataSortInput.this.field.value != 0 ? ((SearchableCampaignRunDataSortableFields) SearchableCampaignRunDataSortInput.this.field.value).name() : null);
                }
                if (SearchableCampaignRunDataSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCampaignRunDataSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCampaignRunDataSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
