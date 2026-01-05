package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.C1275a;
import com.google.android.gms.fido.fido2.api.common.C1276b;
import com.google.android.gms.fido.fido2.api.common.C1277c;
import com.google.android.gms.fido.fido2.api.common.C1278d;
import com.google.android.gms.fido.fido2.api.common.C1279e;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.sun.mail.imap.IMAPStore;
import gg.C2587b;
import gg.C2588c;
import gg.C2590e;
import gg.C2591f;
import gg.C2593h;
import gg.C2595j;
import gg.C2596k;
import gg.C2597l;
import gg.C2598m;
import gg.C2599n;
import gg.C2600o;
import gg.C2604s;
import h6.C2850f;
import h6.C2865u;
import i0.m0;
import i6.AbstractC3174c;
import i6.C3172a;
import i6.C3173b;
import i6.C3175d;
import i6.C3176e;
import i6.C3177f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4451b;
import lf.C4452c;
import lf.C4459j;
import mg.u0;
import nx.AbstractC5178p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pf.C5905e;
import pf.C5906f;
import qw.C6361k;
import qw.InterfaceC6353c;
import rw.AbstractC6674x;
import sf.AbstractC6840z;
import tf.InterfaceC7150b;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<ErrorCode, AbstractC3174c> orderedErrorCodeToExceptions;
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = TransferTable.COLUMN_TYPE;
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = IMAPStore.ID_NAME;
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private final byte[] getChallenge(JSONObject jSONObject) throws JSONException {
            String challengeB64 = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            AbstractC4154l.m8922e(challengeB64, "challengeB64");
            if (challengeB64.length() != 0) {
                return b64Decode(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j6) throws PackageManager.NameNotFoundException {
            long versionLong;
            if (C5905e.f28746d.m11516c(context, C5906f.f28747a) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            AbstractC4154l.m8922e(packageManager, "context.packageManager");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                AbstractC4154l.m8922e(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                versionLong = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                versionLong = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return versionLong > j6;
        }

        /* renamed from: addAuthenticatorAttestationResponse$credentials_play_services_auth_release */
        public final void m782x55ac6fce(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            AbstractC4154l.m8923f(clientDataJSON, "clientDataJSON");
            AbstractC4154l.m8923f(attestationObject, "attestationObject");
            AbstractC4154l.m8923f(transportArray, "transportArray");
            AbstractC4154l.m8923f(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(m784x54c9ae06(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            AbstractC4154l.m8923f(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            AbstractC4154l.m8922e(bArrDecode, "decode(str, FLAGS)");
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            AbstractC4154l.m8923f(data, "data");
            String strEncodeToString = Base64.encodeToString(data, 11);
            AbstractC4154l.m8922e(strEncodeToString, "encodeToString(data, FLAGS)");
            return strEncodeToString;
        }

        /* renamed from: beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release */
        public final GetCredentialException m783x9b91fc47(ErrorCode code, String str) {
            AbstractC4154l.m8923f(code, "code");
            AbstractC3174c abstractC3174c = m795x717581f0().get(code);
            return abstractC3174c == null ? new GetPublicKeyCredentialDomException(new C3172a(22), m0.m7378k("unknown fido gms exception - ", str)) : (code == ErrorCode.NOT_ALLOWED_ERR && str != null && AbstractC5178p.m10116x(str, "Unable to get sync account", false)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(abstractC3174c, str);
        }

        public final boolean checkAlgSupported(int i10) {
            try {
                C2593h.m6586a(i10);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final C1277c convert(C2850f request, Context context) {
            AbstractC4154l.m8923f(request, "request");
            String str = request.f15860d;
            AbstractC4154l.m8923f(context, "context");
            return isDeviceGMSVersionOlderThan(context, PublicKeyCredentialControllerUtility.AUTH_MIN_VERSION_JSON_CREATE) ? new C1277c(str) : convertJSON$credentials_play_services_auth_release(new JSONObject(str));
        }

        public final C1277c convertJSON$credentials_play_services_auth_release(JSONObject json) throws JSONException, CreatePublicKeyCredentialDomException {
            AbstractC4154l.m8923f(json, "json");
            C2598m c2598m = new C2598m();
            m798x2d055f1c(json, c2598m);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, c2598m);
            m797x81bb96da(json, c2598m);
            parseOptionalTimeout$credentials_play_services_auth_release(json, c2598m);
            m796x4e596641(json, c2598m);
            parseOptionalExtensions$credentials_play_services_auth_release(json, c2598m);
            C2599n c2599n = c2598m.f14124a;
            C2600o c2600o = c2598m.f14125b;
            byte[] bArr = c2598m.f14126c;
            ArrayList arrayList = c2598m.f14127d;
            Double d2 = c2598m.f14128e;
            ArrayList arrayList2 = c2598m.f14129f;
            C1276b c1276b = c2598m.f14130g;
            AttestationConveyancePreference attestationConveyancePreference = c2598m.f14131h;
            return new C1277c(c2599n, c2600o, bArr, arrayList, d2, arrayList2, c1276b, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), c2598m.f14132i, null, null);
        }

        public final C4451b convertToPlayAuthPasskeyJsonRequest(C2865u option) {
            AbstractC4154l.m8923f(option, "option");
            return new C4451b(true, option.f15874d);
        }

        @InterfaceC6353c
        public final C4452c convertToPlayAuthPasskeyRequest(C2865u option) throws JSONException {
            AbstractC4154l.m8923f(option, "option");
            JSONObject jSONObject = new JSONObject(option.f15874d);
            String rpId = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            AbstractC4154l.m8922e(rpId, "rpId");
            if (rpId.length() != 0) {
                return new C4452c(rpId, true, getChallenge(jSONObject));
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        /* renamed from: getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release */
        public final String m784x54c9ae06() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        /* renamed from: getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release */
        public final String m785x4cbca474() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        /* renamed from: getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release */
        public final String m786xf055c137() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        /* renamed from: getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release */
        public final String m787xa1a1c52a() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        /* renamed from: getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release */
        public final String m788x174cd597() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        /* renamed from: getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m789x1277f26e() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        /* renamed from: getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m790x42bd95bb() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        /* renamed from: getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release */
        public final String m791x11a7ad79() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        /* renamed from: getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release */
        public final String m792xe9a27208() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        /* renamed from: getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release */
        public final String m793x55d9bf39() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        /* renamed from: getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release */
        public final String m794xd8020d7b() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        /* renamed from: getOrderedErrorCodeToExceptions$credentials_play_services_auth_release */
        public final LinkedHashMap<ErrorCode, AbstractC3174c> m795x717581f0() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        /* renamed from: parseOptionalAuthenticatorSelection$credentials_play_services_auth_release */
        public final void m796x4e596641(JSONObject json, C2598m builder) throws JSONException {
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(builder, "builder");
            if (json.has(m786xf055c137())) {
                JSONObject jSONObject = json.getJSONObject(m786xf055c137());
                boolean zOptBoolean = jSONObject.optBoolean(m792xe9a27208(), false);
                String residentKey = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                AbstractC4154l.m8922e(residentKey, "residentKey");
                ResidentKeyRequirement residentKeyRequirementFromString = residentKey.length() > 0 ? ResidentKeyRequirement.fromString(residentKey) : null;
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                String authenticatorAttachmentString = jSONObject.optString(m785x4cbca474(), "");
                AbstractC4154l.m8922e(authenticatorAttachmentString, "authenticatorAttachmentString");
                Attachment attachmentFromString = authenticatorAttachmentString.length() > 0 ? Attachment.fromString(authenticatorAttachmentString) : null;
                builder.f14130g = new C1276b(attachmentFromString == null ? null : attachmentFromString.toString(), boolValueOf, null, residentKeyRequirementFromString == null ? null : residentKeyRequirementFromString.toString());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, C2598m builder) throws JSONException {
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                String appIdExtension = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                AbstractC4154l.m8922e(appIdExtension, "appIdExtension");
                builder.f14132i = new C2587b(appIdExtension.length() > 0 ? new C2595j(appIdExtension) : null, null, jSONObject.optBoolean("uvm", false) ? new C2604s(true) : null, null, null, null, null, null, jSONObject.optBoolean(m793x55d9bf39(), false) ? new C2596k(true) : null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, C2598m builder) {
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.f14128e = Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / IMAPStore.RESPONSE);
            }
        }

        /* renamed from: parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release */
        public final void m797x81bb96da(JSONObject json, C2598m builder) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(m788x174cd597())) {
                JSONArray jSONArray = json.getJSONArray(m788x174cd597());
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    AbstractC4154l.m8922e(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String descriptorType = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    AbstractC4154l.m8922e(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            try {
                                Transport transportFromString = Transport.fromString(jSONArray2.getString(i11));
                                AbstractC4154l.m8922e(transportFromString, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(transportFromString);
                            } catch (Transport.UnsupportedTransportException e2) {
                                throw new CreatePublicKeyCredentialDomException(new C3172a(3), e2.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new C1278d(descriptorType, arrayList, bArrB64Decode));
                }
            }
            builder.f14129f = arrayList2;
            String attestationString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            AbstractC4154l.m8922e(attestationString, "attestationString");
            builder.f14131h = AttestationConveyancePreference.fromString(attestationString.length() != 0 ? attestationString : "none");
        }

        /* renamed from: parseRequiredChallengeAndUser$credentials_play_services_auth_release */
        public final void m798x2d055f1c(JSONObject json, C2598m builder) throws JSONException {
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(builder, "builder");
            byte[] challenge = getChallenge(json);
            AbstractC6840z.m13036g(challenge);
            builder.f14126c = challenge;
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            AbstractC4154l.m8922e(string, "user.getString(JSON_KEY_ID)");
            byte[] bArrB64Decode = b64Decode(string);
            String userName = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String displayName = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            AbstractC4154l.m8922e(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            AbstractC4154l.m8922e(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.f14125b = new C2600o(userName, strOptString, displayName, bArrB64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, C2598m builder) throws JSONException {
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String rpId = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String rpName = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            AbstractC4154l.m8920c(strOptString);
            if (strOptString.length() == 0) {
                strOptString = null;
            }
            AbstractC4154l.m8922e(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            AbstractC4154l.m8922e(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.f14124a = new C2599n(rpId, rpName, strOptString);
            JSONArray jSONArray = json.getJSONArray(m791x11a7ad79());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                int i11 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String typeParam = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                AbstractC4154l.m8922e(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i11)) {
                    arrayList.add(new C1279e(typeParam, i11));
                }
            }
            builder.f14127d = arrayList;
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(C2597l cred) {
            AbstractC4154l.m8923f(cred, "cred");
            InterfaceC7150b interfaceC7150b = cred.f14119d;
            if (interfaceC7150b == null && (interfaceC7150b = cred.f14120e) == null && (interfaceC7150b = cred.f14121f) == null) {
                throw new IllegalStateException("No response set.");
            }
            if (!(interfaceC7150b instanceof C1275a)) {
                return null;
            }
            C1275a c1275a = (C1275a) interfaceC7150b;
            ErrorCode errorCode = c1275a.f6023a;
            AbstractC4154l.m8922e(errorCode, "authenticatorResponse.errorCode");
            AbstractC3174c abstractC3174c = m795x717581f0().get(errorCode);
            String str = c1275a.f6024b;
            return abstractC3174c == null ? new CreatePublicKeyCredentialDomException(new C3172a(22), m0.m7378k("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && str != null && AbstractC5178p.m10116x(str, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(abstractC3174c, str);
        }

        public final String toAssertPasskeyResponse(C4459j cred) throws GetCredentialException {
            Object obj;
            AbstractC4154l.m8923f(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            C2597l c2597l = cred.f22222j;
            JSONObject jSONObject2 = null;
            if (c2597l != null) {
                obj = c2597l.f14119d;
                if (obj == null && (obj = c2597l.f14120e) == null && (obj = c2597l.f14121f) == null) {
                    throw new IllegalStateException("No response set.");
                }
            } else {
                obj = null;
            }
            AbstractC4154l.m8920c(obj);
            if (obj instanceof C1275a) {
                C1275a c1275a = (C1275a) obj;
                ErrorCode errorCode = c1275a.f6023a;
                AbstractC4154l.m8922e(errorCode, "authenticatorResponse.errorCode");
                throw m783x9b91fc47(errorCode, c1275a.f6024b);
            }
            if (!(obj instanceof C2590e)) {
                String string = jSONObject.toString();
                AbstractC4154l.m8922e(string, "json.toString()");
                return string;
            }
            try {
                C1275a c1275a2 = c2597l.f14121f;
                u0 u0Var = c2597l.f14118c;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (u0Var != null && u0Var.m9652m().length > 0) {
                        jSONObject3.put("rawId", AbstractC8947b.m16426c(u0Var.m9652m()));
                    }
                    String str = c2597l.f14123h;
                    if (str != null) {
                        jSONObject3.put("authenticatorAttachment", str);
                    }
                    String str2 = c2597l.f14117b;
                    if (str2 != null && c1275a2 == null) {
                        jSONObject3.put(TransferTable.COLUMN_TYPE, str2);
                    }
                    String str3 = c2597l.f14116a;
                    if (str3 != null) {
                        jSONObject3.put("id", str3);
                    }
                    String str4 = "response";
                    C2590e c2590e = c2597l.f14120e;
                    boolean z6 = true;
                    if (c2590e != null) {
                        jSONObject2 = c2590e.m6583b();
                    } else {
                        C2591f c2591f = c2597l.f14119d;
                        if (c2591f != null) {
                            jSONObject2 = c2591f.m6585b();
                        } else {
                            z6 = false;
                            if (c1275a2 != null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                    jSONObject2.put("code", c1275a2.f6023a.getCode());
                                    String str5 = c1275a2.f6024b;
                                    if (str5 != null) {
                                        jSONObject2.put("message", str5);
                                    }
                                    str4 = "error";
                                } catch (JSONException e2) {
                                    throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e2);
                                }
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(str4, jSONObject2);
                    }
                    C2588c c2588c = c2597l.f14122g;
                    if (c2588c != null) {
                        jSONObject3.put("clientExtensionResults", c2588c.m6582b());
                    } else if (z6) {
                        jSONObject3.put("clientExtensionResults", new JSONObject());
                    }
                    String string2 = jSONObject3.toString();
                    AbstractC4154l.m8922e(string2, "publicKeyCred.toJson()");
                    return string2;
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
                }
            } catch (Throwable th2) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
            }
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo info) {
            AbstractC4154l.m8923f(info, "info");
            return info.getLongVersionCode();
        }
    }

    static {
        C6361k[] c6361kArr = {new C6361k(ErrorCode.UNKNOWN_ERR, new C3172a(22)), new C6361k(ErrorCode.ABORT_ERR, new C3172a(0)), new C6361k(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C3172a(13)), new C6361k(ErrorCode.CONSTRAINT_ERR, new C3172a(1)), new C6361k(ErrorCode.DATA_ERR, new C3173b()), new C6361k(ErrorCode.INVALID_STATE_ERR, new C3175d()), new C6361k(ErrorCode.ENCODING_ERR, new C3172a(3)), new C6361k(ErrorCode.NETWORK_ERR, new C3172a(10)), new C6361k(ErrorCode.NOT_ALLOWED_ERR, new C3176e()), new C6361k(ErrorCode.NOT_SUPPORTED_ERR, new C3177f()), new C6361k(ErrorCode.SECURITY_ERR, new C3172a(18)), new C6361k(ErrorCode.TIMEOUT_ERR, new C3172a(20))};
        LinkedHashMap<ErrorCode, AbstractC3174c> linkedHashMap = new LinkedHashMap<>(AbstractC6674x.m12776d(12));
        AbstractC6674x.m12782j(linkedHashMap, c6361kArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final C1277c convert(C2850f c2850f, Context context) {
        return Companion.convert(c2850f, context);
    }
}
