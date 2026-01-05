package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class QueryPredicateGroup implements QueryPredicate {
    private final List<QueryPredicate> predicates;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58098type;

    /* renamed from: com.amplifyframework.core.model.query.predicate.QueryPredicateGroup$1 */
    public static /* synthetic */ class C105531 {

        /* renamed from: $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryPredicateGroup$Type */
        static final /* synthetic */ int[] f10641x1b013e40;

        static {
            int[] iArr = new int[Type.values().length];
            f10641x1b013e40 = iArr;
            try {
                iArr[Type.OR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10641x1b013e40[Type.AND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10641x1b013e40[Type.NOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Type {
        AND,
        OR,
        NOT
    }

    @InternalAmplifyApi
    public QueryPredicateGroup(Type type2, List<QueryPredicate> list) {
        this.f58098type = type2;
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
        if (obj == null || QueryPredicateGroup.class != obj.getClass()) {
            return false;
        }
        QueryPredicateGroup queryPredicateGroup = (QueryPredicateGroup) obj;
        return s6c.m47909a(type(), queryPredicateGroup.type()) && s6c.m47909a(predicates(), queryPredicateGroup.predicates());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        int i = C105531.f10641x1b013e40[this.f58098type.ordinal()];
        if (i == 1) {
            Iterator<QueryPredicate> it = this.predicates.iterator();
            while (it.hasNext()) {
                if (it.next().evaluate(obj)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 2) {
            if (i != 3) {
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
        return s6c.m47910b(type(), predicates());
    }

    public List<QueryPredicate> predicates() {
        return this.predicates;
    }

    public String toString() {
        return "QueryPredicateGroup { type: " + type() + ", predicates: " + predicates() + " }";
    }

    public Type type() {
        return this.f58098type;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup and(QueryPredicate queryPredicate) {
        Type type2 = Type.AND;
        if (!type2.equals(this.f58098type)) {
            return new QueryPredicateGroup(type2, Arrays.asList(this, queryPredicate));
        }
        this.predicates.add(queryPredicate);
        return this;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup or(QueryPredicate queryPredicate) {
        Type type2 = Type.OR;
        if (!type2.equals(this.f58098type)) {
            return new QueryPredicateGroup(type2, Arrays.asList(this, queryPredicate));
        }
        this.predicates.add(queryPredicate);
        return this;
    }
}
