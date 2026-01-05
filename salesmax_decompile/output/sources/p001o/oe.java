package p001o;

import ai.salesmax.model.AccountMemberActivitySummary;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class oe {

    /* renamed from: a */
    public static long f38175a;

    /* renamed from: b */
    public static Map f38176b = new HashMap();

    /* renamed from: c */
    public static final Boolean f38177c = Boolean.FALSE;

    /* renamed from: c */
    public static AccountMemberActivity m42098c(l1 l1Var, String str) {
        Map map = (Map) f38176b.getOrDefault(l1Var.on(), Collections.emptyMap());
        Objects.requireNonNull(map);
        return (AccountMemberActivity) map.getOrDefault(str, AccountMemberActivity.justId(""));
    }

    /* renamed from: d */
    public static AccountMemberActivitySummary m42099d(String str) {
        return new AccountMemberActivitySummary(m42098c(uni.kC().TB(), str));
    }

    /* renamed from: e */
    public static /* synthetic */ void m42100e(String str, AccountMemberActivity accountMemberActivity) {
        if (!f38176b.containsKey(str)) {
            f38176b.put(str, new HashMap());
        }
        ((Map) f38176b.get(str)).put(accountMemberActivity.getUserId(), accountMemberActivity);
    }

    /* renamed from: f */
    public static /* synthetic */ void m42101f(Throwable th) {
    }

    /* renamed from: g */
    public static void m42102g(l1 l1Var) {
        final String strOn = l1Var.on();
        l1Var.at().h0().m55730i(new gu3() { // from class: o.me
            @Override // p001o.gu3
            public final void accept(Object obj) {
                oe.m42100e(strOn, (AccountMemberActivity) obj);
            }
        }, new gu3() { // from class: o.ne
            @Override // p001o.gu3
            public final void accept(Object obj) {
                oe.m42101f((Throwable) obj);
            }
        });
        f38175a = System.currentTimeMillis();
    }
}
