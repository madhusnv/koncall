package com.amplifyframework.datastore.storage.sqlite.adapter;

import com.amplifyframework.core.model.PrimaryKey;
import com.amplifyframework.datastore.storage.sqlite.SQLiteDataType;
import com.amplifyframework.util.Wrap;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class SQLiteColumn {
    private static final String CUSTOM_ALIAS_DELIMITER = "_";
    private static final String SQLITE_NAME_DELIMITER = ".";
    private final SQLiteDataType dataType;
    private final String fieldName;
    private final boolean isNonNull;
    private final String name;
    private final String ownedField;
    private final String ownedType;
    private final String tableName;

    public static final class Builder {
        private SQLiteDataType dataType;
        private String fieldName;
        private boolean isNonNull = false;
        private String name;
        private String ownedField;
        private String ownedType;
        private String tableName;

        public SQLiteColumn build() {
            return new SQLiteColumn(this);
        }

        public Builder dataType(SQLiteDataType sQLiteDataType) {
            this.dataType = sQLiteDataType;
            return this;
        }

        public Builder fieldName(String str) {
            this.fieldName = str;
            return this;
        }

        public Builder isNonNull(boolean z) {
            this.isNonNull = z;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder ownerField(String str) {
            this.ownedField = str;
            return this;
        }

        public Builder ownerOf(String str) {
            this.ownedType = str;
            return this;
        }

        public Builder tableName(String str) {
            this.tableName = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SQLiteColumn.class != obj.getClass()) {
            return false;
        }
        SQLiteColumn sQLiteColumn = (SQLiteColumn) obj;
        return this.isNonNull == sQLiteColumn.isNonNull && s6c.m47909a(this.name, sQLiteColumn.name) && s6c.m47909a(this.fieldName, sQLiteColumn.fieldName) && s6c.m47909a(this.tableName, sQLiteColumn.tableName) && s6c.m47909a(this.ownedType, sQLiteColumn.ownedType) && this.dataType == sQLiteColumn.dataType;
    }

    public String getAliasedName() {
        return this.tableName + CUSTOM_ALIAS_DELIMITER + this.name;
    }

    public String getColumnType() {
        return this.dataType.getSqliteDataType();
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnedField() {
        return this.ownedField;
    }

    public String getOwnedType() {
        return this.ownedType;
    }

    public String getQuotedColumnName() {
        return Wrap.inBackticks(this.tableName) + SQLITE_NAME_DELIMITER + Wrap.inBackticks(this.name);
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return s6c.m47910b(this.name, this.fieldName, this.tableName, this.ownedType, Boolean.valueOf(this.isNonNull), this.dataType);
    }

    public boolean isForeignKey() {
        return this.ownedType != null;
    }

    public boolean isNonNull() {
        return this.isNonNull;
    }

    public boolean isPrimaryKey() {
        return PrimaryKey.matches(this.name);
    }

    public String toString() {
        return "SQLiteColumn{name='" + this.name + "', fieldName='" + this.fieldName + "', tableName='" + this.tableName + "', ownedType='" + this.ownedType + "', isNonNull=" + this.isNonNull + ", dataType=" + this.dataType + '}';
    }

    private SQLiteColumn(Builder builder) {
        this.name = builder.name;
        this.fieldName = builder.fieldName;
        this.tableName = builder.tableName;
        this.ownedType = builder.ownedType;
        this.isNonNull = builder.isNonNull;
        this.dataType = builder.dataType;
        this.ownedField = builder.ownedField;
    }
}
