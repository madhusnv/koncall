package com.amplifyframework.api.graphql;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class PaginatedResult<T> implements Iterable<T> {
    private final Iterable<T> items;
    private final GraphQLRequest<PaginatedResult<T>> requestForNextResult;

    public PaginatedResult(Iterable<T> iterable, GraphQLRequest<PaginatedResult<T>> graphQLRequest) {
        this.requestForNextResult = graphQLRequest;
        this.items = (Iterable) StreamSupport.stream(iterable.spliterator(), false).filter(new Predicate() { // from class: o.rqc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull(obj);
            }
        }).collect(Collectors.toList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaginatedResult.class != obj.getClass()) {
            return false;
        }
        PaginatedResult paginatedResult = (PaginatedResult) obj;
        return s6c.m47909a(this.requestForNextResult, paginatedResult.requestForNextResult) && s6c.m47909a(this.items, paginatedResult.items);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super T> consumer) {
        this.items.forEach(consumer);
    }

    public Iterable<T> getItems() {
        return this.items;
    }

    public GraphQLRequest<PaginatedResult<T>> getRequestForNextResult() {
        return this.requestForNextResult;
    }

    public boolean hasNextResult() {
        return this.requestForNextResult != null;
    }

    public int hashCode() {
        return s6c.m47910b(this.requestForNextResult, this.items);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    @Override // java.lang.Iterable
    public Spliterator<T> spliterator() {
        return this.items.spliterator();
    }

    public String toString() {
        return "PaginatedResult{requestForNextResult=" + this.requestForNextResult + ", items=" + this.items + '}';
    }
}
