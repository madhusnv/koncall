package com.onesignal.core.internal.http.impl;

import android.net.TrafficStats;
import android.os.Build;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.api.client.json.Json;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.OneSignalWrapper;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.debug.internal.logging.Logging;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import org.apache.http.HttpHeaders;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.gge;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequestIODispatcher$job$1", m36648f = "HttpClient.kt", m36649l = {Opcodes.DCMPL}, m36650m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class HttpClient$makeRequestIODispatcher$job$1 extends jgg implements nl7 {
    final /* synthetic */ OptionalHeaders $headers;
    final /* synthetic */ JSONObject $jsonBody;
    final /* synthetic */ String $method;
    final /* synthetic */ gge $retVal;
    final /* synthetic */ int $timeout;
    final /* synthetic */ String $url;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$makeRequestIODispatcher$job$1(HttpClient httpClient, String str, int i, JSONObject jSONObject, String str2, OptionalHeaders optionalHeaders, gge ggeVar, n64 n64Var) {
        super(2, n64Var);
        this.this$0 = httpClient;
        this.$url = str;
        this.$timeout = i;
        this.$jsonBody = jSONObject;
        this.$method = str2;
        this.$headers = optionalHeaders;
        this.$retVal = ggeVar;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new HttpClient$makeRequestIODispatcher$job$1(this.this$0, this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0396 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ff A[PHI: r9
      0x03ff: PHI (r9v18 java.net.HttpURLConnection) = 
      (r9v17 java.net.HttpURLConnection)
      (r9v19 java.net.HttpURLConnection)
      (r9v19 java.net.HttpURLConnection)
      (r9v19 java.net.HttpURLConnection)
     binds: [B:134:0x0466, B:120:0x03cf, B:111:0x0385, B:95:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0431 A[Catch: all -> 0x046c, TryCatch #3 {all -> 0x046c, blocks: (B:126:0x040c, B:128:0x0410, B:131:0x0415, B:133:0x044f, B:132:0x0431), top: B:147:0x040c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020f A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:6:0x0020, B:34:0x00da, B:36:0x00e7, B:37:0x00ea, B:39:0x00ee, B:40:0x00fd, B:43:0x0120, B:44:0x0143, B:46:0x0147, B:51:0x0151, B:53:0x0177, B:54:0x0190, B:56:0x0194, B:59:0x019c, B:60:0x01ab, B:62:0x01af, B:65:0x01b7, B:66:0x01c6, B:68:0x01ca, B:71:0x01d2, B:72:0x01e1, B:74:0x01fd, B:75:0x0201, B:77:0x020f, B:82:0x022b, B:86:0x0239, B:88:0x025c, B:90:0x0262, B:92:0x0271, B:93:0x0275, B:95:0x02bb, B:94:0x029a, B:96:0x02cd, B:98:0x02e0, B:99:0x02e5, B:103:0x02f6, B:105:0x031e, B:108:0x0326, B:110:0x032e, B:111:0x0385, B:112:0x0396, B:114:0x03aa, B:116:0x03b0, B:120:0x03cf), top: B:144:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    @Override // p001o.vb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnectionNewHttpURLConnection;
        Object id;
        String str;
        JSONObject jSONObject;
        OptionalHeaders optionalHeaders;
        OptionalHeaders optionalHeaders2;
        OptionalHeaders optionalHeaders3;
        OptionalHeaders optionalHeaders4;
        int responseCode;
        long currentTimeMillis;
        String next;
        String headerField;
        Object objM51918f = uq8.m51918f();
        int i2 = this.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (Build.VERSION.SDK_INT >= 26) {
                TrafficStats.setThreadStatsTag(TransferRecord.MAXIMUM_UPLOAD_PARTS);
            }
            try {
                httpURLConnectionNewHttpURLConnection = this.this$0._connectionFactory.newHttpURLConnection(this.$url);
                try {
                    httpURLConnectionNewHttpURLConnection.setUseCaches(false);
                    httpURLConnectionNewHttpURLConnection.setConnectTimeout(this.$timeout);
                    httpURLConnectionNewHttpURLConnection.setReadTimeout(this.$timeout);
                    httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/050134");
                    if (OneSignalWrapper.getSdkType() != null && OneSignalWrapper.getSdkVersion() != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + OneSignalWrapper.getSdkType() + '/' + OneSignalWrapper.getSdkVersion());
                    }
                    httpURLConnectionNewHttpURLConnection.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
                    String pushSubscriptionId = this.this$0._configModelStore.getModel().getPushSubscriptionId();
                    if (pushSubscriptionId != null) {
                        if (pushSubscriptionId.length() > 0) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                        }
                    }
                    IInstallIdService iInstallIdService = this.this$0._installIdService;
                    this.L$0 = httpURLConnectionNewHttpURLConnection;
                    this.L$1 = httpURLConnectionNewHttpURLConnection;
                    this.L$2 = "OneSignal-Install-Id";
                    this.I$0 = -1;
                    this.label = 1;
                    id = iInstallIdService.getId(this);
                } catch (Throwable th) {
                    th = th;
                    i = -1;
                    httpURLConnection = httpURLConnectionNewHttpURLConnection;
                    if (!(th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                        Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                    } else {
                        Logging.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                    }
                    this.$retVal.f25106a = new HttpResponse(i, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return y3i.f54824a;
                }
            } catch (Throwable th2) {
                th = th2;
                i = -1;
                httpURLConnection = null;
            }
            if (id == objM51918f) {
                return objM51918f;
            }
            str = "OneSignal-Install-Id";
            httpURLConnection = httpURLConnectionNewHttpURLConnection;
            httpURLConnectionNewHttpURLConnection.setRequestProperty(str, ((UUID) id).toString());
            if (this.$jsonBody != null) {
            }
            if (this.$method != null) {
            }
            HttpClient httpClient = this.this$0;
            String requestMethod = httpURLConnection.getRequestMethod();
            URL url = httpURLConnection.getURL();
            sq8.m48648g(url, "con.url");
            JSONObject jSONObject2 = this.$jsonBody;
            Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
            sq8.m48648g(requestProperties, "con.requestProperties");
            httpClient.logHTTPSent(requestMethod, url, jSONObject2, requestProperties);
            jSONObject = this.$jsonBody;
            if (jSONObject != null) {
            }
            optionalHeaders = this.$headers;
            if ((optionalHeaders == null ? optionalHeaders.getCacheKey() : null) != null) {
            }
            optionalHeaders2 = this.$headers;
            if ((optionalHeaders2 == null ? optionalHeaders2.getRywToken() : null) != null) {
            }
            optionalHeaders3 = this.$headers;
            if ((optionalHeaders3 == null ? optionalHeaders3.getRetryCount() : null) != null) {
            }
            optionalHeaders4 = this.$headers;
            if ((optionalHeaders4 == null ? optionalHeaders4.getSessionDuration() : null) != null) {
            }
            responseCode = httpURLConnection.getResponseCode();
            Integer numRetryAfterFromResponse = this.this$0.retryAfterFromResponse(httpURLConnection);
            Integer numRetryLimitFromResponse = this.this$0.retryLimitFromResponse(httpURLConnection);
            currentTimeMillis = this.this$0._time.getCurrentTimeMillis() + ((numRetryAfterFromResponse != null ? numRetryAfterFromResponse.intValue() : 0) * 1000);
            if (currentTimeMillis > this.this$0.delayNewRequestsUntil) {
            }
            String str2 = "GET";
            if (responseCode == 304) {
            }
            httpURLConnection.disconnect();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$0;
            str = (String) this.L$2;
            httpURLConnectionNewHttpURLConnection = (HttpURLConnection) this.L$1;
            httpURLConnection = (HttpURLConnection) this.L$0;
            try {
                wre.m54934b(obj);
                id = obj;
                httpURLConnectionNewHttpURLConnection.setRequestProperty(str, ((UUID) id).toString());
                if (this.$jsonBody != null) {
                    httpURLConnection.setDoInput(true);
                }
                if (this.$method != null) {
                    httpURLConnection.setRequestProperty("Content-Type", Json.MEDIA_TYPE);
                    httpURLConnection.setRequestMethod(this.$method);
                    httpURLConnection.setDoOutput(true);
                }
                HttpClient httpClient2 = this.this$0;
                String requestMethod2 = httpURLConnection.getRequestMethod();
                URL url2 = httpURLConnection.getURL();
                sq8.m48648g(url2, "con.url");
                JSONObject jSONObject22 = this.$jsonBody;
                Map<String, List<String>> requestProperties2 = httpURLConnection.getRequestProperties();
                sq8.m48648g(requestProperties2, "con.requestProperties");
                httpClient2.logHTTPSent(requestMethod2, url2, jSONObject22, requestProperties2);
                jSONObject = this.$jsonBody;
                if (jSONObject != null) {
                    String unescapedEUIDString = JSONUtils.INSTANCE.toUnescapedEUIDString(jSONObject);
                    Charset charsetForName = Charset.forName(HTTP.UTF_8);
                    sq8.m48648g(charsetForName, "forName(charsetName)");
                    byte[] bytes = unescapedEUIDString.getBytes(charsetForName);
                    sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
                    httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                    httpURLConnection.getOutputStream().write(bytes);
                }
                optionalHeaders = this.$headers;
                if ((optionalHeaders == null ? optionalHeaders.getCacheKey() : null) != null) {
                    String string$default = IPreferencesService.DefaultImpls.getString$default(this.this$0._prefs, PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_ETAG_PREFIX + this.$headers.getCacheKey(), null, 4, null);
                    if (string$default != null) {
                        httpURLConnection.setRequestProperty(HttpHeaders.IF_NONE_MATCH, string$default);
                        Logging.debug$default("HttpClient: Adding header if-none-match: " + string$default, null, 2, null);
                    }
                }
                optionalHeaders2 = this.$headers;
                if ((optionalHeaders2 == null ? optionalHeaders2.getRywToken() : null) != null) {
                    httpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
                }
                optionalHeaders3 = this.$headers;
                if ((optionalHeaders3 == null ? optionalHeaders3.getRetryCount() : null) != null) {
                    httpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
                }
                optionalHeaders4 = this.$headers;
                if ((optionalHeaders4 == null ? optionalHeaders4.getSessionDuration() : null) != null) {
                    httpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
                }
                responseCode = httpURLConnection.getResponseCode();
                Integer numRetryAfterFromResponse2 = this.this$0.retryAfterFromResponse(httpURLConnection);
                Integer numRetryLimitFromResponse2 = this.this$0.retryLimitFromResponse(httpURLConnection);
                currentTimeMillis = this.this$0._time.getCurrentTimeMillis() + ((numRetryAfterFromResponse2 != null ? numRetryAfterFromResponse2.intValue() : 0) * 1000);
                if (currentTimeMillis > this.this$0.delayNewRequestsUntil) {
                    this.this$0.delayNewRequestsUntil = currentTimeMillis;
                }
                String str22 = "GET";
                if (responseCode == 304) {
                    switch (responseCode) {
                        case 200:
                        case 201:
                        case 202:
                            Scanner scanner = new Scanner(httpURLConnection.getInputStream(), HTTP.UTF_8);
                            next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                            StringBuilder sb = new StringBuilder();
                            sb.append("HttpClient: Got Response = ");
                            String str3 = this.$method;
                            if (str3 != null) {
                                str22 = str3;
                            }
                            sb.append(str22);
                            sb.append(TokenParser.SP);
                            sb.append(httpURLConnection.getURL());
                            sb.append(" - STATUS: ");
                            sb.append(responseCode);
                            sb.append(" - Body: ");
                            sb.append(next);
                            Logging.debug$default(sb.toString(), null, 2, null);
                            OptionalHeaders optionalHeaders5 = this.$headers;
                            if ((optionalHeaders5 != null ? optionalHeaders5.getCacheKey() : null) != null && (headerField = httpURLConnection.getHeaderField(TransferTable.COLUMN_ETAG)) != null) {
                                Logging.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                this.this$0._prefs.saveString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_ETAG_PREFIX + this.$headers.getCacheKey(), headerField);
                                this.this$0._prefs.saveString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_HTTP_CACHE_PREFIX + this.$headers.getCacheKey(), next);
                            }
                            this.$retVal.f25106a = new HttpResponse(responseCode, next, null, numRetryAfterFromResponse2, numRetryLimitFromResponse2, 4, null);
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("HttpClient: Got Response = ");
                            String str4 = this.$method;
                            if (str4 != null) {
                                str22 = str4;
                            }
                            sb2.append(str22);
                            sb2.append(TokenParser.SP);
                            sb2.append(httpURLConnection.getURL());
                            sb2.append(" - FAILED STATUS: ");
                            sb2.append(responseCode);
                            Logging.debug$default(sb2.toString(), null, 2, null);
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream == null) {
                                errorStream = httpURLConnection.getInputStream();
                            }
                            if (errorStream != null) {
                                Scanner scanner2 = new Scanner(errorStream, HTTP.UTF_8);
                                next = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                                scanner2.close();
                                Logging.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next, null, 2, null);
                            } else {
                                Logging.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                next = null;
                            }
                            this.$retVal.f25106a = new HttpResponse(responseCode, next, null, numRetryAfterFromResponse2, numRetryLimitFromResponse2, 4, null);
                            break;
                    }
                } else {
                    IPreferencesService iPreferencesService = this.this$0._prefs;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(PreferenceOneSignalKeys.PREFS_OS_HTTP_CACHE_PREFIX);
                    OptionalHeaders optionalHeaders6 = this.$headers;
                    sb3.append(optionalHeaders6 != null ? optionalHeaders6.getCacheKey() : null);
                    String string$default2 = IPreferencesService.DefaultImpls.getString$default(iPreferencesService, PreferenceStores.ONESIGNAL, sb3.toString(), null, 4, null);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("HttpClient: Got Response = ");
                    String str5 = this.$method;
                    if (str5 != null) {
                        str22 = str5;
                    }
                    sb4.append(str22);
                    sb4.append(TokenParser.SP);
                    sb4.append(httpURLConnection.getURL());
                    sb4.append(" - Using Cached response due to 304: ");
                    sb4.append(string$default2);
                    Logging.debug$default(sb4.toString(), null, 2, null);
                    this.$retVal.f25106a = new HttpResponse(responseCode, string$default2, null, numRetryAfterFromResponse2, numRetryLimitFromResponse2, 4, null);
                }
            } catch (Throwable th3) {
                th = th3;
                i = i3;
                try {
                    if (th instanceof ConnectException) {
                        Logging.info$default("HttpClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName(), null, 2, null);
                        this.$retVal.f25106a = new HttpResponse(i, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                    }
                    return y3i.f54824a;
                } catch (Throwable th4) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th4;
                }
            }
            httpURLConnection.disconnect();
        }
        return y3i.f54824a;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((HttpClient$makeRequestIODispatcher$job$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
