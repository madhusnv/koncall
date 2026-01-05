package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateSavedTableViewsInput implements InputType {
    private final String accountId;
    private final Input<String> addedToAppHomeOn;
    private final Input<String> columnState;
    private final Input<String> createdAt;
    private final Input<String> dbFilterModel;
    private final Input<String> filterModel;
    private final Input<List<String>> forAuthorizations;
    private final Input<List<String>> forTeamIds;
    private final Input<List<String>> forUserIds;
    private final Input<String> hiddenColumnms;
    private final Input<Boolean> includeAll;
    private final Input<Boolean> isMetrics;
    private final Input<Boolean> isOnlyMetrics;
    private final Input<Boolean> isSystemCreated;
    private final String ownerId;
    private final Input<String> scopeId;
    private final Input<ScopeLevel> scopeLevel;
    private final Input<Boolean> showMetricsInApp;
    private final Input<Boolean> showMetricsOnDashboard;
    private final Input<String> sortModel;
    private final String tableName;
    private final Input<String> updatedAt;
    private final String viewName;

    public static final class Builder {
        private String accountId;
        private String ownerId;
        private String tableName;
        private String viewName;
        private Input<Boolean> isSystemCreated = Input.absent();
        private Input<Boolean> includeAll = Input.absent();
        private Input<String> filterModel = Input.absent();
        private Input<String> sortModel = Input.absent();
        private Input<String> columnState = Input.absent();
        private Input<String> hiddenColumnms = Input.absent();
        private Input<ScopeLevel> scopeLevel = Input.absent();
        private Input<String> scopeId = Input.absent();
        private Input<List<String>> forUserIds = Input.absent();
        private Input<List<String>> forTeamIds = Input.absent();
        private Input<List<String>> forAuthorizations = Input.absent();
        private Input<Boolean> isMetrics = Input.absent();
        private Input<Boolean> isOnlyMetrics = Input.absent();
        private Input<String> dbFilterModel = Input.absent();
        private Input<Boolean> showMetricsOnDashboard = Input.absent();
        private Input<Boolean> showMetricsInApp = Input.absent();
        private Input<String> addedToAppHomeOn = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder addedToAppHomeOn(String str) {
            this.addedToAppHomeOn = Input.fromNullable(str);
            return this;
        }

        public CreateSavedTableViewsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.tableName, "tableName == null");
            Utils.checkNotNull(this.viewName, "viewName == null");
            return new CreateSavedTableViewsInput(this.accountId, this.ownerId, this.tableName, this.viewName, this.isSystemCreated, this.includeAll, this.filterModel, this.sortModel, this.columnState, this.hiddenColumnms, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.isMetrics, this.isOnlyMetrics, this.dbFilterModel, this.showMetricsOnDashboard, this.showMetricsInApp, this.addedToAppHomeOn, this.createdAt, this.updatedAt);
        }

        public Builder columnState(String str) {
            this.columnState = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dbFilterModel(String str) {
            this.dbFilterModel = Input.fromNullable(str);
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

        public Builder hiddenColumnms(String str) {
            this.hiddenColumnms = Input.fromNullable(str);
            return this;
        }

        public Builder includeAll(Boolean bool) {
            this.includeAll = Input.fromNullable(bool);
            return this;
        }

        public Builder isMetrics(Boolean bool) {
            this.isMetrics = Input.fromNullable(bool);
            return this;
        }

        public Builder isOnlyMetrics(Boolean bool) {
            this.isOnlyMetrics = Input.fromNullable(bool);
            return this;
        }

        public Builder isSystemCreated(Boolean bool) {
            this.isSystemCreated = Input.fromNullable(bool);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
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

        public Builder showMetricsInApp(Boolean bool) {
            this.showMetricsInApp = Input.fromNullable(bool);
            return this;
        }

        public Builder showMetricsOnDashboard(Boolean bool) {
            this.showMetricsOnDashboard = Input.fromNullable(bool);
            return this;
        }

        public Builder sortModel(String str) {
            this.sortModel = Input.fromNullable(str);
            return this;
        }

        public Builder tableName(String str) {
            this.tableName = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder viewName(String str) {
            this.viewName = str;
            return this;
        }
    }

    public CreateSavedTableViewsInput(String str, String str2, String str3, String str4, Input<Boolean> input, Input<Boolean> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<ScopeLevel> input7, Input<String> input8, Input<List<String>> input9, Input<List<String>> input10, Input<List<String>> input11, Input<Boolean> input12, Input<Boolean> input13, Input<String> input14, Input<Boolean> input15, Input<Boolean> input16, Input<String> input17, Input<String> input18, Input<String> input19) {
        this.accountId = str;
        this.ownerId = str2;
        this.tableName = str3;
        this.viewName = str4;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String addedToAppHomeOn() {
        return this.addedToAppHomeOn.value;
    }

    public String columnState() {
        return this.columnState.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dbFilterModel() {
        return this.dbFilterModel.value;
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

    public String hiddenColumnms() {
        return this.hiddenColumnms.value;
    }

    public Boolean includeAll() {
        return this.includeAll.value;
    }

    public Boolean isMetrics() {
        return this.isMetrics.value;
    }

    public Boolean isOnlyMetrics() {
        return this.isOnlyMetrics.value;
    }

    public Boolean isSystemCreated() {
        return this.isSystemCreated.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateSavedTableViewsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", CreateSavedTableViewsInput.this.accountId);
                inputFieldWriter.writeString("ownerId", CreateSavedTableViewsInput.this.ownerId);
                inputFieldWriter.writeString("tableName", CreateSavedTableViewsInput.this.tableName);
                inputFieldWriter.writeString("viewName", CreateSavedTableViewsInput.this.viewName);
                if (CreateSavedTableViewsInput.this.isSystemCreated.defined) {
                    inputFieldWriter.writeBoolean("isSystemCreated", (Boolean) CreateSavedTableViewsInput.this.isSystemCreated.value);
                }
                if (CreateSavedTableViewsInput.this.includeAll.defined) {
                    inputFieldWriter.writeBoolean("includeAll", (Boolean) CreateSavedTableViewsInput.this.includeAll.value);
                }
                if (CreateSavedTableViewsInput.this.filterModel.defined) {
                    inputFieldWriter.writeString("filterModel", (String) CreateSavedTableViewsInput.this.filterModel.value);
                }
                if (CreateSavedTableViewsInput.this.sortModel.defined) {
                    inputFieldWriter.writeString("sortModel", (String) CreateSavedTableViewsInput.this.sortModel.value);
                }
                if (CreateSavedTableViewsInput.this.columnState.defined) {
                    inputFieldWriter.writeString("columnState", (String) CreateSavedTableViewsInput.this.columnState.value);
                }
                if (CreateSavedTableViewsInput.this.hiddenColumnms.defined) {
                    inputFieldWriter.writeString("hiddenColumnms", (String) CreateSavedTableViewsInput.this.hiddenColumnms.value);
                }
                if (CreateSavedTableViewsInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeString("scopeLevel", CreateSavedTableViewsInput.this.scopeLevel.value != 0 ? ((ScopeLevel) CreateSavedTableViewsInput.this.scopeLevel.value).name() : null);
                }
                if (CreateSavedTableViewsInput.this.scopeId.defined) {
                    inputFieldWriter.writeString("scopeId", (String) CreateSavedTableViewsInput.this.scopeId.value);
                }
                if (CreateSavedTableViewsInput.this.forUserIds.defined) {
                    inputFieldWriter.writeList("forUserIds", CreateSavedTableViewsInput.this.forUserIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateSavedTableViewsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateSavedTableViewsInput.this.forUserIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateSavedTableViewsInput.this.forTeamIds.defined) {
                    inputFieldWriter.writeList("forTeamIds", CreateSavedTableViewsInput.this.forTeamIds.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateSavedTableViewsInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateSavedTableViewsInput.this.forTeamIds.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateSavedTableViewsInput.this.forAuthorizations.defined) {
                    inputFieldWriter.writeList("forAuthorizations", CreateSavedTableViewsInput.this.forAuthorizations.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateSavedTableViewsInput.1.3
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateSavedTableViewsInput.this.forAuthorizations.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateSavedTableViewsInput.this.isMetrics.defined) {
                    inputFieldWriter.writeBoolean("isMetrics", (Boolean) CreateSavedTableViewsInput.this.isMetrics.value);
                }
                if (CreateSavedTableViewsInput.this.isOnlyMetrics.defined) {
                    inputFieldWriter.writeBoolean("isOnlyMetrics", (Boolean) CreateSavedTableViewsInput.this.isOnlyMetrics.value);
                }
                if (CreateSavedTableViewsInput.this.dbFilterModel.defined) {
                    inputFieldWriter.writeString("dbFilterModel", (String) CreateSavedTableViewsInput.this.dbFilterModel.value);
                }
                if (CreateSavedTableViewsInput.this.showMetricsOnDashboard.defined) {
                    inputFieldWriter.writeBoolean("showMetricsOnDashboard", (Boolean) CreateSavedTableViewsInput.this.showMetricsOnDashboard.value);
                }
                if (CreateSavedTableViewsInput.this.showMetricsInApp.defined) {
                    inputFieldWriter.writeBoolean("showMetricsInApp", (Boolean) CreateSavedTableViewsInput.this.showMetricsInApp.value);
                }
                if (CreateSavedTableViewsInput.this.addedToAppHomeOn.defined) {
                    inputFieldWriter.writeString("addedToAppHomeOn", (String) CreateSavedTableViewsInput.this.addedToAppHomeOn.value);
                }
                if (CreateSavedTableViewsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateSavedTableViewsInput.this.createdAt.value);
                }
                if (CreateSavedTableViewsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateSavedTableViewsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String scopeId() {
        return this.scopeId.value;
    }

    public ScopeLevel scopeLevel() {
        return this.scopeLevel.value;
    }

    public Boolean showMetricsInApp() {
        return this.showMetricsInApp.value;
    }

    public Boolean showMetricsOnDashboard() {
        return this.showMetricsOnDashboard.value;
    }

    public String sortModel() {
        return this.sortModel.value;
    }

    public String tableName() {
        return this.tableName;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String viewName() {
        return this.viewName;
    }
}
