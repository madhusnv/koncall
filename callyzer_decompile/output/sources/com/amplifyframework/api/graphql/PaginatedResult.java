package com.amplifyframework.api.graphql;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import le.C4449a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PaginatedResult<T> implements Iterable<T> {
    private final Iterable<T> items;
    private final GraphQLRequest<PaginatedResult<T>> requestForNextResult;

    public PaginatedResult(Iterable<T> iterable, GraphQLRequest<PaginatedResult<T>> graphQLRequest) {
        this.requestForNextResult = graphQLRequest;
        this.items = (Iterable) StreamSupport.stream(iterable.spliterator(), false).filter(new C4449a()).collect(Collectors.toList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PaginatedResult.class == obj.getClass()) {
            PaginatedResult paginatedResult = (PaginatedResult) obj;
            if (Objects.equals(this.requestForNextResult, paginatedResult.requestForNextResult) && Objects.equals(this.items, paginatedResult.items)) {
                return true;
            }
        }
        return false;
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
        return Objects.hash(this.requestForNextResult, this.items);
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
