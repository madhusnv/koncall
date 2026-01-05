package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.fhh;
import p001o.ith;
import p001o.kcb;
import p001o.lth;
import p001o.nf8;
import p001o.p5g;
import p001o.pzf;
import p001o.si1;
import p001o.v38;
import p001o.z76;

@Beta
/* loaded from: classes3.dex */
public class OpenCensusUtils {
    static volatile fhh propagationTextFormat;
    static volatile fhh.AbstractC13435c propagationTextFormatSetter;
    private static final Logger logger = Logger.getLogger(OpenCensusUtils.class.getName());
    public static final String SPAN_NAME_HTTP_REQUEST_EXECUTE = "Sent." + HttpRequest.class.getName() + ".execute";
    private static final ith tracer = lth.m37885b();
    private static final AtomicLong idGenerator = new AtomicLong();
    private static volatile boolean isRecordEvent = true;

    static {
        propagationTextFormat = null;
        propagationTextFormatSetter = null;
        try {
            propagationTextFormat = v38.m52306a();
            propagationTextFormatSetter = new fhh.AbstractC13435c() { // from class: com.google.api.client.http.OpenCensusUtils.1
                @Override // p001o.fhh.AbstractC13435c
                public void put(HttpHeaders httpHeaders, String str, String str2) {
                    httpHeaders.set(str, (Object) str2);
                }
            };
        } catch (Exception e) {
            logger.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e);
        }
        try {
            lth.m37884a().mo23663a().mo50833b(nf8.m40500F(SPAN_NAME_HTTP_REQUEST_EXECUTE));
        } catch (Exception e2) {
            logger.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e2);
        }
    }

    private OpenCensusUtils() {
    }

    public static z76 getEndSpanOptions(Integer num) {
        z76.AbstractC18566a abstractC18566aM58863a = z76.m58863a();
        if (num == null) {
            abstractC18566aM58863a.mo36551b(p5g.f39356f);
        } else if (HttpStatusCodes.isSuccess(num.intValue())) {
            abstractC18566aM58863a.mo36551b(p5g.f39354d);
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 400) {
                abstractC18566aM58863a.mo36551b(p5g.f39357g);
            } else if (iIntValue == 401) {
                abstractC18566aM58863a.mo36551b(p5g.f39362l);
            } else if (iIntValue == 403) {
                abstractC18566aM58863a.mo36551b(p5g.f39361k);
            } else if (iIntValue == 404) {
                abstractC18566aM58863a.mo36551b(p5g.f39359i);
            } else if (iIntValue == 412) {
                abstractC18566aM58863a.mo36551b(p5g.f39364n);
            } else if (iIntValue != 500) {
                abstractC18566aM58863a.mo36551b(p5g.f39356f);
            } else {
                abstractC18566aM58863a.mo36551b(p5g.f39369s);
            }
        }
        return abstractC18566aM58863a.mo36550a();
    }

    public static ith getTracer() {
        return tracer;
    }

    public static boolean isRecordEvent() {
        return isRecordEvent;
    }

    public static void propagateTracingContext(pzf pzfVar, HttpHeaders httpHeaders) {
        Preconditions.checkArgument(pzfVar != null, "span should not be null.");
        Preconditions.checkArgument(httpHeaders != null, "headers should not be null.");
        if (propagationTextFormat == null || propagationTextFormatSetter == null || pzfVar.equals(si1.f45452e)) {
            return;
        }
        propagationTextFormat.mo26709a(pzfVar.m44566f(), httpHeaders, propagationTextFormatSetter);
    }

    public static void recordMessageEvent(pzf pzfVar, long j, kcb.EnumC14783b enumC14783b) {
        Preconditions.checkArgument(pzfVar != null, "span should not be null.");
        if (j < 0) {
            j = 0;
        }
        pzfVar.mo44563c(kcb.m35400a(enumC14783b, idGenerator.getAndIncrement()).mo35408d(j).mo35405a());
    }

    public static void recordReceivedMessageEvent(pzf pzfVar, long j) {
        recordMessageEvent(pzfVar, j, kcb.EnumC14783b.RECEIVED);
    }

    public static void recordSentMessageEvent(pzf pzfVar, long j) {
        recordMessageEvent(pzfVar, j, kcb.EnumC14783b.SENT);
    }

    public static void setIsRecordEvent(boolean z) {
        isRecordEvent = z;
    }

    public static void setPropagationTextFormat(fhh fhhVar) {
        propagationTextFormat = fhhVar;
    }

    public static void setPropagationTextFormatSetter(fhh.AbstractC13435c abstractC13435c) {
        propagationTextFormatSetter = abstractC13435c;
    }
}
