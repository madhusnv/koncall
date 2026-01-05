package l4;

import ad.C0100g;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c6.b1;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.imap.IMAPStore;
import ec.C2011i;
import ex.InterfaceC2137a;
import f8.C2213h;
import f8.C2214i;
import f8.C2215j;
import f8.C2216k;
import h00.InterfaceC2766b;
import h00.InterfaceC2767c;
import h6.C2856l;
import i0.m0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import jc.C3733i;
import jf.C3758a;
import k4.C4001v;
import k9.C4033g;
import kc.InterfaceC4050e;
import kotlin.jvm.internal.AbstractC4154l;
import kz.ThreadFactoryC4298d;
import l1.C4327p;
import m2.C4640e;
import m8.C4672b;
import nd.InterfaceC5014e;
import ni.C5074c;
import ni.InterfaceC5073b;
import nz.C5206q;
import nz.C5208s;
import nz.C5210u;
import nz.InterfaceC5198i;
import nz.InterfaceC5211v;
import nz.InterfaceC5212w;
import od.C5342f;
import og.be;
import og.md;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.slf4j.helpers.C5712a;
import q9.C6148f;
import qw.C6360j;
import s1.C6715j;
import sc.C6781a;
import sc.C6802v;
import sc.InterfaceC6783c;
import sc.InterfaceC6786f;
import sd.C6813g;
import sk.C6861i;
import tb.AbstractC7109t;
import tb.C7096g;
import tb.C7108s;
import tb.EnumC7091b;
import tb.InterfaceC7101l;
import tc.C7117b;
import th.C7159i;
import ug.c1;
import ug.d1;
import ug.h4;
import ug.i1;
import ug.m1;
import ug.n1;
import ug.q2;
import ug.t0;
import ug.v0;
import ug.v1;
import ug.y1;
import uh.InterfaceC7458c;
import ui.InterfaceC7470a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class d0 implements InterfaceC6786f, InterfaceC5198i, p013o.g0, InterfaceC5014e, InterfaceC2767c, InterfaceC6783c, InterfaceC7101l, InterfaceC7458c, InterfaceC7470a {

    /* renamed from: a */
    public final /* synthetic */ int f21880a;

    /* renamed from: b */
    public Object f21881b;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f21880a = i10;
        this.f21881b = obj;
    }

    /* renamed from: A */
    public static d0 m9070A(String str) {
        return new d0(23, (TextUtils.isEmpty(str) || str.length() > 1) ? v1.UNINITIALIZED : y1.m14208e(str.charAt(0)));
    }

    /* renamed from: q */
    public static final void m9071q(C7096g c7096g, C7117b c7117b, String str, String str2, boolean z6, boolean z10) {
        EnumC7091b enumC7091b = c7096g.f34244f;
        C3733i c3733i = c7117b.f34312c;
        if (!z6 || str2 == null) {
            return;
        }
        int i10 = AbstractC7109t.f34295a[enumC7091b.ordinal()];
        if (i10 == 1) {
            if (z10 || !c3733i.m339s(str)) {
                c3733i.m318F(str2, str);
                return;
            }
            return;
        }
        if (i10 != 2) {
            throw new C6360j(m0.m7378k("An operation is not implemented: ", "Support for " + enumC7091b + " is not yet implemented"));
        }
        C0100g c0100g = c7117b.f34311b.f362e;
        if (z10 || !c0100g.f351c.containsKey(str)) {
            c0100g.f351c.remove(str);
            C6813g c6813g = C6813g.f32364n;
            c0100g.put(c6813g.mo12984a(str), c6813g.mo12984a(str2));
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m9072r(C7096g c7096g, C7117b c7117b, String str, String str2, boolean z6, int i10) {
        if ((i10 & 16) != 0) {
            z6 = true;
        }
        m9071q(c7096g, c7117b, str, str2, z6, true);
    }

    /* renamed from: s */
    public static void m9073s(C4672b c4672b) {
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4672b.mo9263p("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c4672b.mo9263p("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c4672b.mo9263p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c4672b.mo9263p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4672b.mo9263p("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4672b.mo9263p("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c4672b.mo9263p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c4672b.mo9263p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    /* renamed from: u */
    public static C3758a m9074u(C4672b c4672b) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new C2213h("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new C2213h("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C2214i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C2214i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C2215j("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new C2215j("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        C2216k c2216k = new C2216k("Dependency", map, hashSet, hashSet2);
        C2216k c2216kM5927a = C2216k.m5927a(c4672b, "Dependency");
        if (!c2216k.equals(c2216kM5927a)) {
            return new C3758a(false, AbstractC5601a.m11236g("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", c2216k, "\n Found:\n", c2216kM5927a), 3);
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new C2213h("id", "TEXT", true, 1, null, 1));
        map2.put(TransferTable.COLUMN_STATE, new C2213h(TransferTable.COLUMN_STATE, "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new C2213h("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new C2213h("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new C2213h("input", "BLOB", true, 0, null, 1));
        map2.put("output", new C2213h("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new C2213h("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new C2213h("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new C2213h("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new C2213h("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new C2213h("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new C2213h("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new C2213h("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        map2.put("minimum_retention_duration", new C2213h("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new C2213h("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new C2213h("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new C2213h("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new C2213h("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new C2213h("generation", "INTEGER", true, 0, "0", 1));
        map2.put("next_schedule_time_override", new C2213h("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        map2.put("next_schedule_time_override_generation", new C2213h("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        map2.put("stop_reason", new C2213h("stop_reason", "INTEGER", true, 0, "-256", 1));
        map2.put("trace_tag", new C2213h("trace_tag", "TEXT", false, 0, null, 1));
        map2.put("required_network_type", new C2213h("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("required_network_request", new C2213h("required_network_request", "BLOB", true, 0, "x''", 1));
        map2.put("requires_charging", new C2213h("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new C2213h("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new C2213h("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new C2213h("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new C2213h("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new C2213h("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new C2213h("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C2215j("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new C2215j("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        C2216k c2216k2 = new C2216k("WorkSpec", map2, hashSet3, hashSet4);
        C2216k c2216kM5927a2 = C2216k.m5927a(c4672b, "WorkSpec");
        if (!c2216k2.equals(c2216kM5927a2)) {
            return new C3758a(false, AbstractC5601a.m11236g("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", c2216k2, "\n Found:\n", c2216kM5927a2), 3);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new C2213h("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new C2213h("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C2214i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C2215j("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2216k c2216k3 = new C2216k("WorkTag", map3, hashSet5, hashSet6);
        C2216k c2216kM5927a3 = C2216k.m5927a(c4672b, "WorkTag");
        if (!c2216k3.equals(c2216kM5927a3)) {
            return new C3758a(false, AbstractC5601a.m11236g("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", c2216k3, "\n Found:\n", c2216kM5927a3), 3);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new C2213h("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new C2213h("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new C2213h("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C2214i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C2216k c2216k4 = new C2216k("SystemIdInfo", map4, hashSet7, new HashSet(0));
        C2216k c2216kM5927a4 = C2216k.m5927a(c4672b, "SystemIdInfo");
        if (!c2216k4.equals(c2216kM5927a4)) {
            return new C3758a(false, AbstractC5601a.m11236g("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", c2216k4, "\n Found:\n", c2216kM5927a4), 3);
        }
        HashMap map5 = new HashMap(2);
        map5.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new C2213h("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C2214i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C2215j("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2216k c2216k5 = new C2216k("WorkName", map5, hashSet8, hashSet9);
        C2216k c2216kM5927a5 = C2216k.m5927a(c4672b, "WorkName");
        if (!c2216k5.equals(c2216kM5927a5)) {
            return new C3758a(false, AbstractC5601a.m11236g("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", c2216k5, "\n Found:\n", c2216kM5927a5), 3);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new C2213h("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new C2213h("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C2214i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C2216k c2216k6 = new C2216k("WorkProgress", map6, hashSet10, new HashSet(0));
        C2216k c2216kM5927a6 = C2216k.m5927a(c4672b, "WorkProgress");
        if (!c2216k6.equals(c2216kM5927a6)) {
            return new C3758a(false, AbstractC5601a.m11236g("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", c2216k6, "\n Found:\n", c2216kM5927a6), 3);
        }
        HashMap map7 = new HashMap(2);
        map7.put(TransferTable.COLUMN_KEY, new C2213h(TransferTable.COLUMN_KEY, "TEXT", true, 1, null, 1));
        map7.put("long_value", new C2213h("long_value", "INTEGER", false, 0, null, 1));
        C2216k c2216k7 = new C2216k("Preference", map7, new HashSet(0), new HashSet(0));
        C2216k c2216kM5927a7 = C2216k.m5927a(c4672b, "Preference");
        return !c2216k7.equals(c2216kM5927a7) ? new C3758a(false, AbstractC5601a.m11236g("Preference(androidx.work.impl.model.Preference).\n Expected:\n", c2216k7, "\n Found:\n", c2216kM5927a7), 3) : new C3758a(true, (String) null, 3);
    }

    /* renamed from: B */
    public boolean m9075B() {
        if (!m9077D()) {
            return false;
        }
        n1 n1Var = (n1) this.f21881b;
        n1Var.f35674l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        d1 d1Var = n1Var.f35668e;
        n1.m14083i(d1Var);
        return jCurrentTimeMillis - d1Var.f35327B.m13856a() > n1Var.f35667d.m13886T(null, ug.f0.f44816j0);
    }

    /* renamed from: C */
    public void m9076C(long j6) throws IOException {
        long jM9078E = m9078E();
        if (jM9078E != j6) {
            if (jM9078E != -1) {
                if (jM9078E != -2) {
                    return;
                } else {
                    jM9078E = -2;
                }
            }
            throw new IOException("expected non-string scope or scope " + j6 + " but found " + jM9078E);
        }
    }

    /* renamed from: D */
    public boolean m9077D() {
        d1 d1Var = ((n1) this.f21881b).f35668e;
        n1.m14083i(d1Var);
        return d1Var.f35327B.m13856a() > 0;
    }

    /* renamed from: E */
    public long m9078E() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f21881b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // nz.InterfaceC5198i
    /* renamed from: a */
    public C5206q mo9079a() throws Throwable {
        InterfaceC5211v interfaceC5211vMo8772m;
        C5208s c5208s = (C5208s) this.f21881b;
        IOException iOException = null;
        while (!c5208s.f25414m.m10161l()) {
            try {
                interfaceC5211vMo8772m = c5208s.mo8772m();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = e2;
                } else {
                    md.m10764a(iOException, e2);
                }
                if (!c5208s.mo8775p(null)) {
                    throw iOException;
                }
            }
            if (!interfaceC5211vMo8772m.mo10169d()) {
                C5210u c5210uMo10170e = interfaceC5211vMo8772m.mo10170e();
                if (c5210uMo10170e.f25421b == null && c5210uMo10170e.f25422c == null) {
                    c5210uMo10170e = interfaceC5211vMo8772m.mo10172g();
                }
                InterfaceC5211v interfaceC5211v = c5210uMo10170e.f25421b;
                Throwable th2 = c5210uMo10170e.f25422c;
                if (th2 != null) {
                    throw th2;
                }
                if (interfaceC5211v != null) {
                    c5208s.f25418r.addFirst(interfaceC5211v);
                }
            }
            return interfaceC5211vMo8772m.mo10168c();
        }
        throw new IOException("Canceled");
    }

    @Override // nz.InterfaceC5198i
    /* renamed from: b */
    public InterfaceC5212w mo9080b() {
        return (C5208s) this.f21881b;
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: c */
    public void mo211c() {
        ((InterfaceC2766b) this.f21881b).mo6760m();
    }

    @Override // h00.InterfaceC2767c
    public void clear() {
        C5712a c5712a = (C5712a) this.f21881b;
        Map map = (Map) c5712a.get();
        if (map != null) {
            map.clear();
            c5712a.remove();
        }
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: d */
    public void mo212d(Throwable ex2) {
        AbstractC4154l.m8923f(ex2, "ex");
        ((InterfaceC2766b) this.f21881b).mo6757d(ex2);
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: e */
    public void mo213e(Object value, String key) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        ((InterfaceC2766b) this.f21881b).mo6758i(value, key);
    }

    @Override // h00.InterfaceC2767c
    /* renamed from: f */
    public void mo6761f(Map map) {
        ((C5712a) this.f21881b).set(new HashMap(map));
    }

    @Override // h00.InterfaceC2767c
    /* renamed from: h */
    public Map mo6762h() {
        Map map = (Map) ((C5712a) this.f21881b).get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // sc.InterfaceC6783c
    /* renamed from: j */
    public Object mo8769j(C6802v c6802v, C6781a c6781a) {
        InterfaceC4050e[] interfaceC4050eArr = (InterfaceC4050e[]) this.f21881b;
        ArrayList arrayList = new ArrayList(interfaceC4050eArr.length);
        for (InterfaceC4050e interfaceC4050e : interfaceC4050eArr) {
            arrayList.add(be.m10556a(interfaceC4050e.mo8835c(), C2011i.f9543a));
        }
        return arrayList;
    }

    @Override // ui.InterfaceC7470a
    /* renamed from: l */
    public void mo9084l(Bundle bundle) {
        ((C5074c) ((InterfaceC5073b) this.f21881b)).m10007a("clx", "_ae", bundle);
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: m */
    public void mo221m(InterfaceC2137a interfaceC2137a) {
        ((InterfaceC2766b) this.f21881b).mo6759k(new C5342f(interfaceC2137a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9085n(jc.AbstractC3745u r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tb.C7110u
            if (r0 == 0) goto L13
            r0 = r8
            tb.u r0 = (tb.C7110u) r0
            int r1 = r0.f34298c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34298c = r1
            goto L18
        L13:
            tb.u r0 = new tb.u
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f34296a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34298c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            og.od.m10798c(r8)
            goto L70
        L36:
            og.od.m10798c(r8)
            boolean r8 = r7.isOneShot()
            if (r8 != 0) goto L9b
            boolean r8 = r7 instanceof jc.C3743s
            if (r8 == 0) goto L46
            java.lang.String r7 = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
            return r7
        L46:
            boolean r8 = r7 instanceof jc.AbstractC3740p
            if (r8 == 0) goto L5d
            jc.p r7 = (jc.AbstractC3740p) r7
            byte[] r7 = r7.mo8273b()
            java.lang.Object r8 = r6.f21881b
            ex.a r8 = (ex.InterfaceC2137a) r8
            byte[] r7 = pg.g6.m11648c(r7, r8)
            java.lang.String r7 = sd.AbstractC6812f.m12986a(r7)
            return r7
        L5d:
            boolean r8 = r7 instanceof jc.AbstractC3741q
            if (r8 == 0) goto L77
            jc.q r7 = (jc.AbstractC3741q) r7
            wc.w r7 = r7.readFrom()
            r0.f34298c = r4
            java.io.Serializable r8 = r6.m9088v(r7, r0)
            if (r8 != r1) goto L70
            goto L93
        L70:
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = sd.AbstractC6812f.m12986a(r8)
            return r7
        L77:
            boolean r8 = r7 instanceof jc.AbstractC3744t
            if (r8 == 0) goto L95
            jc.t r7 = (jc.AbstractC3744t) r7
            wc.e0 r7 = r7.readFrom()
            ay.e r8 = xc.AbstractC8329j.f39903a
            lu.k r2 = new lu.k
            r4 = 20
            r5 = 0
            r2.<init>(r6, r7, r5, r4)
            r0.f34298c = r3
            java.lang.Object r7 = tx.c0.m13475K(r8, r2, r0)
            if (r7 != r1) goto L94
        L93:
            return r1
        L94:
            return r7
        L95:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L9b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Stream must be replayable to calculate a body hash"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d0.m9085n(jc.u, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // sc.InterfaceC6786f
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1858o(sc.C6804x r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d0.mo1858o(sc.x, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b9 A[LOOP:0: B:47:0x01b7->B:48:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02df A[LOOP:4: B:91:0x02d9->B:93:0x02df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0330 A[LOOP:5: B:95:0x032a->B:97:0x0330, LOOP_END] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9086p(tc.InterfaceC7116a r26, tb.C7096g r27, ww.AbstractC8193c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d0.m9086p(tc.a, tb.g, ww.c):java.lang.Object");
    }

    @Override // h00.InterfaceC2767c
    public void put(String str, String str2) {
        C5712a c5712a = (C5712a) this.f21881b;
        Map map = (Map) c5712a.get();
        if (map == null) {
            map = new HashMap();
            c5712a.set(map);
        }
        map.put(str, str2);
    }

    /* renamed from: t */
    public boolean m9087t(CharSequence charSequence, C6861i c6861i) {
        String str = c6861i.f32605b;
        if (str.length() != 0) {
            Matcher matcher = ((C4001v) this.f21881b).m8777r(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m9088v(wc.InterfaceC7989w r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tb.C7112w
            if (r0 == 0) goto L13
            r0 = r6
            tb.w r0 = (tb.C7112w) r0
            int r1 = r0.f34307d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34307d = r1
            goto L18
        L13:
            tb.w r0 = new tb.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f34305b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34307d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ic.e r5 = r0.f34304a
            og.od.m10798c(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f21881b
            ex.a r6 = (ex.InterfaceC2137a) r6
            java.lang.Object r6 = r6.invoke()
            ic.e r6 = (ic.InterfaceC3227e) r6
            wc.h r2 = new wc.h
            r2.<init>(r6)
            r0.f34304a = r6
            r0.f34307d = r3
            java.lang.Object r5 = wc.AbstractC7984r.m15161e(r5, r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            byte[] r5 = r5.mo7578a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d0.m9088v(wc.w, ww.c):java.io.Serializable");
    }

    /* renamed from: w */
    public void m9089w(int i10, String str, List list, boolean z6, boolean z10) {
        t0 t0Var;
        i1 i1Var = (i1) this.f21881b;
        int i11 = i10 - 1;
        if (i11 == 0) {
            v0 v0Var = ((n1) i1Var.f482a).f35669f;
            n1.m14085m(v0Var);
            t0Var = v0Var.f35869n;
        } else if (i11 != 1) {
            if (i11 == 3) {
                v0 v0Var2 = ((n1) i1Var.f482a).f35669f;
                n1.m14085m(v0Var2);
                t0Var = v0Var2.f35870p;
            } else if (i11 != 4) {
                v0 v0Var3 = ((n1) i1Var.f482a).f35669f;
                n1.m14085m(v0Var3);
                t0Var = v0Var3.f35868m;
            } else if (z6) {
                v0 v0Var4 = ((n1) i1Var.f482a).f35669f;
                n1.m14085m(v0Var4);
                t0Var = v0Var4.f35866k;
            } else if (z10) {
                v0 v0Var5 = ((n1) i1Var.f482a).f35669f;
                n1.m14085m(v0Var5);
                t0Var = v0Var5.f35865j;
            } else {
                v0 v0Var6 = ((n1) i1Var.f482a).f35669f;
                n1.m14085m(v0Var6);
                t0Var = v0Var6.f35867l;
            }
        } else if (z6) {
            v0 v0Var7 = ((n1) i1Var.f482a).f35669f;
            n1.m14085m(v0Var7);
            t0Var = v0Var7.f35863g;
        } else if (z10) {
            v0 v0Var8 = ((n1) i1Var.f482a).f35669f;
            n1.m14085m(v0Var8);
            t0Var = v0Var8.f35862f;
        } else {
            v0 v0Var9 = ((n1) i1Var.f482a).f35669f;
            n1.m14085m(v0Var9);
            t0Var = v0Var9.f35864h;
        }
        int size = list.size();
        if (size == 1) {
            t0Var.m14141b(list.get(0), str);
            return;
        }
        if (size == 2) {
            t0Var.m14142c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            t0Var.m14140a(str);
        } else {
            t0Var.m14143d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* renamed from: x */
    public void m9090x(String str, String str2, Bundle bundle) {
        switch (this.f21880a) {
            case 25:
                q2 q2Var = (q2) this.f21881b;
                if (!TextUtils.isEmpty(str)) {
                    q2Var.getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }
                ((n1) q2Var.f482a).f35674l.getClass();
                q2Var.m14120R("auto", "_err", bundle, true, true, System.currentTimeMillis());
                return;
            default:
                h4 h4Var = (h4) this.f21881b;
                if (!TextUtils.isEmpty(str)) {
                    h4Var.mo327b().m14047V(new b1(12, this, str, str2, bundle, false));
                    return;
                }
                n1 n1Var = h4Var.f35497m;
                if (n1Var != null) {
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14141b(str2, "AppId not known when logging event");
                }
                return;
        }
    }

    /* renamed from: y */
    public void m9091y() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.f21881b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + m9078E());
    }

    /* renamed from: z */
    public void m9092z(String str, Bundle bundle) {
        String string;
        n1 n1Var = (n1) this.f21881b;
        m1 m1Var = n1Var.f35670g;
        d1 d1Var = n1Var.f35668e;
        n1.m14085m(m1Var);
        m1Var.mo325M();
        if (n1Var.m14087d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        n1.m14083i(d1Var);
        d1Var.f35349z.m429t(string);
        c1 c1Var = d1Var.f35327B;
        n1Var.f35674l.getClass();
        c1Var.m13857b(System.currentTimeMillis());
    }

    @Override // uh.InterfaceC7458c
    public Object zza() {
        return new C7159i(((C2856l) ((C4327p) this.f21881b).f21788b).f15864a);
    }

    public /* synthetic */ d0(int i10, boolean z6) {
        this.f21880a = i10;
    }

    public d0(int i10) {
        this.f21880a = i10;
        switch (i10) {
            case 10:
                new ThreadLocal();
                this.f21881b = new C5712a();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f21881b = new C4640e(new C6715j[16]);
                break;
            case 18:
                this.f21881b = C7108s.f34294a;
                break;
            case 20:
                this.f21881b = new C4001v(100);
                break;
            default:
                this.f21881b = new ArrayDeque(16);
                break;
        }
    }

    public d0(C4033g config) {
        this.f21880a = 5;
        AbstractC4154l.m8923f(config, "config");
        this.f21881b = config;
    }

    public d0(C6148f config) {
        this.f21880a = 17;
        AbstractC4154l.m8923f(config, "config");
        this.f21881b = config;
    }

    public d0(ThreadFactoryC4298d threadFactoryC4298d) {
        this.f21880a = 4;
        this.f21881b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC4298d);
    }

    @Override // p013o.g0
    /* renamed from: g */
    public void mo9081g(int i10) {
    }

    @Override // p013o.g0
    /* renamed from: i */
    public void mo9082i(int i10) {
    }

    @Override // p013o.g0
    /* renamed from: k */
    public void mo9083k(int i10, float f6) {
    }
}
