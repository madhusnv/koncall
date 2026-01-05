package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableSavedChartViewsFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableStringFilterInput> aggregateOnField;
    private final Input<SearchableStringFilterInput> aggregationType;
    private final Input<List<SearchableSavedChartViewsFilterInput>> and;
    private final Input<SearchableStringFilterInput> appliedFilter;
    private final Input<SearchableStringFilterInput> chartTitle;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> dateBuckets;
    private final Input<SearchableStringFilterInput> defaultPivotOnAttribute;
    private final Input<SearchableStringFilterInput> displayInformation;
    private final Input<SearchableStringFilterInput> filterModel;
    private final Input<SearchableStringFilterInput> forAuthorizations;
    private final Input<SearchableStringFilterInput> forTeamIds;
    private final Input<SearchableStringFilterInput> forUserIds;
    private final Input<SearchableStringFilterInput> gridType;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> includeAll;
    private final Input<SearchableBooleanFilterInput> isSystemCreated;
    private final Input<SearchableSavedChartViewsFilterInput> not;
    private final Input<SearchableStringFilterInput> objectTypeName;
    private final Input<List<SearchableSavedChartViewsFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableStringFilterInput> reportCategory;
    private final Input<SearchableIDFilterInput> scopeId;
    private final Input<SearchableStringFilterInput> targetComponent;
    private final Input<SearchableStringFilterInput> timeFilterAttributeName;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableStringFilterInput> targetComponent = Input.absent();
        private Input<SearchableStringFilterInput> reportCategory = Input.absent();
        private Input<SearchableStringFilterInput> chartTitle = Input.absent();
        private Input<SearchableBooleanFilterInput> isSystemCreated = Input.absent();
        private Input<SearchableBooleanFilterInput> includeAll = Input.absent();
        private Input<SearchableStringFilterInput> gridType = Input.absent();
        private Input<SearchableStringFilterInput> aggregateOnField = Input.absent();
        private Input<SearchableStringFilterInput> aggregationType = Input.absent();
        private Input<SearchableStringFilterInput> defaultPivotOnAttribute = Input.absent();
        private Input<SearchableStringFilterInput> timeFilterAttributeName = Input.absent();
        private Input<SearchableStringFilterInput> objectTypeName = Input.absent();
        private Input<SearchableStringFilterInput> appliedFilter = Input.absent();
        private Input<SearchableStringFilterInput> filterModel = Input.absent();
        private Input<SearchableStringFilterInput> dateBuckets = Input.absent();
        private Input<SearchableIDFilterInput> scopeId = Input.absent();
        private Input<SearchableStringFilterInput> forUserIds = Input.absent();
        private Input<SearchableStringFilterInput> forTeamIds = Input.absent();
        private Input<SearchableStringFilterInput> forAuthorizations = Input.absent();
        private Input<SearchableStringFilterInput> displayInformation = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableSavedChartViewsFilterInput>> and = Input.absent();
        private Input<List<SearchableSavedChartViewsFilterInput>> or = Input.absent();
        private Input<SearchableSavedChartViewsFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder aggregateOnField(SearchableStringFilterInput searchableStringFilterInput) {
            this.aggregateOnField = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder aggregationType(SearchableStringFilterInput searchableStringFilterInput) {
            this.aggregationType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableSavedChartViewsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder appliedFilter(SearchableStringFilterInput searchableStringFilterInput) {
            this.appliedFilter = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public SearchableSavedChartViewsFilterInput build() {
            return new SearchableSavedChartViewsFilterInput(this.id, this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder chartTitle(SearchableStringFilterInput searchableStringFilterInput) {
            this.chartTitle = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dateBuckets(SearchableStringFilterInput searchableStringFilterInput) {
            this.dateBuckets = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder defaultPivotOnAttribute(SearchableStringFilterInput searchableStringFilterInput) {
            this.defaultPivotOnAttribute = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder displayInformation(SearchableStringFilterInput searchableStringFilterInput) {
            this.displayInformation = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder filterModel(SearchableStringFilterInput searchableStringFilterInput) {
            this.filterModel = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder forAuthorizations(SearchableStringFilterInput searchableStringFilterInput) {
            this.forAuthorizations = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder forTeamIds(SearchableStringFilterInput searchableStringFilterInput) {
            this.forTeamIds = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder forUserIds(SearchableStringFilterInput searchableStringFilterInput) {
            this.forUserIds = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder gridType(SearchableStringFilterInput searchableStringFilterInput) {
            this.gridType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder includeAll(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.includeAll = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isSystemCreated(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isSystemCreated = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder not(SearchableSavedChartViewsFilterInput searchableSavedChartViewsFilterInput) {
            this.not = Input.fromNullable(searchableSavedChartViewsFilterInput);
            return this;
        }

        public Builder objectTypeName(SearchableStringFilterInput searchableStringFilterInput) {
            this.objectTypeName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder or(List<SearchableSavedChartViewsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder reportCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.reportCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder scopeId(SearchableIDFilterInput searchableIDFilterInput) {
            this.scopeId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder targetComponent(SearchableStringFilterInput searchableStringFilterInput) {
            this.targetComponent = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder timeFilterAttributeName(SearchableStringFilterInput searchableStringFilterInput) {
            this.timeFilterAttributeName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableSavedChartViewsFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableBooleanFilterInput> input7, Input<SearchableBooleanFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableIDFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<SearchableStringFilterInput> input24, Input<List<SearchableSavedChartViewsFilterInput>> input25, Input<List<SearchableSavedChartViewsFilterInput>> input26, Input<SearchableSavedChartViewsFilterInput> input27) {
        this.id = input;
        this.accountId = input2;
        this.ownerId = input3;
        this.targetComponent = input4;
        this.reportCategory = input5;
        this.chartTitle = input6;
        this.isSystemCreated = input7;
        this.includeAll = input8;
        this.gridType = input9;
        this.aggregateOnField = input10;
        this.aggregationType = input11;
        this.defaultPivotOnAttribute = input12;
        this.timeFilterAttributeName = input13;
        this.objectTypeName = input14;
        this.appliedFilter = input15;
        this.filterModel = input16;
        this.dateBuckets = input17;
        this.scopeId = input18;
        this.forUserIds = input19;
        this.forTeamIds = input20;
        this.forAuthorizations = input21;
        this.displayInformation = input22;
        this.createdAt = input23;
        this.updatedAt = input24;
        this.and = input25;
        this.or = input26;
        this.not = input27;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableStringFilterInput aggregateOnField() {
        return this.aggregateOnField.value;
    }

    public SearchableStringFilterInput aggregationType() {
        return this.aggregationType.value;
    }

    public List<SearchableSavedChartViewsFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput appliedFilter() {
        return this.appliedFilter.value;
    }

    public SearchableStringFilterInput chartTitle() {
        return this.chartTitle.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput dateBuckets() {
        return this.dateBuckets.value;
    }

    public SearchableStringFilterInput defaultPivotOnAttribute() {
        return this.defaultPivotOnAttribute.value;
    }

    public SearchableStringFilterInput displayInformation() {
        return this.displayInformation.value;
    }

    public SearchableStringFilterInput filterModel() {
        return this.filterModel.value;
    }

    public SearchableStringFilterInput forAuthorizations() {
        return this.forAuthorizations.value;
    }

    public SearchableStringFilterInput forTeamIds() {
        return this.forTeamIds.value;
    }

    public SearchableStringFilterInput forUserIds() {
        return this.forUserIds.value;
    }

    public SearchableStringFilterInput gridType() {
        return this.gridType.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput includeAll() {
        return this.includeAll.value;
    }

    public SearchableBooleanFilterInput isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableSavedChartViewsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableSavedChartViewsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableSavedChartViewsFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableSavedChartViewsFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableSavedChartViewsFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableSavedChartViewsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableSavedChartViewsFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableSavedChartViewsFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.targetComponent.defined) {
                    inputFieldWriter.writeObject("targetComponent", SearchableSavedChartViewsFilterInput.this.targetComponent.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.targetComponent.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.reportCategory.defined) {
                    inputFieldWriter.writeObject("reportCategory", SearchableSavedChartViewsFilterInput.this.reportCategory.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.reportCategory.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.chartTitle.defined) {
                    inputFieldWriter.writeObject("chartTitle", SearchableSavedChartViewsFilterInput.this.chartTitle.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.chartTitle.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeObject("isSystemCreated", SearchableSavedChartViewsFilterInput.this.isSystemCreated.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedChartViewsFilterInput.this.isSystemCreated.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.includeAll.defined) {
                    inputFieldWriter.writeObject("includeAll", SearchableSavedChartViewsFilterInput.this.includeAll.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedChartViewsFilterInput.this.includeAll.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.gridType.defined) {
                    inputFieldWriter.writeObject("gridType", SearchableSavedChartViewsFilterInput.this.gridType.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.gridType.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.aggregateOnField.defined) {
                    inputFieldWriter.writeObject("aggregateOnField", SearchableSavedChartViewsFilterInput.this.aggregateOnField.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.aggregateOnField.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.aggregationType.defined) {
                    inputFieldWriter.writeObject("aggregationType", SearchableSavedChartViewsFilterInput.this.aggregationType.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.aggregationType.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.defaultPivotOnAttribute.defined) {
                    inputFieldWriter.writeObject("defaultPivotOnAttribute", SearchableSavedChartViewsFilterInput.this.defaultPivotOnAttribute.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.defaultPivotOnAttribute.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.timeFilterAttributeName.defined) {
                    inputFieldWriter.writeObject("timeFilterAttributeName", SearchableSavedChartViewsFilterInput.this.timeFilterAttributeName.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.timeFilterAttributeName.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.objectTypeName.defined) {
                    inputFieldWriter.writeObject("objectTypeName", SearchableSavedChartViewsFilterInput.this.objectTypeName.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.objectTypeName.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.appliedFilter.defined) {
                    inputFieldWriter.writeObject("appliedFilter", SearchableSavedChartViewsFilterInput.this.appliedFilter.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.appliedFilter.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.filterModel.defined) {
                    inputFieldWriter.writeObject("filterModel", SearchableSavedChartViewsFilterInput.this.filterModel.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.filterModel.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.dateBuckets.defined) {
                    inputFieldWriter.writeObject("dateBuckets", SearchableSavedChartViewsFilterInput.this.dateBuckets.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.dateBuckets.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", SearchableSavedChartViewsFilterInput.this.scopeId.value != 0 ? ((SearchableIDFilterInput) SearchableSavedChartViewsFilterInput.this.scopeId.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.forUserIds.defined) {
                    inputFieldWriter.writeObject("forUserIds", SearchableSavedChartViewsFilterInput.this.forUserIds.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.forUserIds.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeObject("forTeamIds", SearchableSavedChartViewsFilterInput.this.forTeamIds.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.forTeamIds.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeObject("forAuthorizations", SearchableSavedChartViewsFilterInput.this.forAuthorizations.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.forAuthorizations.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.displayInformation.defined) {
                    inputFieldWriter.writeObject("displayInformation", SearchableSavedChartViewsFilterInput.this.displayInformation.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.displayInformation.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableSavedChartViewsFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableSavedChartViewsFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableSavedChartViewsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableSavedChartViewsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableSavedChartViewsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableSavedChartViewsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableSavedChartViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableSavedChartViewsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableSavedChartViewsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableSavedChartViewsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableSavedChartViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableSavedChartViewsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableSavedChartViewsFilterInput.this.not.value != 0 ? ((SearchableSavedChartViewsFilterInput) SearchableSavedChartViewsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableSavedChartViewsFilterInput not() {
        return this.not.value;
    }

    public SearchableStringFilterInput objectTypeName() {
        return this.objectTypeName.value;
    }

    public List<SearchableSavedChartViewsFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableStringFilterInput reportCategory() {
        return this.reportCategory.value;
    }

    public SearchableIDFilterInput scopeId() {
        return this.scopeId.value;
    }

    public SearchableStringFilterInput targetComponent() {
        return this.targetComponent.value;
    }

    public SearchableStringFilterInput timeFilterAttributeName() {
        return this.timeFilterAttributeName.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
