package com.amplifyframework.kotlin.datastore;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.query.ObserveQueryOptions;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4564c;
import qw.a0;
import uw.InterfaceC7559c;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface DataStore {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object delete$default(DataStore dataStore, Model model, QueryPredicate queryPredicate, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            queryPredicate = QueryPredicates.all();
            AbstractC4154l.m8922e(queryPredicate, "all(...)");
        }
        return dataStore.delete((DataStore) model, queryPredicate, (InterfaceC7559c<? super a0>) interfaceC7559c);
    }

    static /* synthetic */ Object observe$default(DataStore dataStore, InterfaceC4564c interfaceC4564c, QueryPredicate queryPredicate, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
        }
        if ((i10 & 2) != 0) {
            queryPredicate = QueryPredicates.all();
            AbstractC4154l.m8922e(queryPredicate, "all(...)");
        }
        return dataStore.observe(interfaceC4564c, queryPredicate, (InterfaceC7559c<? super InterfaceC8209j>) interfaceC7559c);
    }

    static /* synthetic */ InterfaceC8209j query$default(DataStore dataStore, InterfaceC4564c interfaceC4564c, QueryOptions queryOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            queryOptions = Where.matchesAll();
            AbstractC4154l.m8922e(queryOptions, "matchesAll(...)");
        }
        return dataStore.query(interfaceC4564c, queryOptions);
    }

    static /* synthetic */ Object save$default(DataStore dataStore, Model model, QueryPredicate queryPredicate, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
        }
        if ((i10 & 2) != 0) {
            queryPredicate = QueryPredicates.all();
            AbstractC4154l.m8922e(queryPredicate, "all(...)");
        }
        return dataStore.save(model, queryPredicate, interfaceC7559c);
    }

    Object clear(InterfaceC7559c<? super a0> interfaceC7559c);

    <T extends Model> Object delete(T t7, QueryPredicate queryPredicate, InterfaceC7559c<? super a0> interfaceC7559c);

    <T extends Model> Object delete(InterfaceC4564c interfaceC4564c, QueryPredicate queryPredicate, InterfaceC7559c<? super a0> interfaceC7559c);

    <T extends Model> Object observe(InterfaceC4564c interfaceC4564c, QueryPredicate queryPredicate, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c);

    <T extends Model> Object observe(InterfaceC4564c interfaceC4564c, String str, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c);

    Object observe(InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c);

    <T extends Model> Object observeQuery(InterfaceC4564c interfaceC4564c, ObserveQueryOptions observeQueryOptions, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c);

    <T extends Model> InterfaceC8209j query(InterfaceC4564c interfaceC4564c, QueryOptions queryOptions);

    <T extends Model> Object save(T t7, QueryPredicate queryPredicate, InterfaceC7559c<? super a0> interfaceC7559c);

    Object start(InterfaceC7559c<? super a0> interfaceC7559c);

    Object stop(InterfaceC7559c<? super a0> interfaceC7559c);

    static /* synthetic */ Object delete$default(DataStore dataStore, InterfaceC4564c interfaceC4564c, QueryPredicate queryPredicate, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            queryPredicate = QueryPredicates.all();
            AbstractC4154l.m8922e(queryPredicate, "all(...)");
        }
        return dataStore.delete(interfaceC4564c, queryPredicate, (InterfaceC7559c<? super a0>) interfaceC7559c);
    }
}
