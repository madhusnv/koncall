package tn;

import com.websoptimization.callyzerbiz.R;
import java.util.List;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tn.a */
/* loaded from: classes3.dex */
public final class C7174a {

    /* renamed from: a */
    public final y5 f34436a;

    public C7174a(y5 userSIMRepository) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f34436a = userSIMRepository;
    }

    /* renamed from: a */
    public static C4132l m13438a(List uris, Long l9) {
        AbstractC4154l.m8923f(uris, "uris");
        if (uris.size() > 5) {
            return new C4132l(false, Integer.valueOf(R.string.max_5_files_upload));
        }
        return (l9 != null ? l9.longValue() : 0L) > 10485760 ? new C4132l(false, Integer.valueOf(R.string.total_media_size_must_be_under_10MB)) : new C4132l(true, null);
    }

    /* renamed from: b */
    public static C4132l m13439b(String massage) {
        AbstractC4154l.m8923f(massage, "massage");
        String string = AbstractC5178p.g0(massage).toString();
        return AbstractC5178p.m10101L(string) ? new C4132l(false, Integer.valueOf(R.string.please_enter_your_message)) : string.length() > 5000 ? new C4132l(false, Integer.valueOf(R.string.message_max_5000_characters_allowed)) : new C4132l(true, null);
    }

    /* renamed from: c */
    public static C4132l m13440c(String name) {
        AbstractC4154l.m8923f(name, "name");
        String string = AbstractC5178p.g0(name).toString();
        return AbstractC5178p.m10101L(string) ? new C4132l(false, Integer.valueOf(R.string.enter_your_name)) : string.length() > 100 ? new C4132l(false, Integer.valueOf(R.string.name_max_100_characters_allowed)) : new C4132l(true, null);
    }

    /* renamed from: d */
    public static C4132l m13441d(String selectType) {
        AbstractC4154l.m8923f(selectType, "selectType");
        return AbstractC5178p.m10101L(selectType) ? new C4132l(false, Integer.valueOf(R.string.please_select_the_type_of_your_message)) : new C4132l(true, null);
    }
}
