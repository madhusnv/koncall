package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.re;
import om.C5412n;
import ph.C5950e;
import yv.C8800o;
import zm.EnumC8992b;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f932a;

    /* renamed from: b */
    public final /* synthetic */ Object f933b;

    /* renamed from: c */
    public final /* synthetic */ int f934c;

    /* renamed from: d */
    public final /* synthetic */ Object f935d;

    public /* synthetic */ i2(Object obj, Object obj2, int i10, int i11) {
        this.f932a = i11;
        this.f933b = obj;
        this.f935d = obj2;
        this.f934c = i10;
    }

    /* JADX WARN: Finally extract failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        int iM10878b;
        LocalDateTime localDateTimeM16183G;
        int i10 = this.f932a;
        String strM16212u = null;
        localDateTimeM16183G = null;
        LocalDateTime localDateTimeM16183G2 = null;
        int i11 = this.f934c;
        Object obj2 = this.f935d;
        Object obj3 = this.f933b;
        switch (i10) {
            case 0:
                String str = (String) obj3;
                LocalDateTime localDateTime = (LocalDateTime) obj2;
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("UPDATE CallLog SET notes=?, note_modified_date_time = ? WHERE id = ?");
                try {
                    if (str == null) {
                        interfaceC4026cY0.mo1779i(1);
                    } else {
                        interfaceC4026cY0.mo1776B(1, str);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime);
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY0.mo1779i(2);
                    } else {
                        interfaceC4026cY0.mo1776B(2, strM16212u);
                    }
                    interfaceC4026cY0.mo1778g(3, i11);
                    interfaceC4026cY0.r0();
                    iM10878b = re.m10878b(_connection);
                    interfaceC4026cY0.close();
                    break;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                String str2 = (String) obj3;
                EnumC8994d enumC8994d = (EnumC8994d) obj2;
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT `call_type`, `date_time`, `slot` FROM (SELECT CallLog.phone_number,CallLog.call_type,CallLog.date_time,CallLog.sim_number,CallLog.slot FROM ViewCallLogContactUserSim AS CallLog WHERE CallLog.phone_number=? AND call_type = ? AND duration <= ? AND NOT EXISTS (SELECT * FROM ViewCallLogContactUserSim Contact WHERE CallLog.phone_number = Contact.phone_number AND CallLog.date_time < Contact.date_time AND Contact.duration > ? )  ORDER BY date_time DESC)");
                try {
                    interfaceC4026cY02.mo1776B(1, str2);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY02.mo1779i(2);
                    } else {
                        interfaceC4026cY02.mo1778g(2, r0.intValue());
                    }
                    long j6 = i11;
                    interfaceC4026cY02.mo1778g(3, j6);
                    interfaceC4026cY02.mo1778g(4, j6);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY02.r0()) {
                        Integer numValueOf = interfaceC4026cY02.isNull(0) ? null : Integer.valueOf((int) interfaceC4026cY02.getLong(0));
                        EnumC8994d enumC8994d2 = (numValueOf != null && numValueOf.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf != null && numValueOf.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf != null && numValueOf.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        if (enumC8994d2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        String strMo1777W = interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1);
                        if (strMo1777W != null) {
                            C8800o c8800o2 = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        if (localDateTimeM16183G == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        arrayList.add(new C5412n(localDateTimeM16183G, enumC8994d2, (int) interfaceC4026cY02.getLong(2)));
                    }
                    return arrayList;
                } finally {
                }
            case 2:
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("select max(date_time) from CallLog where phone_number=? and country_code=? and sim_number=?");
                try {
                    interfaceC4026cY03.mo1776B(1, str3);
                    interfaceC4026cY03.mo1778g(2, i11);
                    interfaceC4026cY03.mo1776B(3, str4);
                    if (interfaceC4026cY03.r0()) {
                        String strMo1777W2 = interfaceC4026cY03.isNull(0) ? null : interfaceC4026cY03.mo1777W(0);
                        if (strMo1777W2 != null) {
                            C8800o c8800o3 = C8800o.f42459a;
                            localDateTimeM16183G2 = C8800o.m16183G(strMo1777W2);
                        }
                    }
                    return localDateTimeM16183G2;
                } finally {
                }
            default:
                m4 m4Var = (m4) obj3;
                EnumC8992b enumC8992b = (EnumC8992b) obj2;
                InterfaceC4024a _connection4 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection4, "_connection");
                InterfaceC4026c interfaceC4026cY04 = _connection4.y0("UPDATE CallNoteTemplate  SET  call_note_template_sync_status = ? WHERE id = ?");
                try {
                    C5950e c5950e = m4Var.f1108c;
                    interfaceC4026cY04.mo1778g(1, C5950e.m11978i(enumC8992b));
                    interfaceC4026cY04.mo1778g(2, i11);
                    interfaceC4026cY04.r0();
                    iM10878b = re.m10878b(_connection4);
                    break;
                } finally {
                }
        }
        return Integer.valueOf(iM10878b);
    }

    public /* synthetic */ i2(String str, int i10, String str2) {
        this.f932a = 2;
        this.f933b = str;
        this.f934c = i10;
        this.f935d = str2;
    }
}
