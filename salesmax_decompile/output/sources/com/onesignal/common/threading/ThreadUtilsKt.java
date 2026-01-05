package com.onesignal.common.threading;

import com.onesignal.debug.internal.logging.Logging;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.eu5;
import p001o.flh;
import p001o.h84;
import p001o.jgg;
import p001o.jpa;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.pm1;
import p001o.qm1;
import p001o.sq8;
import p001o.uk7;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ThreadUtilsKt {

    @l75(m36647c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyBlocking$1", m36648f = "ThreadUtils.kt", m36649l = {33}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyBlocking$1 */
    public static final class C115871 extends jgg implements nl7 {
        final /* synthetic */ xk7 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115871(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.$block = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C115871(this.$block, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                xk7 xk7Var = this.$block;
                this.label = 1;
                if (xk7Var.invoke(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C115871) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1 */
    public static final class C115881 extends kf9 implements uk7 {
        final /* synthetic */ xk7 $block;

        @l75(m36647c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1", m36648f = "ThreadUtils.kt", m36649l = {47}, m36650m = "invokeSuspend")
        /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ xk7 $block;
            int label;

            @l75(m36647c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1$1", m36648f = "ThreadUtils.kt", m36649l = {48}, m36650m = "invokeSuspend")
            /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C195811 extends jgg implements nl7 {
                final /* synthetic */ xk7 $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C195811(xk7 xk7Var, n64 n64Var) {
                    super(2, n64Var);
                    this.$block = xk7Var;
                }

                @Override // p001o.vb1
                public final n64 create(Object obj, n64 n64Var) {
                    return new C195811(this.$block, n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    Object objM51918f = uq8.m51918f();
                    int i = this.label;
                    if (i == 0) {
                        wre.m54934b(obj);
                        xk7 xk7Var = this.$block;
                        this.label = 1;
                        if (xk7Var.invoke(this) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }

                @Override // p001o.nl7
                public final Object invoke(h84 h84Var, n64 n64Var) {
                    return ((C195811) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(xk7 xk7Var, n64 n64Var) {
                super(2, n64Var);
                this.$block = xk7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.$block, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    jpa jpaVarM25612c = eu5.m25612c();
                    C195811 c195811 = new C195811(this.$block, null);
                    this.label = 1;
                    if (pm1.m43867g(jpaVarM25612c, c195811, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115881(xk7 xk7Var) {
            super(0);
            this.$block = xk7Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68741invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68741invoke() {
            try {
                qm1.m45641b(null, new AnonymousClass1(this.$block, null), 1, null);
            } catch (Exception e) {
                Logging.error("Exception on thread with switch to main", e);
            }
        }
    }

    /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$1 */
    public static final class C115891 extends kf9 implements uk7 {
        final /* synthetic */ xk7 $block;

        @l75(m36647c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$1$1", m36648f = "ThreadUtils.kt", m36649l = {TypeReference.METHOD_REFERENCE}, m36650m = "invokeSuspend")
        /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ xk7 $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(xk7 xk7Var, n64 n64Var) {
                super(2, n64Var);
                this.$block = xk7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.$block, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    xk7 xk7Var = this.$block;
                    this.label = 1;
                    if (xk7Var.invoke(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115891(xk7 xk7Var) {
            super(0);
            this.$block = xk7Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68742invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68742invoke() {
            try {
                qm1.m45641b(null, new AnonymousClass1(this.$block, null), 1, null);
            } catch (Exception e) {
                Logging.error("Exception on thread", e);
            }
        }
    }

    /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$2 */
    public static final class C115902 extends kf9 implements uk7 {
        final /* synthetic */ xk7 $block;
        final /* synthetic */ String $name;

        @l75(m36647c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$2$1", m36648f = "ThreadUtils.kt", m36649l = {Opcodes.DUP2}, m36650m = "invokeSuspend")
        /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnThread$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ xk7 $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(xk7 xk7Var, n64 n64Var) {
                super(2, n64Var);
                this.$block = xk7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.$block, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    xk7 xk7Var = this.$block;
                    this.label = 1;
                    if (xk7Var.invoke(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115902(String str, xk7 xk7Var) {
            super(0);
            this.$name = str;
            this.$block = xk7Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68743invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68743invoke() {
            try {
                qm1.m45641b(null, new AnonymousClass1(this.$block, null), 1, null);
            } catch (Exception e) {
                Logging.error("Exception on thread '" + this.$name + '\'', e);
            }
        }
    }

    public static final void suspendifyBlocking(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        qm1.m45641b(null, new C115871(xk7Var, null), 1, null);
    }

    public static final void suspendifyOnMain(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        flh.m27031b(false, false, null, null, 0, new C115881(xk7Var), 31, null);
    }

    public static final void suspendifyOnThread(int i, xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        flh.m27031b(false, false, null, null, i, new C115891(xk7Var), 15, null);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        suspendifyOnThread(i, xk7Var);
    }

    public static final void suspendifyOnThread(String str, int i, xk7 xk7Var) {
        sq8.m48649h(str, "name");
        sq8.m48649h(xk7Var, "block");
        flh.m27031b(false, false, null, str, i, new C115902(str, xk7Var), 7, null);
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        suspendifyOnThread(str, i, xk7Var);
    }
}
