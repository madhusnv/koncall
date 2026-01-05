package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelSavedTableViewsConditionInput implements InputType {
    private final Input<ModelStringInput> addedToAppHomeOn;
    private final Input<List<ModelSavedTableViewsConditionInput>> and;
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
    private final Input<ModelSavedTableViewsConditionInput> not;
    private final Input<List<ModelSavedTableViewsConditionInput>> or;
    private final Input<ModelIDInput> scopeId;
    private final Input<ModelScopeLevelInput> scopeLevel;
    private final Input<ModelBooleanInput> showMetricsInApp;
    private final Input<ModelBooleanInput> showMetricsOnDashboard;
    private final Input<ModelStringInput> sortModel;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelSavedTableViewsConditionInput>> and = Input.absent();
        private Input<List<ModelSavedTableViewsConditionInput>> or = Input.absent();
        private Input<ModelSavedTableViewsConditionInput> not = Input.absent();

        public Builder addedToAppHomeOn(ModelStringInput modelStringInput) {
            this.addedToAppHomeOn = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelSavedTableViewsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelSavedTableViewsConditionInput build() {
            return new ModelSavedTableViewsConditionInput(this.isSystemCreated, this.includeAll, this.filterModel, this.sortModel, this.columnState, this.hiddenColumnms, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.isMetrics, this.isOnlyMetrics, this.dbFilterModel, this.showMetricsOnDashboard, this.showMetricsInApp, this.addedToAppHomeOn, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelSavedTableViewsConditionInput modelSavedTableViewsConditionInput) {
            this.not = Input.fromNullable(modelSavedTableViewsConditionInput);
            return this;
        }

        public Builder or(List<ModelSavedTableViewsConditionInput> list) {
            this.or = Input.fromNullable(list);
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

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelSavedTableViewsConditionInput(Input<ModelBooleanInput> input, Input<ModelBooleanInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelScopeLevelInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelBooleanInput> input12, Input<ModelBooleanInput> input13, Input<ModelStringInput> input14, Input<ModelBooleanInput> input15, Input<ModelBooleanInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<List<ModelSavedTableViewsConditionInput>> input20, Input<List<ModelSavedTableViewsConditionInput>> input21, Input<ModelSavedTableViewsConditionInput> input22) {
        this.isSystemCreated = input;
        this.includeAll = input2;
        this.filterModel = input3;
        this.sortModel = input4;
        this.columnState = input5;
        this.hiddenColumnms = input6;
        this.scopeLevel = input7;
        this.scopeId = input8;
        this.forUserIds = input9;
        this.forTeamIds = input10;
        this.forAuthorizations = input11;
        this.isMetrics = input12;
        this.isOnlyMetrics = input13;
        this.dbFilterModel = input14;
        this.showMetricsOnDashboard = input15;
        this.showMetricsInApp = input16;
        this.addedToAppHomeOn = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelStringInput addedToAppHomeOn() {
        return this.addedToAppHomeOn.value;
    }

    public List<ModelSavedTableViewsConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelSavedTableViewsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSavedTableViewsConditionInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeObject("isSystemCreated", ModelSavedTableViewsConditionInput.this.isSystemCreated.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsConditionInput.this.isSystemCreated.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.includeAll.defined) {
                    inputFieldWriter.writeObject("includeAll", ModelSavedTableViewsConditionInput.this.includeAll.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsConditionInput.this.includeAll.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.filterModel.defined) {
                    inputFieldWriter.writeObject("filterModel", ModelSavedTableViewsConditionInput.this.filterModel.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.filterModel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.sortModel.defined) {
                    inputFieldWriter.writeObject("sortModel", ModelSavedTableViewsConditionInput.this.sortModel.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.sortModel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.columnState.defined) {
                    inputFieldWriter.writeObject("columnState", ModelSavedTableViewsConditionInput.this.columnState.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.columnState.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.hiddenColumnms.defined) {
                    inputFieldWriter.writeObject("hiddenColumnms", ModelSavedTableViewsConditionInput.this.hiddenColumnms.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.hiddenColumnms.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeObject("scopeLevel", ModelSavedTableViewsConditionInput.this.scopeLevel.value != 0 ? ((ModelScopeLevelInput) ModelSavedTableViewsConditionInput.this.scopeLevel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", ModelSavedTableViewsConditionInput.this.scopeId.value != 0 ? ((ModelIDInput) ModelSavedTableViewsConditionInput.this.scopeId.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.forUserIds.defined) {
                    inputFieldWriter.writeObject("forUserIds", ModelSavedTableViewsConditionInput.this.forUserIds.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.forUserIds.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeObject("forTeamIds", ModelSavedTableViewsConditionInput.this.forTeamIds.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.forTeamIds.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeObject("forAuthorizations", ModelSavedTableViewsConditionInput.this.forAuthorizations.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.forAuthorizations.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.isMetrics.defined) {
                    inputFieldWriter.writeObject("isMetrics", ModelSavedTableViewsConditionInput.this.isMetrics.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsConditionInput.this.isMetrics.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.isOnlyMetrics.defined) {
                    inputFieldWriter.writeObject("isOnlyMetrics", ModelSavedTableViewsConditionInput.this.isOnlyMetrics.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsConditionInput.this.isOnlyMetrics.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.dbFilterModel.defined) {
                    inputFieldWriter.writeObject("dbFilterModel", ModelSavedTableViewsConditionInput.this.dbFilterModel.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.dbFilterModel.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.showMetricsOnDashboard.defined) {
                    inputFieldWriter.writeObject("showMetricsOnDashboard", ModelSavedTableViewsConditionInput.this.showMetricsOnDashboard.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsConditionInput.this.showMetricsOnDashboard.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.showMetricsInApp.defined) {
                    inputFieldWriter.writeObject("showMetricsInApp", ModelSavedTableViewsConditionInput.this.showMetricsInApp.value != 0 ? ((ModelBooleanInput) ModelSavedTableViewsConditionInput.this.showMetricsInApp.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.addedToAppHomeOn.defined) {
                    inputFieldWriter.writeObject("addedToAppHomeOn", ModelSavedTableViewsConditionInput.this.addedToAppHomeOn.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.addedToAppHomeOn.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelSavedTableViewsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelSavedTableViewsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelSavedTableViewsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelSavedTableViewsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelSavedTableViewsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedTableViewsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedTableViewsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedTableViewsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedTableViewsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelSavedTableViewsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelSavedTableViewsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelSavedTableViewsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelSavedTableViewsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelSavedTableViewsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelSavedTableViewsConditionInput.this.not.value != 0 ? ((ModelSavedTableViewsConditionInput) ModelSavedTableViewsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelSavedTableViewsConditionInput not() {
        return this.not.value;
    }

    public List<ModelSavedTableViewsConditionInput> or() {
        return this.or.value;
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

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
