package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableSavedTableViewsFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableStringFilterInput> addedToAppHomeOn;
    private final Input<List<SearchableSavedTableViewsFilterInput>> and;
    private final Input<SearchableStringFilterInput> columnState;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> dbFilterModel;
    private final Input<SearchableStringFilterInput> filterModel;
    private final Input<SearchableStringFilterInput> forAuthorizations;
    private final Input<SearchableStringFilterInput> forTeamIds;
    private final Input<SearchableStringFilterInput> forUserIds;
    private final Input<SearchableStringFilterInput> hiddenColumnms;
    private final Input<SearchableBooleanFilterInput> includeAll;
    private final Input<SearchableBooleanFilterInput> isMetrics;
    private final Input<SearchableBooleanFilterInput> isOnlyMetrics;
    private final Input<SearchableBooleanFilterInput> isSystemCreated;
    private final Input<SearchableSavedTableViewsFilterInput> not;
    private final Input<List<SearchableSavedTableViewsFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableIDFilterInput> scopeId;
    private final Input<SearchableBooleanFilterInput> showMetricsInApp;
    private final Input<SearchableBooleanFilterInput> showMetricsOnDashboard;
    private final Input<SearchableStringFilterInput> sortModel;
    private final Input<SearchableStringFilterInput> tableName;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> viewName;

    public static final class Builder {
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableStringFilterInput> tableName = Input.absent();
        private Input<SearchableStringFilterInput> viewName = Input.absent();
        private Input<SearchableBooleanFilterInput> isSystemCreated = Input.absent();
        private Input<SearchableBooleanFilterInput> includeAll = Input.absent();
        private Input<SearchableStringFilterInput> filterModel = Input.absent();
        private Input<SearchableStringFilterInput> sortModel = Input.absent();
        private Input<SearchableStringFilterInput> columnState = Input.absent();
        private Input<SearchableStringFilterInput> hiddenColumnms = Input.absent();
        private Input<SearchableIDFilterInput> scopeId = Input.absent();
        private Input<SearchableStringFilterInput> forUserIds = Input.absent();
        private Input<SearchableStringFilterInput> forTeamIds = Input.absent();
        private Input<SearchableStringFilterInput> forAuthorizations = Input.absent();
        private Input<SearchableBooleanFilterInput> isMetrics = Input.absent();
        private Input<SearchableBooleanFilterInput> isOnlyMetrics = Input.absent();
        private Input<SearchableStringFilterInput> dbFilterModel = Input.absent();
        private Input<SearchableBooleanFilterInput> showMetricsOnDashboard = Input.absent();
        private Input<SearchableBooleanFilterInput> showMetricsInApp = Input.absent();
        private Input<SearchableStringFilterInput> addedToAppHomeOn = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableSavedTableViewsFilterInput>> and = Input.absent();
        private Input<List<SearchableSavedTableViewsFilterInput>> or = Input.absent();
        private Input<SearchableSavedTableViewsFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder addedToAppHomeOn(SearchableStringFilterInput searchableStringFilterInput) {
            this.addedToAppHomeOn = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableSavedTableViewsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableSavedTableViewsFilterInput build() {
            return new SearchableSavedTableViewsFilterInput(this.accountId, this.ownerId, this.tableName, this.viewName, this.isSystemCreated, this.includeAll, this.filterModel, this.sortModel, this.columnState, this.hiddenColumnms, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.isMetrics, this.isOnlyMetrics, this.dbFilterModel, this.showMetricsOnDashboard, this.showMetricsInApp, this.addedToAppHomeOn, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder columnState(SearchableStringFilterInput searchableStringFilterInput) {
            this.columnState = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dbFilterModel(SearchableStringFilterInput searchableStringFilterInput) {
            this.dbFilterModel = Input.fromNullable(searchableStringFilterInput);
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

        public Builder hiddenColumnms(SearchableStringFilterInput searchableStringFilterInput) {
            this.hiddenColumnms = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder includeAll(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.includeAll = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isMetrics(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isMetrics = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isOnlyMetrics(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isOnlyMetrics = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isSystemCreated(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isSystemCreated = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder not(SearchableSavedTableViewsFilterInput searchableSavedTableViewsFilterInput) {
            this.not = Input.fromNullable(searchableSavedTableViewsFilterInput);
            return this;
        }

        public Builder or(List<SearchableSavedTableViewsFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder scopeId(SearchableIDFilterInput searchableIDFilterInput) {
            this.scopeId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder showMetricsInApp(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.showMetricsInApp = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder showMetricsOnDashboard(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.showMetricsOnDashboard = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder sortModel(SearchableStringFilterInput searchableStringFilterInput) {
            this.sortModel = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder tableName(SearchableStringFilterInput searchableStringFilterInput) {
            this.tableName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder viewName(SearchableStringFilterInput searchableStringFilterInput) {
            this.viewName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableSavedTableViewsFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableBooleanFilterInput> input5, Input<SearchableBooleanFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableBooleanFilterInput> input15, Input<SearchableBooleanFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableBooleanFilterInput> input18, Input<SearchableBooleanFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<List<SearchableSavedTableViewsFilterInput>> input23, Input<List<SearchableSavedTableViewsFilterInput>> input24, Input<SearchableSavedTableViewsFilterInput> input25) {
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
        this.scopeId = input11;
        this.forUserIds = input12;
        this.forTeamIds = input13;
        this.forAuthorizations = input14;
        this.isMetrics = input15;
        this.isOnlyMetrics = input16;
        this.dbFilterModel = input17;
        this.showMetricsOnDashboard = input18;
        this.showMetricsInApp = input19;
        this.addedToAppHomeOn = input20;
        this.createdAt = input21;
        this.updatedAt = input22;
        this.and = input23;
        this.or = input24;
        this.not = input25;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableStringFilterInput addedToAppHomeOn() {
        return this.addedToAppHomeOn.value;
    }

    public List<SearchableSavedTableViewsFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput columnState() {
        return this.columnState.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput dbFilterModel() {
        return this.dbFilterModel.value;
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

    public SearchableStringFilterInput hiddenColumnms() {
        return this.hiddenColumnms.value;
    }

    public SearchableBooleanFilterInput includeAll() {
        return this.includeAll.value;
    }

    public SearchableBooleanFilterInput isMetrics() {
        return this.isMetrics.value;
    }

    public SearchableBooleanFilterInput isOnlyMetrics() {
        return this.isOnlyMetrics.value;
    }

    public SearchableBooleanFilterInput isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableSavedTableViewsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableSavedTableViewsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableSavedTableViewsFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableSavedTableViewsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableSavedTableViewsFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableSavedTableViewsFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.tableName.defined) {
                    inputFieldWriter.writeObject("tableName", SearchableSavedTableViewsFilterInput.this.tableName.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.tableName.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.viewName.defined) {
                    inputFieldWriter.writeObject("viewName", SearchableSavedTableViewsFilterInput.this.viewName.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.viewName.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeObject("isSystemCreated", SearchableSavedTableViewsFilterInput.this.isSystemCreated.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedTableViewsFilterInput.this.isSystemCreated.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.includeAll.defined) {
                    inputFieldWriter.writeObject("includeAll", SearchableSavedTableViewsFilterInput.this.includeAll.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedTableViewsFilterInput.this.includeAll.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.filterModel.defined) {
                    inputFieldWriter.writeObject("filterModel", SearchableSavedTableViewsFilterInput.this.filterModel.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.filterModel.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.sortModel.defined) {
                    inputFieldWriter.writeObject("sortModel", SearchableSavedTableViewsFilterInput.this.sortModel.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.sortModel.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.columnState.defined) {
                    inputFieldWriter.writeObject("columnState", SearchableSavedTableViewsFilterInput.this.columnState.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.columnState.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.hiddenColumnms.defined) {
                    inputFieldWriter.writeObject("hiddenColumnms", SearchableSavedTableViewsFilterInput.this.hiddenColumnms.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.hiddenColumnms.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", SearchableSavedTableViewsFilterInput.this.scopeId.value != 0 ? ((SearchableIDFilterInput) SearchableSavedTableViewsFilterInput.this.scopeId.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.forUserIds.defined) {
                    inputFieldWriter.writeObject("forUserIds", SearchableSavedTableViewsFilterInput.this.forUserIds.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.forUserIds.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeObject("forTeamIds", SearchableSavedTableViewsFilterInput.this.forTeamIds.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.forTeamIds.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeObject("forAuthorizations", SearchableSavedTableViewsFilterInput.this.forAuthorizations.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.forAuthorizations.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.isMetrics.defined) {
                    inputFieldWriter.writeObject("isMetrics", SearchableSavedTableViewsFilterInput.this.isMetrics.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedTableViewsFilterInput.this.isMetrics.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.isOnlyMetrics.defined) {
                    inputFieldWriter.writeObject("isOnlyMetrics", SearchableSavedTableViewsFilterInput.this.isOnlyMetrics.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedTableViewsFilterInput.this.isOnlyMetrics.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.dbFilterModel.defined) {
                    inputFieldWriter.writeObject("dbFilterModel", SearchableSavedTableViewsFilterInput.this.dbFilterModel.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.dbFilterModel.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.showMetricsOnDashboard.defined) {
                    inputFieldWriter.writeObject("showMetricsOnDashboard", SearchableSavedTableViewsFilterInput.this.showMetricsOnDashboard.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedTableViewsFilterInput.this.showMetricsOnDashboard.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.showMetricsInApp.defined) {
                    inputFieldWriter.writeObject("showMetricsInApp", SearchableSavedTableViewsFilterInput.this.showMetricsInApp.value != 0 ? ((SearchableBooleanFilterInput) SearchableSavedTableViewsFilterInput.this.showMetricsInApp.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.addedToAppHomeOn.defined) {
                    inputFieldWriter.writeObject("addedToAppHomeOn", SearchableSavedTableViewsFilterInput.this.addedToAppHomeOn.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.addedToAppHomeOn.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableSavedTableViewsFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableSavedTableViewsFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableSavedTableViewsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableSavedTableViewsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableSavedTableViewsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableSavedTableViewsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableSavedTableViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableSavedTableViewsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableSavedTableViewsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableSavedTableViewsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableSavedTableViewsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableSavedTableViewsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableSavedTableViewsFilterInput.this.not.value != 0 ? ((SearchableSavedTableViewsFilterInput) SearchableSavedTableViewsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableSavedTableViewsFilterInput not() {
        return this.not.value;
    }

    public List<SearchableSavedTableViewsFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableIDFilterInput scopeId() {
        return this.scopeId.value;
    }

    public SearchableBooleanFilterInput showMetricsInApp() {
        return this.showMetricsInApp.value;
    }

    public SearchableBooleanFilterInput showMetricsOnDashboard() {
        return this.showMetricsOnDashboard.value;
    }

    public SearchableStringFilterInput sortModel() {
        return this.sortModel.value;
    }

    public SearchableStringFilterInput tableName() {
        return this.tableName.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput viewName() {
        return this.viewName.value;
    }
}
