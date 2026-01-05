package com.onesignal.core.internal.config.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.backend.IParamsBackendService;
import com.onesignal.core.internal.backend.ParamsObject;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import org.objectweb.asm.TypeReference;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ConfigModelStoreListener implements IStartableService, ISingletonModelStoreChangeHandler<ConfigModel> {
    public static final Companion Companion = new Companion(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final ConfigModelStore _configModelStore;
    private final IParamsBackendService _paramsBackendService;
    private final ISubscriptionManager _subscriptionManager;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.config.impl.ConfigModelStoreListener$fetchParams$1", m36648f = "ConfigModelStoreListener.kt", m36649l = {TypeReference.METHOD_REFERENCE, 120}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.config.impl.ConfigModelStoreListener$fetchParams$1 */
    public static final class C116141 extends jgg implements xk7 {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ ConfigModelStoreListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116141(String str, ConfigModelStoreListener configModelStoreListener, n64 n64Var) {
            super(1, n64Var);
            this.$appId = str;
            this.this$0 = configModelStoreListener;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C116141(this.$appId, this.this$0, n64Var);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:6|147|148|(2:150|151)|152|15|(1:17)(1:18)|(1:20)|21|(1:23)(48:24|156|25|(3:27|(1:29)(1:30)|31)|32|(3:34|(1:36)(1:37)|38)|39|(3:41|(1:43)(1:44)|45)|46|(3:48|(1:50)(1:51)|52)|53|(3:55|(1:57)(1:58)|59)|60|(3:62|(1:64)(1:65)|66)|67|(3:69|(1:71)(1:72)|73)|74|(3:76|(1:78)(1:79)|80)|81|(3:83|(1:85)(1:86)|87)|88|(3:90|(1:92)(1:93)|94)|95|(1:97)|98|(1:100)|101|(1:103)|104|(1:106)|107|(1:109)|110|(3:112|(1:114)(1:115)|116)|117|(3:119|(1:121)(1:122)|123)|124|(3:126|(1:128)(1:129)|130)|131|132|148|(0)|152|15|(0)(0)|(0)|21|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x025d, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x025e, code lost:
        
            r11 = r0;
            r0 = r13;
            r13 = r7;
            r7 = r6;
            r6 = r1;
            r1 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x026c, code lost:
        
            com.onesignal.debug.internal.logging.Logging.fatal$default("403 error getting OneSignal params, omitting further retries!", null, 2, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x0273, code lost:
        
            return p001o.y3i.f54824a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0274, code lost:
        
            r13 = (r7 * 10000) + com.onesignal.core.internal.config.impl.ConfigModelStoreListener.MIN_WAIT_BETWEEN_RETRIES;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x027b, code lost:
        
            if (r13 > com.onesignal.core.internal.config.impl.ConfigModelStoreListener.MAX_WAIT_BETWEEN_RETRIES) goto L143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x027d, code lost:
        
            r13 = com.onesignal.core.internal.config.impl.ConfigModelStoreListener.MAX_WAIT_BETWEEN_RETRIES;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x027e, code lost:
        
            com.onesignal.debug.internal.logging.Logging.info$default("Failed to get Android parameters, trying again in " + (r13 / 1000) + " seconds.", null, 2, null);
            r0.I$0 = r7;
            r0.I$1 = r6;
            r0.label = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x02a4, code lost:
        
            if (p001o.nk5.m40720b(r13, r0) == r1) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x02a6, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01b4 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01c9 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01de A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01f3 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0208 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0222 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x023c A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x026c  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x02ae  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00eb A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fd A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0121 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0133 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0145 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0157 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0169 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x017b A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x018d A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01a3 A[Catch: BackendException -> 0x025b, TryCatch #2 {BackendException -> 0x025b, blocks: (B:25:0x008e, B:27:0x00eb, B:31:0x00f4, B:32:0x00f7, B:34:0x00fd, B:38:0x0106, B:39:0x0109, B:41:0x010f, B:45:0x0118, B:46:0x011b, B:48:0x0121, B:52:0x012a, B:53:0x012d, B:55:0x0133, B:59:0x013c, B:60:0x013f, B:62:0x0145, B:66:0x014e, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:74:0x0163, B:76:0x0169, B:80:0x0172, B:81:0x0175, B:83:0x017b, B:87:0x0184, B:88:0x0187, B:90:0x018d, B:94:0x0196, B:95:0x019d, B:97:0x01a3, B:98:0x01aa, B:100:0x01b4, B:101:0x01bf, B:103:0x01c9, B:104:0x01d4, B:106:0x01de, B:107:0x01e9, B:109:0x01f3, B:110:0x01fe, B:112:0x0208, B:116:0x0215, B:117:0x0218, B:119:0x0222, B:123:0x022f, B:124:0x0232, B:126:0x023c, B:130:0x0249, B:131:0x024c), top: B:156:0x008e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0257 -> B:148:0x02ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x02a4 -> B:147:0x02a7). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C116141 c116141;
            int i;
            int i2;
            BackendException e;
            int i3;
            int i4;
            Object obj2;
            C116141 c1161412;
            Boolean enterprise;
            Boolean useIdentityVerification;
            Boolean firebaseAnalytics;
            Boolean restoreTTLFilter;
            Boolean clearGroupOnSummaryClick;
            Boolean receiveReceiptEnabled;
            Boolean disableGMSMissingPrompt;
            Boolean unsubscribeWhenNotificationsDisabled;
            Boolean locationShared;
            Boolean requiresUserPrivacyConsent;
            Long opRepoExecutionInterval;
            Integer notificationLimit;
            Integer indirectNotificationAttributionWindow;
            Integer iamLimit;
            Integer indirectIAMAttributionWindow;
            Boolean boolIsDirectEnabled;
            Boolean boolIsIndirectEnabled;
            Boolean boolIsUnattributedEnabled;
            String id;
            Object objFetchParams;
            Object objM51918f = uq8.m51918f();
            int i5 = this.label;
            if (i5 == 0) {
                wre.m54934b(obj);
                Logging.debug$default("ConfigModelListener: fetching parameters for appId: " + this.$appId, null, 2, null);
                c116141 = this;
                i = 0;
                i2 = 0;
                IParamsBackendService iParamsBackendService = c116141.this$0._paramsBackendService;
                String str = c116141.$appId;
                id = c116141.this$0._subscriptionManager.getSubscriptions().getPush().getId();
                if (id.length() == 0) {
                }
                c116141.I$0 = i2;
                c116141.I$1 = i;
                c116141.label = 1;
                objFetchParams = iParamsBackendService.fetchParams(str, id, c116141);
                if (objFetchParams == objM51918f) {
                }
            } else if (i5 == 1) {
                int i6 = this.I$1;
                int i7 = this.I$0;
                try {
                    wre.m54934b(obj);
                    i3 = i7;
                    i4 = i6;
                    obj2 = objM51918f;
                    c1161412 = this;
                } catch (BackendException e2) {
                    e = e2;
                    i3 = i7;
                    i4 = i6;
                    obj2 = objM51918f;
                    c1161412 = this;
                    if (e.getStatusCode() == 403) {
                    }
                }
                ParamsObject paramsObject = (ParamsObject) obj;
                ConfigModel configModel = new ConfigModel();
                configModel.initializeFromModel(null, c1161412.this$0._configModelStore.getModel());
                configModel.setInitializedWithRemote(true);
                configModel.setAppId(c1161412.$appId);
                configModel.setNotificationChannels(paramsObject.getNotificationChannels());
                configModel.setGoogleProjectNumber(paramsObject.getGoogleProjectNumber());
                configModel.getFcmParams().setProjectId(paramsObject.getFcmParams().getProjectId());
                configModel.getFcmParams().setAppId(paramsObject.getFcmParams().getAppId());
                configModel.getFcmParams().setApiKey(paramsObject.getFcmParams().getApiKey());
                enterprise = paramsObject.getEnterprise();
                if (enterprise != null) {
                }
                useIdentityVerification = paramsObject.getUseIdentityVerification();
                if (useIdentityVerification != null) {
                }
                firebaseAnalytics = paramsObject.getFirebaseAnalytics();
                if (firebaseAnalytics != null) {
                }
                restoreTTLFilter = paramsObject.getRestoreTTLFilter();
                if (restoreTTLFilter != null) {
                }
                clearGroupOnSummaryClick = paramsObject.getClearGroupOnSummaryClick();
                if (clearGroupOnSummaryClick != null) {
                }
                receiveReceiptEnabled = paramsObject.getReceiveReceiptEnabled();
                if (receiveReceiptEnabled != null) {
                }
                disableGMSMissingPrompt = paramsObject.getDisableGMSMissingPrompt();
                if (disableGMSMissingPrompt != null) {
                }
                unsubscribeWhenNotificationsDisabled = paramsObject.getUnsubscribeWhenNotificationsDisabled();
                if (unsubscribeWhenNotificationsDisabled != null) {
                }
                locationShared = paramsObject.getLocationShared();
                if (locationShared != null) {
                }
                requiresUserPrivacyConsent = paramsObject.getRequiresUserPrivacyConsent();
                if (requiresUserPrivacyConsent != null) {
                }
                opRepoExecutionInterval = paramsObject.getOpRepoExecutionInterval();
                if (opRepoExecutionInterval != null) {
                }
                notificationLimit = paramsObject.getInfluenceParams().getNotificationLimit();
                if (notificationLimit != null) {
                }
                indirectNotificationAttributionWindow = paramsObject.getInfluenceParams().getIndirectNotificationAttributionWindow();
                if (indirectNotificationAttributionWindow != null) {
                }
                iamLimit = paramsObject.getInfluenceParams().getIamLimit();
                if (iamLimit != null) {
                }
                indirectIAMAttributionWindow = paramsObject.getInfluenceParams().getIndirectIAMAttributionWindow();
                if (indirectIAMAttributionWindow != null) {
                }
                boolIsDirectEnabled = paramsObject.getInfluenceParams().isDirectEnabled();
                if (boolIsDirectEnabled != null) {
                }
                boolIsIndirectEnabled = paramsObject.getInfluenceParams().isIndirectEnabled();
                if (boolIsIndirectEnabled != null) {
                }
                boolIsUnattributedEnabled = paramsObject.getInfluenceParams().isUnattributedEnabled();
                if (boolIsUnattributedEnabled != null) {
                }
                c1161412.this$0._configModelStore.replace(configModel, ModelChangeTags.HYDRATE);
                c116141 = c1161412;
                objM51918f = obj2;
                i = 1;
                i2 = i3;
                if (i != 0) {
                }
                IParamsBackendService iParamsBackendService2 = c116141.this$0._paramsBackendService;
                String str2 = c116141.$appId;
                id = c116141.this$0._subscriptionManager.getSubscriptions().getPush().getId();
                if (id.length() == 0) {
                }
                c116141.I$0 = i2;
                c116141.I$1 = i;
                c116141.label = 1;
                objFetchParams = iParamsBackendService2.fetchParams(str2, id, c116141);
                if (objFetchParams == objM51918f) {
                }
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = this.I$1;
                int i9 = this.I$0;
                wre.m54934b(obj);
                i3 = i9;
                i4 = i8;
                obj2 = objM51918f;
                c1161412 = this;
                i3++;
                c116141 = c1161412;
                objM51918f = obj2;
                i = i4;
                i2 = i3;
                if (i != 0) {
                    return y3i.f54824a;
                }
                IParamsBackendService iParamsBackendService22 = c116141.this$0._paramsBackendService;
                String str22 = c116141.$appId;
                id = c116141.this$0._subscriptionManager.getSubscriptions().getPush().getId();
                if (id.length() == 0) {
                    id = null;
                }
                c116141.I$0 = i2;
                c116141.I$1 = i;
                c116141.label = 1;
                objFetchParams = iParamsBackendService22.fetchParams(str22, id, c116141);
                if (objFetchParams == objM51918f) {
                    return objM51918f;
                }
                Object obj3 = objM51918f;
                c1161412 = c116141;
                obj = objFetchParams;
                i3 = i2;
                i4 = i;
                obj2 = obj3;
                try {
                } catch (BackendException e3) {
                    e = e3;
                    if (e.getStatusCode() == 403) {
                    }
                }
                ParamsObject paramsObject2 = (ParamsObject) obj;
                ConfigModel configModel2 = new ConfigModel();
                configModel2.initializeFromModel(null, c1161412.this$0._configModelStore.getModel());
                configModel2.setInitializedWithRemote(true);
                configModel2.setAppId(c1161412.$appId);
                configModel2.setNotificationChannels(paramsObject2.getNotificationChannels());
                configModel2.setGoogleProjectNumber(paramsObject2.getGoogleProjectNumber());
                configModel2.getFcmParams().setProjectId(paramsObject2.getFcmParams().getProjectId());
                configModel2.getFcmParams().setAppId(paramsObject2.getFcmParams().getAppId());
                configModel2.getFcmParams().setApiKey(paramsObject2.getFcmParams().getApiKey());
                enterprise = paramsObject2.getEnterprise();
                if (enterprise != null) {
                    configModel2.setEnterprise(enterprise.booleanValue());
                }
                useIdentityVerification = paramsObject2.getUseIdentityVerification();
                if (useIdentityVerification != null) {
                    configModel2.setUseIdentityVerification(useIdentityVerification.booleanValue());
                }
                firebaseAnalytics = paramsObject2.getFirebaseAnalytics();
                if (firebaseAnalytics != null) {
                    configModel2.setFirebaseAnalytics(firebaseAnalytics.booleanValue());
                }
                restoreTTLFilter = paramsObject2.getRestoreTTLFilter();
                if (restoreTTLFilter != null) {
                    configModel2.setRestoreTTLFilter(restoreTTLFilter.booleanValue());
                }
                clearGroupOnSummaryClick = paramsObject2.getClearGroupOnSummaryClick();
                if (clearGroupOnSummaryClick != null) {
                    configModel2.setClearGroupOnSummaryClick(clearGroupOnSummaryClick.booleanValue());
                }
                receiveReceiptEnabled = paramsObject2.getReceiveReceiptEnabled();
                if (receiveReceiptEnabled != null) {
                    configModel2.setReceiveReceiptEnabled(receiveReceiptEnabled.booleanValue());
                }
                disableGMSMissingPrompt = paramsObject2.getDisableGMSMissingPrompt();
                if (disableGMSMissingPrompt != null) {
                    configModel2.setDisableGMSMissingPrompt(disableGMSMissingPrompt.booleanValue());
                }
                unsubscribeWhenNotificationsDisabled = paramsObject2.getUnsubscribeWhenNotificationsDisabled();
                if (unsubscribeWhenNotificationsDisabled != null) {
                    configModel2.setUnsubscribeWhenNotificationsDisabled(unsubscribeWhenNotificationsDisabled.booleanValue());
                }
                locationShared = paramsObject2.getLocationShared();
                if (locationShared != null) {
                    configModel2.setLocationShared(locationShared.booleanValue());
                }
                requiresUserPrivacyConsent = paramsObject2.getRequiresUserPrivacyConsent();
                if (requiresUserPrivacyConsent != null) {
                    configModel2.setConsentRequired(ml1.m39301a(requiresUserPrivacyConsent.booleanValue()));
                }
                opRepoExecutionInterval = paramsObject2.getOpRepoExecutionInterval();
                if (opRepoExecutionInterval != null) {
                    configModel2.setOpRepoExecutionInterval(opRepoExecutionInterval.longValue());
                }
                notificationLimit = paramsObject2.getInfluenceParams().getNotificationLimit();
                if (notificationLimit != null) {
                    configModel2.getInfluenceParams().setNotificationLimit(notificationLimit.intValue());
                }
                indirectNotificationAttributionWindow = paramsObject2.getInfluenceParams().getIndirectNotificationAttributionWindow();
                if (indirectNotificationAttributionWindow != null) {
                    configModel2.getInfluenceParams().setIndirectNotificationAttributionWindow(indirectNotificationAttributionWindow.intValue());
                }
                iamLimit = paramsObject2.getInfluenceParams().getIamLimit();
                if (iamLimit != null) {
                    configModel2.getInfluenceParams().setIamLimit(iamLimit.intValue());
                }
                indirectIAMAttributionWindow = paramsObject2.getInfluenceParams().getIndirectIAMAttributionWindow();
                if (indirectIAMAttributionWindow != null) {
                    configModel2.getInfluenceParams().setIndirectIAMAttributionWindow(indirectIAMAttributionWindow.intValue());
                }
                boolIsDirectEnabled = paramsObject2.getInfluenceParams().isDirectEnabled();
                if (boolIsDirectEnabled != null) {
                    configModel2.getInfluenceParams().setDirectEnabled(boolIsDirectEnabled.booleanValue());
                }
                boolIsIndirectEnabled = paramsObject2.getInfluenceParams().isIndirectEnabled();
                if (boolIsIndirectEnabled != null) {
                    configModel2.getInfluenceParams().setIndirectEnabled(boolIsIndirectEnabled.booleanValue());
                }
                boolIsUnattributedEnabled = paramsObject2.getInfluenceParams().isUnattributedEnabled();
                if (boolIsUnattributedEnabled != null) {
                    configModel2.getInfluenceParams().setUnattributedEnabled(boolIsUnattributedEnabled.booleanValue());
                }
                c1161412.this$0._configModelStore.replace(configModel2, ModelChangeTags.HYDRATE);
                c116141 = c1161412;
                objM51918f = obj2;
                i = 1;
                i2 = i3;
                if (i != 0) {
                }
                IParamsBackendService iParamsBackendService222 = c116141.this$0._paramsBackendService;
                String str222 = c116141.$appId;
                id = c116141.this$0._subscriptionManager.getSubscriptions().getPush().getId();
                if (id.length() == 0) {
                }
                c116141.I$0 = i2;
                c116141.I$1 = i;
                c116141.label = 1;
                objFetchParams = iParamsBackendService222.fetchParams(str222, id, c116141);
                if (objFetchParams == objM51918f) {
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C116141) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public ConfigModelStoreListener(ConfigModelStore configModelStore, IParamsBackendService iParamsBackendService, ISubscriptionManager iSubscriptionManager) {
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iParamsBackendService, "_paramsBackendService");
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        this._configModelStore = configModelStore;
        this._paramsBackendService = iParamsBackendService;
        this._subscriptionManager = iSubscriptionManager;
    }

    private final void fetchParams() {
        String appId = this._configModelStore.getModel().getAppId();
        if (appId.length() == 0) {
            return;
        }
        ThreadUtilsKt.suspendifyOnThread$default(0, new C116141(appId, this, null), 1, null);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(modelChangedArgs.getProperty(), RemoteConfigConstants.RequestFieldKey.APP_ID)) {
            fetchParams();
        }
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
        fetchParams();
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel configModel, String str) {
        sq8.m48649h(configModel, "model");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(str, ModelChangeTags.NORMAL)) {
            fetchParams();
        }
    }
}
