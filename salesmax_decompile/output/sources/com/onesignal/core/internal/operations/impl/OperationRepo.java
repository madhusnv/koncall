package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.threading.OSPrimaryCoroutineScope;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.GroupComparisonType;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.cl3;
import p001o.dh3;
import p001o.ege;
import p001o.el3;
import p001o.gge;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.o64;
import p001o.ob9;
import p001o.rm1;
import p001o.rmh;
import p001o.sq8;
import p001o.uq8;
import p001o.wkh;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class OperationRepo implements IOperationRepo, IStartableService {
    private final ConfigModelStore _configModelStore;
    private final NewRecordsState _newRecordState;
    private final OperationModelStore _operationModelStore;
    private final ITime _time;
    private h84 coroutineScope;
    private int enqueueIntoBucket;
    private final Map<String, IOperationExecutor> executorsMap;
    private final cl3 initialized;
    private boolean paused;
    private final List<OperationQueueItem> queue;
    private final WaiterWithValue<LoopWaiterMessage> retryWaiter;
    private final WaiterWithValue<LoopWaiterMessage> waiter;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExecutionResult.values().length];
            iArr[ExecutionResult.SUCCESS.ordinal()] = 1;
            iArr[ExecutionResult.FAIL_UNAUTHORIZED.ordinal()] = 2;
            iArr[ExecutionResult.FAIL_NORETRY.ordinal()] = 3;
            iArr[ExecutionResult.FAIL_CONFLICT.ordinal()] = 4;
            iArr[ExecutionResult.SUCCESS_STARTING_ONLY.ordinal()] = 5;
            iArr[ExecutionResult.FAIL_RETRY.ordinal()] = 6;
            iArr[ExecutionResult.FAIL_PAUSE_OPREPO.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo$delayBeforeNextExecution$2", m36648f = "OperationRepo.kt", m36649l = {346}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$delayBeforeNextExecution$2 */
    public static final class C116182 extends jgg implements nl7 {
        int label;

        public C116182(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return OperationRepo.this.new C116182(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                WaiterWithValue waiterWithValue = OperationRepo.this.retryWaiter;
                this.label = 1;
                obj = waiterWithValue.waitForWake(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116182) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo", m36648f = "OperationRepo.kt", m36649l = {360}, m36650m = "delayForPostCreate")
    /* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$delayForPostCreate$1 */
    public static final class C116191 extends o64 {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116191(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationRepo.this.delayForPostCreate(0L, this);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo$enqueue$1", m36648f = "OperationRepo.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$enqueue$1 */
    public static final class C116201 extends jgg implements xk7 {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ Operation $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116201(Operation operation, boolean z, n64 n64Var) {
            super(1, n64Var);
            this.$operation = operation;
            this.$flush = z;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return OperationRepo.this.new C116201(this.$operation, this.$flush, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            OperationRepo operationRepo = OperationRepo.this;
            OperationRepo.internalEnqueue$default(operationRepo, new OperationQueueItem(this.$operation, null, operationRepo.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116201) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo", m36648f = "OperationRepo.kt", m36649l = {Opcodes.FRETURN, Opcodes.INVOKEDYNAMIC, Opcodes.ANEWARRAY, Opcodes.ATHROW}, m36650m = "processQueueForever")
    /* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$processQueueForever$1 */
    public static final class C116211 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116211(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationRepo.this.processQueueForever(this);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo$start$1", m36648f = "OperationRepo.kt", m36649l = {102}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$start$1 */
    public static final class C116221 extends jgg implements nl7 {
        int label;

        public C116221(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return OperationRepo.this.new C116221(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                OperationRepo.this.loadSavedOperations$com_onesignal_core();
                OperationRepo operationRepo = OperationRepo.this;
                this.label = 1;
                if (operationRepo.processQueueForever(this) == objM51918f) {
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
            return ((C116221) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo", m36648f = "OperationRepo.kt", m36649l = {218, 226}, m36650m = "waitForNewOperationAndExecutionInterval")
    /* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$waitForNewOperationAndExecutionInterval$1 */
    public static final class C116231 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C116231(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationRepo.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    public OperationRepo(List<? extends IOperationExecutor> list, OperationModelStore operationModelStore, ConfigModelStore configModelStore, ITime iTime, NewRecordsState newRecordsState) {
        sq8.m48649h(list, "executors");
        sq8.m48649h(operationModelStore, "_operationModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(newRecordsState, "_newRecordState");
        this._operationModelStore = operationModelStore;
        this._configModelStore = configModelStore;
        this._time = iTime;
        this._newRecordState = newRecordsState;
        this.queue = new ArrayList();
        this.waiter = new WaiterWithValue<>();
        this.retryWaiter = new WaiterWithValue<>();
        this.coroutineScope = i84.m31707a(wkh.m54673b("OpRepo"));
        this.initialized = el3.m25197b(null, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IOperationExecutor iOperationExecutor : list) {
            Iterator<String> it = iOperationExecutor.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), iOperationExecutor);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final int getExecuteBucket() {
        int i = this.enqueueIntoBucket;
        if (i == 0) {
            return 0;
        }
        return i - 1;
    }

    private final List<OperationQueueItem> getGroupableOperations(OperationQueueItem operationQueueItem) throws Exception {
        List<OperationQueueItem> listM21252q = ch3.m21252q(operationQueueItem);
        if (operationQueueItem.getOperation().getGroupComparisonType() == GroupComparisonType.NONE) {
            return listM21252q;
        }
        String createComparisonKey = operationQueueItem.getOperation().getGroupComparisonType() == GroupComparisonType.CREATE ? operationQueueItem.getOperation().getCreateComparisonKey() : operationQueueItem.getOperation().getModifyComparisonKey();
        for (OperationQueueItem operationQueueItem2 : kh3.Q0(this.queue)) {
            String createComparisonKey2 = operationQueueItem.getOperation().getGroupComparisonType() == GroupComparisonType.CREATE ? operationQueueItem2.getOperation().getCreateComparisonKey() : operationQueueItem2.getOperation().getModifyComparisonKey();
            if (sq8.m48644c(createComparisonKey2, "") && sq8.m48644c(createComparisonKey, "")) {
                throw new Exception("Both comparison keys can not be blank!");
            }
            if (this._newRecordState.canAccess(operationQueueItem2.getOperation().getApplyToRecordId()) && sq8.m48644c(createComparisonKey2, createComparisonKey)) {
                this.queue.remove(operationQueueItem2);
                listM21252q.add(operationQueueItem2);
            }
        }
        return listM21252q;
    }

    private final void internalEnqueue(OperationQueueItem operationQueueItem, boolean z, boolean z2, Integer num) {
        synchronized (this.queue) {
            List<OperationQueueItem> list = this.queue;
            boolean z3 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (sq8.m48644c(((OperationQueueItem) it.next()).getOperation().getId(), operationQueueItem.getOperation().getId())) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                Logging.debug$default("OperationRepo: internalEnqueue - operation.id: " + operationQueueItem.getOperation().getId() + " already exists in the queue.", null, 2, null);
                return;
            }
            if (num != null) {
                this.queue.add(num.intValue(), operationQueueItem);
                y3i y3iVar = y3i.f54824a;
            } else {
                this.queue.add(operationQueueItem);
            }
            if (z2) {
                IModelStore.DefaultImpls.add$default(this._operationModelStore, operationQueueItem.getOperation(), null, 2, null);
            }
            this.waiter.wake(new LoopWaiterMessage(z, 0L));
        }
    }

    public static /* synthetic */ void internalEnqueue$default(OperationRepo operationRepo, OperationQueueItem operationQueueItem, boolean z, boolean z2, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        operationRepo.internalEnqueue(operationQueueItem, z, z2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:25:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c0 -> B:40:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(n64 n64Var) {
        C116211 c116211;
        OperationRepo operationRepo;
        long opRepoPostWakeDelay;
        if (n64Var instanceof C116211) {
            c116211 = (C116211) n64Var;
            int i = c116211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116211.label = i - Integer.MIN_VALUE;
            } else {
                c116211 = new C116211(n64Var);
            }
        }
        Object obj = c116211.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116211.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            c116211.L$0 = this;
            c116211.label = 1;
            if (waitForNewOperationAndExecutionInterval(c116211) == objM51918f) {
                return objM51918f;
            }
            operationRepo = this;
        } else if (i2 == 1) {
            operationRepo = (OperationRepo) c116211.L$0;
            wre.m54934b(obj);
        } else if (i2 == 2) {
            operationRepo = (OperationRepo) c116211.L$0;
            wre.m54934b(obj);
            opRepoPostWakeDelay = operationRepo._configModelStore.getModel().getOpRepoPostWakeDelay();
            c116211.L$0 = operationRepo;
            c116211.label = 3;
            if (nk5.m40720b(opRepoPostWakeDelay, c116211) == objM51918f) {
            }
            if (!operationRepo.paused) {
            }
        } else if (i2 == 3) {
            operationRepo = (OperationRepo) c116211.L$0;
            wre.m54934b(obj);
            if (!operationRepo.paused) {
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            operationRepo = (OperationRepo) c116211.L$0;
            wre.m54934b(obj);
            operationRepo.enqueueIntoBucket++;
            if (!operationRepo.paused) {
                Logging.debug$default("OperationRepo is paused", null, 2, null);
                return y3i.f54824a;
            }
            List<OperationQueueItem> nextOps$com_onesignal_core = operationRepo.getNextOps$com_onesignal_core(operationRepo.getExecuteBucket());
            Logging.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core, null, 2, null);
            if (nextOps$com_onesignal_core != null) {
                c116211.L$0 = operationRepo;
                c116211.label = 2;
                if (operationRepo.executeOperations$com_onesignal_core(nextOps$com_onesignal_core, c116211) == objM51918f) {
                    return objM51918f;
                }
                opRepoPostWakeDelay = operationRepo._configModelStore.getModel().getOpRepoPostWakeDelay();
                c116211.L$0 = operationRepo;
                c116211.label = 3;
                if (nk5.m40720b(opRepoPostWakeDelay, c116211) == objM51918f) {
                    return objM51918f;
                }
                if (!operationRepo.paused) {
                }
            } else {
                c116211.L$0 = operationRepo;
                c116211.label = 4;
                if (operationRepo.waitForNewOperationAndExecutionInterval(c116211) == objM51918f) {
                    return objM51918f;
                }
                operationRepo.enqueueIntoBucket++;
                if (!operationRepo.paused) {
                }
            }
        }
        operationRepo.enqueueIntoBucket++;
        if (!operationRepo.paused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009c -> B:26:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(n64 n64Var) {
        C116231 c116231;
        gge ggeVar;
        OperationRepo operationRepo;
        gge ggeVar2;
        long opRepoExecutionInterval;
        gge ggeVar3;
        OperationRepo operationRepo2;
        if (n64Var instanceof C116231) {
            c116231 = (C116231) n64Var;
            int i = c116231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116231.label = i - Integer.MIN_VALUE;
            } else {
                c116231 = new C116231(n64Var);
            }
        }
        Object objWaitForWake = c116231.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116231.label;
        if (i2 == 0) {
            wre.m54934b(objWaitForWake);
            ggeVar = new gge();
            WaiterWithValue<LoopWaiterMessage> waiterWithValue = this.waiter;
            c116231.L$0 = this;
            c116231.L$1 = ggeVar;
            c116231.L$2 = ggeVar;
            c116231.label = 1;
            objWaitForWake = waiterWithValue.waitForWake(c116231);
            if (objWaitForWake == objM51918f) {
                return objM51918f;
            }
            operationRepo = this;
            ggeVar2 = ggeVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ggeVar3 = (gge) c116231.L$1;
                operationRepo2 = (OperationRepo) c116231.L$0;
                wre.m54934b(objWaitForWake);
                if (!(objWaitForWake != null)) {
                    opRepoExecutionInterval = operationRepo2._configModelStore.getModel().getOpRepoExecutionInterval();
                    if (!((LoopWaiterMessage) ggeVar3.f25106a).getForce()) {
                        C11624xcebbcd8 c11624xcebbcd8 = new C11624xcebbcd8(ggeVar3, operationRepo2, null);
                        c116231.L$0 = operationRepo2;
                        c116231.L$1 = ggeVar3;
                        c116231.L$2 = null;
                        c116231.label = 2;
                        objWaitForWake = rmh.m46985d(opRepoExecutionInterval, c11624xcebbcd8, c116231);
                        if (objWaitForWake == objM51918f) {
                            return objM51918f;
                        }
                        if (!(objWaitForWake != null)) {
                        }
                    }
                }
                return y3i.f54824a;
            }
            ggeVar = (gge) c116231.L$2;
            ggeVar2 = (gge) c116231.L$1;
            operationRepo = (OperationRepo) c116231.L$0;
            wre.m54934b(objWaitForWake);
        }
        ggeVar.f25106a = objWaitForWake;
        opRepoExecutionInterval = operationRepo._configModelStore.getModel().getOpRepoExecutionInterval() - ((LoopWaiterMessage) ggeVar2.f25106a).getPreviousWaitedTime();
        ggeVar3 = ggeVar2;
        operationRepo2 = operationRepo;
        if (!((LoopWaiterMessage) ggeVar3.f25106a).getForce()) {
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public Object awaitInitialized(n64 n64Var) {
        Object objMo21334s = this.initialized.mo21334s(n64Var);
        return objMo21334s == uq8.m51918f() ? objMo21334s : y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public <T extends Operation> boolean containsInstanceOf(ob9 ob9Var) {
        boolean z;
        sq8.m48649h(ob9Var, "type");
        synchronized (this.queue) {
            List<OperationQueueItem> list = this.queue;
            z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (ob9Var.mo26335a(((OperationQueueItem) it.next()).getOperation())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public final Object delayBeforeNextExecution(int i, Integer num, n64 n64Var) {
        Logging.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long jMax = Math.max(i * this._configModelStore.getModel().getOpRepoDefaultFailRetryBackoff(), (num != null ? num.intValue() : 0L) * 1000);
        if (jMax < 1) {
            return y3i.f54824a;
        }
        Logging.error$default("Operations being delay for: " + jMax + " ms", null, 2, null);
        Object objM46985d = rmh.m46985d(jMax, new C116182(null), n64Var);
        return objM46985d == uq8.m51918f() ? objM46985d : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j, n64 n64Var) {
        C116191 c116191;
        OperationRepo operationRepo;
        if (n64Var instanceof C116191) {
            c116191 = (C116191) n64Var;
            int i = c116191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116191.label = i - Integer.MIN_VALUE;
            } else {
                c116191 = new C116191(n64Var);
            }
        }
        Object obj = c116191.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116191.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            c116191.L$0 = this;
            c116191.J$0 = j;
            c116191.label = 1;
            if (nk5.m40720b(j, c116191) == objM51918f) {
                return objM51918f;
            }
            operationRepo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c116191.J$0;
            operationRepo = (OperationRepo) c116191.L$0;
            wre.m54934b(obj);
        }
        synchronized (operationRepo.queue) {
            if (!operationRepo.queue.isEmpty()) {
                operationRepo.waiter.wake(new LoopWaiterMessage(false, j));
            }
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public void enqueue(Operation operation, boolean z) {
        sq8.m48649h(operation, "operation");
        Logging.log(LogLevel.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + z + ')');
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "randomUUID().toString()");
        operation.setId(string);
        OSPrimaryCoroutineScope.INSTANCE.execute(new C116201(operation, z, null));
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public Object enqueueAndWait(Operation operation, boolean z, n64 n64Var) {
        Logging.log(LogLevel.DEBUG, "OperationRepo.enqueueAndWait(operation: " + operation + ", force: " + z + ')');
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "randomUUID().toString()");
        operation.setId(string);
        WaiterWithValue waiterWithValue = new WaiterWithValue();
        internalEnqueue$default(this, new OperationQueueItem(operation, waiterWithValue, this.enqueueIntoBucket, 0, 8, null), z, true, null, 8, null);
        return waiterWithValue.waitForWake(n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0259 A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ad A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f2 A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0367 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x036f A[Catch: all -> 0x038b, TRY_LEAVE, TryCatch #6 {all -> 0x038b, blocks: (B:154:0x0369, B:156:0x036f), top: B:190:0x0369 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2 A[LOOP:0: B:168:0x03cc->B:170:0x03d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7 A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6 A[Catch: all -> 0x038e, TryCatch #9 {all -> 0x038e, blocks: (B:43:0x00d2, B:45:0x00f2, B:46:0x00f6, B:48:0x00fc, B:49:0x010e, B:50:0x0110, B:56:0x0132, B:57:0x0133, B:58:0x0141, B:60:0x0147, B:62:0x0154, B:63:0x0155, B:64:0x0156, B:65:0x0167, B:136:0x02ec, B:138:0x02f2, B:139:0x02f4, B:145:0x034b, B:148:0x034e, B:149:0x034f, B:150:0x0350, B:67:0x016c, B:68:0x0184, B:74:0x01a1, B:77:0x01a5, B:78:0x01a6, B:79:0x01a7, B:80:0x01bd, B:89:0x01f0, B:92:0x01f4, B:93:0x01f5, B:94:0x01f6, B:96:0x0209, B:97:0x0212, B:98:0x0214, B:111:0x0253, B:114:0x0257, B:115:0x0258, B:116:0x0259, B:117:0x0272, B:119:0x0278, B:120:0x028d, B:121:0x0291, B:123:0x0297, B:125:0x02a3, B:126:0x02ad, B:127:0x02b1, B:129:0x02b7, B:130:0x02cc, B:131:0x02d0, B:133:0x02d6, B:135:0x02e2, B:81:0x01be, B:82:0x01c6, B:84:0x01cc, B:86:0x01e2, B:87:0x01e8, B:88:0x01ee, B:51:0x0111, B:52:0x0117, B:54:0x011d, B:55:0x0130, B:69:0x0185, B:70:0x018d, B:72:0x0193, B:73:0x019f, B:99:0x0215, B:100:0x021e, B:102:0x0224, B:104:0x0232, B:106:0x0237, B:107:0x023f, B:109:0x0245, B:110:0x0251, B:140:0x02f5, B:141:0x0301, B:143:0x0307, B:144:0x0349), top: B:196:0x00d2, inners: #2, #3, #4, #5, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<OperationQueueItem> list, n64 n64Var) {
        OperationRepo$executeOperations$1 operationRepo$executeOperations$1;
        OperationRepo operationRepo;
        OperationQueueItem operationQueueItem;
        List<? extends Operation> arrayList;
        OperationRepo operationRepo2;
        ExecutionResponse executionResponse;
        int i;
        Integer retryAfterSeconds;
        OperationRepo operationRepo3;
        Iterator<T> it;
        Iterator<T> it2;
        List<OperationQueueItem> list2 = list;
        if (n64Var instanceof OperationRepo$executeOperations$1) {
            operationRepo$executeOperations$1 = (OperationRepo$executeOperations$1) n64Var;
            int i2 = operationRepo$executeOperations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                operationRepo$executeOperations$1.label = i2 - Integer.MIN_VALUE;
            } else {
                operationRepo$executeOperations$1 = new OperationRepo$executeOperations$1(this, n64Var);
            }
        }
        Object objExecute = operationRepo$executeOperations$1.result;
        Object objM51918f = uq8.m51918f();
        int i3 = operationRepo$executeOperations$1.label;
        if (i3 == 0) {
            wre.m54934b(objExecute);
            try {
                operationQueueItem = (OperationQueueItem) kh3.f0(list);
                IOperationExecutor iOperationExecutor = this.executorsMap.get(operationQueueItem.getOperation().getName());
                if (iOperationExecutor == null) {
                    throw new Exception("Could not find executor for operation " + operationQueueItem.getOperation().getName());
                }
                arrayList = new ArrayList<>(dh3.m23088v(list2, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((OperationQueueItem) it3.next()).getOperation());
                }
                operationRepo$executeOperations$1.L$0 = this;
                operationRepo$executeOperations$1.L$1 = list2;
                operationRepo$executeOperations$1.L$2 = operationQueueItem;
                operationRepo$executeOperations$1.L$3 = arrayList;
                operationRepo$executeOperations$1.label = 1;
                objExecute = iOperationExecutor.execute(arrayList, operationRepo$executeOperations$1);
                if (objExecute == objM51918f) {
                    return objM51918f;
                }
                operationRepo2 = this;
                executionResponse = (ExecutionResponse) objExecute;
                Logging.debug$default("OperationRepo: execute response = " + executionResponse.getResult(), null, 2, null);
                if (executionResponse.getIdTranslations() != null) {
                }
                ege egeVar = new ege();
                switch (WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()]) {
                }
            } catch (Throwable th) {
                th = th;
                operationRepo = this;
                Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                it = list2.iterator();
                while (it.hasNext()) {
                    IModelStore.DefaultImpls.remove$default(operationRepo._operationModelStore, ((OperationQueueItem) it.next()).getOperation().getId(), null, 2, null);
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    WaiterWithValue<Boolean> waiter = ((OperationQueueItem) it2.next()).getWaiter();
                    if (waiter != null) {
                        waiter.wake(ml1.m39301a(false));
                        y3i y3iVar = y3i.f54824a;
                    }
                }
                return y3i.f54824a;
            }
        } else if (i3 == 1) {
            List<? extends Operation> list3 = (List) operationRepo$executeOperations$1.L$3;
            operationQueueItem = (OperationQueueItem) operationRepo$executeOperations$1.L$2;
            List<OperationQueueItem> list4 = (List) operationRepo$executeOperations$1.L$1;
            operationRepo2 = (OperationRepo) operationRepo$executeOperations$1.L$0;
            try {
                wre.m54934b(objExecute);
                arrayList = list3;
                list2 = list4;
            } catch (Throwable th2) {
                th = th2;
                list2 = list4;
                operationRepo = operationRepo2;
                Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                it = list2.iterator();
                while (it.hasNext()) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                return y3i.f54824a;
            }
            try {
                executionResponse = (ExecutionResponse) objExecute;
                Logging.debug$default("OperationRepo: execute response = " + executionResponse.getResult(), null, 2, null);
                if (executionResponse.getIdTranslations() != null) {
                    Iterator<T> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        ((OperationQueueItem) it4.next()).getOperation().translateIds(executionResponse.getIdTranslations());
                    }
                    synchronized (operationRepo2.queue) {
                        Iterator<T> it5 = operationRepo2.queue.iterator();
                        while (it5.hasNext()) {
                            ((OperationQueueItem) it5.next()).getOperation().translateIds(executionResponse.getIdTranslations());
                        }
                        y3i y3iVar2 = y3i.f54824a;
                    }
                    Iterator<T> it6 = executionResponse.getIdTranslations().values().iterator();
                    while (it6.hasNext()) {
                        operationRepo2._newRecordState.add((String) it6.next());
                    }
                }
                ege egeVar2 = new ege();
                switch (WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()]) {
                    case 1:
                        Iterator<T> it7 = list2.iterator();
                        while (it7.hasNext()) {
                            IModelStore.DefaultImpls.remove$default(operationRepo2._operationModelStore, ((OperationQueueItem) it7.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator<T> it8 = list2.iterator();
                        while (it8.hasNext()) {
                            WaiterWithValue<Boolean> waiter2 = ((OperationQueueItem) it8.next()).getWaiter();
                            if (waiter2 != null) {
                                waiter2.wake(ml1.m39301a(true));
                                y3i y3iVar3 = y3i.f54824a;
                            }
                        }
                        if (executionResponse.getOperations() != null) {
                            synchronized (operationRepo2.queue) {
                                for (Operation operation : kh3.B0(executionResponse.getOperations())) {
                                    String string = UUID.randomUUID().toString();
                                    sq8.m48648g(string, "randomUUID().toString()");
                                    operation.setId(string);
                                    OperationQueueItem operationQueueItem2 = new OperationQueueItem(operation, null, 0, 0, 10, null);
                                    operationRepo2.queue.add(0, operationQueueItem2);
                                    IModelStore.DefaultImpls.add$default(operationRepo2._operationModelStore, 0, operationQueueItem2.getOperation(), null, 4, null);
                                }
                                y3i y3iVar4 = y3i.f54824a;
                            }
                        }
                        i = egeVar2.f21602a;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo2;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo2.delayBeforeNextExecution(i, retryAfterSeconds, operationRepo$executeOperations$1) != objM51918f) {
                            return objM51918f;
                        }
                        operationRepo3 = operationRepo2;
                        if (executionResponse.getIdTranslations() != null) {
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        Logging.error$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        Iterator<T> it9 = list2.iterator();
                        while (it9.hasNext()) {
                            IModelStore.DefaultImpls.remove$default(operationRepo2._operationModelStore, ((OperationQueueItem) it9.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator<T> it10 = list2.iterator();
                        while (it10.hasNext()) {
                            WaiterWithValue<Boolean> waiter3 = ((OperationQueueItem) it10.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(ml1.m39301a(false));
                                y3i y3iVar5 = y3i.f54824a;
                            }
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i = egeVar2.f21602a;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo2;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo2.delayBeforeNextExecution(i, retryAfterSeconds, operationRepo$executeOperations$1) != objM51918f) {
                        }
                        break;
                    case 5:
                        IModelStore.DefaultImpls.remove$default(operationRepo2._operationModelStore, operationQueueItem.getOperation().getId(), null, 2, null);
                        WaiterWithValue<Boolean> waiter4 = operationQueueItem.getWaiter();
                        if (waiter4 != null) {
                            waiter4.wake(ml1.m39301a(true));
                            y3i y3iVar6 = y3i.f54824a;
                        }
                        synchronized (operationRepo2.queue) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list2) {
                                if (!sq8.m48644c((OperationQueueItem) obj, operationQueueItem)) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it11 = kh3.B0(arrayList2).iterator();
                            while (it11.hasNext()) {
                                operationRepo2.queue.add(0, (OperationQueueItem) it11.next());
                            }
                            y3i y3iVar7 = y3i.f54824a;
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i = egeVar2.f21602a;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo2;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo2.delayBeforeNextExecution(i, retryAfterSeconds, operationRepo$executeOperations$1) != objM51918f) {
                        }
                        break;
                    case 6:
                        Logging.error$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (operationRepo2.queue) {
                            for (OperationQueueItem operationQueueItem3 : kh3.B0(list2)) {
                                operationQueueItem3.setRetries(operationQueueItem3.getRetries() + 1);
                                if (operationQueueItem3.getRetries() > egeVar2.f21602a) {
                                    egeVar2.f21602a = operationQueueItem3.getRetries();
                                }
                                operationRepo2.queue.add(0, operationQueueItem3);
                            }
                            y3i y3iVar8 = y3i.f54824a;
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i = egeVar2.f21602a;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo2;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo2.delayBeforeNextExecution(i, retryAfterSeconds, operationRepo$executeOperations$1) != objM51918f) {
                        }
                        break;
                    case 7:
                        Logging.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        operationRepo2.paused = true;
                        synchronized (operationRepo2.queue) {
                            Iterator it12 = kh3.B0(list2).iterator();
                            while (it12.hasNext()) {
                                operationRepo2.queue.add(0, (OperationQueueItem) it12.next());
                            }
                            y3i y3iVar9 = y3i.f54824a;
                        }
                        if (executionResponse.getOperations() != null) {
                        }
                        i = egeVar2.f21602a;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo2;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo2.delayBeforeNextExecution(i, retryAfterSeconds, operationRepo$executeOperations$1) != objM51918f) {
                        }
                        break;
                    default:
                        if (executionResponse.getOperations() != null) {
                        }
                        i = egeVar2.f21602a;
                        retryAfterSeconds = executionResponse.getRetryAfterSeconds();
                        operationRepo$executeOperations$1.L$0 = operationRepo2;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = executionResponse;
                        operationRepo$executeOperations$1.L$3 = null;
                        operationRepo$executeOperations$1.label = 2;
                        if (operationRepo2.delayBeforeNextExecution(i, retryAfterSeconds, operationRepo$executeOperations$1) != objM51918f) {
                        }
                        break;
                }
            } catch (Throwable th3) {
                th = th3;
                operationRepo = operationRepo2;
                Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                it = list2.iterator();
                while (it.hasNext()) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                return y3i.f54824a;
            }
        } else if (i3 == 2) {
            ExecutionResponse executionResponse2 = (ExecutionResponse) operationRepo$executeOperations$1.L$2;
            List<OperationQueueItem> list5 = (List) operationRepo$executeOperations$1.L$1;
            operationRepo3 = (OperationRepo) operationRepo$executeOperations$1.L$0;
            try {
                wre.m54934b(objExecute);
                executionResponse = executionResponse2;
                list2 = list5;
                try {
                    if (executionResponse.getIdTranslations() != null) {
                        long opRepoPostCreateDelay = operationRepo3._configModelStore.getModel().getOpRepoPostCreateDelay();
                        operationRepo$executeOperations$1.L$0 = operationRepo3;
                        operationRepo$executeOperations$1.L$1 = list2;
                        operationRepo$executeOperations$1.L$2 = null;
                        operationRepo$executeOperations$1.label = 3;
                        if (operationRepo3.delayForPostCreate(opRepoPostCreateDelay, operationRepo$executeOperations$1) == objM51918f) {
                            return objM51918f;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    operationRepo = operationRepo3;
                    Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                    }
                    return y3i.f54824a;
                }
            } catch (Throwable th5) {
                th = th5;
                list2 = list5;
                operationRepo = operationRepo3;
                Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                it = list2.iterator();
                while (it.hasNext()) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                return y3i.f54824a;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) operationRepo$executeOperations$1.L$1;
            operationRepo = (OperationRepo) operationRepo$executeOperations$1.L$0;
            try {
                wre.m54934b(objExecute);
            } catch (Throwable th6) {
                th = th6;
                Logging.log(LogLevel.ERROR, "Error attempting to execute operation: " + list2, th);
                it = list2.iterator();
                while (it.hasNext()) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                return y3i.f54824a;
            }
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.operations.IOperationRepo
    public void forceExecuteOperations() {
        long j = 0;
        int i = 2;
        id5 id5Var = null;
        this.retryWaiter.wake(new LoopWaiterMessage(true, j, i, id5Var));
        this.waiter.wake(new LoopWaiterMessage(false, j, i, id5Var));
    }

    public final List<OperationQueueItem> getNextOps$com_onesignal_core(int i) {
        List<OperationQueueItem> groupableOperations;
        Object next;
        synchronized (this.queue) {
            Iterator<T> it = this.queue.iterator();
            while (true) {
                groupableOperations = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                OperationQueueItem operationQueueItem = (OperationQueueItem) next;
                if (operationQueueItem.getOperation().getCanStartExecute() && this._newRecordState.canAccess(operationQueueItem.getOperation().getApplyToRecordId()) && operationQueueItem.getBucket() <= i) {
                    break;
                }
            }
            OperationQueueItem operationQueueItem2 = (OperationQueueItem) next;
            if (operationQueueItem2 != null) {
                this.queue.remove(operationQueueItem2);
                groupableOperations = getGroupableOperations(operationQueueItem2);
            }
        }
        return groupableOperations;
    }

    public final List<OperationQueueItem> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = kh3.B0(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new OperationQueueItem((Operation) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        this.initialized.complete(y3i.f54824a);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.paused = false;
        rm1.m46952d(this.coroutineScope, null, null, new C116221(null), 3, null);
    }

    public static final class LoopWaiterMessage {
        private final boolean force;
        private final long previousWaitedTime;

        public LoopWaiterMessage(boolean z, long j) {
            this.force = z;
            this.previousWaitedTime = j;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ LoopWaiterMessage(boolean z, long j, int i, id5 id5Var) {
            this(z, (i & 2) != 0 ? 0L : j);
        }
    }

    public static final class OperationQueueItem {
        private final int bucket;
        private final Operation operation;
        private int retries;
        private final WaiterWithValue<Boolean> waiter;

        public OperationQueueItem(Operation operation, WaiterWithValue<Boolean> waiterWithValue, int i, int i2) {
            sq8.m48649h(operation, "operation");
            this.operation = operation;
            this.waiter = waiterWithValue;
            this.bucket = i;
            this.retries = i2;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final Operation getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final WaiterWithValue<Boolean> getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i) {
            this.retries = i;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ OperationQueueItem(Operation operation, WaiterWithValue waiterWithValue, int i, int i2, int i3, id5 id5Var) {
            this(operation, (i3 & 2) != 0 ? null : waiterWithValue, i, (i3 & 8) != 0 ? 0 : i2);
        }
    }
}
