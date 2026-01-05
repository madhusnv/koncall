package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSavedTableViewsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> addedToAppHomeOn;
    private final Input<List<ModelSavedTableViewsFilterInput>> and;
    private final Input<ModelStringInput> columnState;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> dbFilterModel;
    private final Input<ModelStringInput> filterModel;
    private final Input<ModelStringInput> forAuthorizations;
    private final Input<ModelStringInput> forTeamIds;
    private final Input<ModelStringInput> forUserIds;
    private final Input<ModelStringInput> hiddenColumnms;
    private final Input<ModelBooleanInput> includeAll;
    private final Input<ModelBooleanInput> isMetrics;
    private final Input<ModelBooleanInput> isOnlyMetrics;
    private final Input<ModelBooleanInput> isSystemCreated;
    private final Input<ModelSavedTableViewsFilterInput> not;
    private final Input<List<ModelSavedTableViewsFilterInput>> or;
    private final Input<ModelIDInput> ownerId;
    private final Input<ModelIDInput> scopeId;
    private final Input<ModelScopeLevelInput> scopeLevel;
    private final Input<ModelBooleanInput> showMetricsInApp;
    private final Input<ModelBooleanInput> showMetricsOnDashboard;
    private final Input<ModelStringInput> sortModel;
    private final Input<ModelStringInput> tableName;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> viewName;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> ownerId = Input.absent();
        private Input<ModelStringInput> tableName = Input.absent();
        private Input<ModelStringInput> viewName = Input.absent();
        private Input<ModelBooleanInput> isSystemCreated = Input.absent();
        private Input<ModelBooleanInput> includeAll = Input.absent();
        private Input<ModelStringInput> filterModel = Input.absent();
        private Input<ModelStringInput> sortModel = Input.absent();
        private Input<ModelStringInput> columnState = Input.absent();
        private Input<ModelStringInput> hiddenColumnms = Input.absent();
        private Input<ModelScopeLevelInput> scopeLevel = Input.absent();
        private Input<ModelIDInput> scopeId = Input.absent();
        private Input<ModelStringInput> forUserIds = Input.absent();
        private Input<ModelStringInput> forTeamIds = Input.absent();
        private Input<ModelStringInput> forAuthorizations = Input.absent();
        private Input<ModelBooleanInput> isMetrics = Input.absent();
        private Input<ModelBooleanInput> isOnlyMetrics = Input.absent();
        private Input<ModelStringInput> dbFilterModel = Input.absent();
        private Input<ModelBooleanInput> showMetricsOnDashboard = Input.absent();
        private Input<ModelBooleanInput> showMetricsInApp = Input.absent();
        private Input<ModelStringInput> addedToAppHomeOn = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelSavedTableViewsFilterInput>> and = Input.absent();
        private Input<List<ModelSavedTableViewsFilterInput>> or = Input.absent();
        private Input<ModelSavedTableViewsFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder addedToAppHomeOn(ModelStringInput modelStringInput) {
            this.addedToAppHomeOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelSavedTableViewsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelSavedTableViewsFilterInput build() {
            return new ModelSavedTableViewsFilterInput(this.accountId, this.ownerId, this.tableName, this.viewName, this.isSystemCreated, this.includeAll, this.filterModel, this.sortModel, this.columnState, this.hiddenColumnms, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.isMetrics, this.isOnlyMetrics, this.dbFilterModel, this.showMetricsOnDashboard, this.showMetricsInApp, this.addedToAppHomeOn, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder columnState(ModelStringInput modelStringInput) {
            this.columnState = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dbFilterModel(ModelStringInput modelStringInput) {
            this.dbFilterModel = Input.fromNullable(modelStringInput);
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

        public Builder hiddenColumnms(ModelStringInput modelStringInput) {
            this.hiddenColumnms = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder includeAll(ModelBooleanInput modelBooleanInput) {
            this.includeAll = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isMetrics(ModelBooleanInput modelBooleanInput) {
            this.isMetrics = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isOnlyMetrics(ModelBooleanInput modelBooleanInput) {
            this.isOnlyMetrics = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isSystemCreated(ModelBooleanInput modelBooleanInput) {
            this.isSystemCreated = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelSavedTableViewsFilterInput modelSavedTableViewsFilterInput) {
            this.not = Input.fromNullable(modelSavedTableViewsFilterInput);
            return this;
        }

        public Builder or(List<ModelSavedTableViewsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(ModelIDInput modelIDInput) {
            this.ownerId = Input.fromNullable(modelIDInput);
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

        public Builder showMetricsInApp(ModelBooleanInput modelBooleanInput) {
            this.showMetricsInApp = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder showMetricsOnDashboard(ModelBooleanInput modelBooleanInput) {
            this.showMetricsOnDashboard = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder sortModel(ModelStringInput modelStringInput) {
            this.sortModel = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder tableName(ModelStringInput modelStringInput) {
            this.tableName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder viewName(ModelStringInput modelStringInput) {
            this.viewName = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelSavedTableViewsFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelBooleanInput> input5, Input<ModelBooleanInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelScopeLevelInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelBooleanInput> input16, Input<ModelBooleanInput> input17, Input<ModelStringInput> input18, Input<ModelBooleanInput> input19, Input<ModelBooleanInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<List<ModelSavedTableViewsFilterInput>> input24, Input<List<ModelSavedTableViewsFilterInput>> input25, Input<ModelSavedTableViewsFilterInput> input26) {
        this.accountId = input;
        this.ownerId = input2;
        this.tableName = input3;
        this.viewName = input4;
        this.isSystemCreated = input5;
        this.includeAll = input6;
        this.filterModel = input7;
        this.sortModel = input8;
        this.columnState = input9;
        this.hiddenColumnms = input10;
        this.scopeLevel = input11;
        this.scopeId = input12;
        this.forUserIds = input13;
        this.forTeamIds = input14;
        this.forAuthorizations = input15;
        this.isMetrics = input16;
        this.isOnlyMetrics = input17;
        this.dbFilterModel = input18;
        this.showMetricsOnDashboard = input19;
        this.showMetricsInApp = input20;
        this.addedToAppHomeOn = input21;
        this.createdAt = input22;
        this.updatedAt = input23;
        this.and = input24;
        this.or = input25;
        this.not = input26;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelStringInput addedToAppHomeOn() {
        return this.addedToAppHomeOn.value;
    }

    public List<ModelSavedTableViewsFilterInput> and() {
        return this.and.value;
    }

    public ModelStringInput columnState() {
        return this.columnState.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput dbFilterModel() {
        return this.dbFilterModel.value;
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

    public ModelStringInput hiddenColumnms() {
        return this.hiddenColumnms.value;
    }

    public ModelBooleanInput includeAll() {
        return this.includeAll.value;
    }

    public ModelBooleanInput isMetrics() {
        return this.isMetrics.value;
    }

    public ModelBooleanInput isOnlyMetrics() {
        return this.isOnlyMetrics.value;
    }

    public ModelBooleanInput isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSavedTableViewsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSavedTableViewsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelSavedTableViewsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelSavedTableViewsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", ModelSavedTableViewsFilterInput.this.ownerId.value != 0 ? ((ModelIDInput) ModelSavedTableViewsFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.tableName.defined) {
                    inputFieldWriter.writeObject("tableName", ModelSavedTableViewsFilterInput.this.tableName.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.tableName.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.viewName.defined) {
                    inputFieldWriter.writeObject("viewName", ModelSavedTableViewsFilterInput.this.viewName.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.viewName.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeObject("isSystemCreated", ModelSavedTableViewsFilterInput.this.isSystemCreated.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsFilterInput.this.isSystemCreated.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.includeAll.defined) {
                    inputFieldWriter.writeObject("includeAll", ModelSavedTableViewsFilterInput.this.includeAll.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsFilterInput.this.includeAll.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.filterModel.defined) {
                    inputFieldWriter.writeObject("filterModel", ModelSavedTableViewsFilterInput.this.filterModel.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.filterModel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.sortModel.defined) {
                    inputFieldWriter.writeObject("sortModel", ModelSavedTableViewsFilterInput.this.sortModel.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.sortModel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.columnState.defined) {
                    inputFieldWriter.writeObject("columnState", ModelSavedTableViewsFilterInput.this.columnState.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.columnState.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.hiddenColumnms.defined) {
                    inputFieldWriter.writeObject("hiddenColumnms", ModelSavedTableViewsFilterInput.this.hiddenColumnms.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.hiddenColumnms.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeObject("scopeLevel", ModelSavedTableViewsFilterInput.this.scopeLevel.value != 0 ? ((ModelScopeLevelInput) ModelSavedTableViewsFilterInput.this.scopeLevel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", ModelSavedTableViewsFilterInput.this.scopeId.value != 0 ? ((ModelIDInput) ModelSavedTableViewsFilterInput.this.scopeId.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.forUserIds.defined) {
                    inputFieldWriter.writeObject("forUserIds", ModelSavedTableViewsFilterInput.this.forUserIds.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.forUserIds.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeObject("forTeamIds", ModelSavedTableViewsFilterInput.this.forTeamIds.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.forTeamIds.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeObject("forAuthorizations", ModelSavedTableViewsFilterInput.this.forAuthorizations.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.forAuthorizations.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.isMetrics.defined) {
                    inputFieldWriter.writeObject("isMetrics", ModelSavedTableViewsFilterInput.this.isMetrics.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsFilterInput.this.isMetrics.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.isOnlyMetrics.defined) {
                    inputFieldWriter.writeObject("isOnlyMetrics", ModelSavedTableViewsFilterInput.this.isOnlyMetrics.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsFilterInput.this.isOnlyMetrics.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.dbFilterModel.defined) {
                    inputFieldWriter.writeObject("dbFilterModel", ModelSavedTableViewsFilterInput.this.dbFilterModel.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.dbFilterModel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.showMetricsOnDashboard.defined) {
                    inputFieldWriter.writeObject("showMetricsOnDashboard", ModelSavedTableViewsFilterInput.this.showMetricsOnDashboard.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsFilterInput.this.showMetricsOnDashboard.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.showMetricsInApp.defined) {
                    inputFieldWriter.writeObject("showMetricsInApp", ModelSavedTableViewsFilterInput.this.showMetricsInApp.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsFilterInput.this.showMetricsInApp.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.addedToAppHomeOn.defined) {
                    inputFieldWriter.writeObject("addedToAppHomeOn", ModelSavedTableViewsFilterInput.this.addedToAppHomeOn.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.addedToAppHomeOn.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSavedTableViewsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelSavedTableViewsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelSavedTableViewsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelSavedTableViewsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSavedTableViewsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedTableViewsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedTableViewsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedTableViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedTableViewsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSavedTableViewsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedTableViewsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedTableViewsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedTableViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedTableViewsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSavedTableViewsFilterInput.this.not.value != 0 ? ((ModelSavedTableViewsFilterInput) ModelSavedTableViewsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSavedTableViewsFilterInput not() {
        return this.not.value;
    }

    public List<ModelSavedTableViewsFilterInput> or() {
        return this.or.value;
    }

    public ModelIDInput ownerId() {
        return this.ownerId.value;
    }

    public ModelIDInput scopeId() {
        return this.scopeId.value;
    }

    public ModelScopeLevelInput scopeLevel() {
        return this.scopeLevel.value;
    }

    public ModelBooleanInput showMetricsInApp() {
        return this.showMetricsInApp.value;
    }

    public ModelBooleanInput showMetricsOnDashboard() {
        return this.showMetricsOnDashboard.value;
    }

    public ModelStringInput sortModel() {
        return this.sortModel.value;
    }

    public ModelStringInput tableName() {
        return this.tableName.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput viewName() {
        return this.viewName.value;
    }
}
