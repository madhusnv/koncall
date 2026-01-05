package com.amplifyframework.datastore.storage.sqlite;

import com.amplifyframework.core.model.query.QuerySortOrder;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.google.api.client.googleapis.notifications.ResourceStates;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 com.amplifyframework.datastore.storage.sqlite.SqlKeyword, still in use, count: 1, list:
  (r0v3 com.amplifyframework.datastore.storage.sqlite.SqlKeyword) from 0x0193: INVOKE 
  (r11v21 java.util.HashMap)
  (wrap:com.amplifyframework.core.model.query.predicate.QueryOperator$Type:0x0191: SGET  A[WRAPPED] (LINE:402) com.amplifyframework.core.model.query.predicate.QueryOperator.Type.EQUAL com.amplifyframework.core.model.query.predicate.QueryOperator$Type)
  (r0v3 com.amplifyframework.datastore.storage.sqlite.SqlKeyword)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:404)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class SqlKeyword {
    DELIMITER(" "),
    SEPARATOR(", "),
    VARIABLE("?"),
    EQUAL("="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    GREATER_OR_EQUAL(">="),
    LESS_THAN("<"),
    LESS_OR_EQUAL("<="),
    AND("AND"),
    OR("OR"),
    NOT("NOT"),
    BETWEEN("BETWEEN"),
    IN("IN"),
    LIKE("LIKE"),
    EXISTS(ResourceStates.EXISTS),
    SELECT("SELECT"),
    FROM("FROM"),
    WHERE("WHERE"),
    JOIN("JOIN"),
    INNER_JOIN("INNER JOIN"),
    OUTER_JOIN("OUTER JOIN"),
    LEFT_JOIN("LEFT JOIN"),
    ON("ON"),
    AS("AS"),
    OFFSET("OFFSET"),
    LIMIT("LIMIT"),
    ORDER_BY("ORDER BY"),
    ASC("ASC"),
    DESC("DESC"),
    IS_NULL("IS NULL"),
    IS_NOT_NULL("IS NOT NULL");

    private static final Map<QueryOperator.Type, SqlKeyword> QUERY_OPERATOR_TO_SQL;
    private static final Map<QueryPredicateGroup.Type, SqlKeyword> QUERY_PREDICATE_GROUP_TO_SQL;
    private static final Map<QuerySortOrder, SqlKeyword> QUERY_SORT_BY_TO_SQL;
    private final String stringValue;

    static {
        HashMap map = new HashMap();
        QUERY_OPERATOR_TO_SQL = map;
        HashMap map2 = new HashMap();
        QUERY_PREDICATE_GROUP_TO_SQL = map2;
        HashMap map3 = new HashMap();
        QUERY_SORT_BY_TO_SQL = map3;
        map.put(QueryOperator.Type.EQUAL, new SqlKeyword("="));
        map.put(QueryOperator.Type.NOT_EQUAL, new SqlKeyword("!="));
        map.put(QueryOperator.Type.GREATER_THAN, new SqlKeyword(">"));
        map.put(QueryOperator.Type.GREATER_OR_EQUAL, new SqlKeyword(">="));
        map.put(QueryOperator.Type.LESS_THAN, new SqlKeyword("<"));
        map.put(QueryOperator.Type.LESS_OR_EQUAL, new SqlKeyword("<="));
        map2.put(QueryPredicateGroup.Type.AND, new SqlKeyword("AND"));
        map2.put(QueryPredicateGroup.Type.OR, new SqlKeyword("OR"));
        map2.put(QueryPredicateGroup.Type.NOT, new SqlKeyword("NOT"));
        map3.put(QuerySortOrder.ASCENDING, new SqlKeyword("ASC"));
        map3.put(QuerySortOrder.DESCENDING, new SqlKeyword("DESC"));
    }

    private SqlKeyword(String str) {
        this.stringValue = str;
    }

    public static SqlKeyword fromQueryOperator(QueryOperator.Type type2) {
        Map<QueryOperator.Type, SqlKeyword> map = QUERY_OPERATOR_TO_SQL;
        Objects.requireNonNull(type2);
        SqlKeyword sqlKeyword = map.get(type2);
        if (sqlKeyword != null) {
            return sqlKeyword;
        }
        throw new IllegalArgumentException("No SQL keyword mapping defined for query operator type = " + type2.toString());
    }

    public static SqlKeyword fromQueryPredicateGroup(QueryPredicateGroup.Type type2) {
        Map<QueryPredicateGroup.Type, SqlKeyword> map = QUERY_PREDICATE_GROUP_TO_SQL;
        Objects.requireNonNull(type2);
        SqlKeyword sqlKeyword = map.get(type2);
        if (sqlKeyword != null) {
            return sqlKeyword;
        }
        throw new IllegalArgumentException("No SQL keyword mapping defined for query predicate group type = " + type2.toString());
    }

    public static SqlKeyword fromQuerySortOrder(QuerySortOrder querySortOrder) {
        Map<QuerySortOrder, SqlKeyword> map = QUERY_SORT_BY_TO_SQL;
        Objects.requireNonNull(querySortOrder);
        SqlKeyword sqlKeyword = map.get(querySortOrder);
        if (sqlKeyword != null) {
            return sqlKeyword;
        }
        throw new IllegalArgumentException("No SQL keyword mapping defined for query sort order type = " + querySortOrder.toString());
    }

    public static SqlKeyword valueOf(String str) {
        return (SqlKeyword) Enum.valueOf(SqlKeyword.class, str);
    }

    public static SqlKeyword[] values() {
        return (SqlKeyword[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }
}
