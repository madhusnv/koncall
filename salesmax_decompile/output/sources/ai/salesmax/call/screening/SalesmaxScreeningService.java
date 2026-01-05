package ai.salesmax.call.screening;

import ai.salesmax.model.CallEvent;
import android.telecom.Call;
import android.telecom.CallScreeningService;
import com.amplifyframework.datastore.generated.model.CallDirection;
import p001o.e7d;
import p001o.hv1;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SalesmaxScreeningService extends CallScreeningService {
    /* renamed from: a */
    public final String m160a(String str) {
        return null;
    }

    /* renamed from: b */
    public final void m161b(Call.Details details) {
        String callerDisplayName = details.getCallerDisplayName();
        String schemeSpecificPart = details.getHandle().getSchemeSpecificPart();
        int callDirection = details.getCallDirection();
        String strName = callDirection != 0 ? callDirection != 1 ? null : CallDirection.OUTGOING.name() : CallDirection.INCOMING.name();
        long creationTimeMillis = details.getCreationTimeMillis();
        String string = details.toString();
        sq8.m48648g(string, "toString(...)");
        CallEvent callEventBuild = new CallEvent.Builder().number(e7d.m24492e(schemeSpecificPart)).direction(strName).callStartTime(Long.valueOf(creationTimeMillis)).name(callerDisplayName).callId(m160a(string)).source("SCREENING").context(getApplicationContext()).callStatus("RINGING").isConnectedCall(Boolean.TRUE).build();
        hv1.f27574f.m31195a().m31186r(callEventBuild);
        StringBuilder sb = new StringBuilder();
        sb.append("Call Event: ");
        sb.append(callEventBuild);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Call Details: ");
        sb2.append(details);
    }

    @Override // android.telecom.CallScreeningService
    public void onScreenCall(Call.Details details) {
        sq8.m48649h(details, "callDetails");
        CallScreeningService.CallResponse.Builder builder = new CallScreeningService.CallResponse.Builder();
        builder.setDisallowCall(false);
        m161b(details);
        respondToCall(details, builder.build());
    }
}
