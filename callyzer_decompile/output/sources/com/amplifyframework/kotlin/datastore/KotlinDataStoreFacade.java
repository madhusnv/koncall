package com.amplifyframework.kotlin.datastore;

import android.annotation.SuppressLint;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.query.ObserveQueryOptions;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.datastore.DataStoreCategoryBehavior;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.DataStoreQuerySnapshot;
import com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade;
import dx.AbstractC1851a;
import ex.InterfaceC2141e;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4564c;
import og.od;
import pg.n6;
import pg.p6;
import pg.q6;
import qw.a0;
import uw.C7565i;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7818t;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.C8202c;
import wx.InterfaceC8209j;
import wx.c1;
import wx.t0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinDataStoreFacade implements DataStore {
    private final DataStoreCategoryBehavior delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Observation<T> {
        private final t0 changes;
        private final t0 completions;
        private final t0 failures;
        private final t0 starts;

        public Observation() {
            this(null, null, null, null, 15, null);
        }

        public final t0 getChanges$core_kotlin_release() {
            return this.changes;
        }

        public final t0 getCompletions$core_kotlin_release() {
            return this.completions;
        }

        public final t0 getFailures$core_kotlin_release() {
            return this.failures;
        }

        public final t0 getStarts$core_kotlin_release() {
            return this.starts;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object waitForStart$core_kotlin_release(uw.InterfaceC7559c<? super wx.InterfaceC8209j> r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$1
                if (r0 == 0) goto L13
                r0 = r9
                com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$1 r0 = (com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$1 r0 = new com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$1
                r0.<init>(r8, r9)
            L18:
                java.lang.Object r9 = r0.result
                vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L31
                if (r2 != r5) goto L29
                og.od.m10798c(r9)
                goto L55
            L29:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L31:
                og.od.m10798c(r9)
                wx.t0 r9 = r8.starts
                wx.t0 r2 = r8.failures
                wx.t0[] r6 = new wx.t0[r4]
                r6[r3] = r9
                r6[r5] = r2
                f9.e r9 = new f9.e
                r9.<init>(r4, r6)
                wx.j r9 = wx.c1.m15387r(r9)
                com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$$inlined$map$1 r2 = new com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$$inlined$map$1
                r2.<init>()
                r0.label = r5
                java.lang.Object r9 = wx.c1.m15385p(r2, r0)
                if (r9 != r1) goto L55
                return r1
            L55:
                com.amplifyframework.core.async.Cancelable r9 = (com.amplifyframework.core.async.Cancelable) r9
                wx.t0 r0 = r8.changes
                wx.t0 r1 = r8.failures
                wx.t0 r2 = r8.completions
                r6 = 3
                wx.t0[] r7 = new wx.t0[r6]
                r7[r3] = r0
                r7[r5] = r1
                r7[r4] = r2
                f9.e r0 = new f9.e
                r0.<init>(r4, r7)
                wx.j r0 = wx.c1.m15387r(r0)
                com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$2 r1 = new com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$2
                r2 = 0
                r1.<init>(r2)
                wx.t r3 = new wx.t
                r3.<init>(r0, r1, r6)
                com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$$inlined$map$2 r0 = new com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$$inlined$map$2
                r0.<init>()
                com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$4 r1 = new com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$4
                r1.<init>(r9, r2)
                wx.r r9 = new wx.r
                r9.<init>(r0, r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade.Observation.waitForStart$core_kotlin_release(uw.c):java.lang.Object");
        }

        public Observation(t0 starts, t0 changes, t0 failures, t0 completions) {
            AbstractC4154l.m8923f(starts, "starts");
            AbstractC4154l.m8923f(changes, "changes");
            AbstractC4154l.m8923f(failures, "failures");
            AbstractC4154l.m8923f(completions, "completions");
            this.starts = starts;
            this.changes = changes;
            this.failures = failures;
            this.completions = completions;
        }

        public /* synthetic */ Observation(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var, (i10 & 2) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var2, (i10 & 4) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var3, (i10 & 8) != 0 ? c1.m15371b(1, 0, null, 6) : t0Var4);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$query$1", m15344f = "KotlinDataStoreFacade.kt", m15345l = {93}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$query$1 */
    public static final class C12041 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ InterfaceC4564c $itemClass;
        final /* synthetic */ QueryOptions $options;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12041(InterfaceC4564c interfaceC4564c, QueryOptions queryOptions, InterfaceC7559c<? super C12041> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$itemClass = interfaceC4564c;
            this.$options = queryOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC7819u interfaceC7819u, Iterator it) {
            while (it.hasNext()) {
                p6.m11817d(interfaceC7819u, it.next());
            }
            ((C7818t) interfaceC7819u).k0(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(InterfaceC7819u interfaceC7819u, DataStoreException dataStoreException) {
            ((C7818t) interfaceC7819u).k0(dataStoreException);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C12041 c12041 = KotlinDataStoreFacade.this.new C12041(this.$itemClass, this.$options, interfaceC7559c);
            c12041.L$0 = obj;
            return c12041;
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            final InterfaceC7819u interfaceC7819u = (InterfaceC7819u) this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                final int i11 = 0;
                final int i12 = 1;
                KotlinDataStoreFacade.this.delegate.query(AbstractC1851a.m5483b(this.$itemClass), this.$options, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.c
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Object obj2) {
                        switch (i11) {
                            case 0:
                                KotlinDataStoreFacade.C12041.invokeSuspend$lambda$0(interfaceC7819u, (Iterator) obj2);
                                break;
                            default:
                                KotlinDataStoreFacade.C12041.invokeSuspend$lambda$1(interfaceC7819u, (DataStoreException) obj2);
                                break;
                        }
                    }
                }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.c
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Object obj2) {
                        switch (i12) {
                            case 0:
                                KotlinDataStoreFacade.C12041.invokeSuspend$lambda$0(interfaceC7819u, (Iterator) obj2);
                                break;
                            default:
                                KotlinDataStoreFacade.C12041.invokeSuspend$lambda$1(interfaceC7819u, (DataStoreException) obj2);
                                break;
                        }
                    }
                });
                C1208d c1208d = new C1208d();
                this.L$0 = null;
                this.label = 1;
                if (q6.m11829a(interfaceC7819u, c1208d, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7819u interfaceC7819u, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12041) create(interfaceC7819u, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinDataStoreFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$10(Observation observation) {
        observation.getCompletions$core_kotlin_release().mo15352b(a0.f30746a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$11(Observation observation, Cancelable it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getStarts$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$12(Observation observation, DataStoreItemChange it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getChanges$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$13(Observation observation, DataStoreException it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getFailures$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$14(Observation observation) {
        observation.getCompletions$core_kotlin_release().mo15352b(a0.f30746a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$3(Observation observation, Cancelable it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getStarts$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$4(Observation observation, DataStoreItemChange it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getChanges$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$5(Observation observation, DataStoreException it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getFailures$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$6(Observation observation) {
        observation.getCompletions$core_kotlin_release().mo15352b(a0.f30746a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$7(Observation observation, Cancelable it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getStarts$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$8(Observation observation, DataStoreItemChange it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getChanges$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$9(Observation observation, DataStoreException it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getFailures$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeQuery$lambda$15(Observation observation, Cancelable it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getStarts$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeQuery$lambda$16(Observation observation, DataStoreQuerySnapshot it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getChanges$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeQuery$lambda$17(Observation observation, DataStoreException it) {
        AbstractC4154l.m8923f(it, "it");
        observation.getFailures$core_kotlin_release().mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeQuery$lambda$18(Observation observation) {
        observation.getCompletions$core_kotlin_release().mo15352b(a0.f30746a);
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public Object clear(InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.clear(new Action() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$clear$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$clear$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> Object delete(T t7, QueryPredicate queryPredicate, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.delete((DataStoreCategoryBehavior) t7, queryPredicate, (Consumer<DataStoreItemChange<DataStoreCategoryBehavior>>) new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$delete$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreItemChange<T> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$delete$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public Object observe(InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c) {
        Observation observation = new Observation(null, null, null, null, 15, null);
        this.delegate.observe(new C1205a(observation, 2), new C1205a(observation, 3), new C1205a(observation, 4), new C1206b(observation, 1));
        return observation.waitForStart$core_kotlin_release(interfaceC7559c);
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> Object observeQuery(InterfaceC4564c interfaceC4564c, ObserveQueryOptions observeQueryOptions, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c) {
        Observation observation = new Observation(null, null, null, null, 15, null);
        this.delegate.observeQuery(AbstractC1851a.m5483b(interfaceC4564c), observeQueryOptions, new C1205a(observation, 7), new C1205a(observation, 8), new C1205a(observation, 9), new C1206b(observation, 3));
        return observation.waitForStart$core_kotlin_release(interfaceC7559c);
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> InterfaceC8209j query(InterfaceC4564c itemClass, QueryOptions options) {
        AbstractC4154l.m8923f(itemClass, "itemClass");
        AbstractC4154l.m8923f(options, "options");
        return new C8202c(new C12041(itemClass, options, null), C7565i.f36440a, -2, EnumC7799a.SUSPEND);
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> Object save(T t7, QueryPredicate queryPredicate, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.save(t7, queryPredicate, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$save$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreItemChange<T> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$save$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public Object start(InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.start(new Action() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$start$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$start$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    @SuppressLint({"ImplicitSamInstance"})
    public Object stop(InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.stop(new Action() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$stop$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$stop$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    public KotlinDataStoreFacade(DataStoreCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinDataStoreFacade(DataStoreCategoryBehavior DataStore, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            DataStore = Amplify.DataStore;
            AbstractC4154l.m8922e(DataStore, "DataStore");
        }
        this(DataStore);
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> Object observe(InterfaceC4564c interfaceC4564c, String str, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c) {
        Observation observation = new Observation(null, null, null, null, 15, null);
        this.delegate.observe(AbstractC1851a.m5483b(interfaceC4564c), str, new C1205a(observation, 0), new C1205a(observation, 5), new C1205a(observation, 6), new C1206b(observation, 2));
        return observation.waitForStart$core_kotlin_release(interfaceC7559c);
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> Object delete(InterfaceC4564c interfaceC4564c, QueryPredicate queryPredicate, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.delete(AbstractC1851a.m5483b(interfaceC4564c), queryPredicate, new Action() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$delete$4$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$delete$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(DataStoreException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.datastore.DataStore
    public <T extends Model> Object observe(InterfaceC4564c interfaceC4564c, QueryPredicate queryPredicate, InterfaceC7559c<? super InterfaceC8209j> interfaceC7559c) {
        Observation observation = new Observation(null, null, null, null, 15, null);
        this.delegate.observe(AbstractC1851a.m5483b(interfaceC4564c), queryPredicate, new C1205a(observation, 10), new C1205a(observation, 11), new C1205a(observation, 1), new C1206b(observation, 0));
        return observation.waitForStart$core_kotlin_release(interfaceC7559c);
    }
}
