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
public final class CreateSavedChartViewsInput implements InputType {
    private final String accountId;
    private final Input<String> aggregateOnField;
    private final Input<String> aggregationType;
    private final Input<String> appliedFilter;
    private final String chartTitle;
    private final Input<String> createdAt;
    private final Input<String> dateBuckets;
    private final Input<String> defaultPivotOnAttribute;
    private final Input<String> displayInformation;
    private final Input<String> filterModel;
    private final Input<List<String>> forAuthorizations;
    private final Input<List<String>> forTeamIds;
    private final Input<List<String>> forUserIds;
    private final Input<String> gridType;
    private final Input<String> id;
    private final Input<Boolean> includeAll;
    private final Input<Boolean> isSystemCreated;
    private final Input<String> objectTypeName;
    private final String ownerId;
    private final Input<PositionInputInput> position;
    private final Input<String> reportCategory;
    private final Input<String> scopeId;
    private final Input<ScopeLevel> scopeLevel;
    private final Input<String> targetComponent;
    private final Input<String> timeFilterAttributeName;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String chartTitle;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<String> targetComponent = Input.absent();
        private Input<String> reportCategory = Input.absent();
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
            this.accountId = str;
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

        public CreateSavedChartViewsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.chartTitle, "chartTitle == null");
            return new CreateSavedChartViewsInput(this.id, this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.position, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt);
        }

        public Builder chartTitle(String str) {
            this.chartTitle = str;
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
            this.id = Input.fromNullable(str);
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
            this.ownerId = str;
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

    public CreateSavedChartViewsInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, String str3, Input<Boolean> input4, Input<Boolean> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<PositionInputInput> input15, Input<ScopeLevel> input16, Input<String> input17, Input<List<String>> input18, Input<List<String>> input19, Input<List<String>> input20, Input<String> input21, Input<String> input22, Input<String> input23) {
        this.id = input;
        this.accountId = str;
        this.ownerId = str2;
        this.targetComponent = input2;
        this.reportCategory = input3;
        this.chartTitle = str3;
        this.isSystemCreated = input4;
        this.includeAll = input5;
        this.gridType = input6;
        this.aggregateOnField = input7;
        this.aggregationType = input8;
        this.defaultPivotOnAttribute = input9;
        this.timeFilterAttributeName = input10;
        this.objectTypeName = input11;
        this.appliedFilter = input12;
        this.filterModel = input13;
        this.dateBuckets = input14;
        this.position = input15;
        this.scopeLevel = input16;
        this.scopeId = input17;
        this.forUserIds = input18;
        this.forTeamIds = input19;
        this.forAuthorizations = input20;
        this.displayInformation = input21;
        this.createdAt = input22;
        this.updatedAt = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.chartTitle;
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
        return this.id.value;
    }

    public Boolean includeAll() {
        return this.includeAll.value;
    }

    public Boolean isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateSavedChartViewsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateSavedChartViewsInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateSavedChartViewsInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateSavedChartViewsInput.this.accountId);
                inputFieldWriter.writeString("ownerId", CreateSavedChartViewsInput.this.ownerId);
                if (CreateSavedChartViewsInput.this.targetComponent.defined) {
                    inputFieldWriter.writeString("targetComponent", (String) CreateSavedChartViewsInput.this.targetComponent.value);
                }
                if (CreateSavedChartViewsInput.this.reportCategory.defined) {
                    inputFieldWriter.writeString("reportCategory", (String) CreateSavedChartViewsInput.this.reportCategory.value);
                }
                inputFieldWriter.writeString("chartTitle", CreateSavedChartViewsInput.this.chartTitle);
                if (CreateSavedChartViewsInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeBoolean("isSystemCreated", (Boolean) CreateSavedChartViewsInput.this.isSystemCreated.value);
                }
                if (CreateSavedChartViewsInput.this.includeAll.defined) {
                    inputFieldWriter.writeBoolean("includeAll", (Boolean) CreateSavedChartViewsInput.this.includeAll.value);
                }
                if (CreateSavedChartViewsInput.this.gridType.defined) {
                    inputFieldWriter.writeString("gridType", (String) CreateSavedChartViewsInput.this.gridType.value);
                }
                if (CreateSavedChartViewsInput.this.aggregateOnField.defined) {
                    inputFieldWriter.writeString("aggregateOnField", (String) CreateSavedChartViewsInput.this.aggregateOnField.value);
                }
                if (CreateSavedChartViewsInput.this.aggregationType.defined) {
                    inputFieldWriter.writeString("aggregationType", (String) CreateSavedChartViewsInput.this.aggregationType.value);
                }
                if (CreateSavedChartViewsInput.this.defaultPivotOnAttribute.defined) {
                    inputFieldWriter.writeString("defaultPivotOnAttribute", (String) CreateSavedChartViewsInput.this.defaultPivotOnAttribute.value);
                }
                if (CreateSavedChartViewsInput.this.timeFilterAttributeName.defined) {
                    inputFieldWriter.writeString("timeFilterAttributeName", (String) CreateSavedChartViewsInput.this.timeFilterAttributeName.value);
                }
                if (CreateSavedChartViewsInput.this.objectTypeName.defined) {
                    inputFieldWriter.writeString("objectTypeName", (String) CreateSavedChartViewsInput.this.objectTypeName.value);
                }
                if (CreateSavedChartViewsInput.this.appliedFilter.defined) {
                    inputFieldWriter.writeString("appliedFilter", (String) CreateSavedChartViewsInput.this.appliedFilter.value);
                }
                if (CreateSavedChartViewsInput.this.filterModel.defined) {
                    inputFieldWriter.writeString("filterModel", (String) CreateSavedChartViewsInput.this.filterModel.value);
                }
                if (CreateSavedChartViewsInput.this.dateBuckets.defined) {
                    inputFieldWriter.writeString("dateBuckets", (String) CreateSavedChartViewsInput.this.dateBuckets.value);
                }
                if (CreateSavedChartViewsInput.this.position.defined) {
                    inputFieldWriter.writeObject("position", CreateSavedChartViewsInput.this.position.value != 0 ? ((PositionInputInput) CreateSavedChartViewsInput.this.position.value).marshaller() : null);
                }
                if (CreateSavedChartViewsInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeString("scopeLevel", CreateSavedChartViewsInput.this.scopeLevel.value != 0 ? ((ScopeLevel) CreateSavedChartViewsInput.this.scopeLevel.value).name() : null);
                }
                if (CreateSavedChartViewsInput.this.scopeId.defined) {
                    inputFieldWriter.writeString("scopeId", (String) CreateSavedChartViewsInput.this.scopeId.value);
                }
                if (CreateSavedChartViewsInput.this.forUserIds.defined) {
                    inputFieldWriter.writeList("forUserIds", CreateSavedChartViewsInput.this.forUserIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateSavedChartViewsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateSavedChartViewsInput.this.forUserIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateSavedChartViewsInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeList("forTeamIds", CreateSavedChartViewsInput.this.forTeamIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateSavedChartViewsInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateSavedChartViewsInput.this.forTeamIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateSavedChartViewsInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeList("forAuthorizations", CreateSavedChartViewsInput.this.forAuthorizations.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateSavedChartViewsInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateSavedChartViewsInput.this.forAuthorizations.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateSavedChartViewsInput.this.displayInformation.defined) {
                    inputFieldWriter.writeString("displayInformation", (String) CreateSavedChartViewsInput.this.displayInformation.value);
                }
                if (CreateSavedChartViewsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateSavedChartViewsInput.this.createdAt.value);
                }
                if (CreateSavedChartViewsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateSavedChartViewsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String objectTypeName() {
        return this.objectTypeName.value;
    }

    public String ownerId() {
        return this.ownerId;
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
