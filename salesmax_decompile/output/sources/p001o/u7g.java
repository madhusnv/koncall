package p001o;

import android.media.AudioRecord;
import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.hac;
import p001o.p69;
import p001o.ule;
import p001o.xle;

/* loaded from: classes.dex */
public final class u7g {

    /* renamed from: v */
    public static final C17324a f48501v = new C17324a(null);

    /* renamed from: w */
    public static final int f48502w = 8;

    /* renamed from: x */
    public static final y9b f48503x = y9b.f55104e.m57404b("application/json; charset=utf-8");

    /* renamed from: a */
    public final String f48504a;

    /* renamed from: b */
    public AudioRecord f48505b;

    /* renamed from: c */
    public b6j f48506c;

    /* renamed from: d */
    public p69 f48507d;

    /* renamed from: e */
    public final int f48508e;

    /* renamed from: f */
    public final cqb f48509f;

    /* renamed from: g */
    public final mge f48510g;

    /* renamed from: h */
    public final hac f48511h;

    /* renamed from: i */
    public final h84 f48512i;

    /* renamed from: j */
    public String f48513j;

    /* renamed from: k */
    public final Map f48514k;

    /* renamed from: l */
    public final List f48515l;

    /* renamed from: m */
    public final List f48516m;

    /* renamed from: n */
    public boolean f48517n;

    /* renamed from: o */
    public p69 f48518o;

    /* renamed from: p */
    public p69 f48519p;

    /* renamed from: q */
    public final long f48520q;

    /* renamed from: r */
    public final long f48521r;

    /* renamed from: s */
    public final cqb f48522s;

    /* renamed from: t */
    public final q4g f48523t;

    /* renamed from: u */
    public final C17331h f48524u;

    /* renamed from: o.u7g$a */
    public static final class C17324a {
        public C17324a() {
        }

        public /* synthetic */ C17324a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.u7g$b */
    public static final class C17325b extends jgg implements nl7 {

        /* renamed from: a */
        public int f48525a;

        public C17325b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return u7g.this.new C17325b(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws JSONException {
            zqe zqeVarExecute;
            String strM21620r;
            uq8.m51918f();
            if (this.f48525a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("input_audio_format", "pcm16");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("model", "gpt-4o-transcribe");
                jSONObject2.put("language", "en");
                y3i y3iVar = y3i.f54824a;
                jSONObject.put("input_audio_transcription", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", "server_vad");
                jSONObject3.put("threshold", 0.5d);
                jSONObject3.put("prefix_padding_ms", 300);
                jSONObject3.put("silence_duration_ms", 200);
                jSONObject.put("turn_detection", jSONObject3);
                xle.C18181a c18181a = xle.f53902a;
                String string = jSONObject.toString();
                sq8.m48648g(string, "toString(...)");
                zqeVarExecute = FirebasePerfOkHttpClient.execute(u7g.this.f48511h.mo19702a(new ule.C17397a().m51769z("https://api.openai.com/v1/realtime/transcription_sessions").m51745a("Authorization", "Bearer " + u7g.this.f48504a).m51761r(c18181a.m56459a(string, u7g.f48503x)).m51746b()));
                cre creVarM59735c = zqeVarExecute.m59735c();
                strM21620r = creVarM59735c != null ? creVarM59735c.m21620r() : null;
            } catch (Exception unused) {
            }
            if (zqeVarExecute.U0()) {
                if (strM21620r == null) {
                    strM21620r = "";
                }
                JSONObject jSONObject4 = new JSONObject(strM21620r);
                u7g.this.f48513j = jSONObject4.optString(OutcomeConstants.OUTCOME_ID);
                JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("client_secret");
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject.optString("value");
                }
                return null;
            }
            int iM59739h = zqeVarExecute.m59739h();
            String strM59726C = zqeVarExecute.m59726C();
            StringBuilder sb = new StringBuilder();
            sb.append("Token fetch failed: ");
            sb.append(iM59739h);
            sb.append(" ");
            sb.append(strM59726C);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Token fetch response body: ");
            sb2.append(strM21620r);
            return null;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17325b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.u7g$c */
    public static final class C17326c extends jgg implements nl7 {

        /* renamed from: a */
        public int f48527a;

        public C17326c(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return u7g.this.new C17326c(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f48527a;
            if (i == 0) {
                wre.m54934b(obj);
                u7g.this.f48514k.clear();
                u7g.this.f48515l.clear();
                u7g.this.f48509f.setValue("");
                cqb cqbVar = u7g.this.f48509f;
                this.f48527a = 1;
                if (cqbVar.emit("", this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            u7g.this.f48516m.clear();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17326c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.u7g$d */
    public static final class C17327d extends jgg implements nl7 {

        /* renamed from: a */
        public int f48529a;

        public C17327d(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return u7g.this.new C17327d(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalStateException {
            Object objM51918f = uq8.m51918f();
            int i = this.f48529a;
            if (i == 0) {
                wre.m54934b(obj);
                long j = u7g.this.f48521r;
                this.f48529a = 1;
                if (nk5.m40720b(j, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            u7g.this.m51182G();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17327d) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.u7g$e */
    public static final class C17328e extends jgg implements nl7 {

        /* renamed from: a */
        public int f48531a;

        /* renamed from: b */
        public /* synthetic */ Object f48532b;

        public C17328e(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17328e c17328e = u7g.this.new C17328e(n64Var);
            c17328e.f48532b = obj;
            return c17328e;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objM51918f = uq8.m51918f();
            int i = this.f48531a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    h84 h84Var = (h84) this.f48532b;
                    u7g u7gVar = u7g.this;
                    this.f48532b = h84Var;
                    this.f48531a = 1;
                    obj = u7gVar.m51184x(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                str = (String) obj;
            } catch (Exception unused) {
            }
            if (str == null) {
                return y3i.f54824a;
            }
            u7g.this.f48511h.m30052B(new ule.C17397a().m51769z("wss://api.openai.com/v1/realtime?intent=transcription").m51745a("Authorization", "Bearer " + str).m51745a("OpenAI-Beta", "realtime=v1").m51746b(), u7g.this.f48524u);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17328e) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.u7g$f */
    public static final class C17329f extends jgg implements nl7 {

        /* renamed from: a */
        public int f48534a;

        public C17329f(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return u7g.this.new C17329f(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalStateException {
            Object objM51918f = uq8.m51918f();
            int i = this.f48534a;
            if (i == 0) {
                wre.m54934b(obj);
                long j = u7g.this.f48520q;
                this.f48534a = 1;
                if (nk5.m40720b(j, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            u7g.this.m51182G();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17329f) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.u7g$g */
    public static final class C17330g extends jgg implements nl7 {

        /* renamed from: a */
        public int f48536a;

        /* renamed from: b */
        public /* synthetic */ Object f48537b;

        public C17330g(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17330g c17330g = u7g.this.new C17330g(n64Var);
            c17330g.f48537b = obj;
            return c17330g;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws JSONException {
            uq8.m51918f();
            if (this.f48536a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            h84 h84Var = (h84) this.f48537b;
            int i = u7g.this.f48508e;
            byte[] bArr = new byte[i];
            while (i84.m31713g(h84Var)) {
                AudioRecord audioRecord = u7g.this.f48505b;
                if (!(audioRecord != null && audioRecord.getRecordingState() == 3)) {
                    break;
                }
                AudioRecord audioRecord2 = u7g.this.f48505b;
                int i2 = audioRecord2 != null ? audioRecord2.read(bArr, 0, i) : 0;
                if (i2 > 0) {
                    byte[] bArrM27265n = fp0.m27265n(bArr, 0, i2);
                    if (u7g.this.f48517n) {
                        if (true ^ u7g.this.f48516m.isEmpty()) {
                            for (byte[] bArr2 : u7g.this.f48516m) {
                                b6j b6jVar = u7g.this.f48506c;
                                if (b6jVar != null) {
                                    u7g.this.m51178C(b6jVar, bArr2);
                                }
                            }
                            u7g.this.f48516m.clear();
                        }
                        b6j b6jVar2 = u7g.this.f48506c;
                        if (b6jVar2 != null) {
                            u7g.this.m51178C(b6jVar2, bArrM27265n);
                        }
                    } else {
                        u7g.this.f48516m.add(bArrM27265n);
                    }
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17330g) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.u7g$h */
    public static final class C17331h extends d6j {
        public C17331h() {
        }

        @Override // p001o.d6j
        public void onClosed(b6j b6jVar, int i, String str) {
            sq8.m48649h(b6jVar, "webSocket");
            sq8.m48649h(str, "reason");
            StringBuilder sb = new StringBuilder();
            sb.append("WebSocket closed: ");
            sb.append(i);
            sb.append(" / ");
            sb.append(str);
        }

        @Override // p001o.d6j
        public void onFailure(b6j b6jVar, Throwable th, zqe zqeVar) {
            sq8.m48649h(b6jVar, "webSocket");
            sq8.m48649h(th, "t");
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // p001o.d6j
        public void onMessage(b6j b6jVar, String str) {
            sq8.m48649h(b6jVar, "webSocket");
            sq8.m48649h(str, "text");
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("type");
                if (strOptString != null) {
                    switch (strOptString.hashCode()) {
                        case -1599272477:
                            if (strOptString.equals("transcription_session.created")) {
                                u7g u7gVar = u7g.this;
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(OutcomeEventsTable.COLUMN_NAME_SESSION);
                                u7gVar.f48513j = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(OutcomeConstants.OUTCOME_ID) : null;
                                String str2 = u7g.this.f48513j;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Session ID received: ");
                                sb.append(str2);
                                u7g.this.f48517n = true;
                                return;
                            }
                            break;
                        case 194337921:
                            if (!strOptString.equals("conversation.item.input_audio_transcription.completed")) {
                                break;
                            } else {
                                String strOptString2 = jSONObject.optString(FirebaseAnalytics.Param.ITEM_ID);
                                String strOptString3 = jSONObject.optString("transcript");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Completed received: itemId=");
                                sb2.append(strOptString2);
                                sb2.append(", delta=");
                                sb2.append(strOptString3);
                                sq8.m48646e(strOptString2);
                                if (!(!f9g.d0(strOptString2)) || strOptString3 == null) {
                                    return;
                                }
                                u7g.this.f48514k.remove(strOptString2);
                                u7g.this.f48515l.add(f9g.Z0(strOptString3).toString());
                                u7g.this.m51183H();
                                return;
                            }
                        case 424608500:
                            if (!strOptString.equals("input_audio_buffer.speech_started")) {
                                break;
                            } else {
                                u7g.this.f48522s.setValue(Boolean.TRUE);
                                return;
                            }
                        case 437474368:
                            if (!strOptString.equals("input_audio_buffer.speech_stopped")) {
                                break;
                            } else {
                                u7g.this.f48522s.setValue(Boolean.FALSE);
                                return;
                            }
                        case 1665969390:
                            if (!strOptString.equals("conversation.item.input_audio_transcription.delta")) {
                                break;
                            } else {
                                u7g.this.m51177B();
                                String strOptString4 = jSONObject.optString(FirebaseAnalytics.Param.ITEM_ID);
                                String strOptString5 = jSONObject.optString("delta");
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Delta received: itemId=");
                                sb3.append(strOptString4);
                                sb3.append(", delta=");
                                sb3.append(strOptString5);
                                sq8.m48646e(strOptString4);
                                if (!(!f9g.d0(strOptString4)) || strOptString5 == null) {
                                    return;
                                }
                                String str3 = (String) u7g.this.f48514k.get(strOptString4);
                                if (str3 == null) {
                                    str3 = "";
                                }
                                u7g.this.f48514k.put(strOptString4, str3 + strOptString5);
                                u7g.this.m51183H();
                                return;
                            }
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unhandled event type: ");
                sb4.append(strOptString);
            } catch (Exception unused) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Error parsing WebSocket message: ");
                sb5.append(str);
            }
        }

        @Override // p001o.d6j
        public void onOpen(b6j b6jVar, zqe zqeVar) {
            sq8.m48649h(b6jVar, "webSocket");
            sq8.m48649h(zqeVar, "response");
            u7g.this.f48506c = b6jVar;
        }
    }

    public u7g(String str) {
        sq8.m48649h(str, "apiKey");
        this.f48504a = str;
        this.f48508e = 4096;
        this.f48509f = s4g.m47838a("");
        this.f48510g = new mge("<\\|vq_lbr_audio_[0-9A-Za-z]+\\|>");
        this.f48511h = new hac.C13902a().m30111X(0L, TimeUnit.MILLISECONDS).m30116c();
        this.f48512i = i84.m31707a(eu5.m25611b().plus(a79.m16544b(null, 1, null)));
        this.f48514k = new LinkedHashMap();
        this.f48515l = new ArrayList();
        this.f48516m = new ArrayList();
        this.f48520q = 60000L;
        this.f48521r = 30000L;
        cqb cqbVarM47838a = s4g.m47838a(Boolean.FALSE);
        this.f48522s = cqbVarM47838a;
        this.f48523t = cqbVarM47838a;
        this.f48524u = new C17331h();
    }

    /* renamed from: A */
    public final void m51176A() {
        rm1.m46952d(this.f48512i, null, null, new C17326c(null), 3, null);
    }

    /* renamed from: B */
    public final void m51177B() {
        p69 p69Var = this.f48519p;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        this.f48519p = rm1.m46952d(this.f48512i, null, null, new C17327d(null), 3, null);
    }

    /* renamed from: C */
    public final void m51178C(b6j b6jVar, byte[] bArr) throws JSONException {
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "input_audio_buffer.append");
        jSONObject.put("audio", strEncodeToString);
        String string = jSONObject.toString();
        sq8.m48648g(string, "toString(...)");
        b6jVar.mo18202b(string);
    }

    /* renamed from: D */
    public final void m51179D() throws IllegalStateException {
        m51181F();
        m51180E();
        m51177B();
        rm1.m46952d(this.f48512i, null, null, new C17328e(null), 3, null);
    }

    /* renamed from: E */
    public final void m51180E() {
        p69 p69Var = this.f48518o;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        this.f48518o = rm1.m46952d(this.f48512i, null, null, new C17329f(null), 3, null);
    }

    /* renamed from: F */
    public final void m51181F() throws IllegalStateException {
        AudioRecord audioRecord = new AudioRecord(1, 24000, 16, 2, this.f48508e);
        this.f48505b = audioRecord;
        audioRecord.startRecording();
        this.f48507d = rm1.m46952d(this.f48512i, null, null, new C17330g(null), 3, null);
    }

    /* renamed from: G */
    public final void m51182G() throws IllegalStateException {
        try {
            p69 p69Var = this.f48518o;
            if (p69Var != null) {
                p69.C15966a.m42999a(p69Var, null, 1, null);
            }
            p69 p69Var2 = this.f48519p;
            if (p69Var2 != null) {
                p69.C15966a.m42999a(p69Var2, null, 1, null);
            }
            p69 p69Var3 = this.f48507d;
            if (p69Var3 != null) {
                p69.C15966a.m42999a(p69Var3, null, 1, null);
            }
            this.f48507d = null;
            AudioRecord audioRecord = this.f48505b;
            if (audioRecord != null) {
                audioRecord.stop();
            }
            AudioRecord audioRecord2 = this.f48505b;
            if (audioRecord2 != null) {
                audioRecord2.release();
            }
            this.f48505b = null;
            this.f48517n = false;
            b6j b6jVar = this.f48506c;
            if (b6jVar != null) {
                b6jVar.mo18204f(1000, "Normal closure");
            }
            this.f48506c = null;
            this.f48514k.clear();
            this.f48515l.clear();
            this.f48509f.setValue("");
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    public final void m51183H() {
        StringBuilder sb = new StringBuilder();
        sb.append(kh3.p0(this.f48515l, " ", null, null, 0, null, null, 62, null));
        if (!this.f48514k.isEmpty()) {
            sb.append(" ");
            sb.append(kh3.p0(this.f48514k.values(), " ", null, null, 0, null, null, 62, null));
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        String string2 = f9g.Z0(string).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Updated transcript: ");
        sb2.append(string2);
        this.f48509f.setValue(this.f48510g.m38996h(string2, ""));
    }

    /* renamed from: x */
    public final Object m51184x(n64 n64Var) {
        return pm1.m43867g(eu5.m25611b(), new C17325b(null), n64Var);
    }

    /* renamed from: y */
    public final q4g m51185y() {
        return this.f48509f;
    }

    /* renamed from: z */
    public final q4g m51186z() {
        return this.f48523t;
    }
}
