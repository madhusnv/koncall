package com.onesignal.inAppMessages.internal.display.impl;

import android.annotation.TargetApi;
import android.app.Activity;
import android.util.Base64;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.backend.GetIAMDataResponse;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.common.InAppHelper;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.session.internal.influence.IInfluenceManager;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.eu5;
import p001o.f9g;
import p001o.h84;
import p001o.id5;
import p001o.jgg;
import p001o.jpa;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@TargetApi(19)
/* loaded from: classes6.dex */
public final class InAppDisplayer implements IInAppDisplayer {
    public static final Companion Companion = new Companion(null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final IApplicationService _applicationService;
    private final IInAppBackendService _backend;
    private final ConfigModelStore _configModelStore;
    private final IInfluenceManager _influenceManager;
    private final ILanguageContext _languageContext;
    private final IInAppLifecycleService _lifecycle;
    private final IInAppMessagePromptFactory _promptFactory;
    private final ITime _time;
    private WebViewManager lastInstance;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", m36648f = "InAppDisplayer.kt", m36649l = {48, 57}, m36650m = "displayMessage")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$displayMessage$1 */
    public static final class C116651 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116651(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppDisplayer.this.displayMessage(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", m36648f = "InAppDisplayer.kt", m36649l = {TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT, Opcodes.IASTORE}, m36650m = "displayPreviewMessage")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$displayPreviewMessage$1 */
    public static final class C116661 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116661(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppDisplayer.this.displayPreviewMessage(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", m36648f = "InAppDisplayer.kt", m36649l = {Opcodes.I2B}, m36650m = "initInAppMessage")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$initInAppMessage$1 */
    public static final class C116671 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C116671(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppDisplayer.this.initInAppMessage(null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$initInAppMessage$2", m36648f = "InAppDisplayer.kt", m36649l = {Opcodes.LCMP}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$initInAppMessage$2 */
    public static final class C116682 extends jgg implements nl7 {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ InAppMessageContent $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ WebViewManager $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116682(WebViewManager webViewManager, Activity activity, String str, InAppMessageContent inAppMessageContent, n64 n64Var) {
            super(2, n64Var);
            this.$webViewManager = webViewManager;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = inAppMessageContent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C116682(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    WebViewManager webViewManager = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String str = this.$base64Str;
                    sq8.m48648g(str, "base64Str");
                    boolean zIsFullBleed = this.$content.isFullBleed();
                    this.label = 1;
                    if (webViewManager.setupWebView(activity, str, zIsFullBleed, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    String message = e.getMessage();
                    sq8.m48646e(message);
                    if (f9g.m26306P(message, "No WebView installed", false, 2, null)) {
                        Logging.error("Error setting up WebView: ", e);
                    }
                }
                throw e;
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116682) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", m36648f = "InAppDisplayer.kt", m36649l = {105, Opcodes.DMUL, Opcodes.LDIV, Opcodes.FREM, Opcodes.DREM}, m36650m = "showMessageContent")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$showMessageContent$1 */
    public static final class C116691 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C116691(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppDisplayer.this.showMessageContent(null, null, this);
        }
    }

    public InAppDisplayer(IApplicationService iApplicationService, IInAppLifecycleService iInAppLifecycleService, IInAppMessagePromptFactory iInAppMessagePromptFactory, IInAppBackendService iInAppBackendService, IInfluenceManager iInfluenceManager, ConfigModelStore configModelStore, ILanguageContext iLanguageContext, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iInAppLifecycleService, "_lifecycle");
        sq8.m48649h(iInAppMessagePromptFactory, "_promptFactory");
        sq8.m48649h(iInAppBackendService, "_backend");
        sq8.m48649h(iInfluenceManager, "_influenceManager");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iLanguageContext, "_languageContext");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._lifecycle = iInAppLifecycleService;
        this._promptFactory = iInAppMessagePromptFactory;
        this._backend = iInAppBackendService;
        this._influenceManager = iInfluenceManager;
        this._configModelStore = configModelStore;
        this._languageContext = iLanguageContext;
        this._time = iTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initInAppMessage(Activity activity, InAppMessage inAppMessage, InAppMessageContent inAppMessageContent, n64 n64Var) {
        C116671 c116671;
        if (n64Var instanceof C116671) {
            c116671 = (C116671) n64Var;
            int i = c116671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116671.label = i - Integer.MIN_VALUE;
            } else {
                c116671 = new C116671(n64Var);
            }
        }
        Object obj = c116671.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116671.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                String contentHtml = inAppMessageContent.getContentHtml();
                sq8.m48646e(contentHtml);
                Charset charsetForName = Charset.forName(HTTP.UTF_8);
                sq8.m48648g(charsetForName, "forName(charsetName)");
                byte[] bytes = contentHtml.getBytes(charsetForName);
                sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                WebViewManager webViewManager = new WebViewManager(inAppMessage, activity, inAppMessageContent, this._lifecycle, this._applicationService, this._promptFactory);
                this.lastInstance = webViewManager;
                if (inAppMessageContent.isFullBleed()) {
                    webViewManager.setContentSafeAreaInsets(inAppMessageContent, activity);
                }
                jpa jpaVarM25612c = eu5.m25612c();
                C116682 c116682 = new C116682(webViewManager, activity, strEncodeToString, inAppMessageContent, null);
                c116671.label = 1;
                if (pm1.m43867g(jpaVarM25612c, c116682, c116671) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
        } catch (UnsupportedEncodingException e) {
            Logging.error("Catch on initInAppMessage: ", e);
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageContent(InAppMessage inAppMessage, InAppMessageContent inAppMessageContent, n64 n64Var) {
        C116691 c116691;
        InAppDisplayer inAppDisplayer;
        InAppDisplayer inAppDisplayer2;
        InAppMessage inAppMessage2;
        Activity activity;
        if (n64Var instanceof C116691) {
            c116691 = (C116691) n64Var;
            int i = c116691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116691.label = i - Integer.MIN_VALUE;
            } else {
                c116691 = new C116691(n64Var);
            }
        }
        Object obj = c116691.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116691.label;
        if (i2 != 0) {
            if (i2 == 1) {
                activity = (Activity) c116691.L$3;
                inAppMessageContent = (InAppMessageContent) c116691.L$2;
                inAppMessage2 = (InAppMessage) c116691.L$1;
                inAppDisplayer2 = (InAppDisplayer) c116691.L$0;
                wre.m54934b(obj);
                inAppDisplayer2.lastInstance = null;
                c116691.L$0 = null;
                c116691.L$1 = null;
                c116691.L$2 = null;
                c116691.L$3 = null;
                c116691.label = 2;
                if (inAppDisplayer2.initInAppMessage(activity, inAppMessage2, inAppMessageContent, c116691) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            if (i2 == 2 || i2 == 3) {
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            inAppMessageContent = (InAppMessageContent) c116691.L$2;
            inAppMessage = (InAppMessage) c116691.L$1;
            inAppDisplayer = (InAppDisplayer) c116691.L$0;
            wre.m54934b(obj);
            c116691.L$0 = null;
            c116691.L$1 = null;
            c116691.L$2 = null;
            c116691.label = 5;
            if (inAppDisplayer.showMessageContent(inAppMessage, inAppMessageContent, c116691) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
        wre.m54934b(obj);
        Activity current = this._applicationService.getCurrent();
        Logging.debug$default("InAppDisplayer.showMessageContent: in app message on currentActivity: " + current, null, 2, null);
        if (current == null) {
            c116691.L$0 = this;
            c116691.L$1 = inAppMessage;
            c116691.L$2 = inAppMessageContent;
            c116691.label = 4;
            if (nk5.m40720b(200L, c116691) == objM51918f) {
                return objM51918f;
            }
            inAppDisplayer = this;
            c116691.L$0 = null;
            c116691.L$1 = null;
            c116691.L$2 = null;
            c116691.label = 5;
            if (inAppDisplayer.showMessageContent(inAppMessage, inAppMessageContent, c116691) == objM51918f) {
            }
            return y3i.f54824a;
        }
        if (this.lastInstance == null || !inAppMessage.isPreview()) {
            c116691.label = 3;
            if (initInAppMessage(current, inAppMessage, inAppMessageContent, c116691) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
        WebViewManager webViewManager = this.lastInstance;
        sq8.m48646e(webViewManager);
        c116691.L$0 = this;
        c116691.L$1 = inAppMessage;
        c116691.L$2 = inAppMessageContent;
        c116691.L$3 = current;
        c116691.label = 1;
        if (webViewManager.dismissAndAwaitNextMessage(c116691) == objM51918f) {
            return objM51918f;
        }
        inAppDisplayer2 = this;
        inAppMessage2 = inAppMessage;
        activity = current;
        inAppDisplayer2.lastInstance = null;
        c116691.L$0 = null;
        c116691.L$1 = null;
        c116691.L$2 = null;
        c116691.L$3 = null;
        c116691.label = 2;
        if (inAppDisplayer2.initInAppMessage(activity, inAppMessage2, inAppMessageContent, c116691) == objM51918f) {
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    public void dismissCurrentInAppMessage() {
        Logging.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        WebViewManager webViewManager = this.lastInstance;
        if (webViewManager != null) {
            sq8.m48646e(webViewManager);
            webViewManager.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayMessage(InAppMessage inAppMessage, n64 n64Var) {
        C116651 c116651;
        InAppDisplayer inAppDisplayer;
        if (n64Var instanceof C116651) {
            c116651 = (C116651) n64Var;
            int i = c116651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116651.label = i - Integer.MIN_VALUE;
            } else {
                c116651 = new C116651(n64Var);
            }
        }
        Object iAMData = c116651.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116651.label;
        if (i2 == 0) {
            wre.m54934b(iAMData);
            IInAppBackendService iInAppBackendService = this._backend;
            String appId = this._configModelStore.getModel().getAppId();
            String messageId = inAppMessage.getMessageId();
            String strVariantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
            c116651.L$0 = this;
            c116651.L$1 = inAppMessage;
            c116651.label = 1;
            iAMData = iInAppBackendService.getIAMData(appId, messageId, strVariantIdForMessage, c116651);
            if (iAMData == objM51918f) {
                return objM51918f;
            }
            inAppDisplayer = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(iAMData);
                return ml1.m39301a(true);
            }
            inAppMessage = (InAppMessage) c116651.L$1;
            inAppDisplayer = (InAppDisplayer) c116651.L$0;
            wre.m54934b(iAMData);
        }
        GetIAMDataResponse getIAMDataResponse = (GetIAMDataResponse) iAMData;
        if (getIAMDataResponse.getContent() == null) {
            if (getIAMDataResponse.getShouldRetry()) {
                return null;
            }
            return ml1.m39301a(false);
        }
        InAppMessageContent content = getIAMDataResponse.getContent();
        sq8.m48646e(content);
        Double displayDuration = content.getDisplayDuration();
        sq8.m48646e(displayDuration);
        inAppMessage.setDisplayDuration(displayDuration.doubleValue());
        inAppDisplayer._influenceManager.onInAppMessageDisplayed(inAppMessage.getMessageId());
        InAppMessageContent content2 = getIAMDataResponse.getContent();
        sq8.m48646e(content2);
        c116651.L$0 = null;
        c116651.L$1 = null;
        c116651.label = 2;
        if (inAppDisplayer.showMessageContent(inAppMessage, content2, c116651) == objM51918f) {
            return objM51918f;
        }
        return ml1.m39301a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.display.IInAppDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object displayPreviewMessage(String str, n64 n64Var) {
        C116661 c116661;
        InAppDisplayer inAppDisplayer;
        InAppMessage inAppMessage;
        if (n64Var instanceof C116661) {
            c116661 = (C116661) n64Var;
            int i = c116661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116661.label = i - Integer.MIN_VALUE;
            } else {
                c116661 = new C116661(n64Var);
            }
        }
        Object obj = c116661.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116661.label;
        boolean z = true;
        if (i2 == 0) {
            wre.m54934b(obj);
            InAppMessage inAppMessage2 = new InAppMessage(true, this._time);
            IInAppBackendService iInAppBackendService = this._backend;
            String appId = this._configModelStore.getModel().getAppId();
            c116661.L$0 = this;
            c116661.L$1 = inAppMessage2;
            c116661.label = 1;
            Object iAMPreviewData = iInAppBackendService.getIAMPreviewData(appId, str, c116661);
            if (iAMPreviewData == objM51918f) {
                return objM51918f;
            }
            inAppDisplayer = this;
            obj = iAMPreviewData;
            inAppMessage = inAppMessage2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return ml1.m39301a(z);
            }
            inAppMessage = (InAppMessage) c116661.L$1;
            inAppDisplayer = (InAppDisplayer) c116661.L$0;
            wre.m54934b(obj);
        }
        InAppMessageContent inAppMessageContent = (InAppMessageContent) obj;
        if (inAppMessageContent == null) {
            z = false;
        } else {
            Double displayDuration = inAppMessageContent.getDisplayDuration();
            sq8.m48646e(displayDuration);
            inAppMessage.setDisplayDuration(displayDuration.doubleValue());
            c116661.L$0 = null;
            c116661.L$1 = null;
            c116661.label = 2;
            if (inAppDisplayer.showMessageContent(inAppMessage, inAppMessageContent, c116661) == objM51918f) {
                return objM51918f;
            }
        }
        return ml1.m39301a(z);
    }
}
