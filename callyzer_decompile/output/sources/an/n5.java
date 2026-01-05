package an;

import ex.InterfaceC2139c;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import og.mb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1159a;

    /* renamed from: b */
    public final /* synthetic */ o5 f1160b;

    /* renamed from: c */
    public final /* synthetic */ C4802m f1161c;

    public /* synthetic */ n5(o5 o5Var, C4802m c4802m, int i10) {
        this.f1159a = i10;
        this.f1160b = o5Var;
        this.f1161c = c4802m;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        switch (this.f1159a) {
            case 0:
                AbstractC4154l.m8923f(_connection, "_connection");
                q2 q2Var = this.f1160b.f1210b;
                C4802m c4802m = this.f1161c;
                if (c4802m != null) {
                    InterfaceC4026c interfaceC4026cY0 = _connection.y0("INSERT OR REPLACE INTO `UserSimDetails` (`id`,`carrier_name`,`sim_number`,`sim_country_code`,`slot`,`icc_id`,`sub_id`,`user_name`,`device_connect_code`,`is_connect`,`last_call_sync`,`sync_subscription_start_time`,`sync_subscription_end_time`,`is_lead`,`is_sync_lead_numbers`,`employee_code`,`is_call_recording`,`call_recording_subscription_start_time`,`call_recording_subscription_end_time`,`employee_id`,`customer_name`,`customer_country_name`,`customer_country_code`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    try {
                        q2Var.m498a(interfaceC4026cY0, c4802m);
                        interfaceC4026cY0.r0();
                        mb.m10760a(interfaceC4026cY0, null);
                    } finally {
                    }
                }
                return qw.a0.f30746a;
            default:
                AbstractC4154l.m8923f(_connection, "_connection");
                return Integer.valueOf(this.f1160b.f1211c.m513b(_connection, this.f1161c));
        }
    }
}
