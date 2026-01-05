package c9;

import ai.AbstractC0152i;
import android.net.NetworkRequest;
import android.os.Build;
import d9.AbstractC1656a;
import d9.AbstractC1663h;
import d9.C1664i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import og.ka;
import og.mg;
import rw.AbstractC6663m;
import t8.C7058d;
import t8.C7059e;
import t8.C7064j;
import t8.EnumC7055a;
import t8.EnumC7078x;
import t8.c0;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.b */
/* loaded from: classes.dex */
public final class C0907b extends AbstractC0152i {

    /* renamed from: d */
    public final /* synthetic */ int f5572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0907b(AbstractC8894w abstractC8894w, int i10) {
        super(abstractC8894w);
        this.f5572d = i10;
    }

    @Override // ai.AbstractC0152i
    /* renamed from: c */
    public final String mo349c() {
        switch (this.f5572d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* renamed from: k */
    public final void m2546k(C4680j c4680j, Object obj) throws IOException {
        int i10;
        int i11;
        int[] iArrB0;
        int[] iArrB02;
        byte[] byteArray;
        byte[] byteArray2;
        int i12 = 3;
        switch (this.f5572d) {
            case 0:
                C0906a c0906a = (C0906a) obj;
                c4680j.mo9278q(1, c0906a.f5570a);
                c4680j.mo9278q(2, c0906a.f5571b);
                return;
            case 1:
                C0909d c0909d = (C0909d) obj;
                c4680j.mo9278q(1, c0909d.f5576a);
                c4680j.mo9276g(2, c0909d.f5577b.longValue());
                return;
            case 2:
                c4680j.mo9278q(1, ((C0912g) obj).f5581a);
                c4680j.mo9276g(2, r2.f5582b);
                c4680j.mo9276g(3, r2.f5583c);
                return;
            case 3:
                C0916k c0916k = (C0916k) obj;
                c4680j.mo9278q(1, c0916k.f5591a);
                c4680j.mo9278q(2, c0916k.f5592b);
                return;
            case 4:
                C0918m c0918m = (C0918m) obj;
                c4680j.mo9278q(1, c0918m.f5596a);
                C7064j c7064j = c0918m.f5597b;
                C7064j c7064j2 = C7064j.f34159b;
                c4680j.mo9274L(2, mg.m10769b(c7064j));
                return;
            case 5:
                C0922q c0922q = (C0922q) obj;
                c4680j.mo9278q(1, c0922q.f5622a);
                c4680j.mo9276g(2, ka.m10733g(c0922q.f5623b));
                c4680j.mo9278q(3, c0922q.f5624c);
                c4680j.mo9278q(4, c0922q.f5625d);
                C7064j c7064j3 = c0922q.f5626e;
                C7064j c7064j4 = C7064j.f34159b;
                c4680j.mo9274L(5, mg.m10769b(c7064j3));
                c4680j.mo9274L(6, mg.m10769b(c0922q.f5627f));
                c4680j.mo9276g(7, c0922q.f5628g);
                c4680j.mo9276g(8, c0922q.f5629h);
                c4680j.mo9276g(9, c0922q.f5630i);
                c4680j.mo9276g(10, c0922q.f5632k);
                EnumC7055a backoffPolicy = c0922q.f5633l;
                AbstractC4154l.m8923f(backoffPolicy, "backoffPolicy");
                int i13 = AbstractC0928w.f5671b[backoffPolicy.ordinal()];
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 1;
                }
                c4680j.mo9276g(11, i10);
                c4680j.mo9276g(12, c0922q.f5634m);
                c4680j.mo9276g(13, c0922q.f5635n);
                c4680j.mo9276g(14, c0922q.f5636o);
                c4680j.mo9276g(15, c0922q.f5637p);
                c4680j.mo9276g(16, c0922q.f5638q ? 1L : 0L);
                c0 policy = c0922q.f5639r;
                AbstractC4154l.m8923f(policy, "policy");
                int i14 = AbstractC0928w.f5673d[policy.ordinal()];
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i11 = 1;
                }
                c4680j.mo9276g(17, i11);
                c4680j.mo9276g(18, c0922q.f5640s);
                c4680j.mo9276g(19, c0922q.f5641t);
                c4680j.mo9276g(20, c0922q.f5642u);
                c4680j.mo9276g(21, c0922q.f5643v);
                c4680j.mo9276g(22, c0922q.f5644w);
                String str = c0922q.f5645x;
                if (str == null) {
                    c4680j.mo9277i(23);
                } else {
                    c4680j.mo9278q(23, str);
                }
                C7059e c7059e = c0922q.f5631j;
                EnumC7078x networkType = c7059e.f34129a;
                AbstractC4154l.m8923f(networkType, "networkType");
                int i15 = AbstractC0928w.f5672c[networkType.ordinal()];
                if (i15 == 1) {
                    i12 = 0;
                } else if (i15 == 2) {
                    i12 = 1;
                } else if (i15 == 3) {
                    i12 = 2;
                } else if (i15 != 4) {
                    if (i15 == 5) {
                        i12 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || networkType != EnumC7078x.TEMPORARILY_UNMETERED) {
                            throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                        }
                        i12 = 5;
                    }
                }
                c4680j.mo9276g(24, i12);
                C1664i requestCompat = c7059e.f34130b;
                AbstractC4154l.m8923f(requestCompat, "requestCompat");
                int i16 = Build.VERSION.SDK_INT;
                if (i16 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) requestCompat.f8187a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i16 >= 31) {
                                    iArrB0 = AbstractC1663h.m5375b(networkRequest);
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i17 = 0; i17 < 10; i17++) {
                                        int i18 = iArr[i17];
                                        if (AbstractC1656a.m5370d(networkRequest, i18)) {
                                            arrayList.add(Integer.valueOf(i18));
                                        }
                                    }
                                    iArrB0 = AbstractC6663m.b0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrB02 = AbstractC1663h.m5374a(networkRequest);
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i19 = 0; i19 < 30; i19++) {
                                        int i20 = iArr2[i19];
                                        if (AbstractC1656a.m5369c(networkRequest, i20)) {
                                            arrayList2.add(Integer.valueOf(i20));
                                        }
                                    }
                                    iArrB02 = AbstractC6663m.b0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrB0.length);
                                for (int i21 : iArrB0) {
                                    objectOutputStream.writeInt(i21);
                                }
                                objectOutputStream.writeInt(iArrB02.length);
                                for (int i22 : iArrB02) {
                                    objectOutputStream.writeInt(i22);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                AbstractC4154l.m8922e(byteArray, "outputStream.toByteArray()");
                            } finally {
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
                c4680j.mo9274L(25, byteArray);
                c4680j.mo9276g(26, c7059e.f34131c ? 1L : 0L);
                c4680j.mo9276g(27, c7059e.f34132d ? 1L : 0L);
                c4680j.mo9276g(28, c7059e.f34133e ? 1L : 0L);
                c4680j.mo9276g(29, c7059e.f34134f ? 1L : 0L);
                c4680j.mo9276g(30, c7059e.f34135g);
                c4680j.mo9276g(31, c7059e.f34136h);
                Set<C7058d> triggers = c7059e.f34137i;
                AbstractC4154l.m8923f(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(triggers.size());
                            for (C7058d c7058d : triggers) {
                                objectOutputStream2.writeUTF(c7058d.f34124a.toString());
                                objectOutputStream2.writeBoolean(c7058d.f34125b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            AbstractC4154l.m8922e(byteArray2, "outputStream.toByteArray()");
                        } finally {
                        }
                    } finally {
                    }
                }
                c4680j.mo9274L(32, byteArray2);
                return;
            default:
                C0926u c0926u = (C0926u) obj;
                c4680j.mo9278q(1, c0926u.f5665a);
                c4680j.mo9278q(2, c0926u.f5666b);
                return;
        }
    }

    /* renamed from: l */
    public final void m2547l(Object obj) {
        C4680j c4680jM347a = m347a();
        try {
            m2546k(c4680jM347a, obj);
            c4680jM347a.f23137b.executeInsert();
        } finally {
            m355i(c4680jM347a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0907b(AbstractC8894w database) {
        super(database);
        this.f5572d = 1;
        AbstractC4154l.m8923f(database, "database");
    }
}
