package com.amplifyframework.datastore.storage.sqlite;

import com.amplifyframework.util.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
final class SqlCommand {
    private final List<Object> bindings;
    private final String sqlStatement;
    private final String tableName;

    public SqlCommand(String str, String str2) {
        this(str, str2, Collections.emptyList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SqlCommand.class != obj.getClass()) {
            return false;
        }
        SqlCommand sqlCommand = (SqlCommand) obj;
        if (s6c.m47909a(this.tableName, sqlCommand.tableName) && s6c.m47909a(this.sqlStatement, sqlCommand.sqlStatement)) {
            return s6c.m47909a(this.bindings, sqlCommand.bindings);
        }
        return false;
    }

    public List<Object> getBindings() {
        return Immutable.of(this.bindings);
    }

    public String[] getBindingsAsArray() {
        if (!hasBindings()) {
            return null;
        }
        int size = this.bindings.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = this.bindings.get(i).toString();
        }
        return (String[]) Arrays.copyOf(strArr, size);
    }

    public boolean hasBindings() {
        List<Object> list = this.bindings;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public int hashCode() {
        String str = this.tableName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sqlStatement;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.bindings;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String sqlStatement() {
        return this.sqlStatement;
    }

    public String tableName() {
        return this.tableName;
    }

    public String toString() {
        return "SqlCommand{tableName='" + this.tableName + "', sqlStatement='" + this.sqlStatement + "', bindings=" + this.bindings + '}';
    }

    public SqlCommand(String str, String str2, List<Object> list) {
        Objects.requireNonNull(str);
        this.tableName = str;
        Objects.requireNonNull(str2);
        this.sqlStatement = str2;
        Objects.requireNonNull(list);
        this.bindings = list;
    }
}
