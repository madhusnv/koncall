package com.onesignal.user.internal.migrations;

import com.onesignal.common.IDManager;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.kge;
import p001o.kt7;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.rm1;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class RecoverFromDroppedLoginBug implements IStartableService {
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;

    @l75(m36647c = "com.onesignal.user.internal.migrations.RecoverFromDroppedLoginBug$start$1", m36648f = "RecoverFromDroppedLoginBug.kt", m36649l = {um5.SWIFT_PREFIX_FIELD_NUMBER}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.user.internal.migrations.RecoverFromDroppedLoginBug$start$1 */
    public static final class C118641 extends jgg implements nl7 {
        int label;

        public C118641(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return RecoverFromDroppedLoginBug.this.new C118641(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOperationRepo iOperationRepo = RecoverFromDroppedLoginBug.this._operationRepo;
                this.label = 1;
                if (iOperationRepo.awaitInitialized(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            if (RecoverFromDroppedLoginBug.this.isInBadState()) {
                Logging.warn$default("User with externalId:" + RecoverFromDroppedLoginBug.this._identityModelStore.getModel().getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                RecoverFromDroppedLoginBug.this.recoverByAddingBackDroppedLoginOperation();
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118641) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public RecoverFromDroppedLoginBug(IOperationRepo iOperationRepo, IdentityModelStore identityModelStore, ConfigModelStore configModelStore) {
        sq8.m48649h(iOperationRepo, "_operationRepo");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._operationRepo = iOperationRepo;
        this._identityModelStore = identityModelStore;
        this._configModelStore = configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (this._identityModelStore.getModel().getExternalId() == null || !IDManager.INSTANCE.isLocalId(this._identityModelStore.getModel().getOnesignalId()) || this._operationRepo.containsInstanceOf(kge.m35689b(LoginUserOperation.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new LoginUserOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId(), null), false, 2, null);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        rm1.m46952d(kt7.f32697a, eu5.m25611b(), null, new C118641(null), 2, null);
    }
}
