package com.onesignal.inAppMessages.internal.display.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.ViewUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.display.impl.InAppMessageView;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.eu5;
import p001o.h84;
import p001o.h8g;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.nqb;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.tqb;
import p001o.uq8;
import p001o.wre;
import p001o.x8g;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class WebViewManager implements IActivityLifecycleHandler {
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
    public static final String EVENT_TYPE_RESIZE = "resize";
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
    public static final String JS_OBJ_NAME = "OSAndroid";
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final IApplicationService _applicationService;
    private final IInAppLifecycleService _lifecycle;
    private final IInAppMessagePromptFactory _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final InAppMessage message;
    private final InAppMessageContent messageContent;
    private InAppMessageView messageView;
    private final nqb messageViewMutex;
    private OSWebView webView;
    public static final Companion Companion = new Companion(null);
    private static final int MARGIN_PX_SIZE = ViewUtils.INSTANCE.dpToPx(24);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public final class OSJavaScriptInterface {
        public OSJavaScriptInterface() {
        }

        private final Position getDisplayLocation(JSONObject jSONObject) {
            Position position = Position.FULL_SCREEN;
            try {
                if (!jSONObject.has(WebViewManager.IAM_DISPLAY_LOCATION_KEY) || sq8.m48644c(jSONObject.get(WebViewManager.IAM_DISPLAY_LOCATION_KEY), "")) {
                    return position;
                }
                String strOptString = jSONObject.optString(WebViewManager.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                sq8.m48648g(strOptString, "jsonObject.optString(\n  …                        )");
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault()");
                String upperCase = strOptString.toUpperCase(locale);
                sq8.m48648g(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return Position.valueOf(upperCase);
            } catch (JSONException e) {
                e.printStackTrace();
                return position;
            }
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(WebViewManager.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) throws JSONException {
            try {
                WebViewManager webViewManager = WebViewManager.this;
                Activity activity = webViewManager.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(WebViewManager.IAM_PAGE_META_DATA_KEY);
                sq8.m48648g(jSONObject2, "jsonObject.getJSONObject(IAM_PAGE_META_DATA_KEY)");
                return webViewManager.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            sq8.m48648g(jSONObject2, "body");
            String strSafeString = JSONObjectExtensionsKt.safeString(jSONObject2, OutcomeConstants.OUTCOME_ID);
            WebViewManager.this.closing = jSONObject2.getBoolean("close");
            if (WebViewManager.this.message.isPreview()) {
                WebViewManager.this._lifecycle.messageActionOccurredOnPreview(WebViewManager.this.message, new InAppMessageClickResult(jSONObject2, WebViewManager.this._promptFactory));
            } else if (strSafeString != null) {
                WebViewManager.this._lifecycle.messageActionOccurredOnMessage(WebViewManager.this.message, new InAppMessageClickResult(jSONObject2, WebViewManager.this._promptFactory));
            }
            if (WebViewManager.this.closing) {
                WebViewManager.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            WebViewManager.this._lifecycle.messagePageChanged(WebViewManager.this.message, new InAppMessagePage(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            Position displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == Position.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            WebViewManager.this.messageContent.setDisplayLocation(displayLocation);
            WebViewManager.this.messageContent.setPageHeight(pageHeightData);
            WebViewManager.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String str) throws JSONException {
            JSONObject jSONObject;
            String string;
            sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            try {
                Logging.debug$default("OSJavaScriptInterface:postMessage: " + str, null, 2, null);
                jSONObject = new JSONObject(str);
                string = jSONObject.getString("type");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (string != null) {
                switch (string.hashCode()) {
                    case -1484226720:
                        if (!string.equals(WebViewManager.EVENT_TYPE_PAGE_CHANGE)) {
                            break;
                        } else {
                            handlePageChange(jSONObject);
                            break;
                        }
                    case -934437708:
                        string.equals(WebViewManager.EVENT_TYPE_RESIZE);
                        break;
                    case 42998156:
                        if (string.equals(WebViewManager.EVENT_TYPE_RENDERING_COMPLETE)) {
                            handleRenderComplete(jSONObject);
                            break;
                        }
                        break;
                    case 1851145598:
                        if (!string.equals(WebViewManager.EVENT_TYPE_ACTION_TAKEN)) {
                            break;
                        } else {
                            InAppMessageView inAppMessageView = WebViewManager.this.messageView;
                            boolean z = false;
                            if (inAppMessageView != null && !inAppMessageView.isDragging()) {
                                z = true;
                            }
                            if (z) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }

    public enum Position {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Position.values().length];
                iArr[Position.TOP_BANNER.ordinal()] = 1;
                iArr[Position.BOTTOM_BANNER.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final boolean isBanner() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i == 1 || i == 2;
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$backgroundDismissAndAwaitNextMessage$1", m36648f = "WebViewManager.kt", m36649l = {387}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$backgroundDismissAndAwaitNextMessage$1 */
    public static final class C116771 extends jgg implements xk7 {
        int label;

        public C116771(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return WebViewManager.this.new C116771(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                WebViewManager webViewManager = WebViewManager.this;
                this.label = 1;
                if (webViewManager.dismissAndAwaitNextMessage(this) == objM51918f) {
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
            return ((C116771) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", m36648f = "WebViewManager.kt", m36649l = {219, 224, 230}, m36650m = "calculateHeightAndShowWebViewAfterNewActivity")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 */
    public static final class C116781 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116781(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewManager.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", m36648f = "WebViewManager.kt", m36649l = {403}, m36650m = "dismissAndAwaitNextMessage")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$dismissAndAwaitNextMessage$1 */
    public static final class C116801 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116801(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewManager.this.dismissAndAwaitNextMessage(this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$onActivityAvailable$1", m36648f = "WebViewManager.kt", m36649l = {254, 261, 265}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$onActivityAvailable$1 */
    public static final class C116811 extends jgg implements xk7 {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ WebViewManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116811(String str, WebViewManager webViewManager, n64 n64Var) {
            super(1, n64Var);
            this.$lastActivityName = str;
            this.this$0 = webViewManager;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C116811(this.$lastActivityName, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                String str = this.$lastActivityName;
                if (str == null) {
                    WebViewManager webViewManager = this.this$0;
                    this.label = 1;
                    if (webViewManager.showMessageView(null, this) == objM51918f) {
                        return objM51918f;
                    }
                } else if (sq8.m48644c(str, this.this$0.currentActivityName)) {
                    WebViewManager webViewManager2 = this.this$0;
                    this.label = 3;
                    if (webViewManager2.calculateHeightAndShowWebViewAfterNewActivity(this) == objM51918f) {
                        return objM51918f;
                    }
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        InAppMessageView inAppMessageView = this.this$0.messageView;
                        sq8.m48646e(inAppMessageView);
                        inAppMessageView.removeAllViews();
                    }
                    WebViewManager webViewManager3 = this.this$0;
                    Integer num = webViewManager3.lastPageHeight;
                    this.label = 2;
                    if (webViewManager3.showMessageView(num, this) == objM51918f) {
                        return objM51918f;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116811) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", m36648f = "WebViewManager.kt", m36649l = {327}, m36650m = "setupWebView")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$setupWebView$1 */
    public static final class C116821 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C116821(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewManager.this.setupWebView(null, null, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", m36648f = "WebViewManager.kt", m36649l = {469, 294, 297, 298}, m36650m = "showMessageView")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$showMessageView$1 */
    public static final class C116831 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C116831(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewManager.this.showMessageView(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$updateSafeAreaInsets$2", m36648f = "WebViewManager.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$updateSafeAreaInsets$2 */
    public static final class C116842 extends jgg implements nl7 {
        int label;

        public C116842(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return WebViewManager.this.new C116842(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            int[] cutoutAndStatusBarInsets = ViewUtils.INSTANCE.getCutoutAndStatusBarInsets(WebViewManager.this.activity);
            h8g h8gVar = h8g.f26398a;
            String str = String.format(WebViewManager.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{ml1.m39304d(cutoutAndStatusBarInsets[0]), ml1.m39304d(cutoutAndStatusBarInsets[1]), ml1.m39304d(cutoutAndStatusBarInsets[2]), ml1.m39304d(cutoutAndStatusBarInsets[3])}, 4));
            sq8.m48648g(str, "format(format, *args)");
            String str2 = String.format(WebViewManager.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{str}, 1));
            sq8.m48648g(str2, "format(format, *args)");
            OSWebView oSWebView = WebViewManager.this.webView;
            sq8.m48646e(oSWebView);
            oSWebView.evaluateJavascript(str2, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116842) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public WebViewManager(InAppMessage inAppMessage, Activity activity, InAppMessageContent inAppMessageContent, IInAppLifecycleService iInAppLifecycleService, IApplicationService iApplicationService, IInAppMessagePromptFactory iInAppMessagePromptFactory) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(activity, "activity");
        sq8.m48649h(inAppMessageContent, "messageContent");
        sq8.m48649h(iInAppLifecycleService, "_lifecycle");
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iInAppMessagePromptFactory, "_promptFactory");
        this.message = inAppMessage;
        this.activity = activity;
        this.messageContent = inAppMessageContent;
        this._lifecycle = iInAppLifecycleService;
        this._applicationService = iApplicationService;
        this._promptFactory = iInAppMessagePromptFactory;
        this.messageViewMutex = tqb.m50340b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(n64 n64Var) {
        C116781 c116781;
        final WebViewManager webViewManager;
        WebViewManager webViewManager2;
        if (n64Var instanceof C116781) {
            c116781 = (C116781) n64Var;
            int i = c116781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116781.label = i - Integer.MIN_VALUE;
            } else {
                c116781 = new C116781(n64Var);
            }
        }
        Object obj = c116781.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116781.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            InAppMessageView inAppMessageView = this.messageView;
            if (inAppMessageView == null) {
                return y3i.f54824a;
            }
            sq8.m48646e(inAppMessageView);
            if (inAppMessageView.getDisplayPosition() == Position.FULL_SCREEN && !this.messageContent.isFullBleed()) {
                c116781.label = 1;
                if (showMessageView(null, c116781) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            Logging.debug$default("In app message new activity, calculate height and show ", null, 2, null);
            IApplicationService iApplicationService = this._applicationService;
            c116781.L$0 = this;
            c116781.label = 2;
            if (iApplicationService.waitUntilActivityReady(c116781) == objM51918f) {
                return objM51918f;
            }
            webViewManager = this;
            webViewManager.setWebViewToMaxSize(webViewManager.activity);
            if (webViewManager.messageContent.isFullBleed()) {
            }
        } else {
            if (i2 == 1) {
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            if (i2 == 2) {
                webViewManager = (WebViewManager) c116781.L$0;
                wre.m54934b(obj);
                webViewManager.setWebViewToMaxSize(webViewManager.activity);
                if (webViewManager.messageContent.isFullBleed()) {
                    c116781.L$0 = webViewManager;
                    c116781.label = 3;
                    if (webViewManager.updateSafeAreaInsets(c116781) == objM51918f) {
                        return objM51918f;
                    }
                    webViewManager2 = webViewManager;
                    webViewManager = webViewManager2;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webViewManager2 = (WebViewManager) c116781.L$0;
                wre.m54934b(obj);
                webViewManager = webViewManager2;
            }
        }
        OSWebView oSWebView = webViewManager.webView;
        sq8.m48646e(oSWebView);
        oSWebView.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: o.h6j
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                WebViewManager.m68763calculateHeightAndShowWebViewAfterNewActivity$lambda0(this.f26283a, (String) obj2);
            }
        });
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeightAndShowWebViewAfterNewActivity$lambda-0, reason: not valid java name */
    public static final void m68763calculateHeightAndShowWebViewAfterNewActivity$lambda0(WebViewManager webViewManager, String str) {
        sq8.m48649h(webViewManager, "this$0");
        try {
            ThreadUtilsKt.suspendifyOnThread$default(0, new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(webViewManager, webViewManager.pageRectToViewHeight(webViewManager.activity, new JSONObject(str)), null), 1, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (Logging.atLogLevel(LogLevel.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return ViewUtils.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return ViewUtils.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return ViewUtils.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) throws JSONException {
        try {
            int iDpToPx = ViewUtils.INSTANCE.dpToPx(jSONObject.getJSONObject("rect").getInt("height"));
            Logging.debug$default("getPageHeightData:pxHeight: " + iDpToPx, null, 2, null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity);
            if (iDpToPx <= webViewMaxSizeY) {
                return iDpToPx;
            }
            Logging.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
            return webViewMaxSizeY;
        } catch (JSONException e) {
            Logging.error("pageRectToViewHeight could not get page height", e);
            return -1;
        }
    }

    private final void setMessageView(InAppMessageView inAppMessageView) {
        this.messageView = inAppMessageView;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        OSWebView oSWebView = this.webView;
        sq8.m48646e(oSWebView);
        oSWebView.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:15:0x0033, B:57:0x00f7, B:20:0x0048, B:52:0x00e4, B:54:0x00e8, B:23:0x0055, B:47:0x00cf, B:49:0x00d3, B:32:0x0084, B:34:0x0088, B:37:0x0093, B:39:0x00ab, B:41:0x00b5, B:43:0x00bb), top: B:64:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:15:0x0033, B:57:0x00f7, B:20:0x0048, B:52:0x00e4, B:54:0x00e8, B:23:0x0055, B:47:0x00cf, B:49:0x00d3, B:32:0x0084, B:34:0x0088, B:37:0x0093, B:39:0x00ab, B:41:0x00b5, B:43:0x00bb), top: B:64:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, n64 n64Var) {
        C116831 c116831;
        WebViewManager webViewManager;
        Integer num2;
        nqb nqbVar;
        WebViewManager webViewManager2;
        InAppMessageView inAppMessageView;
        InAppMessageView inAppMessageView2;
        y3i y3iVar;
        if (n64Var instanceof C116831) {
            c116831 = (C116831) n64Var;
            int i = c116831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116831.label = i - Integer.MIN_VALUE;
            } else {
                c116831 = new C116831(n64Var);
            }
        }
        Object obj = c116831.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116831.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                nqb nqbVar2 = this.messageViewMutex;
                c116831.L$0 = this;
                c116831.L$1 = num;
                c116831.L$2 = nqbVar2;
                c116831.label = 1;
                if (nqbVar2.mo40922b(null, c116831) == objM51918f) {
                    return objM51918f;
                }
                webViewManager = this;
                num2 = num;
                nqbVar = nqbVar2;
            } else if (i2 == 1) {
                nqbVar = (nqb) c116831.L$2;
                num2 = (Integer) c116831.L$1;
                webViewManager = (WebViewManager) c116831.L$0;
                wre.m54934b(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nqbVar = (nqb) c116831.L$0;
                        wre.m54934b(obj);
                        y3iVar = y3i.f54824a;
                        nqbVar.mo40923c(null);
                        return y3iVar;
                    }
                    nqbVar = (nqb) c116831.L$1;
                    webViewManager2 = (WebViewManager) c116831.L$0;
                    wre.m54934b(obj);
                    inAppMessageView2 = webViewManager2.messageView;
                    if (inAppMessageView2 == null) {
                        y3iVar = null;
                        nqbVar.mo40923c(null);
                        return y3iVar;
                    }
                    c116831.L$0 = nqbVar;
                    c116831.L$1 = null;
                    c116831.L$2 = null;
                    c116831.label = 4;
                    if (inAppMessageView2.checkIfShouldDismiss(c116831) == objM51918f) {
                        return objM51918f;
                    }
                    y3iVar = y3i.f54824a;
                    nqbVar.mo40923c(null);
                    return y3iVar;
                }
                nqbVar = (nqb) c116831.L$1;
                webViewManager2 = (WebViewManager) c116831.L$0;
                wre.m54934b(obj);
                inAppMessageView = webViewManager2.messageView;
                if (inAppMessageView != null) {
                    Activity activity = webViewManager2.activity;
                    c116831.L$0 = webViewManager2;
                    c116831.L$1 = nqbVar;
                    c116831.L$2 = null;
                    c116831.label = 3;
                    if (inAppMessageView.showView(activity, c116831) == objM51918f) {
                        return objM51918f;
                    }
                }
                inAppMessageView2 = webViewManager2.messageView;
                if (inAppMessageView2 == null) {
                }
            }
            if (webViewManager.messageView == null) {
                Logging.warn$default("No messageView found to update a with a new height.", null, 2, null);
                y3i y3iVar2 = y3i.f54824a;
                nqbVar.mo40923c(null);
                return y3iVar2;
            }
            Logging.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
            InAppMessageView inAppMessageView3 = webViewManager.messageView;
            if (inAppMessageView3 != null) {
                OSWebView oSWebView = webViewManager.webView;
                sq8.m48646e(oSWebView);
                inAppMessageView3.setWebView(oSWebView);
            }
            if (num2 != null) {
                webViewManager.lastPageHeight = num2;
                InAppMessageView inAppMessageView4 = webViewManager.messageView;
                if (inAppMessageView4 != null) {
                    int iIntValue = num2.intValue();
                    c116831.L$0 = webViewManager;
                    c116831.L$1 = nqbVar;
                    c116831.L$2 = null;
                    c116831.label = 2;
                    if (inAppMessageView4.updateHeight(iIntValue, c116831) == objM51918f) {
                        return objM51918f;
                    }
                }
            }
            webViewManager2 = webViewManager;
            inAppMessageView = webViewManager2.messageView;
            if (inAppMessageView != null) {
            }
            inAppMessageView2 = webViewManager2.messageView;
            if (inAppMessageView2 == null) {
            }
        } catch (Throwable th) {
            num.mo40923c(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C116842(null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116771(null), 1, null);
    }

    public final void createNewInAppMessageView(boolean z) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        OSWebView oSWebView = this.webView;
        sq8.m48646e(oSWebView);
        setMessageView(new InAppMessageView(oSWebView, this.messageContent, z, manifestMetaBoolean));
        InAppMessageView inAppMessageView = this.messageView;
        sq8.m48646e(inAppMessageView);
        inAppMessageView.setMessageController(new InAppMessageView.InAppMessageViewListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.WebViewManager.createNewInAppMessageView.1
            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWasDismissed() {
                WebViewManager.this._lifecycle.messageWasDismissed(WebViewManager.this.message);
                WebViewManager.this._applicationService.removeActivityLifecycleHandler(this);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWasDisplayed() {
                WebViewManager.this._lifecycle.messageWasDisplayed(WebViewManager.this.message);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWillDismiss() {
                WebViewManager.this._lifecycle.messageWillDismiss(WebViewManager.this.message);
            }
        });
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(n64 n64Var) {
        C116801 c116801;
        WebViewManager webViewManager;
        if (n64Var instanceof C116801) {
            c116801 = (C116801) n64Var;
            int i = c116801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116801.label = i - Integer.MIN_VALUE;
            } else {
                c116801 = new C116801(n64Var);
            }
        }
        Object obj = c116801.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116801.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            InAppMessageView inAppMessageView = this.messageView;
            if (inAppMessageView == null || this.dismissFired) {
                return y3i.f54824a;
            }
            this.dismissFired = true;
            this._lifecycle.messageWillDismiss(this.message);
            c116801.L$0 = this;
            c116801.label = 1;
            if (inAppMessageView.dismissAndAwaitNextMessage(c116801) == objM51918f) {
                return objM51918f;
            }
            webViewManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webViewManager = (WebViewManager) c116801.L$0;
            wre.m54934b(obj);
        }
        webViewManager.dismissFired = false;
        webViewManager.setMessageView(null);
        return y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityAvailable(Activity activity) {
        sq8.m48649h(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        Logging.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        ThreadUtilsKt.suspendifyOnMain(new C116811(str, this, null));
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityStopped(Activity activity) {
        sq8.m48649h(activity, "activity");
        Logging.debug$default(x8g.m55850f("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !sq8.m48644c(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        InAppMessageView inAppMessageView = this.messageView;
        sq8.m48646e(inAppMessageView);
        inAppMessageView.removeAllViews();
    }

    public final void setContentSafeAreaInsets(InAppMessageContent inAppMessageContent, Activity activity) {
        sq8.m48649h(inAppMessageContent, FirebaseAnalytics.Param.CONTENT);
        sq8.m48649h(activity, "activity");
        String contentHtml = inAppMessageContent.getContentHtml();
        int[] cutoutAndStatusBarInsets = ViewUtils.INSTANCE.getCutoutAndStatusBarInsets(activity);
        h8g h8gVar = h8g.f26398a;
        String str = String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4));
        sq8.m48648g(str, "format(format, *args)");
        String str2 = String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        inAppMessageContent.setContentHtml(contentHtml + str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z, n64 n64Var) {
        C116821 c116821;
        WebViewManager webViewManager;
        if (n64Var instanceof C116821) {
            c116821 = (C116821) n64Var;
            int i = c116821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116821.label = i - Integer.MIN_VALUE;
            } else {
                c116821 = new C116821(n64Var);
            }
        }
        Object obj = c116821.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116821.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            enableWebViewRemoteDebugging();
            OSWebView oSWebView = new OSWebView(activity);
            this.webView = oSWebView;
            sq8.m48646e(oSWebView);
            oSWebView.setOverScrollMode(2);
            OSWebView oSWebView2 = this.webView;
            sq8.m48646e(oSWebView2);
            oSWebView2.setVerticalScrollBarEnabled(false);
            OSWebView oSWebView3 = this.webView;
            sq8.m48646e(oSWebView3);
            oSWebView3.setHorizontalScrollBarEnabled(false);
            OSWebView oSWebView4 = this.webView;
            sq8.m48646e(oSWebView4);
            oSWebView4.getSettings().setJavaScriptEnabled(true);
            OSWebView oSWebView5 = this.webView;
            sq8.m48646e(oSWebView5);
            oSWebView5.addJavascriptInterface(new OSJavaScriptInterface(), JS_OBJ_NAME);
            if (z) {
                OSWebView oSWebView6 = this.webView;
                sq8.m48646e(oSWebView6);
                oSWebView6.setSystemUiVisibility(3074);
                if (Build.VERSION.SDK_INT >= 30) {
                    OSWebView oSWebView7 = this.webView;
                    sq8.m48646e(oSWebView7);
                    oSWebView7.setFitsSystemWindows(false);
                }
            }
            this._lifecycle.messageWillDisplay(this.message);
            IApplicationService iApplicationService = this._applicationService;
            c116821.L$0 = this;
            c116821.L$1 = activity;
            c116821.L$2 = str;
            c116821.label = 1;
            if (iApplicationService.waitUntilActivityReady(c116821) == objM51918f) {
                return objM51918f;
            }
            webViewManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c116821.L$2;
            activity = (Activity) c116821.L$1;
            webViewManager = (WebViewManager) c116821.L$0;
            wre.m54934b(obj);
        }
        webViewManager.setWebViewToMaxSize(activity);
        OSWebView oSWebView8 = webViewManager.webView;
        sq8.m48646e(oSWebView8);
        oSWebView8.loadData(str, "text/html; charset=utf-8", "base64");
        return y3i.f54824a;
    }
}
