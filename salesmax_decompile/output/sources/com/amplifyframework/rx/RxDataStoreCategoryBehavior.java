package com.amplifyframework.rx;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.query.ObserveQueryOptions;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
public interface RxDataStoreCategoryBehavior {
    xk3 clear();

    <T extends Model> xk3 delete(T t);

    <T extends Model> xk3 delete(T t, QueryPredicate queryPredicate);

    <T extends Model> xk3 delete(Class<T> cls, QueryPredicate queryPredicate);

    x6c observe();

    <T extends Model> x6c observe(Class<T> cls);

    <T extends Model> x6c observe(Class<T> cls, QueryPredicate queryPredicate);

    <T extends Model> x6c observe(Class<T> cls, String str);

    <T extends Model> x6c observeQuery(Class<T> cls, ObserveQueryOptions observeQueryOptions);

    <T extends Model> x6c query(Class<T> cls);

    <T extends Model> x6c query(Class<T> cls, QueryOptions queryOptions);

    <T extends Model> x6c query(Class<T> cls, QueryPredicate queryPredicate);

    <T extends Model> xk3 save(T t);

    <T extends Model> xk3 save(T t, QueryPredicate queryPredicate);

    xk3 start();

    xk3 stop();
}
