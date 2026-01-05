package com.amplifyframework.kotlin.api;

import com.amplifyframework.api.ApiCategoryBehavior;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.ApiOperation;
import com.amplifyframework.api.graphql.GraphQLOperation;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.rest.RestOperation;
import com.amplifyframework.api.rest.RestOptions;
import com.amplifyframework.api.rest.RestResponse;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.async.NoOpCancelable;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import qw.a0;
import tx.C7251k;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8209j;
import wx.c1;
import wx.t0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinApiFacade implements Api {
    private final ApiCategoryBehavior delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Subscription<T> {
        private Cancelable cancelable;
        private final t0 completions;
        private final t0 data;
        private final t0 failures;
        private final t0 starts;

        public Subscription() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object awaitStart$core_kotlin_release(uw.InterfaceC7559c<? super wx.InterfaceC8209j> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$1
                if (r0 == 0) goto L13
                r0 = r8
                com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$1 r0 = (com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$1 r0 = new com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$1
                r0.<init>(r7, r8)
            L18:
                java.lang.Object r8 = r0.result
                vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L31
                if (r2 != r5) goto L29
                og.od.m10798c(r8)
                goto L55
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L31:
                og.od.m10798c(r8)
                wx.t0 r8 = r7.starts
                wx.t0 r2 = r7.failures
                wx.t0[] r6 = new wx.t0[r4]
                r6[r3] = r8
                r6[r5] = r2
                f9.e r8 = new f9.e
                r8.<init>(r4, r6)
                wx.j r8 = wx.c1.m15387r(r8)
                com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$$inlined$map$1 r2 = new com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$$inlined$map$1
                r2.<init>()
                r0.label = r5
                java.lang.Object r8 = wx.c1.m15385p(r2, r0)
                if (r8 != r1) goto L55
                return r1
            L55:
                wx.t0 r8 = r7.data
                wx.t0 r0 = r7.failures
                wx.t0 r1 = r7.completions
                r2 = 3
                wx.t0[] r6 = new wx.t0[r2]
                r6[r3] = r8
                r6[r5] = r0
                r6[r4] = r1
                f9.e r8 = new f9.e
                r8.<init>(r4, r6)
                wx.j r8 = wx.c1.m15387r(r8)
                com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$3 r0 = new com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$3
                r1 = 0
                r0.<init>(r1)
                wx.t r3 = new wx.t
                r3.<init>(r8, r0, r2)
                com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$$inlined$map$2 r8 = new com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$$inlined$map$2
                r8.<init>()
                com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$5 r0 = new com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$5
                r0.<init>(r7, r1)
                wx.r r1 = new wx.r
                r1.<init>(r8, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.api.KotlinApiFacade.Subscription.awaitStart$core_kotlin_release(uw.c):java.lang.Object");
        }

        public final Cancelable getCancelable$core_kotlin_release() {
            return this.cancelable;
        }

        public final t0 getCompletions$core_kotlin_release() {
            return this.completions;
        }

        public final t0 getData$core_kotlin_release() {
            return this.data;
        }

        public final t0 getFailures$core_kotlin_release() {
            return this.failures;
        }

        public final t0 getStarts$core_kotlin_release() {
            return this.starts;
        }

        public final void setCancelable$core_kotlin_release(Cancelable cancelable) {
            AbstractC4154l.m8923f(cancelable, "<set-?>");
            this.cancelable = cancelable;
        }

        public Subscription(t0 starts, t0 data, t0 failures, t0 completions, Cancelable cancelable) {
            AbstractC4154l.m8923f(starts, "starts");
            AbstractC4154l.m8923f(data, "data");
            AbstractC4154l.m8923f(failures, "failures");
            AbstractC4154l.m8923f(completions, "completions");
            AbstractC4154l.m8923f(cancelable, "cancelable");
            this.starts = starts;
            this.data = data;
            this.failures = failures;
            this.completions = completions;
            this.cancelable = cancelable;
        }

        public /* synthetic */ Subscription(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, Cancelable cancelable, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var, (i10 & 2) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var2, (i10 & 4) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var3, (i10 & 8) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var4, (i10 & 16) != 0 ? new NoOpCancelable() : cancelable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinApiFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$2(Subscription subscription, String it) {
        AbstractC4154l.m8923f(it, "it");
        subscription.getStarts$core_kotlin_release().mo15352b(a0.f30746a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$3(Subscription subscription, GraphQLResponse it) {
        AbstractC4154l.m8923f(it, "it");
        subscription.getData$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$4(Subscription subscription, ApiException it) {
        AbstractC4154l.m8923f(it, "it");
        subscription.getFailures$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$5(Subscription subscription) {
        subscription.getCompletions$core_kotlin_release().mo15352b(a0.f30746a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$6(Subscription subscription, String it) {
        AbstractC4154l.m8923f(it, "it");
        subscription.getStarts$core_kotlin_release().mo15352b(a0.f30746a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$7(Subscription subscription, GraphQLResponse it) {
        AbstractC4154l.m8923f(it, "it");
        subscription.getData$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$8(Subscription subscription, ApiException it) {
        AbstractC4154l.m8923f(it, "it");
        subscription.getFailures$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$9(Subscription subscription) {
        subscription.getCompletions$core_kotlin_release().mo15352b(a0.f30746a);
    }

    @Override // com.amplifyframework.kotlin.api.Rest
    public Object delete(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final RestOperation restOperationDelete = str != null ? this.delegate.delete(str, restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$delete$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$delete$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.delete(restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$delete$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$delete$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$delete$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                RestOperation restOperation = restOperationDelete;
                if (restOperation != null) {
                    restOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.Rest
    public Object get(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final RestOperation restOperation = str != null ? this.delegate.get(str, restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$get$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$get$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.get(restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$get$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$get$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$get$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                RestOperation restOperation2 = restOperation;
                if (restOperation2 != null) {
                    restOperation2.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.Rest
    public Object head(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final RestOperation restOperationHead = str != null ? this.delegate.head(str, restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$head$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$head$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.head(restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$head$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$head$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$head$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                RestOperation restOperation = restOperationHead;
                if (restOperation != null) {
                    restOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.GraphQL
    public <T> Object mutate(GraphQLRequest<T> graphQLRequest, String str, InterfaceC7559c<? super GraphQLResponse<T>> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final GraphQLOperation<T> graphQLOperationMutate = str != null ? this.delegate.mutate(str, graphQLRequest, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$mutate$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(GraphQLResponse<T> it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$mutate$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.mutate(graphQLRequest, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$mutate$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(GraphQLResponse<T> it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$mutate$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$mutate$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                ApiOperation apiOperation = graphQLOperationMutate;
                if (apiOperation != null) {
                    apiOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.Rest
    public Object patch(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final RestOperation restOperationPatch = str != null ? this.delegate.patch(str, restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$patch$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$patch$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.patch(restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$patch$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$patch$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$patch$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                RestOperation restOperation = restOperationPatch;
                if (restOperation != null) {
                    restOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.Rest
    public Object post(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final RestOperation restOperationPost = str != null ? this.delegate.post(str, restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$post$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$post$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.post(restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$post$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$post$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$post$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                RestOperation restOperation = restOperationPost;
                if (restOperation != null) {
                    restOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.Rest
    public Object put(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final RestOperation restOperationPut = str != null ? this.delegate.put(str, restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$put$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$put$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.put(restOptions, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$put$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(RestResponse it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$put$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$put$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                RestOperation restOperation = restOperationPut;
                if (restOperation != null) {
                    restOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.GraphQL
    public <R> Object query(GraphQLRequest<R> graphQLRequest, String str, InterfaceC7559c<? super GraphQLResponse<R>> interfaceC7559c) {
        final C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        final GraphQLOperation<R> graphQLOperationQuery = str != null ? this.delegate.query(str, graphQLRequest, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$query$2$operation$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(GraphQLResponse<R> it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$query$2$operation$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        }) : this.delegate.query(graphQLRequest, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$query$2$operation$3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(GraphQLResponse<R> it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$query$2$operation$4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(ApiException it) {
                AbstractC4154l.m8923f(it, "it");
                c7251k.resumeWith(od.m10796a(it));
            }
        });
        c7251k.m13542t(new InterfaceC2139c() { // from class: com.amplifyframework.kotlin.api.KotlinApiFacade$query$2$1
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return a0.f30746a;
            }

            public final void invoke(Throwable th2) {
                ApiOperation apiOperation = graphQLOperationQuery;
                if (apiOperation != null) {
                    apiOperation.cancel();
                }
            }
        });
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    @Override // com.amplifyframework.kotlin.api.GraphQL
    public <T> Object subscribe(GraphQLRequest<T> graphQLRequest, String str, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c) {
        GraphQLOperation graphQLOperationSubscribe;
        final Subscription subscription = new Subscription(null, null, null, null, null, 31, null);
        if (str != null) {
            ApiCategoryBehavior apiCategoryBehavior = this.delegate;
            final int i10 = 0;
            Consumer<String> consumer = new Consumer() { // from class: com.amplifyframework.kotlin.api.a
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    switch (i10) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$2(subscription, (String) obj);
                            break;
                        case 1:
                            KotlinApiFacade.subscribe$lambda$3(subscription, (GraphQLResponse) obj);
                            break;
                        case 2:
                            KotlinApiFacade.subscribe$lambda$4(subscription, (ApiException) obj);
                            break;
                        case 3:
                            KotlinApiFacade.subscribe$lambda$6(subscription, (String) obj);
                            break;
                        case 4:
                            KotlinApiFacade.subscribe$lambda$7(subscription, (GraphQLResponse) obj);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$8(subscription, (ApiException) obj);
                            break;
                    }
                }
            };
            final int i11 = 1;
            Consumer consumer2 = new Consumer() { // from class: com.amplifyframework.kotlin.api.a
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    switch (i11) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$2(subscription, (String) obj);
                            break;
                        case 1:
                            KotlinApiFacade.subscribe$lambda$3(subscription, (GraphQLResponse) obj);
                            break;
                        case 2:
                            KotlinApiFacade.subscribe$lambda$4(subscription, (ApiException) obj);
                            break;
                        case 3:
                            KotlinApiFacade.subscribe$lambda$6(subscription, (String) obj);
                            break;
                        case 4:
                            KotlinApiFacade.subscribe$lambda$7(subscription, (GraphQLResponse) obj);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$8(subscription, (ApiException) obj);
                            break;
                    }
                }
            };
            final int i12 = 2;
            Consumer<ApiException> consumer3 = new Consumer() { // from class: com.amplifyframework.kotlin.api.a
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    switch (i12) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$2(subscription, (String) obj);
                            break;
                        case 1:
                            KotlinApiFacade.subscribe$lambda$3(subscription, (GraphQLResponse) obj);
                            break;
                        case 2:
                            KotlinApiFacade.subscribe$lambda$4(subscription, (ApiException) obj);
                            break;
                        case 3:
                            KotlinApiFacade.subscribe$lambda$6(subscription, (String) obj);
                            break;
                        case 4:
                            KotlinApiFacade.subscribe$lambda$7(subscription, (GraphQLResponse) obj);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$8(subscription, (ApiException) obj);
                            break;
                    }
                }
            };
            final int i13 = 0;
            graphQLOperationSubscribe = apiCategoryBehavior.subscribe(str, graphQLRequest, consumer, consumer2, consumer3, new Action() { // from class: com.amplifyframework.kotlin.api.b
                @Override // com.amplifyframework.core.Action
                public final void call() {
                    switch (i13) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$5(subscription);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$9(subscription);
                            break;
                    }
                }
            });
        } else {
            ApiCategoryBehavior apiCategoryBehavior2 = this.delegate;
            final int i14 = 3;
            Consumer<String> consumer4 = new Consumer() { // from class: com.amplifyframework.kotlin.api.a
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    switch (i14) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$2(subscription, (String) obj);
                            break;
                        case 1:
                            KotlinApiFacade.subscribe$lambda$3(subscription, (GraphQLResponse) obj);
                            break;
                        case 2:
                            KotlinApiFacade.subscribe$lambda$4(subscription, (ApiException) obj);
                            break;
                        case 3:
                            KotlinApiFacade.subscribe$lambda$6(subscription, (String) obj);
                            break;
                        case 4:
                            KotlinApiFacade.subscribe$lambda$7(subscription, (GraphQLResponse) obj);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$8(subscription, (ApiException) obj);
                            break;
                    }
                }
            };
            final int i15 = 4;
            Consumer consumer5 = new Consumer() { // from class: com.amplifyframework.kotlin.api.a
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    switch (i15) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$2(subscription, (String) obj);
                            break;
                        case 1:
                            KotlinApiFacade.subscribe$lambda$3(subscription, (GraphQLResponse) obj);
                            break;
                        case 2:
                            KotlinApiFacade.subscribe$lambda$4(subscription, (ApiException) obj);
                            break;
                        case 3:
                            KotlinApiFacade.subscribe$lambda$6(subscription, (String) obj);
                            break;
                        case 4:
                            KotlinApiFacade.subscribe$lambda$7(subscription, (GraphQLResponse) obj);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$8(subscription, (ApiException) obj);
                            break;
                    }
                }
            };
            final int i16 = 5;
            Consumer<ApiException> consumer6 = new Consumer() { // from class: com.amplifyframework.kotlin.api.a
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    switch (i16) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$2(subscription, (String) obj);
                            break;
                        case 1:
                            KotlinApiFacade.subscribe$lambda$3(subscription, (GraphQLResponse) obj);
                            break;
                        case 2:
                            KotlinApiFacade.subscribe$lambda$4(subscription, (ApiException) obj);
                            break;
                        case 3:
                            KotlinApiFacade.subscribe$lambda$6(subscription, (String) obj);
                            break;
                        case 4:
                            KotlinApiFacade.subscribe$lambda$7(subscription, (GraphQLResponse) obj);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$8(subscription, (ApiException) obj);
                            break;
                    }
                }
            };
            final int i17 = 1;
            graphQLOperationSubscribe = apiCategoryBehavior2.subscribe(graphQLRequest, consumer4, consumer5, consumer6, new Action() { // from class: com.amplifyframework.kotlin.api.b
                @Override // com.amplifyframework.core.Action
                public final void call() {
                    switch (i17) {
                        case 0:
                            KotlinApiFacade.subscribe$lambda$5(subscription);
                            break;
                        default:
                            KotlinApiFacade.subscribe$lambda$9(subscription);
                            break;
                    }
                }
            });
        }
        if (graphQLOperationSubscribe != null) {
            subscription.setCancelable$core_kotlin_release(graphQLOperationSubscribe);
        }
        return subscription.awaitStart$core_kotlin_release(interfaceC7559c);
    }

    public KotlinApiFacade(ApiCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinApiFacade(ApiCategoryBehavior API, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            API = Amplify.API;
            AbstractC4154l.m8922e(API, "API");
        }
        this(API);
    }
}
