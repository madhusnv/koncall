package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IIdentityBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.DeleteAliasOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.hsa;
import p001o.id5;
import p001o.kh3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.szb;
import p001o.uq8;
import p001o.vyh;
import p001o.wre;

/* loaded from: classes6.dex */
public final class IdentityOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final IRebuildUserService _buildUserService;
    private final IIdentityBackendService _identityBackend;
    private final IdentityModelStore _identityModelStore;
    private final NewRecordsState _newRecordState;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            iArr[NetworkUtils.ResponseStatusType.INVALID.ordinal()] = 2;
            iArr[NetworkUtils.ResponseStatusType.CONFLICT.ordinal()] = 3;
            iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 4;
            iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.IdentityOperationExecutor", m36648f = "IdentityOperationExecutor.kt", m36649l = {48, Opcodes.DUP_X2}, m36650m = "execute")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.IdentityOperationExecutor$execute$1 */
    public static final class C118651 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118651(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdentityOperationExecutor.this.execute(null, this);
        }
    }

    public IdentityOperationExecutor(IIdentityBackendService iIdentityBackendService, IdentityModelStore identityModelStore, IRebuildUserService iRebuildUserService, NewRecordsState newRecordsState) {
        sq8.m48649h(iIdentityBackendService, "_identityBackend");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(iRebuildUserService, "_buildUserService");
        sq8.m48649h(newRecordsState, "_newRecordState");
        this._identityBackend = iIdentityBackendService;
        this._identityModelStore = identityModelStore;
        this._buildUserService = iRebuildUserService;
        this._newRecordState = newRecordsState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0275 A[Catch: BackendException -> 0x0043, TRY_LEAVE, TryCatch #3 {BackendException -> 0x0043, blocks: (B:13:0x003e, B:109:0x025c, B:111:0x0275), top: B:145:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f A[Catch: BackendException -> 0x005d, TRY_LEAVE, TryCatch #0 {BackendException -> 0x005d, blocks: (B:20:0x0058, B:72:0x0136, B:74:0x014f), top: B:139:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, n64 n64Var) throws Exception {
        C118651 c118651;
        boolean z;
        boolean z2;
        Operation operation;
        IdentityOperationExecutor identityOperationExecutor;
        Operation operation2;
        IdentityOperationExecutor identityOperationExecutor2;
        Operation operation3;
        int i;
        int i2;
        if (n64Var instanceof C118651) {
            c118651 = (C118651) n64Var;
            int i3 = c118651.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c118651.label = i3 - Integer.MIN_VALUE;
            } else {
                c118651 = new C118651(n64Var);
            }
        }
        C118651 c1186512 = c118651;
        Object obj = c1186512.result;
        Object objM51918f = uq8.m51918f();
        int i4 = c1186512.label;
        if (i4 == 0) {
            wre.m54934b(obj);
            Logging.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
            boolean z3 = list instanceof Collection;
            boolean z4 = false;
            if (z3 && list.isEmpty()) {
                z = false;
                if (!z) {
                }
            } else {
                for (Operation operation4 : list) {
                    if (((operation4 instanceof SetAliasOperation) || (operation4 instanceof DeleteAliasOperation)) ? false : true) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (!z) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
                if (z3 && list.isEmpty()) {
                    z2 = false;
                    if (z2) {
                    }
                    operation = (Operation) kh3.r0(list);
                    if (!(operation instanceof SetAliasOperation)) {
                    }
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Operation) it.next()) instanceof SetAliasOperation) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        if (!z3 || !list.isEmpty()) {
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((Operation) it2.next()) instanceof DeleteAliasOperation) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        if (z4) {
                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                        }
                    }
                    operation = (Operation) kh3.r0(list);
                    if (!(operation instanceof SetAliasOperation)) {
                        try {
                            IIdentityBackendService iIdentityBackendService = this._identityBackend;
                            String appId = ((SetAliasOperation) operation).getAppId();
                            String onesignalId = ((SetAliasOperation) operation).getOnesignalId();
                            Map<String, String> mapM31056f = hsa.m31056f(vyh.m53620a(((SetAliasOperation) operation).getLabel(), ((SetAliasOperation) operation).getValue()));
                            c1186512.L$0 = this;
                            c1186512.L$1 = operation;
                            c1186512.label = 1;
                            if (iIdentityBackendService.setAlias(appId, IdentityConstants.ONESIGNAL_ID, onesignalId, mapM31056f, c1186512) == objM51918f) {
                                return objM51918f;
                            }
                            identityOperationExecutor = this;
                            operation2 = operation;
                            if (sq8.m48644c(identityOperationExecutor._identityModelStore.getModel().getOnesignalId(), ((SetAliasOperation) operation2).getOnesignalId())) {
                            }
                        } catch (BackendException e) {
                            e = e;
                            identityOperationExecutor = this;
                            operation2 = operation;
                            i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i != 1) {
                            }
                        }
                    } else if (operation instanceof DeleteAliasOperation) {
                        try {
                            IIdentityBackendService iIdentityBackendService2 = this._identityBackend;
                            String appId2 = ((DeleteAliasOperation) operation).getAppId();
                            String onesignalId2 = ((DeleteAliasOperation) operation).getOnesignalId();
                            String label = ((DeleteAliasOperation) operation).getLabel();
                            c1186512.L$0 = this;
                            c1186512.L$1 = operation;
                            c1186512.label = 2;
                            if (iIdentityBackendService2.deleteAlias(appId2, IdentityConstants.ONESIGNAL_ID, onesignalId2, label, c1186512) == objM51918f) {
                                return objM51918f;
                            }
                            identityOperationExecutor2 = this;
                            operation3 = operation;
                            if (sq8.m48644c(identityOperationExecutor2._identityModelStore.getModel().getOnesignalId(), ((DeleteAliasOperation) operation3).getOnesignalId())) {
                            }
                        } catch (BackendException e2) {
                            e = e2;
                            identityOperationExecutor2 = this;
                            operation3 = operation;
                            i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i2 != 1) {
                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i2 == 2) {
                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            if (i2 == 3) {
                                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                            }
                            if (i2 == 4) {
                                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i2 == 5) {
                                return (e.getStatusCode() == 404 && identityOperationExecutor2._newRecordState.isInMissingRetryWindow(((DeleteAliasOperation) operation3).getOnesignalId())) ? new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                            }
                            throw new szb();
                        }
                    }
                }
            }
        } else if (i4 == 1) {
            operation2 = (Operation) c1186512.L$1;
            identityOperationExecutor = (IdentityOperationExecutor) c1186512.L$0;
            try {
                wre.m54934b(obj);
                if (sq8.m48644c(identityOperationExecutor._identityModelStore.getModel().getOnesignalId(), ((SetAliasOperation) operation2).getOnesignalId())) {
                    Model.setStringProperty$default(identityOperationExecutor._identityModelStore.getModel(), ((SetAliasOperation) operation2).getLabel(), ((SetAliasOperation) operation2).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                }
            } catch (BackendException e3) {
                e = e3;
                i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i == 2) {
                    return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i == 3) {
                    return new ExecutionResponse(ExecutionResult.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i == 4) {
                    return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    throw new szb();
                }
                if (e.getStatusCode() == 404 && identityOperationExecutor._newRecordState.isInMissingRetryWindow(((SetAliasOperation) operation2).getOnesignalId())) {
                    return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                SetAliasOperation setAliasOperation = (SetAliasOperation) operation2;
                List<Operation> rebuildOperationsIfCurrentUser = identityOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(setAliasOperation.getAppId(), setAliasOperation.getOnesignalId());
                return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            operation3 = (Operation) c1186512.L$1;
            identityOperationExecutor2 = (IdentityOperationExecutor) c1186512.L$0;
            try {
                wre.m54934b(obj);
                if (sq8.m48644c(identityOperationExecutor2._identityModelStore.getModel().getOnesignalId(), ((DeleteAliasOperation) operation3).getOnesignalId())) {
                    Model.setOptStringProperty$default(identityOperationExecutor2._identityModelStore.getModel(), ((DeleteAliasOperation) operation3).getLabel(), null, ModelChangeTags.HYDRATE, false, 8, null);
                }
            } catch (BackendException e4) {
                e = e4;
                i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i2 != 1) {
                }
            }
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return ch3.m21249n(SET_ALIAS, DELETE_ALIAS);
    }
}
