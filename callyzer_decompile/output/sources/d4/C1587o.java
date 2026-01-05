package d4;

import a1.C0011j;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0921p;
import c9.C0922q;
import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import g4.C2492h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import lx.InterfaceC4574m;
import og.ka;
import og.pe;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.a0;
import t8.C7059e;
import t8.C7064j;
import t8.e0;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.o */
/* loaded from: classes.dex */
public final class C1587o extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f7873a;

    /* renamed from: b */
    public final /* synthetic */ String f7874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1587o(String str, int i10) {
        super(1);
        this.f7873a = i10;
        this.f7874b = str;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f7873a;
        a0 a0Var = a0.f30746a;
        String str = this.f7874b;
        switch (i10) {
            case 0:
                AbstractC1594v.m5227e((InterfaceC1596x) obj, str);
                return a0Var;
            case 1:
                WorkDatabase db2 = (WorkDatabase) obj;
                AbstractC4154l.m8923f(db2, "db");
                C0011j c0011j = C0922q.f5621y;
                C0925t c0925tMo1368C = db2.mo1368C();
                c0925tMo1368C.getClass();
                C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                c8896yM16401j.mo9278q(1, str);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925tMo1368C.f5651a;
                workDatabase_Impl.m16388b();
                workDatabase_Impl.m16389c();
                try {
                    Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorM10840o.moveToNext()) {
                            String string = cursorM10840o.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorM10840o.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorM10840o.moveToPosition(-1);
                        c0925tMo1368C.m2673b(map);
                        c0925tMo1368C.m2672a(map2);
                        ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
                        while (cursorM10840o.moveToNext()) {
                            String string3 = cursorM10840o.getString(0);
                            e0 e0VarM10732f = ka.m10732f(cursorM10840o.getInt(1));
                            C7064j c7064jM13364a = C7064j.m13364a(cursorM10840o.getBlob(2));
                            int i11 = cursorM10840o.getInt(3);
                            int i12 = cursorM10840o.getInt(4);
                            arrayList.add(new C0921p(string3, e0VarM10732f, c7064jM13364a, cursorM10840o.getLong(14), cursorM10840o.getLong(15), cursorM10840o.getLong(16), new C7059e(ka.m10734h(cursorM10840o.getBlob(6)), ka.m10730d(cursorM10840o.getInt(5)), cursorM10840o.getInt(7) != 0, cursorM10840o.getInt(8) != 0, cursorM10840o.getInt(9) != 0, cursorM10840o.getInt(10) != 0, cursorM10840o.getLong(11), cursorM10840o.getLong(12), ka.m10727a(cursorM10840o.getBlob(13))), i11, ka.m10729c(cursorM10840o.getInt(17)), cursorM10840o.getLong(18), cursorM10840o.getLong(19), cursorM10840o.getInt(20), i12, cursorM10840o.getLong(21), cursorM10840o.getInt(22), (ArrayList) map.get(cursorM10840o.getString(0)), (ArrayList) map2.get(cursorM10840o.getString(0))));
                        }
                        workDatabase_Impl.m16399v();
                        cursorM10840o.close();
                        c8896yM16401j.m16402u();
                        workDatabase_Impl.m16395r();
                        Object objApply = c0011j.apply(arrayList);
                        AbstractC4154l.m8922e(objApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
                        return (List) objApply;
                    } catch (Throwable th2) {
                        cursorM10840o.close();
                        c8896yM16401j.m16402u();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl.m16395r();
                    throw th3;
                }
            case 2:
                InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
                C1595w c1595w = AbstractC1592t.f7920d;
                InterfaceC4574m interfaceC4574m = AbstractC1594v.f7944a[2];
                c1595w.m5236a((InterfaceC1596x) obj, str);
                return a0Var;
            case 3:
                AbstractC1594v.m5227e((InterfaceC1596x) obj, str);
                return a0Var;
            case 4:
                InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
                AbstractC1594v.m5228f(interfaceC1596x);
                AbstractC1594v.m5227e(interfaceC1596x, str);
                return a0Var;
            case 5:
                InterfaceC4574m[] interfaceC4574mArr2 = AbstractC1594v.f7944a;
                C1595w c1595w2 = AbstractC1592t.f7920d;
                InterfaceC4574m interfaceC4574m2 = AbstractC1594v.f7944a[2];
                c1595w2.m5236a((InterfaceC1596x) obj, str);
                return a0Var;
            case 6:
                InterfaceC1596x interfaceC1596x2 = (InterfaceC1596x) obj;
                AbstractC1594v.m5232j(interfaceC1596x2, new C2492h(6, str, null));
                AbstractC1594v.m5230h(interfaceC1596x2, 0);
                return a0Var;
            case 7:
                InterfaceC1596x interfaceC1596x3 = (InterfaceC1596x) obj;
                AbstractC1594v.m5228f(interfaceC1596x3);
                AbstractC1594v.m5227e(interfaceC1596x3, str);
                return a0Var;
            case 8:
                InterfaceC1596x interfaceC1596x4 = (InterfaceC1596x) obj;
                AbstractC1594v.m5232j(interfaceC1596x4, new C2492h(6, str, null));
                AbstractC1594v.m5230h(interfaceC1596x4, 0);
                return a0Var;
            case 9:
                InterfaceC1596x interfaceC1596x5 = (InterfaceC1596x) obj;
                AbstractC1594v.m5227e(interfaceC1596x5, str);
                AbstractC1594v.m5230h(interfaceC1596x5, 5);
                return a0Var;
            case 10:
                InterfaceC1596x interfaceC1596x6 = (InterfaceC1596x) obj;
                InterfaceC4574m[] interfaceC4574mArr3 = AbstractC1594v.f7944a;
                C1595w c1595w3 = AbstractC1592t.f7920d;
                InterfaceC4574m interfaceC4574m3 = AbstractC1594v.f7944a[2];
                c1595w3.m5236a(interfaceC1596x6, str);
                AbstractC1594v.m5234l(interfaceC1596x6, DefinitionKt.NO_Float_VALUE);
                return a0Var;
            case 11:
                AbstractC1594v.m5227e((InterfaceC1596x) obj, str);
                return a0Var;
            case 12:
                InterfaceC1596x interfaceC1596x7 = (InterfaceC1596x) obj;
                AbstractC1594v.m5233k(interfaceC1596x7);
                AbstractC1594v.m5227e(interfaceC1596x7, str);
                return a0Var;
            case 13:
                InterfaceC1596x interfaceC1596x8 = (InterfaceC1596x) obj;
                AbstractC1594v.m5230h(interfaceC1596x8, 3);
                AbstractC1594v.m5227e(interfaceC1596x8, str);
                return a0Var;
            case 14:
                AbstractC1594v.m5227e((InterfaceC1596x) obj, str);
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                InterfaceC4574m[] interfaceC4574mArr4 = AbstractC1594v.f7944a;
                ((C1583k) ((InterfaceC1596x) obj)).m5202q(AbstractC1592t.f7913J, str);
                return a0Var;
            default:
                InterfaceC1596x interfaceC1596x9 = (InterfaceC1596x) obj;
                AbstractC1594v.m5227e(interfaceC1596x9, str);
                AbstractC1594v.m5230h(interfaceC1596x9, 5);
                return a0Var;
        }
    }
}
