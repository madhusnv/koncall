package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSavedChartViewsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> aggregateOnField;
    private final Input<ModelStringInput> aggregationType;
    private final Input<List<ModelSavedChartViewsFilterInput>> and;
    private final Input<ModelStringInput> appliedFilter;
    private final Input<ModelStringInput> chartTitle;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dateBuckets;
    private final Input<ModelStringInput> defaultPivotOnAttribute;
    private final Input<ModelStringInput> displayInformation;
    private final Input<ModelStringInput> filterModel;
    private final Input<ModelStringInput> forAuthorizations;
    private final Input<ModelStringInput> forTeamIds;
    private final Input<ModelStringInput> forUserIds;
    private final Input<ModelStringInput> gridType;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> includeAll;
    private final Input<ModelBooleanInput> isSystemCreated;
    private final Input<ModelSavedChartViewsFilterInput> not;
    private final Input<ModelStringInput> objectTypeName;
    private final Input<List<ModelSavedChartViewsFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelStringInput> reportCategory;
    private final Input<ModelIDInput> scopeId;
    private final Input<ModelScopeLevelInput> scopeLevel;
    private final Input<ModelStringInput> targetComponent;
    private final Input<ModelStringInput> timeFilterAttributeName;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> targetComponent = Input.absent();
        private Input<ModelStringInput> reportCategory = Input.absent();
        private Input<ModelStringInput> chartTitle = Input.absent();
        private Input<ModelBooleanInput> isSystemCreated = Input.absent();
        private Input<ModelBooleanInput> includeAll = Input.absent();
        private Input<ModelStringInput> gridType = Input.absent();
        private Input<ModelStringInput> aggregateOnField = Input.absent();
        private Input<ModelStringInput> aggregationType = Input.absent();
        private Input<ModelStringInput> defaultPivotOnAttribute = Input.absent();
        private Input<ModelStringInput> timeFilterAttributeName = Input.absent();
        private Input<ModelStringInput> objectTypeName = Input.absent();
        private Input<ModelStringInput> appliedFilter = Input.absent();
        private Input<ModelStringInput> filterModel = Input.absent();
        private Input<ModelStringInput> dateBuckets = Input.absent();
        private Input<ModelScopeLevelInput> scopeLevel = Input.absent();
        private Input<ModelIDInput> scopeId = Input.absent();
        private Input<ModelStringInput> forUserIds = Input.absent();
        private Input<ModelStringInput> forTeamIds = Input.absent();
        private Input<ModelStringInput> forAuthorizations = Input.absent();
        private Input<ModelStringInput> displayInformation = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelSavedChartViewsFilterInput>> and = Input.absent();
        private Input<List<ModelSavedChartViewsFilterInput>> or = Input.absent();
        private Input<ModelSavedChartViewsFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder aggregateOnField(ModelStringInput modelStringInput) {
            this.aggregateOnField = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder aggregationType(ModelStringInput modelStringInput) {
            this.aggregationType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelSavedChartViewsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder appliedFilter(ModelStringInput modelStringInput) {
            this.appliedFilter = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelSavedChartViewsFilterInput build() {
            return new ModelSavedChartViewsFilterInput(this.id, this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder chartTitle(ModelStringInput modelStringInput) {
            this.chartTitle = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dateBuckets(ModelStringInput modelStringInput) {
            this.dateBuckets = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder defaultPivotOnAttribute(ModelStringInput modelStringInput) {
            this.defaultPivotOnAttribute = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder displayInformation(ModelStringInput modelStringInput) {
            this.displayInformation = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder filterModel(ModelStringInput modelStringInput) {
            this.filterModel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder forAuthorizations(ModelStringInput modelStringInput) {
            this.forAuthorizations = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder forTeamIds(ModelStringInput modelStringInput) {
            this.forTeamIds = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder forUserIds(ModelStringInput modelStringInput) {
            this.forUserIds = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder gridType(ModelStringInput modelStringInput) {
            this.gridType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder includeAll(ModelBooleanInput modelBooleanInput) {
            this.includeAll = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isSystemCreated(ModelBooleanInput modelBooleanInput) {
            this.isSystemCreated = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelSavedChartViewsFilterInput modelSavedChartViewsFilterInput) {
            this.not = Input.fromNullable(modelSavedChartViewsFilterInput);
            return this;
        }

        public Builder objectTypeName(ModelStringInput modelStringInput) {
            this.objectTypeName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelSavedChartViewsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder reportCategory(ModelStringInput modelStringInput) {
            this.reportCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder scopeId(ModelIDInput modelIDInput) {
            this.scopeId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder scopeLevel(ModelScopeLevelInput modelScopeLevelInput) {
            this.scopeLevel = Input.fromNullable(modelScopeLevelInput);
            return this;
        }

        public Builder targetComponent(ModelStringInput modelStringInput) {
            this.targetComponent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder timeFilterAttributeName(ModelStringInput modelStringInput) {
            this.timeFilterAttributeName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelSavedChartViewsFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelBooleanInput> input7, Input<ModelBooleanInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelScopeLevelInput> input18, Input<ModelIDInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<List<ModelSavedChartViewsFilterInput>> input26, Input<List<ModelSavedChartViewsFilterInput>> input27, Input<ModelSavedChartViewsFilterInput> input28) {
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
        this.scopeLevel = input18;
        this.scopeId = input19;
        this.forUserIds = input20;
        this.forTeamIds = input21;
        this.forAuthorizations = input22;
        this.displayInformation = input23;
        this.createdAt = input24;
        this.updatedAt = input25;
        this.and = input26;
        this.or = input27;
        this.not = input28;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput aggregateOnField() {
        return this.aggregateOnField.value;
    }

    public ModelStringInput aggregationType() {
        return this.aggregationType.value;
    }

    public List<ModelSavedChartViewsFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput appliedFilter() {
        return this.appliedFilter.value;
    }

    public ModelStringInput chartTitle() {
        return this.chartTitle.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput dateBuckets() {
        return this.dateBuckets.value;
    }

    public ModelStringInput defaultPivotOnAttribute() {
        return this.defaultPivotOnAttribute.value;
    }

    public ModelStringInput displayInformation() {
        return this.displayInformation.value;
    }

    public ModelStringInput filterModel() {
        return this.filterModel.value;
    }

    public ModelStringInput forAuthorizations() {
        return this.forAuthorizations.value;
    }

    public ModelStringInput forTeamIds() {
        return this.forTeamIds.value;
    }

    public ModelStringInput forUserIds() {
        return this.forUserIds.value;
    }

    public ModelStringInput gridType() {
        return this.gridType.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput includeAll() {
        return this.includeAll.value;
    }

    public ModelBooleanInput isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSavedChartViewsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSavedChartViewsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelSavedChartViewsFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelSavedChartViewsFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSavedChartViewsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSavedChartViewsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelSavedChartViewsFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelSavedChartViewsFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.targetComponent.defined) {
                    inputFieldWriter.writeObject("targetComponent", ModelSavedChartViewsFilterInput.this.targetComponent.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.targetComponent.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.reportCategory.defined) {
                    inputFieldWriter.writeObject("reportCategory", ModelSavedChartViewsFilterInput.this.reportCategory.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.reportCategory.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.chartTitle.defined) {
                    inputFieldWriter.writeObject("chartTitle", ModelSavedChartViewsFilterInput.this.chartTitle.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.chartTitle.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeObject("isSystemCreated", ModelSavedChartViewsFilterInput.this.isSystemCreated.value != 0 ? ((ModelBooleanInput) ModelSavedChartViewsFilterInput.this.isSystemCreated.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.includeAll.defined) {
                    inputFieldWriter.writeObject("includeAll", ModelSavedChartViewsFilterInput.this.includeAll.value != 0 ? ((ModelBooleanInput) ModelSavedChartViewsFilterInput.this.includeAll.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.gridType.defined) {
                    inputFieldWriter.writeObject("gridType", ModelSavedChartViewsFilterInput.this.gridType.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.gridType.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.aggregateOnField.defined) {
                    inputFieldWriter.writeObject("aggregateOnField", ModelSavedChartViewsFilterInput.this.aggregateOnField.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.aggregateOnField.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.aggregationType.defined) {
                    inputFieldWriter.writeObject("aggregationType", ModelSavedChartViewsFilterInput.this.aggregationType.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.aggregationType.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.defaultPivotOnAttribute.defined) {
                    inputFieldWriter.writeObject("defaultPivotOnAttribute", ModelSavedChartViewsFilterInput.this.defaultPivotOnAttribute.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.defaultPivotOnAttribute.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.timeFilterAttributeName.defined) {
                    inputFieldWriter.writeObject("timeFilterAttributeName", ModelSavedChartViewsFilterInput.this.timeFilterAttributeName.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.timeFilterAttributeName.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.objectTypeName.defined) {
                    inputFieldWriter.writeObject("objectTypeName", ModelSavedChartViewsFilterInput.this.objectTypeName.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.objectTypeName.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.appliedFilter.defined) {
                    inputFieldWriter.writeObject("appliedFilter", ModelSavedChartViewsFilterInput.this.appliedFilter.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.appliedFilter.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.filterModel.defined) {
                    inputFieldWriter.writeObject("filterModel", ModelSavedChartViewsFilterInput.this.filterModel.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.filterModel.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.dateBuckets.defined) {
                    inputFieldWriter.writeObject("dateBuckets", ModelSavedChartViewsFilterInput.this.dateBuckets.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.dateBuckets.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeObject("scopeLevel", ModelSavedChartViewsFilterInput.this.scopeLevel.value != 0 ? ((ModelScopeLevelInput) ModelSavedChartViewsFilterInput.this.scopeLevel.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", ModelSavedChartViewsFilterInput.this.scopeId.value != 0 ? ((ModelIDInput) ModelSavedChartViewsFilterInput.this.scopeId.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.forUserIds.defined) {
                    inputFieldWriter.writeObject("forUserIds", ModelSavedChartViewsFilterInput.this.forUserIds.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.forUserIds.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeObject("forTeamIds", ModelSavedChartViewsFilterInput.this.forTeamIds.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.forTeamIds.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeObject("forAuthorizations", ModelSavedChartViewsFilterInput.this.forAuthorizations.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.forAuthorizations.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.displayInformation.defined) {
                    inputFieldWriter.writeObject("displayInformation", ModelSavedChartViewsFilterInput.this.displayInformation.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.displayInformation.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSavedChartViewsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelSavedChartViewsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelSavedChartViewsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelSavedChartViewsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSavedChartViewsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedChartViewsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedChartViewsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedChartViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedChartViewsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSavedChartViewsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedChartViewsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedChartViewsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedChartViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedChartViewsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSavedChartViewsFilterInput.this.not.value != 0 ? ((ModelSavedChartViewsFilterInput) ModelSavedChartViewsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSavedChartViewsFilterInput not() {
        return this.not.value;
    }

    public ModelStringInput objectTypeName() {
        return this.objectTypeName.value;
    }

    public List<ModelSavedChartViewsFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelStringInput reportCategory() {
        return this.reportCategory.value;
    }

    public ModelIDInput scopeId() {
        return this.scopeId.value;
    }

    public ModelScopeLevelInput scopeLevel() {
        return this.scopeLevel.value;
    }

    public ModelStringInput targetComponent() {
        return this.targetComponent.value;
    }

    public ModelStringInput timeFilterAttributeName() {
        return this.timeFilterAttributeName.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
