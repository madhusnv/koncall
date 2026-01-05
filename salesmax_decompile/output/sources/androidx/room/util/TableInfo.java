package androidx.room.util;

import androidx.room.ColumnInfo;
import androidx.room.Index;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p001o.e9g;
import p001o.f9g;
import p001o.id5;
import p001o.leg;
import p001o.nif;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    public static final Companion Companion = new Companion(null);
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final TableInfo read(leg legVar, String str) {
            sq8.m48649h(legVar, "database");
            sq8.m48649h(str, "tableName");
            return TableInfoKt.readTableInfo(legVar, str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreatedFrom {
    }

    public static final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String str, String str2, String str3, List<String> list, List<String> list2) {
            sq8.m48649h(str, "referenceTable");
            sq8.m48649h(str2, "onDelete");
            sq8.m48649h(str3, "onUpdate");
            sq8.m48649h(list, "columnNames");
            sq8.m48649h(list2, "referenceColumnNames");
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (sq8.m48644c(this.referenceTable, foreignKey.referenceTable) && sq8.m48644c(this.onDelete, foreignKey.onDelete) && sq8.m48644c(this.onUpdate, foreignKey.onUpdate) && sq8.m48644c(this.columnNames, foreignKey.columnNames)) {
                return sq8.m48644c(this.referenceColumnNames, foreignKey.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        private final String from;
        private final int id;
        private final int sequence;
        private final String to;

        public ForeignKeyWithSequence(int i, int i2, String str, String str2) {
            sq8.m48649h(str, Constants.MessagePayloadKeys.FROM);
            sq8.m48649h(str2, "to");
            this.id = i;
            this.sequence = i2;
            this.from = str;
            this.to = str2;
        }

        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final String getTo() {
            return this.to;
        }

        @Override // java.lang.Comparable
        public int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
            sq8.m48649h(foreignKeyWithSequence, "other");
            int i = this.id - foreignKeyWithSequence.id;
            return i == 0 ? this.sequence - foreignKeyWithSequence.sequence : i;
        }
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set, Set<Index> set2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(map, "columns");
        sq8.m48649h(set, "foreignKeys");
        this.name = str;
        this.columns = map;
        this.foreignKeys = set;
        this.indices = set2;
    }

    public static final TableInfo read(leg legVar, String str) {
        return Companion.read(legVar, str);
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!sq8.m48644c(this.name, tableInfo.name) || !sq8.m48644c(this.columns, tableInfo.columns) || !sq8.m48644c(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return sq8.m48644c(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i, id5 id5Var) {
        this(str, map, set, (i & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set) {
        this(str, map, set, nif.m40664e());
        sq8.m48649h(str, "name");
        sq8.m48649h(map, "columns");
        sq8.m48649h(set, "foreignKeys");
    }

    public static final class Column {
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;

        /* renamed from: type, reason: collision with root package name */
        public final String f58057type;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            private final boolean containsSurroundingParenthesis(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                return i2 == 0;
            }

            public final boolean defaultValueEquals(String str, String str2) {
                sq8.m48649h(str, "current");
                if (sq8.m48644c(str, str2)) {
                    return true;
                }
                if (!containsSurroundingParenthesis(str)) {
                    return false;
                }
                String strSubstring = str.substring(1, str.length() - 1);
                sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return sq8.m48644c(f9g.Z0(strSubstring).toString(), str2);
            }
        }

        public Column(String str, String str2, boolean z, int i, String str3, int i2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "type");
            this.name = str;
            this.f58057type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.defaultValue = str3;
            this.createdFrom = i2;
            this.affinity = findAffinity(str2);
        }

        public static final boolean defaultValueEquals(String str, String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        @ColumnInfo.SQLiteTypeAffinity
        private final int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String upperCase = str.toUpperCase(locale);
            sq8.m48648g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (f9g.m26306P(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (f9g.m26306P(upperCase, "CHAR", false, 2, null) || f9g.m26306P(upperCase, "CLOB", false, 2, null) || f9g.m26306P(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (f9g.m26306P(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (f9g.m26306P(upperCase, "REAL", false, 2, null) || f9g.m26306P(upperCase, "FLOA", false, 2, null) || f9g.m26306P(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
        
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Column) || this.primaryKeyPosition != ((Column) obj).primaryKeyPosition) {
                return false;
            }
            Column column = (Column) obj;
            if (!sq8.m48644c(this.name, column.name) || this.notNull != column.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && column.createdFrom == 2 && (str2 = this.defaultValue) != null && !Companion.defaultValueEquals(str2, column.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && column.createdFrom == 1 && (str = column.defaultValue) != null && !Companion.defaultValueEquals(str, this.defaultValue)) {
                return false;
            }
            int i = this.createdFrom;
            if (i != 0 && i == column.createdFrom) {
                boolean z = (r1 = this.defaultValue) != null ? false : false;
                if (z) {
                    return false;
                }
            }
            return this.affinity == column.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.f58057type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = SQLiteCommandFactory.UNDEFINED;
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Column(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "type");
        }
    }

    public static final class Index {
        public static final Companion Companion = new Companion(null);
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public List<String> orders;
        public final boolean unique;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public Index(String str, boolean z, List<String> list, List<String> list2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(list, "columns");
            sq8.m48649h(list2, "orders");
            this.name = str;
            this.unique = z;
            this.columns = list;
            this.orders = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    list2.add(Index.Order.ASC.name());
                }
            }
            this.orders = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.unique == index.unique && sq8.m48644c(this.columns, index.columns) && sq8.m48644c(this.orders, index.orders)) {
                return e9g.m24597K(this.name, DEFAULT_PREFIX, false, 2, null) ? e9g.m24597K(index.name, DEFAULT_PREFIX, false, 2, null) : sq8.m48644c(this.name, index.name);
            }
            return false;
        }

        public int hashCode() {
            return ((((((e9g.m24597K(this.name, DEFAULT_PREFIX, false, 2, null) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }

        public Index(String str, boolean z, List<String> list) {
            sq8.m48649h(str, "name");
            sq8.m48649h(list, "columns");
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(Index.Order.ASC.name());
            }
            this(str, z, list, arrayList);
        }
    }
}
