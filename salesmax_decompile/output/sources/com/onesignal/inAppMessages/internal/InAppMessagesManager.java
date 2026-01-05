package com.onesignal.inAppMessages.internal;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.C11630R;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.inAppMessages.InAppMessageActionUrlType;
import com.onesignal.inAppMessages.internal.InAppMessagesManager;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.common.InAppHelper;
import com.onesignal.inAppMessages.internal.common.OneSignalChromeTab;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.inAppMessages.internal.triggers.TriggerModel;
import com.onesignal.inAppMessages.internal.triggers.TriggerModelStore;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.IUserManager;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.ISubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpStatus;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.azh;
import p001o.bh3;
import p001o.cl3;
import p001o.eu5;
import p001o.gge;
import p001o.jgg;
import p001o.kf9;
import p001o.kh3;
import p001o.kt7;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.nqb;
import p001o.o64;
import p001o.rm1;
import p001o.sq8;
import p001o.tqb;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class InAppMessagesManager implements IInAppMessagesManager, IStartableService, ISubscriptionChangedHandler, ISingletonModelStoreChangeHandler<ConfigModel>, IInAppLifecycleEventHandler, ITriggerHandler, ISessionLifecycleHandler, IApplicationLifecycleHandler {
    private final IApplicationService _applicationService;
    private final IInAppBackendService _backend;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IInAppDisplayer _displayer;
    private final IdentityModelStore _identityModelStore;
    private final IInfluenceManager _influenceManager;
    private final ILanguageContext _languageContext;
    private final IInAppLifecycleService _lifecycle;
    private final IOutcomeEventsController _outcomeEventsController;
    private final IInAppPreferencesController _prefs;
    private final IInAppRepository _repository;
    private final ISessionService _sessionService;
    private final InAppStateService _state;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private final ITriggerController _triggerController;
    private final TriggerModelStore _triggerModelStore;
    private final IUserManager _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final nqb fetchIAMMutex;
    private final InAppMessagesManager$identityModelChangeHandler$1 identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private Long lastTimeFetchedIAMs;
    private final EventProducer<IInAppMessageLifecycleListener> lifecycleCallback;
    private final EventProducer<IInAppMessageClickListener> messageClickCallback;
    private final List<InAppMessage> messageDisplayQueue;
    private final nqb messageDisplayQueueMutex;
    private List<InAppMessage> messages;
    private final List<InAppMessage> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {412, 968, 442, 449, 453}, m36650m = "attemptToShowInAppMessage")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$attemptToShowInAppMessage$1 */
    public static final class C116311 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C116311(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.attemptToShowInAppMessage(this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {335}, m36650m = "evaluateInAppMessages")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$evaluateInAppMessages$1 */
    public static final class C116321 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116321(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.evaluateInAppMessages(this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {968, DefaultRedirectStrategy.SC_PERMANENT_REDIRECT, MediaError.DetailedErrorCode.HLS_NETWORK_PLAYLIST}, m36650m = "fetchMessages")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessages$1 */
    public static final class C116331 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C116331(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.fetchMessages(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessagesWhenConditionIsMet$1", m36648f = "InAppMessagesManager.kt", m36649l = {271, 272, 275}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessagesWhenConditionIsMet$1 */
    public static final class C116341 extends jgg implements xk7 {
        int label;

        public C116341(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116341(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RywData rywData;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                String onesignalId = InAppMessagesManager.this._userManager.getOnesignalId();
                IConsistencyManager iConsistencyManager = InAppMessagesManager.this._consistencyManager;
                IamFetchReadyCondition iamFetchReadyCondition = new IamFetchReadyCondition(onesignalId);
                this.label = 1;
                obj = iConsistencyManager.getRywDataFromAwaitableCondition(iamFetchReadyCondition, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    wre.m54934b(obj);
                    rywData = (RywData) obj;
                    if (rywData != null) {
                        InAppMessagesManager inAppMessagesManager = InAppMessagesManager.this;
                        this.label = 3;
                        if (inAppMessagesManager.fetchMessages(rywData, this) == objM51918f) {
                            return objM51918f;
                        }
                    }
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            this.label = 2;
            obj = ((cl3) obj).mo21334s(this);
            if (obj == objM51918f) {
                return objM51918f;
            }
            rywData = (RywData) obj;
            if (rywData != null) {
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116341) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {773, 775, 777}, m36650m = "fireOutcomesForClick")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$fireOutcomesForClick$1 */
    public static final class C116351 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116351(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.fireOutcomesForClick(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$firePublicClickHandler$2", m36648f = "InAppMessagesManager.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$firePublicClickHandler$2 */
    public static final class C116362 extends jgg implements nl7 {
        final /* synthetic */ InAppMessageClickEvent $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116362(InAppMessageClickEvent inAppMessageClickEvent, n64 n64Var) {
            super(2, n64Var);
            this.$result = inAppMessageClickEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C116362 c116362 = new C116362(this.$result, n64Var);
            c116362.L$0 = obj;
            return c116362;
        }

        @Override // p001o.nl7
        public final Object invoke(IInAppMessageClickListener iInAppMessageClickListener, n64 n64Var) {
            return ((C116362) create(iInAppMessageClickListener, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            ((IInAppMessageClickListener) this.L$0).onClick(this.$result);
            return y3i.f54824a;
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {924}, m36650m = "fireRESTCallForClick")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$fireRESTCallForClick$1 */
    public static final class C116371 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C116371(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.fireRESTCallForClick(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {887}, m36650m = "fireRESTCallForPageChange")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$fireRESTCallForPageChange$1 */
    public static final class C116381 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116381(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {475, HttpStatus.SC_NOT_IMPLEMENTED, HttpStatus.SC_GATEWAY_TIMEOUT}, m36650m = "messageWasDismissed")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$messageWasDismissed$1 */
    public static final class C116401 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116401(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.messageWasDismissed(null, false, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$messageWasDismissed$2 */
    public static final class C116412 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116412(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppMessageLifecycleListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
            sq8.m48649h(iInAppMessageLifecycleListener, "it");
            iInAppMessageLifecycleListener.onDidDismiss(new InAppMessageLifecycleEvent(this.$message));
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnMessage$1", m36648f = "InAppMessagesManager.kt", m36649l = {665, 666, 668, 670}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnMessage$1 */
    public static final class C116421 extends jgg implements xk7 {
        final /* synthetic */ InAppMessageClickResult $action;
        final /* synthetic */ InAppMessage $message;
        int label;
        final /* synthetic */ InAppMessagesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116421(InAppMessageClickResult inAppMessageClickResult, InAppMessage inAppMessage, InAppMessagesManager inAppMessagesManager, n64 n64Var) {
            super(1, n64Var);
            this.$action = inAppMessageClickResult;
            this.$message = inAppMessage;
            this.this$0 = inAppMessagesManager;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C116421(this.$action, this.$message, this.this$0, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InAppMessagesManager inAppMessagesManager;
            InAppMessage inAppMessage;
            InAppMessageClickResult inAppMessageClickResult;
            InAppMessagesManager inAppMessagesManager2;
            String messageId;
            List<InAppMessageOutcome> outcomes;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                InAppMessagesManager inAppMessagesManager3 = this.this$0;
                InAppMessage inAppMessage2 = this.$message;
                InAppMessageClickResult inAppMessageClickResult2 = this.$action;
                this.label = 1;
                if (inAppMessagesManager3.firePublicClickHandler(inAppMessage2, inAppMessageClickResult2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            wre.m54934b(obj);
                            return y3i.f54824a;
                        }
                        wre.m54934b(obj);
                        this.this$0.fireTagCallForClick(this.$action);
                        inAppMessagesManager2 = this.this$0;
                        messageId = this.$message.getMessageId();
                        outcomes = this.$action.getOutcomes();
                        this.label = 4;
                        if (inAppMessagesManager2.fireOutcomesForClick(messageId, outcomes, this) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    wre.m54934b(obj);
                    this.this$0.fireClickAction(this.$action);
                    inAppMessagesManager = this.this$0;
                    inAppMessage = this.$message;
                    inAppMessageClickResult = this.$action;
                    this.label = 3;
                    if (inAppMessagesManager.fireRESTCallForClick(inAppMessage, inAppMessageClickResult, this) == objM51918f) {
                        return objM51918f;
                    }
                    this.this$0.fireTagCallForClick(this.$action);
                    inAppMessagesManager2 = this.this$0;
                    messageId = this.$message.getMessageId();
                    outcomes = this.$action.getOutcomes();
                    this.label = 4;
                    if (inAppMessagesManager2.fireOutcomesForClick(messageId, outcomes, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            InAppMessagesManager inAppMessagesManager4 = this.this$0;
            InAppMessage inAppMessage3 = this.$message;
            List<InAppMessagePrompt> prompts = this.$action.getPrompts();
            this.label = 2;
            if (inAppMessagesManager4.beginProcessingPrompts(inAppMessage3, prompts, this) == objM51918f) {
                return objM51918f;
            }
            this.this$0.fireClickAction(this.$action);
            inAppMessagesManager = this.this$0;
            inAppMessage = this.$message;
            inAppMessageClickResult = this.$action;
            this.label = 3;
            if (inAppMessagesManager.fireRESTCallForClick(inAppMessage, inAppMessageClickResult, this) == objM51918f) {
            }
            this.this$0.fireTagCallForClick(this.$action);
            inAppMessagesManager2 = this.this$0;
            messageId = this.$message.getMessageId();
            outcomes = this.$action.getOutcomes();
            this.label = 4;
            if (inAppMessagesManager2.fireOutcomesForClick(messageId, outcomes, this) == objM51918f) {
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116421) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnPreview$1", m36648f = "InAppMessagesManager.kt", m36649l = {652, 653}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnPreview$1 */
    public static final class C116431 extends jgg implements xk7 {
        final /* synthetic */ InAppMessageClickResult $action;
        final /* synthetic */ InAppMessage $message;
        int label;
        final /* synthetic */ InAppMessagesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116431(InAppMessageClickResult inAppMessageClickResult, InAppMessage inAppMessage, InAppMessagesManager inAppMessagesManager, n64 n64Var) {
            super(1, n64Var);
            this.$action = inAppMessageClickResult;
            this.$message = inAppMessage;
            this.this$0 = inAppMessagesManager;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C116431(this.$action, this.$message, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                InAppMessagesManager inAppMessagesManager = this.this$0;
                InAppMessage inAppMessage = this.$message;
                InAppMessageClickResult inAppMessageClickResult = this.$action;
                this.label = 1;
                if (inAppMessagesManager.firePublicClickHandler(inAppMessage, inAppMessageClickResult, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    this.this$0.fireClickAction(this.$action);
                    this.this$0.logInAppMessagePreviewActions(this.$action);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            InAppMessagesManager inAppMessagesManager2 = this.this$0;
            InAppMessage inAppMessage2 = this.$message;
            List<InAppMessagePrompt> prompts = this.$action.getPrompts();
            this.label = 2;
            if (inAppMessagesManager2.beginProcessingPrompts(inAppMessage2, prompts, this) == objM51918f) {
                return objM51918f;
            }
            this.this$0.fireClickAction(this.$action);
            this.this$0.logInAppMessagePreviewActions(this.$action);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116431) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessagePageChanged$1", m36648f = "InAppMessagesManager.kt", m36649l = {683}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessagePageChanged$1 */
    public static final class C116441 extends jgg implements xk7 {
        final /* synthetic */ InAppMessage $message;
        final /* synthetic */ InAppMessagePage $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116441(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage, n64 n64Var) {
            super(1, n64Var);
            this.$message = inAppMessage;
            this.$page = inAppMessagePage;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116441(this.$message, this.$page, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                InAppMessagesManager inAppMessagesManager = InAppMessagesManager.this;
                InAppMessage inAppMessage = this.$message;
                InAppMessagePage inAppMessagePage = this.$page;
                this.label = 1;
                if (inAppMessagesManager.fireRESTCallForPageChange(inAppMessage, inAppMessagePage, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116441) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDismissed$1", m36648f = "InAppMessagesManager.kt", m36649l = {697}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDismissed$1 */
    public static final class C116451 extends jgg implements xk7 {
        final /* synthetic */ InAppMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116451(InAppMessage inAppMessage, n64 n64Var) {
            super(1, n64Var);
            this.$message = inAppMessage;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116451(this.$message, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                InAppMessagesManager inAppMessagesManager = InAppMessagesManager.this;
                InAppMessage inAppMessage = this.$message;
                this.label = 1;
                if (InAppMessagesManager.messageWasDismissed$default(inAppMessagesManager, inAppMessage, false, this, 2, null) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116451) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDisplayed$1 */
    public static final class C116461 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116461(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppMessageLifecycleListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
            sq8.m48649h(iInAppMessageLifecycleListener, "it");
            iInAppMessageLifecycleListener.onDidDisplay(new InAppMessageLifecycleEvent(this.$message));
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDisplayed$2", m36648f = "InAppMessagesManager.kt", m36649l = {630}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDisplayed$2 */
    public static final class C116472 extends jgg implements xk7 {
        final /* synthetic */ InAppMessage $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116472(String str, InAppMessage inAppMessage, n64 n64Var) {
            super(1, n64Var);
            this.$variantId = str;
            this.$message = inAppMessage;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116472(this.$variantId, this.$message, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    IInAppBackendService iInAppBackendService = InAppMessagesManager.this._backend;
                    String appId = InAppMessagesManager.this._configModelStore.getModel().getAppId();
                    String id = InAppMessagesManager.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    if (iInAppBackendService.sendIAMImpression(appId, id, str, messageId, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                InAppMessagesManager.this._prefs.setImpressionesMessagesId(InAppMessagesManager.this.impressionedMessages);
            } catch (BackendException unused) {
                InAppMessagesManager.this.impressionedMessages.remove(this.$message.getMessageId());
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116472) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWillDismiss$1 */
    public static final class C116481 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116481(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppMessageLifecycleListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
            sq8.m48649h(iInAppMessageLifecycleListener, "it");
            iInAppMessageLifecycleListener.onWillDismiss(new InAppMessageLifecycleEvent(this.$message));
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWillDisplay$1 */
    public static final class C116491 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116491(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppMessageLifecycleListener) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
            sq8.m48649h(iInAppMessageLifecycleListener, "it");
            iInAppMessageLifecycleListener.onWillDisplay(new InAppMessageLifecycleEvent(this.$message));
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onTriggerChanged$1", m36648f = "InAppMessagesManager.kt", m36649l = {745}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onTriggerChanged$1 */
    public static final class C116501 extends jgg implements xk7 {
        int label;

        public C116501(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116501(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                InAppMessagesManager inAppMessagesManager = InAppMessagesManager.this;
                this.label = 1;
                if (inAppMessagesManager.evaluateInAppMessages(this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116501) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onTriggerConditionChanged$1", m36648f = "InAppMessagesManager.kt", m36649l = {733}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$onTriggerConditionChanged$1 */
    public static final class C116511 extends jgg implements xk7 {
        int label;

        public C116511(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116511(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                InAppMessagesManager inAppMessagesManager = InAppMessagesManager.this;
                this.label = 1;
                if (inAppMessagesManager.evaluateInAppMessages(this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116511) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {542}, m36650m = "persistInAppMessage")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$persistInAppMessage$1 */
    public static final class C116521 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116521(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.persistInAppMessage(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {968, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED}, m36650m = "queueMessageForDisplay")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$queueMessageForDisplay$1 */
    public static final class C116531 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C116531(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.queueMessageForDisplay(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", m36648f = "InAppMessagesManager.kt", m36649l = {808, 822}, m36650m = "showMultiplePrompts")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$showMultiplePrompts$1 */
    public static final class C116541 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C116541(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagesManager.this.showMultiplePrompts(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$start$1", m36648f = "InAppMessagesManager.kt", m36649l = {Opcodes.ARRAYLENGTH, Opcodes.INSTANCEOF}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$start$1 */
    public static final class C116551 extends jgg implements xk7 {
        Object L$0;
        int label;

        public C116551(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return InAppMessagesManager.this.new C116551(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[LOOP:0: B:18:0x005c->B:20:0x0062, LOOP_END] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IInAppRepository iInAppRepository = InAppMessagesManager.this._repository;
                this.label = 1;
                if (iInAppRepository.cleanCachedInAppMessages(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    wre.m54934b(obj);
                    list.addAll((Collection) obj);
                    it = InAppMessagesManager.this.redisplayedInAppMessages.iterator();
                    while (it.hasNext()) {
                        ((InAppMessage) it.next()).setDisplayedInSession(false);
                    }
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            List list2 = InAppMessagesManager.this.redisplayedInAppMessages;
            IInAppRepository iInAppRepository2 = InAppMessagesManager.this._repository;
            this.L$0 = list2;
            this.label = 2;
            Object objListInAppMessages = iInAppRepository2.listInAppMessages(this);
            if (objListInAppMessages == objM51918f) {
                return objM51918f;
            }
            list = list2;
            obj = objListInAppMessages;
            list.addAll((Collection) obj);
            it = InAppMessagesManager.this.redisplayedInAppMessages.iterator();
            while (it.hasNext()) {
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116551) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1] */
    public InAppMessagesManager(IApplicationService iApplicationService, ISessionService iSessionService, IInfluenceManager iInfluenceManager, ConfigModelStore configModelStore, IUserManager iUserManager, IdentityModelStore identityModelStore, ISubscriptionManager iSubscriptionManager, IOutcomeEventsController iOutcomeEventsController, InAppStateService inAppStateService, IInAppPreferencesController iInAppPreferencesController, IInAppRepository iInAppRepository, IInAppBackendService iInAppBackendService, ITriggerController iTriggerController, TriggerModelStore triggerModelStore, IInAppDisplayer iInAppDisplayer, IInAppLifecycleService iInAppLifecycleService, ILanguageContext iLanguageContext, ITime iTime, IConsistencyManager iConsistencyManager) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iSessionService, "_sessionService");
        sq8.m48649h(iInfluenceManager, "_influenceManager");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iUserManager, "_userManager");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        sq8.m48649h(iOutcomeEventsController, "_outcomeEventsController");
        sq8.m48649h(inAppStateService, "_state");
        sq8.m48649h(iInAppPreferencesController, "_prefs");
        sq8.m48649h(iInAppRepository, "_repository");
        sq8.m48649h(iInAppBackendService, "_backend");
        sq8.m48649h(iTriggerController, "_triggerController");
        sq8.m48649h(triggerModelStore, "_triggerModelStore");
        sq8.m48649h(iInAppDisplayer, "_displayer");
        sq8.m48649h(iInAppLifecycleService, "_lifecycle");
        sq8.m48649h(iLanguageContext, "_languageContext");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(iConsistencyManager, "_consistencyManager");
        this._applicationService = iApplicationService;
        this._sessionService = iSessionService;
        this._influenceManager = iInfluenceManager;
        this._configModelStore = configModelStore;
        this._userManager = iUserManager;
        this._identityModelStore = identityModelStore;
        this._subscriptionManager = iSubscriptionManager;
        this._outcomeEventsController = iOutcomeEventsController;
        this._state = inAppStateService;
        this._prefs = iInAppPreferencesController;
        this._repository = iInAppRepository;
        this._backend = iInAppBackendService;
        this._triggerController = iTriggerController;
        this._triggerModelStore = triggerModelStore;
        this._displayer = iInAppDisplayer;
        this._lifecycle = iInAppLifecycleService;
        this._languageContext = iLanguageContext;
        this._time = iTime;
        this._consistencyManager = iConsistencyManager;
        this.lifecycleCallback = new EventProducer<>();
        this.messageClickCallback = new EventProducer<>();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = tqb.m50340b(false, 1, null);
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = tqb.m50340b(false, 1, null);
        this.identityModelChangeHandler = new ISingletonModelStoreChangeHandler<IdentityModel>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1
            @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
            public void onModelReplaced(IdentityModel identityModel, String str) {
                sq8.m48649h(identityModel, "model");
                sq8.m48649h(str, "tag");
            }

            @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
            public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
                sq8.m48649h(modelChangedArgs, "args");
                sq8.m48649h(str, "tag");
                if (sq8.m48644c(modelChangedArgs.getProperty(), IdentityConstants.ONESIGNAL_ID)) {
                    Object oldValue = modelChangedArgs.getOldValue();
                    sq8.m48647f(oldValue, "null cannot be cast to non-null type kotlin.String");
                    Object newValue = modelChangedArgs.getNewValue();
                    sq8.m48647f(newValue, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) newValue;
                    IDManager iDManager = IDManager.INSTANCE;
                    if (!iDManager.isLocalId((String) oldValue) || iDManager.isLocalId(str2)) {
                        return;
                    }
                    ThreadUtilsKt.suspendifyOnThread$default(0, new C11639xf589f1e7(this.this$0, str2, null), 1, null);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:34:0x00a6, B:36:0x00c2, B:44:0x00ff, B:37:0x00c8, B:39:0x00d0, B:40:0x00d6, B:42:0x00de, B:43:0x00e4), top: B:70:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:34:0x00a6, B:36:0x00c2, B:44:0x00ff, B:37:0x00c8, B:39:0x00d0, B:40:0x00d6, B:42:0x00de, B:43:0x00e4), top: B:70:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(n64 n64Var) {
        C116311 c116311;
        InAppMessagesManager inAppMessagesManager;
        nqb nqbVar;
        InAppMessagesManager inAppMessagesManager2;
        gge ggeVar;
        Object obj;
        InAppMessagesManager inAppMessagesManager3;
        Boolean bool;
        if (n64Var instanceof C116311) {
            c116311 = (C116311) n64Var;
            int i = c116311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116311.label = i - Integer.MIN_VALUE;
            } else {
                c116311 = new C116311(n64Var);
            }
        }
        Object objWaitUntilSystemConditionsAvailable = c116311.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116311.label;
        if (i2 == 0) {
            wre.m54934b(objWaitUntilSystemConditionsAvailable);
            IApplicationService iApplicationService = this._applicationService;
            c116311.L$0 = this;
            c116311.label = 1;
            objWaitUntilSystemConditionsAvailable = iApplicationService.waitUntilSystemConditionsAvailable(c116311);
            if (objWaitUntilSystemConditionsAvailable == objM51918f) {
                return objM51918f;
            }
            inAppMessagesManager = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            wre.m54934b(objWaitUntilSystemConditionsAvailable);
                            return y3i.f54824a;
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(objWaitUntilSystemConditionsAvailable);
                        return y3i.f54824a;
                    }
                    ggeVar = (gge) c116311.L$1;
                    inAppMessagesManager3 = (InAppMessagesManager) c116311.L$0;
                    wre.m54934b(objWaitUntilSystemConditionsAvailable);
                    bool = (Boolean) objWaitUntilSystemConditionsAvailable;
                    if (bool != null) {
                        inAppMessagesManager3._state.setInAppMessageIdShowing(null);
                        Object obj2 = ggeVar.f25106a;
                        sq8.m48646e(obj2);
                        c116311.L$0 = null;
                        c116311.L$1 = null;
                        c116311.label = 4;
                        if (inAppMessagesManager3.queueMessageForDisplay((InAppMessage) obj2, c116311) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    if (sq8.m48644c(bool, ml1.m39301a(false))) {
                        inAppMessagesManager3._state.setInAppMessageIdShowing(null);
                        azh.m18048a(inAppMessagesManager3.messages).remove(ggeVar.f25106a);
                        Object obj3 = ggeVar.f25106a;
                        sq8.m48646e(obj3);
                        c116311.L$0 = null;
                        c116311.L$1 = null;
                        c116311.label = 5;
                        if (inAppMessagesManager3.messageWasDismissed((InAppMessage) obj3, true, c116311) == objM51918f) {
                            return objM51918f;
                        }
                        return y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                nqb nqbVar2 = (nqb) c116311.L$2;
                gge ggeVar2 = (gge) c116311.L$1;
                inAppMessagesManager2 = (InAppMessagesManager) c116311.L$0;
                wre.m54934b(objWaitUntilSystemConditionsAvailable);
                nqbVar = nqbVar2;
                ggeVar = ggeVar2;
                try {
                    Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + inAppMessagesManager2.messageDisplayQueue, null, 2, null);
                    if (!inAppMessagesManager2.getPaused()) {
                        Logging.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                    } else if (inAppMessagesManager2.messageDisplayQueue.isEmpty()) {
                        Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                    } else if (inAppMessagesManager2._state.getInAppMessageIdShowing() != null) {
                        Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                    } else {
                        Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                        InAppMessage inAppMessageRemove = inAppMessagesManager2.messageDisplayQueue.remove(0);
                        ggeVar.f25106a = inAppMessageRemove;
                        InAppStateService inAppStateService = inAppMessagesManager2._state;
                        sq8.m48646e(inAppMessageRemove);
                        inAppStateService.setInAppMessageIdShowing(inAppMessageRemove.getMessageId());
                    }
                    y3i y3iVar = y3i.f54824a;
                    nqbVar.mo40923c(null);
                    obj = ggeVar.f25106a;
                    if (obj != null) {
                        IInAppDisplayer iInAppDisplayer = inAppMessagesManager2._displayer;
                        sq8.m48646e(obj);
                        c116311.L$0 = inAppMessagesManager2;
                        c116311.L$1 = ggeVar;
                        c116311.L$2 = null;
                        c116311.label = 3;
                        objWaitUntilSystemConditionsAvailable = iInAppDisplayer.displayMessage((InAppMessage) obj, c116311);
                        if (objWaitUntilSystemConditionsAvailable == objM51918f) {
                            return objM51918f;
                        }
                        inAppMessagesManager3 = inAppMessagesManager2;
                        bool = (Boolean) objWaitUntilSystemConditionsAvailable;
                        if (bool != null) {
                        }
                    }
                    return y3i.f54824a;
                } catch (Throwable th) {
                    nqbVar.mo40923c(null);
                    throw th;
                }
            }
            inAppMessagesManager = (InAppMessagesManager) c116311.L$0;
            wre.m54934b(objWaitUntilSystemConditionsAvailable);
        }
        if (!((Boolean) objWaitUntilSystemConditionsAvailable).booleanValue()) {
            Logging.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
            return y3i.f54824a;
        }
        gge ggeVar3 = new gge();
        nqbVar = inAppMessagesManager.messageDisplayQueueMutex;
        c116311.L$0 = inAppMessagesManager;
        c116311.L$1 = ggeVar3;
        c116311.L$2 = nqbVar;
        c116311.label = 2;
        if (nqbVar.mo40922b(null, c116311) == objM51918f) {
            return objM51918f;
        }
        inAppMessagesManager2 = inAppMessagesManager;
        ggeVar = ggeVar3;
        Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + inAppMessagesManager2.messageDisplayQueue, null, 2, null);
        if (!inAppMessagesManager2.getPaused()) {
        }
        y3i y3iVar2 = y3i.f54824a;
        nqbVar.mo40923c(null);
        obj = ggeVar.f25106a;
        if (obj != null) {
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, n64 n64Var) {
        if (!(!list.isEmpty())) {
            return y3i.f54824a;
        }
        Logging.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + inAppMessage, null, 2, null);
        this._displayer.dismissCurrentInAppMessage();
        Object objShowMultiplePrompts = showMultiplePrompts(inAppMessage, list, n64Var);
        return objShowMultiplePrompts == uq8.m51918f() ? objShowMultiplePrompts : y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(n64 n64Var) {
        C116321 c116321;
        InAppMessagesManager inAppMessagesManager;
        Iterator it;
        if (n64Var instanceof C116321) {
            c116321 = (C116321) n64Var;
            int i = c116321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116321.label = i - Integer.MIN_VALUE;
            } else {
                c116321 = new C116321(n64Var);
            }
        }
        Object obj = c116321.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116321.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            Logging.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
            ArrayList arrayList = new ArrayList();
            synchronized (this.messages) {
                for (InAppMessage inAppMessage : this.messages) {
                    if (this._triggerController.evaluateMessageTriggers(inAppMessage)) {
                        setDataForRedisplay(inAppMessage);
                        if (!this.dismissedMessages.contains(inAppMessage.getMessageId()) && !inAppMessage.isFinished()) {
                            arrayList.add(inAppMessage);
                        }
                    }
                }
                y3i y3iVar = y3i.f54824a;
            }
            inAppMessagesManager = this;
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c116321.L$1;
            inAppMessagesManager = (InAppMessagesManager) c116321.L$0;
            wre.m54934b(obj);
        }
        while (it.hasNext()) {
            InAppMessage inAppMessage2 = (InAppMessage) it.next();
            c116321.L$0 = inAppMessagesManager;
            c116321.L$1 = it;
            c116321.label = 1;
            if (inAppMessagesManager.queueMessageForDisplay(inAppMessage2, c116321) == objM51918f) {
                return objM51918f;
            }
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(RywData rywData, n64 n64Var) {
        C116331 c116331;
        RywData rywData2;
        String str;
        nqb nqbVar;
        String str2;
        InAppMessagesManager inAppMessagesManager;
        InAppMessagesManager inAppMessagesManager2;
        List list;
        if (n64Var instanceof C116331) {
            c116331 = (C116331) n64Var;
            int i = c116331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116331.label = i - Integer.MIN_VALUE;
            } else {
                c116331 = new C116331(n64Var);
            }
        }
        Object obj = c116331.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116331.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                if (!this._applicationService.isInForeground()) {
                    return y3i.f54824a;
                }
                String appId = this._configModelStore.getModel().getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                if (!(id.length() == 0) && !IDManager.INSTANCE.isLocalId(id)) {
                    if (!(appId.length() == 0)) {
                        nqb nqbVar2 = this.fetchIAMMutex;
                        c116331.L$0 = this;
                        rywData2 = rywData;
                        c116331.L$1 = rywData2;
                        c116331.L$2 = appId;
                        c116331.L$3 = id;
                        c116331.L$4 = nqbVar2;
                        c116331.label = 1;
                        if (nqbVar2.mo40922b(null, c116331) == objM51918f) {
                            return objM51918f;
                        }
                        str = id;
                        nqbVar = nqbVar2;
                        str2 = appId;
                        inAppMessagesManager = this;
                    }
                }
                return y3i.f54824a;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                inAppMessagesManager2 = (InAppMessagesManager) c116331.L$0;
                wre.m54934b(obj);
                list = (List) obj;
                if (list != null) {
                    return y3i.f54824a;
                }
                inAppMessagesManager2.messages = azh.m18050c(list);
                c116331.L$0 = null;
                c116331.label = 3;
                if (inAppMessagesManager2.evaluateInAppMessages(c116331) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            nqbVar = (nqb) c116331.L$4;
            str = (String) c116331.L$3;
            str2 = (String) c116331.L$2;
            rywData2 = (RywData) c116331.L$1;
            InAppMessagesManager inAppMessagesManager3 = (InAppMessagesManager) c116331.L$0;
            wre.m54934b(obj);
            inAppMessagesManager = inAppMessagesManager3;
            long currentTimeMillis = inAppMessagesManager._time.getCurrentTimeMillis();
            Long l = inAppMessagesManager.lastTimeFetchedIAMs;
            if (l != null) {
                sq8.m48646e(l);
                if (currentTimeMillis - l.longValue() < inAppMessagesManager._configModelStore.getModel().getFetchIAMMinInterval()) {
                    return y3i.f54824a;
                }
            }
            inAppMessagesManager.lastTimeFetchedIAMs = ml1.m39305e(currentTimeMillis);
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            InAppMessagesManager$fetchMessages$sessionDurationProvider$1 inAppMessagesManager$fetchMessages$sessionDurationProvider$1 = new InAppMessagesManager$fetchMessages$sessionDurationProvider$1(inAppMessagesManager);
            IInAppBackendService iInAppBackendService = inAppMessagesManager._backend;
            c116331.L$0 = inAppMessagesManager;
            c116331.L$1 = null;
            c116331.L$2 = null;
            c116331.L$3 = null;
            c116331.L$4 = null;
            c116331.label = 2;
            Object objListInAppMessages = iInAppBackendService.listInAppMessages(str2, str, rywData2, inAppMessagesManager$fetchMessages$sessionDurationProvider$1, c116331);
            if (objListInAppMessages == objM51918f) {
                return objM51918f;
            }
            inAppMessagesManager2 = inAppMessagesManager;
            obj = objListInAppMessages;
            list = (List) obj;
            if (list != null) {
            }
        } finally {
            nqbVar.mo40923c(null);
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116341(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(InAppMessageClickResult inAppMessageClickResult) {
        if (inAppMessageClickResult.getUrl() != null) {
            if (inAppMessageClickResult.getUrl().length() > 0) {
                if (inAppMessageClickResult.getUrlTarget() == InAppMessageActionUrlType.BROWSER) {
                    AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), inAppMessageClickResult.getUrl());
                } else if (inAppMessageClickResult.getUrlTarget() == InAppMessageActionUrlType.IN_APP_WEBVIEW) {
                    OneSignalChromeTab.INSTANCE.open$com_onesignal_inAppMessages(inAppMessageClickResult.getUrl(), true, this._applicationService.getAppContext());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<InAppMessageOutcome> list, n64 n64Var) {
        C116351 c116351;
        Iterator<InAppMessageOutcome> it;
        InAppMessagesManager inAppMessagesManager;
        if (n64Var instanceof C116351) {
            c116351 = (C116351) n64Var;
            int i = c116351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116351.label = i - Integer.MIN_VALUE;
            } else {
                c116351 = new C116351(n64Var);
            }
        }
        Object obj = c116351.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116351.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            this._influenceManager.onDirectInfluenceFromIAM(str);
            it = list.iterator();
            inAppMessagesManager = this;
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c116351.L$1;
            inAppMessagesManager = (InAppMessagesManager) c116351.L$0;
            wre.m54934b(obj);
        }
        while (it.hasNext()) {
            InAppMessageOutcome next = it.next();
            String name = next.getName();
            if (next.isUnique()) {
                IOutcomeEventsController iOutcomeEventsController = inAppMessagesManager._outcomeEventsController;
                c116351.L$0 = inAppMessagesManager;
                c116351.L$1 = it;
                c116351.label = 1;
                if (iOutcomeEventsController.sendUniqueOutcomeEvent(name, c116351) == objM51918f) {
                    return objM51918f;
                }
            } else if (next.getWeight() > 0.0f) {
                IOutcomeEventsController iOutcomeEventsController2 = inAppMessagesManager._outcomeEventsController;
                float weight = next.getWeight();
                c116351.L$0 = inAppMessagesManager;
                c116351.L$1 = it;
                c116351.label = 2;
                if (iOutcomeEventsController2.sendOutcomeEventWithValue(name, weight, c116351) == objM51918f) {
                    return objM51918f;
                }
            } else {
                IOutcomeEventsController iOutcomeEventsController3 = inAppMessagesManager._outcomeEventsController;
                c116351.L$0 = inAppMessagesManager;
                c116351.L$1 = it;
                c116351.label = 3;
                if (iOutcomeEventsController3.sendOutcomeEvent(name, c116351) == objM51918f) {
                    return objM51918f;
                }
            }
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult, n64 n64Var) {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return y3i.f54824a;
        }
        this._influenceManager.onDirectInfluenceFromIAM(inAppMessage.getMessageId());
        Object objSuspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new C116362(new InAppMessageClickEvent(inAppMessage, inAppMessageClickResult), null), n64Var);
        return objSuspendingFireOnMain == uq8.m51918f() ? objSuspendingFireOnMain : y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult, n64 n64Var) {
        C116371 c116371;
        String clickId;
        InAppMessagesManager inAppMessagesManager;
        InAppMessage inAppMessage2;
        String str;
        if (n64Var instanceof C116371) {
            c116371 = (C116371) n64Var;
            int i = c116371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116371.label = i - Integer.MIN_VALUE;
            } else {
                c116371 = new C116371(n64Var);
            }
        }
        C116371 c1163712 = c116371;
        Object obj = c1163712.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1163712.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            String strVariantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
            if (strVariantIdForMessage == null) {
                return y3i.f54824a;
            }
            clickId = inAppMessageClickResult.getClickId();
            if (!(inAppMessage.getRedisplayStats().isRedisplayEnabled() && clickId != null && inAppMessage.isClickAvailable(clickId)) && kh3.m35708X(this.clickedClickIds, clickId)) {
                return y3i.f54824a;
            }
            if (clickId != null) {
                this.clickedClickIds.add(clickId);
                inAppMessage.addClickId(clickId);
            }
            try {
                IInAppBackendService iInAppBackendService = this._backend;
                String appId = this._configModelStore.getModel().getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = inAppMessage.getMessageId();
                boolean zIsFirstClick = inAppMessageClickResult.isFirstClick();
                c1163712.L$0 = this;
                c1163712.L$1 = inAppMessage;
                c1163712.L$2 = clickId;
                c1163712.label = 1;
                if (iInAppBackendService.sendIAMClick(appId, id, strVariantIdForMessage, messageId, clickId, zIsFirstClick, c1163712) == objM51918f) {
                    return objM51918f;
                }
                inAppMessagesManager = this;
            } catch (BackendException unused) {
                inAppMessagesManager = this;
                inAppMessage2 = inAppMessage;
                str = clickId;
                azh.m18048a(inAppMessagesManager.clickedClickIds).remove(str);
                if (str != null) {
                }
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c1163712.L$2;
            inAppMessage2 = (InAppMessage) c1163712.L$1;
            inAppMessagesManager = (InAppMessagesManager) c1163712.L$0;
            try {
                wre.m54934b(obj);
                clickId = str;
                inAppMessage = inAppMessage2;
            } catch (BackendException unused2) {
                azh.m18048a(inAppMessagesManager.clickedClickIds).remove(str);
                if (str != null) {
                }
                return y3i.f54824a;
            }
        }
        try {
            inAppMessagesManager._prefs.setClickedMessagesId(inAppMessagesManager.clickedClickIds);
        } catch (BackendException unused3) {
            inAppMessage2 = inAppMessage;
            str = clickId;
            azh.m18048a(inAppMessagesManager.clickedClickIds).remove(str);
            if (str != null) {
                inAppMessage2.removeClickId(str);
            }
            return y3i.f54824a;
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage, n64 n64Var) {
        C116381 c116381;
        String str;
        InAppMessagesManager inAppMessagesManager;
        if (n64Var instanceof C116381) {
            c116381 = (C116381) n64Var;
            int i = c116381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116381.label = i - Integer.MIN_VALUE;
            } else {
                c116381 = new C116381(n64Var);
            }
        }
        C116381 c1163812 = c116381;
        Object obj = c1163812.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1163812.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            String strVariantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
            if (strVariantIdForMessage == null) {
                return y3i.f54824a;
            }
            String pageId = inAppMessagePage.getPageId();
            String str2 = inAppMessage.getMessageId() + pageId;
            if (this.viewedPageIds.contains(str2)) {
                Logging.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                return y3i.f54824a;
            }
            this.viewedPageIds.add(str2);
            try {
                IInAppBackendService iInAppBackendService = this._backend;
                String appId = this._configModelStore.getModel().getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = inAppMessage.getMessageId();
                c1163812.L$0 = this;
                c1163812.L$1 = str2;
                c1163812.label = 1;
                if (iInAppBackendService.sendIAMPageImpression(appId, id, strVariantIdForMessage, messageId, pageId, c1163812) == objM51918f) {
                    return objM51918f;
                }
                str = str2;
                inAppMessagesManager = this;
            } catch (BackendException unused) {
                str = str2;
                inAppMessagesManager = this;
                inAppMessagesManager.viewedPageIds.remove(str);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c1163812.L$1;
            inAppMessagesManager = (InAppMessagesManager) c1163812.L$0;
            try {
                wre.m54934b(obj);
            } catch (BackendException unused2) {
                inAppMessagesManager.viewedPageIds.remove(str);
                return y3i.f54824a;
            }
        }
        inAppMessagesManager._prefs.setViewPageImpressionedIds(inAppMessagesManager.viewedPageIds);
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(InAppMessageClickResult inAppMessageClickResult) {
        if (inAppMessageClickResult.getTags() != null) {
            InAppMessageTag tags = inAppMessageClickResult.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                JSONUtils jSONUtils = JSONUtils.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                sq8.m48646e(tagsToAdd);
                this._userManager.addTags(jSONUtils.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                JSONUtils jSONUtils2 = JSONUtils.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                sq8.m48646e(tagsToRemove);
                this._userManager.removeTags(jSONUtils2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(InAppMessage inAppMessage) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(inAppMessage)) {
            return !inAppMessage.isDisplayedInSession();
        }
        return inAppMessage.isTriggerChanged() || (!inAppMessage.isDisplayedInSession() && inAppMessage.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(InAppMessageClickResult inAppMessageClickResult) {
        if (inAppMessageClickResult.getTags() != null) {
            Logging.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + inAppMessageClickResult.getTags(), null, 2, null);
        }
        if (inAppMessageClickResult.getOutcomes().size() > 0) {
            Logging.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + inAppMessageClickResult.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z) {
        synchronized (this.messages) {
            for (InAppMessage inAppMessage : this.messages) {
                boolean zContains = this.redisplayedInAppMessages.contains(inAppMessage);
                boolean zIsTriggerOnMessage = this._triggerController.isTriggerOnMessage(inAppMessage, collection);
                boolean zMessageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(inAppMessage);
                if (!inAppMessage.isTriggerChanged() && zContains && (zIsTriggerOnMessage || (z && zMessageHasOnlyDynamicTriggers))) {
                    Logging.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + inAppMessage, null, 2, null);
                    inAppMessage.setTriggerChanged(true);
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(InAppMessage inAppMessage, boolean z, n64 n64Var) {
        C116401 c116401;
        InAppMessagesManager inAppMessagesManager;
        if (n64Var instanceof C116401) {
            c116401 = (C116401) n64Var;
            int i = c116401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116401.label = i - Integer.MIN_VALUE;
            } else {
                c116401 = new C116401(n64Var);
            }
        }
        Object obj = c116401.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116401.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (inAppMessage.isPreview()) {
                inAppMessagesManager = this;
                inAppMessagesManager._influenceManager.onInAppMessageDismissed();
                if (inAppMessagesManager._state.getCurrentPrompt() == null) {
                    Logging.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                    return y3i.f54824a;
                }
                if (inAppMessagesManager.lifecycleCallback.getHasSubscribers()) {
                    inAppMessagesManager.lifecycleCallback.fireOnMain(new C116412(inAppMessage));
                }
                inAppMessagesManager._state.setInAppMessageIdShowing(null);
                if (!inAppMessagesManager.messageDisplayQueue.isEmpty()) {
                    Logging.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                    c116401.L$0 = null;
                    c116401.L$1 = null;
                    c116401.label = 2;
                    if (inAppMessagesManager.attemptToShowInAppMessage(c116401) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                Logging.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                c116401.L$0 = null;
                c116401.L$1 = null;
                c116401.label = 3;
                if (inAppMessagesManager.evaluateInAppMessages(c116401) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            this.dismissedMessages.add(inAppMessage.getMessageId());
            if (!z) {
                this._prefs.setDismissedMessagesId(this.dismissedMessages);
                this._state.setLastTimeInAppDismissed(ml1.m39305e(this._time.getCurrentTimeMillis()));
                c116401.L$0 = this;
                c116401.L$1 = inAppMessage;
                c116401.label = 1;
                if (persistInAppMessage(inAppMessage, c116401) == objM51918f) {
                    return objM51918f;
                }
            }
            inAppMessagesManager = this;
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
            inAppMessage = (InAppMessage) c116401.L$1;
            inAppMessagesManager = (InAppMessagesManager) c116401.L$0;
            wre.m54934b(obj);
        }
        Logging.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + inAppMessagesManager.dismissedMessages, null, 2, null);
        inAppMessagesManager._influenceManager.onInAppMessageDismissed();
        if (inAppMessagesManager._state.getCurrentPrompt() == null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(InAppMessagesManager inAppMessagesManager, InAppMessage inAppMessage, boolean z, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return inAppMessagesManager.messageWasDismissed(inAppMessage, z, n64Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(InAppMessage inAppMessage, n64 n64Var) {
        C116521 c116521;
        InAppMessagesManager inAppMessagesManager;
        if (n64Var instanceof C116521) {
            c116521 = (C116521) n64Var;
            int i = c116521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116521.label = i - Integer.MIN_VALUE;
            } else {
                c116521 = new C116521(n64Var);
            }
        }
        Object obj = c116521.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116521.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            inAppMessage.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
            inAppMessage.getRedisplayStats().incrementDisplayQuantity();
            inAppMessage.setTriggerChanged(false);
            inAppMessage.setDisplayedInSession(true);
            IInAppRepository iInAppRepository = this._repository;
            c116521.L$0 = this;
            c116521.L$1 = inAppMessage;
            c116521.label = 1;
            if (iInAppRepository.saveInAppMessage(inAppMessage, c116521) == objM51918f) {
                return objM51918f;
            }
            inAppMessagesManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppMessage = (InAppMessage) c116521.L$1;
            inAppMessagesManager = (InAppMessagesManager) c116521.L$0;
            wre.m54934b(obj);
        }
        inAppMessagesManager._prefs.setLastTimeInAppDismissed(inAppMessagesManager._state.getLastTimeInAppDismissed());
        int iIndexOf = inAppMessagesManager.redisplayedInAppMessages.indexOf(inAppMessage);
        if (iIndexOf != -1) {
            inAppMessagesManager.redisplayedInAppMessages.set(iIndexOf, inAppMessage);
        } else {
            inAppMessagesManager.redisplayedInAppMessages.add(inAppMessage);
        }
        Logging.debug$default("InAppMessagesManager.persistInAppMessage: " + inAppMessage + " with msg array data: " + inAppMessagesManager.redisplayedInAppMessages, null, 2, null);
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(InAppMessage inAppMessage, n64 n64Var) {
        C116531 c116531;
        nqb nqbVar;
        InAppMessagesManager inAppMessagesManager;
        if (n64Var instanceof C116531) {
            c116531 = (C116531) n64Var;
            int i = c116531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116531.label = i - Integer.MIN_VALUE;
            } else {
                c116531 = new C116531(n64Var);
            }
        }
        Object obj = c116531.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116531.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                nqbVar = this.messageDisplayQueueMutex;
                c116531.L$0 = this;
                c116531.L$1 = inAppMessage;
                c116531.L$2 = nqbVar;
                c116531.label = 1;
                if (nqbVar.mo40922b(null, c116531) == objM51918f) {
                    return objM51918f;
                }
                inAppMessagesManager = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                nqb nqbVar2 = (nqb) c116531.L$2;
                InAppMessage inAppMessage2 = (InAppMessage) c116531.L$1;
                inAppMessagesManager = (InAppMessagesManager) c116531.L$0;
                wre.m54934b(obj);
                nqbVar = nqbVar2;
                inAppMessage = inAppMessage2;
            }
            if (!inAppMessagesManager.messageDisplayQueue.contains(inAppMessage) && !sq8.m48644c(inAppMessagesManager._state.getInAppMessageIdShowing(), inAppMessage.getMessageId())) {
                inAppMessagesManager.messageDisplayQueue.add(inAppMessage);
                Logging.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + inAppMessage.getMessageId() + ", added to the queue", null, 2, null);
            }
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            c116531.L$0 = null;
            c116531.L$1 = null;
            c116531.L$2 = null;
            c116531.label = 2;
            if (inAppMessagesManager.attemptToShowInAppMessage(c116531) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }

    private final void setDataForRedisplay(InAppMessage inAppMessage) {
        boolean zContains = this.dismissedMessages.contains(inAppMessage.getMessageId());
        int iIndexOf = this.redisplayedInAppMessages.indexOf(inAppMessage);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        InAppMessage inAppMessage2 = this.redisplayedInAppMessages.get(iIndexOf);
        inAppMessage.getRedisplayStats().setDisplayStats(inAppMessage2.getRedisplayStats());
        inAppMessage.setDisplayedInSession(inAppMessage2.isDisplayedInSession());
        boolean zHasMessageTriggerChanged = hasMessageTriggerChanged(inAppMessage);
        Logging.debug$default("InAppMessagesManager.setDataForRedisplay: " + inAppMessage + " triggerHasChanged: " + zHasMessageTriggerChanged, null, 2, null);
        if (zHasMessageTriggerChanged && inAppMessage.getRedisplayStats().isDelayTimeSatisfied() && inAppMessage.getRedisplayStats().shouldDisplayAgain()) {
            Logging.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + inAppMessage.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(inAppMessage.getMessageId());
            this.impressionedMessages.remove(inAppMessage.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            inAppMessage.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(final InAppMessage inAppMessage, final List<? extends InAppMessagePrompt> list) {
        String string = this._applicationService.getAppContext().getString(C11630R.string.location_permission_missing_title);
        sq8.m48648g(string, "_applicationService.appC…permission_missing_title)");
        String string2 = this._applicationService.getAppContext().getString(C11630R.string.location_permission_missing_message);
        sq8.m48648g(string2, "_applicationService.appC…rmission_missing_message)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: o.pg8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InAppMessagesManager.m68752showAlertDialogMessage$lambda7(this.f40029a, inAppMessage, list, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAlertDialogMessage$lambda-7, reason: not valid java name */
    public static final void m68752showAlertDialogMessage$lambda7(InAppMessagesManager inAppMessagesManager, InAppMessage inAppMessage, List list, DialogInterface dialogInterface, int i) {
        sq8.m48649h(inAppMessagesManager, "this$0");
        sq8.m48649h(inAppMessage, "$inAppMessage");
        sq8.m48649h(list, "$prompts");
        ThreadUtilsKt.suspendifyOnThread$default(0, new InAppMessagesManager$showAlertDialogMessage$1$1(inAppMessagesManager, inAppMessage, list, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bd -> B:25:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, n64 n64Var) {
        C116541 c116541;
        InAppMessagesManager inAppMessagesManager;
        Iterator<? extends InAppMessagePrompt> it;
        InAppMessagesManager inAppMessagesManager2;
        Object obj;
        InAppMessage inAppMessage2;
        C116541 c1165412;
        List<? extends InAppMessagePrompt> list2;
        InAppMessage inAppMessage3;
        C116541 c1165413;
        InAppMessagesManager inAppMessagesManager3;
        if (n64Var instanceof C116541) {
            c116541 = (C116541) n64Var;
            int i = c116541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116541.label = i - Integer.MIN_VALUE;
                inAppMessagesManager = this;
            } else {
                inAppMessagesManager = this;
                c116541 = inAppMessagesManager.new C116541(n64Var);
            }
        }
        Object obj2 = c116541.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116541.label;
        if (i2 == 0) {
            wre.m54934b(obj2);
            it = list.iterator();
            inAppMessagesManager2 = inAppMessagesManager;
            obj = objM51918f;
            inAppMessage2 = inAppMessage;
            c1165412 = c116541;
            list2 = list;
            while (it.hasNext()) {
            }
            inAppMessage3 = inAppMessage2;
            c1165413 = c1165412;
            inAppMessagesManager3 = inAppMessagesManager2;
            if (inAppMessagesManager3._state.getCurrentPrompt() != null) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj2);
                return y3i.f54824a;
            }
            Iterator<? extends InAppMessagePrompt> it2 = (Iterator) c116541.L$3;
            List<? extends InAppMessagePrompt> list3 = (List) c116541.L$2;
            InAppMessage inAppMessage4 = (InAppMessage) c116541.L$1;
            inAppMessagesManager2 = (InAppMessagesManager) c116541.L$0;
            wre.m54934b(obj2);
            c1165412 = c116541;
            list2 = list3;
            it = it2;
            obj = objM51918f;
            InAppMessagePrompt.PromptActionResult promptActionResult = (InAppMessagePrompt.PromptActionResult) obj2;
            inAppMessagesManager2._state.setCurrentPrompt(null);
            Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + promptActionResult, null, 2, null);
            if (inAppMessage4.isPreview() || promptActionResult != InAppMessagePrompt.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                inAppMessage2 = inAppMessage4;
                while (it.hasNext()) {
                    InAppMessagePrompt next = it.next();
                    if (!next.hasPrompted()) {
                        inAppMessagesManager2._state.setCurrentPrompt(next);
                        Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + inAppMessagesManager2._state.getCurrentPrompt(), null, 2, null);
                        InAppMessagePrompt currentPrompt = inAppMessagesManager2._state.getCurrentPrompt();
                        sq8.m48646e(currentPrompt);
                        currentPrompt.setPrompted(true);
                        InAppMessagePrompt currentPrompt2 = inAppMessagesManager2._state.getCurrentPrompt();
                        sq8.m48646e(currentPrompt2);
                        c1165412.L$0 = inAppMessagesManager2;
                        c1165412.L$1 = inAppMessage2;
                        c1165412.L$2 = list2;
                        c1165412.L$3 = it;
                        c1165412.label = 1;
                        Object objHandlePrompt = currentPrompt2.handlePrompt(c1165412);
                        if (objHandlePrompt == obj) {
                            return obj;
                        }
                        inAppMessage4 = inAppMessage2;
                        obj2 = objHandlePrompt;
                        InAppMessagePrompt.PromptActionResult promptActionResult2 = (InAppMessagePrompt.PromptActionResult) obj2;
                        inAppMessagesManager2._state.setCurrentPrompt(null);
                        Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + promptActionResult2, null, 2, null);
                        if (inAppMessage4.isPreview()) {
                        }
                        inAppMessage2 = inAppMessage4;
                        while (it.hasNext()) {
                        }
                    }
                }
                inAppMessage3 = inAppMessage2;
                c1165413 = c1165412;
                inAppMessagesManager3 = inAppMessagesManager2;
                if (inAppMessagesManager3._state.getCurrentPrompt() != null) {
                    return y3i.f54824a;
                }
                Logging.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + inAppMessage3.getMessageId(), null, 2, null);
                c1165413.L$0 = null;
                c1165413.L$1 = null;
                c1165413.L$2 = null;
                c1165413.L$3 = null;
                c1165413.label = 2;
                if (messageWasDismissed$default(inAppMessagesManager3, inAppMessage3, false, c1165413, 2, null) == obj) {
                    return obj;
                }
                return y3i.f54824a;
            }
            inAppMessagesManager2.showAlertDialogMessage(inAppMessage4, list2);
            c1165413 = c1165412;
            inAppMessage3 = inAppMessage4;
            inAppMessagesManager3 = inAppMessagesManager2;
            if (inAppMessagesManager3._state.getCurrentPrompt() != null) {
            }
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener */
    public void mo68753addClickListener(IInAppMessageClickListener iInAppMessageClickListener) {
        sq8.m48649h(iInAppMessageClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("InAppMessagesManager.addClickListener(listener: " + iInAppMessageClickListener + ')', null, 2, null);
        this.messageClickCallback.subscribe(iInAppMessageClickListener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener */
    public void mo68754addLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
        sq8.m48649h(iInAppMessageLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + iInAppMessageLifecycleListener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(iInAppMessageLifecycleListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger */
    public void mo68755addTrigger(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        Logging.debug$default("InAppMessagesManager.addTrigger(key: " + str + ", value: " + str2 + ')', null, 2, null);
        TriggerModel triggerModel = (TriggerModel) this._triggerModelStore.get(str);
        if (triggerModel != null) {
            triggerModel.setValue(str2);
            return;
        }
        TriggerModel triggerModel2 = new TriggerModel();
        triggerModel2.setId(str);
        triggerModel2.setKey(str);
        triggerModel2.setValue(str2);
        IModelStore.DefaultImpls.add$default(this._triggerModelStore, triggerModel2, null, 2, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers */
    public void mo68756addTriggers(Map<String, String> map) {
        sq8.m48649h(map, "triggers");
        Logging.debug$default("InAppMessagesManager.addTriggers(triggers: " + map + ')', null, 2, null);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo68755addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers */
    public void mo68757clearTriggers() {
        Logging.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        IModelStore.DefaultImpls.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageActionOccurredOnMessage(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(inAppMessageClickResult, "action");
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116421(inAppMessageClickResult, inAppMessage, this, null), 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageActionOccurredOnPreview(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(inAppMessageClickResult, "action");
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116431(inAppMessageClickResult, inAppMessage, this, null), 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessagePageChanged(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(inAppMessagePage, "page");
        if (inAppMessage.isPreview()) {
            return;
        }
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116441(inAppMessage, inAppMessagePage, null), 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWasDismissed(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116451(inAppMessage, null), 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWasDisplayed(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new C116461(inAppMessage));
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (inAppMessage.isPreview() || this.impressionedMessages.contains(inAppMessage.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(inAppMessage.getMessageId());
        String strVariantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
        if (strVariantIdForMessage == null) {
            return;
        }
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116472(strVariantIdForMessage, inAppMessage, null), 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWillDismiss(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new C116481(inAppMessage));
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWillDisplay(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new C116491(inAppMessage));
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(modelChangedArgs.getProperty(), RemoteConfigConstants.RequestFieldKey.APP_ID)) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        Iterator<InAppMessage> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionAdded(ISubscription iSubscription) {
        sq8.m48649h(iSubscription, "subscription");
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionChanged(ISubscription iSubscription, ModelChangedArgs modelChangedArgs) {
        sq8.m48649h(iSubscription, "subscription");
        sq8.m48649h(modelChangedArgs, "args");
        if ((iSubscription instanceof IPushSubscription) && sq8.m48644c(modelChangedArgs.getPath(), OutcomeConstants.OUTCOME_ID)) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionRemoved(ISubscription iSubscription) {
        sq8.m48649h(iSubscription, "subscription");
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerChanged(String str) {
        sq8.m48649h(str, "newTriggerKey");
        Logging.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + str + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(bh3.m18963e(str), true);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116501(null), 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerCompleted(String str) {
        sq8.m48649h(str, "triggerId");
        Logging.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + str, null, 2, null);
        new HashSet().add(str);
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerConditionChanged(String str) {
        sq8.m48649h(str, "triggerId");
        Logging.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(bh3.m18963e(str), false);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116511(null), 1, null);
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener */
    public void mo68758removeClickListener(IInAppMessageClickListener iInAppMessageClickListener) {
        sq8.m48649h(iInAppMessageClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("InAppMessagesManager.removeClickListener(listener: " + iInAppMessageClickListener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(iInAppMessageClickListener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener */
    public void mo68759removeLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
        sq8.m48649h(iInAppMessageLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Logging.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + iInAppMessageLifecycleListener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(iInAppMessageLifecycleListener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger */
    public void mo68760removeTrigger(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Logging.debug$default("InAppMessagesManager.removeTrigger(key: " + str + ')', null, 2, null);
        IModelStore.DefaultImpls.remove$default(this._triggerModelStore, str, null, 2, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTriggers */
    public void mo68761removeTriggers(Collection<String> collection) {
        sq8.m48649h(collection, UserMetadata.KEYDATA_FILENAME);
        Logging.debug$default("InAppMessagesManager.removeTriggers(keys: " + collection + ')', null, 2, null);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo68760removeTrigger((String) it.next());
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) {
        Logging.debug$default("InAppMessagesManager.setPaused(value: " + z + ')', null, 2, null);
        this._state.setPaused(z);
        if (z && this._state.getInAppMessageIdShowing() != null) {
            rm1.m46952d(kt7.f32697a, eu5.m25612c(), null, new InAppMessagesManager$paused$1(this, null), 2, null);
        }
        if (z) {
            return;
        }
        ThreadUtilsKt.suspendifyOnThread$default(0, new InAppMessagesManager$paused$2(this, null), 1, null);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        this._identityModelStore.subscribe((ISingletonModelStoreChangeHandler) this.identityModelChangeHandler);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116551(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel configModel, String str) {
        sq8.m48649h(configModel, "model");
        sq8.m48649h(str, "tag");
        fetchMessagesWhenConditionIsMet();
    }
}
