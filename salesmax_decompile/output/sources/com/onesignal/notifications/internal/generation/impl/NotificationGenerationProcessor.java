package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.Notification;
import com.onesignal.notifications.internal.NotificationReceivedEvent;
import com.onesignal.notifications.internal.NotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.generation.INotificationGenerationProcessor;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.dge;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.kt7;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.o64;
import p001o.omh;
import p001o.p69;
import p001o.rm1;
import p001o.rmh;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationGenerationProcessor implements INotificationGenerationProcessor {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationLifecycleService _lifecycleService;
    private final INotificationDisplayer _notificationDisplayer;
    private final INotificationSummaryManager _notificationSummaryManager;
    private final ITime _time;

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", m36648f = "NotificationGenerationProcessor.kt", m36649l = {304, 307}, m36650m = "markNotificationAsDismissed")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$markNotificationAsDismissed$1 */
    public static final class C117651 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C117651(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationGenerationProcessor.this.markNotificationAsDismissed(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", m36648f = "NotificationGenerationProcessor.kt", m36649l = {230, 234, 238}, m36650m = "postProcessNotification")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$postProcessNotification$1 */
    public static final class C117661 extends o64 {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C117661(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationGenerationProcessor.this.postProcessNotification(null, false, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", m36648f = "NotificationGenerationProcessor.kt", m36649l = {319}, m36650m = "processCollapseKey")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processCollapseKey$1 */
    public static final class C117671 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117671(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationGenerationProcessor.this.processCollapseKey(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", m36648f = "NotificationGenerationProcessor.kt", m36649l = {Opcodes.LOOKUPSWITCH, Opcodes.ANEWARRAY, Opcodes.MONITORENTER}, m36650m = "processHandlerResponse")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processHandlerResponse$1 */
    public static final class C117681 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C117681(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationGenerationProcessor.this.processHandlerResponse(null, false, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", m36648f = "NotificationGenerationProcessor.kt", m36649l = {49, 57, TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, Opcodes.DUP2_X2, 105, Opcodes.LOR, Opcodes.L2I, Opcodes.D2I, Opcodes.LCMP}, m36650m = "processNotificationData")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$1 */
    public static final class C117691 extends o64 {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C117691(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationGenerationProcessor.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2", m36648f = "NotificationGenerationProcessor.kt", m36649l = {Opcodes.CASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2 */
    public static final class C117702 extends jgg implements nl7 {
        final /* synthetic */ Notification $notification;
        final /* synthetic */ NotificationReceivedEvent $notificationReceivedEvent;
        final /* synthetic */ dge $wantsToDisplay;
        int label;

        @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2$1", m36648f = "NotificationGenerationProcessor.kt", m36649l = {Opcodes.AASTORE}, m36650m = "invokeSuspend")
        /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Notification $notification;
            final /* synthetic */ NotificationReceivedEvent $notificationReceivedEvent;
            final /* synthetic */ dge $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ NotificationGenerationProcessor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationGenerationProcessor notificationGenerationProcessor, NotificationReceivedEvent notificationReceivedEvent, dge dgeVar, Notification notification, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = notificationGenerationProcessor;
                this.$notificationReceivedEvent = notificationReceivedEvent;
                this.$wantsToDisplay = dgeVar;
                this.$notification = notification;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                dge dgeVar;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f19803a = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        dge dgeVar2 = this.$wantsToDisplay;
                        dgeVar2.f19803a = false;
                        WaiterWithValue<Boolean> displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = dgeVar2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == objM51918f) {
                            return objM51918f;
                        }
                        dgeVar = dgeVar2;
                        obj = objWaitForWake;
                    }
                    return y3i.f54824a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dgeVar = (dge) this.L$0;
                wre.m54934b(obj);
                dgeVar.f19803a = ((Boolean) obj).booleanValue();
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117702(NotificationReceivedEvent notificationReceivedEvent, dge dgeVar, Notification notification, n64 n64Var) {
            super(2, n64Var);
            this.$notificationReceivedEvent = notificationReceivedEvent;
            this.$wantsToDisplay = dgeVar;
            this.$notification = notification;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationGenerationProcessor.this.new C117702(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                p69 p69VarM46952d = rm1.m46952d(kt7.f32697a, eu5.m25611b(), null, new AnonymousClass1(NotificationGenerationProcessor.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null), 2, null);
                this.label = 1;
                if (p69VarM46952d.d0(this) == objM51918f) {
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
            return ((C117702) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3", m36648f = "NotificationGenerationProcessor.kt", m36649l = {Opcodes.FNEG}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3 */
    public static final class C117713 extends jgg implements nl7 {
        final /* synthetic */ Notification $notification;
        final /* synthetic */ NotificationWillDisplayEvent $notificationWillDisplayEvent;
        final /* synthetic */ dge $wantsToDisplay;
        int label;

        @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3$1", m36648f = "NotificationGenerationProcessor.kt", m36649l = {116}, m36650m = "invokeSuspend")
        /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Notification $notification;
            final /* synthetic */ NotificationWillDisplayEvent $notificationWillDisplayEvent;
            final /* synthetic */ dge $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ NotificationGenerationProcessor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationGenerationProcessor notificationGenerationProcessor, NotificationWillDisplayEvent notificationWillDisplayEvent, dge dgeVar, Notification notification, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = notificationGenerationProcessor;
                this.$notificationWillDisplayEvent = notificationWillDisplayEvent;
                this.$wantsToDisplay = dgeVar;
                this.$notification = notification;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                dge dgeVar;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f19803a = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        dge dgeVar2 = this.$wantsToDisplay;
                        dgeVar2.f19803a = false;
                        WaiterWithValue<Boolean> displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = dgeVar2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == objM51918f) {
                            return objM51918f;
                        }
                        dgeVar = dgeVar2;
                        obj = objWaitForWake;
                    }
                    return y3i.f54824a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dgeVar = (dge) this.L$0;
                wre.m54934b(obj);
                dgeVar.f19803a = ((Boolean) obj).booleanValue();
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117713(NotificationWillDisplayEvent notificationWillDisplayEvent, dge dgeVar, Notification notification, n64 n64Var) {
            super(2, n64Var);
            this.$notificationWillDisplayEvent = notificationWillDisplayEvent;
            this.$wantsToDisplay = dgeVar;
            this.$notification = notification;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationGenerationProcessor.this.new C117713(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                p69 p69VarM46952d = rm1.m46952d(kt7.f32697a, eu5.m25611b(), null, new AnonymousClass1(NotificationGenerationProcessor.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null), 2, null);
                this.label = 1;
                if (p69VarM46952d.d0(this) == objM51918f) {
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
            return ((C117713) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", m36648f = "NotificationGenerationProcessor.kt", m36649l = {279}, m36650m = "saveNotification")
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$saveNotification$1 */
    public static final class C117721 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C117721(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationGenerationProcessor.this.saveNotification(null, false, this);
        }
    }

    public NotificationGenerationProcessor(IApplicationService iApplicationService, INotificationDisplayer iNotificationDisplayer, ConfigModelStore configModelStore, INotificationRepository iNotificationRepository, INotificationSummaryManager iNotificationSummaryManager, INotificationLifecycleService iNotificationLifecycleService, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationDisplayer, "_notificationDisplayer");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iNotificationRepository, "_dataController");
        sq8.m48649h(iNotificationSummaryManager, "_notificationSummaryManager");
        sq8.m48649h(iNotificationLifecycleService, "_lifecycleService");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._notificationDisplayer = iNotificationDisplayer;
        this._configModelStore = configModelStore;
        this._dataController = iNotificationRepository;
        this._notificationSummaryManager = iNotificationSummaryManager;
        this._lifecycleService = iNotificationLifecycleService;
        this._time = iTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(Notification notification, n64 n64Var) {
        return this._dataController.doesNotificationExist(notification.getNotificationId(), n64Var);
    }

    private final boolean isNotificationWithinTTL(Notification notification) {
        if (this._configModelStore.getModel().getRestoreTTLFilter()) {
            return notification.getSentTime() + ((long) notification.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(NotificationGenerationJob notificationGenerationJob, n64 n64Var) {
        C117651 c117651;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (n64Var instanceof C117651) {
            c117651 = (C117651) n64Var;
            int i = c117651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117651.label = i - Integer.MIN_VALUE;
            } else {
                c117651 = new C117651(n64Var);
            }
        }
        Object objMarkAsDismissed = c117651.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117651.label;
        if (i2 == 0) {
            wre.m54934b(objMarkAsDismissed);
            if (!notificationGenerationJob.isNotificationToDisplay()) {
                return y3i.f54824a;
            }
            Logging.debug$default("Marking restored or disabled notifications as dismissed: " + notificationGenerationJob, null, 2, null);
            INotificationRepository iNotificationRepository = this._dataController;
            int androidId = notificationGenerationJob.getAndroidId();
            c117651.L$0 = this;
            c117651.L$1 = notificationGenerationJob;
            c117651.label = 1;
            objMarkAsDismissed = iNotificationRepository.markAsDismissed(androidId, c117651);
            if (objMarkAsDismissed == objM51918f) {
                return objM51918f;
            }
            notificationGenerationProcessor = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objMarkAsDismissed);
                return y3i.f54824a;
            }
            notificationGenerationJob = (NotificationGenerationJob) c117651.L$1;
            notificationGenerationProcessor = (NotificationGenerationProcessor) c117651.L$0;
            wre.m54934b(objMarkAsDismissed);
        }
        if (!((Boolean) objMarkAsDismissed).booleanValue()) {
            return y3i.f54824a;
        }
        INotificationSummaryManager iNotificationSummaryManager = notificationGenerationProcessor._notificationSummaryManager;
        int androidId2 = notificationGenerationJob.getAndroidId();
        c117651.L$0 = null;
        c117651.L$1 = null;
        c117651.label = 2;
        if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(androidId2, c117651) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(NotificationGenerationJob notificationGenerationJob, boolean z, boolean z2, n64 n64Var) {
        C117661 c117661;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (n64Var instanceof C117661) {
            c117661 = (C117661) n64Var;
            int i = c117661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117661.label = i - Integer.MIN_VALUE;
            } else {
                c117661 = new C117661(n64Var);
            }
        }
        Object obj = c117661.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117661.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            c117661.L$0 = this;
            c117661.L$1 = notificationGenerationJob;
            c117661.Z$0 = z2;
            c117661.label = 1;
            if (saveNotification(notificationGenerationJob, z, c117661) == objM51918f) {
                return objM51918f;
            }
            notificationGenerationProcessor = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            z2 = c117661.Z$0;
            notificationGenerationJob = (NotificationGenerationJob) c117661.L$1;
            notificationGenerationProcessor = (NotificationGenerationProcessor) c117661.L$0;
            wre.m54934b(obj);
        }
        if (!z2) {
            c117661.L$0 = null;
            c117661.L$1 = null;
            c117661.label = 2;
            if (notificationGenerationProcessor.markNotificationAsDismissed(notificationGenerationJob, c117661) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
        INotificationLifecycleService iNotificationLifecycleService = notificationGenerationProcessor._lifecycleService;
        c117661.L$0 = null;
        c117661.L$1 = null;
        c117661.label = 3;
        if (iNotificationLifecycleService.notificationReceived(notificationGenerationJob, c117661) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(NotificationGenerationJob notificationGenerationJob, n64 n64Var) {
        C117671 c117671;
        if (n64Var instanceof C117671) {
            c117671 = (C117671) n64Var;
            int i = c117671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117671.label = i - Integer.MIN_VALUE;
            } else {
                c117671 = new C117671(n64Var);
            }
        }
        Object androidIdFromCollapseKey = c117671.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117671.label;
        if (i2 == 0) {
            wre.m54934b(androidIdFromCollapseKey);
            if (notificationGenerationJob.isRestoring()) {
                return y3i.f54824a;
            }
            if (!notificationGenerationJob.getJsonPayload().has(Constants.MessagePayloadKeys.COLLAPSE_KEY) || sq8.m48644c("do_not_collapse", notificationGenerationJob.getJsonPayload().optString(Constants.MessagePayloadKeys.COLLAPSE_KEY))) {
                return y3i.f54824a;
            }
            String strOptString = notificationGenerationJob.getJsonPayload().optString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
            INotificationRepository iNotificationRepository = this._dataController;
            sq8.m48648g(strOptString, "collapseId");
            c117671.L$0 = notificationGenerationJob;
            c117671.label = 1;
            androidIdFromCollapseKey = iNotificationRepository.getAndroidIdFromCollapseKey(strOptString, c117671);
            if (androidIdFromCollapseKey == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationGenerationJob = (NotificationGenerationJob) c117671.L$0;
            wre.m54934b(androidIdFromCollapseKey);
        }
        Integer num = (Integer) androidIdFromCollapseKey;
        if (num != null) {
            notificationGenerationJob.getNotification().setAndroidNotificationId(num.intValue());
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(NotificationGenerationJob notificationGenerationJob, boolean z, boolean z2, n64 n64Var) {
        C117681 c117681;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (n64Var instanceof C117681) {
            c117681 = (C117681) n64Var;
            int i = c117681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117681.label = i - Integer.MIN_VALUE;
            } else {
                c117681 = new C117681(n64Var);
            }
        }
        Object obj = c117681.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117681.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (z) {
                boolean zIsStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(notificationGenerationJob.getNotification().getBody());
                boolean zIsNotificationWithinTTL = isNotificationWithinTTL(notificationGenerationJob.getNotification());
                if (zIsStringNotEmpty && zIsNotificationWithinTTL) {
                    c117681.L$0 = this;
                    c117681.L$1 = notificationGenerationJob;
                    c117681.label = 1;
                    if (processCollapseKey(notificationGenerationJob, c117681) == objM51918f) {
                        return objM51918f;
                    }
                    notificationGenerationProcessor = this;
                }
            }
            if (z2) {
                c117681.label = 2;
                if (markNotificationAsDismissed(notificationGenerationJob, c117681) == objM51918f) {
                    return objM51918f;
                }
                return null;
            }
            notificationGenerationJob.setNotificationToDisplay(false);
            c117681.label = 3;
            if (postProcessNotification(notificationGenerationJob, true, false, c117681) == objM51918f) {
                return objM51918f;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return null;
        }
        notificationGenerationJob = (NotificationGenerationJob) c117681.L$1;
        notificationGenerationProcessor = (NotificationGenerationProcessor) c117681.L$0;
        wre.m54934b(obj);
        if (!notificationGenerationProcessor.shouldDisplayNotification(notificationGenerationJob)) {
            return ml1.m39301a(false);
        }
        notificationGenerationJob.setNotificationToDisplay(true);
        return ml1.m39301a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(NotificationGenerationJob notificationGenerationJob, boolean z, n64 n64Var) {
        C117721 c117721;
        if (n64Var instanceof C117721) {
            c117721 = (C117721) n64Var;
            int i = c117721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117721.label = i - Integer.MIN_VALUE;
            } else {
                c117721 = new C117721(n64Var);
            }
        }
        Object obj = c117721.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117721.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                Logging.debug$default("Saving Notification job: " + notificationGenerationJob, null, 2, null);
                JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
                JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                String strOptString = (!jsonPayload.has(Constants.MessagePayloadKeys.COLLAPSE_KEY) || sq8.m48644c("do_not_collapse", jsonPayload.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY))) ? null : jsonPayload.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
                long jOptLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                INotificationRepository iNotificationRepository = this._dataController;
                String strOptString2 = customJSONObject.optString("i");
                sq8.m48648g(strOptString2, "customJSON.optString(\"i\")");
                String strSafeString = JSONObjectExtensionsKt.safeString(jsonPayload, "grp");
                boolean zIsNotificationToDisplay = notificationGenerationJob.isNotificationToDisplay();
                boolean z2 = z;
                int androidId = notificationGenerationJob.getAndroidId();
                String strValueOf = notificationGenerationJob.getTitle() != null ? String.valueOf(notificationGenerationJob.getTitle()) : null;
                String strValueOf2 = notificationGenerationJob.getBody() != null ? String.valueOf(notificationGenerationJob.getBody()) : null;
                String string = jsonPayload.toString();
                sq8.m48648g(string, "jsonPayload.toString()");
                c117721.label = 1;
                if (iNotificationRepository.createNotification(strOptString2, strSafeString, strOptString, zIsNotificationToDisplay, z2, androidId, strValueOf, strValueOf2, jOptLong, string, c117721) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return y3i.f54824a;
    }

    private final boolean shouldDisplayNotification(NotificationGenerationJob notificationGenerationJob) {
        return notificationGenerationJob.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(notificationGenerationJob.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(NotificationGenerationJob notificationGenerationJob) {
        if (!this._applicationService.isInForeground()) {
            Logging.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!notificationGenerationJob.isRestoring()) {
            return true;
        }
        Logging.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0290 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    @Override // com.onesignal.notifications.internal.generation.INotificationGenerationProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i, JSONObject jSONObject, boolean z, long j, n64 n64Var) {
        C117691 c117691;
        int i2;
        JSONObject jSONObject2;
        boolean z2;
        long j2;
        Context context2;
        NotificationGenerationProcessor notificationGenerationProcessor;
        NotificationGenerationProcessor notificationGenerationProcessor2;
        Notification notification;
        boolean z3;
        Context context3;
        long j3;
        NotificationGenerationJob notificationGenerationJob;
        dge dgeVar;
        Notification notification2;
        NotificationGenerationJob notificationGenerationJob2;
        dge dgeVar2;
        int i3;
        boolean z4;
        C117702 c117702;
        dge dgeVar3;
        NotificationGenerationProcessor notificationGenerationProcessor3;
        boolean z5;
        Boolean bool;
        boolean z6;
        int i4;
        boolean z7;
        NotificationGenerationProcessor notificationGenerationProcessor4;
        NotificationGenerationJob notificationGenerationJob3;
        C117713 c117713;
        int i5;
        NotificationGenerationJob notificationGenerationJob4;
        NotificationGenerationProcessor notificationGenerationProcessor5;
        NotificationGenerationJob notificationGenerationJob5;
        Boolean bool2;
        int iBooleanValue;
        if (n64Var instanceof C117691) {
            c117691 = (C117691) n64Var;
            int i6 = c117691.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c117691.label = i6 - Integer.MIN_VALUE;
            } else {
                c117691 = new C117691(n64Var);
            }
        }
        Object objCanReceiveNotification = c117691.result;
        Object objM51918f = uq8.m51918f();
        switch (c117691.label) {
            case 0:
                wre.m54934b(objCanReceiveNotification);
                INotificationLifecycleService iNotificationLifecycleService = this._lifecycleService;
                c117691.L$0 = this;
                c117691.L$1 = context;
                c117691.L$2 = jSONObject;
                i2 = i;
                c117691.I$0 = i2;
                c117691.Z$0 = z;
                c117691.J$0 = j;
                c117691.label = 1;
                objCanReceiveNotification = iNotificationLifecycleService.canReceiveNotification(jSONObject, c117691);
                if (objCanReceiveNotification == objM51918f) {
                    return objM51918f;
                }
                jSONObject2 = jSONObject;
                z2 = z;
                j2 = j;
                context2 = context;
                notificationGenerationProcessor = this;
                if (((Boolean) objCanReceiveNotification).booleanValue()) {
                    return y3i.f54824a;
                }
                Notification notification3 = new Notification(null, jSONObject2, i2, notificationGenerationProcessor._time);
                if (z2) {
                    notificationGenerationProcessor2 = notificationGenerationProcessor;
                    notification = notification3;
                    z3 = z2;
                    notificationGenerationJob = new NotificationGenerationJob(notification, jSONObject2);
                    notificationGenerationJob.setShownTimeStamp(ml1.m39305e(j2));
                    notificationGenerationJob.setRestoring(z3);
                    dgeVar = new dge();
                    dgeVar.f19803a = true;
                    Logging.info$default("Fire remoteNotificationReceived", null, 2, null);
                    c117702 = notificationGenerationProcessor2.new C117702(new NotificationReceivedEvent(context2, notification), dgeVar, notification, null);
                    c117691.L$0 = notificationGenerationProcessor2;
                    c117691.L$1 = notification;
                    c117691.L$2 = notificationGenerationJob;
                    c117691.L$3 = dgeVar;
                    c117691.Z$0 = z3;
                    c117691.I$0 = 0;
                    c117691.label = 3;
                    if (rmh.m46984c(30000L, c117702, c117691) != objM51918f) {
                    }
                } else {
                    c117691.L$0 = notificationGenerationProcessor;
                    c117691.L$1 = context2;
                    c117691.L$2 = jSONObject2;
                    c117691.L$3 = notification3;
                    c117691.Z$0 = z2;
                    c117691.J$0 = j2;
                    c117691.label = 2;
                    Object objIsDuplicateNotification = notificationGenerationProcessor.isDuplicateNotification(notification3, c117691);
                    if (objIsDuplicateNotification == objM51918f) {
                        return objM51918f;
                    }
                    NotificationGenerationProcessor notificationGenerationProcessor6 = notificationGenerationProcessor;
                    notification = notification3;
                    objCanReceiveNotification = objIsDuplicateNotification;
                    notificationGenerationProcessor2 = notificationGenerationProcessor6;
                    context3 = context2;
                    j3 = j2;
                    if (!((Boolean) objCanReceiveNotification).booleanValue()) {
                        return y3i.f54824a;
                    }
                    z3 = z2;
                    long j4 = j3;
                    context2 = context3;
                    j2 = j4;
                    notificationGenerationJob = new NotificationGenerationJob(notification, jSONObject2);
                    notificationGenerationJob.setShownTimeStamp(ml1.m39305e(j2));
                    notificationGenerationJob.setRestoring(z3);
                    dgeVar = new dge();
                    dgeVar.f19803a = true;
                    Logging.info$default("Fire remoteNotificationReceived", null, 2, null);
                    try {
                        c117702 = notificationGenerationProcessor2.new C117702(new NotificationReceivedEvent(context2, notification), dgeVar, notification, null);
                        c117691.L$0 = notificationGenerationProcessor2;
                        c117691.L$1 = notification;
                        c117691.L$2 = notificationGenerationJob;
                        c117691.L$3 = dgeVar;
                        c117691.Z$0 = z3;
                        c117691.I$0 = 0;
                        c117691.label = 3;
                    } catch (omh e) {
                        e = e;
                        notification2 = notification;
                        notificationGenerationJob2 = notificationGenerationJob;
                        dgeVar2 = dgeVar;
                        i3 = 0;
                        z4 = z3;
                        Logging.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + dgeVar2.f19803a + '.', e);
                        boolean z8 = dgeVar2.f19803a;
                        c117691.L$0 = notificationGenerationProcessor2;
                        c117691.L$1 = notification2;
                        c117691.L$2 = notificationGenerationJob2;
                        c117691.L$3 = dgeVar2;
                        c117691.Z$0 = z4;
                        c117691.I$0 = i3;
                        c117691.label = 4;
                        objCanReceiveNotification = notificationGenerationProcessor2.processHandlerResponse(notificationGenerationJob2, z8, z4, c117691);
                        if (objCanReceiveNotification != objM51918f) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        notification2 = notification;
                        notificationGenerationJob2 = notificationGenerationJob;
                        dgeVar2 = dgeVar;
                        i3 = 0;
                        z4 = z3;
                        Logging.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                        boolean z82 = dgeVar2.f19803a;
                        c117691.L$0 = notificationGenerationProcessor2;
                        c117691.L$1 = notification2;
                        c117691.L$2 = notificationGenerationJob2;
                        c117691.L$3 = dgeVar2;
                        c117691.Z$0 = z4;
                        c117691.I$0 = i3;
                        c117691.label = 4;
                        objCanReceiveNotification = notificationGenerationProcessor2.processHandlerResponse(notificationGenerationJob2, z82, z4, c117691);
                        if (objCanReceiveNotification != objM51918f) {
                        }
                    }
                    if (rmh.m46984c(30000L, c117702, c117691) != objM51918f) {
                        return objM51918f;
                    }
                    notification2 = notification;
                    notificationGenerationJob2 = notificationGenerationJob;
                    dgeVar2 = dgeVar;
                    i3 = 0;
                    z4 = z3;
                    boolean z822 = dgeVar2.f19803a;
                    c117691.L$0 = notificationGenerationProcessor2;
                    c117691.L$1 = notification2;
                    c117691.L$2 = notificationGenerationJob2;
                    c117691.L$3 = dgeVar2;
                    c117691.Z$0 = z4;
                    c117691.I$0 = i3;
                    c117691.label = 4;
                    objCanReceiveNotification = notificationGenerationProcessor2.processHandlerResponse(notificationGenerationJob2, z822, z4, c117691);
                    if (objCanReceiveNotification != objM51918f) {
                        return objM51918f;
                    }
                    dgeVar3 = dgeVar2;
                    notificationGenerationProcessor3 = notificationGenerationProcessor2;
                    z5 = z4;
                    bool = (Boolean) objCanReceiveNotification;
                    if (bool != null) {
                        return y3i.f54824a;
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    if (!zBooleanValue) {
                        z6 = z5;
                        if (!notificationGenerationJob2.isRestoring()) {
                        }
                        if (!z6) {
                        }
                    } else if (notificationGenerationProcessor3.shouldFireForegroundHandlers(notificationGenerationJob2)) {
                        Logging.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                        dgeVar3.f19803a = true;
                        try {
                            c117713 = notificationGenerationProcessor3.new C117713(new NotificationWillDisplayEvent(notificationGenerationJob2.getNotification()), dgeVar3, notification2, null);
                            c117691.L$0 = notificationGenerationProcessor3;
                            c117691.L$1 = notificationGenerationJob2;
                            c117691.L$2 = dgeVar3;
                            c117691.L$3 = null;
                            c117691.Z$0 = z5;
                            c117691.I$0 = i3;
                            c117691.label = 5;
                        } catch (omh e2) {
                            e = e2;
                            notificationGenerationJob3 = notificationGenerationJob2;
                            Logging.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + dgeVar3.f19803a + '.', e);
                            i5 = i3;
                            z7 = z5;
                            dge dgeVar4 = dgeVar3;
                            notificationGenerationJob4 = notificationGenerationJob3;
                            notificationGenerationProcessor5 = notificationGenerationProcessor3;
                            boolean z9 = dgeVar4.f19803a;
                            c117691.L$0 = notificationGenerationProcessor5;
                            c117691.L$1 = notificationGenerationJob4;
                            c117691.L$2 = null;
                            c117691.L$3 = null;
                            c117691.Z$0 = z7;
                            c117691.I$0 = i5;
                            c117691.label = 6;
                            objCanReceiveNotification = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob4, z9, z7, c117691);
                            if (objCanReceiveNotification == objM51918f) {
                            }
                            bool2 = (Boolean) objCanReceiveNotification;
                            if (bool2 == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            notificationGenerationJob3 = notificationGenerationJob2;
                            Logging.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i5 = i3;
                            z7 = z5;
                            dge dgeVar42 = dgeVar3;
                            notificationGenerationJob4 = notificationGenerationJob3;
                            notificationGenerationProcessor5 = notificationGenerationProcessor3;
                            boolean z92 = dgeVar42.f19803a;
                            c117691.L$0 = notificationGenerationProcessor5;
                            c117691.L$1 = notificationGenerationJob4;
                            c117691.L$2 = null;
                            c117691.L$3 = null;
                            c117691.Z$0 = z7;
                            c117691.I$0 = i5;
                            c117691.label = 6;
                            objCanReceiveNotification = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob4, z92, z7, c117691);
                            if (objCanReceiveNotification == objM51918f) {
                            }
                            bool2 = (Boolean) objCanReceiveNotification;
                            if (bool2 == null) {
                            }
                        }
                        if (rmh.m46984c(30000L, c117713, c117691) == objM51918f) {
                            return objM51918f;
                        }
                        notificationGenerationJob3 = notificationGenerationJob2;
                        i5 = i3;
                        z7 = z5;
                        dge dgeVar422 = dgeVar3;
                        notificationGenerationJob4 = notificationGenerationJob3;
                        notificationGenerationProcessor5 = notificationGenerationProcessor3;
                        boolean z922 = dgeVar422.f19803a;
                        c117691.L$0 = notificationGenerationProcessor5;
                        c117691.L$1 = notificationGenerationJob4;
                        c117691.L$2 = null;
                        c117691.L$3 = null;
                        c117691.Z$0 = z7;
                        c117691.I$0 = i5;
                        c117691.label = 6;
                        objCanReceiveNotification = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob4, z922, z7, c117691);
                        if (objCanReceiveNotification == objM51918f) {
                            return objM51918f;
                        }
                        bool2 = (Boolean) objCanReceiveNotification;
                        if (bool2 == null) {
                            return y3i.f54824a;
                        }
                        boolean zBooleanValue2 = bool2.booleanValue();
                        notificationGenerationJob2 = notificationGenerationJob4;
                        notificationGenerationProcessor4 = notificationGenerationProcessor5;
                        i4 = i5;
                        zBooleanValue = zBooleanValue2;
                        if (!zBooleanValue) {
                            INotificationDisplayer iNotificationDisplayer = notificationGenerationProcessor4._notificationDisplayer;
                            c117691.L$0 = notificationGenerationProcessor4;
                            c117691.L$1 = notificationGenerationJob2;
                            c117691.L$2 = null;
                            c117691.L$3 = null;
                            c117691.Z$0 = z7;
                            c117691.label = 7;
                            objCanReceiveNotification = iNotificationDisplayer.displayNotification(notificationGenerationJob2, c117691);
                            if (objCanReceiveNotification == objM51918f) {
                                return objM51918f;
                            }
                            z6 = z7;
                            notificationGenerationJob5 = notificationGenerationJob2;
                            notificationGenerationJob2 = notificationGenerationJob5;
                            iBooleanValue = ((Boolean) objCanReceiveNotification).booleanValue();
                            notificationGenerationProcessor3 = notificationGenerationProcessor4;
                            i3 = iBooleanValue;
                            if (!notificationGenerationJob2.isRestoring()) {
                                boolean z10 = i3 != 0;
                                c117691.L$0 = null;
                                c117691.L$1 = null;
                                c117691.L$2 = null;
                                c117691.L$3 = null;
                                c117691.Z$0 = z6;
                                c117691.label = 8;
                                if (notificationGenerationProcessor3.postProcessNotification(notificationGenerationJob2, false, z10, c117691) == objM51918f) {
                                    return objM51918f;
                                }
                            }
                            if (!z6) {
                                return y3i.f54824a;
                            }
                            c117691.L$0 = null;
                            c117691.L$1 = null;
                            c117691.L$2 = null;
                            c117691.L$3 = null;
                            c117691.label = 9;
                            if (nk5.m40720b(100L, c117691) == objM51918f) {
                                return objM51918f;
                            }
                            return y3i.f54824a;
                        }
                        z6 = z7;
                        iBooleanValue = i4;
                        notificationGenerationProcessor3 = notificationGenerationProcessor4;
                        i3 = iBooleanValue;
                        if (!notificationGenerationJob2.isRestoring()) {
                        }
                        if (!z6) {
                        }
                    } else {
                        i4 = i3;
                        z7 = z5;
                        notificationGenerationProcessor4 = notificationGenerationProcessor3;
                        if (!zBooleanValue) {
                        }
                    }
                }
            case 1:
                long j5 = c117691.J$0;
                z2 = c117691.Z$0;
                int i7 = c117691.I$0;
                jSONObject2 = (JSONObject) c117691.L$2;
                context2 = (Context) c117691.L$1;
                NotificationGenerationProcessor notificationGenerationProcessor7 = (NotificationGenerationProcessor) c117691.L$0;
                wre.m54934b(objCanReceiveNotification);
                i2 = i7;
                notificationGenerationProcessor = notificationGenerationProcessor7;
                j2 = j5;
                if (((Boolean) objCanReceiveNotification).booleanValue()) {
                }
                break;
            case 2:
                j3 = c117691.J$0;
                z2 = c117691.Z$0;
                notification = (Notification) c117691.L$3;
                jSONObject2 = (JSONObject) c117691.L$2;
                context3 = (Context) c117691.L$1;
                notificationGenerationProcessor2 = (NotificationGenerationProcessor) c117691.L$0;
                wre.m54934b(objCanReceiveNotification);
                if (!((Boolean) objCanReceiveNotification).booleanValue()) {
                }
                break;
            case 3:
                i3 = c117691.I$0;
                z4 = c117691.Z$0;
                dgeVar2 = (dge) c117691.L$3;
                notificationGenerationJob2 = (NotificationGenerationJob) c117691.L$2;
                notification2 = (Notification) c117691.L$1;
                NotificationGenerationProcessor notificationGenerationProcessor8 = (NotificationGenerationProcessor) c117691.L$0;
                try {
                    wre.m54934b(objCanReceiveNotification);
                    notificationGenerationProcessor2 = notificationGenerationProcessor8;
                } catch (omh e3) {
                    e = e3;
                    notificationGenerationProcessor2 = notificationGenerationProcessor8;
                    Logging.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + dgeVar2.f19803a + '.', e);
                    boolean z8222 = dgeVar2.f19803a;
                    c117691.L$0 = notificationGenerationProcessor2;
                    c117691.L$1 = notification2;
                    c117691.L$2 = notificationGenerationJob2;
                    c117691.L$3 = dgeVar2;
                    c117691.Z$0 = z4;
                    c117691.I$0 = i3;
                    c117691.label = 4;
                    objCanReceiveNotification = notificationGenerationProcessor2.processHandlerResponse(notificationGenerationJob2, z8222, z4, c117691);
                    if (objCanReceiveNotification != objM51918f) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    notificationGenerationProcessor2 = notificationGenerationProcessor8;
                    Logging.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                    boolean z82222 = dgeVar2.f19803a;
                    c117691.L$0 = notificationGenerationProcessor2;
                    c117691.L$1 = notification2;
                    c117691.L$2 = notificationGenerationJob2;
                    c117691.L$3 = dgeVar2;
                    c117691.Z$0 = z4;
                    c117691.I$0 = i3;
                    c117691.label = 4;
                    objCanReceiveNotification = notificationGenerationProcessor2.processHandlerResponse(notificationGenerationJob2, z82222, z4, c117691);
                    if (objCanReceiveNotification != objM51918f) {
                    }
                }
                boolean z822222 = dgeVar2.f19803a;
                c117691.L$0 = notificationGenerationProcessor2;
                c117691.L$1 = notification2;
                c117691.L$2 = notificationGenerationJob2;
                c117691.L$3 = dgeVar2;
                c117691.Z$0 = z4;
                c117691.I$0 = i3;
                c117691.label = 4;
                objCanReceiveNotification = notificationGenerationProcessor2.processHandlerResponse(notificationGenerationJob2, z822222, z4, c117691);
                if (objCanReceiveNotification != objM51918f) {
                }
                break;
            case 4:
                int i8 = c117691.I$0;
                boolean z11 = c117691.Z$0;
                dge dgeVar5 = (dge) c117691.L$3;
                notificationGenerationJob2 = (NotificationGenerationJob) c117691.L$2;
                notification2 = (Notification) c117691.L$1;
                NotificationGenerationProcessor notificationGenerationProcessor9 = (NotificationGenerationProcessor) c117691.L$0;
                wre.m54934b(objCanReceiveNotification);
                z5 = z11;
                dgeVar3 = dgeVar5;
                i3 = i8;
                notificationGenerationProcessor3 = notificationGenerationProcessor9;
                bool = (Boolean) objCanReceiveNotification;
                if (bool != null) {
                }
                break;
            case 5:
                i3 = c117691.I$0;
                z5 = c117691.Z$0;
                dgeVar3 = (dge) c117691.L$2;
                notificationGenerationJob3 = (NotificationGenerationJob) c117691.L$1;
                notificationGenerationProcessor3 = (NotificationGenerationProcessor) c117691.L$0;
                try {
                    wre.m54934b(objCanReceiveNotification);
                } catch (omh e4) {
                    e = e4;
                    Logging.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + dgeVar3.f19803a + '.', e);
                    i5 = i3;
                    z7 = z5;
                    dge dgeVar4222 = dgeVar3;
                    notificationGenerationJob4 = notificationGenerationJob3;
                    notificationGenerationProcessor5 = notificationGenerationProcessor3;
                    boolean z9222 = dgeVar4222.f19803a;
                    c117691.L$0 = notificationGenerationProcessor5;
                    c117691.L$1 = notificationGenerationJob4;
                    c117691.L$2 = null;
                    c117691.L$3 = null;
                    c117691.Z$0 = z7;
                    c117691.I$0 = i5;
                    c117691.label = 6;
                    objCanReceiveNotification = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob4, z9222, z7, c117691);
                    if (objCanReceiveNotification == objM51918f) {
                    }
                    bool2 = (Boolean) objCanReceiveNotification;
                    if (bool2 == null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Logging.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                    i5 = i3;
                    z7 = z5;
                    dge dgeVar42222 = dgeVar3;
                    notificationGenerationJob4 = notificationGenerationJob3;
                    notificationGenerationProcessor5 = notificationGenerationProcessor3;
                    boolean z92222 = dgeVar42222.f19803a;
                    c117691.L$0 = notificationGenerationProcessor5;
                    c117691.L$1 = notificationGenerationJob4;
                    c117691.L$2 = null;
                    c117691.L$3 = null;
                    c117691.Z$0 = z7;
                    c117691.I$0 = i5;
                    c117691.label = 6;
                    objCanReceiveNotification = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob4, z92222, z7, c117691);
                    if (objCanReceiveNotification == objM51918f) {
                    }
                    bool2 = (Boolean) objCanReceiveNotification;
                    if (bool2 == null) {
                    }
                }
                i5 = i3;
                z7 = z5;
                dge dgeVar422222 = dgeVar3;
                notificationGenerationJob4 = notificationGenerationJob3;
                notificationGenerationProcessor5 = notificationGenerationProcessor3;
                boolean z922222 = dgeVar422222.f19803a;
                c117691.L$0 = notificationGenerationProcessor5;
                c117691.L$1 = notificationGenerationJob4;
                c117691.L$2 = null;
                c117691.L$3 = null;
                c117691.Z$0 = z7;
                c117691.I$0 = i5;
                c117691.label = 6;
                objCanReceiveNotification = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob4, z922222, z7, c117691);
                if (objCanReceiveNotification == objM51918f) {
                }
                bool2 = (Boolean) objCanReceiveNotification;
                if (bool2 == null) {
                }
                break;
            case 6:
                i5 = c117691.I$0;
                z7 = c117691.Z$0;
                notificationGenerationJob4 = (NotificationGenerationJob) c117691.L$1;
                notificationGenerationProcessor5 = (NotificationGenerationProcessor) c117691.L$0;
                wre.m54934b(objCanReceiveNotification);
                bool2 = (Boolean) objCanReceiveNotification;
                if (bool2 == null) {
                }
                break;
            case 7:
                z6 = c117691.Z$0;
                notificationGenerationJob5 = (NotificationGenerationJob) c117691.L$1;
                notificationGenerationProcessor4 = (NotificationGenerationProcessor) c117691.L$0;
                wre.m54934b(objCanReceiveNotification);
                notificationGenerationJob2 = notificationGenerationJob5;
                iBooleanValue = ((Boolean) objCanReceiveNotification).booleanValue();
                notificationGenerationProcessor3 = notificationGenerationProcessor4;
                i3 = iBooleanValue;
                if (!notificationGenerationJob2.isRestoring()) {
                }
                if (!z6) {
                }
                break;
            case 8:
                z6 = c117691.Z$0;
                wre.m54934b(objCanReceiveNotification);
                if (!z6) {
                }
                break;
            case 9:
                wre.m54934b(objCanReceiveNotification);
                return y3i.f54824a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
