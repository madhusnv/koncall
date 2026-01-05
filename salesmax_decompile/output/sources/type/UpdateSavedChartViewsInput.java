package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateSavedChartViewsInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> aggregateOnField;
    private final Input<String> aggregationType;
    private final Input<String> appliedFilter;
    private final Input<String> chartTitle;
    private final Input<String> createdAt;
    private final Input<String> dateBuckets;
    private final Input<String> defaultPivotOnAttribute;
    private final Input<String> displayInformation;
    private final Input<String> filterModel;
    private final Input<List<String>> forAuthorizations;
    private final Input<List<String>> forTeamIds;
    private final Input<List<String>> forUserIds;
    private final Input<String> gridType;
    private final String id;
    private final Input<Boolean> includeAll;
    private final Input<Boolean> isSystemCreated;
    private final Input<String> objectTypeName;
    private final Input<String> ownerId;
    private final Input<PositionInputInput> position;
    private final Input<String> reportCategory;
    private final Input<String> scopeId;
    private final Input<ScopeLevel> scopeLevel;
    private final Input<String> targetComponent;
    private final Input<String> timeFilterAttributeName;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> targetComponent = Input.absent();
        private Input<String> reportCategory = Input.absent();
        private Input<String> chartTitle = Input.absent();
        private Input<Boolean> isSystemCreated = Input.absent();
        private Input<Boolean> includeAll = Input.absent();
        private Input<String> gridType = Input.absent();
        private Input<String> aggregateOnField = Input.absent();
        private Input<String> aggregationType = Input.absent();
        private Input<String> defaultPivotOnAttribute = Input.absent();
        private Input<String> timeFilterAttributeName = Input.absent();
        private Input<String> objectTypeName = Input.absent();
        private Input<String> appliedFilter = Input.absent();
        private Input<String> filterModel = Input.absent();
        private Input<String> dateBuckets = Input.absent();
        private Input<PositionInputInput> position = Input.absent();
        private Input<ScopeLevel> scopeLevel = Input.absent();
        private Input<String> scopeId = Input.absent();
        private Input<List<String>> forUserIds = Input.absent();
        private Input<List<String>> forTeamIds = Input.absent();
        private Input<List<String>> forAuthorizations = Input.absent();
        private Input<String> displayInformation = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder aggregateOnField(String str) {
            this.aggregateOnField = Input.fromNullable(str);
            return this;
        }

        public Builder aggregationType(String str) {
            this.aggregationType = Input.fromNullable(str);
            return this;
        }

        public Builder appliedFilter(String str) {
            this.appliedFilter = Input.fromNullable(str);
            return this;
        }

        public UpdateSavedChartViewsInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateSavedChartViewsInput(this.id, this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.position, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt);
        }

        public Builder chartTitle(String str) {
            this.chartTitle = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dateBuckets(String str) {
            this.dateBuckets = Input.fromNullable(str);
            return this;
        }

        public Builder defaultPivotOnAttribute(String str) {
            this.defaultPivotOnAttribute = Input.fromNullable(str);
            return this;
        }

        public Builder displayInformation(String str) {
            this.displayInformation = Input.fromNullable(str);
            return this;
        }

        public Builder filterModel(String str) {
            this.filterModel = Input.fromNullable(str);
            return this;
        }

        public Builder forAuthorizations(List<String> list) {
            this.forAuthorizations = Input.fromNullable(list);
            return this;
        }

        public Builder forTeamIds(List<String> list) {
            this.forTeamIds = Input.fromNullable(list);
            return this;
        }

        public Builder forUserIds(List<String> list) {
            this.forUserIds = Input.fromNullable(list);
            return this;
        }

        public Builder gridType(String str) {
            this.gridType = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder includeAll(Boolean bool) {
            this.includeAll = Input.fromNullable(bool);
            return this;
        }

        public Builder isSystemCreated(Boolean bool) {
            this.isSystemCreated = Input.fromNullable(bool);
            return this;
        }

        public Builder objectTypeName(String str) {
            this.objectTypeName = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder position(PositionInputInput positionInputInput) {
            this.position = Input.fromNullable(positionInputInput);
            return this;
        }

        public Builder reportCategory(String str) {
            this.reportCategory = Input.fromNullable(str);
            return this;
        }

        public Builder scopeId(String str) {
            this.scopeId = Input.fromNullable(str);
            return this;
        }

        public Builder scopeLevel(ScopeLevel scopeLevel) {
            this.scopeLevel = Input.fromNullable(scopeLevel);
            return this;
        }

        public Builder targetComponent(String str) {
            this.targetComponent = Input.fromNullable(str);
            return this;
        }

        public Builder timeFilterAttributeName(String str) {
            this.timeFilterAttributeName = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateSavedChartViewsInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Boolean> input6, Input<Boolean> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<PositionInputInput> input17, Input<ScopeLevel> input18, Input<String> input19, Input<List<String>> input20, Input<List<String>> input21, Input<List<String>> input22, Input<String> input23, Input<String> input24, Input<String> input25) {
        this.id = str;
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
        this.position = input17;
        this.scopeLevel = input18;
        this.scopeId = input19;
        this.forUserIds = input20;
        this.forTeamIds = input21;
        this.forAuthorizations = input22;
        this.displayInformation = input23;
        this.createdAt = input24;
        this.updatedAt = input25;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String aggregateOnField() {
        return this.aggregateOnField.value;
    }

    public String aggregationType() {
        return this.aggregationType.value;
    }

    public String appliedFilter() {
        return this.appliedFilter.value;
    }

    public String chartTitle() {
        return this.chartTitle.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dateBuckets() {
        return this.dateBuckets.value;
    }

    public String defaultPivotOnAttribute() {
        return this.defaultPivotOnAttribute.value;
    }

    public String displayInformation() {
        return this.displayInformation.value;
    }

    public String filterModel() {
        return this.filterModel.value;
    }

    public List<String> forAuthorizations() {
        return this.forAuthorizations.value;
    }

    public List<String> forTeamIds() {
        return this.forTeamIds.value;
    }

    public List<String> forUserIds() {
        return this.forUserIds.value;
    }

    public String gridType() {
        return this.gridType.value;
    }

    public String id() {
        return this.id;
    }

    public Boolean includeAll() {
        return this.includeAll.value;
    }

    public Boolean isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateSavedChartViewsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateSavedChartViewsInput.this.id);
                if (UpdateSavedChartViewsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateSavedChartViewsInput.this.accountId.value);
                }
                if (UpdateSavedChartViewsInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateSavedChartViewsInput.this.ownerId.value);
                }
                if (UpdateSavedChartViewsInput.this.targetComponent.defined) {
                    inputFieldWriter.writeString("targetComponent", (String) UpdateSavedChartViewsInput.this.targetComponent.value);
                }
                if (UpdateSavedChartViewsInput.this.reportCategory.defined) {
                    inputFieldWriter.writeString("reportCategory", (String) UpdateSavedChartViewsInput.this.reportCategory.value);
                }
                if (UpdateSavedChartViewsInput.this.chartTitle.defined) {
                    inputFieldWriter.writeString("chartTitle", (String) UpdateSavedChartViewsInput.this.chartTitle.value);
                }
                if (UpdateSavedChartViewsInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeBoolean("isSystemCreated", (Boolean) UpdateSavedChartViewsInput.this.isSystemCreated.value);
                }
                if (UpdateSavedChartViewsInput.this.includeAll.defined) {
                    inputFieldWriter.writeBoolean("includeAll", (Boolean) UpdateSavedChartViewsInput.this.includeAll.value);
                }
                if (UpdateSavedChartViewsInput.this.gridType.defined) {
                    inputFieldWriter.writeString("gridType", (String) UpdateSavedChartViewsInput.this.gridType.value);
                }
                if (UpdateSavedChartViewsInput.this.aggregateOnField.defined) {
                    inputFieldWriter.writeString("aggregateOnField", (String) UpdateSavedChartViewsInput.this.aggregateOnField.value);
                }
                if (UpdateSavedChartViewsInput.this.aggregationType.defined) {
                    inputFieldWriter.writeString("aggregationType", (String) UpdateSavedChartViewsInput.this.aggregationType.value);
                }
                if (UpdateSavedChartViewsInput.this.defaultPivotOnAttribute.defined) {
                    inputFieldWriter.writeString("defaultPivotOnAttribute", (String) UpdateSavedChartViewsInput.this.defaultPivotOnAttribute.value);
                }
                if (UpdateSavedChartViewsInput.this.timeFilterAttributeName.defined) {
                    inputFieldWriter.writeString("timeFilterAttributeName", (String) UpdateSavedChartViewsInput.this.timeFilterAttributeName.value);
                }
                if (UpdateSavedChartViewsInput.this.objectTypeName.defined) {
                    inputFieldWriter.writeString("objectTypeName", (String) UpdateSavedChartViewsInput.this.objectTypeName.value);
                }
                if (UpdateSavedChartViewsInput.this.appliedFilter.defined) {
                    inputFieldWriter.writeString("appliedFilter", (String) UpdateSavedChartViewsInput.this.appliedFilter.value);
                }
                if (UpdateSavedChartViewsInput.this.filterModel.defined) {
                    inputFieldWriter.writeString("filterModel", (String) UpdateSavedChartViewsInput.this.filterModel.value);
                }
                if (UpdateSavedChartViewsInput.this.dateBuckets.defined) {
                    inputFieldWriter.writeString("dateBuckets", (String) UpdateSavedChartViewsInput.this.dateBuckets.value);
                }
                if (UpdateSavedChartViewsInput.this.position.defined) {
                    inputFieldWriter.writeObject("position", UpdateSavedChartViewsInput.this.position.value != 0 ? ((PositionInputInput) UpdateSavedChartViewsInput.this.position.value).marshaller() : null);
                }
                if (UpdateSavedChartViewsInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeString("scopeLevel", UpdateSavedChartViewsInput.this.scopeLevel.value != 0 ? ((ScopeLevel) UpdateSavedChartViewsInput.this.scopeLevel.value).name() : null);
                }
                if (UpdateSavedChartViewsInput.this.scopeId.defined) {
                    inputFieldWriter.writeString("scopeId", (String) UpdateSavedChartViewsInput.this.scopeId.value);
                }
                if (UpdateSavedChartViewsInput.this.forUserIds.defined) {
                    inputFieldWriter.writeList("forUserIds", UpdateSavedChartViewsInput.this.forUserIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateSavedChartViewsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateSavedChartViewsInput.this.forUserIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateSavedChartViewsInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeList("forTeamIds", UpdateSavedChartViewsInput.this.forTeamIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateSavedChartViewsInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateSavedChartViewsInput.this.forTeamIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateSavedChartViewsInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeList("forAuthorizations", UpdateSavedChartViewsInput.this.forAuthorizations.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateSavedChartViewsInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateSavedChartViewsInput.this.forAuthorizations.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateSavedChartViewsInput.this.displayInformation.defined) {
                    inputFieldWriter.writeString("displayInformation", (String) UpdateSavedChartViewsInput.this.displayInformation.value);
                }
                if (UpdateSavedChartViewsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateSavedChartViewsInput.this.createdAt.value);
                }
                if (UpdateSavedChartViewsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateSavedChartViewsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String objectTypeName() {
        return this.objectTypeName.value;
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public PositionInputInput position() {
        return this.position.value;
    }

    public String reportCategory() {
        return this.reportCategory.value;
    }

    public String scopeId() {
        return this.scopeId.value;
    }

    public ScopeLevel scopeLevel() {
        return this.scopeLevel.value;
    }

    public String targetComponent() {
        return this.targetComponent.value;
    }

    public String timeFilterAttributeName() {
        return this.timeFilterAttributeName.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
