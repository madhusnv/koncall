package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.se;
import om.C5405g;
import org.bouncycastle.i18n.MessageBundle;
import ph.C5950e;
import yv.C8800o;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1060a;

    /* renamed from: b */
    public final /* synthetic */ m4 f1061b;

    /* renamed from: c */
    public final /* synthetic */ EnumC8992b f1062c;

    public /* synthetic */ l4(m4 m4Var, EnumC8992b enumC8992b, int i10) {
        this.f1060a = i10;
        this.f1061b = m4Var;
        this.f1062c = enumC8992b;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        LocalDateTime localDateTimeM16183G;
        int i10 = this.f1060a;
        EnumC8992b enumC8992b = this.f1062c;
        m4 m4Var = this.f1061b;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("\n    SELECT * FROM CallNoteTemplate \n    WHERE call_note_template_sync_status != ?\n    ORDER BY COALESCE(last_Modified_date_time, create_date_time) DESC\n");
                try {
                    C5950e c5950e = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(1, C5950e.m11978i(enumC8992b));
                    int iM10916d = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d2 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
                    int iM10916d3 = se.m10916d(interfaceC4026cY0, "description");
                    int iM10916d4 = se.m10916d(interfaceC4026cY0, "is_master");
                    int iM10916d5 = se.m10916d(interfaceC4026cY0, "last_Modified_date_time");
                    int iM10916d6 = se.m10916d(interfaceC4026cY0, "create_date_time");
                    int iM10916d7 = se.m10916d(interfaceC4026cY0, "call_note_template_sync_status");
                    int iM10916d8 = se.m10916d(interfaceC4026cY0, "use_count");
                    int iM10916d9 = se.m10916d(interfaceC4026cY0, "note_template_id");
                    int iM10916d10 = se.m10916d(interfaceC4026cY0, "sim_number");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        int i11 = (int) interfaceC4026cY0.getLong(iM10916d);
                        String strMo1777W = interfaceC4026cY0.mo1777W(iM10916d2);
                        String strMo1777W2 = interfaceC4026cY0.mo1777W(iM10916d3);
                        iM10916d4 = iM10916d4;
                        int i12 = iM10916d;
                        boolean z6 = ((int) interfaceC4026cY0.getLong(iM10916d4)) != 0;
                        LocalDateTime localDateTimeM16183G2 = null;
                        String strMo1777W3 = interfaceC4026cY0.isNull(iM10916d5) ? null : interfaceC4026cY0.mo1777W(iM10916d5);
                        if (strMo1777W3 != null) {
                            C8800o c8800o = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W3);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        String strMo1777W4 = interfaceC4026cY0.isNull(iM10916d6) ? null : interfaceC4026cY0.mo1777W(iM10916d6);
                        if (strMo1777W4 != null) {
                            C8800o c8800o2 = C8800o.f42459a;
                            localDateTimeM16183G2 = C8800o.m16183G(strMo1777W4);
                        }
                        LocalDateTime localDateTime = localDateTimeM16183G2;
                        if (localDateTime == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        EnumC8992b enumC8992bM11979j = C5950e.m11979j(Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d7)));
                        if (enumC8992bM11979j == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList.add(new C5405g(i11, strMo1777W, strMo1777W2, z6, localDateTimeM16183G, localDateTime, enumC8992bM11979j, (int) interfaceC4026cY0.getLong(iM10916d8), interfaceC4026cY0.mo1777W(iM10916d9), interfaceC4026cY0.mo1777W(iM10916d10)));
                        iM10916d = i12;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            default:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("SELECT COUNT(*) FROM CallNoteTemplate  WHERE is_master = ? AND call_note_template_sync_status != ?");
                try {
                    interfaceC4026cY0.mo1778g(1, 0);
                    C5950e c5950e2 = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(2, C5950e.m11978i(enumC8992b));
                    int i13 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    interfaceC4026cY0.close();
                    return Integer.valueOf(i13);
                } finally {
                    interfaceC4026cY0.close();
                }
        }
    }
}
