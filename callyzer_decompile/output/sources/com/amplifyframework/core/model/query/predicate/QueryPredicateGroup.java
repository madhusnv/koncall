package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class QueryPredicateGroup implements QueryPredicate {
    private final List<QueryPredicate> predicates;
    private final Type type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.core.model.query.predicate.QueryPredicateGroup$1 */
    public static /* synthetic */ class C11851 {

        /* renamed from: $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type */
        static final /* synthetic */ int[] f5877x1b013e40;

        static {
            int[] iArr = new int[Type.values().length];
            f5877x1b013e40 = iArr;
            try {
                iArr[Type.OR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5877x1b013e40[Type.AND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5877x1b013e40[Type.NOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Type {
        AND,
        OR,
        NOT
    }

    @InternalAmplifyApi
    public QueryPredicateGroup(Type type, List<QueryPredicate> list) {
        this.type = type;
        this.predicates = new ArrayList(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("A predicate group must contain at least one predicate element");
        }
    }

    public static QueryPredicate andOf(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(Type.AND, Arrays.asList(queryPredicate));
    }

    public static QueryPredicateGroup not(QueryPredicateGroup queryPredicateGroup) {
        return new QueryPredicateGroup(Type.NOT, Collections.singletonList(queryPredicateGroup));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && QueryPredicateGroup.class == obj.getClass()) {
            QueryPredicateGroup queryPredicateGroup = (QueryPredicateGroup) obj;
            if (Objects.equals(type(), queryPredicateGroup.type()) && Objects.equals(predicates(), queryPredicateGroup.predicates())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        int i10 = C11851.f5877x1b013e40[this.type.ordinal()];
        if (i10 == 1) {
            Iterator<QueryPredicate> it = this.predicates.iterator();
            while (it.hasNext()) {
                if (it.next().evaluate(obj)) {
                    return true;
                }
            }
            return false;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            return !this.predicates.get(0).evaluate(obj);
        }
        Iterator<QueryPredicate> it2 = this.predicates.iterator();
        while (it2.hasNext()) {
            if (!it2.next().evaluate(obj)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(type(), predicates());
    }

    public List<QueryPredicate> predicates() {
        return this.predicates;
    }

    public String toString() {
        return "QueryPredicateGroup { type: " + type() + ", predicates: " + predicates() + " }";
    }

    public Type type() {
        return this.type;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup and(QueryPredicate queryPredicate) {
        Type type = Type.AND;
        if (!type.equals(this.type)) {
            return new QueryPredicateGroup(type, Arrays.asList(this, queryPredicate));
        }
        this.predicates.add(queryPredicate);
        return this;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup or(QueryPredicate queryPredicate) {
        Type type = Type.OR;
        if (!type.equals(this.type)) {
            return new QueryPredicateGroup(type, Arrays.asList(this, queryPredicate));
        }
        this.predicates.add(queryPredicate);
        return this;
    }
}
