package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableCampaignDefinitionSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableCampaignDefinitionSortableFields> field;

    public static final class Builder {
        private Input<SearchableCampaignDefinitionSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableCampaignDefinitionSortInput build() {
            return new SearchableCampaignDefinitionSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableCampaignDefinitionSortableFields searchableCampaignDefinitionSortableFields) {
            this.field = Input.fromNullable(searchableCampaignDefinitionSortableFields);
            return this;
        }
    }

    public SearchableCampaignDefinitionSortInput(Input<SearchableCampaignDefinitionSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableCampaignDefinitionSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableCampaignDefinitionSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableCampaignDefinitionSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableCampaignDefinitionSortInput.this.field.value != 0 ? ((SearchableCampaignDefinitionSortableFields) SearchableCampaignDefinitionSortInput.this.field.value).name() : null);
                }
                if (SearchableCampaignDefinitionSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableCampaignDefinitionSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableCampaignDefinitionSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
