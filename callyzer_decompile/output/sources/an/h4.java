package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.se;
import om.C5405g;
import org.bouncycastle.i18n.MessageBundle;
import ph.C5950e;
import pm.C5974a;
import yv.C8800o;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f903a;

    /* renamed from: b */
    public final /* synthetic */ int f904b;

    /* renamed from: c */
    public final /* synthetic */ m4 f905c;

    public /* synthetic */ h4(int i10, m4 m4Var, int i11) {
        this.f903a = i11;
        this.f904b = i10;
        this.f905c = m4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [pm.a] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        LocalDateTime localDateTimeM16183G;
        LocalDateTime localDateTimeM16183G2;
        int i10 = this.f903a;
        LocalDateTime localDateTimeM16183G3 = null;
        m4 m4Var = this.f905c;
        int i11 = this.f904b;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("SELECT * FROM CallNoteTemplate  WHERE id = ?");
                try {
                    interfaceC4026cY0.mo1778g(1, i11);
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
                    if (!interfaceC4026cY0.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.CallNoteTemplate>.");
                    }
                    int i12 = (int) interfaceC4026cY0.getLong(iM10916d);
                    String strMo1777W = interfaceC4026cY0.mo1777W(iM10916d2);
                    String strMo1777W2 = interfaceC4026cY0.mo1777W(iM10916d3);
                    boolean z6 = ((int) interfaceC4026cY0.getLong(iM10916d4)) != 0;
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
                        localDateTimeM16183G3 = C8800o.m16183G(strMo1777W4);
                    }
                    LocalDateTime localDateTime = localDateTimeM16183G3;
                    if (localDateTime == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                    }
                    Integer numValueOf = Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d7));
                    C5950e c5950e = m4Var.f1108c;
                    EnumC8992b enumC8992bM11979j = C5950e.m11979j(numValueOf);
                    if (enumC8992bM11979j != null) {
                        return new C5405g(i12, strMo1777W, strMo1777W2, z6, localDateTimeM16183G, localDateTime, enumC8992bM11979j, (int) interfaceC4026cY0.getLong(iM10916d8), interfaceC4026cY0.mo1777W(iM10916d9), interfaceC4026cY0.mo1777W(iM10916d10));
                    }
                    throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                } finally {
                    interfaceC4026cY0.close();
                }
            default:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("\n    SELECT t.*, s.slot as slot \n    FROM CallNoteTemplate t\n    LEFT JOIN UserSimDetails s \n    ON t.sim_number = s.sim_number\n    WHERE t.id = ?\n    ");
                try {
                    interfaceC4026cY0.mo1778g(1, i11);
                    int iM10916d11 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d12 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
                    int iM10916d13 = se.m10916d(interfaceC4026cY0, "description");
                    int iM10916d14 = se.m10916d(interfaceC4026cY0, "is_master");
                    int iM10916d15 = se.m10916d(interfaceC4026cY0, "last_Modified_date_time");
                    int iM10916d16 = se.m10916d(interfaceC4026cY0, "create_date_time");
                    int iM10916d17 = se.m10916d(interfaceC4026cY0, "call_note_template_sync_status");
                    int iM10916d18 = se.m10916d(interfaceC4026cY0, "use_count");
                    int iM10916d19 = se.m10916d(interfaceC4026cY0, "note_template_id");
                    int iM10916d20 = se.m10916d(interfaceC4026cY0, "sim_number");
                    int iM10916d21 = se.m10916d(interfaceC4026cY0, "slot");
                    if (interfaceC4026cY0.r0()) {
                        Integer numValueOf2 = interfaceC4026cY0.isNull(iM10916d21) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d21));
                        int i13 = (int) interfaceC4026cY0.getLong(iM10916d11);
                        String strMo1777W5 = interfaceC4026cY0.mo1777W(iM10916d12);
                        String strMo1777W6 = interfaceC4026cY0.mo1777W(iM10916d13);
                        boolean z10 = ((int) interfaceC4026cY0.getLong(iM10916d14)) != 0;
                        String strMo1777W7 = interfaceC4026cY0.isNull(iM10916d15) ? null : interfaceC4026cY0.mo1777W(iM10916d15);
                        if (strMo1777W7 != null) {
                            C8800o c8800o3 = C8800o.f42459a;
                            localDateTimeM16183G2 = C8800o.m16183G(strMo1777W7);
                        } else {
                            localDateTimeM16183G2 = null;
                        }
                        String strMo1777W8 = interfaceC4026cY0.isNull(iM10916d16) ? null : interfaceC4026cY0.mo1777W(iM10916d16);
                        if (strMo1777W8 != null) {
                            C8800o c8800o4 = C8800o.f42459a;
                            localDateTimeM16183G3 = C8800o.m16183G(strMo1777W8);
                        }
                        LocalDateTime localDateTime2 = localDateTimeM16183G3;
                        if (localDateTime2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        Integer numValueOf3 = Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d17));
                        C5950e c5950e2 = m4Var.f1108c;
                        EnumC8992b enumC8992bM11979j2 = C5950e.m11979j(numValueOf3);
                        if (enumC8992bM11979j2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        localDateTimeM16183G3 = new C5974a(new C5405g(i13, strMo1777W5, strMo1777W6, z10, localDateTimeM16183G2, localDateTime2, enumC8992bM11979j2, (int) interfaceC4026cY0.getLong(iM10916d18), interfaceC4026cY0.mo1777W(iM10916d19), interfaceC4026cY0.mo1777W(iM10916d20)), numValueOf2);
                    }
                    return localDateTimeM16183G3;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }
}
