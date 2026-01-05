package com.amplifyframework.rx;

import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.ApiCategoryBehavior;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.rest.RestOptions;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.rx.RxAdapters;
import com.amplifyframework.rx.RxOperations;
import p001o.wtf;
import p001o.x6c;

/* loaded from: classes5.dex */
final class RxApiBinding implements RxApiCategoryBehavior {
    private final ApiCategoryBehavior api;

    public RxApiBinding() {
        this(Amplify.API);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$delete$12(RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.delete(restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$delete$13(String str, RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.delete(str, restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$get$6(RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.get(restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$get$7(String str, RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.get(str, restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$head$14(RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.head(restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$head$15(String str, RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.head(str, restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$mutate$2(GraphQLRequest graphQLRequest, Consumer consumer, Consumer consumer2) {
        return this.api.mutate(graphQLRequest, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$mutate$3(String str, GraphQLRequest graphQLRequest, Consumer consumer, Consumer consumer2) {
        return this.api.mutate(str, graphQLRequest, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$patch$16(RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.patch(restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$patch$17(String str, RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.patch(str, restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$post$10(RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.post(restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$post$11(String str, RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.post(str, restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$put$8(RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.put(restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$put$9(String str, RestOptions restOptions, Consumer consumer, Consumer consumer2) {
        return this.api.put(str, restOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$query$0(GraphQLRequest graphQLRequest, Consumer consumer, Consumer consumer2) {
        return this.api.query(graphQLRequest, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$query$1(String str, GraphQLRequest graphQLRequest, Consumer consumer, Consumer consumer2) {
        return this.api.query(str, graphQLRequest, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$subscribe$4(GraphQLRequest graphQLRequest, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        return this.api.subscribe(graphQLRequest, consumer, consumer2, consumer3, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$subscribe$5(String str, GraphQLRequest graphQLRequest, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        return this.api.subscribe(str, graphQLRequest, consumer, consumer2, consumer3, action);
    }

    private <T> x6c toObservable(RxAdapters.CancelableBehaviors.StreamEmitter<String, T, ApiException> streamEmitter) {
        return RxAdapters.CancelableBehaviors.toObservable(streamEmitter);
    }

    private <T> wtf toSingle(RxAdapters.CancelableBehaviors.ResultEmitter<T, ApiException> resultEmitter) {
        return RxAdapters.CancelableBehaviors.toSingle(resultEmitter);
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf delete(final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.n
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10987a.lambda$delete$12(restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf get(final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.m
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10974a.lambda$get$6(restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf head(final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.u
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11058a.lambda$head$14(restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGraphQlBehavior
    public <T> wtf mutate(final GraphQLRequest<T> graphQLRequest) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.x
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11093a.lambda$mutate$2(graphQLRequest, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf patch(final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.v
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11069a.lambda$patch$16(restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf post(final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.q
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11019a.lambda$post$10(restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf put(final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.s
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11037a.lambda$put$8(restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGraphQlBehavior
    public <T> wtf query(final GraphQLRequest<T> graphQLRequest) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.l
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10958a.lambda$query$0(graphQLRequest, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGraphQlBehavior
    public <T> RxOperations.RxSubscriptionOperation<GraphQLResponse<T>> subscribe(final GraphQLRequest<T> graphQLRequest) {
        return new RxOperations.RxSubscriptionOperation<>(new RxAdapters.CancelableBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.t
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.StreamEmitter
            public final Cancelable streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                return this.f11049a.lambda$subscribe$4(graphQLRequest, consumer, consumer2, consumer3, action);
            }
        });
    }

    public RxApiBinding(ApiCategory apiCategory) {
        this.api = apiCategory;
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf delete(final String str, final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.h
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10895a.lambda$delete$13(str, restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf get(final String str, final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.i
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10910a.lambda$get$7(str, restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf head(final String str, final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.w
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11079a.lambda$head$15(str, restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGraphQlBehavior
    public <T> wtf mutate(final String str, final GraphQLRequest<T> graphQLRequest) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.p
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11004a.lambda$mutate$3(str, graphQLRequest, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf patch(final String str, final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.j
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10924a.lambda$patch$17(str, restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf post(final String str, final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.g
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10880a.lambda$post$11(str, restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxRestBehavior
    public wtf put(final String str, final RestOptions restOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.o
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10996a.lambda$put$9(str, restOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGraphQlBehavior
    public <T> wtf query(final String str, final GraphQLRequest<T> graphQLRequest) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.y
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11106a.lambda$query$1(str, graphQLRequest, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxGraphQlBehavior
    public <T> RxOperations.RxSubscriptionOperation<GraphQLResponse<T>> subscribe(final String str, final GraphQLRequest<T> graphQLRequest) {
        return new RxOperations.RxSubscriptionOperation<>(new RxAdapters.CancelableBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.k
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.StreamEmitter
            public final Cancelable streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                return this.f10944a.lambda$subscribe$5(str, graphQLRequest, consumer, consumer2, consumer3, action);
            }
        });
    }
}
