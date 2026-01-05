package p001o;

import ai.salesmax.model.CallEvent;
import ai.salesmax.model.CallStateEvent;
import android.telephony.TelephonyManager;
import com.amplifyframework.datastore.generated.model.CallDirection;

/* loaded from: classes.dex */
public final class zm implements av1, zz1 {

    /* renamed from: b */
    public static final C18680a f57387b = new C18680a(null);

    /* renamed from: c */
    public static final int f57388c = 8;

    /* renamed from: d */
    public static final zm f57389d = new zm();

    /* renamed from: a */
    public final tu1 f57390a = tu1.f47778e.m50641a();

    /* renamed from: o.zm$a */
    public static final class C18680a {
        public C18680a() {
        }

        public /* synthetic */ C18680a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final zm m59602a() {
            return m59603b();
        }

        /* renamed from: b */
        public final zm m59603b() {
            return zm.f57389d;
        }
    }

    @Override // p001o.av1
    /* renamed from: a */
    public void mo17862a(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        String source = callEvent.getSource();
        boolean z = false;
        if (source != null && source.compareTo("CALL_STATE") >= 0 && source.compareTo("CALL_LOG") <= 0) {
            z = true;
        }
        String number = callEvent.getNumber();
        if (number != null) {
            ey3 ey3Var = new ey3(number, null, null, null, !z, null, callEvent.getPhoneHandle(), 46, null);
            if (sq8.m48644c(callEvent.getDirection(), CallDirection.INCOMING.name())) {
                ey3Var.m25842h(lw9.f34447b);
            } else {
                ey3Var.m25842h(lw9.f34448c);
            }
            this.f57390a.v0(ey3Var);
        }
    }

    @Override // p001o.zz1
    /* renamed from: b */
    public void mo32313b(CallStateEvent callStateEvent) {
        sq8.m48649h(callStateEvent, "callStateEvent");
        String number = callStateEvent.getNumber();
        if (number != null) {
            this.f57390a.v0(new ey3(number, null, null, null, !(!sq8.m48644c(callStateEvent.getState(), TelephonyManager.EXTRA_STATE_OFFHOOK)), null, null, 110, null));
        }
    }

    @Override // p001o.av1
    /* renamed from: f */
    public void mo17863f(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        m59601l(callEvent);
    }

    /* renamed from: j */
    public final void m59599j(CallEvent callEvent) {
        this.f57390a.K0(callEvent.getContext(), callEvent.getNumber(), callEvent.getInFlightCall());
        StringBuilder sb = new StringBuilder();
        sb.append("Call routed to show popup for number: ");
        sb.append(callEvent);
    }

    /* renamed from: k */
    public final boolean m59600k(CallEvent callEvent) {
        return sq8.m48644c(callEvent.isConnectedCall(), Boolean.TRUE) || sq8.m48644c(callEvent.getCallStatus(), "RINGING") || sq8.m48644c(callEvent.getCallStatus(), "CONNECTED");
    }

    /* renamed from: l */
    public final void m59601l(CallEvent callEvent) {
        if (m59600k(callEvent)) {
            m59599j(callEvent);
        }
    }
}
