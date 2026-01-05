package com.amplifyframework.datastore.storage.sqlite.adapter;

import android.annotation.SuppressLint;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.PrimaryKey;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.storage.sqlite.SQLiteDataType;
import com.amplifyframework.datastore.storage.sqlite.TypeConverter;
import com.amplifyframework.datastore.storage.sqlite.adapter.SQLiteColumn;
import com.amplifyframework.datastore.storage.sqlite.adapter.SQLiteTable;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class SQLiteTable {
    public static final String PRIMARY_KEY_FIELD_NAME = "@@primaryKey";
    private final Map<String, SQLiteColumn> columns;
    private final String name;
    private final List<String> primaryKeyColumns;
    private final List<SQLiteColumn> sortedColumns;

    /* renamed from: type, reason: collision with root package name */
    private final Model.Type f58110type;

    public static final class Builder {
        private final Map<String, SQLiteColumn> columns = new HashMap();
        private String name;
        private List<String> primaryKeyColumns;

        /* renamed from: type, reason: collision with root package name */
        private Model.Type f58111type;

        @SuppressLint({"SyntheticAccessor"})
        public SQLiteTable build() {
            return new SQLiteTable(this.name, Immutable.of(this.columns), this.primaryKeyColumns, this.f58111type);
        }

        public Builder columns(Map<String, SQLiteColumn> map) {
            Objects.requireNonNull(map);
            this.columns.clear();
            this.columns.putAll(map);
            return this;
        }

        public Builder name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public Builder primaryKeyColumns(List<String> list) {
            Objects.requireNonNull(list);
            this.primaryKeyColumns = list;
            return this;
        }

        public Builder type(Model.Type type2) {
            Objects.requireNonNull(type2);
            this.f58111type = type2;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SQLiteTable fromSchema(ModelSchema modelSchema) {
        Objects.requireNonNull(modelSchema);
        Map<String, ModelAssociation> associations = modelSchema.getAssociations();
        TreeMap treeMap = new TreeMap();
        if (modelSchema.getModelType() == Model.Type.USER && modelSchema.getPrimaryIndexFields().size() > 1) {
            treeMap.put(PRIMARY_KEY_FIELD_NAME, SQLiteColumn.builder().name(PRIMARY_KEY_FIELD_NAME).fieldName(PRIMARY_KEY_FIELD_NAME).tableName(modelSchema.getName()).ownerOf(null).isNonNull(true).dataType(SQLiteDataType.TEXT).build());
        }
        for (ModelField modelField : modelSchema.getFields().values()) {
            ModelAssociation modelAssociation = associations.get(modelField.getName());
            boolean z = modelAssociation != null;
            if (!z || modelAssociation.isOwner()) {
                treeMap.put(modelField.getName(), SQLiteColumn.builder().name(z ? getForeignKeyColumnName(modelSchema.getVersion(), modelField.getName(), modelAssociation) : modelField.getName()).fieldName(modelField.getName()).tableName(modelSchema.getName()).ownerOf(z ? modelAssociation.getAssociatedType() : null).ownerField(z ? modelField.getName() : null).isNonNull(modelField.isRequired()).dataType(sqlTypeFromModelField(modelField)).build());
            }
        }
        return builder().name(modelSchema.getName()).type(modelSchema.getModelType()).columns(treeMap).primaryKeyColumns(modelSchema.getPrimaryIndexFields()).build();
    }

    public static String getForeignKeyColumnName(int i, String str, ModelAssociation modelAssociation) {
        if (i == 0) {
            return modelAssociation.getTargetName();
        }
        if (modelAssociation.getTargetNames().length <= 1) {
            return modelAssociation.getTargetNames()[0];
        }
        return "@@" + str + "ForeignKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortedColumns$0(SQLiteColumn sQLiteColumn, SQLiteColumn sQLiteColumn2) {
        if (sQLiteColumn.isPrimaryKey()) {
            return -1;
        }
        if (sQLiteColumn2.isPrimaryKey()) {
            return 1;
        }
        if (sQLiteColumn.isForeignKey() && !sQLiteColumn2.isForeignKey()) {
            return 1;
        }
        if (sQLiteColumn.isForeignKey() || !sQLiteColumn2.isForeignKey()) {
            return sQLiteColumn.getName().compareTo(sQLiteColumn2.getName());
        }
        return -1;
    }

    private List<SQLiteColumn> sortedColumns() {
        if (this.columns == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList(this.columns.values());
        Collections.sort(linkedList, new Comparator() { // from class: o.rze
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SQLiteTable.lambda$sortedColumns$0((SQLiteColumn) obj, (SQLiteColumn) obj2);
            }
        });
        return linkedList;
    }

    private static SQLiteDataType sqlTypeFromModelField(ModelField modelField) {
        return TypeConverter.getSQLiteDataType(modelField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SQLiteTable.class != obj.getClass()) {
            return false;
        }
        SQLiteTable sQLiteTable = (SQLiteTable) obj;
        return s6c.m47909a(this.name, sQLiteTable.name) && s6c.m47909a(this.columns, sQLiteTable.columns) && s6c.m47909a(this.sortedColumns, sQLiteTable.sortedColumns);
    }

    public SQLiteColumn getColumn(String str) throws DataStoreException {
        Map<String, SQLiteColumn> map = this.columns;
        Objects.requireNonNull(str);
        SQLiteColumn sQLiteColumn = map.get(str);
        if (sQLiteColumn != null) {
            return sQLiteColumn;
        }
        throw new DataStoreException("Column with columnName " + str + " not found in " + this.name, "Sorry, we don’t have a recovery suggestion for this error.");
    }

    public Map<String, SQLiteColumn> getColumns() {
        return Immutable.of(this.columns);
    }

    public List<SQLiteColumn> getForeignKeys() {
        LinkedList linkedList = new LinkedList();
        for (SQLiteColumn sQLiteColumn : this.sortedColumns) {
            if (sQLiteColumn.isForeignKey()) {
                linkedList.add(sQLiteColumn);
            }
        }
        return Immutable.of(linkedList);
    }

    public String getName() {
        return this.name;
    }

    public SQLiteColumn getPrimaryKey() {
        for (SQLiteColumn sQLiteColumn : this.sortedColumns) {
            if (this.f58110type == Model.Type.USER) {
                if (this.primaryKeyColumns.size() > 1) {
                    if (sQLiteColumn.getName().equals(PRIMARY_KEY_FIELD_NAME)) {
                        return sQLiteColumn;
                    }
                } else if (this.primaryKeyColumns.size() == 1 && this.primaryKeyColumns.contains(sQLiteColumn.getName())) {
                    return sQLiteColumn;
                }
            }
            if (this.primaryKeyColumns.size() <= 1 && sQLiteColumn.isPrimaryKey()) {
                return sQLiteColumn;
            }
        }
        return null;
    }

    public String getPrimaryKeyColumnName() {
        return getPrimaryKey() == null ? PrimaryKey.fieldName() : getPrimaryKey().getQuotedColumnName();
    }

    public List<String> getPrimaryKeyColumns() {
        return this.primaryKeyColumns;
    }

    public List<SQLiteColumn> getSortedColumns() {
        return Immutable.of(this.sortedColumns);
    }

    public Model.Type getType() {
        return this.f58110type;
    }

    public int hashCode() {
        return s6c.m47910b(this.name, this.columns, this.sortedColumns);
    }

    public String toString() {
        return "SQLiteTable{name='" + this.name + "', columns=" + this.columns + ", sortedColumns=" + this.sortedColumns + '}';
    }

    private SQLiteTable(String str, Map<String, SQLiteColumn> map, List<String> list, Model.Type type2) {
        this.name = str;
        this.columns = map;
        this.f58110type = type2;
        this.sortedColumns = sortedColumns();
        this.primaryKeyColumns = list;
    }
}
