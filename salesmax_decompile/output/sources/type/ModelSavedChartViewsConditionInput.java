package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSavedChartViewsConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> aggregateOnField;
    private final Input<ModelStringInput> aggregationType;
    private final Input<List<ModelSavedChartViewsConditionInput>> and;
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
    private final Input<ModelBooleanInput> includeAll;
    private final Input<ModelBooleanInput> isSystemCreated;
    private final Input<ModelSavedChartViewsConditionInput> not;
    private final Input<ModelStringInput> objectTypeName;
    private final Input<List<ModelSavedChartViewsConditionInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelStringInput> reportCategory;
    private final Input<ModelIDInput> scopeId;
    private final Input<ModelScopeLevelInput> scopeLevel;
    private final Input<ModelStringInput> targetComponent;
    private final Input<ModelStringInput> timeFilterAttributeName;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelSavedChartViewsConditionInput>> and = Input.absent();
        private Input<List<ModelSavedChartViewsConditionInput>> or = Input.absent();
        private Input<ModelSavedChartViewsConditionInput> not = Input.absent();

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

        public Builder and(List<ModelSavedChartViewsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public Builder appliedFilter(ModelStringInput modelStringInput) {
            this.appliedFilter = Input.fromNullable(modelStringInput);
            return this;
        }

        public ModelSavedChartViewsConditionInput build() {
            return new ModelSavedChartViewsConditionInput(this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder includeAll(ModelBooleanInput modelBooleanInput) {
            this.includeAll = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isSystemCreated(ModelBooleanInput modelBooleanInput) {
            this.isSystemCreated = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelSavedChartViewsConditionInput modelSavedChartViewsConditionInput) {
            this.not = Input.fromNullable(modelSavedChartViewsConditionInput);
            return this;
        }

        public Builder objectTypeName(ModelStringInput modelStringInput) {
            this.objectTypeName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder or(List<ModelSavedChartViewsConditionInput> list) {
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

    public ModelSavedChartViewsConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelBooleanInput> input6, Input<ModelBooleanInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelScopeLevelInput> input17, Input<ModelIDInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<List<ModelSavedChartViewsConditionInput>> input25, Input<List<ModelSavedChartViewsConditionInput>> input26, Input<ModelSavedChartViewsConditionInput> input27) {
        this.accountId = input;
        this.ownerId = input2;
        this.targetComponent = input3;
        this.reportCategory = input4;
        this.chartTitle = input5;
        this.isSystemCreated = input6;
        this.includeAll = input7;
        this.gridType = input8;
        this.aggregateOnField = input9;
        this.aggregationType = input10;
        this.defaultPivotOnAttribute = input11;
        this.timeFilterAttributeName = input12;
        this.objectTypeName = input13;
        this.appliedFilter = input14;
        this.filterModel = input15;
        this.dateBuckets = input16;
        this.scopeLevel = input17;
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

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput aggregateOnField() {
        return this.aggregateOnField.value;
    }

    public ModelStringInput aggregationType() {
        return this.aggregationType.value;
    }

    public List<ModelSavedChartViewsConditionInput> and() {
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

    public ModelBooleanInput includeAll() {
        return this.includeAll.value;
    }

    public ModelBooleanInput isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSavedChartViewsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSavedChartViewsConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSavedChartViewsConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSavedChartViewsConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelSavedChartViewsConditionInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelSavedChartViewsConditionInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.targetComponent.defined) {
                    inputFieldWriter.writeObject("targetComponent", ModelSavedChartViewsConditionInput.this.targetComponent.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.targetComponent.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.reportCategory.defined) {
                    inputFieldWriter.writeObject("reportCategory", ModelSavedChartViewsConditionInput.this.reportCategory.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.reportCategory.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.chartTitle.defined) {
                    inputFieldWriter.writeObject("chartTitle", ModelSavedChartViewsConditionInput.this.chartTitle.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.chartTitle.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeObject("isSystemCreated", ModelSavedChartViewsConditionInput.this.isSystemCreated.value != 0 ? ((ModelBooleanInput) ModelSavedChartViewsConditionInput.this.isSystemCreated.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.includeAll.defined) {
                    inputFieldWriter.writeObject("includeAll", ModelSavedChartViewsConditionInput.this.includeAll.value != 0 ? ((ModelBooleanInput) ModelSavedChartViewsConditionInput.this.includeAll.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.gridType.defined) {
                    inputFieldWriter.writeObject("gridType", ModelSavedChartViewsConditionInput.this.gridType.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.gridType.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.aggregateOnField.defined) {
                    inputFieldWriter.writeObject("aggregateOnField", ModelSavedChartViewsConditionInput.this.aggregateOnField.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.aggregateOnField.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.aggregationType.defined) {
                    inputFieldWriter.writeObject("aggregationType", ModelSavedChartViewsConditionInput.this.aggregationType.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.aggregationType.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.defaultPivotOnAttribute.defined) {
                    inputFieldWriter.writeObject("defaultPivotOnAttribute", ModelSavedChartViewsConditionInput.this.defaultPivotOnAttribute.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.defaultPivotOnAttribute.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.timeFilterAttributeName.defined) {
                    inputFieldWriter.writeObject("timeFilterAttributeName", ModelSavedChartViewsConditionInput.this.timeFilterAttributeName.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.timeFilterAttributeName.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.objectTypeName.defined) {
                    inputFieldWriter.writeObject("objectTypeName", ModelSavedChartViewsConditionInput.this.objectTypeName.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.objectTypeName.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.appliedFilter.defined) {
                    inputFieldWriter.writeObject("appliedFilter", ModelSavedChartViewsConditionInput.this.appliedFilter.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.appliedFilter.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.filterModel.defined) {
                    inputFieldWriter.writeObject("filterModel", ModelSavedChartViewsConditionInput.this.filterModel.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.filterModel.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.dateBuckets.defined) {
                    inputFieldWriter.writeObject("dateBuckets", ModelSavedChartViewsConditionInput.this.dateBuckets.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.dateBuckets.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeObject("scopeLevel", ModelSavedChartViewsConditionInput.this.scopeLevel.value != 0 ? ((ModelScopeLevelInput) ModelSavedChartViewsConditionInput.this.scopeLevel.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", ModelSavedChartViewsConditionInput.this.scopeId.value != 0 ? ((ModelIDInput) ModelSavedChartViewsConditionInput.this.scopeId.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.forUserIds.defined) {
                    inputFieldWriter.writeObject("forUserIds", ModelSavedChartViewsConditionInput.this.forUserIds.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.forUserIds.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeObject("forTeamIds", ModelSavedChartViewsConditionInput.this.forTeamIds.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.forTeamIds.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeObject("forAuthorizations", ModelSavedChartViewsConditionInput.this.forAuthorizations.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.forAuthorizations.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.displayInformation.defined) {
                    inputFieldWriter.writeObject("displayInformation", ModelSavedChartViewsConditionInput.this.displayInformation.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.displayInformation.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSavedChartViewsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelSavedChartViewsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelSavedChartViewsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelSavedChartViewsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSavedChartViewsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedChartViewsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedChartViewsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedChartViewsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedChartViewsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSavedChartViewsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedChartViewsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedChartViewsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedChartViewsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedChartViewsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSavedChartViewsConditionInput.this.not.value != 0 ? ((ModelSavedChartViewsConditionInput) ModelSavedChartViewsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSavedChartViewsConditionInput not() {
        return this.not.value;
    }

    public ModelStringInput objectTypeName() {
        return this.objectTypeName.value;
    }

    public List<ModelSavedChartViewsConditionInput> or() {
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
